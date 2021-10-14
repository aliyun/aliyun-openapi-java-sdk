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

import com.aliyuncs.ccc.model.v20200701.GetMultiChannelRecordingResponse;
import com.aliyuncs.ccc.model.v20200701.GetMultiChannelRecordingResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMultiChannelRecordingResponseUnmarshaller {

	public static GetMultiChannelRecordingResponse unmarshall(GetMultiChannelRecordingResponse getMultiChannelRecordingResponse, UnmarshallerContext _ctx) {
		
		getMultiChannelRecordingResponse.setRequestId(_ctx.stringValue("GetMultiChannelRecordingResponse.RequestId"));
		getMultiChannelRecordingResponse.setCode(_ctx.stringValue("GetMultiChannelRecordingResponse.Code"));
		getMultiChannelRecordingResponse.setHttpStatusCode(_ctx.integerValue("GetMultiChannelRecordingResponse.HttpStatusCode"));
		getMultiChannelRecordingResponse.setMessage(_ctx.stringValue("GetMultiChannelRecordingResponse.Message"));

		Data data = new Data();
		data.setFileName(_ctx.stringValue("GetMultiChannelRecordingResponse.Data.FileName"));
		data.setFileUrl(_ctx.stringValue("GetMultiChannelRecordingResponse.Data.FileUrl"));
		getMultiChannelRecordingResponse.setData(data);
	 
	 	return getMultiChannelRecordingResponse;
	}
}