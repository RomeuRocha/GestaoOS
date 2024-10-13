
import React from 'react'
import { Edit, SimpleForm, TextInput } from 'react-admin'

const EquipamentoEdit = props => {

    return (

        <Edit {...props}>
            <SimpleForm >
                <TextInput source="nome" fullWidth />
                <TextInput source="modelo" fullWidth />
                <TextInput source="detalhes" multiline fullWidth />
            </SimpleForm>
        </Edit>
    )
}

export default EquipamentoEdit


