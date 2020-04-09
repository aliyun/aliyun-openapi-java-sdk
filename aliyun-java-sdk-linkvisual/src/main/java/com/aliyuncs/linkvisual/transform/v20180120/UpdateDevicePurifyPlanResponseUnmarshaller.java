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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.UpdateDevicePurifyPlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDevicePurifyPlanResponseUnmarshaller {

	public static UpdateDevicePurifyPlanResponse unmarshall(UpdateDevicePurifyPlanResponse updateDevicePurifyPlanResponse, UnmarshallerContext _ctx) {
		
		updateDevicePurifyPlanResponse.setRequestId(_ctx.stringValue("UpdateDevicePurifyPlanResponse.RequestId"));
		updateDevicePurifyPlanResponse.setSuccess(_ctx.booleanValue("UpdateDevicePurifyPlanResponse.Success"));
		updateDevicePurifyPlanResponse.setErrorMessage(_ctx.stringValue("UpdateDevicePurifyPlanResponse.ErrorMessage"));
		updateDevicePurifyPlanResponse.setCode(_ctx.stringValue("UpdateDevicePurifyPlanResponse.Code"));
	 
	 	return updateDevicePurifyPlanResponse;
	}
}