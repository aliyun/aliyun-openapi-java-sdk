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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.GenerateFileUploadURLResponse;
import com.aliyuncs.iot.model.v20180120.GenerateFileUploadURLResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateFileUploadURLResponseUnmarshaller {

	public static GenerateFileUploadURLResponse unmarshall(GenerateFileUploadURLResponse generateFileUploadURLResponse, UnmarshallerContext _ctx) {
		
		generateFileUploadURLResponse.setRequestId(_ctx.stringValue("GenerateFileUploadURLResponse.RequestId"));
		generateFileUploadURLResponse.setSuccess(_ctx.booleanValue("GenerateFileUploadURLResponse.Success"));
		generateFileUploadURLResponse.setCode(_ctx.stringValue("GenerateFileUploadURLResponse.Code"));
		generateFileUploadURLResponse.setErrorMessage(_ctx.stringValue("GenerateFileUploadURLResponse.ErrorMessage"));

		Data data = new Data();
		data.setKey(_ctx.stringValue("GenerateFileUploadURLResponse.Data.Key"));
		data.setHost(_ctx.stringValue("GenerateFileUploadURLResponse.Data.Host"));
		data.setPolicy(_ctx.stringValue("GenerateFileUploadURLResponse.Data.Policy"));
		data.setOssAccessKeyId(_ctx.stringValue("GenerateFileUploadURLResponse.Data.OssAccessKeyId"));
		data.setSignature(_ctx.stringValue("GenerateFileUploadURLResponse.Data.Signature"));
		data.setObjectStorage(_ctx.stringValue("GenerateFileUploadURLResponse.Data.ObjectStorage"));
		generateFileUploadURLResponse.setData(data);
	 
	 	return generateFileUploadURLResponse;
	}
}