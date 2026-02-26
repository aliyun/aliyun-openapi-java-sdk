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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.GetTempFileDownloadLinkResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTempFileDownloadLinkResponseUnmarshaller {

	public static GetTempFileDownloadLinkResponse unmarshall(GetTempFileDownloadLinkResponse getTempFileDownloadLinkResponse, UnmarshallerContext _ctx) {
		
		getTempFileDownloadLinkResponse.setRequestId(_ctx.stringValue("GetTempFileDownloadLinkResponse.RequestId"));
		getTempFileDownloadLinkResponse.setCode(_ctx.stringValue("GetTempFileDownloadLinkResponse.Code"));
		getTempFileDownloadLinkResponse.setUrl(_ctx.stringValue("GetTempFileDownloadLinkResponse.Url"));
		getTempFileDownloadLinkResponse.setMessage(_ctx.stringValue("GetTempFileDownloadLinkResponse.Message"));
		getTempFileDownloadLinkResponse.setSuccess(_ctx.booleanValue("GetTempFileDownloadLinkResponse.Success"));
	 
	 	return getTempFileDownloadLinkResponse;
	}
}