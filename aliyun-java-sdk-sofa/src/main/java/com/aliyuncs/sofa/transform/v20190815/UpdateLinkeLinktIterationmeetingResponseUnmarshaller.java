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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktIterationmeetingResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeLinktIterationmeetingResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeLinktIterationmeetingResponseUnmarshaller {

	public static UpdateLinkeLinktIterationmeetingResponse unmarshall(UpdateLinkeLinktIterationmeetingResponse updateLinkeLinktIterationmeetingResponse, UnmarshallerContext _ctx) {
		
		updateLinkeLinktIterationmeetingResponse.setRequestId(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.RequestId"));
		updateLinkeLinktIterationmeetingResponse.setResultCode(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.ResultCode"));
		updateLinkeLinktIterationmeetingResponse.setResultMessage(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.ResultMessage"));
		updateLinkeLinktIterationmeetingResponse.setErrorCode(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.ErrorCode"));
		updateLinkeLinktIterationmeetingResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.ErrorMessage"));
		updateLinkeLinktIterationmeetingResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.ResponseStatusCode"));
		updateLinkeLinktIterationmeetingResponse.setSuccess(_ctx.booleanValue("UpdateLinkeLinktIterationmeetingResponse.Success"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Content"));
		data.setCreatedAt(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("UpdateLinkeLinktIterationmeetingResponse.Data.Deleted"));
		data.setId(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.Id"));
		data.setIterationSign(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.IterationSign"));
		data.setModifier(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Modifier"));
		data.setTitle(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Title"));
		data.setUpdatedAt(_ctx.longValue("UpdateLinkeLinktIterationmeetingResponse.Data.UpdatedAt"));

		List<String> attachments = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeLinktIterationmeetingResponse.Data.Attachments.Length"); i++) {
			attachments.add(_ctx.stringValue("UpdateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"]"));
		}
		data.setAttachments(attachments);
		updateLinkeLinktIterationmeetingResponse.setData(data);
	 
	 	return updateLinkeLinktIterationmeetingResponse;
	}
}