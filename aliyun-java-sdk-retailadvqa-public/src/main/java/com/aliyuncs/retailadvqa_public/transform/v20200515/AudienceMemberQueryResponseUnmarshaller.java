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

import com.aliyuncs.retailadvqa_public.model.v20200515.AudienceMemberQueryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AudienceMemberQueryResponseUnmarshaller {

	public static AudienceMemberQueryResponse unmarshall(AudienceMemberQueryResponse audienceMemberQueryResponse, UnmarshallerContext _ctx) {
		
		audienceMemberQueryResponse.setRequestId(_ctx.stringValue("AudienceMemberQueryResponse.RequestId"));
		audienceMemberQueryResponse.setErrorDesc(_ctx.stringValue("AudienceMemberQueryResponse.ErrorDesc"));
		audienceMemberQueryResponse.setTraceId(_ctx.stringValue("AudienceMemberQueryResponse.TraceId"));
		audienceMemberQueryResponse.setErrorCode(_ctx.stringValue("AudienceMemberQueryResponse.ErrorCode"));
		audienceMemberQueryResponse.setSuccess(_ctx.booleanValue("AudienceMemberQueryResponse.Success"));
		audienceMemberQueryResponse.setData(_ctx.stringValue("AudienceMemberQueryResponse.Data"));
	 
	 	return audienceMemberQueryResponse;
	}
}