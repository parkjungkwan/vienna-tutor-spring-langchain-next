import { createAsyncThunk } from "@reduxjs/toolkit";
import { IArticle } from "./article.model";
import { getAllArticlesAPI } from "./article.api";
import axios from "axios";
import { API } from "@/redux/common/enums/API";
import AxiosConfig, { instance } from "@/redux/common/configs/axios-config";

export const getAllArticles: any = createAsyncThunk(
    'articles/getAllArticles',
    async (page: number)=>{
        console.log('getArticles page : '+ page)
        const {message, result}:any = await  getAllArticlesAPI(1);
        console.log('----- API 를 사용한 경우 -----')
        console.log('message : '+ message)
        console.log(JSON.stringify(result))
    }
)