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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeLinklogRegexResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeLinklogRegexResponseUnmarshaller {

	public static CheckLinkeLinklogRegexResponse unmarshall(CheckLinkeLinklogRegexResponse checkLinkeLinklogRegexResponse, UnmarshallerContext _ctx) {
		
		checkLinkeLinklogRegexResponse.setRequestId(_ctx.stringValue("CheckLinkeLinklogRegexResponse.RequestId"));
		checkLinkeLinklogRegexResponse.setResultCode(_ctx.stringValue("CheckLinkeLinklogRegexResponse.ResultCode"));
		checkLinkeLinklogRegexResponse.setResultMessage(_ctx.stringValue("CheckLinkeLinklogRegexResponse.ResultMessage"));
		checkLinkeLinklogRegexResponse.setErrorMsg(_ctx.stringValue("CheckLinkeLinklogRegexResponse.ErrorMsg"));
		checkLinkeLinklogRegexResponse.setResponseContentRange(_ctx.stringValue("CheckLinkeLinklogRegexResponse.ResponseContentRange"));
		checkLinkeLinklogRegexResponse.setResponseContentType(_ctx.stringValue("CheckLinkeLinklogRegexResponse.ResponseContentType"));
		checkLinkeLinklogRegexResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeLinklogRegexResponse.ResponseStatusCode"));
		checkLinkeLinklogRegexResponse.setResult(_ctx.stringValue("CheckLinkeLinklogRegexResponse.Result"));
		checkLinkeLinklogRegexResponse.setSuccess(_ctx.booleanValue("CheckLinkeLinklogRegexResponse.Success"));
	 
	 	return checkLinkeLinklogRegexResponse;
	}
}