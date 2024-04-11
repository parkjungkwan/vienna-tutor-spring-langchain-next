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
import { IArticle } from "@/app/components/article/model/article";
import { IUser } from "@/app/components/user/model/user";
import { getUserById } from "@/app/components/user/service/user-slice";
import { findUserById } from "@/app/components/user/service/user-service";

export default function UserDetail({params}:any){
    const dispatch = useDispatch()
    const user:IUser = useSelector(getUserById) 
    useEffect(()=>{
        dispatch(findUserById(params.id))
    },[]) 

    return(<>
    {user.id}
    {user.username}
    {user.password}
    {user.job}
    </>);
}