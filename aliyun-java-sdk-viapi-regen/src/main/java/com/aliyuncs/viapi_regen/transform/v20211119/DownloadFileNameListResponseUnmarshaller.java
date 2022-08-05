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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.DownloadFileNameListResponse;
import com.aliyuncs.viapi_regen.model.v20211119.DownloadFileNameListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadFileNameListResponseUnmarshaller {

	public static DownloadFileNameListResponse unmarshall(DownloadFileNameListResponse downloadFileNameListResponse, UnmarshallerContext _ctx) {
		
		downloadFileNameListResponse.setRequestId(_ctx.stringValue("DownloadFileNameListResponse.RequestId"));
		downloadFileNameListResponse.setMessage(_ctx.stringValue("DownloadFileNameListResponse.Message"));
		downloadFileNameListResponse.setCode(_ctx.stringValue("DownloadFileNameListResponse.Code"));

		Data data = new Data();
		data.setOssHttpUrl(_ctx.stringValue("DownloadFileNameListResponse.Data.OssHttpUrl"));
		downloadFileNameListResponse.setData(data);
	 
	 	return downloadFileNameListResponse;
	}
}