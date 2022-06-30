import DashboardLayout from "@/layout/dashboard/DashboardLayout.vue";
import AuthLayout from "@/layout/dashboard/AuthLayout.vue";

// GeneralViews
import NotFound from "@/pages/NotFoundPage.vue";

//import middleware
import auth from "@/middleware/auth";
import guest from "@/middleware/guest";
import { FE_ROUTER_PROP } from "../constant/routerProps";

const Login = () => import(/* webpackChunkName: "pages" */ "@/pages/Login.vue");

// Example pages
const UserProfile = () => import("@/pages/Examples/UserProfile.vue");
// User Management
const ListUserPage = () =>
  import("@/pages/Examples/UserManagement/ListUserPage.vue");
const ListAccountsPage = () => import("../pages/Admin/ListAccouts.vue");
const NewUserPage = () => import("@/pages/Examples/UserManagement/NewUser.vue");
const UpdateUserPage = () =>
  import("@/pages/Examples/UserManagement/UpdateUserPage.vue");

// Request Ticket
const NewTicket = () => import("@/pages/RequestTicket/NewTicket.vue");
const ListTicket = () =>
  import("@/pages/RequestTicket/RequestedTicket/ListRequestedTicket.vue");
const RequestedTicket = () =>
  import("@/pages/RequestTicket/RequestedTicket/RequestedTicket.vue");
const ListReceivedRequestTicket = () =>
  import(
    "@/pages/RequestTicket/ReceivedRequestTicket/ListReceivedRequestTicket.vue"
  );

let authPages = {
  path: FE_ROUTER_PROP.LOGIN.ROOT_PATH,
  redirect: FE_ROUTER_PROP.LOGIN.REDIRECT,
  component: AuthLayout,
  children: [
    {
      path: FE_ROUTER_PROP.LOGIN.CHILDREN.LOGIN.PATH,
      name: FE_ROUTER_PROP.LOGIN.CHILDREN.LOGIN.NAME,
      component: Login,
      meta: { middleware: guest },
    },
  ],
};

let adminMenu = {
  path: FE_ROUTER_PROP.ADMIN.ROOT_PATH,
  component: DashboardLayout,
  name: FE_ROUTER_PROP.ADMIN.ROOT_NAME,
  children: [
    {
      path: FE_ROUTER_PROP.ADMIN.CHILDREN.ACCOUNT_MANAGEMENT.PATH,
      name: FE_ROUTER_PROP.ADMIN.CHILDREN.ACCOUNT_MANAGEMENT.NAME,
      components: { default: ListAccountsPage },
      meta: { middleware: auth },
    },
  ],
};

let humanManagementMenu = {
  path: FE_ROUTER_PROP.HUMAN_MANAGEMENT.ROOT_PATH,
  component: DashboardLayout,
  name: FE_ROUTER_PROP.HUMAN_MANAGEMENT.ROOT_NAME,
  children: [
    {
      path: FE_ROUTER_PROP.HUMAN_MANAGEMENT.CHILDREN.EMPLOYEES.PATH,
      name: FE_ROUTER_PROP.HUMAN_MANAGEMENT.CHILDREN.EMPLOYEES.NAME,
      components: { default: ListUserPage },
      meta: { middleware: auth },
    },
    {
      path: FE_ROUTER_PROP.HUMAN_MANAGEMENT.CHILDREN.ADD_EMPLOYEE.PATH,
      name: FE_ROUTER_PROP.HUMAN_MANAGEMENT.CHILDREN.ADD_EMPLOYEE.NAME,
      components: { default: NewUserPage },
      meta: { middleware: auth },
    },
    {
      path: FE_ROUTER_PROP.HUMAN_MANAGEMENT.CHILDREN.UPDATE_EMPLOYEE.PATH,
      name: FE_ROUTER_PROP.HUMAN_MANAGEMENT.CHILDREN.UPDATE_EMPLOYEE.NAME,
      components: { default: UpdateUserPage },
      meta: { middleware: auth },
    },
  ],
};

let employeeMenu = {
  path: FE_ROUTER_PROP.REQUEST_TICKET.ROOT_PATH,
  component: DashboardLayout,
  name: FE_ROUTER_PROP.REQUEST_TICKET.ROOT_NAME,
  children: [
    {
      path: FE_ROUTER_PROP.REQUEST_TICKET.CHILDREN.LIST_REQUESTED_TICKET.PATH,
      name: FE_ROUTER_PROP.REQUEST_TICKET.CHILDREN.LIST_REQUESTED_TICKET.NAME,
      components: { default: ListTicket },
      meta: { middleware: auth },
    },
    {
      path: FE_ROUTER_PROP.REQUEST_TICKET.CHILDREN.CREATE_REQUEST_TICKET.PATH,
      name: FE_ROUTER_PROP.REQUEST_TICKET.CHILDREN.CREATE_REQUEST_TICKET.NAME,
      components: { default: NewTicket },
      meta: { middleware: auth },
    },
    {
      path: FE_ROUTER_PROP.REQUEST_TICKET.CHILDREN.REQUESTED_TICKET.PATH,
      name: FE_ROUTER_PROP.REQUEST_TICKET.CHILDREN.REQUESTED_TICKET.NAME,
      components: { default: RequestedTicket },
      meta: { middleware: auth },
    },
    {
      path:
        FE_ROUTER_PROP.REQUEST_TICKET.CHILDREN.LIST_RECEIVED_REQUEST_TICKET
          .PATH,
      name:
        FE_ROUTER_PROP.REQUEST_TICKET.CHILDREN.LIST_RECEIVED_REQUEST_TICKET
          .NAME,
      components: { default: ListReceivedRequestTicket },
      meta: { middleware: auth },
    },
    {
      path: FE_ROUTER_PROP.REQUEST_TICKET.CHILDREN.RECEIVED_REQUEST_TICKET.PATH,
      name: FE_ROUTER_PROP.REQUEST_TICKET.CHILDREN.RECEIVED_REQUEST_TICKET.NAME,
      components: { default: RequestedTicket },
      meta: { middleware: auth },
    },
  ],
};

const routes = [
  adminMenu,
  authPages,
  humanManagementMenu,
  employeeMenu,
  {
    path: FE_ROUTER_PROP.DASHBOARD.ROOT_PATH,
    component: DashboardLayout,
    children: [
      {
        path: FE_ROUTER_PROP.USER.PATH,
        name: FE_ROUTER_PROP.USER.NAME,
        components: { default: UserProfile },
        meta: { middleware: auth },
      },
    ],
  },
  { path: "*", component: NotFound },
];

/**
 * Asynchronously load view (Webpack Lazy loading compatible)
 * The specified component must be inside the Views folder
 * @param  {string} name  the filename (basename) of the view to load.
function view(name) {
   var res= require('../components/Dashboard/Views/' + name + '.vue');
   return res;
};**/

export default routes;
