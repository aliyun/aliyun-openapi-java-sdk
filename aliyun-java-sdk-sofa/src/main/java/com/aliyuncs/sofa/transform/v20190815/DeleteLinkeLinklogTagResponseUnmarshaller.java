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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeLinklogTagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeLinklogTagResponseUnmarshaller {

	public static DeleteLinkeLinklogTagResponse unmarshall(DeleteLinkeLinklogTagResponse deleteLinkeLinklogTagResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeLinklogTagResponse.setRequestId(_ctx.stringValue("DeleteLinkeLinklogTagResponse.RequestId"));
		deleteLinkeLinklogTagResponse.setResultCode(_ctx.stringValue("DeleteLinkeLinklogTagResponse.ResultCode"));
		deleteLinkeLinklogTagResponse.setResultMessage(_ctx.stringValue("DeleteLinkeLinklogTagResponse.ResultMessage"));
		deleteLinkeLinklogTagResponse.setErrorMsg(_ctx.stringValue("DeleteLinkeLinklogTagResponse.ErrorMsg"));
		deleteLinkeLinklogTagResponse.setResponseContentRange(_ctx.stringValue("DeleteLinkeLinklogTagResponse.ResponseContentRange"));
		deleteLinkeLinklogTagResponse.setResponseContentType(_ctx.stringValue("DeleteLinkeLinklogTagResponse.ResponseContentType"));
		deleteLinkeLinklogTagResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeLinklogTagResponse.ResponseStatusCode"));
		deleteLinkeLinklogTagResponse.setResult(_ctx.stringValue("DeleteLinkeLinklogTagResponse.Result"));
		deleteLinkeLinklogTagResponse.setSuccess(_ctx.booleanValue("DeleteLinkeLinklogTagResponse.Success"));
	 
	 	return deleteLinkeLinklogTagResponse;
	}
}