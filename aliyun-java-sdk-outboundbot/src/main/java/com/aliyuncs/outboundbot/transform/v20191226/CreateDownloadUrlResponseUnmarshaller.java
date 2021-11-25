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

import com.aliyuncs.outboundbot.model.v20191226.CreateDownloadUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDownloadUrlResponseUnmarshaller {

	public static CreateDownloadUrlResponse unmarshall(CreateDownloadUrlResponse createDownloadUrlResponse, UnmarshallerContext _ctx) {
		
		createDownloadUrlResponse.setRequestId(_ctx.stringValue("CreateDownloadUrlResponse.RequestId"));
		createDownloadUrlResponse.setHttpStatusCode(_ctx.integerValue("CreateDownloadUrlResponse.HttpStatusCode"));
		createDownloadUrlResponse.setFileHttpUrl(_ctx.stringValue("CreateDownloadUrlResponse.FileHttpUrl"));
		createDownloadUrlResponse.setSuccess(_ctx.booleanValue("CreateDownloadUrlResponse.Success"));
		createDownloadUrlResponse.setCode(_ctx.stringValue("CreateDownloadUrlResponse.Code"));
		createDownloadUrlResponse.setMessage(_ctx.stringValue("CreateDownloadUrlResponse.Message"));
	 
	 	return createDownloadUrlResponse;
	}
}