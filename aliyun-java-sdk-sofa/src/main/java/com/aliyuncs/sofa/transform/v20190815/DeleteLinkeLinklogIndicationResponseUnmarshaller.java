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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeLinklogIndicationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeLinklogIndicationResponseUnmarshaller {

	public static DeleteLinkeLinklogIndicationResponse unmarshall(DeleteLinkeLinklogIndicationResponse deleteLinkeLinklogIndicationResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeLinklogIndicationResponse.setRequestId(_ctx.stringValue("DeleteLinkeLinklogIndicationResponse.RequestId"));
		deleteLinkeLinklogIndicationResponse.setResultCode(_ctx.stringValue("DeleteLinkeLinklogIndicationResponse.ResultCode"));
		deleteLinkeLinklogIndicationResponse.setResultMessage(_ctx.stringValue("DeleteLinkeLinklogIndicationResponse.ResultMessage"));
		deleteLinkeLinklogIndicationResponse.setErrorMsg(_ctx.stringValue("DeleteLinkeLinklogIndicationResponse.ErrorMsg"));
		deleteLinkeLinklogIndicationResponse.setResponseContentRange(_ctx.stringValue("DeleteLinkeLinklogIndicationResponse.ResponseContentRange"));
		deleteLinkeLinklogIndicationResponse.setResponseContentType(_ctx.stringValue("DeleteLinkeLinklogIndicationResponse.ResponseContentType"));
		deleteLinkeLinklogIndicationResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeLinklogIndicationResponse.ResponseStatusCode"));
		deleteLinkeLinklogIndicationResponse.setResult(_ctx.stringValue("DeleteLinkeLinklogIndicationResponse.Result"));
		deleteLinkeLinklogIndicationResponse.setSuccess(_ctx.booleanValue("DeleteLinkeLinklogIndicationResponse.Success"));
	 
	 	return deleteLinkeLinklogIndicationResponse;
	}
}