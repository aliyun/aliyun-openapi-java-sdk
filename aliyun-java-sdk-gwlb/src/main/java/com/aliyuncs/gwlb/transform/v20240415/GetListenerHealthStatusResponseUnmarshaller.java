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

package com.aliyuncs.gwlb.transform.v20240415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gwlb.model.v20240415.GetListenerHealthStatusResponse;
import com.aliyuncs.gwlb.model.v20240415.GetListenerHealthStatusResponse.ListenerHealthStatusItem;
import com.aliyuncs.gwlb.model.v20240415.GetListenerHealthStatusResponse.ListenerHealthStatusItem.ServerGroupInfo;
import com.aliyuncs.gwlb.model.v20240415.GetListenerHealthStatusResponse.ListenerHealthStatusItem.ServerGroupInfo.Server;
import com.aliyuncs.gwlb.model.v20240415.GetListenerHealthStatusResponse.ListenerHealthStatusItem.ServerGroupInfo.Server.Reason;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetListenerHealthStatusResponseUnmarshaller {

	public static GetListenerHealthStatusResponse unmarshall(GetListenerHealthStatusResponse getListenerHealthStatusResponse, UnmarshallerContext _ctx) {
		
		getListenerHealthStatusResponse.setRequestId(_ctx.stringValue("GetListenerHealthStatusResponse.RequestId"));
		getListenerHealthStatusResponse.setMaxResults(_ctx.integerValue("GetListenerHealthStatusResponse.MaxResults"));
		getListenerHealthStatusResponse.setNextToken(_ctx.stringValue("GetListenerHealthStatusResponse.NextToken"));
		getListenerHealthStatusResponse.setTotalCount(_ctx.integerValue("GetListenerHealthStatusResponse.TotalCount"));

		List<ListenerHealthStatusItem> listenerHealthStatus = new ArrayList<ListenerHealthStatusItem>();
		for (int i = 0; i < _ctx.lengthValue("GetListenerHealthStatusResponse.ListenerHealthStatus.Length"); i++) {
			ListenerHealthStatusItem listenerHealthStatusItem = new ListenerHealthStatusItem();
			listenerHealthStatusItem.setListenerId(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ListenerId"));

			List<ServerGroupInfo> serverGroupInfos = new ArrayList<ServerGroupInfo>();
			for (int j = 0; j < _ctx.lengthValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos.Length"); j++) {
				ServerGroupInfo serverGroupInfo = new ServerGroupInfo();
				serverGroupInfo.setHealthCheckEnabled(_ctx.booleanValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].HealthCheckEnabled"));
				serverGroupInfo.setServerGroupId(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].ServerGroupId"));

				List<Server> servers = new ArrayList<Server>();
				for (int k = 0; k < _ctx.lengthValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].Servers.Length"); k++) {
					Server server = new Server();
					server.setPort(_ctx.integerValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].Servers["+ k +"].Port"));
					server.setServerId(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].Servers["+ k +"].ServerId"));
					server.setServerIp(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].Servers["+ k +"].ServerIp"));
					server.setStatus(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].Servers["+ k +"].Status"));

					Reason reason = new Reason();
					reason.setReasonCode(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].Servers["+ k +"].Reason.ReasonCode"));
					server.setReason(reason);

					servers.add(server);
				}
				serverGroupInfo.setServers(servers);

				serverGroupInfos.add(serverGroupInfo);
			}
			listenerHealthStatusItem.setServerGroupInfos(serverGroupInfos);

			listenerHealthStatus.add(listenerHealthStatusItem);
		}
		getListenerHealthStatusResponse.setListenerHealthStatus(listenerHealthStatus);
	 
	 	return getListenerHealthStatusResponse;
	}
}