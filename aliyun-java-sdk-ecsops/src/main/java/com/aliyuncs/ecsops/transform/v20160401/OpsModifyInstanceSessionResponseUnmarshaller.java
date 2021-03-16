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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsModifyInstanceSessionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsModifyInstanceSessionResponseUnmarshaller {

	public static OpsModifyInstanceSessionResponse unmarshall(OpsModifyInstanceSessionResponse opsModifyInstanceSessionResponse, UnmarshallerContext _ctx) {
		
		opsModifyInstanceSessionResponse.setRequestId(_ctx.stringValue("OpsModifyInstanceSessionResponse.RequestId"));
		opsModifyInstanceSessionResponse.setCode(_ctx.stringValue("OpsModifyInstanceSessionResponse.Code"));
		opsModifyInstanceSessionResponse.setMessage(_ctx.stringValue("OpsModifyInstanceSessionResponse.Message"));
		opsModifyInstanceSessionResponse.setSuccess(_ctx.stringValue("OpsModifyInstanceSessionResponse.Success"));
	 
	 	return opsModifyInstanceSessionResponse;
	}
}