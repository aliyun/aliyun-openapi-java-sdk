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

import com.aliyuncs.sofa.model.v20190815.DownloadLinkelinkflowLinkflowAttachmentsinfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadLinkelinkflowLinkflowAttachmentsinfoResponseUnmarshaller {

	public static DownloadLinkelinkflowLinkflowAttachmentsinfoResponse unmarshall(DownloadLinkelinkflowLinkflowAttachmentsinfoResponse downloadLinkelinkflowLinkflowAttachmentsinfoResponse, UnmarshallerContext _ctx) {
		
		downloadLinkelinkflowLinkflowAttachmentsinfoResponse.setRequestId(_ctx.stringValue("DownloadLinkelinkflowLinkflowAttachmentsinfoResponse.RequestId"));
		downloadLinkelinkflowLinkflowAttachmentsinfoResponse.setResultCode(_ctx.stringValue("DownloadLinkelinkflowLinkflowAttachmentsinfoResponse.ResultCode"));
		downloadLinkelinkflowLinkflowAttachmentsinfoResponse.setResultMessage(_ctx.stringValue("DownloadLinkelinkflowLinkflowAttachmentsinfoResponse.ResultMessage"));
		downloadLinkelinkflowLinkflowAttachmentsinfoResponse.setCurrent(_ctx.longValue("DownloadLinkelinkflowLinkflowAttachmentsinfoResponse.Current"));
		downloadLinkelinkflowLinkflowAttachmentsinfoResponse.setData(_ctx.stringValue("DownloadLinkelinkflowLinkflowAttachmentsinfoResponse.Data"));
		downloadLinkelinkflowLinkflowAttachmentsinfoResponse.setErrorCode(_ctx.stringValue("DownloadLinkelinkflowLinkflowAttachmentsinfoResponse.ErrorCode"));
		downloadLinkelinkflowLinkflowAttachmentsinfoResponse.setErrorMsg(_ctx.stringValue("DownloadLinkelinkflowLinkflowAttachmentsinfoResponse.ErrorMsg"));
		downloadLinkelinkflowLinkflowAttachmentsinfoResponse.setPageSize(_ctx.longValue("DownloadLinkelinkflowLinkflowAttachmentsinfoResponse.PageSize"));
		downloadLinkelinkflowLinkflowAttachmentsinfoResponse.setResponseStatusCode(_ctx.longValue("DownloadLinkelinkflowLinkflowAttachmentsinfoResponse.ResponseStatusCode"));
		downloadLinkelinkflowLinkflowAttachmentsinfoResponse.setSuccess(_ctx.booleanValue("DownloadLinkelinkflowLinkflowAttachmentsinfoResponse.Success"));
		downloadLinkelinkflowLinkflowAttachmentsinfoResponse.setTotal(_ctx.longValue("DownloadLinkelinkflowLinkflowAttachmentsinfoResponse.Total"));
	 
	 	return downloadLinkelinkflowLinkflowAttachmentsinfoResponse;
	}
}