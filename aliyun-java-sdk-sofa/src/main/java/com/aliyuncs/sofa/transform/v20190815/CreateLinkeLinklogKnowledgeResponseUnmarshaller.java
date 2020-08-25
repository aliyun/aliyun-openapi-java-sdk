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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinklogKnowledgeResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinklogKnowledgeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinklogKnowledgeResponseUnmarshaller {

	public static CreateLinkeLinklogKnowledgeResponse unmarshall(CreateLinkeLinklogKnowledgeResponse createLinkeLinklogKnowledgeResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinklogKnowledgeResponse.setRequestId(_ctx.stringValue("CreateLinkeLinklogKnowledgeResponse.RequestId"));
		createLinkeLinklogKnowledgeResponse.setResultCode(_ctx.stringValue("CreateLinkeLinklogKnowledgeResponse.ResultCode"));
		createLinkeLinklogKnowledgeResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinklogKnowledgeResponse.ResultMessage"));
		createLinkeLinklogKnowledgeResponse.setErrorMsg(_ctx.stringValue("CreateLinkeLinklogKnowledgeResponse.ErrorMsg"));
		createLinkeLinklogKnowledgeResponse.setResponseContentRange(_ctx.stringValue("CreateLinkeLinklogKnowledgeResponse.ResponseContentRange"));
		createLinkeLinklogKnowledgeResponse.setResponseContentType(_ctx.stringValue("CreateLinkeLinklogKnowledgeResponse.ResponseContentType"));
		createLinkeLinklogKnowledgeResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeLinklogKnowledgeResponse.ResponseStatusCode"));
		createLinkeLinklogKnowledgeResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinklogKnowledgeResponse.Success"));

		Result result = new Result();
		result.setBegin(_ctx.longValue("CreateLinkeLinklogKnowledgeResponse.Result.Begin"));
		result.setBeginMills(_ctx.longValue("CreateLinkeLinklogKnowledgeResponse.Result.BeginMills"));
		result.setCurrentPage(_ctx.longValue("CreateLinkeLinklogKnowledgeResponse.Result.CurrentPage"));
		result.setDescription(_ctx.stringValue("CreateLinkeLinklogKnowledgeResponse.Result.Description"));
		result.setEnd(_ctx.longValue("CreateLinkeLinklogKnowledgeResponse.Result.End"));
		result.setEndMills(_ctx.longValue("CreateLinkeLinklogKnowledgeResponse.Result.EndMills"));
		result.setGmtCreate(_ctx.longValue("CreateLinkeLinklogKnowledgeResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.longValue("CreateLinkeLinklogKnowledgeResponse.Result.GmtModified"));
		result.setHookApi(_ctx.stringValue("CreateLinkeLinklogKnowledgeResponse.Result.HookApi"));
		result.setId(_ctx.longValue("CreateLinkeLinklogKnowledgeResponse.Result.Id"));
		result.setLinkUrl(_ctx.stringValue("CreateLinkeLinklogKnowledgeResponse.Result.LinkUrl"));
		result.setName(_ctx.stringValue("CreateLinkeLinklogKnowledgeResponse.Result.Name"));
		result.setPageSize(_ctx.longValue("CreateLinkeLinklogKnowledgeResponse.Result.PageSize"));
		result.setPriority(_ctx.longValue("CreateLinkeLinklogKnowledgeResponse.Result.Priority"));
		result.setPriorityType(_ctx.stringValue("CreateLinkeLinklogKnowledgeResponse.Result.PriorityType"));
		result.setSolution(_ctx.stringValue("CreateLinkeLinklogKnowledgeResponse.Result.Solution"));
		result.setSorter(_ctx.stringValue("CreateLinkeLinklogKnowledgeResponse.Result.Sorter"));
		result.setStoreId(_ctx.longValue("CreateLinkeLinklogKnowledgeResponse.Result.StoreId"));

		List<String> indications = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinklogKnowledgeResponse.Result.Indications.Length"); i++) {
			indications.add(_ctx.stringValue("CreateLinkeLinklogKnowledgeResponse.Result.Indications["+ i +"]"));
		}
		result.setIndications(indications);

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinklogKnowledgeResponse.Result.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("CreateLinkeLinklogKnowledgeResponse.Result.Tags["+ i +"]"));
		}
		result.setTags(tags);
		createLinkeLinklogKnowledgeResponse.setResult(result);
	 
	 	return createLinkeLinklogKnowledgeResponse;
	}
}