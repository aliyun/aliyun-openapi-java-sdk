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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.GetEarlyMediaRecordingResponse;
import com.aliyuncs.ccc.model.v20200701.GetEarlyMediaRecordingResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEarlyMediaRecordingResponseUnmarshaller {

	public static GetEarlyMediaRecordingResponse unmarshall(GetEarlyMediaRecordingResponse getEarlyMediaRecordingResponse, UnmarshallerContext _ctx) {
		
		getEarlyMediaRecordingResponse.setRequestId(_ctx.stringValue("GetEarlyMediaRecordingResponse.RequestId"));
		getEarlyMediaRecordingResponse.setCode(_ctx.stringValue("GetEarlyMediaRecordingResponse.Code"));
		getEarlyMediaRecordingResponse.setHttpStatusCode(_ctx.integerValue("GetEarlyMediaRecordingResponse.HttpStatusCode"));
		getEarlyMediaRecordingResponse.setMessage(_ctx.stringValue("GetEarlyMediaRecordingResponse.Message"));

		Data data = new Data();
		data.setFileUrl(_ctx.stringValue("GetEarlyMediaRecordingResponse.Data.FileUrl"));
		data.setFileName(_ctx.stringValue("GetEarlyMediaRecordingResponse.Data.FileName"));
		getEarlyMediaRecordingResponse.setData(data);
	 
	 	return getEarlyMediaRecordingResponse;
	}
}