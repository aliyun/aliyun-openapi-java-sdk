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

import com.aliyuncs.resourcemanager.model.v20200331.UpdateControlPolicyResponse;
import com.aliyuncs.resourcemanager.model.v20200331.UpdateControlPolicyResponse.ControlPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateControlPolicyResponseUnmarshaller {

	public static UpdateControlPolicyResponse unmarshall(UpdateControlPolicyResponse updateControlPolicyResponse, UnmarshallerContext _ctx) {
		
		updateControlPolicyResponse.setRequestId(_ctx.stringValue("UpdateControlPolicyResponse.RequestId"));

		ControlPolicy controlPolicy = new ControlPolicy();
		controlPolicy.setUpdateDate(_ctx.stringValue("UpdateControlPolicyResponse.ControlPolicy.UpdateDate"));
		controlPolicy.setDescription(_ctx.stringValue("UpdateControlPolicyResponse.ControlPolicy.Description"));
		controlPolicy.setEffectScope(_ctx.stringValue("UpdateControlPolicyResponse.ControlPolicy.EffectScope"));
		controlPolicy.setAttachmentCount(_ctx.stringValue("UpdateControlPolicyResponse.ControlPolicy.AttachmentCount"));
		controlPolicy.setPolicyName(_ctx.stringValue("UpdateControlPolicyResponse.ControlPolicy.PolicyName"));
		controlPolicy.setPolicyId(_ctx.stringValue("UpdateControlPolicyResponse.ControlPolicy.PolicyId"));
		controlPolicy.setCreateDate(_ctx.stringValue("UpdateControlPolicyResponse.ControlPolicy.CreateDate"));
		controlPolicy.setPolicyType(_ctx.stringValue("UpdateControlPolicyResponse.ControlPolicy.PolicyType"));
		updateControlPolicyResponse.setControlPolicy(controlPolicy);
	 
	 	return updateControlPolicyResponse;
	}
}