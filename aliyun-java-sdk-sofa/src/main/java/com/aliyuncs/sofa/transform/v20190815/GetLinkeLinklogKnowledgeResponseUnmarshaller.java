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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogKnowledgeResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogKnowledgeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinklogKnowledgeResponseUnmarshaller {

	public static GetLinkeLinklogKnowledgeResponse unmarshall(GetLinkeLinklogKnowledgeResponse getLinkeLinklogKnowledgeResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinklogKnowledgeResponse.setRequestId(_ctx.stringValue("GetLinkeLinklogKnowledgeResponse.RequestId"));
		getLinkeLinklogKnowledgeResponse.setResultCode(_ctx.stringValue("GetLinkeLinklogKnowledgeResponse.ResultCode"));
		getLinkeLinklogKnowledgeResponse.setResultMessage(_ctx.stringValue("GetLinkeLinklogKnowledgeResponse.ResultMessage"));
		getLinkeLinklogKnowledgeResponse.setErrorMsg(_ctx.stringValue("GetLinkeLinklogKnowledgeResponse.ErrorMsg"));
		getLinkeLinklogKnowledgeResponse.setResponseContentRange(_ctx.stringValue("GetLinkeLinklogKnowledgeResponse.ResponseContentRange"));
		getLinkeLinklogKnowledgeResponse.setResponseContentType(_ctx.stringValue("GetLinkeLinklogKnowledgeResponse.ResponseContentType"));
		getLinkeLinklogKnowledgeResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinklogKnowledgeResponse.ResponseStatusCode"));
		getLinkeLinklogKnowledgeResponse.setSuccess(_ctx.booleanValue("GetLinkeLinklogKnowledgeResponse.Success"));

		Result result = new Result();
		result.setBegin(_ctx.longValue("GetLinkeLinklogKnowledgeResponse.Result.Begin"));
		result.setBeginMills(_ctx.longValue("GetLinkeLinklogKnowledgeResponse.Result.BeginMills"));
		result.setCurrentPage(_ctx.longValue("GetLinkeLinklogKnowledgeResponse.Result.CurrentPage"));
		result.setDescription(_ctx.stringValue("GetLinkeLinklogKnowledgeResponse.Result.Description"));
		result.setEnd(_ctx.longValue("GetLinkeLinklogKnowledgeResponse.Result.End"));
		result.setEndMills(_ctx.longValue("GetLinkeLinklogKnowledgeResponse.Result.EndMills"));
		result.setGmtCreate(_ctx.longValue("GetLinkeLinklogKnowledgeResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.longValue("GetLinkeLinklogKnowledgeResponse.Result.GmtModified"));
		result.setHookApi(_ctx.stringValue("GetLinkeLinklogKnowledgeResponse.Result.HookApi"));
		result.setId(_ctx.longValue("GetLinkeLinklogKnowledgeResponse.Result.Id"));
		result.setLinkUrl(_ctx.stringValue("GetLinkeLinklogKnowledgeResponse.Result.LinkUrl"));
		result.setName(_ctx.stringValue("GetLinkeLinklogKnowledgeResponse.Result.Name"));
		result.setPageSize(_ctx.longValue("GetLinkeLinklogKnowledgeResponse.Result.PageSize"));
		result.setPriority(_ctx.longValue("GetLinkeLinklogKnowledgeResponse.Result.Priority"));
		result.setPriorityType(_ctx.stringValue("GetLinkeLinklogKnowledgeResponse.Result.PriorityType"));
		result.setSolution(_ctx.stringValue("GetLinkeLinklogKnowledgeResponse.Result.Solution"));
		result.setSorter(_ctx.stringValue("GetLinkeLinklogKnowledgeResponse.Result.Sorter"));
		result.setStoreId(_ctx.longValue("GetLinkeLinklogKnowledgeResponse.Result.StoreId"));

		List<String> indications = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogKnowledgeResponse.Result.Indications.Length"); i++) {
			indications.add(_ctx.stringValue("GetLinkeLinklogKnowledgeResponse.Result.Indications["+ i +"]"));
		}
		result.setIndications(indications);

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogKnowledgeResponse.Result.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("GetLinkeLinklogKnowledgeResponse.Result.Tags["+ i +"]"));
		}
		result.setTags(tags);
		getLinkeLinklogKnowledgeResponse.setResult(result);
	 
	 	return getLinkeLinklogKnowledgeResponse;
	}
}