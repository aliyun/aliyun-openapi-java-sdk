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

package com.aliyuncs.viapi_oxs_cross.transform.v20200701;

import com.aliyuncs.viapi_oxs_cross.model.v20200701.StartSDKInstanceProductionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartSDKInstanceProductionResponseUnmarshaller {

	public static StartSDKInstanceProductionResponse unmarshall(StartSDKInstanceProductionResponse startSDKInstanceProductionResponse, UnmarshallerContext _ctx) {
		
		startSDKInstanceProductionResponse.setRequestId(_ctx.stringValue("StartSDKInstanceProductionResponse.RequestId"));
		startSDKInstanceProductionResponse.setOk(_ctx.booleanValue("StartSDKInstanceProductionResponse.Ok"));
		startSDKInstanceProductionResponse.setCode(_ctx.stringValue("StartSDKInstanceProductionResponse.Code"));
		startSDKInstanceProductionResponse.setHttpCode(_ctx.integerValue("StartSDKInstanceProductionResponse.HttpCode"));
		startSDKInstanceProductionResponse.setErrorMessage(_ctx.stringValue("StartSDKInstanceProductionResponse.ErrorMessage"));
	 
	 	return startSDKInstanceProductionResponse;
	}
}