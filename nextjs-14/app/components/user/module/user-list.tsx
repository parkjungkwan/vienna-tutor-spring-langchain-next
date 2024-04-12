import axios from "axios"
import { useRouter } from "next/navigation"
import { DataGrid } from '@mui/x-data-grid';
import { useState, useEffect } from "react"
import Container from "@mui/material/Container"; 
import { useSelector, useDispatch } from 'react-redux'
import { NextPage } from "next";
import { findAllUsers } from "@/app/components/user/service/user-service";
import { getAllUsers } from "@/app/components/user/service/user-slice";
import UserColumns from "@/app/components/user/module/user-columns";
import { StripedDataGrid } from "@/app/components/common/style/board";

export default function UserList({allUsers}: any){
    return (<>
    
    <h2>사용자 목록</h2>``
        <div style={{ height: "900px", width: "80%", margin: '0 auto' }}>
      {allUsers && <DataGrid // 🔥 4
        rows={allUsers}
        columns={UserColumns()}
        pageSizeOptions={[5, 10, 20]} // 4-1
        checkboxSelection
      />}
    </div>
    
    </>)
}