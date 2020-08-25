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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktUploadinfoResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinktUploadinfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinktUploadinfoResponseUnmarshaller {

	public static GetLinkeLinktUploadinfoResponse unmarshall(GetLinkeLinktUploadinfoResponse getLinkeLinktUploadinfoResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinktUploadinfoResponse.setRequestId(_ctx.stringValue("GetLinkeLinktUploadinfoResponse.RequestId"));
		getLinkeLinktUploadinfoResponse.setResultCode(_ctx.stringValue("GetLinkeLinktUploadinfoResponse.ResultCode"));
		getLinkeLinktUploadinfoResponse.setResultMessage(_ctx.stringValue("GetLinkeLinktUploadinfoResponse.ResultMessage"));
		getLinkeLinktUploadinfoResponse.setErrorCode(_ctx.longValue("GetLinkeLinktUploadinfoResponse.ErrorCode"));
		getLinkeLinktUploadinfoResponse.setErrorMessage(_ctx.stringValue("GetLinkeLinktUploadinfoResponse.ErrorMessage"));
		getLinkeLinktUploadinfoResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinktUploadinfoResponse.ResponseStatusCode"));
		getLinkeLinktUploadinfoResponse.setSuccess(_ctx.booleanValue("GetLinkeLinktUploadinfoResponse.Success"));

		Data data = new Data();
		data.setDownloadUrl(_ctx.stringValue("GetLinkeLinktUploadinfoResponse.Data.DownloadUrl"));
		data.setSignedUploadUrl(_ctx.stringValue("GetLinkeLinktUploadinfoResponse.Data.SignedUploadUrl"));
		data.setStoredFilename(_ctx.stringValue("GetLinkeLinktUploadinfoResponse.Data.StoredFilename"));
		getLinkeLinktUploadinfoResponse.setData(data);
	 
	 	return getLinkeLinktUploadinfoResponse;
	}
}