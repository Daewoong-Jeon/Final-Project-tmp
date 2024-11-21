<template>
    <v-card outlined>
        <v-card-title>
            ReturnBook
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
                    @click="returnBook"
            >
                ReturnBook
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
        name: 'ReturnBookCommand',
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
            returnBook() {
                this.$emit('returnBook', this.value);
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

