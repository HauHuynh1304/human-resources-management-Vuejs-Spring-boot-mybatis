export const LOCAL_STORAGE = {
  NAME: "HR_SYSTEM_USER",
};

export const ROLES = {
  ROOT_ADMIN: "ROLE_ROOT_ADMIN",
  ADMIN: "ROLE_ADMIN",
  MANAGER: "ROLE_MANAGER",
  SUPERVISOR: "ROLE_SUPERVISOR",
  HUMAN_RESOURCES: "ROLE_HR",
  EMPLOYEE: "ROLE_EMPLOYEE",
};

export const SPECIAL_VALUE = {
  OVER_TIME: "OT",
  HOURS: "HOURS",
};

export const EVENT_BUS = {
  EDIT_ACCOUNT: "TARGET_ACCOUNT",
  REFRESH_TABLE_LIST_USER: "REFRESH_TABLE_LIST_USER",
  FETCH_DATA_LIST_EMPLOYEE: "FETCH_DATA_LIST_EMPLOYEE",
  UPDATE_EMPLOYEE: "UPDATE_EMPLOYEE",
  REFRESH_EMPLOYEE: "REFRESH_EMPLOYEE",
  REFRESH_LOCAL_STORAGE: "REFRESH_LOCAL_STORAGE",
  FIND_REQUESTED_TICKET: "FIND_REQUESTED_TICKET",
  FIND_RECEIVED_TICKET: "FIND_RECEIVED_TICKET",
  REFRESH_RECEIVED_TICKET: "REFRESH_RECEIVED_TICKET",
  FIND_REPORT_INFO: "FIND_REPORT_INFO",
  CLICK_DOWNLOAD: "CLICK_DOWNLOAD",
  OPEN_LOADING_MODAL: "OPEN_LOADING_MODAL",
  CLOSE_LOADING_MODAL: "CLOSE_LOADING_MODAL",
  REFRESH_SPECIAL_RECEIVED_TICKET: "REFRESH_SPECIAL_RECEIVED_TICKET",
  REFRESH_SPECIAL_REQUESTED_TICKET: "REFRESH_SPECIAL_REQUESTED_TICKET",
};

export const ACCOUNT_STATUS = {
  ACTIVE: {
    value: false,
    text: "YES",
  },
  NOT_ACTIVE: {
    value: true,
    text: "NO",
  },
};

export const SEX_SELECT = [
  { value: "MALE", text: "MALE" },
  { value: "FEMALE", text: "FEMALE" },
];

export const ACTION = {
  UPDATE: "UPDATE",
  INSERT: "INSERT",
  DELETE: "DELETE",
  UNDELETE: "UNDELETE",
};

export const DATE_FORMAT = "YYYY-MM-DD";

export const DATE_TIME_FORMAT = "YYYY-MM-DD HH:mm:ss";

export const REPORT_TYPE = {
  LEAVE_REPORT: "Leave_Report.xlsx",
  OT_REPORT: "OT_Report.xlsx",
};

export const TIME_STAMP = {
  BEGIN: "T00:00",
  END: "T23:59",
};
