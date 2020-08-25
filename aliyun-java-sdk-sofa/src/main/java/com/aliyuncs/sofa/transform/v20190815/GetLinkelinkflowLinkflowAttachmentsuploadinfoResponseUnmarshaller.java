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

import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseUnmarshaller {

	public static GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse unmarshall(GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse getLinkelinkflowLinkflowAttachmentsuploadinfoResponse, UnmarshallerContext _ctx) {
		
		getLinkelinkflowLinkflowAttachmentsuploadinfoResponse.setRequestId(_ctx.stringValue("GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse.RequestId"));
		getLinkelinkflowLinkflowAttachmentsuploadinfoResponse.setResultCode(_ctx.stringValue("GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse.ResultCode"));
		getLinkelinkflowLinkflowAttachmentsuploadinfoResponse.setResultMessage(_ctx.stringValue("GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse.ResultMessage"));
		getLinkelinkflowLinkflowAttachmentsuploadinfoResponse.setCurrent(_ctx.longValue("GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse.Current"));
		getLinkelinkflowLinkflowAttachmentsuploadinfoResponse.setErrorCode(_ctx.stringValue("GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse.ErrorCode"));
		getLinkelinkflowLinkflowAttachmentsuploadinfoResponse.setErrorMsg(_ctx.stringValue("GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse.ErrorMsg"));
		getLinkelinkflowLinkflowAttachmentsuploadinfoResponse.setPageSize(_ctx.longValue("GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse.PageSize"));
		getLinkelinkflowLinkflowAttachmentsuploadinfoResponse.setResponseStatusCode(_ctx.longValue("GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse.ResponseStatusCode"));
		getLinkelinkflowLinkflowAttachmentsuploadinfoResponse.setSuccess(_ctx.booleanValue("GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse.Success"));
		getLinkelinkflowLinkflowAttachmentsuploadinfoResponse.setTotal(_ctx.longValue("GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse.Total"));

		Data data = new Data();
		data.setRemoteUrl(_ctx.stringValue("GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse.Data.RemoteUrl"));
		data.setSignedUploadUrl(_ctx.stringValue("GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse.Data.SignedUploadUrl"));
		getLinkelinkflowLinkflowAttachmentsuploadinfoResponse.setData(data);
	 
	 	return getLinkelinkflowLinkflowAttachmentsuploadinfoResponse;
	}
}