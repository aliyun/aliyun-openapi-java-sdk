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

package com.aliyuncs.baas.transform.v20181221;

import com.aliyuncs.baas.model.v20181221.ConfirmFabricConsortiumMemberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmFabricConsortiumMemberResponseUnmarshaller {

	public static ConfirmFabricConsortiumMemberResponse unmarshall(ConfirmFabricConsortiumMemberResponse confirmFabricConsortiumMemberResponse, UnmarshallerContext _ctx) {
		
		confirmFabricConsortiumMemberResponse.setRequestId(_ctx.stringValue("ConfirmFabricConsortiumMemberResponse.RequestId"));
		confirmFabricConsortiumMemberResponse.setSuccess(_ctx.booleanValue("ConfirmFabricConsortiumMemberResponse.Success"));
		confirmFabricConsortiumMemberResponse.setErrorCode(_ctx.integerValue("ConfirmFabricConsortiumMemberResponse.ErrorCode"));
		confirmFabricConsortiumMemberResponse.setResult(_ctx.booleanValue("ConfirmFabricConsortiumMemberResponse.Result"));
	 
	 	return confirmFabricConsortiumMemberResponse;
	}
}