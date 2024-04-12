

'use client'

import axios from "axios"
import { useRouter } from "next/navigation"
import { DataGrid } from '@mui/x-data-grid';
import { useState, useEffect } from "react"
import {
    Box, Button, Container, Input, Table, TableBody, TableCell, TableContainer,
    TableHead,
    TableRow
} from '@mui/material';
import AxiosConfig from "@/app/components/common/configs/axios-config";
import { API } from "@/app/components/common/enums/API";
import { useSelector, useDispatch } from 'react-redux'
import { NextPage } from "next";
import { findAllUsers } from "@/app/components/user/service/user-service";
import { getAllUsers } from "@/app/components/user/service/user-slice";
import UserColumns from "@/app/components/user/module/user-columns";
import { StripedDataGrid } from "@/app/components/common/style/board";
// import React from "react";

interface IArticle {
    id: number,
    title: string,
    content: string,
    writer: string,
    registerDate: string
}

const UsersPage: NextPage = () => {
    const [pageSize, setPageSize] = useState(5);
    const dispatch = useDispatch()
 
   const allUsers: [] = useSelector(getAllUsers)

    if(allUsers !== undefined){
        console.log('allUser is not undefined')
        
        console.log('length is '+ allUsers.length)
        for(let i=0; i< allUsers.length; i++){
            console.log(JSON.stringify(allUsers[i]))
        }
    }else{
        console.log('allUser is undefined')
    }
    

    useEffect(() => {
        dispatch(findAllUsers(1))
    }, [])


    return (<>
      <table  className="h-1000 w-4/5 border-x-black" style={{margin: '50px auto'}}>
        <thead>
          <tr>
          </tr>
        </thead>
        <tbody>
        <tr>
        <td 
        align="center" className="w-full  bg-gray-400 border-black border-4 p-8 h-20 text-[20px]" 
        >
       사용자 목록
        </td>
    </tr>
    <tr>
        <td align="center"  className="h-300">
      {allUsers && <DataGrid // 🔥 4
        rows={allUsers}
        columns={UserColumns()}
        pageSizeOptions={[5, 10, 20]} // 4-1
        checkboxSelection
      />}
    </td>
    </tr>
       
        </tbody>
      </table>
    </>)
}

export default UsersPage