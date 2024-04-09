'use client'

import { useRouter } from "next/navigation"
import { DataGrid } from '@mui/x-data-grid';
import { useState, useEffect } from "react"
import {Box, Button, Input} from '@mui/material';
import { useSelector, useDispatch } from 'react-redux'
import { NextPage } from "next";
import { findAllArticles } from "@/app/components/article/service/article-service";
import { getAllArticles } from "@/app/components/article/service/article-slice";
import Columns from "@/app/components/article/module/columns";
import { StripedDataGrid } from "@/app/components/common/style/board";
// import React from "react";




const ArticleListPage: NextPage = ({data}:any) => {
    const dispatch = useDispatch()
 
    const allArticles: [] = useSelector(getAllArticles)

    if(allArticles !== undefined){
        console.log('allArticles is not undefined')
        
        console.log('length is '+ allArticles.length)
        for(let i=0; i< allArticles.length; i++){
            console.log(JSON.stringify(allArticles[i]))
        }
    }else{
        console.log('allArticles is undefined')
    }
    

    useEffect(() => {
        dispatch(findAllArticles(1))
    }, [])
    
    return (<>
        <h2>게시글 목록</h2>
        <Box sx={{ height: 400, width: '100%' }}>
     {allArticles && <StripedDataGrid
        rows={allArticles}
        columns={Columns()}
        initialState={{
          pagination: {
            paginationModel: {
              pageSize: 5,
            },
          },
        }}
        pageSizeOptions={[5]}
        checkboxSelection
        disableRowSelectionOnClick
      />}
    </Box>
    </>)
}

export default ArticleListPage