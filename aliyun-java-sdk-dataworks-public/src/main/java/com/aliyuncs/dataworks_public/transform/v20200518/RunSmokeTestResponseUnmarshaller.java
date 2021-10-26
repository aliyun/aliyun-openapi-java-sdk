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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.RunSmokeTestResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RunSmokeTestResponseUnmarshaller {

	public static RunSmokeTestResponse unmarshall(RunSmokeTestResponse runSmokeTestResponse, UnmarshallerContext _ctx) {
		
		runSmokeTestResponse.setRequestId(_ctx.stringValue("RunSmokeTestResponse.RequestId"));
		runSmokeTestResponse.setHttpStatusCode(_ctx.integerValue("RunSmokeTestResponse.HttpStatusCode"));
		runSmokeTestResponse.setData(_ctx.longValue("RunSmokeTestResponse.Data"));
		runSmokeTestResponse.setErrorMessage(_ctx.stringValue("RunSmokeTestResponse.ErrorMessage"));
		runSmokeTestResponse.setErrorCode(_ctx.stringValue("RunSmokeTestResponse.ErrorCode"));
		runSmokeTestResponse.setSuccess(_ctx.booleanValue("RunSmokeTestResponse.Success"));
	 
	 	return runSmokeTestResponse;
	}
}