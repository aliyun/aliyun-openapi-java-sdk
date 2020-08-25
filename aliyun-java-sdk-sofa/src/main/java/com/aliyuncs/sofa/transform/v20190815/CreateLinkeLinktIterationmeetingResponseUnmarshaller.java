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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktIterationmeetingResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeLinktIterationmeetingResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeLinktIterationmeetingResponseUnmarshaller {

	public static CreateLinkeLinktIterationmeetingResponse unmarshall(CreateLinkeLinktIterationmeetingResponse createLinkeLinktIterationmeetingResponse, UnmarshallerContext _ctx) {
		
		createLinkeLinktIterationmeetingResponse.setRequestId(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.RequestId"));
		createLinkeLinktIterationmeetingResponse.setResultCode(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.ResultCode"));
		createLinkeLinktIterationmeetingResponse.setResultMessage(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.ResultMessage"));
		createLinkeLinktIterationmeetingResponse.setErrorCode(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.ErrorCode"));
		createLinkeLinktIterationmeetingResponse.setErrorMessage(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.ErrorMessage"));
		createLinkeLinktIterationmeetingResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.ResponseStatusCode"));
		createLinkeLinktIterationmeetingResponse.setSuccess(_ctx.booleanValue("CreateLinkeLinktIterationmeetingResponse.Success"));

		Data data = new Data();
		data.setContent(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Content"));
		data.setCreatedAt(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.CreatedAt"));
		data.setCreator(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Creator"));
		data.setDeleted(_ctx.booleanValue("CreateLinkeLinktIterationmeetingResponse.Data.Deleted"));
		data.setId(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.Id"));
		data.setIterationSign(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.IterationSign"));
		data.setModifier(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Modifier"));
		data.setTitle(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Title"));
		data.setUpdatedAt(_ctx.longValue("CreateLinkeLinktIterationmeetingResponse.Data.UpdatedAt"));

		List<String> attachments = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeLinktIterationmeetingResponse.Data.Attachments.Length"); i++) {
			attachments.add(_ctx.stringValue("CreateLinkeLinktIterationmeetingResponse.Data.Attachments["+ i +"]"));
		}
		data.setAttachments(attachments);
		createLinkeLinktIterationmeetingResponse.setData(data);
	 
	 	return createLinkeLinktIterationmeetingResponse;
	}
}