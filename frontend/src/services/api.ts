import axios from "axios";

const API = axios.create({
  baseURL: "http://localhost:8080/api",
});

export const getResources = (subject?: string) =>
  API.get("/resources", { params: { subject } });

export const uploadResource = (formData: FormData) =>
  API.post("/resources/upload", formData, {
    headers: {
      "Content-Type": "multipart/form-data",
    },
  });

export const deleteResource = (id: number) =>
  API.delete(`/resources/${id}`);
