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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinklogAccessResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinklogAccessResponseUnmarshaller {

	public static CreateLinkeLinklogAccessResponse unmarshall(CreateLinkeLinklogAccessResponse createLinkeLinklogAccessResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinklogAccessResponse.setRequestId(_ctx.stringValue("CreateLinkeLinklogAccessResponse.RequestId"));
		createLinkeLinklogAccessResponse.setResultCode(_ctx.stringValue("CreateLinkeLinklogAccessResponse.ResultCode"));
		createLinkeLinklogAccessResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinklogAccessResponse.ResultMessage"));
		createLinkeLinklogAccessResponse.setResponseContentRange(_ctx.stringValue("CreateLinkeLinklogAccessResponse.ResponseContentRange"));
		createLinkeLinklogAccessResponse.setResponseContentType(_ctx.stringValue("CreateLinkeLinklogAccessResponse.ResponseContentType"));
		createLinkeLinklogAccessResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeLinklogAccessResponse.ResponseStatusCode"));
	 
	 	return createLinkeLinklogAccessResponse;
	}
}