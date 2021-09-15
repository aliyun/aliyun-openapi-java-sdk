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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.GenerateUploadTokenResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GenerateUploadTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateUploadTokenResponseUnmarshaller {

	public static GenerateUploadTokenResponse unmarshall(GenerateUploadTokenResponse generateUploadTokenResponse, UnmarshallerContext _ctx) {
		
		generateUploadTokenResponse.setRequestId(_ctx.stringValue("GenerateUploadTokenResponse.RequestId"));

		Data data = new Data();
		data.setKey(_ctx.stringValue("GenerateUploadTokenResponse.Data.Key"));
		data.setSignature(_ctx.stringValue("GenerateUploadTokenResponse.Data.Signature"));
		data.setServerURL(_ctx.stringValue("GenerateUploadTokenResponse.Data.ServerURL"));
		data.setOssAccessKeyId(_ctx.stringValue("GenerateUploadTokenResponse.Data.OssAccessKeyId"));
		data.setPolicy(_ctx.stringValue("GenerateUploadTokenResponse.Data.Policy"));
		generateUploadTokenResponse.setData(data);
	 
	 	return generateUploadTokenResponse;
	}
}