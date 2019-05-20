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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListCabInstancesResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListCabInstancesResponse.AgentBotInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCabInstancesResponseUnmarshaller {

	public static ListCabInstancesResponse unmarshall(ListCabInstancesResponse listCabInstancesResponse, UnmarshallerContext context) {
		
		listCabInstancesResponse.setRequestId(context.stringValue("ListCabInstancesResponse.RequestId"));
		listCabInstancesResponse.setSuccess(context.booleanValue("ListCabInstancesResponse.Success"));
		listCabInstancesResponse.setCode(context.stringValue("ListCabInstancesResponse.Code"));
		listCabInstancesResponse.setMessage(context.stringValue("ListCabInstancesResponse.Message"));
		listCabInstancesResponse.setHttpStatusCode(context.integerValue("ListCabInstancesResponse.HttpStatusCode"));

		List<AgentBotInstance> instances = new ArrayList<AgentBotInstance>();
		for (int i = 0; i < context.lengthValue("ListCabInstancesResponse.Instances.Length"); i++) {
			AgentBotInstance agentBotInstance = new AgentBotInstance();
			agentBotInstance.setInstanceId(context.stringValue("ListCabInstancesResponse.Instances["+ i +"].InstanceId"));
			agentBotInstance.setInstanceName(context.stringValue("ListCabInstancesResponse.Instances["+ i +"].InstanceName"));
			agentBotInstance.setInstanceDescription(context.stringValue("ListCabInstancesResponse.Instances["+ i +"].InstanceDescription"));
			agentBotInstance.setMaxConcurrentConversation(context.integerValue("ListCabInstancesResponse.Instances["+ i +"].MaxConcurrentConversation"));
			agentBotInstance.setOwner(context.stringValue("ListCabInstancesResponse.Instances["+ i +"].Owner"));
			agentBotInstance.setCreationTime(context.longValue("ListCabInstancesResponse.Instances["+ i +"].CreationTime"));
			agentBotInstance.setCallCenterInstanceId(context.stringValue("ListCabInstancesResponse.Instances["+ i +"].CallCenterInstanceId"));
			agentBotInstance.setIsTemplateContainer(context.booleanValue("ListCabInstancesResponse.Instances["+ i +"].IsTemplateContainer"));

			instances.add(agentBotInstance);
		}
		listCabInstancesResponse.setInstances(instances);
	 
	 	return listCabInstancesResponse;
	}
}