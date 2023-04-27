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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.UploadDataV4Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadDataV4ResponseUnmarshaller {

	public static UploadDataV4Response unmarshall(UploadDataV4Response uploadDataV4Response, UnmarshallerContext _ctx) {
		
		uploadDataV4Response.setRequestId(_ctx.stringValue("UploadDataV4Response.RequestId"));
		uploadDataV4Response.setCode(_ctx.stringValue("UploadDataV4Response.Code"));
		uploadDataV4Response.setMessage(_ctx.stringValue("UploadDataV4Response.Message"));
		uploadDataV4Response.setData(_ctx.stringValue("UploadDataV4Response.Data"));
		uploadDataV4Response.setSuccess(_ctx.booleanValue("UploadDataV4Response.Success"));
	 
	 	return uploadDataV4Response;
	}
}