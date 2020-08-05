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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.UpdateAppSecurityGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAppSecurityGroupResponseUnmarshaller {

	public static UpdateAppSecurityGroupResponse unmarshall(UpdateAppSecurityGroupResponse updateAppSecurityGroupResponse, UnmarshallerContext _ctx) {
		
		updateAppSecurityGroupResponse.setRequestId(_ctx.stringValue("UpdateAppSecurityGroupResponse.RequestId"));
		updateAppSecurityGroupResponse.setCode(_ctx.stringValue("UpdateAppSecurityGroupResponse.Code"));
		updateAppSecurityGroupResponse.setMessage(_ctx.stringValue("UpdateAppSecurityGroupResponse.Message"));
		updateAppSecurityGroupResponse.setErrorCode(_ctx.stringValue("UpdateAppSecurityGroupResponse.ErrorCode"));
		updateAppSecurityGroupResponse.setTraceId(_ctx.stringValue("UpdateAppSecurityGroupResponse.TraceId"));
		updateAppSecurityGroupResponse.setSuccess(_ctx.booleanValue("UpdateAppSecurityGroupResponse.Success"));
	 
	 	return updateAppSecurityGroupResponse;
	}
}