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
		listInstancesResponse.setCode(_ctx.stringValue("ListInstancesResponse.Code"));
		listInstancesResponse.setHttpStatusCode(_ctx.integerValue("ListInstancesResponse.HttpStatusCode"));
		listInstancesResponse.setMessage(_ctx.stringValue("ListInstancesResponse.Message"));
		listInstancesResponse.setSuccess(_ctx.booleanValue("ListInstancesResponse.Success"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setCallCenterInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].CallCenterInstanceId"));
			instance.setCreationTime(_ctx.longValue("ListInstancesResponse.Instances["+ i +"].CreationTime"));
			instance.setInstanceDescription(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceDescription"));
			instance.setInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setInstanceName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setIsTemplateContainer(_ctx.booleanValue("ListInstancesResponse.Instances["+ i +"].IsTemplateContainer"));
			instance.setMaxConcurrentConversation(_ctx.integerValue("ListInstancesResponse.Instances["+ i +"].MaxConcurrentConversation"));
			instance.setOwnerName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].OwnerName"));
			instance.setCreatorId(_ctx.longValue("ListInstancesResponse.Instances["+ i +"].CreatorId"));
			instance.setCreatorName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].CreatorName"));
			instance.setNluServiceType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].NluServiceType"));
			instance.setOwner(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Owner"));
			instance.setResourceGroupId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ResourceGroupId"));

			NluProfile nluProfile = new NluProfile();
			nluProfile.setAccessKey(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].NluProfile.AccessKey"));
			nluProfile.setEndpoint(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].NluProfile.Endpoint"));
			nluProfile.setSecretKey(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].NluProfile.SecretKey"));
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