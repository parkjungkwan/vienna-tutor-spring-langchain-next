import { createAsyncThunk } from "@reduxjs/toolkit";

import { findAllUsersAPI } from "./user-api";

export const findAllUsers: any = createAsyncThunk(
    'users/findAllUsers',
    async (page: number)=> await  findAllUsersAPI(page)
)