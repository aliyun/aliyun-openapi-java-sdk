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

package com.aliyuncs.gts_phd.transform.v20200228;

import com.aliyuncs.gts_phd.model.v20200228.ConfirmApiMsgResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmApiMsgResponseUnmarshaller {

	public static ConfirmApiMsgResponse unmarshall(ConfirmApiMsgResponse confirmApiMsgResponse, UnmarshallerContext _ctx) {
		
		confirmApiMsgResponse.setRequestId(_ctx.stringValue("ConfirmApiMsgResponse.RequestId"));
		confirmApiMsgResponse.setSuccess(_ctx.booleanValue("ConfirmApiMsgResponse.Success"));
		confirmApiMsgResponse.setErrorMessage(_ctx.stringValue("ConfirmApiMsgResponse.ErrorMessage"));
		confirmApiMsgResponse.setErrorCode(_ctx.stringValue("ConfirmApiMsgResponse.ErrorCode"));
	 
	 	return confirmApiMsgResponse;
	}
}