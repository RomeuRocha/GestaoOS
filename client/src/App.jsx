
import React from 'react'
import dataProvider from './service/dataProvider';
import authProvider from './service/authProvider';
import i18nProvider from './i18n/index.js';

import { Admin, Resource, ListGuesser, EditGuesser } from 'react-admin';
import clienteCreate from './forms/Cliente/clienteCreate'
import clienteEdit from './forms/Cliente/clienteEdit'
import clienteList from './forms/Cliente/clienteList'
import ordemServicoCreate from './forms/OrdemServico/ordemServicoCreate'
import ordemServicoEdit from './forms/OrdemServico/ordemServicoEdit'
import ordemServicoList from './forms/OrdemServico/ordemServicoList'
import equipamentoCreate from './forms/Equipamento/equipamentoCreate'
import equipamentoEdit from './forms/Equipamento/equipamentoEdit'
import equipamentoList from './forms/Equipamento/equipamentoList'

import AccountBoxIcon from '@mui/icons-material/AccountBox';
import ConstructionIcon from '@mui/icons-material/Construction';
import DescriptionIcon from '@mui/icons-material/Description';

function App() {

  return (
    <div className="App">
      <Admin dataProvider={dataProvider} authProvider={authProvider} i18nProvider={i18nProvider}>
        <Resource name="cliente" create={clienteCreate} list={clienteList} edit={clienteEdit} icon={AccountBoxIcon} />
        <Resource name="equipamento" create={equipamentoCreate} list={equipamentoList} edit={equipamentoEdit}  icon={ConstructionIcon}/>
        <Resource name="ordemServico" create={ordemServicoCreate} list={ordemServicoList} edit={ordemServicoEdit} icon={DescriptionIcon} />
      </Admin>
    </div>
  )
}

export default App


