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

import com.aliyuncs.cloudcallcenter.model.v20170705.DownloadMediaResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.DownloadMediaResponse.MediaDownloadParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadMediaResponseUnmarshaller {

	public static DownloadMediaResponse unmarshall(DownloadMediaResponse downloadMediaResponse, UnmarshallerContext context) {
		
		downloadMediaResponse.setRequestId(context.stringValue("DownloadMediaResponse.RequestId"));
		downloadMediaResponse.setSuccess(context.booleanValue("DownloadMediaResponse.Success"));
		downloadMediaResponse.setCode(context.stringValue("DownloadMediaResponse.Code"));
		downloadMediaResponse.setMessage(context.stringValue("DownloadMediaResponse.Message"));
		downloadMediaResponse.setHttpStatusCode(context.integerValue("DownloadMediaResponse.HttpStatusCode"));

		MediaDownloadParam mediaDownloadParam = new MediaDownloadParam();
		mediaDownloadParam.setSignatureUrl(context.stringValue("DownloadMediaResponse.MediaDownloadParam.SignatureUrl"));
		mediaDownloadParam.setFileName(context.stringValue("DownloadMediaResponse.MediaDownloadParam.FileName"));
		downloadMediaResponse.setMediaDownloadParam(mediaDownloadParam);
	 
	 	return downloadMediaResponse;
	}
}