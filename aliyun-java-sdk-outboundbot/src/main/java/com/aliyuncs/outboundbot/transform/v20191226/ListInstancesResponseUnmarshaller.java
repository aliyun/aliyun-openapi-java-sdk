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
import com.aliyuncs.outboundbot.model.v20191226.ListInstancesResponse.Instance.NluProfile;
import com.aliyuncs.outboundbot.model.v20191226.ListInstancesResponse.Instance.ResourceTag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setHttpStatusCode(_ctx.integerValue("ListInstancesResponse.HttpStatusCode"));
		listInstancesResponse.setCode(_ctx.stringValue("ListInstancesResponse.Code"));
		listInstancesResponse.setMessage(_ctx.stringValue("ListInstancesResponse.Message"));
		listInstancesResponse.setSuccess(_ctx.booleanValue("ListInstancesResponse.Success"));
		listInstancesResponse.setTotalCount(_ctx.integerValue("ListInstancesResponse.TotalCount"));
		listInstancesResponse.setPageNumber(_ctx.integerValue("ListInstancesResponse.PageNumber"));
		listInstancesResponse.setPageSize(_ctx.integerValue("ListInstancesResponse.PageSize"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setCreationTime(_ctx.longValue("ListInstancesResponse.Instances["+ i +"].CreationTime"));
			instance.setCallCenterInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].CallCenterInstanceId"));
			instance.setOwner(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Owner"));
			instance.setNluServiceType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].NluServiceType"));
			instance.setIsTemplateContainer(_ctx.booleanValue("ListInstancesResponse.Instances["+ i +"].IsTemplateContainer"));
			instance.setInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setOwnerName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].OwnerName"));
			instance.setCreatorId(_ctx.longValue("ListInstancesResponse.Instances["+ i +"].CreatorId"));
			instance.setInstanceDescription(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceDescription"));
			instance.setInstanceName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setResourceGroupId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ResourceGroupId"));
			instance.setCreatorName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].CreatorName"));
			instance.setMaxConcurrentConversation(_ctx.integerValue("ListInstancesResponse.Instances["+ i +"].MaxConcurrentConversation"));
			instance.setIsPreset(_ctx.booleanValue("ListInstancesResponse.Instances["+ i +"].IsPreset"));

			NluProfile nluProfile = new NluProfile();
			nluProfile.setAccessKey(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].NluProfile.AccessKey"));
			nluProfile.setSecretKey(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].NluProfile.SecretKey"));
			nluProfile.setEndpoint(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].NluProfile.Endpoint"));
			nluProfile.setAgentId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].NluProfile.AgentId"));
			instance.setNluProfile(nluProfile);

			List<ResourceTag> resourceTags = new ArrayList<ResourceTag>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.Instances["+ i +"].ResourceTags.Length"); j++) {
				ResourceTag resourceTag = new ResourceTag();
				resourceTag.setKey(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ResourceTags["+ j +"].Key"));
				resourceTag.setValue(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ResourceTags["+ j +"].Value"));

				resourceTags.add(resourceTag);
			}
			instance.setResourceTags(resourceTags);

			instances.add(instance);
		}
		listInstancesResponse.setInstances(instances);
	 
	 	return listInstancesResponse;
	}
}