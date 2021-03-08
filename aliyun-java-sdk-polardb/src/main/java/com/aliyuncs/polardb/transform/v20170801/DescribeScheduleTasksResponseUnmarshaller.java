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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeScheduleTasksResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeScheduleTasksResponse.Data;
import com.aliyuncs.polardb.model.v20170801.DescribeScheduleTasksResponse.Data.TimerInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScheduleTasksResponseUnmarshaller {

	public static DescribeScheduleTasksResponse unmarshall(DescribeScheduleTasksResponse describeScheduleTasksResponse, UnmarshallerContext _ctx) {
		
		describeScheduleTasksResponse.setMessage(_ctx.stringValue("DescribeScheduleTasksResponse.Message"));
		describeScheduleTasksResponse.setCode(_ctx.stringValue("DescribeScheduleTasksResponse.Code"));
		describeScheduleTasksResponse.setSuccess(_ctx.booleanValue("DescribeScheduleTasksResponse.Success"));

		Data data = new Data();
		data.setTotalRecordCount(_ctx.integerValue("DescribeScheduleTasksResponse.Data.TotalRecordCount"));
		data.setPageSize(_ctx.integerValue("DescribeScheduleTasksResponse.Data.PageSize"));
		data.setPageNumber(_ctx.integerValue("DescribeScheduleTasksResponse.Data.PageNumber"));

		List<TimerInfosItem> timerInfos = new ArrayList<TimerInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScheduleTasksResponse.Data.TimerInfos.Length"); i++) {
			TimerInfosItem timerInfosItem = new TimerInfosItem();
			timerInfosItem.setStatus(_ctx.stringValue("DescribeScheduleTasksResponse.Data.TimerInfos["+ i +"].Status"));
			timerInfosItem.setAction(_ctx.stringValue("DescribeScheduleTasksResponse.Data.TimerInfos["+ i +"].Action"));
			timerInfosItem.setTaskId(_ctx.stringValue("DescribeScheduleTasksResponse.Data.TimerInfos["+ i +"].TaskId"));
			timerInfosItem.setPlannedTime(_ctx.stringValue("DescribeScheduleTasksResponse.Data.TimerInfos["+ i +"].PlannedTime"));
			timerInfosItem.setDbClusterDescription(_ctx.stringValue("DescribeScheduleTasksResponse.Data.TimerInfos["+ i +"].DbClusterDescription"));
			timerInfosItem.setPlannedStartTime(_ctx.stringValue("DescribeScheduleTasksResponse.Data.TimerInfos["+ i +"].PlannedStartTime"));
			timerInfosItem.setDBClusterId(_ctx.stringValue("DescribeScheduleTasksResponse.Data.TimerInfos["+ i +"].DBClusterId"));
			timerInfosItem.setRegion(_ctx.stringValue("DescribeScheduleTasksResponse.Data.TimerInfos["+ i +"].Region"));
			timerInfosItem.setOrderId(_ctx.stringValue("DescribeScheduleTasksResponse.Data.TimerInfos["+ i +"].OrderId"));
			timerInfosItem.setPlannedEndTime(_ctx.stringValue("DescribeScheduleTasksResponse.Data.TimerInfos["+ i +"].PlannedEndTime"));
			timerInfosItem.setDbClusterStatus(_ctx.stringValue("DescribeScheduleTasksResponse.Data.TimerInfos["+ i +"].DbClusterStatus"));

			timerInfos.add(timerInfosItem);
		}
		data.setTimerInfos(timerInfos);
		describeScheduleTasksResponse.setData(data);
	 
	 	return describeScheduleTasksResponse;
	}
}