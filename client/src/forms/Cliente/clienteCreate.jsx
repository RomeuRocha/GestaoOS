import React from 'react';
import { Create, SimpleForm, TextInput } from 'react-admin';

const ClienteCreate = props => {

    return (
        <Create {...props}>
            <SimpleForm>
                <TextInput source="nome" fullWidth />
                <TextInput source="endereco" multiline fullWidth />
                <TextInput source="contatos" multiline fullWidth />
                <TextInput source="documentoID" label="CPF ou CNPJ" />
            </SimpleForm>
        </Create>
    );
}

export default ClienteCreate;
