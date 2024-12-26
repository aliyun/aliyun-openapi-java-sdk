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

package com.aliyuncs.schedulerx3.transform.v20240624;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx3.model.v20240624.ListJobExecutionsResponse;
import com.aliyuncs.schedulerx3.model.v20240624.ListJobExecutionsResponse.Data;
import com.aliyuncs.schedulerx3.model.v20240624.ListJobExecutionsResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobExecutionsResponseUnmarshaller {

	public static ListJobExecutionsResponse unmarshall(ListJobExecutionsResponse listJobExecutionsResponse, UnmarshallerContext _ctx) {
		
		listJobExecutionsResponse.setRequestId(_ctx.stringValue("ListJobExecutionsResponse.RequestId"));
		listJobExecutionsResponse.setCode(_ctx.integerValue("ListJobExecutionsResponse.Code"));
		listJobExecutionsResponse.setMessage(_ctx.stringValue("ListJobExecutionsResponse.Message"));
		listJobExecutionsResponse.setSuccess(_ctx.booleanValue("ListJobExecutionsResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListJobExecutionsResponse.Data.Total"));
		data.setPageNumber(_ctx.integerValue("ListJobExecutionsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListJobExecutionsResponse.Data.PageSize"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("ListJobExecutionsResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setJobExecutionId(_ctx.stringValue("ListJobExecutionsResponse.Data.Records["+ i +"].JobExecutionId"));
			record.setJobId(_ctx.longValue("ListJobExecutionsResponse.Data.Records["+ i +"].JobId"));
			record.setJobName(_ctx.stringValue("ListJobExecutionsResponse.Data.Records["+ i +"].JobName"));
			record.setJobType(_ctx.stringValue("ListJobExecutionsResponse.Data.Records["+ i +"].JobType"));
			record.setParameters(_ctx.stringValue("ListJobExecutionsResponse.Data.Records["+ i +"].Parameters"));
			record.setScheduleTime(_ctx.stringValue("ListJobExecutionsResponse.Data.Records["+ i +"].ScheduleTime"));
			record.setDataTime(_ctx.stringValue("ListJobExecutionsResponse.Data.Records["+ i +"].DataTime"));
			record.setStartTime(_ctx.stringValue("ListJobExecutionsResponse.Data.Records["+ i +"].StartTime"));
			record.setEndTime(_ctx.stringValue("ListJobExecutionsResponse.Data.Records["+ i +"].EndTime"));
			record.setDuration(_ctx.longValue("ListJobExecutionsResponse.Data.Records["+ i +"].Duration"));
			record.setExecutor(_ctx.stringValue("ListJobExecutionsResponse.Data.Records["+ i +"].Executor"));
			record.setResult(_ctx.stringValue("ListJobExecutionsResponse.Data.Records["+ i +"].Result"));
			record.setStatus(_ctx.integerValue("ListJobExecutionsResponse.Data.Records["+ i +"].Status"));
			record.setTimeType(_ctx.integerValue("ListJobExecutionsResponse.Data.Records["+ i +"].TimeType"));
			record.setAttempt(_ctx.integerValue("ListJobExecutionsResponse.Data.Records["+ i +"].Attempt"));
			record.setWorkAddr(_ctx.stringValue("ListJobExecutionsResponse.Data.Records["+ i +"].WorkAddr"));
			record.setAppName(_ctx.stringValue("ListJobExecutionsResponse.Data.Records["+ i +"].AppName"));
			record.setRouteStrategy(_ctx.integerValue("ListJobExecutionsResponse.Data.Records["+ i +"].RouteStrategy"));
			record.setServerIp(_ctx.stringValue("ListJobExecutionsResponse.Data.Records["+ i +"].ServerIp"));
			record.setTriggerType(_ctx.integerValue("ListJobExecutionsResponse.Data.Records["+ i +"].TriggerType"));

			records.add(record);
		}
		data.setRecords(records);
		listJobExecutionsResponse.setData(data);
	 
	 	return listJobExecutionsResponse;
	}
}