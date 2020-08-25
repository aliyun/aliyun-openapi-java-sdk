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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutAppcreateorimporttaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutAppcreateorimporttaskResponseUnmarshaller {

	public static CreateLinkeBahamutAppcreateorimporttaskResponse unmarshall(CreateLinkeBahamutAppcreateorimporttaskResponse createLinkeBahamutAppcreateorimporttaskResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutAppcreateorimporttaskResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutAppcreateorimporttaskResponse.RequestId"));
		createLinkeBahamutAppcreateorimporttaskResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutAppcreateorimporttaskResponse.ResultCode"));
		createLinkeBahamutAppcreateorimporttaskResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutAppcreateorimporttaskResponse.ResultMessage"));
		createLinkeBahamutAppcreateorimporttaskResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutAppcreateorimporttaskResponse.ErrorMessage"));
		createLinkeBahamutAppcreateorimporttaskResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutAppcreateorimporttaskResponse.ErrorMsgParamsMap"));
		createLinkeBahamutAppcreateorimporttaskResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutAppcreateorimporttaskResponse.Message"));
		createLinkeBahamutAppcreateorimporttaskResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutAppcreateorimporttaskResponse.ResponseStatusCode"));
		createLinkeBahamutAppcreateorimporttaskResponse.setResult(_ctx.booleanValue("CreateLinkeBahamutAppcreateorimporttaskResponse.Result"));
		createLinkeBahamutAppcreateorimporttaskResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutAppcreateorimporttaskResponse.Success"));
	 
	 	return createLinkeBahamutAppcreateorimporttaskResponse;
	}
}