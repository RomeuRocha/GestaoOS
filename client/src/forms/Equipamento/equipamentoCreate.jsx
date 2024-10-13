import React from 'react';
import { Create, SimpleForm, TextInput } from 'react-admin';

const EquipamentoCreate = props => {
    return (
        <Create {...props}>
            <SimpleForm>
                <TextInput source="nome" fullWidth />
                <TextInput source="modelo" fullWidth />
                <TextInput source="detalhes" multiline fullWidth />
                </SimpleForm>
        </Create>
    );
}

export default EquipamentoCreate;
