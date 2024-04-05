import { combineReducers } from "@reduxjs/toolkit";
import { persistReducer } from "redux-persist";
import countReducer from "@/app/components/counter/service/counter-slice";
import articleReducer from "@/app/components/article/service/article-slice";
import userReducer from "@/app/components/user/service/user-slice";
import createWebStorage from "redux-persist/lib/storage/createWebStorage";

const createNoopStorage = () => {
  return {
    getItem() {
      return Promise.resolve(null);
    },
    setItem(_key: string, value: number) {
      return Promise.resolve(value);
    },
    removeItem() {
      return Promise.resolve();
    },
  };
};

const storage =
  typeof window !== "undefined"
    ? createWebStorage("local")
    : createNoopStorage();

const countPersistConfig = {
  key: "count",
  storage,
  whitelist: ["countState"],
};
const articlePersistConfig = {
  key: "article",
  storage,
  whitelist: ["articleState"],
};
const userPersistConfig = {
  key: "user",
  storage,
  whitelist: ["userState"],
};



const persistedCountReducer = persistReducer(countPersistConfig, countReducer);
const persistedArticleReducer = persistReducer(articlePersistConfig, articleReducer);
const persistedUserReducer = persistReducer(userPersistConfig, userReducer);

export const rootReducer = combineReducers({
  count: persistedCountReducer,
  article: persistedArticleReducer,
  user: persistedUserReducer,
});


