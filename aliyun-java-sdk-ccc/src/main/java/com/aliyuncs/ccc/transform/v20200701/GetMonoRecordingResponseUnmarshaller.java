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

import com.aliyuncs.ccc.model.v20200701.GetMonoRecordingResponse;
import com.aliyuncs.ccc.model.v20200701.GetMonoRecordingResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMonoRecordingResponseUnmarshaller {

	public static GetMonoRecordingResponse unmarshall(GetMonoRecordingResponse getMonoRecordingResponse, UnmarshallerContext _ctx) {
		
		getMonoRecordingResponse.setRequestId(_ctx.stringValue("GetMonoRecordingResponse.RequestId"));
		getMonoRecordingResponse.setCode(_ctx.stringValue("GetMonoRecordingResponse.Code"));
		getMonoRecordingResponse.setHttpStatusCode(_ctx.integerValue("GetMonoRecordingResponse.HttpStatusCode"));
		getMonoRecordingResponse.setMessage(_ctx.stringValue("GetMonoRecordingResponse.Message"));

		Data data = new Data();
		data.setFileName(_ctx.stringValue("GetMonoRecordingResponse.Data.FileName"));
		data.setFileUrl(_ctx.stringValue("GetMonoRecordingResponse.Data.FileUrl"));
		getMonoRecordingResponse.setData(data);
	 
	 	return getMonoRecordingResponse;
	}
}