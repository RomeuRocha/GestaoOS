
import React from 'react'
import { Edit, SimpleForm, TextInput } from 'react-admin'

const ClienteEdit = props => {

    return (

        <Edit {...props}>
            <SimpleForm >

                <TextInput source="nome" fullWidth />
                <TextInput source="endereco" multiline fullWidth />
                <TextInput source="contatos" multiline fullWidth />
                <TextInput source="documentoID" label="CPF ou CNPJ" />
            </SimpleForm>
        </Edit>
    )
}

export default ClienteEdit


