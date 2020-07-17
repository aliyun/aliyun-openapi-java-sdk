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

package com.aliyuncs.tdsr.transform.v20200101;

import com.aliyuncs.tdsr.model.v20200101.GetPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPolicyResponseUnmarshaller {

	public static GetPolicyResponse unmarshall(GetPolicyResponse getPolicyResponse, UnmarshallerContext _ctx) {
		
		getPolicyResponse.setRequestId(_ctx.stringValue("GetPolicyResponse.RequestId"));
		getPolicyResponse.setSuccess(_ctx.booleanValue("GetPolicyResponse.Success"));
		getPolicyResponse.setErrMessage(_ctx.stringValue("GetPolicyResponse.ErrMessage"));
		getPolicyResponse.setData(_ctx.stringValue("GetPolicyResponse.Data"));
	 
	 	return getPolicyResponse;
	}
}