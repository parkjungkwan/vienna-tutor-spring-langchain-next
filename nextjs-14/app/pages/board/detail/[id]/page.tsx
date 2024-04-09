'use client'

import { useRouter } from "next/navigation"
import { DataGrid } from '@mui/x-data-grid';
import { useState, useEffect } from "react"
import {Box, Button, Input, Typography} from '@mui/material';
import { useSelector, useDispatch } from 'react-redux'
import { NextPage } from "next";
import { findAllBoards } from "@/app/components/board/service/board-service";
import { getAllBoards } from "@/app/components/board/service/board-slice";
import Columns from "@/app/components/board/module/columns";
// import React from "react";


export default function BoardDetailPage (props:any)  {

    useEffect(() => {
        //dispatch(finBoardById(props.params.id))
    }, [])

    return (<>
    
    게시판 상세
    <span>ID : </span> <Typography textAlign="center" sx={{fontSize:"1.5rem"}}> {props.params.id} </Typography>
    <span>게시판이름 : </span> <Typography textAlign="center" sx={{fontSize:"1.5rem"}}>  </Typography>
    <span>게시판타입 : </span> <Typography textAlign="center" sx={{fontSize:"1.5rem"}}> </Typography>
    <span>등록일 : </span> <Typography textAlign="center" sx={{fontSize:"1.5rem"}}>  </Typography>
    <span>수정일 : </span> <Typography textAlign="center" sx={{fontSize:"1.5rem"}}> </Typography>
    
    
    </>)

}