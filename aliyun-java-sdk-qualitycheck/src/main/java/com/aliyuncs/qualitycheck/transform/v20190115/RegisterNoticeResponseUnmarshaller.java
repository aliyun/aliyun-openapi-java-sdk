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

import com.aliyuncs.qualitycheck.model.v20190115.RegisterNoticeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegisterNoticeResponseUnmarshaller {

	public static RegisterNoticeResponse unmarshall(RegisterNoticeResponse registerNoticeResponse, UnmarshallerContext _ctx) {
		
		registerNoticeResponse.setRequestId(_ctx.stringValue("RegisterNoticeResponse.RequestId"));
		registerNoticeResponse.setSuccess(_ctx.booleanValue("RegisterNoticeResponse.Success"));
		registerNoticeResponse.setCode(_ctx.stringValue("RegisterNoticeResponse.Code"));
		registerNoticeResponse.setMessage(_ctx.stringValue("RegisterNoticeResponse.Message"));
	 
	 	return registerNoticeResponse;
	}
}