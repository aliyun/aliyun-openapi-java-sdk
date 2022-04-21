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

import com.aliyuncs.outboundbot.model.v20191226.DescribeInstanceResponse;
import com.aliyuncs.outboundbot.model.v20191226.DescribeInstanceResponse.Instance;
import com.aliyuncs.outboundbot.model.v20191226.DescribeInstanceResponse.Instance.NluProfile;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceResponseUnmarshaller {

	public static DescribeInstanceResponse unmarshall(DescribeInstanceResponse describeInstanceResponse, UnmarshallerContext _ctx) {
		
		describeInstanceResponse.setRequestId(_ctx.stringValue("DescribeInstanceResponse.RequestId"));
		describeInstanceResponse.setHttpStatusCode(_ctx.integerValue("DescribeInstanceResponse.HttpStatusCode"));
		describeInstanceResponse.setCode(_ctx.stringValue("DescribeInstanceResponse.Code"));
		describeInstanceResponse.setMessage(_ctx.stringValue("DescribeInstanceResponse.Message"));
		describeInstanceResponse.setSuccess(_ctx.booleanValue("DescribeInstanceResponse.Success"));

		Instance instance = new Instance();
		instance.setCreationTime(_ctx.longValue("DescribeInstanceResponse.Instance.CreationTime"));
		instance.setCallCenterInstanceId(_ctx.stringValue("DescribeInstanceResponse.Instance.CallCenterInstanceId"));
		instance.setOwner(_ctx.stringValue("DescribeInstanceResponse.Instance.Owner"));
		instance.setNluServiceType(_ctx.stringValue("DescribeInstanceResponse.Instance.NluServiceType"));
		instance.setInstanceId(_ctx.stringValue("DescribeInstanceResponse.Instance.InstanceId"));
		instance.setCreatorId(_ctx.longValue("DescribeInstanceResponse.Instance.CreatorId"));
		instance.setOwnerName(_ctx.stringValue("DescribeInstanceResponse.Instance.OwnerName"));
		instance.setInstanceDescription(_ctx.stringValue("DescribeInstanceResponse.Instance.InstanceDescription"));
		instance.setInstanceName(_ctx.stringValue("DescribeInstanceResponse.Instance.InstanceName"));
		instance.setCreatorName(_ctx.stringValue("DescribeInstanceResponse.Instance.CreatorName"));
		instance.setResourceGroupId(_ctx.stringValue("DescribeInstanceResponse.Instance.ResourceGroupId"));
		instance.setMaxConcurrentConversation(_ctx.integerValue("DescribeInstanceResponse.Instance.MaxConcurrentConversation"));

		NluProfile nluProfile = new NluProfile();
		nluProfile.setAccessKey(_ctx.stringValue("DescribeInstanceResponse.Instance.NluProfile.AccessKey"));
		nluProfile.setSecretKey(_ctx.stringValue("DescribeInstanceResponse.Instance.NluProfile.SecretKey"));
		nluProfile.setEndpoint(_ctx.stringValue("DescribeInstanceResponse.Instance.NluProfile.Endpoint"));
		instance.setNluProfile(nluProfile);
		describeInstanceResponse.setInstance(instance);
	 
	 	return describeInstanceResponse;
	}
}