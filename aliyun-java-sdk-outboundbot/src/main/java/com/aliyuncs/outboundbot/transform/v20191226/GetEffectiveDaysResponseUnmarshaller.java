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

import com.aliyuncs.outboundbot.model.v20191226.GetEffectiveDaysResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEffectiveDaysResponseUnmarshaller {

	public static GetEffectiveDaysResponse unmarshall(GetEffectiveDaysResponse getEffectiveDaysResponse, UnmarshallerContext _ctx) {
		
		getEffectiveDaysResponse.setRequestId(_ctx.stringValue("GetEffectiveDaysResponse.RequestId"));
		getEffectiveDaysResponse.setSuccess(_ctx.booleanValue("GetEffectiveDaysResponse.Success"));
		getEffectiveDaysResponse.setCode(_ctx.stringValue("GetEffectiveDaysResponse.Code"));
		getEffectiveDaysResponse.setMessage(_ctx.stringValue("GetEffectiveDaysResponse.Message"));
		getEffectiveDaysResponse.setHttpStatusCode(_ctx.integerValue("GetEffectiveDaysResponse.HttpStatusCode"));
		getEffectiveDaysResponse.setEffectiveDays(_ctx.integerValue("GetEffectiveDaysResponse.EffectiveDays"));
	 
	 	return getEffectiveDaysResponse;
	}
}