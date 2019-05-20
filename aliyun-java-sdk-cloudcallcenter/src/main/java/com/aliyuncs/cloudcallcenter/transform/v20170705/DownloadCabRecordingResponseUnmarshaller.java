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

import com.aliyuncs.cloudcallcenter.model.v20170705.DownloadCabRecordingResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.DownloadCabRecordingResponse.MediaDownloadParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadCabRecordingResponseUnmarshaller {

	public static DownloadCabRecordingResponse unmarshall(DownloadCabRecordingResponse downloadCabRecordingResponse, UnmarshallerContext context) {
		
		downloadCabRecordingResponse.setRequestId(context.stringValue("DownloadCabRecordingResponse.RequestId"));
		downloadCabRecordingResponse.setSuccess(context.booleanValue("DownloadCabRecordingResponse.Success"));
		downloadCabRecordingResponse.setCode(context.stringValue("DownloadCabRecordingResponse.Code"));
		downloadCabRecordingResponse.setMessage(context.stringValue("DownloadCabRecordingResponse.Message"));
		downloadCabRecordingResponse.setHttpStatusCode(context.integerValue("DownloadCabRecordingResponse.HttpStatusCode"));

		MediaDownloadParam mediaDownloadParam = new MediaDownloadParam();
		mediaDownloadParam.setSignatureUrl(context.stringValue("DownloadCabRecordingResponse.MediaDownloadParam.SignatureUrl"));
		mediaDownloadParam.setFileName(context.stringValue("DownloadCabRecordingResponse.MediaDownloadParam.FileName"));
		downloadCabRecordingResponse.setMediaDownloadParam(mediaDownloadParam);
	 
	 	return downloadCabRecordingResponse;
	}
}