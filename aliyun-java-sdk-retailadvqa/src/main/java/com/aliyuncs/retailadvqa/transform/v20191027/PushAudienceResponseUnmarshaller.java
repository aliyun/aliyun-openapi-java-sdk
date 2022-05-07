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

package com.aliyuncs.retailadvqa.transform.v20191027;

import com.aliyuncs.retailadvqa.model.v20191027.PushAudienceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushAudienceResponseUnmarshaller {

	public static PushAudienceResponse unmarshall(PushAudienceResponse pushAudienceResponse, UnmarshallerContext _ctx) {
		
		pushAudienceResponse.setRequestId(_ctx.stringValue("PushAudienceResponse.RequestId"));
		pushAudienceResponse.setData(_ctx.stringValue("PushAudienceResponse.Data"));
		pushAudienceResponse.setErrorCode(_ctx.stringValue("PushAudienceResponse.ErrorCode"));
		pushAudienceResponse.setSuccess(_ctx.booleanValue("PushAudienceResponse.Success"));
		pushAudienceResponse.setTraceId(_ctx.stringValue("PushAudienceResponse.TraceId"));
		pushAudienceResponse.setErrorDesc(_ctx.stringValue("PushAudienceResponse.ErrorDesc"));
	 
	 	return pushAudienceResponse;
	}
}