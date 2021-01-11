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
import com.aliyuncs.polardb.model.v20170801.DescribeScheduleTasksResponse.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScheduleTasksResponseUnmarshaller {

	public static DescribeScheduleTasksResponse unmarshall(DescribeScheduleTasksResponse describeScheduleTasksResponse, UnmarshallerContext _ctx) {
		
		describeScheduleTasksResponse.setRequestId(_ctx.stringValue("DescribeScheduleTasksResponse.RequestId"));
		describeScheduleTasksResponse.setCode(_ctx.stringValue("DescribeScheduleTasksResponse.Code"));
		describeScheduleTasksResponse.setHttpStatusCode(_ctx.integerValue("DescribeScheduleTasksResponse.HttpStatusCode"));
		describeScheduleTasksResponse.setMessage(_ctx.stringValue("DescribeScheduleTasksResponse.Message"));
		describeScheduleTasksResponse.setSuccess(_ctx.booleanValue("DescribeScheduleTasksResponse.Success"));

		List<Items> data = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScheduleTasksResponse.Data.Length"); i++) {
			Items items = new Items();
			items.setAction(_ctx.stringValue("DescribeScheduleTasksResponse.Data["+ i +"].Action"));
			items.setArgs(_ctx.stringValue("DescribeScheduleTasksResponse.Data["+ i +"].Args"));
			items.setGmtCreate(_ctx.longValue("DescribeScheduleTasksResponse.Data["+ i +"].GmtCreate"));
			items.setGmtModified(_ctx.longValue("DescribeScheduleTasksResponse.Data["+ i +"].GmtModified"));
			items.setDBClusterId(_ctx.stringValue("DescribeScheduleTasksResponse.Data["+ i +"].DBClusterId"));
			items.setMaxRetryTime(_ctx.integerValue("DescribeScheduleTasksResponse.Data["+ i +"].MaxRetryTime"));
			items.setMutex(_ctx.stringValue("DescribeScheduleTasksResponse.Data["+ i +"].Mutex"));
			items.setOrderId(_ctx.stringValue("DescribeScheduleTasksResponse.Data["+ i +"].OrderId"));
			items.setPlannedEndTime(_ctx.longValue("DescribeScheduleTasksResponse.Data["+ i +"].PlannedEndTime"));
			items.setPlannedStartTime(_ctx.longValue("DescribeScheduleTasksResponse.Data["+ i +"].PlannedStartTime"));
			items.setPlannedTime(_ctx.longValue("DescribeScheduleTasksResponse.Data["+ i +"].PlannedTime"));
			items.setProductCode(_ctx.stringValue("DescribeScheduleTasksResponse.Data["+ i +"].ProductCode"));
			items.setRegion(_ctx.stringValue("DescribeScheduleTasksResponse.Data["+ i +"].Region"));
			items.setResponse(_ctx.stringValue("DescribeScheduleTasksResponse.Data["+ i +"].Response"));
			items.setRetryTime(_ctx.integerValue("DescribeScheduleTasksResponse.Data["+ i +"].RetryTime"));
			items.setStatus(_ctx.stringValue("DescribeScheduleTasksResponse.Data["+ i +"].Status"));
			items.setTaskId(_ctx.stringValue("DescribeScheduleTasksResponse.Data["+ i +"].TaskId"));
			items.setType(_ctx.integerValue("DescribeScheduleTasksResponse.Data["+ i +"].Type"));

			data.add(items);
		}
		describeScheduleTasksResponse.setData(data);
	 
	 	return describeScheduleTasksResponse;
	}
}