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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutStageflowtaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutStageflowtaskResponseUnmarshaller {

	public static CreateLinkeBahamutStageflowtaskResponse unmarshall(CreateLinkeBahamutStageflowtaskResponse createLinkeBahamutStageflowtaskResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutStageflowtaskResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutStageflowtaskResponse.RequestId"));
		createLinkeBahamutStageflowtaskResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutStageflowtaskResponse.ResultCode"));
		createLinkeBahamutStageflowtaskResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutStageflowtaskResponse.ResultMessage"));
		createLinkeBahamutStageflowtaskResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutStageflowtaskResponse.ErrorMessage"));
		createLinkeBahamutStageflowtaskResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutStageflowtaskResponse.Message"));
		createLinkeBahamutStageflowtaskResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutStageflowtaskResponse.Success"));
	 
	 	return createLinkeBahamutStageflowtaskResponse;
	}
}