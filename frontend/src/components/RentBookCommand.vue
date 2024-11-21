<template>
    <v-card outlined>
        <v-card-title>
            RentBook
        </v-card-title>

        <v-card-text>
            <String label="BookId" v-model="value.bookId" :editMode="editMode"/>
            <String label="MemberId" v-model="value.memberId" :editMode="editMode"/>
            <Number label="Id" v-model="value.id" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="rentBook"
            >
                RentBook
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
        name: 'RentBookCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.bookId = '';
            this.value.memberId = '';
            this.value.id = 0;
        },
        watch: {
        },
        methods: {
            rentBook() {
                this.$emit('rentBook', this.value);
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

