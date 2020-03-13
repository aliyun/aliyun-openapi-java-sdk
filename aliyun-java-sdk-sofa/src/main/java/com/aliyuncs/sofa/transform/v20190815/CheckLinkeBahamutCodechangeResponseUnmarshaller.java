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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutCodechangeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutCodechangeResponseUnmarshaller {

	public static CheckLinkeBahamutCodechangeResponse unmarshall(CheckLinkeBahamutCodechangeResponse checkLinkeBahamutCodechangeResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutCodechangeResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutCodechangeResponse.RequestId"));
		checkLinkeBahamutCodechangeResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutCodechangeResponse.ResultCode"));
		checkLinkeBahamutCodechangeResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutCodechangeResponse.ResultMessage"));
		checkLinkeBahamutCodechangeResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutCodechangeResponse.ErrorMessage"));
		checkLinkeBahamutCodechangeResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutCodechangeResponse.Message"));
		checkLinkeBahamutCodechangeResponse.setResult(_ctx.booleanValue("CheckLinkeBahamutCodechangeResponse.Result"));
		checkLinkeBahamutCodechangeResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutCodechangeResponse.Success"));
	 
	 	return checkLinkeBahamutCodechangeResponse;
	}
}