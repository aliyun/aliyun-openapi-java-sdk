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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.DownloadTaskResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.DownloadTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadTaskResponseUnmarshaller {

	public static DownloadTaskResponse unmarshall(DownloadTaskResponse downloadTaskResponse, UnmarshallerContext context) {
		
		downloadTaskResponse.setRequestId(context.stringValue("DownloadTaskResponse.RequestId"));
		downloadTaskResponse.setSuccess(context.booleanValue("DownloadTaskResponse.Success"));
		downloadTaskResponse.setCode(context.stringValue("DownloadTaskResponse.Code"));
		downloadTaskResponse.setMessage(context.stringValue("DownloadTaskResponse.Message"));
		downloadTaskResponse.setHttpStatusCode(context.integerValue("DownloadTaskResponse.HttpStatusCode"));

		Data data = new Data();
		data.setSignatureUrl(context.stringValue("DownloadTaskResponse.Data.SignatureUrl"));
		data.setFileName(context.stringValue("DownloadTaskResponse.Data.FileName"));
		downloadTaskResponse.setData(data);
	 
	 	return downloadTaskResponse;
	}
}