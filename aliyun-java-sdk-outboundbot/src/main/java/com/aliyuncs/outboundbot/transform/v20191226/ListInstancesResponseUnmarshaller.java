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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListInstancesResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setSuccess(_ctx.booleanValue("ListInstancesResponse.Success"));
		listInstancesResponse.setCode(_ctx.stringValue("ListInstancesResponse.Code"));
		listInstancesResponse.setMessage(_ctx.stringValue("ListInstancesResponse.Message"));
		listInstancesResponse.setHttpStatusCode(_ctx.integerValue("ListInstancesResponse.HttpStatusCode"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setInstanceName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setInstanceDescription(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceDescription"));
			instance.setMaxConcurrentConversation(_ctx.integerValue("ListInstancesResponse.Instances["+ i +"].MaxConcurrentConversation"));
			instance.setOwner(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Owner"));
			instance.setCreationTime(_ctx.longValue("ListInstancesResponse.Instances["+ i +"].CreationTime"));
			instance.setCallCenterInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].CallCenterInstanceId"));
			instance.setIsTemplateContainer(_ctx.booleanValue("ListInstancesResponse.Instances["+ i +"].IsTemplateContainer"));

			instances.add(instance);
		}
		listInstancesResponse.setInstances(instances);
	 
	 	return listInstancesResponse;
	}
}