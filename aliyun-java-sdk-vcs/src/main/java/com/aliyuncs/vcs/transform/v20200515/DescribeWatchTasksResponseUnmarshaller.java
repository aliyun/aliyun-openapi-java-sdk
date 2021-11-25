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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.DescribeWatchTasksResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeWatchTasksResponse.Data;
import com.aliyuncs.vcs.model.v20200515.DescribeWatchTasksResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWatchTasksResponseUnmarshaller {

	public static DescribeWatchTasksResponse unmarshall(DescribeWatchTasksResponse describeWatchTasksResponse, UnmarshallerContext _ctx) {
		
		describeWatchTasksResponse.setRequestId(_ctx.stringValue("DescribeWatchTasksResponse.RequestId"));
		describeWatchTasksResponse.setSuccess(_ctx.booleanValue("DescribeWatchTasksResponse.Success"));
		describeWatchTasksResponse.setCode(_ctx.stringValue("DescribeWatchTasksResponse.Code"));
		describeWatchTasksResponse.setMessage(_ctx.stringValue("DescribeWatchTasksResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("DescribeWatchTasksResponse.Data.TotalCount"));
		data.setPageSize(_ctx.longValue("DescribeWatchTasksResponse.Data.PageSize"));
		data.setPageNumber(_ctx.longValue("DescribeWatchTasksResponse.Data.PageNumber"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWatchTasksResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setWatchTaskId(_ctx.stringValue("DescribeWatchTasksResponse.Data.Records["+ i +"].WatchTaskId"));
			record.setTaskName(_ctx.stringValue("DescribeWatchTasksResponse.Data.Records["+ i +"].TaskName"));
			record.setCorpId(_ctx.stringValue("DescribeWatchTasksResponse.Data.Records["+ i +"].CorpId"));
			record.setDeviceList(_ctx.stringValue("DescribeWatchTasksResponse.Data.Records["+ i +"].DeviceList"));
			record.setScheduleType(_ctx.stringValue("DescribeWatchTasksResponse.Data.Records["+ i +"].ScheduleType"));
			record.setScheduleCycleDates(_ctx.stringValue("DescribeWatchTasksResponse.Data.Records["+ i +"].ScheduleCycleDates"));
			record.setScheduleTimes(_ctx.stringValue("DescribeWatchTasksResponse.Data.Records["+ i +"].ScheduleTimes"));
			record.setWatchPolicyIds(_ctx.stringValue("DescribeWatchTasksResponse.Data.Records["+ i +"].WatchPolicyIds"));
			record.setMessageReceiver(_ctx.stringValue("DescribeWatchTasksResponse.Data.Records["+ i +"].MessageReceiver"));
			record.setDescription(_ctx.stringValue("DescribeWatchTasksResponse.Data.Records["+ i +"].Description"));

			records.add(record);
		}
		data.setRecords(records);
		describeWatchTasksResponse.setData(data);
	 
	 	return describeWatchTasksResponse;
	}
}