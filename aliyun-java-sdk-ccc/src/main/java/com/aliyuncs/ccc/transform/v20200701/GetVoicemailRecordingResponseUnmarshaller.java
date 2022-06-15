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

import com.aliyuncs.ccc.model.v20200701.GetVoicemailRecordingResponse;
import com.aliyuncs.ccc.model.v20200701.GetVoicemailRecordingResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVoicemailRecordingResponseUnmarshaller {

	public static GetVoicemailRecordingResponse unmarshall(GetVoicemailRecordingResponse getVoicemailRecordingResponse, UnmarshallerContext _ctx) {
		
		getVoicemailRecordingResponse.setRequestId(_ctx.stringValue("GetVoicemailRecordingResponse.RequestId"));
		getVoicemailRecordingResponse.setCode(_ctx.stringValue("GetVoicemailRecordingResponse.Code"));
		getVoicemailRecordingResponse.setHttpStatusCode(_ctx.integerValue("GetVoicemailRecordingResponse.HttpStatusCode"));
		getVoicemailRecordingResponse.setMessage(_ctx.stringValue("GetVoicemailRecordingResponse.Message"));

		Data data = new Data();
		data.setFileUrl(_ctx.stringValue("GetVoicemailRecordingResponse.Data.FileUrl"));
		data.setFileName(_ctx.stringValue("GetVoicemailRecordingResponse.Data.FileName"));
		getVoicemailRecordingResponse.setData(data);
	 
	 	return getVoicemailRecordingResponse;
	}
}