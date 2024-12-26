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

import com.aliyuncs.schedulerx3.model.v20240624.ListAppsResponse;
import com.aliyuncs.schedulerx3.model.v20240624.ListAppsResponse.Data;
import com.aliyuncs.schedulerx3.model.v20240624.ListAppsResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppsResponseUnmarshaller {

	public static ListAppsResponse unmarshall(ListAppsResponse listAppsResponse, UnmarshallerContext _ctx) {
		
		listAppsResponse.setRequestId(_ctx.stringValue("ListAppsResponse.RequestId"));
		listAppsResponse.setCode(_ctx.integerValue("ListAppsResponse.Code"));
		listAppsResponse.setMessage(_ctx.stringValue("ListAppsResponse.Message"));
		listAppsResponse.setSuccess(_ctx.booleanValue("ListAppsResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListAppsResponse.Data.Total"));
		data.setPageNumber(_ctx.integerValue("ListAppsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListAppsResponse.Data.PageSize"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("ListAppsResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setId(_ctx.longValue("ListAppsResponse.Data.Records["+ i +"].Id"));
			record.setAppName(_ctx.stringValue("ListAppsResponse.Data.Records["+ i +"].AppName"));
			record.setAccessToken(_ctx.stringValue("ListAppsResponse.Data.Records["+ i +"].AccessToken"));
			record.setTitle(_ctx.stringValue("ListAppsResponse.Data.Records["+ i +"].Title"));
			record.setCreator(_ctx.stringValue("ListAppsResponse.Data.Records["+ i +"].Creator"));
			record.setUpdater(_ctx.stringValue("ListAppsResponse.Data.Records["+ i +"].Updater"));
			record.setLeader(_ctx.stringValue("ListAppsResponse.Data.Records["+ i +"].Leader"));
			record.setCalendar(_ctx.stringValue("ListAppsResponse.Data.Records["+ i +"].Calendar"));
			record.setMaxJobs(_ctx.integerValue("ListAppsResponse.Data.Records["+ i +"].MaxJobs"));
			record.setMaxConcurrency(_ctx.integerValue("ListAppsResponse.Data.Records["+ i +"].MaxConcurrency"));
			record.setNoticeConfig(_ctx.stringValue("ListAppsResponse.Data.Records["+ i +"].NoticeConfig"));
			record.setNoticeContacts(_ctx.stringValue("ListAppsResponse.Data.Records["+ i +"].NoticeContacts"));
			record.setJobNum(_ctx.integerValue("ListAppsResponse.Data.Records["+ i +"].JobNum"));
			record.setExecutorNum(_ctx.longValue("ListAppsResponse.Data.Records["+ i +"].ExecutorNum"));
			record.setEnableLog(_ctx.booleanValue("ListAppsResponse.Data.Records["+ i +"].EnableLog"));

			records.add(record);
		}
		data.setRecords(records);
		listAppsResponse.setData(data);
	 
	 	return listAppsResponse;
	}
}