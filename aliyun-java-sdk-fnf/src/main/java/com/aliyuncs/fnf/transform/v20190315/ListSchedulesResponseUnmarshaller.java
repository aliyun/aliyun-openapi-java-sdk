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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.fnf.model.v20190315.ListSchedulesResponse;
import com.aliyuncs.fnf.model.v20190315.ListSchedulesResponse.SchedulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSchedulesResponseUnmarshaller {

	public static ListSchedulesResponse unmarshall(ListSchedulesResponse listSchedulesResponse, UnmarshallerContext _ctx) {
		
		listSchedulesResponse.setRequestId(_ctx.stringValue("ListSchedulesResponse.RequestId"));
		listSchedulesResponse.setNextToken(_ctx.stringValue("ListSchedulesResponse.NextToken"));

		List<SchedulesItem> schedules = new ArrayList<SchedulesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSchedulesResponse.Schedules.Length"); i++) {
			SchedulesItem schedulesItem = new SchedulesItem();
			schedulesItem.setScheduleName(_ctx.stringValue("ListSchedulesResponse.Schedules["+ i +"].ScheduleName"));
			schedulesItem.setDescription(_ctx.stringValue("ListSchedulesResponse.Schedules["+ i +"].Description"));
			schedulesItem.setScheduleId(_ctx.stringValue("ListSchedulesResponse.Schedules["+ i +"].ScheduleId"));
			schedulesItem.setPayload(_ctx.stringValue("ListSchedulesResponse.Schedules["+ i +"].Payload"));
			schedulesItem.setCronExpression(_ctx.stringValue("ListSchedulesResponse.Schedules["+ i +"].CronExpression"));
			schedulesItem.setEnable(_ctx.booleanValue("ListSchedulesResponse.Schedules["+ i +"].Enable"));
			schedulesItem.setCreatedTime(_ctx.stringValue("ListSchedulesResponse.Schedules["+ i +"].CreatedTime"));
			schedulesItem.setLastModifiedTime(_ctx.stringValue("ListSchedulesResponse.Schedules["+ i +"].LastModifiedTime"));

			schedules.add(schedulesItem);
		}
		listSchedulesResponse.setSchedules(schedules);
	 
	 	return listSchedulesResponse;
	}
}