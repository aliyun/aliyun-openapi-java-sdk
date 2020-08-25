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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkelinkflowLinkflowAttachmentsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkelinkflowLinkflowAttachmentsResponseUnmarshaller {

	public static DeleteLinkelinkflowLinkflowAttachmentsResponse unmarshall(DeleteLinkelinkflowLinkflowAttachmentsResponse deleteLinkelinkflowLinkflowAttachmentsResponse, UnmarshallerContext _ctx) {
		
		deleteLinkelinkflowLinkflowAttachmentsResponse.setRequestId(_ctx.stringValue("DeleteLinkelinkflowLinkflowAttachmentsResponse.RequestId"));
		deleteLinkelinkflowLinkflowAttachmentsResponse.setResultCode(_ctx.stringValue("DeleteLinkelinkflowLinkflowAttachmentsResponse.ResultCode"));
		deleteLinkelinkflowLinkflowAttachmentsResponse.setResultMessage(_ctx.stringValue("DeleteLinkelinkflowLinkflowAttachmentsResponse.ResultMessage"));
		deleteLinkelinkflowLinkflowAttachmentsResponse.setCurrent(_ctx.longValue("DeleteLinkelinkflowLinkflowAttachmentsResponse.Current"));
		deleteLinkelinkflowLinkflowAttachmentsResponse.setData(_ctx.booleanValue("DeleteLinkelinkflowLinkflowAttachmentsResponse.Data"));
		deleteLinkelinkflowLinkflowAttachmentsResponse.setErrorCode(_ctx.stringValue("DeleteLinkelinkflowLinkflowAttachmentsResponse.ErrorCode"));
		deleteLinkelinkflowLinkflowAttachmentsResponse.setErrorMsg(_ctx.stringValue("DeleteLinkelinkflowLinkflowAttachmentsResponse.ErrorMsg"));
		deleteLinkelinkflowLinkflowAttachmentsResponse.setPageSize(_ctx.longValue("DeleteLinkelinkflowLinkflowAttachmentsResponse.PageSize"));
		deleteLinkelinkflowLinkflowAttachmentsResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkelinkflowLinkflowAttachmentsResponse.ResponseStatusCode"));
		deleteLinkelinkflowLinkflowAttachmentsResponse.setSuccess(_ctx.booleanValue("DeleteLinkelinkflowLinkflowAttachmentsResponse.Success"));
		deleteLinkelinkflowLinkflowAttachmentsResponse.setTotal(_ctx.longValue("DeleteLinkelinkflowLinkflowAttachmentsResponse.Total"));
	 
	 	return deleteLinkelinkflowLinkflowAttachmentsResponse;
	}
}