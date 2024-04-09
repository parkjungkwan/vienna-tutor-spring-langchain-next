import { styled } from "@mui/material";
import { DataGrid } from "@mui/x-data-grid";

export const ODD_OPACITY = 0.2;
export const StripedDataGrid = styled(DataGrid)(({ theme }) => ({
    '& .MuiDataGrid-columnHeader, .MuiDataGrid-cell': {
        borderRight: `1px solid ${
            theme.palette.mode === 'dark' ? '#f0f0f0' : '#303030'
        }`,
    },
    '& .MuiDataGrid-columnsContainer, .MuiDataGrid-cell': {
        borderBottom: `1px solid ${
            theme.palette.mode === 'dark' ? '#f0f0f0' : '#303030'
        }`,
    },
}));