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

import com.aliyuncs.outboundbot.model.v20191226.SaveMaxAttemptsPerDayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveMaxAttemptsPerDayResponseUnmarshaller {

	public static SaveMaxAttemptsPerDayResponse unmarshall(SaveMaxAttemptsPerDayResponse saveMaxAttemptsPerDayResponse, UnmarshallerContext _ctx) {
		
		saveMaxAttemptsPerDayResponse.setRequestId(_ctx.stringValue("SaveMaxAttemptsPerDayResponse.RequestId"));
		saveMaxAttemptsPerDayResponse.setSuccess(_ctx.booleanValue("SaveMaxAttemptsPerDayResponse.Success"));
		saveMaxAttemptsPerDayResponse.setCode(_ctx.stringValue("SaveMaxAttemptsPerDayResponse.Code"));
		saveMaxAttemptsPerDayResponse.setMessage(_ctx.stringValue("SaveMaxAttemptsPerDayResponse.Message"));
		saveMaxAttemptsPerDayResponse.setHttpStatusCode(_ctx.integerValue("SaveMaxAttemptsPerDayResponse.HttpStatusCode"));
	 
	 	return saveMaxAttemptsPerDayResponse;
	}
}