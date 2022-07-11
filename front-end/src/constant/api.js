export const API = {
  AUTHEN: {
    LOG_IN: "/authen/log-in",
    LOG_OUT: "/authen/log-out",
    REFRESH_TOKEN: "/authen/refresh-token",
    SIGN_UP: "/authen/sign-up",
    CHANGE_PASSWORD: "/authen/change-password",
    FIND_ACCOUNTS: "/authen/find-accounts",
    UPDATE_ACCOUNT: "/authen/update-account",
    IS_EMAIL_IN_DB: "/authen/is-email-in-db",
  },
  MASTER: {
    INSERT_ROLE: "/master/insert-role",
    UPDATE_ROLE: "/master/update-role",
    INSERT_DOCUMENT: "/master/insert-document",
    UPDATE_DOCUMENT: "/master/update-document",
    INSERT_POSITION: "/master/insert-position",
    UPDATE_POSITION: "/master/update-position",
    INSERT_REASON: "/master/insert-reason",
    UPDATE_REASON: "/master/update-reason",
    INSERT_REQUEST_TYPE: "/master/insert-request-type",
    UPDATE_REQUEST_TYPE: "/master/update-request-type",
    INSERT_ROOM: "/master/insert-room",
    UPDATE_ROOM: "/master/update-room",
    FIND_ROLES: "/master/find-roles",
    FIND_ALL_ROLES: "/master/find-all-roles",
    FIND_ALL_ACCOUNT: "/master/find-all-accounts",
    FIND_AVAILABLE_ACCOUNTS: "/master/find-available-accounts",
    FIND_ALL_ROOMS: "/master/find-all-rooms",
    FIND_ALL_DOCUMENTS: "/master/find-all-documents",
    FIND_ALL_REQUEST_TYPE: "/master/find-all-request-type",
    FIND_ALL_POSITIONS: "/master/find-all-positions",
    FIND_ALL_REASON: "/master/find-all-reason",
  },
  HUMAN_RESOURCE: {
    INSERT_EMPLOYEE: "/human-resources/insert-employee",
    UPDATE_EMPLOYEE: "/human-resources/update-employee",
    SEARCH_ALL_EMPLOYEES: "/human-resources/search-all-employees",
    SEARCH_EMPLOYEE_BY_ACCOUNT_ID: "/human-resources/search-employee/",
    FIND_POSITIONS: "/human-resources/find-positions",
    FIND_DOCUMENTS: "/human-resources/find-documents",
    FIND_ROOMS: "/human-resources/find-rooms",
    FIND_REPORT_CASE_SELECTED: "/human-resources/find-report-case-selected",
  },
  BUSINESS: {
    INSERT_REQUEST: "/business/insert-request",
    SEARCH_LIST_CREATED_REQUEST: "/business/search-list-created-request-ticket",
    SEARCH_LIST_RECEIVED_REQUEST:
      "/business/search-list-received-request-ticket",
    SEARCH_REQUEST_BY_ID: "/business/find-request/",
    UPDATE_REQUESTER_ACTION: "/business/requester-action",
    UPDATE_SUPERVISOR_ACTION: "/business/supervisor-action",
    UPDATE_APPROVER_ACTION: "/business/approver-action",
    INSERT_COMMENT: "/business/insert-comment",
    FIND_CURRENT_USER: "/business/find-current-user",
    FIND_ACCOUNT_BY_ROLE: "/business/find-account-by-role/",
    FIND_REASON: "/business/find-reason",
    FIND_REQUEST_TYPE: "/business/find-request-type",
    FIND_EMPLOYEE_ID: "/business/find-employee-id",
    FIND_LIST_COMMENT: "/business/find-list-comment/",
    MUTIPLE_UPDATE_REQUEST_TICKET_STATUS:
      "/business/mutiple-update-request-ticket-status",
    FIND_NOTIFICATION_BY_RECEIVER_ID:
      "/business/find-notification-by-receiver-id",
    MARK_NOTIFICATION_AS_READ: "/business/mark-notification-as-read",
    DELETE_NOTIFICATION_BY_RECEIVER:
      "/businsess/delete-notification-by-receiver",
  },
};
