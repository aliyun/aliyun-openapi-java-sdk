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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.UpdateLinkedeploycoreDeploycoreProfileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkedeploycoreDeploycoreProfileResponseUnmarshaller {

	public static UpdateLinkedeploycoreDeploycoreProfileResponse unmarshall(UpdateLinkedeploycoreDeploycoreProfileResponse updateLinkedeploycoreDeploycoreProfileResponse, UnmarshallerContext _ctx) {
		
		updateLinkedeploycoreDeploycoreProfileResponse.setRequestId(_ctx.stringValue("UpdateLinkedeploycoreDeploycoreProfileResponse.RequestId"));
		updateLinkedeploycoreDeploycoreProfileResponse.setResultCode(_ctx.stringValue("UpdateLinkedeploycoreDeploycoreProfileResponse.ResultCode"));
		updateLinkedeploycoreDeploycoreProfileResponse.setResultMessage(_ctx.stringValue("UpdateLinkedeploycoreDeploycoreProfileResponse.ResultMessage"));
		updateLinkedeploycoreDeploycoreProfileResponse.setData(_ctx.booleanValue("UpdateLinkedeploycoreDeploycoreProfileResponse.Data"));
		updateLinkedeploycoreDeploycoreProfileResponse.setMessage(_ctx.stringValue("UpdateLinkedeploycoreDeploycoreProfileResponse.Message"));
		updateLinkedeploycoreDeploycoreProfileResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkedeploycoreDeploycoreProfileResponse.ResponseStatusCode"));
		updateLinkedeploycoreDeploycoreProfileResponse.setSuccess(_ctx.booleanValue("UpdateLinkedeploycoreDeploycoreProfileResponse.Success"));
	 
	 	return updateLinkedeploycoreDeploycoreProfileResponse;
	}
}