"use client"

import * as React from 'react';
import Box from '@mui/material/Box';
import { DataGrid, GridColDef } from '@mui/x-data-grid';
import MuiDemoRows from '@/app/components/demos/module/mui-demo-rows';
import MuiDemoColumns from '@/app/components/demos/module/mui-demo-columns';
import { NextPage } from 'next';

// const columns: GridColDef[] =



const DataGridDemo: NextPage = () => {
  return (
    <Box sx={{ height: 400, width: '100%' }}>
      <DataGrid
        rows={MuiDemoRows()}
        columns={MuiDemoColumns()}
        initialState={{
          pagination: {
            paginationModel: {
              pageSize: 5,
            },
          },
        }}
        pageSizeOptions={[5]}
        checkboxSelection
        disableRowSelectionOnClick
      />
    </Box>
  );
}

export default DataGridDemo;



