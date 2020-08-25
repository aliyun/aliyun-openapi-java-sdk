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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUnitdefaultenvidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutUnitdefaultenvidResponseUnmarshaller {

	public static GetLinkeBahamutUnitdefaultenvidResponse unmarshall(GetLinkeBahamutUnitdefaultenvidResponse getLinkeBahamutUnitdefaultenvidResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutUnitdefaultenvidResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutUnitdefaultenvidResponse.RequestId"));
		getLinkeBahamutUnitdefaultenvidResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutUnitdefaultenvidResponse.ResultCode"));
		getLinkeBahamutUnitdefaultenvidResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutUnitdefaultenvidResponse.ResultMessage"));
		getLinkeBahamutUnitdefaultenvidResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutUnitdefaultenvidResponse.ErrorMessage"));
		getLinkeBahamutUnitdefaultenvidResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutUnitdefaultenvidResponse.ErrorMsgParamsMap"));
		getLinkeBahamutUnitdefaultenvidResponse.setMessage(_ctx.stringValue("GetLinkeBahamutUnitdefaultenvidResponse.Message"));
		getLinkeBahamutUnitdefaultenvidResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutUnitdefaultenvidResponse.ResponseStatusCode"));
		getLinkeBahamutUnitdefaultenvidResponse.setResult(_ctx.stringValue("GetLinkeBahamutUnitdefaultenvidResponse.Result"));
		getLinkeBahamutUnitdefaultenvidResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutUnitdefaultenvidResponse.Success"));
	 
	 	return getLinkeBahamutUnitdefaultenvidResponse;
	}
}