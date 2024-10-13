
    import React from 'react'
    import {List,Datagrid,TextField,NumberField,DateField,DeleteButton,EditButton,ShowButton  } from 'react-admin'
    
    const ClienteList = props => {

        return (
    
            <List {...props}>
                <Datagrid>
                    <NumberField source="id" />
<TextField source="nome" />
<TextField source="endereco" />
<TextField source="contatos" />
<TextField source="documentoID" label="Documento" />
                    <ShowButton />
                    <EditButton />
                    <DeleteButton />
                </Datagrid>
            </List>
        )
    }
    
    export default ClienteList

    
