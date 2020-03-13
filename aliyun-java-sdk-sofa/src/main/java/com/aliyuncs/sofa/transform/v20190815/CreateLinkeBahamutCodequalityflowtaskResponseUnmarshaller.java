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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutCodequalityflowtaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutCodequalityflowtaskResponseUnmarshaller {

	public static CreateLinkeBahamutCodequalityflowtaskResponse unmarshall(CreateLinkeBahamutCodequalityflowtaskResponse createLinkeBahamutCodequalityflowtaskResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutCodequalityflowtaskResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutCodequalityflowtaskResponse.RequestId"));
		createLinkeBahamutCodequalityflowtaskResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutCodequalityflowtaskResponse.ResultCode"));
		createLinkeBahamutCodequalityflowtaskResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutCodequalityflowtaskResponse.ResultMessage"));
		createLinkeBahamutCodequalityflowtaskResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutCodequalityflowtaskResponse.ErrorMessage"));
		createLinkeBahamutCodequalityflowtaskResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutCodequalityflowtaskResponse.Message"));
		createLinkeBahamutCodequalityflowtaskResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutCodequalityflowtaskResponse.Success"));
	 
	 	return createLinkeBahamutCodequalityflowtaskResponse;
	}
}