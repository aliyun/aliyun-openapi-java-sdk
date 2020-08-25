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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutAppcreateorimporttaskabortResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutAppcreateorimporttaskabortResponseUnmarshaller {

	public static CreateLinkeBahamutAppcreateorimporttaskabortResponse unmarshall(CreateLinkeBahamutAppcreateorimporttaskabortResponse createLinkeBahamutAppcreateorimporttaskabortResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutAppcreateorimporttaskabortResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutAppcreateorimporttaskabortResponse.RequestId"));
		createLinkeBahamutAppcreateorimporttaskabortResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutAppcreateorimporttaskabortResponse.ResultCode"));
		createLinkeBahamutAppcreateorimporttaskabortResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutAppcreateorimporttaskabortResponse.ResultMessage"));
		createLinkeBahamutAppcreateorimporttaskabortResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutAppcreateorimporttaskabortResponse.ErrorMessage"));
		createLinkeBahamutAppcreateorimporttaskabortResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutAppcreateorimporttaskabortResponse.ErrorMsgParamsMap"));
		createLinkeBahamutAppcreateorimporttaskabortResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutAppcreateorimporttaskabortResponse.Message"));
		createLinkeBahamutAppcreateorimporttaskabortResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutAppcreateorimporttaskabortResponse.ResponseStatusCode"));
		createLinkeBahamutAppcreateorimporttaskabortResponse.setResult(_ctx.booleanValue("CreateLinkeBahamutAppcreateorimporttaskabortResponse.Result"));
		createLinkeBahamutAppcreateorimporttaskabortResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutAppcreateorimporttaskabortResponse.Success"));
	 
	 	return createLinkeBahamutAppcreateorimporttaskabortResponse;
	}
}