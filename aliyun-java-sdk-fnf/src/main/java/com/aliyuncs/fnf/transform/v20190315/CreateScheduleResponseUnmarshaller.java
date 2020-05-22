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

import com.aliyuncs.fnf.model.v20190315.CreateScheduleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateScheduleResponseUnmarshaller {

	public static CreateScheduleResponse unmarshall(CreateScheduleResponse createScheduleResponse, UnmarshallerContext _ctx) {
		
		createScheduleResponse.setRequestId(_ctx.stringValue("CreateScheduleResponse.RequestId"));
		createScheduleResponse.setScheduleName(_ctx.stringValue("CreateScheduleResponse.ScheduleName"));
		createScheduleResponse.setDescription(_ctx.stringValue("CreateScheduleResponse.Description"));
		createScheduleResponse.setScheduleId(_ctx.stringValue("CreateScheduleResponse.ScheduleId"));
		createScheduleResponse.setPayload(_ctx.stringValue("CreateScheduleResponse.Payload"));
		createScheduleResponse.setCronExpression(_ctx.stringValue("CreateScheduleResponse.CronExpression"));
		createScheduleResponse.setEnable(_ctx.booleanValue("CreateScheduleResponse.Enable"));
		createScheduleResponse.setCreatedTime(_ctx.stringValue("CreateScheduleResponse.CreatedTime"));
		createScheduleResponse.setLastModifiedTime(_ctx.stringValue("CreateScheduleResponse.LastModifiedTime"));
	 
	 	return createScheduleResponse;
	}
}