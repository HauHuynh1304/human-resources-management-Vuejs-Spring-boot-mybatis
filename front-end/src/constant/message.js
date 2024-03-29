export const MESSAGE = {
  LOGIN: {
    ERR: "User or Password not correct!",
  },
  EMAIL: {
    ERR: "Email not correct!",
    DUPLICATE: "Email is exist!",
  },
  PASSWORD: {
    ERR: "Password not match!",
    FORMAT:
      "Password is at least 8 characters long, <br/> and include at least 1 upper case, 1 lower case, 1 symbol.",
  },
  ROLE: {
    ERR: "Role can't be null",
  },
  CALL_API_ERR: {
    ERR: "Something wrong, please try again later!",
  },
  REFRESH_TOKEN_EXPIRED: {
    ERR: "Out of time, please sign-in again!",
  },
  SESSION_TIME_OUT:{
    ERR: "Upgrade version or Your account was logged in by another user. \n Check your login action and contact administrator if necessary!"
  },
  INSERT_EMPLOYEE: {
    ERR_EMPTY: "Only Submited Documents can be empty!",
    ERR_FORMAT: "Format of Email or Phone not correctly!",
    ERR_COMMON: "Start Date can't be empty!",
    ERR_INSERT: "Nothing to insert!",
    ERR_UPDATE_EMPLOYEE: "Have some empty value, please check again!",
  },
  DATE_TIME: {
    ERR: "Datetime not correct!",
    ERR_MONTH_LESS: "Can't create Request Ticket in previous month!",
  },
  INSERT_REQUEST_TICKET: {
    SUCCESS: "Your ticket was submited successfully!",
    ERR_EMPTY: "Only Detail can be empty!",
    ERR_DURATION: "Start date or End date was not correctly!",
  },
  MUTIPLE_UPDATE_TICKET_STATUS: {
    UPDATE_SUCCESS: "Target ticket(s) was update successfully!",
    APPROVE_ALL_ERR: "Target ticket status was change by another person!",
    REJECT_ALL_ERR: "Target ticket status was change by another person!",
  },
  FLEXIBLE_MESSAGE: {
    ERR: "{0} can't be null",
    DUPLICATE: "{0} was used",
  },
  UPDATE_ACCOUNT: {
    ERR_EMPTY: "Nothing to update!",
  },
  FREE_HOSTING: {
    ERR: "Image may be not excuted by using free hosting!",
  },
  INFO: {
    LOG_OUT: "Log-out",
    READ_ALL: "Read All",
    REFRESH: "Refresh",
    DELETE_ALL: "Delete All",
  },
};
