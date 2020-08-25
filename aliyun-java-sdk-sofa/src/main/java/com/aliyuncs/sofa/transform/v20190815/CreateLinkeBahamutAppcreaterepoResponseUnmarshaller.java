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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutAppcreaterepoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutAppcreaterepoResponseUnmarshaller {

	public static CreateLinkeBahamutAppcreaterepoResponse unmarshall(CreateLinkeBahamutAppcreaterepoResponse createLinkeBahamutAppcreaterepoResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutAppcreaterepoResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutAppcreaterepoResponse.RequestId"));
		createLinkeBahamutAppcreaterepoResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutAppcreaterepoResponse.ResultCode"));
		createLinkeBahamutAppcreaterepoResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutAppcreaterepoResponse.ResultMessage"));
		createLinkeBahamutAppcreaterepoResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutAppcreaterepoResponse.ErrorMessage"));
		createLinkeBahamutAppcreaterepoResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutAppcreaterepoResponse.ErrorMsgParamsMap"));
		createLinkeBahamutAppcreaterepoResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutAppcreaterepoResponse.Message"));
		createLinkeBahamutAppcreaterepoResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutAppcreaterepoResponse.ResponseStatusCode"));
		createLinkeBahamutAppcreaterepoResponse.setResult(_ctx.stringValue("CreateLinkeBahamutAppcreaterepoResponse.Result"));
		createLinkeBahamutAppcreaterepoResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutAppcreaterepoResponse.Success"));
	 
	 	return createLinkeBahamutAppcreaterepoResponse;
	}
}