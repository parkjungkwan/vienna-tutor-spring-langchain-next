import { createAsyncThunk } from "@reduxjs/toolkit";
import { findAllArticlesAPI } from "../../article/service/article-api";



export const findAllArticles: any = createAsyncThunk(
    'articles/findAllArticles',
    async (page: number)=> await  findAllArticlesAPI(page)
)