import axios from "axios";

export const HTTP_TOKEN = axios.create({
  baseURL: `http://localhost:8080/authen/`,
});
