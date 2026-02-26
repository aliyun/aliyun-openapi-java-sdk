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

package com.aliyuncs.dypnsapi_intl.transform.v20170725;

import com.aliyuncs.dypnsapi_intl.model.v20170725.StartVerificationResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartVerificationResponseUnmarshaller {

	public static StartVerificationResponse unmarshall(StartVerificationResponse startVerificationResponse, UnmarshallerContext _ctx) {
		
		startVerificationResponse.setRequestId(_ctx.stringValue("StartVerificationResponse.RequestId"));
		startVerificationResponse.setMessage(_ctx.stringValue("StartVerificationResponse.Message"));
		startVerificationResponse.setModel(_ctx.mapValue("StartVerificationResponse.Model"));
		startVerificationResponse.setCode(_ctx.stringValue("StartVerificationResponse.Code"));
		startVerificationResponse.setSuccess(_ctx.booleanValue("StartVerificationResponse.Success"));
	 
	 	return startVerificationResponse;
	}
}