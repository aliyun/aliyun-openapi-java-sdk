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

package com.aliyuncs.alb.transform.v20200616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alb.model.v20200616.GetListenerHealthStatusResponse;
import com.aliyuncs.alb.model.v20200616.GetListenerHealthStatusResponse.ListenerHealthStatusModel;
import com.aliyuncs.alb.model.v20200616.GetListenerHealthStatusResponse.ListenerHealthStatusModel.ServerGroupHealthStatusModel;
import com.aliyuncs.alb.model.v20200616.GetListenerHealthStatusResponse.ListenerHealthStatusModel.ServerGroupHealthStatusModel.BackendServerHealthStatusModel;
import com.aliyuncs.alb.model.v20200616.GetListenerHealthStatusResponse.ListenerHealthStatusModel.ServerGroupHealthStatusModel.BackendServerHealthStatusModel.Reason;
import com.aliyuncs.alb.model.v20200616.GetListenerHealthStatusResponse.RuleHealthStatusModel;
import com.aliyuncs.alb.model.v20200616.GetListenerHealthStatusResponse.RuleHealthStatusModel.ServerGroupHealthStatusModel2;
import com.aliyuncs.alb.model.v20200616.GetListenerHealthStatusResponse.RuleHealthStatusModel.ServerGroupHealthStatusModel2.NonNormalServer;
import com.aliyuncs.alb.model.v20200616.GetListenerHealthStatusResponse.RuleHealthStatusModel.ServerGroupHealthStatusModel2.NonNormalServer.Reason4;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetListenerHealthStatusResponseUnmarshaller {

	public static GetListenerHealthStatusResponse unmarshall(GetListenerHealthStatusResponse getListenerHealthStatusResponse, UnmarshallerContext _ctx) {
		
		getListenerHealthStatusResponse.setRequestId(_ctx.stringValue("GetListenerHealthStatusResponse.RequestId"));
		getListenerHealthStatusResponse.setNextToken(_ctx.stringValue("GetListenerHealthStatusResponse.NextToken"));

		List<ListenerHealthStatusModel> listenerHealthStatus = new ArrayList<ListenerHealthStatusModel>();
		for (int i = 0; i < _ctx.lengthValue("GetListenerHealthStatusResponse.ListenerHealthStatus.Length"); i++) {
			ListenerHealthStatusModel listenerHealthStatusModel = new ListenerHealthStatusModel();
			listenerHealthStatusModel.setListenerId(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ListenerId"));
			listenerHealthStatusModel.setListenerPort(_ctx.integerValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ListenerPort"));
			listenerHealthStatusModel.setListenerProtocol(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ListenerProtocol"));

			List<ServerGroupHealthStatusModel> serverGroupInfos = new ArrayList<ServerGroupHealthStatusModel>();
			for (int j = 0; j < _ctx.lengthValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos.Length"); j++) {
				ServerGroupHealthStatusModel serverGroupHealthStatusModel = new ServerGroupHealthStatusModel();
				serverGroupHealthStatusModel.setHealthCheckEnabled(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].HealthCheckEnabled"));
				serverGroupHealthStatusModel.setServerGroupId(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].ServerGroupId"));
				serverGroupHealthStatusModel.setActionType(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].ActionType"));

				List<BackendServerHealthStatusModel> nonNormalServers = new ArrayList<BackendServerHealthStatusModel>();
				for (int k = 0; k < _ctx.lengthValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers.Length"); k++) {
					BackendServerHealthStatusModel backendServerHealthStatusModel = new BackendServerHealthStatusModel();
					backendServerHealthStatusModel.setPort(_ctx.integerValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].Port"));
					backendServerHealthStatusModel.setServerId(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].ServerId"));
					backendServerHealthStatusModel.setServerIp(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].ServerIp"));
					backendServerHealthStatusModel.setStatus(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].Status"));

					Reason reason = new Reason();
					reason.setActualResponse(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].Reason.ActualResponse"));
					reason.setExpectedResponse(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].Reason.ExpectedResponse"));
					reason.setReasonCode(_ctx.stringValue("GetListenerHealthStatusResponse.ListenerHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].Reason.ReasonCode"));
					backendServerHealthStatusModel.setReason(reason);

					nonNormalServers.add(backendServerHealthStatusModel);
				}
				serverGroupHealthStatusModel.setNonNormalServers(nonNormalServers);

				serverGroupInfos.add(serverGroupHealthStatusModel);
			}
			listenerHealthStatusModel.setServerGroupInfos(serverGroupInfos);

			listenerHealthStatus.add(listenerHealthStatusModel);
		}
		getListenerHealthStatusResponse.setListenerHealthStatus(listenerHealthStatus);

		List<RuleHealthStatusModel> ruleHealthStatus = new ArrayList<RuleHealthStatusModel>();
		for (int i = 0; i < _ctx.lengthValue("GetListenerHealthStatusResponse.RuleHealthStatus.Length"); i++) {
			RuleHealthStatusModel ruleHealthStatusModel = new RuleHealthStatusModel();
			ruleHealthStatusModel.setRuleId(_ctx.stringValue("GetListenerHealthStatusResponse.RuleHealthStatus["+ i +"].RuleId"));

			List<ServerGroupHealthStatusModel2> serverGroupInfos1 = new ArrayList<ServerGroupHealthStatusModel2>();
			for (int j = 0; j < _ctx.lengthValue("GetListenerHealthStatusResponse.RuleHealthStatus["+ i +"].ServerGroupInfos.Length"); j++) {
				ServerGroupHealthStatusModel2 serverGroupHealthStatusModel2 = new ServerGroupHealthStatusModel2();
				serverGroupHealthStatusModel2.setHealthCheckEnabled(_ctx.stringValue("GetListenerHealthStatusResponse.RuleHealthStatus["+ i +"].ServerGroupInfos["+ j +"].HealthCheckEnabled"));
				serverGroupHealthStatusModel2.setServerGroupId(_ctx.stringValue("GetListenerHealthStatusResponse.RuleHealthStatus["+ i +"].ServerGroupInfos["+ j +"].ServerGroupId"));
				serverGroupHealthStatusModel2.setActionType(_ctx.stringValue("GetListenerHealthStatusResponse.RuleHealthStatus["+ i +"].ServerGroupInfos["+ j +"].ActionType"));

				List<NonNormalServer> nonNormalServers3 = new ArrayList<NonNormalServer>();
				for (int k = 0; k < _ctx.lengthValue("GetListenerHealthStatusResponse.RuleHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers.Length"); k++) {
					NonNormalServer nonNormalServer = new NonNormalServer();
					nonNormalServer.setPort(_ctx.integerValue("GetListenerHealthStatusResponse.RuleHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].Port"));
					nonNormalServer.setServerId(_ctx.stringValue("GetListenerHealthStatusResponse.RuleHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].ServerId"));
					nonNormalServer.setServerIp(_ctx.stringValue("GetListenerHealthStatusResponse.RuleHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].ServerIp"));
					nonNormalServer.setStatus(_ctx.stringValue("GetListenerHealthStatusResponse.RuleHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].Status"));

					Reason4 reason4 = new Reason4();
					reason4.setActualResponse(_ctx.stringValue("GetListenerHealthStatusResponse.RuleHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].Reason.ActualResponse"));
					reason4.setExpectedResponse(_ctx.stringValue("GetListenerHealthStatusResponse.RuleHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].Reason.ExpectedResponse"));
					reason4.setReasonCode(_ctx.stringValue("GetListenerHealthStatusResponse.RuleHealthStatus["+ i +"].ServerGroupInfos["+ j +"].NonNormalServers["+ k +"].Reason.ReasonCode"));
					nonNormalServer.setReason4(reason4);

					nonNormalServers3.add(nonNormalServer);
				}
				serverGroupHealthStatusModel2.setNonNormalServers3(nonNormalServers3);

				serverGroupInfos1.add(serverGroupHealthStatusModel2);
			}
			ruleHealthStatusModel.setServerGroupInfos1(serverGroupInfos1);

			ruleHealthStatus.add(ruleHealthStatusModel);
		}
		getListenerHealthStatusResponse.setRuleHealthStatus(ruleHealthStatus);
	 
	 	return getListenerHealthStatusResponse;
	}
}