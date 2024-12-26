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

import com.aliyuncs.schedulerx3.model.v20240624.ListAlarmEventResponse;
import com.aliyuncs.schedulerx3.model.v20240624.ListAlarmEventResponse.Data;
import com.aliyuncs.schedulerx3.model.v20240624.ListAlarmEventResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlarmEventResponseUnmarshaller {

	public static ListAlarmEventResponse unmarshall(ListAlarmEventResponse listAlarmEventResponse, UnmarshallerContext _ctx) {
		
		listAlarmEventResponse.setRequestId(_ctx.stringValue("ListAlarmEventResponse.RequestId"));
		listAlarmEventResponse.setCode(_ctx.integerValue("ListAlarmEventResponse.Code"));
		listAlarmEventResponse.setMessage(_ctx.stringValue("ListAlarmEventResponse.Message"));
		listAlarmEventResponse.setSuccess(_ctx.booleanValue("ListAlarmEventResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListAlarmEventResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListAlarmEventResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListAlarmEventResponse.Data.Total"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("ListAlarmEventResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setAppName(_ctx.stringValue("ListAlarmEventResponse.Data.Records["+ i +"].AppName"));
			record.setJobName(_ctx.stringValue("ListAlarmEventResponse.Data.Records["+ i +"].JobName"));
			record.setAlarmType(_ctx.stringValue("ListAlarmEventResponse.Data.Records["+ i +"].AlarmType"));
			record.setAlarmChannel(_ctx.stringValue("ListAlarmEventResponse.Data.Records["+ i +"].AlarmChannel"));
			record.setAlarmContacts(_ctx.stringValue("ListAlarmEventResponse.Data.Records["+ i +"].AlarmContacts"));
			record.setAlarmStatus(_ctx.stringValue("ListAlarmEventResponse.Data.Records["+ i +"].AlarmStatus"));
			record.setAlarmMessage(_ctx.stringValue("ListAlarmEventResponse.Data.Records["+ i +"].AlarmMessage"));
			record.setTime(_ctx.stringValue("ListAlarmEventResponse.Data.Records["+ i +"].Time"));

			records.add(record);
		}
		data.setRecords(records);
		listAlarmEventResponse.setData(data);
	 
	 	return listAlarmEventResponse;
	}
}