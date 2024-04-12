'use client'

import { useRouter } from "next/navigation"
import { DataGrid } from '@mui/x-data-grid';
import { useState, useEffect } from "react"
import {Box, Button, Input, Table} from '@mui/material';
import { useSelector, useDispatch } from 'react-redux'
import { NextPage } from "next";
import { findAllArticles } from "@/app/components/article/service/article-service";
import { getAllArticles } from "@/app/components/article/service/article-slice";
import Columns from "@/app/components/article/module/columns";
// import React from "react";




const ArticleListPage: NextPage = ({data}:any) => {
    const dispatch = useDispatch()
    const allArticles: [] = useSelector(getAllArticles)

    useEffect(() => {
        dispatch(findAllArticles(1))
    }, [])
    
    return (<>
     <table  className="table-auto w-4/5 border-x-black" style={{margin: '50px auto'}}>
        <thead>
          <tr>
          </tr>
        </thead>
        <tbody>
        <tr>
        <td 
        align="center" className="w-full  bg-gray-400 border-black border-4 p-8 h-20 text-[20px]" 
        >
       게시글 목록
        </td>
    </tr>
    <tr>
        <td align="center"  className="h-300">
     {allArticles && <DataGrid
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
    </td>
    </tr>
       
        </tbody>
      </table>
    </>)
}

export default ArticleListPage