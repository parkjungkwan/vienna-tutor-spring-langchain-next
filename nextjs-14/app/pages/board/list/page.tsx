'use client'

import { useRouter } from "next/navigation"
import { DataGrid } from '@mui/x-data-grid';
import { useState, useEffect } from "react"
import {Box, Button, Input, Link, styled} from '@mui/material';
import { useSelector, useDispatch } from 'react-redux'
import { NextPage } from "next";
import { findAllBoards } from "@/app/components/board/service/board-service";
import { getAllBoards } from "@/app/components/board/service/board-slice";
import Columns from "@/app/components/board/module/columns";
import { StripedDataGrid } from "@/app/components/common/style/board";
// import React from "react";
const cards = [
  "https://www.tailwindtap.com/assets/components/horizontal-carousel/mountain-nightview.jpg",
  "https://www.tailwindtap.com/assets/components/horizontal-carousel/autumn.jpg",
  "https://www.tailwindtap.com/assets/components/horizontal-carousel/babypinetree.jpg",
  "https://www.tailwindtap.com/assets/components/horizontal-carousel/beach.jpg",
  "https://www.tailwindtap.com/assets/components/horizontal-carousel/purpleflowers.jpg",
  "https://www.tailwindtap.com/assets/components/horizontal-carousel/starrysky.jpg",
  "https://www.tailwindtap.com/assets/components/horizontal-carousel/lake.jpg",
];

export default function BoardListPage({data}:any) {
    const dispatch = useDispatch()
 
   const allBoards: [] = useSelector(getAllBoards)

    if(allBoards !== undefined){
        console.log('allBoards is not undefined')
        
        console.log('length is '+ allBoards.length)
        for(let i=0; i< allBoards.length; i++){
            console.log(JSON.stringify(allBoards[i]))
        }
    }else{
        console.log('allBoards is undefined')
    }
    

    useEffect(() => {
        dispatch(findAllBoards(1))
    }, [])
    
    return (<>
         <table  className="table-auto w-4/5 border-x-black" style={{margin: '50px auto'}}>
        <thead>
          <tr>
            <td>
            <div className="flex flex-col items-center justify-center w-full bg-white-300">
      <div className="flex overflow-x-scroll snap-x snap-mandatory max-w-6xl no-scrollbar">
        {cards.map((data, index) => {
          return (
            <section
              className="flex-shrink-0 w-full snap-center justify-center items-center"
              key={index}
            >
              <img
                src={data}
                alt="Images to scroll horizontal"
                className="w-full h-[500px]"
              />
            </section>
          );
        })}
      </div>
    </div>

            </td>
          </tr>
        </thead>
        <tbody>
        <tr>
        <td 
        align="center" className="w-full  bg-gray-400 border-black border-4 p-8 h-20 text-[20px]" 
        >
       <Link href=''>게시판 글쓰기</Link>
        </td>
    </tr>
    <tr>
        <td align="center"  className="h-300">
     {allBoards && <DataGrid
        rows={allBoards}
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

