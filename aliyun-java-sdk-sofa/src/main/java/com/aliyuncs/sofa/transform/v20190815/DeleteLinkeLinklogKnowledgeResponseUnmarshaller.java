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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeLinklogKnowledgeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeLinklogKnowledgeResponseUnmarshaller {

	public static DeleteLinkeLinklogKnowledgeResponse unmarshall(DeleteLinkeLinklogKnowledgeResponse deleteLinkeLinklogKnowledgeResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeLinklogKnowledgeResponse.setRequestId(_ctx.stringValue("DeleteLinkeLinklogKnowledgeResponse.RequestId"));
		deleteLinkeLinklogKnowledgeResponse.setResultCode(_ctx.stringValue("DeleteLinkeLinklogKnowledgeResponse.ResultCode"));
		deleteLinkeLinklogKnowledgeResponse.setResultMessage(_ctx.stringValue("DeleteLinkeLinklogKnowledgeResponse.ResultMessage"));
		deleteLinkeLinklogKnowledgeResponse.setErrorMsg(_ctx.stringValue("DeleteLinkeLinklogKnowledgeResponse.ErrorMsg"));
		deleteLinkeLinklogKnowledgeResponse.setResponseContentRange(_ctx.stringValue("DeleteLinkeLinklogKnowledgeResponse.ResponseContentRange"));
		deleteLinkeLinklogKnowledgeResponse.setResponseContentType(_ctx.stringValue("DeleteLinkeLinklogKnowledgeResponse.ResponseContentType"));
		deleteLinkeLinklogKnowledgeResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeLinklogKnowledgeResponse.ResponseStatusCode"));
		deleteLinkeLinklogKnowledgeResponse.setResult(_ctx.stringValue("DeleteLinkeLinklogKnowledgeResponse.Result"));
		deleteLinkeLinklogKnowledgeResponse.setSuccess(_ctx.booleanValue("DeleteLinkeLinklogKnowledgeResponse.Success"));
	 
	 	return deleteLinkeLinklogKnowledgeResponse;
	}
}