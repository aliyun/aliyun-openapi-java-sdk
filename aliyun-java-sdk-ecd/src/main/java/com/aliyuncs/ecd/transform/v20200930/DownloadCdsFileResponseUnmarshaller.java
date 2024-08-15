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

import com.aliyuncs.ecd.model.v20200930.DownloadCdsFileResponse;
import com.aliyuncs.ecd.model.v20200930.DownloadCdsFileResponse.DownloadFileModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadCdsFileResponseUnmarshaller {

	public static DownloadCdsFileResponse unmarshall(DownloadCdsFileResponse downloadCdsFileResponse, UnmarshallerContext _ctx) {
		
		downloadCdsFileResponse.setRequestId(_ctx.stringValue("DownloadCdsFileResponse.RequestId"));
		downloadCdsFileResponse.setMessage(_ctx.stringValue("DownloadCdsFileResponse.Message"));
		downloadCdsFileResponse.setSuccess(_ctx.booleanValue("DownloadCdsFileResponse.Success"));

		DownloadFileModel downloadFileModel = new DownloadFileModel();
		downloadFileModel.setStreamUrl(_ctx.stringValue("DownloadCdsFileResponse.DownloadFileModel.StreamUrl"));
		downloadFileModel.setDownloadUrl(_ctx.stringValue("DownloadCdsFileResponse.DownloadFileModel.DownloadUrl"));
		downloadFileModel.setSize(_ctx.longValue("DownloadCdsFileResponse.DownloadFileModel.Size"));
		downloadFileModel.setDownloadType(_ctx.stringValue("DownloadCdsFileResponse.DownloadFileModel.DownloadType"));
		downloadFileModel.setExpirationSecond(_ctx.stringValue("DownloadCdsFileResponse.DownloadFileModel.ExpirationSecond"));
		downloadFileModel.setExpirationTime(_ctx.stringValue("DownloadCdsFileResponse.DownloadFileModel.ExpirationTime"));
		downloadFileModel.setFileId(_ctx.stringValue("DownloadCdsFileResponse.DownloadFileModel.FileId"));
		downloadCdsFileResponse.setDownloadFileModel(downloadFileModel);
	 
	 	return downloadCdsFileResponse;
	}
}