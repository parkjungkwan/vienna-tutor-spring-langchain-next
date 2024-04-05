import { createAsyncThunk } from "@reduxjs/toolkit";

import { fetchAllUsersAPI } from "./user-api";
import axios from "axios";
import { API } from "@/app/components/common/enums/API";
import AxiosConfig, { instance } from "@/app/components/common/configs/axios-config";

export const fetchAllUsers: any = createAsyncThunk(
    'users/fetchAllUsers',
    async (page: number)=>{
        console.log('fetchAllUsers page : '+ page)
        const data:any = await  fetchAllUsersAPI(1);

        const {message, result}:any = data
        console.log('----- API 를 사용한 경우 -----')
        console.log('message : '+ message)
        console.log(JSON.stringify(result))
        return data
    }
)