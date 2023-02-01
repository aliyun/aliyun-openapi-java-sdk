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

package com.aliyuncs.ecd.transform.v20200930;

import com.aliyuncs.ecd.model.v20200930.DownloadFileResponse;
import com.aliyuncs.ecd.model.v20200930.DownloadFileResponse.Data;
import com.aliyuncs.ecd.model.v20200930.DownloadFileResponse.Data.HeaderInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadFileResponseUnmarshaller {

	public static DownloadFileResponse unmarshall(DownloadFileResponse downloadFileResponse, UnmarshallerContext _ctx) {
		
		downloadFileResponse.setRequestId(_ctx.stringValue("DownloadFileResponse.RequestId"));
		downloadFileResponse.setCode(_ctx.stringValue("DownloadFileResponse.Code"));
		downloadFileResponse.setMessage(_ctx.stringValue("DownloadFileResponse.Message"));
		downloadFileResponse.setSuccess(_ctx.booleanValue("DownloadFileResponse.Success"));

		Data data = new Data();
		data.setFileId(_ctx.stringValue("DownloadFileResponse.Data.FileId"));
		data.setDownloadType(_ctx.stringValue("DownloadFileResponse.Data.DownloadType"));
		data.setDownloadUrl(_ctx.stringValue("DownloadFileResponse.Data.DownloadUrl"));
		data.setStreamsUrl(_ctx.stringValue("DownloadFileResponse.Data.StreamsUrl"));
		data.setExpirationSecond(_ctx.longValue("DownloadFileResponse.Data.ExpirationSecond"));
		data.setExpirationTime(_ctx.stringValue("DownloadFileResponse.Data.ExpirationTime"));
		data.setSize(_ctx.longValue("DownloadFileResponse.Data.Size"));

		HeaderInfo headerInfo = new HeaderInfo();
		headerInfo.setDate(_ctx.stringValue("DownloadFileResponse.Data.HeaderInfo.Date"));
		headerInfo.setAuthorization(_ctx.stringValue("DownloadFileResponse.Data.HeaderInfo.Authorization"));
		data.setHeaderInfo(headerInfo);
		downloadFileResponse.setData(data);
	 
	 	return downloadFileResponse;
	}
}