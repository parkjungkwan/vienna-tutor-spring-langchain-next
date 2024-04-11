'use client'

import { useRouter } from "next/navigation"
import { DataGrid } from '@mui/x-data-grid';
import { useState, useEffect } from "react"
import {Box, Button, Input, Typography} from '@mui/material';
import { useSelector, useDispatch } from 'react-redux'
import { NextPage } from "next";
import { findAllBoards, findBoardById } from "@/app/components/board/service/board-service";
import { getAllBoards, getBoardById } from "@/app/components/board/service/board-slice";
import Columns from "@/app/components/board/module/columns";
import { IBoard } from "@/app/components/board/model/board";
// import React from "react";


export default function BoardDetailPage (props:any)  {
    const dispatch=useDispatch()
    const board:IBoard=useSelector(getBoardById)

    useEffect(() => {
        dispatch(findBoardById(props.params.id))
    }, [])

    return (<>
    
    게시판 상세
    <span>ID : </span> <Typography textAlign="center" sx={{fontSize:"1.5rem"}}>{board.id}</Typography>
    <span>게시판이름 : </span> <Typography textAlign="center" sx={{fontSize:"1.5rem"}}> {board.boardName}  </Typography>
    <span>게시판타입 : </span> <Typography textAlign="center" sx={{fontSize:"1.5rem"}}> {board.boardType}</Typography>
    <span>등록일 : </span> <Typography textAlign="center" sx={{fontSize:"1.5rem"}}> {board.regDate} </Typography>
    <span>수정일 : </span> <Typography textAlign="center" sx={{fontSize:"1.5rem"}}>{board.modDate} </Typography>
    
    
    </>)

}