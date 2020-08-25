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

import com.aliyuncs.sofa.model.v20190815.AddLinkeLinklogTagResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeLinklogTagResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeLinklogTagResponseUnmarshaller {

	public static AddLinkeLinklogTagResponse unmarshall(AddLinkeLinklogTagResponse addLinkeLinklogTagResponse, UnmarshallerContext _ctx) {
		
		addLinkeLinklogTagResponse.setRequestId(_ctx.stringValue("AddLinkeLinklogTagResponse.RequestId"));
		addLinkeLinklogTagResponse.setResultCode(_ctx.stringValue("AddLinkeLinklogTagResponse.ResultCode"));
		addLinkeLinklogTagResponse.setResultMessage(_ctx.stringValue("AddLinkeLinklogTagResponse.ResultMessage"));
		addLinkeLinklogTagResponse.setErrorMsg(_ctx.stringValue("AddLinkeLinklogTagResponse.ErrorMsg"));
		addLinkeLinklogTagResponse.setResponseContentRange(_ctx.stringValue("AddLinkeLinklogTagResponse.ResponseContentRange"));
		addLinkeLinklogTagResponse.setResponseContentType(_ctx.stringValue("AddLinkeLinklogTagResponse.ResponseContentType"));
		addLinkeLinklogTagResponse.setResponseStatusCode(_ctx.longValue("AddLinkeLinklogTagResponse.ResponseStatusCode"));
		addLinkeLinklogTagResponse.setSuccess(_ctx.booleanValue("AddLinkeLinklogTagResponse.Success"));

		Result result = new Result();
		result.setKnowledgeId(_ctx.longValue("AddLinkeLinklogTagResponse.Result.KnowledgeId"));
		result.setName(_ctx.stringValue("AddLinkeLinklogTagResponse.Result.Name"));
		result.setRelationId(_ctx.longValue("AddLinkeLinklogTagResponse.Result.RelationId"));
		result.setTagId(_ctx.longValue("AddLinkeLinklogTagResponse.Result.TagId"));
		addLinkeLinklogTagResponse.setResult(result);
	 
	 	return addLinkeLinklogTagResponse;
	}
}