
import React from 'react'
import { List, Datagrid, TextField, NumberField, DateField, DeleteButton, EditButton, ShowButton } from 'react-admin'

const OrdemServicoList = props => {

    return (

        <List {...props}>
            <Datagrid>
                <NumberField source="id" />
                <DateField source="data" />
                <TextField source="responsavel" />
                <TextField source="valorTotal" />
                <TextField source="equipamentoID" label='ID do equipamento' />
                <ShowButton />
                <EditButton />
                <DeleteButton />
            </Datagrid>
        </List>
    )
}

export default OrdemServicoList


