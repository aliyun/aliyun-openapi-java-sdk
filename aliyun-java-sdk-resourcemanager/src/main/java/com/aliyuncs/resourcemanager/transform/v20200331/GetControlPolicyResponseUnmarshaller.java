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

import com.aliyuncs.resourcemanager.model.v20200331.GetControlPolicyResponse;
import com.aliyuncs.resourcemanager.model.v20200331.GetControlPolicyResponse.ControlPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetControlPolicyResponseUnmarshaller {

	public static GetControlPolicyResponse unmarshall(GetControlPolicyResponse getControlPolicyResponse, UnmarshallerContext _ctx) {
		
		getControlPolicyResponse.setRequestId(_ctx.stringValue("GetControlPolicyResponse.RequestId"));

		ControlPolicy controlPolicy = new ControlPolicy();
		controlPolicy.setPolicyDocument(_ctx.stringValue("GetControlPolicyResponse.ControlPolicy.PolicyDocument"));
		controlPolicy.setUpdateDate(_ctx.stringValue("GetControlPolicyResponse.ControlPolicy.UpdateDate"));
		controlPolicy.setDescription(_ctx.stringValue("GetControlPolicyResponse.ControlPolicy.Description"));
		controlPolicy.setEffectScope(_ctx.stringValue("GetControlPolicyResponse.ControlPolicy.EffectScope"));
		controlPolicy.setAttachmentCount(_ctx.stringValue("GetControlPolicyResponse.ControlPolicy.AttachmentCount"));
		controlPolicy.setPolicyName(_ctx.stringValue("GetControlPolicyResponse.ControlPolicy.PolicyName"));
		controlPolicy.setPolicyId(_ctx.stringValue("GetControlPolicyResponse.ControlPolicy.PolicyId"));
		controlPolicy.setCreateDate(_ctx.stringValue("GetControlPolicyResponse.ControlPolicy.CreateDate"));
		controlPolicy.setPolicyType(_ctx.stringValue("GetControlPolicyResponse.ControlPolicy.PolicyType"));
		getControlPolicyResponse.setControlPolicy(controlPolicy);
	 
	 	return getControlPolicyResponse;
	}
}