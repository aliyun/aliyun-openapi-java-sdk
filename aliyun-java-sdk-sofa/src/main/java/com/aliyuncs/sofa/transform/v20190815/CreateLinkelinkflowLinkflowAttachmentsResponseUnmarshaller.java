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

import com.aliyuncs.sofa.model.v20190815.CreateLinkelinkflowLinkflowAttachmentsResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkelinkflowLinkflowAttachmentsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkelinkflowLinkflowAttachmentsResponseUnmarshaller {

	public static CreateLinkelinkflowLinkflowAttachmentsResponse unmarshall(CreateLinkelinkflowLinkflowAttachmentsResponse createLinkelinkflowLinkflowAttachmentsResponse, UnmarshallerContext _ctx) {
		
		createLinkelinkflowLinkflowAttachmentsResponse.setRequestId(_ctx.stringValue("CreateLinkelinkflowLinkflowAttachmentsResponse.RequestId"));
		createLinkelinkflowLinkflowAttachmentsResponse.setResultCode(_ctx.stringValue("CreateLinkelinkflowLinkflowAttachmentsResponse.ResultCode"));
		createLinkelinkflowLinkflowAttachmentsResponse.setResultMessage(_ctx.stringValue("CreateLinkelinkflowLinkflowAttachmentsResponse.ResultMessage"));
		createLinkelinkflowLinkflowAttachmentsResponse.setCurrent(_ctx.longValue("CreateLinkelinkflowLinkflowAttachmentsResponse.Current"));
		createLinkelinkflowLinkflowAttachmentsResponse.setErrorCode(_ctx.stringValue("CreateLinkelinkflowLinkflowAttachmentsResponse.ErrorCode"));
		createLinkelinkflowLinkflowAttachmentsResponse.setErrorMsg(_ctx.stringValue("CreateLinkelinkflowLinkflowAttachmentsResponse.ErrorMsg"));
		createLinkelinkflowLinkflowAttachmentsResponse.setPageSize(_ctx.longValue("CreateLinkelinkflowLinkflowAttachmentsResponse.PageSize"));
		createLinkelinkflowLinkflowAttachmentsResponse.setResponseStatusCode(_ctx.longValue("CreateLinkelinkflowLinkflowAttachmentsResponse.ResponseStatusCode"));
		createLinkelinkflowLinkflowAttachmentsResponse.setSuccess(_ctx.booleanValue("CreateLinkelinkflowLinkflowAttachmentsResponse.Success"));
		createLinkelinkflowLinkflowAttachmentsResponse.setTotal(_ctx.longValue("CreateLinkelinkflowLinkflowAttachmentsResponse.Total"));

		Data data = new Data();
		data.setCreated(_ctx.longValue("CreateLinkelinkflowLinkflowAttachmentsResponse.Data.Created"));
		data.setCreator(_ctx.stringValue("CreateLinkelinkflowLinkflowAttachmentsResponse.Data.Creator"));
		data.setDescription(_ctx.stringValue("CreateLinkelinkflowLinkflowAttachmentsResponse.Data.Description"));
		data.setId(_ctx.stringValue("CreateLinkelinkflowLinkflowAttachmentsResponse.Data.Id"));
		data.setName(_ctx.stringValue("CreateLinkelinkflowLinkflowAttachmentsResponse.Data.Name"));
		data.setProcessInstanceId(_ctx.stringValue("CreateLinkelinkflowLinkflowAttachmentsResponse.Data.ProcessInstanceId"));
		data.setTaskId(_ctx.stringValue("CreateLinkelinkflowLinkflowAttachmentsResponse.Data.TaskId"));
		data.setType(_ctx.stringValue("CreateLinkelinkflowLinkflowAttachmentsResponse.Data.Type"));
		data.setUrl(_ctx.stringValue("CreateLinkelinkflowLinkflowAttachmentsResponse.Data.Url"));
		createLinkelinkflowLinkflowAttachmentsResponse.setData(data);
	 
	 	return createLinkelinkflowLinkflowAttachmentsResponse;
	}
}