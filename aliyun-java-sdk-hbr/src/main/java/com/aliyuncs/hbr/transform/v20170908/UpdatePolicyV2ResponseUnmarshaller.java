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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.UpdatePolicyV2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePolicyV2ResponseUnmarshaller {

	public static UpdatePolicyV2Response unmarshall(UpdatePolicyV2Response updatePolicyV2Response, UnmarshallerContext _ctx) {
		
		updatePolicyV2Response.setRequestId(_ctx.stringValue("UpdatePolicyV2Response.RequestId"));
		updatePolicyV2Response.setSuccess(_ctx.booleanValue("UpdatePolicyV2Response.Success"));
		updatePolicyV2Response.setCode(_ctx.stringValue("UpdatePolicyV2Response.Code"));
		updatePolicyV2Response.setMessage(_ctx.stringValue("UpdatePolicyV2Response.Message"));
	 
	 	return updatePolicyV2Response;
	}
}