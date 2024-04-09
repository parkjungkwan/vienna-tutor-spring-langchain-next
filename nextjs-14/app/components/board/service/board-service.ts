import { createAsyncThunk } from "@reduxjs/toolkit";
import { IBoard } from "../model/board";
import { findAllBoardsAPI } from "./board-api";
import axios from "axios";
import { API } from "@/app/components/common/enums/API";
import AxiosConfig, { instance } from "@/app/components/common/configs/axios-config";

export const findAllBoards: any = createAsyncThunk(
    'boards/findAllBoards',
    async (page: number)=>{
        console.log('fetchAllBoards page : '+ page)
        const data:any = await  findAllBoardsAPI(1);

        const {message, result}:any = data
        // console.log('----- API 를 사용한 경우 -----')
        // console.log('message : '+ message)
        // console.log(JSON.stringify(result))
        return data
    }
)