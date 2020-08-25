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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktIterationmeetingResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktIterationmeetingResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktIterationmeetingResponseUnmarshaller {

	public static QueryLinkeLinktIterationmeetingResponse unmarshall(QueryLinkeLinktIterationmeetingResponse queryLinkeLinktIterationmeetingResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktIterationmeetingResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktIterationmeetingResponse.RequestId"));
		queryLinkeLinktIterationmeetingResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktIterationmeetingResponse.ResultCode"));
		queryLinkeLinktIterationmeetingResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktIterationmeetingResponse.ResultMessage"));
		queryLinkeLinktIterationmeetingResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktIterationmeetingResponse.ErrorCode"));
		queryLinkeLinktIterationmeetingResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktIterationmeetingResponse.ErrorMessage"));
		queryLinkeLinktIterationmeetingResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktIterationmeetingResponse.ResponseStatusCode"));
		queryLinkeLinktIterationmeetingResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktIterationmeetingResponse.Success"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("QueryLinkeLinktIterationmeetingResponse.Data.Content"));
		data.setCreatedAt(_ctx.longValue("QueryLinkeLinktIterationmeetingResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("QueryLinkeLinktIterationmeetingResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("QueryLinkeLinktIterationmeetingResponse.Data.Deleted"));
		data.setId(_ctx.longValue("QueryLinkeLinktIterationmeetingResponse.Data.Id"));
		data.setIterationSign(_ctx.stringValue("QueryLinkeLinktIterationmeetingResponse.Data.IterationSign"));
		data.setModifier(_ctx.stringValue("QueryLinkeLinktIterationmeetingResponse.Data.Modifier"));
		data.setTitle(_ctx.stringValue("QueryLinkeLinktIterationmeetingResponse.Data.Title"));
		data.setUpdatedAt(_ctx.longValue("QueryLinkeLinktIterationmeetingResponse.Data.UpdatedAt"));

		List<String> attachments = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktIterationmeetingResponse.Data.Attachments.Length"); i++) {
			attachments.add(_ctx.stringValue("QueryLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"]"));
		}
		data.setAttachments(attachments);
		queryLinkeLinktIterationmeetingResponse.setData(data);
	 
	 	return queryLinkeLinktIterationmeetingResponse;
	}
}