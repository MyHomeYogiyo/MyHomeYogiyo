import { localAxios } from "@/util/http-commons";

const local = localAxios();

function getApt(param, success, fail) {
  // console.log("got param" + param.sidoName);
  local.get(`/apt/keySearch`, { params: param }).then(success).catch(fail);
}

function getAptDeal(aptCode, success, fail) {
  local.get(`/apt/dealSearch/${aptCode}`).then(success).catch(fail);
}

export { getApt, getAptDeal, };
