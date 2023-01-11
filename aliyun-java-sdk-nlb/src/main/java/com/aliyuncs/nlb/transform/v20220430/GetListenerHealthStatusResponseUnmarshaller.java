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

package com.aliyuncs.nlb.transform.v20220430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nlb.model.v20220430.GetListenerHealthStatusResponse;
import com.aliyuncs.nlb.model.v20220430.GetListenerHealthStatusResponse.ListenerHealthStatusItem;
import com.aliyuncs.nlb.model.v20220430.GetListenerHealthStatusResponse.ListenerHealthStatusItem.ServerGroupInfo;
import com.aliyuncs.nlb.model.v20220430.GetListenerHealthStatusResponse.ListenerHealthStatusItem.ServerGroupInfo.AbnormalServer;
import com.aliyuncs.nlb.model.v20220430.GetListenerHealthStatusResponse.ListenerHealthStatusItem.ServerGroupInfo.AbnormalServer.Reason;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetListenerHealthStatusResponseUnmarshaller {

	public static GetListenerHealthStatusResponse unmarshall(GetListenerHealthStatusResponse getListenerHealthStatusResponse, UnmarshallerContext _ctx) {
		
		getListenerHealthStatusResponse.setRequestId(_ctx.stringValue("GetListenerHealthStatusResponse.RequestId"));
		getListenerHealthStatusResponse.setSuccess(_ctx.booleanValue("GetListenerHealthStatusResponse.Success"));
		getListenerHealthStatusResponse.setCode(_ctx.stringValue("GetListenerHealthStatusResponse.Code"));
		getListenerHealthStatusResponse.setMessage(_ctx.stringValue("GetListenerHealthStatusResponse.Message"));
		getListenerHealthStatusResponse.setHttpStatusCode(_ctx.integerValue("GetListenerHealthStatusResponse.HttpStatusCode"));
		getListenerHealthStatusResponse.setDynamicCode(_ctx.stringValue("GetListenerHealthStatusResponse.DynamicCode"));
		getListenerHealthStatusResponse.setDynamicMessage(_ctx.stringValue("GetListenerHealthStatusResponse.DynamicMessage"));
		getListenerHealthStatusResponse.setTotalCount(_ctx.integerValue("GetListenerHealthStatusResponse.TotalCount"));
		getListenerHealthStatusResponse.setNextToken(_ctx.stringValue("GetListenerHealthStatusResponse.NextToken"));
		getListenerHealthStatusResponse.setMaxResults(_ctx.integerValue("GetListenerHealthStatusResponse.MaxResults"));

		List<ListenerHealthStatusItem> listenerHealthStatus = new ArrayList<ListenerHealthStatusItem>();
		for (int i = 0; i < _ctx.lengthValue("GetListenerHealthStatusResponse.ListenerHealthStatus.Length"); i++) {
			ListenerHealthStatusItem listenerHealthStatusItem = new ListenerHealthStatusItem();
			listenerHealthStatusItem.setListenerId(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ListenerId"));
			listenerHealthStatusItem.setListenerPort(_ctx.integerValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ListenerPort"));
			listenerHealthStatusItem.setListenerProtocol(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ListenerProtocol"));

			List<ServerGroupInfo> serverGroupInfos = new ArrayList<ServerGroupInfo>();
			for (int j = 0; j < _ctx.lengthValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos.Length"); j++) {
				ServerGroupInfo serverGroupInfo = new ServerGroupInfo();
				serverGroupInfo.setHeathCheckEnabled(_ctx.booleanValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].HeathCheckEnabled"));
				serverGroupInfo.setServerGroupId(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].ServerGroupId"));

				List<AbnormalServer> nonNormalServers = new ArrayList<AbnormalServer>();
				for (int k = 0; k < _ctx.lengthValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers.Length"); k++) {
					AbnormalServer abnormalServer = new AbnormalServer();
					abnormalServer.setStatus(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].Status"));
					abnormalServer.setPort(_ctx.integerValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].Port"));
					abnormalServer.setServerId(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].ServerId"));
					abnormalServer.setServerIp(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].ServerIp"));

					Reason reason = new Reason();
					reason.setReasonCode(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].Reason.ReasonCode"));
					abnormalServer.setReason(reason);

					nonNormalServers.add(abnormalServer);
				}
				serverGroupInfo.setNonNormalServers(nonNormalServers);

				serverGroupInfos.add(serverGroupInfo);
			}
			listenerHealthStatusItem.setServerGroupInfos(serverGroupInfos);

			listenerHealthStatus.add(listenerHealthStatusItem);
		}
		getListenerHealthStatusResponse.setListenerHealthStatus(listenerHealthStatus);
	 
	 	return getListenerHealthStatusResponse;
	}
}