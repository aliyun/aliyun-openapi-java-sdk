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

import com.aliyuncs.retailadvqa_public.model.v20200515.AudienceDetailByIdResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.AudienceDetailByIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AudienceDetailByIdResponseUnmarshaller {

	public static AudienceDetailByIdResponse unmarshall(AudienceDetailByIdResponse audienceDetailByIdResponse, UnmarshallerContext _ctx) {
		
		audienceDetailByIdResponse.setRequestId(_ctx.stringValue("AudienceDetailByIdResponse.RequestId"));
		audienceDetailByIdResponse.setErrorDesc(_ctx.stringValue("AudienceDetailByIdResponse.ErrorDesc"));
		audienceDetailByIdResponse.setTraceId(_ctx.stringValue("AudienceDetailByIdResponse.TraceId"));
		audienceDetailByIdResponse.setErrorCode(_ctx.stringValue("AudienceDetailByIdResponse.ErrorCode"));
		audienceDetailByIdResponse.setSuccess(_ctx.booleanValue("AudienceDetailByIdResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.stringValue("AudienceDetailByIdResponse.Data.Id"));
		data.setNumberOfAudiences(_ctx.longValue("AudienceDetailByIdResponse.Data.NumberOfAudiences"));
		data.setName(_ctx.stringValue("AudienceDetailByIdResponse.Data.Name"));
		audienceDetailByIdResponse.setData(data);
	 
	 	return audienceDetailByIdResponse;
	}
}