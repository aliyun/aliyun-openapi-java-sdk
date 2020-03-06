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

package com.aliyuncs.cloudesl.transform.v20190801;

import com.aliyuncs.cloudesl.model.v20190801.UpdateEslDeviceLightResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateEslDeviceLightResponseUnmarshaller {

	public static UpdateEslDeviceLightResponse unmarshall(UpdateEslDeviceLightResponse updateEslDeviceLightResponse, UnmarshallerContext _ctx) {
		
		updateEslDeviceLightResponse.setRequestId(_ctx.stringValue("UpdateEslDeviceLightResponse.RequestId"));
		updateEslDeviceLightResponse.setErrorMessage(_ctx.stringValue("UpdateEslDeviceLightResponse.ErrorMessage"));
		updateEslDeviceLightResponse.setErrorCode(_ctx.stringValue("UpdateEslDeviceLightResponse.ErrorCode"));
		updateEslDeviceLightResponse.setFailEslBarCodes(_ctx.stringValue("UpdateEslDeviceLightResponse.FailEslBarCodes"));
		updateEslDeviceLightResponse.setMessage(_ctx.stringValue("UpdateEslDeviceLightResponse.Message"));
		updateEslDeviceLightResponse.setSuccessCount(_ctx.longValue("UpdateEslDeviceLightResponse.SuccessCount"));
		updateEslDeviceLightResponse.setFailCount(_ctx.longValue("UpdateEslDeviceLightResponse.FailCount"));
		updateEslDeviceLightResponse.setDynamicCode(_ctx.stringValue("UpdateEslDeviceLightResponse.DynamicCode"));
		updateEslDeviceLightResponse.setCode(_ctx.stringValue("UpdateEslDeviceLightResponse.Code"));
		updateEslDeviceLightResponse.setDynamicMessage(_ctx.stringValue("UpdateEslDeviceLightResponse.DynamicMessage"));
		updateEslDeviceLightResponse.setSuccess(_ctx.booleanValue("UpdateEslDeviceLightResponse.Success"));
	 
	 	return updateEslDeviceLightResponse;
	}
}