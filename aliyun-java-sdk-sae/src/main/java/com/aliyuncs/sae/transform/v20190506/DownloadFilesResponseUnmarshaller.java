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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.DownloadFilesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadFilesResponseUnmarshaller {

	public static DownloadFilesResponse unmarshall(DownloadFilesResponse downloadFilesResponse, UnmarshallerContext _ctx) {
		
		downloadFilesResponse.setRequestId(_ctx.stringValue("DownloadFilesResponse.RequestId"));
		downloadFilesResponse.setMessage(_ctx.stringValue("DownloadFilesResponse.Message"));
		downloadFilesResponse.setTraceId(_ctx.stringValue("DownloadFilesResponse.TraceId"));
		downloadFilesResponse.setData(_ctx.stringValue("DownloadFilesResponse.Data"));
		downloadFilesResponse.setErrorCode(_ctx.stringValue("DownloadFilesResponse.ErrorCode"));
		downloadFilesResponse.setCode(_ctx.stringValue("DownloadFilesResponse.Code"));
		downloadFilesResponse.setSuccess(_ctx.booleanValue("DownloadFilesResponse.Success"));
	 
	 	return downloadFilesResponse;
	}
}