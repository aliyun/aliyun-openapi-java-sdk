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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.GenerateUploadUrlResponse;
import com.aliyuncs.outboundbot.model.v20191226.GenerateUploadUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateUploadUrlResponseUnmarshaller {

	public static GenerateUploadUrlResponse unmarshall(GenerateUploadUrlResponse generateUploadUrlResponse, UnmarshallerContext _ctx) {
		
		generateUploadUrlResponse.setRequestId(_ctx.stringValue("GenerateUploadUrlResponse.RequestId"));
		generateUploadUrlResponse.setSuccess(_ctx.booleanValue("GenerateUploadUrlResponse.Success"));
		generateUploadUrlResponse.setCode(_ctx.stringValue("GenerateUploadUrlResponse.Code"));
		generateUploadUrlResponse.setMessage(_ctx.stringValue("GenerateUploadUrlResponse.Message"));
		generateUploadUrlResponse.setHttpStatusCode(_ctx.integerValue("GenerateUploadUrlResponse.HttpStatusCode"));

		Data data = new Data();
		data.setAccessId(_ctx.stringValue("GenerateUploadUrlResponse.Data.AccessId"));
		data.setPolicy(_ctx.stringValue("GenerateUploadUrlResponse.Data.Policy"));
		data.setSignature(_ctx.stringValue("GenerateUploadUrlResponse.Data.Signature"));
		data.setFolder(_ctx.stringValue("GenerateUploadUrlResponse.Data.Folder"));
		data.setHost(_ctx.stringValue("GenerateUploadUrlResponse.Data.Host"));
		data.setExpire(_ctx.integerValue("GenerateUploadUrlResponse.Data.Expire"));
		data.setSuccess(_ctx.booleanValue("GenerateUploadUrlResponse.Data.Success"));
		data.setMessage(_ctx.stringValue("GenerateUploadUrlResponse.Data.Message"));
		generateUploadUrlResponse.setData(data);
	 
	 	return generateUploadUrlResponse;
	}
}