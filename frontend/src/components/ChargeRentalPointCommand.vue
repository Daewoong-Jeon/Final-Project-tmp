<template>
    <v-card outlined>
        <v-card-title>
            ChargeRentalPoint
        </v-card-title>

        <v-card-text>
            <Number label="RentalPoint" v-model="value.rentalPoint" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="chargeRentalPoint"
            >
                ChargeRentalPoint
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'ChargeRentalPointCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.rentalPoint = 0;
        },
        watch: {
        },
        methods: {
            chargeRentalPoint() {
                this.$emit('chargeRentalPoint', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

