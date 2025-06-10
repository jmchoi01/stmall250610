import { createRouter, createWebHashHistory } from 'vue-router';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: () => import('../components/pages/Index.vue'),
    },
    {
      path: '/orders',
      component: () => import('../components/ui/OrderGrid.vue'),
    },
    {
      path: '/stockAdmins',
      component: () => import('../components/ui/StockAdminGrid.vue'),
    },
    {
      path: '/deliveries',
      component: () => import('../components/ui/DeliveryGrid.vue'),
    },
    {
      path: '/mypages',
      component: () => import('../components/MypageView.vue'),
    },
  ],
})

export default router;
