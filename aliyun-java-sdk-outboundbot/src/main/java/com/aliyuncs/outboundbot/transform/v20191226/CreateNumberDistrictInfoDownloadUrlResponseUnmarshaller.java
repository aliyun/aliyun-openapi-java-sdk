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

import com.aliyuncs.outboundbot.model.v20191226.CreateNumberDistrictInfoDownloadUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateNumberDistrictInfoDownloadUrlResponseUnmarshaller {

	public static CreateNumberDistrictInfoDownloadUrlResponse unmarshall(CreateNumberDistrictInfoDownloadUrlResponse createNumberDistrictInfoDownloadUrlResponse, UnmarshallerContext _ctx) {
		
		createNumberDistrictInfoDownloadUrlResponse.setRequestId(_ctx.stringValue("CreateNumberDistrictInfoDownloadUrlResponse.RequestId"));
		createNumberDistrictInfoDownloadUrlResponse.setHttpStatusCode(_ctx.integerValue("CreateNumberDistrictInfoDownloadUrlResponse.HttpStatusCode"));
		createNumberDistrictInfoDownloadUrlResponse.setCode(_ctx.stringValue("CreateNumberDistrictInfoDownloadUrlResponse.Code"));
		createNumberDistrictInfoDownloadUrlResponse.setMessage(_ctx.stringValue("CreateNumberDistrictInfoDownloadUrlResponse.Message"));
		createNumberDistrictInfoDownloadUrlResponse.setSuccess(_ctx.booleanValue("CreateNumberDistrictInfoDownloadUrlResponse.Success"));
		createNumberDistrictInfoDownloadUrlResponse.setFileHttpUrl(_ctx.stringValue("CreateNumberDistrictInfoDownloadUrlResponse.FileHttpUrl"));
	 
	 	return createNumberDistrictInfoDownloadUrlResponse;
	}
}