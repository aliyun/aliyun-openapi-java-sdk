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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinklogKnowledgefeedbackResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinklogKnowledgefeedbackResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinklogKnowledgefeedbackResponseUnmarshaller {

	public static ExecLinkeLinklogKnowledgefeedbackResponse unmarshall(ExecLinkeLinklogKnowledgefeedbackResponse execLinkeLinklogKnowledgefeedbackResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinklogKnowledgefeedbackResponse.setRequestId(_ctx.stringValue("ExecLinkeLinklogKnowledgefeedbackResponse.RequestId"));
		execLinkeLinklogKnowledgefeedbackResponse.setResultCode(_ctx.stringValue("ExecLinkeLinklogKnowledgefeedbackResponse.ResultCode"));
		execLinkeLinklogKnowledgefeedbackResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinklogKnowledgefeedbackResponse.ResultMessage"));
		execLinkeLinklogKnowledgefeedbackResponse.setErrorMsg(_ctx.stringValue("ExecLinkeLinklogKnowledgefeedbackResponse.ErrorMsg"));
		execLinkeLinklogKnowledgefeedbackResponse.setResponseContentRange(_ctx.stringValue("ExecLinkeLinklogKnowledgefeedbackResponse.ResponseContentRange"));
		execLinkeLinklogKnowledgefeedbackResponse.setResponseContentType(_ctx.stringValue("ExecLinkeLinklogKnowledgefeedbackResponse.ResponseContentType"));
		execLinkeLinklogKnowledgefeedbackResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeLinklogKnowledgefeedbackResponse.ResponseStatusCode"));
		execLinkeLinklogKnowledgefeedbackResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinklogKnowledgefeedbackResponse.Success"));

		Result result = new Result();
		result.setBegin(_ctx.longValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.Begin"));
		result.setBeginMills(_ctx.longValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.BeginMills"));
		result.setCurrentPage(_ctx.longValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.CurrentPage"));
		result.setEnd(_ctx.longValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.End"));
		result.setEndMills(_ctx.longValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.EndMills"));
		result.setFeedback(_ctx.stringValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.Feedback"));
		result.setGmtCreate(_ctx.longValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.longValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.GmtModified"));
		result.setId(_ctx.longValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.Id"));
		result.setIsOptions(_ctx.longValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.IsOptions"));
		result.setKnowledgeId(_ctx.longValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.KnowledgeId"));
		result.setLogId(_ctx.longValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.LogId"));
		result.setPageSize(_ctx.longValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.PageSize"));
		result.setResult(_ctx.longValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.Result"));
		result.setSorter(_ctx.stringValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.Sorter"));
		result.setStoreId(_ctx.longValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.StoreId"));

		List<Long> tagList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.TagList.Length"); i++) {
			tagList.add(_ctx.longValue("ExecLinkeLinklogKnowledgefeedbackResponse.Result.TagList["+ i +"]"));
		}
		result.setTagList(tagList);
		execLinkeLinklogKnowledgefeedbackResponse.setResult(result);
	 
	 	return execLinkeLinklogKnowledgefeedbackResponse;
	}
}