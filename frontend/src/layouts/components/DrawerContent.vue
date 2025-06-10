<script setup>
import {
  VerticalNavLink,
  VerticalNavSectionTitle,
} from '@layouts'
</script>

<template>
    <ul>
        <VerticalNavSectionTitle :item="{ heading: 'Order' }" />
        <VerticalNavLink
            :item="{
                title: 'Order',
                to: '/orders',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Stockadmin' }" />
        <VerticalNavLink
            :item="{
                title: 'StockAdmin',
                to: '/stockAdmins',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Delivery' }" />
        <VerticalNavLink
            :item="{
                title: 'Delivery',
                to: '/deliveries',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Dashboard' }" />
        <VerticalNavLink
            :item="{
                title: 'Mypage',
                to: '/mypages',
            }"
        />
    </ul>
</template>
