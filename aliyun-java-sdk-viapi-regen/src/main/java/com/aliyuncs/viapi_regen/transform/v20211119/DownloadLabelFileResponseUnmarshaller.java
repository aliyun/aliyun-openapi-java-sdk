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

import com.aliyuncs.viapi_regen.model.v20211119.DownloadLabelFileResponse;
import com.aliyuncs.viapi_regen.model.v20211119.DownloadLabelFileResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadLabelFileResponseUnmarshaller {

	public static DownloadLabelFileResponse unmarshall(DownloadLabelFileResponse downloadLabelFileResponse, UnmarshallerContext _ctx) {
		
		downloadLabelFileResponse.setRequestId(_ctx.stringValue("DownloadLabelFileResponse.RequestId"));
		downloadLabelFileResponse.setMessage(_ctx.stringValue("DownloadLabelFileResponse.Message"));
		downloadLabelFileResponse.setCode(_ctx.stringValue("DownloadLabelFileResponse.Code"));

		Data data = new Data();
		data.setOssHttpUrl(_ctx.stringValue("DownloadLabelFileResponse.Data.OssHttpUrl"));
		downloadLabelFileResponse.setData(data);
	 
	 	return downloadLabelFileResponse;
	}
}