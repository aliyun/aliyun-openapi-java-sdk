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

import com.aliyuncs.hbr.model.v20170908.DeletePolicyV2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeletePolicyV2ResponseUnmarshaller {

	public static DeletePolicyV2Response unmarshall(DeletePolicyV2Response deletePolicyV2Response, UnmarshallerContext _ctx) {
		
		deletePolicyV2Response.setRequestId(_ctx.stringValue("DeletePolicyV2Response.RequestId"));
		deletePolicyV2Response.setSuccess(_ctx.booleanValue("DeletePolicyV2Response.Success"));
		deletePolicyV2Response.setCode(_ctx.stringValue("DeletePolicyV2Response.Code"));
		deletePolicyV2Response.setMessage(_ctx.stringValue("DeletePolicyV2Response.Message"));
	 
	 	return deletePolicyV2Response;
	}
}