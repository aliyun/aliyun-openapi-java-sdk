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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.DownloadAllTypeRecordingResponse;
import com.aliyuncs.ccc.model.v20170705.DownloadAllTypeRecordingResponse.MediaDownloadParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadAllTypeRecordingResponseUnmarshaller {

	public static DownloadAllTypeRecordingResponse unmarshall(DownloadAllTypeRecordingResponse downloadAllTypeRecordingResponse, UnmarshallerContext _ctx) {
		
		downloadAllTypeRecordingResponse.setRequestId(_ctx.stringValue("DownloadAllTypeRecordingResponse.RequestId"));
		downloadAllTypeRecordingResponse.setSuccess(_ctx.booleanValue("DownloadAllTypeRecordingResponse.Success"));
		downloadAllTypeRecordingResponse.setCode(_ctx.stringValue("DownloadAllTypeRecordingResponse.Code"));
		downloadAllTypeRecordingResponse.setMessage(_ctx.stringValue("DownloadAllTypeRecordingResponse.Message"));
		downloadAllTypeRecordingResponse.setHttpStatusCode(_ctx.integerValue("DownloadAllTypeRecordingResponse.HttpStatusCode"));

		List<MediaDownloadParam> mediaDownloadParamList = new ArrayList<MediaDownloadParam>();
		for (int i = 0; i < _ctx.lengthValue("DownloadAllTypeRecordingResponse.MediaDownloadParamList.Length"); i++) {
			MediaDownloadParam mediaDownloadParam = new MediaDownloadParam();
			mediaDownloadParam.setSignatureUrl(_ctx.stringValue("DownloadAllTypeRecordingResponse.MediaDownloadParamList["+ i +"].SignatureUrl"));
			mediaDownloadParam.setFileName(_ctx.stringValue("DownloadAllTypeRecordingResponse.MediaDownloadParamList["+ i +"].FileName"));

			mediaDownloadParamList.add(mediaDownloadParam);
		}
		downloadAllTypeRecordingResponse.setMediaDownloadParamList(mediaDownloadParamList);
	 
	 	return downloadAllTypeRecordingResponse;
	}
}