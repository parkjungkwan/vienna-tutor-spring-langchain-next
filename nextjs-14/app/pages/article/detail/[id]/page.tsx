'use client'

import { useRouter } from "next/navigation"
import { DataGrid } from '@mui/x-data-grid';
import { useState, useEffect } from "react"
import {Box, Button, Input} from '@mui/material';
import { useSelector, useDispatch } from 'react-redux'
import { NextPage } from "next";
import { getArticleById } from '@/app/components/article/service/article-slice'
import { findArticleById } from '@/app/components/article/service/article-service'
import { IArticle } from "@/app/components/article/model/article";
// import React from "react";

export default function ArticleDetail({params}:any){

const dispatch = useDispatch()
const article:IArticle = useSelector(getArticleById)

useEffect(()=>{dispatch(findArticleById(params.id))},[])

    return(<>
    <h2>{params.id}상세 페이지</h2>
    {article}
    </>)
}