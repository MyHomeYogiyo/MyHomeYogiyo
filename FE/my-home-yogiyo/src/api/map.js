import { localAxios } from "@/util/http-commons";

const local = localAxios();

function getApt(param, success, fail) {
  console.log("got param" + param.sidoName);
  local.get(`/apt/keySearch`, { params: param }).then(success).catch(fail);
}

export { getApt };
