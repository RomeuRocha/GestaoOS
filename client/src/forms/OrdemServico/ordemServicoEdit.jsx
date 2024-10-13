
import React from 'react'
import { DateInput, Edit, NumberInput, ReferenceInput, SelectInput, SimpleForm, TextInput } from 'react-admin'
import Grid from '@mui/material/Grid2';
import Box from '@mui/material/Box';

const OrdemServicoEdit = props => {

    return (

        <Edit {...props}>
            <SimpleForm >
                <Box sx={{ flexGrow: 1, width: '100%' }} >
                    <Grid container spacing={2}>

                        <Grid size={{ xs: 6, md: 6, sm: 12 }}>
                            <ReferenceInput source="cliente.id" reference="cliente" label='Cliente' >
                                <SelectInput optionText="nome" fullWidth />
                            </ReferenceInput>
                        </Grid>

                        <Grid size={{ xs: 6, md: 6, sm: 12 }}>
                            <ReferenceInput source="equipamento.id" reference="equipamento" label='Equipamento'>
                                <SelectInput optionText="nome" fullWidth />
                            </ReferenceInput>

                        </Grid>

                        <Grid size={{ xs: 3, md: 3, sm: 12 }}>

                            <TextInput source="equipamentoID" label='ID do Equipamento' fullWidth />
                        </Grid>





                        <Grid size={{ xs: 3, md: 3, sm: 12 }}>
                            <DateInput source="data" fullWidth />
                        </Grid>
                        <Grid size={{ xs: 6, md: 6, sm: 12 }}>
                            <TextInput source="responsavel" fullWidth />
                        </Grid>
                        <Grid size={{ xs: 3, md: 3, sm: 12 }}>
                            <NumberInput source="valorTotal" label="Valor Total" fullWidth />
                        </Grid>

                        <Grid size={{ xs: 3, md: 3, sm: 12 }}>
                            <SelectInput source="status" choices={[
                                { id: 'pendente', name: 'Pendente' },
                                { id: 'em_andamento', name: 'Em Andamento' },
                                { id: 'concluido', name: 'Concluído' }
                            ]} fullWidth />
                        </Grid>

                        <TextInput source="diagnostico" fullWidth multiline />
                        <TextInput source="servicos" label='Serviços' fullWidth multiline />
                        <TextInput source="pecas" label='Peças' fullWidth multiline />
                    </Grid>


                </Box>
            </SimpleForm>
        </Edit>
    )
}

export default OrdemServicoEdit


