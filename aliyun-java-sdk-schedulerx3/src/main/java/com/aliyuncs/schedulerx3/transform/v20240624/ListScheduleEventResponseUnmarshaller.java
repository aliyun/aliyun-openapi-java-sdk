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

import com.aliyuncs.schedulerx3.model.v20240624.ListScheduleEventResponse;
import com.aliyuncs.schedulerx3.model.v20240624.ListScheduleEventResponse.Data;
import com.aliyuncs.schedulerx3.model.v20240624.ListScheduleEventResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScheduleEventResponseUnmarshaller {

	public static ListScheduleEventResponse unmarshall(ListScheduleEventResponse listScheduleEventResponse, UnmarshallerContext _ctx) {
		
		listScheduleEventResponse.setRequestId(_ctx.stringValue("ListScheduleEventResponse.RequestId"));
		listScheduleEventResponse.setCode(_ctx.integerValue("ListScheduleEventResponse.Code"));
		listScheduleEventResponse.setMessage(_ctx.stringValue("ListScheduleEventResponse.Message"));
		listScheduleEventResponse.setSuccess(_ctx.booleanValue("ListScheduleEventResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListScheduleEventResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListScheduleEventResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListScheduleEventResponse.Data.Total"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("ListScheduleEventResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setAppName(_ctx.stringValue("ListScheduleEventResponse.Data.Records["+ i +"].AppName"));
			record.setJobName(_ctx.stringValue("ListScheduleEventResponse.Data.Records["+ i +"].JobName"));
			record.setJobExecutionId(_ctx.stringValue("ListScheduleEventResponse.Data.Records["+ i +"].JobExecutionId"));
			record.setEvent(_ctx.stringValue("ListScheduleEventResponse.Data.Records["+ i +"].Event"));
			record.setWorkerAddr(_ctx.stringValue("ListScheduleEventResponse.Data.Records["+ i +"].WorkerAddr"));
			record.setContent(_ctx.stringValue("ListScheduleEventResponse.Data.Records["+ i +"].Content"));
			record.setTime(_ctx.stringValue("ListScheduleEventResponse.Data.Records["+ i +"].Time"));

			records.add(record);
		}
		data.setRecords(records);
		listScheduleEventResponse.setData(data);
	 
	 	return listScheduleEventResponse;
	}
}