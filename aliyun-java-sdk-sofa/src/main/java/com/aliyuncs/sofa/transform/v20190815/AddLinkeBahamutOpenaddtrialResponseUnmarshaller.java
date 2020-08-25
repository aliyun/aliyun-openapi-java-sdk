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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutOpenaddtrialResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutOpenaddtrialResponseUnmarshaller {

	public static AddLinkeBahamutOpenaddtrialResponse unmarshall(AddLinkeBahamutOpenaddtrialResponse addLinkeBahamutOpenaddtrialResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutOpenaddtrialResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutOpenaddtrialResponse.RequestId"));
		addLinkeBahamutOpenaddtrialResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutOpenaddtrialResponse.ResultCode"));
		addLinkeBahamutOpenaddtrialResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutOpenaddtrialResponse.ResultMessage"));
		addLinkeBahamutOpenaddtrialResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutOpenaddtrialResponse.ErrorMessage"));
		addLinkeBahamutOpenaddtrialResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutOpenaddtrialResponse.ErrorMsgParamsMap"));
		addLinkeBahamutOpenaddtrialResponse.setMessage(_ctx.stringValue("AddLinkeBahamutOpenaddtrialResponse.Message"));
		addLinkeBahamutOpenaddtrialResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutOpenaddtrialResponse.ResponseStatusCode"));
		addLinkeBahamutOpenaddtrialResponse.setResult(_ctx.booleanValue("AddLinkeBahamutOpenaddtrialResponse.Result"));
		addLinkeBahamutOpenaddtrialResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutOpenaddtrialResponse.Success"));
	 
	 	return addLinkeBahamutOpenaddtrialResponse;
	}
}