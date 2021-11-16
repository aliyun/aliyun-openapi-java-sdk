/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListConnectionsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListConnectionsResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListConnectionsResponse.Data.ConnectionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConnectionsResponseUnmarshaller {

	public static ListConnectionsResponse unmarshall(ListConnectionsResponse listConnectionsResponse, UnmarshallerContext _ctx) {
		
		listConnectionsResponse.setRequestId(_ctx.stringValue("ListConnectionsResponse.RequestId"));
		listConnectionsResponse.setHttpStatusCode(_ctx.integerValue("ListConnectionsResponse.HttpStatusCode"));
		listConnectionsResponse.setSuccess(_ctx.booleanValue("ListConnectionsResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListConnectionsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListConnectionsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListConnectionsResponse.Data.TotalCount"));

		List<ConnectionsItem> connections = new ArrayList<ConnectionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListConnectionsResponse.Data.Connections.Length"); i++) {
			ConnectionsItem connectionsItem = new ConnectionsItem();
			connectionsItem.setShared(_ctx.booleanValue("ListConnectionsResponse.Data.Connections["+ i +"].Shared"));
			connectionsItem.setGmtModified(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].GmtModified"));
			connectionsItem.setConnectStatus(_ctx.integerValue("ListConnectionsResponse.Data.Connections["+ i +"].ConnectStatus"));
			connectionsItem.setBindingCalcEngineId(_ctx.integerValue("ListConnectionsResponse.Data.Connections["+ i +"].BindingCalcEngineId"));
			connectionsItem.setDescription(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].Description"));
			connectionsItem.setConnectionType(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].ConnectionType"));
			connectionsItem.setGmtCreate(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].GmtCreate"));
			connectionsItem.setDefaultEngine(_ctx.booleanValue("ListConnectionsResponse.Data.Connections["+ i +"].DefaultEngine"));
			connectionsItem.setOperator(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].Operator"));
			connectionsItem.setSequence(_ctx.integerValue("ListConnectionsResponse.Data.Connections["+ i +"].Sequence"));
			connectionsItem.setEnvType(_ctx.integerValue("ListConnectionsResponse.Data.Connections["+ i +"].EnvType"));
			connectionsItem.setTenantId(_ctx.longValue("ListConnectionsResponse.Data.Connections["+ i +"].TenantId"));
			connectionsItem.setName(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].Name"));
			connectionsItem.setSubType(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].SubType"));
			connectionsItem.setId(_ctx.integerValue("ListConnectionsResponse.Data.Connections["+ i +"].Id"));
			connectionsItem.setProjectId(_ctx.integerValue("ListConnectionsResponse.Data.Connections["+ i +"].ProjectId"));
			connectionsItem.setStatus(_ctx.integerValue("ListConnectionsResponse.Data.Connections["+ i +"].Status"));
			connectionsItem.setContent(_ctx.stringValue("ListConnectionsResponse.Data.Connections["+ i +"].Content"));

			connections.add(connectionsItem);
		}
		data.setConnections(connections);
		listConnectionsResponse.setData(data);
	 
	 	return listConnectionsResponse;
	}
}