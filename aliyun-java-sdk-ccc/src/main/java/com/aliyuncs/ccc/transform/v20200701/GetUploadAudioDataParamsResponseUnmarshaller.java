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

import com.aliyuncs.ccc.model.v20200701.GetUploadAudioDataParamsResponse;
import com.aliyuncs.ccc.model.v20200701.GetUploadAudioDataParamsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUploadAudioDataParamsResponseUnmarshaller {

	public static GetUploadAudioDataParamsResponse unmarshall(GetUploadAudioDataParamsResponse getUploadAudioDataParamsResponse, UnmarshallerContext _ctx) {
		
		getUploadAudioDataParamsResponse.setRequestId(_ctx.stringValue("GetUploadAudioDataParamsResponse.RequestId"));
		getUploadAudioDataParamsResponse.setCode(_ctx.stringValue("GetUploadAudioDataParamsResponse.Code"));
		getUploadAudioDataParamsResponse.setHttpStatusCode(_ctx.integerValue("GetUploadAudioDataParamsResponse.HttpStatusCode"));
		getUploadAudioDataParamsResponse.setMessage(_ctx.stringValue("GetUploadAudioDataParamsResponse.Message"));

		Data data = new Data();
		data.setParamsStr(_ctx.stringValue("GetUploadAudioDataParamsResponse.Data.ParamsStr"));
		getUploadAudioDataParamsResponse.setData(data);
	 
	 	return getUploadAudioDataParamsResponse;
	}
}