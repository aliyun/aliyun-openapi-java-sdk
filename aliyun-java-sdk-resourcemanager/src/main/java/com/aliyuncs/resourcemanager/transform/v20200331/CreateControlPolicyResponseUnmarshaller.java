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

package com.aliyuncs.resourcemanager.transform.v20200331;

import com.aliyuncs.resourcemanager.model.v20200331.CreateControlPolicyResponse;
import com.aliyuncs.resourcemanager.model.v20200331.CreateControlPolicyResponse.ControlPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateControlPolicyResponseUnmarshaller {

	public static CreateControlPolicyResponse unmarshall(CreateControlPolicyResponse createControlPolicyResponse, UnmarshallerContext _ctx) {
		
		createControlPolicyResponse.setRequestId(_ctx.stringValue("CreateControlPolicyResponse.RequestId"));

		ControlPolicy controlPolicy = new ControlPolicy();
		controlPolicy.setUpdateDate(_ctx.stringValue("CreateControlPolicyResponse.ControlPolicy.UpdateDate"));
		controlPolicy.setDescription(_ctx.stringValue("CreateControlPolicyResponse.ControlPolicy.Description"));
		controlPolicy.setEffectScope(_ctx.stringValue("CreateControlPolicyResponse.ControlPolicy.EffectScope"));
		controlPolicy.setAttachmentCount(_ctx.stringValue("CreateControlPolicyResponse.ControlPolicy.AttachmentCount"));
		controlPolicy.setPolicyName(_ctx.stringValue("CreateControlPolicyResponse.ControlPolicy.PolicyName"));
		controlPolicy.setPolicyId(_ctx.stringValue("CreateControlPolicyResponse.ControlPolicy.PolicyId"));
		controlPolicy.setCreateDate(_ctx.stringValue("CreateControlPolicyResponse.ControlPolicy.CreateDate"));
		controlPolicy.setPolicyType(_ctx.stringValue("CreateControlPolicyResponse.ControlPolicy.PolicyType"));
		createControlPolicyResponse.setControlPolicy(controlPolicy);
	 
	 	return createControlPolicyResponse;
	}
}