import { createAsyncThunk } from "@reduxjs/toolkit";
import { IArticle } from "./article.model";
import { fetchAllArticlesAPI } from "./article.api";
import axios from "axios";
import { API } from "@/redux/common/enums/API";
import AxiosConfig, { instance } from "@/redux/common/configs/axios-config";

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