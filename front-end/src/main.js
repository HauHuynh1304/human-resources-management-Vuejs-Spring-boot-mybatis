import Vue from "vue";
import VueRouter from "vue-router";
import RouterPrefetch from "vue-router-prefetch";
import App from "./App";
// TIP: change to import router from "./router/starterRouter"; to start with a clean layout
import router from "./router/index";
import store from "./store";
import Vuex from 'vuex';

import BlackDashboard from "./plugins/blackDashboard";
import i18n from "./i18n";
import "./registerServiceWorker";
import VueMeta from "vue-meta";
import { BootstrapVue, BootstrapVueIcons } from "bootstrap-vue";
import EventBus from "./utils/EventBus";
import _ from "lodash";

Vue.use(BlackDashboard);
Vue.use(VueRouter);
Vue.use(RouterPrefetch);
Vue.use(VueMeta, { keyName: "head" });
Vue.use(BootstrapVue);
Vue.use(EventBus);
Vue.use(_);
Vue.use(BootstrapVueIcons);
Vue.use(Vuex);

/* eslint-disable no-new */
new Vue({
  store: store,
  router,
  i18n,
  render: (h) => h(App),
}).$mount("#app");
