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

import com.aliyuncs.outboundbot.model.v20191226.GetMaxAttemptsPerDayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMaxAttemptsPerDayResponseUnmarshaller {

	public static GetMaxAttemptsPerDayResponse unmarshall(GetMaxAttemptsPerDayResponse getMaxAttemptsPerDayResponse, UnmarshallerContext _ctx) {
		
		getMaxAttemptsPerDayResponse.setRequestId(_ctx.stringValue("GetMaxAttemptsPerDayResponse.RequestId"));
		getMaxAttemptsPerDayResponse.setSuccess(_ctx.booleanValue("GetMaxAttemptsPerDayResponse.Success"));
		getMaxAttemptsPerDayResponse.setCode(_ctx.stringValue("GetMaxAttemptsPerDayResponse.Code"));
		getMaxAttemptsPerDayResponse.setMessage(_ctx.stringValue("GetMaxAttemptsPerDayResponse.Message"));
		getMaxAttemptsPerDayResponse.setHttpStatusCode(_ctx.integerValue("GetMaxAttemptsPerDayResponse.HttpStatusCode"));
		getMaxAttemptsPerDayResponse.setMaxAttemptsPerDay(_ctx.integerValue("GetMaxAttemptsPerDayResponse.MaxAttemptsPerDay"));
	 
	 	return getMaxAttemptsPerDayResponse;
	}
}