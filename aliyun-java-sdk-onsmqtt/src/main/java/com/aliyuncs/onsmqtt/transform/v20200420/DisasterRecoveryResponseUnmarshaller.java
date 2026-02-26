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

package com.aliyuncs.onsmqtt.transform.v20200420;

import com.aliyuncs.onsmqtt.model.v20200420.DisasterRecoveryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisasterRecoveryResponseUnmarshaller {

	public static DisasterRecoveryResponse unmarshall(DisasterRecoveryResponse disasterRecoveryResponse, UnmarshallerContext _ctx) {
		
		disasterRecoveryResponse.setRequestId(_ctx.stringValue("DisasterRecoveryResponse.RequestId"));
		disasterRecoveryResponse.setCode(_ctx.integerValue("DisasterRecoveryResponse.Code"));
		disasterRecoveryResponse.setSuccess(_ctx.booleanValue("DisasterRecoveryResponse.Success"));
		disasterRecoveryResponse.setMessage(_ctx.stringValue("DisasterRecoveryResponse.Message"));
		disasterRecoveryResponse.setAccessDeniedDetail(_ctx.stringValue("DisasterRecoveryResponse.AccessDeniedDetail"));
	 
	 	return disasterRecoveryResponse;
	}
}