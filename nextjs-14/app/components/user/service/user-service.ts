import { createAsyncThunk } from "@reduxjs/toolkit";

import { findAllUsersAPI } from "./user-api";

export const findAllUsers: any = createAsyncThunk(
    'users/findAllUsers',
    async (page: number)=> await  findAllUsersAPI(page)
)
export const findUserById: any = createAsyncThunk(
    'users/findUserById',
    async (id: number)=> await  findUserById(id)
)