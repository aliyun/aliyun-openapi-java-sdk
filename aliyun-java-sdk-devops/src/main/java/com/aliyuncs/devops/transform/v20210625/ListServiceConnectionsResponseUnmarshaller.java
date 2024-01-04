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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListServiceConnectionsResponse;
import com.aliyuncs.devops.model.v20210625.ListServiceConnectionsResponse.ServiceConnection;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceConnectionsResponseUnmarshaller {

	public static ListServiceConnectionsResponse unmarshall(ListServiceConnectionsResponse listServiceConnectionsResponse, UnmarshallerContext _ctx) {
		
		listServiceConnectionsResponse.setRequestId(_ctx.stringValue("ListServiceConnectionsResponse.requestId"));
		listServiceConnectionsResponse.setErrorMessage(_ctx.stringValue("ListServiceConnectionsResponse.errorMessage"));
		listServiceConnectionsResponse.setErrorCode(_ctx.stringValue("ListServiceConnectionsResponse.errorCode"));
		listServiceConnectionsResponse.setSuccess(_ctx.booleanValue("ListServiceConnectionsResponse.success"));

		List<ServiceConnection> serviceConnections = new ArrayList<ServiceConnection>();
		for (int i = 0; i < _ctx.lengthValue("ListServiceConnectionsResponse.serviceConnections.Length"); i++) {
			ServiceConnection serviceConnection = new ServiceConnection();
			serviceConnection.setOwnerAccountId(_ctx.longValue("ListServiceConnectionsResponse.serviceConnections["+ i +"].ownerAccountId"));
			serviceConnection.setName(_ctx.stringValue("ListServiceConnectionsResponse.serviceConnections["+ i +"].name"));
			serviceConnection.setId(_ctx.longValue("ListServiceConnectionsResponse.serviceConnections["+ i +"].id"));
			serviceConnection.setType(_ctx.stringValue("ListServiceConnectionsResponse.serviceConnections["+ i +"].type"));
			serviceConnection.setCreateTime(_ctx.longValue("ListServiceConnectionsResponse.serviceConnections["+ i +"].createTime"));
			serviceConnection.setUuid(_ctx.stringValue("ListServiceConnectionsResponse.serviceConnections["+ i +"].uuid"));

			serviceConnections.add(serviceConnection);
		}
		listServiceConnectionsResponse.setServiceConnections(serviceConnections);
	 
	 	return listServiceConnectionsResponse;
	}
}