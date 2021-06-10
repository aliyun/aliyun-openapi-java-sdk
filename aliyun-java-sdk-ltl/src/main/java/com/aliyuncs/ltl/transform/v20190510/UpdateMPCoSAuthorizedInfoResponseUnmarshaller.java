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

package com.aliyuncs.ltl.transform.v20190510;

import com.aliyuncs.ltl.model.v20190510.UpdateMPCoSAuthorizedInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMPCoSAuthorizedInfoResponseUnmarshaller {

	public static UpdateMPCoSAuthorizedInfoResponse unmarshall(UpdateMPCoSAuthorizedInfoResponse updateMPCoSAuthorizedInfoResponse, UnmarshallerContext _ctx) {
		
		updateMPCoSAuthorizedInfoResponse.setRequestId(_ctx.stringValue("UpdateMPCoSAuthorizedInfoResponse.RequestId"));
		updateMPCoSAuthorizedInfoResponse.setCode(_ctx.integerValue("UpdateMPCoSAuthorizedInfoResponse.Code"));
		updateMPCoSAuthorizedInfoResponse.setSuccess(_ctx.booleanValue("UpdateMPCoSAuthorizedInfoResponse.Success"));
		updateMPCoSAuthorizedInfoResponse.setMessage(_ctx.stringValue("UpdateMPCoSAuthorizedInfoResponse.Message"));
		updateMPCoSAuthorizedInfoResponse.setData(_ctx.stringValue("UpdateMPCoSAuthorizedInfoResponse.Data"));
	 
	 	return updateMPCoSAuthorizedInfoResponse;
	}
}