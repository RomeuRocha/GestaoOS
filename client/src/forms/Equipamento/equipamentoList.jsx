
    import React from 'react'
    import {List,Datagrid,TextField,NumberField,DateField,DeleteButton,EditButton,ShowButton  } from 'react-admin'
    
    const EquipamentoList = props => {

        return (
    
            <List {...props}>
                <Datagrid>
                    <NumberField source="id" />
<TextField source="nome" />
<TextField source="modelo" />
<TextField source="detalhes" />
                    <ShowButton />
                    <EditButton />
                    <DeleteButton />
                </Datagrid>
            </List>
        )
    }
    
    export default EquipamentoList

    
