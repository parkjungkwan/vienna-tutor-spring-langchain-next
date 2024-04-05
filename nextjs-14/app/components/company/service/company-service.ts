import { createAsyncThunk } from "@reduxjs/toolkit";
import { IArticle } from "../../articles/model/article";
import { fetchAllArticlesAPI } from "../../boards/service/board-api";
import axios from "axios";
import { API } from "@/app/components/common/enums/API";
import AxiosConfig, { instance } from "@/app/components/common/configs/axios-config";

export const fetchAllArticles: any = createAsyncThunk(
    'articles/fetchAllArticles',
    async (page: number)=>{
        console.log('fetchAllArticles page : '+ page)
        const data:any = await  fetchAllArticlesAPI(1);

        const {message, result}:any = data
        // console.log('----- API 를 사용한 경우 -----')
        // console.log('message : '+ message)
        // console.log(JSON.stringify(result))
        return data
    }
)