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

package com.aliyuncs.fnf.transform.v20190315;

import com.aliyuncs.fnf.model.v20190315.UpdateScheduleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateScheduleResponseUnmarshaller {

	public static UpdateScheduleResponse unmarshall(UpdateScheduleResponse updateScheduleResponse, UnmarshallerContext _ctx) {
		
		updateScheduleResponse.setRequestId(_ctx.stringValue("UpdateScheduleResponse.RequestId"));
		updateScheduleResponse.setScheduleName(_ctx.stringValue("UpdateScheduleResponse.ScheduleName"));
		updateScheduleResponse.setDescription(_ctx.stringValue("UpdateScheduleResponse.Description"));
		updateScheduleResponse.setScheduleId(_ctx.stringValue("UpdateScheduleResponse.ScheduleId"));
		updateScheduleResponse.setPayload(_ctx.stringValue("UpdateScheduleResponse.Payload"));
		updateScheduleResponse.setCronExpression(_ctx.stringValue("UpdateScheduleResponse.CronExpression"));
		updateScheduleResponse.setEnable(_ctx.booleanValue("UpdateScheduleResponse.Enable"));
		updateScheduleResponse.setCreatedTime(_ctx.stringValue("UpdateScheduleResponse.CreatedTime"));
		updateScheduleResponse.setLastModifiedTime(_ctx.stringValue("UpdateScheduleResponse.LastModifiedTime"));
	 
	 	return updateScheduleResponse;
	}
}