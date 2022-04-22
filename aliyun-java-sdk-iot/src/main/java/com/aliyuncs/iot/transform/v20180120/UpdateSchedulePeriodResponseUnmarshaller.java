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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.UpdateSchedulePeriodResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSchedulePeriodResponseUnmarshaller {

	public static UpdateSchedulePeriodResponse unmarshall(UpdateSchedulePeriodResponse updateSchedulePeriodResponse, UnmarshallerContext _ctx) {
		
		updateSchedulePeriodResponse.setRequestId(_ctx.stringValue("UpdateSchedulePeriodResponse.RequestId"));
		updateSchedulePeriodResponse.setSuccess(_ctx.booleanValue("UpdateSchedulePeriodResponse.Success"));
		updateSchedulePeriodResponse.setCode(_ctx.stringValue("UpdateSchedulePeriodResponse.Code"));
		updateSchedulePeriodResponse.setErrorMessage(_ctx.stringValue("UpdateSchedulePeriodResponse.ErrorMessage"));
	 
	 	return updateSchedulePeriodResponse;
	}
}