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

import com.aliyuncs.ecsops.model.v20160401.OpsInputInstanceTypeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsInputInstanceTypeResponseUnmarshaller {

	public static OpsInputInstanceTypeResponse unmarshall(OpsInputInstanceTypeResponse opsInputInstanceTypeResponse, UnmarshallerContext _ctx) {
		
		opsInputInstanceTypeResponse.setRequestId(_ctx.stringValue("OpsInputInstanceTypeResponse.RequestId"));
		opsInputInstanceTypeResponse.setMessage(_ctx.stringValue("OpsInputInstanceTypeResponse.Message"));
		opsInputInstanceTypeResponse.setHttpStatusCode(_ctx.integerValue("OpsInputInstanceTypeResponse.HttpStatusCode"));
		opsInputInstanceTypeResponse.setCode(_ctx.stringValue("OpsInputInstanceTypeResponse.Code"));
		opsInputInstanceTypeResponse.setSuccess(_ctx.stringValue("OpsInputInstanceTypeResponse.Success"));
	 
	 	return opsInputInstanceTypeResponse;
	}
}