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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import com.aliyuncs.retailadvqa_public.model.v20200515.AudiencePushStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AudiencePushStatusResponseUnmarshaller {

	public static AudiencePushStatusResponse unmarshall(AudiencePushStatusResponse audiencePushStatusResponse, UnmarshallerContext _ctx) {
		
		audiencePushStatusResponse.setRequestId(_ctx.stringValue("AudiencePushStatusResponse.RequestId"));
		audiencePushStatusResponse.setErrorDesc(_ctx.stringValue("AudiencePushStatusResponse.ErrorDesc"));
		audiencePushStatusResponse.setTraceId(_ctx.stringValue("AudiencePushStatusResponse.TraceId"));
		audiencePushStatusResponse.setErrorCode(_ctx.stringValue("AudiencePushStatusResponse.ErrorCode"));
		audiencePushStatusResponse.setSuccess(_ctx.booleanValue("AudiencePushStatusResponse.Success"));
		audiencePushStatusResponse.setData(_ctx.stringValue("AudiencePushStatusResponse.Data"));
	 
	 	return audiencePushStatusResponse;
	}
}