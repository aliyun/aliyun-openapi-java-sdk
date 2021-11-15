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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.ChargeLaunchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChargeLaunchResponseUnmarshaller {

	public static ChargeLaunchResponse unmarshall(ChargeLaunchResponse chargeLaunchResponse, UnmarshallerContext _ctx) {
		
		chargeLaunchResponse.setRequestId(_ctx.stringValue("ChargeLaunchResponse.RequestId"));
		chargeLaunchResponse.setSuccess(_ctx.booleanValue("ChargeLaunchResponse.Success"));
		chargeLaunchResponse.setErrorCode(_ctx.integerValue("ChargeLaunchResponse.ErrorCode"));
		chargeLaunchResponse.setErrorMessage(_ctx.stringValue("ChargeLaunchResponse.ErrorMessage"));
		chargeLaunchResponse.setResult(_ctx.stringValue("ChargeLaunchResponse.Result"));
	 
	 	return chargeLaunchResponse;
	}
}