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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinklogKnowledgeResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinklogKnowledgeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinklogKnowledgeResponseUnmarshaller {

	public static UpdateLinkeLinklogKnowledgeResponse unmarshall(UpdateLinkeLinklogKnowledgeResponse updateLinkeLinklogKnowledgeResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinklogKnowledgeResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinklogKnowledgeResponse.RequestId"));
		updateLinkeLinklogKnowledgeResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinklogKnowledgeResponse.ResultCode"));
		updateLinkeLinklogKnowledgeResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinklogKnowledgeResponse.ResultMessage"));
		updateLinkeLinklogKnowledgeResponse.setErrorMsg(_ctx.stringValue("UpdateLinkeLinklogKnowledgeResponse.ErrorMsg"));
		updateLinkeLinklogKnowledgeResponse.setResponseContentRange(_ctx.stringValue("UpdateLinkeLinklogKnowledgeResponse.ResponseContentRange"));
		updateLinkeLinklogKnowledgeResponse.setResponseContentType(_ctx.stringValue("UpdateLinkeLinklogKnowledgeResponse.ResponseContentType"));
		updateLinkeLinklogKnowledgeResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinklogKnowledgeResponse.ResponseStatusCode"));
		updateLinkeLinklogKnowledgeResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinklogKnowledgeResponse.Success"));

		Result result = new Result();
		result.setBegin(_ctx.longValue("UpdateLinkeLinklogKnowledgeResponse.Result.Begin"));
		result.setBeginMills(_ctx.longValue("UpdateLinkeLinklogKnowledgeResponse.Result.BeginMills"));
		result.setCurrentPage(_ctx.longValue("UpdateLinkeLinklogKnowledgeResponse.Result.CurrentPage"));
		result.setDescription(_ctx.stringValue("UpdateLinkeLinklogKnowledgeResponse.Result.Description"));
		result.setEnd(_ctx.longValue("UpdateLinkeLinklogKnowledgeResponse.Result.End"));
		result.setEndMills(_ctx.longValue("UpdateLinkeLinklogKnowledgeResponse.Result.EndMills"));
		result.setGmtCreate(_ctx.longValue("UpdateLinkeLinklogKnowledgeResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.longValue("UpdateLinkeLinklogKnowledgeResponse.Result.GmtModified"));
		result.setHookApi(_ctx.stringValue("UpdateLinkeLinklogKnowledgeResponse.Result.HookApi"));
		result.setId(_ctx.longValue("UpdateLinkeLinklogKnowledgeResponse.Result.Id"));
		result.setLinkUrl(_ctx.stringValue("UpdateLinkeLinklogKnowledgeResponse.Result.LinkUrl"));
		result.setName(_ctx.stringValue("UpdateLinkeLinklogKnowledgeResponse.Result.Name"));
		result.setPageSize(_ctx.longValue("UpdateLinkeLinklogKnowledgeResponse.Result.PageSize"));
		result.setPriority(_ctx.longValue("UpdateLinkeLinklogKnowledgeResponse.Result.Priority"));
		result.setPriorityType(_ctx.stringValue("UpdateLinkeLinklogKnowledgeResponse.Result.PriorityType"));
		result.setSolution(_ctx.stringValue("UpdateLinkeLinklogKnowledgeResponse.Result.Solution"));
		result.setSorter(_ctx.stringValue("UpdateLinkeLinklogKnowledgeResponse.Result.Sorter"));
		result.setStoreId(_ctx.longValue("UpdateLinkeLinklogKnowledgeResponse.Result.StoreId"));

		List<String> indications = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinklogKnowledgeResponse.Result.Indications.Length"); i++) {
			indications.add(_ctx.stringValue("UpdateLinkeLinklogKnowledgeResponse.Result.Indications["+ i +"]"));
		}
		result.setIndications(indications);

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinklogKnowledgeResponse.Result.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("UpdateLinkeLinklogKnowledgeResponse.Result.Tags["+ i +"]"));
		}
		result.setTags(tags);
		updateLinkeLinklogKnowledgeResponse.setResult(result);
	 
	 	return updateLinkeLinklogKnowledgeResponse;
	}
}