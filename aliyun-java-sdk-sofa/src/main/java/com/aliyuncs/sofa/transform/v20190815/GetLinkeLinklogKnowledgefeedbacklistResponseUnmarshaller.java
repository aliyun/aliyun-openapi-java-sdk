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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogKnowledgefeedbacklistResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogKnowledgefeedbacklistResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinklogKnowledgefeedbacklistResponseUnmarshaller {

	public static GetLinkeLinklogKnowledgefeedbacklistResponse unmarshall(GetLinkeLinklogKnowledgefeedbacklistResponse getLinkeLinklogKnowledgefeedbacklistResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinklogKnowledgefeedbacklistResponse.setRequestId(_ctx.stringValue("GetLinkeLinklogKnowledgefeedbacklistResponse.RequestId"));
		getLinkeLinklogKnowledgefeedbacklistResponse.setResultCode(_ctx.stringValue("GetLinkeLinklogKnowledgefeedbacklistResponse.ResultCode"));
		getLinkeLinklogKnowledgefeedbacklistResponse.setResultMessage(_ctx.stringValue("GetLinkeLinklogKnowledgefeedbacklistResponse.ResultMessage"));
		getLinkeLinklogKnowledgefeedbacklistResponse.setErrorMsg(_ctx.stringValue("GetLinkeLinklogKnowledgefeedbacklistResponse.ErrorMsg"));
		getLinkeLinklogKnowledgefeedbacklistResponse.setResponseContentRange(_ctx.stringValue("GetLinkeLinklogKnowledgefeedbacklistResponse.ResponseContentRange"));
		getLinkeLinklogKnowledgefeedbacklistResponse.setResponseContentType(_ctx.stringValue("GetLinkeLinklogKnowledgefeedbacklistResponse.ResponseContentType"));
		getLinkeLinklogKnowledgefeedbacklistResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinklogKnowledgefeedbacklistResponse.ResponseStatusCode"));
		getLinkeLinklogKnowledgefeedbacklistResponse.setSuccess(_ctx.booleanValue("GetLinkeLinklogKnowledgefeedbacklistResponse.Success"));

		Result result = new Result();
		result.setBegin(_ctx.longValue("GetLinkeLinklogKnowledgefeedbacklistResponse.Result.Begin"));
		result.setBeginText(_ctx.stringValue("GetLinkeLinklogKnowledgefeedbacklistResponse.Result.BeginText"));
		result.setEnd(_ctx.longValue("GetLinkeLinklogKnowledgefeedbacklistResponse.Result.End"));
		result.setEndText(_ctx.stringValue("GetLinkeLinklogKnowledgefeedbacklistResponse.Result.EndText"));
		result.setFeedback(_ctx.stringValue("GetLinkeLinklogKnowledgefeedbacklistResponse.Result.Feedback"));
		result.setStoreIds(_ctx.longValue("GetLinkeLinklogKnowledgefeedbacklistResponse.Result.StoreIds"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogKnowledgefeedbacklistResponse.Result.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetLinkeLinklogKnowledgefeedbacklistResponse.Result.Data["+ i +"]"));
		}
		result.setData(data);

		List<String> fields = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogKnowledgefeedbacklistResponse.Result.Fields.Length"); i++) {
			fields.add(_ctx.stringValue("GetLinkeLinklogKnowledgefeedbacklistResponse.Result.Fields["+ i +"]"));
		}
		result.setFields(fields);

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogKnowledgefeedbacklistResponse.Result.List.Length"); i++) {
			list.add(_ctx.stringValue("GetLinkeLinklogKnowledgefeedbacklistResponse.Result.List["+ i +"]"));
		}
		result.setList(list);
		getLinkeLinklogKnowledgefeedbacklistResponse.setResult(result);
	 
	 	return getLinkeLinklogKnowledgefeedbacklistResponse;
	}
}