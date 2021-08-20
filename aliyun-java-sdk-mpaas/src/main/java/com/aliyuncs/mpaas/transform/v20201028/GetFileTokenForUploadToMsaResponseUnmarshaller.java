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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.GetFileTokenForUploadToMsaResponse;
import com.aliyuncs.mpaas.model.v20201028.GetFileTokenForUploadToMsaResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.GetFileTokenForUploadToMsaResponse.ResultContent.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFileTokenForUploadToMsaResponseUnmarshaller {

	public static GetFileTokenForUploadToMsaResponse unmarshall(GetFileTokenForUploadToMsaResponse getFileTokenForUploadToMsaResponse, UnmarshallerContext _ctx) {
		
		getFileTokenForUploadToMsaResponse.setRequestId(_ctx.stringValue("GetFileTokenForUploadToMsaResponse.RequestId"));
		getFileTokenForUploadToMsaResponse.setResultCode(_ctx.stringValue("GetFileTokenForUploadToMsaResponse.ResultCode"));
		getFileTokenForUploadToMsaResponse.setResultMessage(_ctx.stringValue("GetFileTokenForUploadToMsaResponse.ResultMessage"));

		ResultContent resultContent = new ResultContent();
		resultContent.setErrorCode(_ctx.stringValue("GetFileTokenForUploadToMsaResponse.ResultContent.ErrorCode"));
		resultContent.setRequestId(_ctx.stringValue("GetFileTokenForUploadToMsaResponse.ResultContent.RequestId"));
		resultContent.setResultMsg(_ctx.stringValue("GetFileTokenForUploadToMsaResponse.ResultContent.ResultMsg"));
		resultContent.setSuccess(_ctx.stringValue("GetFileTokenForUploadToMsaResponse.ResultContent.Success"));

		Content content = new Content();
		content.setAccessid(_ctx.stringValue("GetFileTokenForUploadToMsaResponse.ResultContent.Content.Accessid"));
		content.setDir(_ctx.stringValue("GetFileTokenForUploadToMsaResponse.ResultContent.Content.Dir"));
		content.setExpire(_ctx.stringValue("GetFileTokenForUploadToMsaResponse.ResultContent.Content.Expire"));
		content.setHost(_ctx.stringValue("GetFileTokenForUploadToMsaResponse.ResultContent.Content.Host"));
		content.setPolicy(_ctx.stringValue("GetFileTokenForUploadToMsaResponse.ResultContent.Content.Policy"));
		content.setSignature(_ctx.stringValue("GetFileTokenForUploadToMsaResponse.ResultContent.Content.Signature"));
		resultContent.setContent(content);
		getFileTokenForUploadToMsaResponse.setResultContent(resultContent);
	 
	 	return getFileTokenForUploadToMsaResponse;
	}
}