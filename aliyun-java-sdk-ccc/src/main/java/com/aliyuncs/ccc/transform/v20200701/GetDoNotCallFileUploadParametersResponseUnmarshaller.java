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

import com.aliyuncs.ccc.model.v20200701.GetDoNotCallFileUploadParametersResponse;
import com.aliyuncs.ccc.model.v20200701.GetDoNotCallFileUploadParametersResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDoNotCallFileUploadParametersResponseUnmarshaller {

	public static GetDoNotCallFileUploadParametersResponse unmarshall(GetDoNotCallFileUploadParametersResponse getDoNotCallFileUploadParametersResponse, UnmarshallerContext _ctx) {
		
		getDoNotCallFileUploadParametersResponse.setRequestId(_ctx.stringValue("GetDoNotCallFileUploadParametersResponse.RequestId"));
		getDoNotCallFileUploadParametersResponse.setHttpStatusCode(_ctx.integerValue("GetDoNotCallFileUploadParametersResponse.HttpStatusCode"));
		getDoNotCallFileUploadParametersResponse.setCode(_ctx.stringValue("GetDoNotCallFileUploadParametersResponse.Code"));
		getDoNotCallFileUploadParametersResponse.setMessage(_ctx.stringValue("GetDoNotCallFileUploadParametersResponse.Message"));
		getDoNotCallFileUploadParametersResponse.setSuccess(_ctx.booleanValue("GetDoNotCallFileUploadParametersResponse.Success"));

		Data data = new Data();
		data.setFilePath(_ctx.stringValue("GetDoNotCallFileUploadParametersResponse.Data.FilePath"));
		data.setSignature(_ctx.stringValue("GetDoNotCallFileUploadParametersResponse.Data.Signature"));
		data.setHost(_ctx.stringValue("GetDoNotCallFileUploadParametersResponse.Data.Host"));
		data.setPolicy(_ctx.stringValue("GetDoNotCallFileUploadParametersResponse.Data.Policy"));
		data.setExpireTime(_ctx.integerValue("GetDoNotCallFileUploadParametersResponse.Data.ExpireTime"));
		data.setAccessKeyId(_ctx.stringValue("GetDoNotCallFileUploadParametersResponse.Data.AccessKeyId"));
		getDoNotCallFileUploadParametersResponse.setData(data);
	 
	 	return getDoNotCallFileUploadParametersResponse;
	}
}