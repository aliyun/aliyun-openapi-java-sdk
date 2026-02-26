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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.CreateLinkResponse;
import com.aliyuncs.mpaas.model.v20201028.CreateLinkResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkResponseUnmarshaller {

	public static CreateLinkResponse unmarshall(CreateLinkResponse createLinkResponse, UnmarshallerContext _ctx) {
		
		createLinkResponse.setRequestId(_ctx.stringValue("CreateLinkResponse.RequestId"));
		createLinkResponse.setResultMessage(_ctx.stringValue("CreateLinkResponse.ResultMessage"));
		createLinkResponse.setResultCode(_ctx.stringValue("CreateLinkResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setTarget(_ctx.stringValue("CreateLinkResponse.ResultContent.Target"));
		resultContent.setData(_ctx.stringValue("CreateLinkResponse.ResultContent.Data"));
		resultContent.setVersion(_ctx.stringValue("CreateLinkResponse.ResultContent.Version"));
		createLinkResponse.setResultContent(resultContent);
	 
	 	return createLinkResponse;
	}
}