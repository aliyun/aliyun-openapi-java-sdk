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

import com.aliyuncs.ccc.model.v20200701.GetAudioFileUploadParametersResponse;
import com.aliyuncs.ccc.model.v20200701.GetAudioFileUploadParametersResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAudioFileUploadParametersResponseUnmarshaller {

	public static GetAudioFileUploadParametersResponse unmarshall(GetAudioFileUploadParametersResponse getAudioFileUploadParametersResponse, UnmarshallerContext _ctx) {
		
		getAudioFileUploadParametersResponse.setRequestId(_ctx.stringValue("GetAudioFileUploadParametersResponse.RequestId"));
		getAudioFileUploadParametersResponse.setHttpStatusCode(_ctx.integerValue("GetAudioFileUploadParametersResponse.HttpStatusCode"));
		getAudioFileUploadParametersResponse.setCode(_ctx.stringValue("GetAudioFileUploadParametersResponse.Code"));
		getAudioFileUploadParametersResponse.setMessage(_ctx.stringValue("GetAudioFileUploadParametersResponse.Message"));
		getAudioFileUploadParametersResponse.setSuccess(_ctx.booleanValue("GetAudioFileUploadParametersResponse.Success"));

		Data data = new Data();
		data.setFilePath(_ctx.stringValue("GetAudioFileUploadParametersResponse.Data.FilePath"));
		data.setSignature(_ctx.stringValue("GetAudioFileUploadParametersResponse.Data.Signature"));
		data.setHost(_ctx.stringValue("GetAudioFileUploadParametersResponse.Data.Host"));
		data.setPolicy(_ctx.stringValue("GetAudioFileUploadParametersResponse.Data.Policy"));
		data.setExpireTime(_ctx.integerValue("GetAudioFileUploadParametersResponse.Data.ExpireTime"));
		data.setAccessKeyId(_ctx.stringValue("GetAudioFileUploadParametersResponse.Data.AccessKeyId"));
		getAudioFileUploadParametersResponse.setData(data);
	 
	 	return getAudioFileUploadParametersResponse;
	}
}