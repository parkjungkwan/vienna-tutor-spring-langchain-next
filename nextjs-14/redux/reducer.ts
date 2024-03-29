import { combineReducers } from "@reduxjs/toolkit";
import { persistReducer } from "redux-persist";
import countReducer from "@/redux/features/counter/counter.slice";
import articleReducer from "@/redux/features/articles/article.slice";
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


const persistedCountReducer = persistReducer(countPersistConfig, countReducer);
const persistedArticleReducer = persistReducer(articlePersistConfig, articleReducer);

export const rootReducer = combineReducers({
  count: persistedCountReducer,
  article: persistedArticleReducer
});


