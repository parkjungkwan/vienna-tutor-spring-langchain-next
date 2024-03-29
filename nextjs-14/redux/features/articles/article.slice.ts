import axios from 'axios';
import { createAsyncThunk } from '@reduxjs/toolkit';
import { createSlice } from "@reduxjs/toolkit";


const initialState:IArticle = {

}

export const articleSlice = createSlice({
    name: "article",
    initialState,
    reducers: {}
})

export const {} = articleSlice.actions

export default articleSlice.reducer;