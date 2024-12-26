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

import com.aliyuncs.schedulerx3.model.v20240624.ListJobsResponse;
import com.aliyuncs.schedulerx3.model.v20240624.ListJobsResponse.Data;
import com.aliyuncs.schedulerx3.model.v20240624.ListJobsResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobsResponseUnmarshaller {

	public static ListJobsResponse unmarshall(ListJobsResponse listJobsResponse, UnmarshallerContext _ctx) {
		
		listJobsResponse.setRequestId(_ctx.stringValue("ListJobsResponse.RequestId"));
		listJobsResponse.setCode(_ctx.integerValue("ListJobsResponse.Code"));
		listJobsResponse.setMessage(_ctx.stringValue("ListJobsResponse.Message"));
		listJobsResponse.setSuccess(_ctx.booleanValue("ListJobsResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListJobsResponse.Data.Total"));
		data.setPageNumber(_ctx.integerValue("ListJobsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListJobsResponse.Data.PageSize"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("ListJobsResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setJobId(_ctx.longValue("ListJobsResponse.Data.Records["+ i +"].JobId"));
			record.setName(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].Name"));
			record.setDescription(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].Description"));
			record.setJobType(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].JobType"));
			record.setStatus(_ctx.integerValue("ListJobsResponse.Data.Records["+ i +"].Status"));
			record.setParameters(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].Parameters"));
			record.setMaxConcurrency(_ctx.integerValue("ListJobsResponse.Data.Records["+ i +"].MaxConcurrency"));
			record.setMaxAttempt(_ctx.integerValue("ListJobsResponse.Data.Records["+ i +"].MaxAttempt"));
			record.setAttemptInterval(_ctx.integerValue("ListJobsResponse.Data.Records["+ i +"].AttemptInterval"));
			record.setJobHandler(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].JobHandler"));
			record.setPriority(_ctx.integerValue("ListJobsResponse.Data.Records["+ i +"].Priority"));
			record.setTimeType(_ctx.integerValue("ListJobsResponse.Data.Records["+ i +"].TimeType"));
			record.setTimeExpression(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].TimeExpression"));
			record.setTimeZone(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].TimeZone"));
			record.setCalendar(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].Calendar"));
			record.setDataOffset(_ctx.integerValue("ListJobsResponse.Data.Records["+ i +"].DataOffset"));
			record.setCleanMode(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].CleanMode"));
			record.setCreator(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].Creator"));
			record.setUpdater(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].Updater"));
			record.setXattrs(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].Xattrs"));
			record.setNoticeConfig(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].NoticeConfig"));
			record.setNoticeContacts(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].NoticeContacts"));
			record.setRouteStrategy(_ctx.integerValue("ListJobsResponse.Data.Records["+ i +"].RouteStrategy"));
			record.setAppName(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].AppName"));
			record.setStartTime(_ctx.longValue("ListJobsResponse.Data.Records["+ i +"].StartTime"));
			record.setTimezone(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].Timezone"));
			record.setExecutorBlockStrategy(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].ExecutorBlockStrategy"));
			record.setLastExecuteEndTime(_ctx.stringValue("ListJobsResponse.Data.Records["+ i +"].LastExecuteEndTime"));
			record.setLastExecuteStatus(_ctx.integerValue("ListJobsResponse.Data.Records["+ i +"].LastExecuteStatus"));
			record.setCurrentExecuteStatus(_ctx.integerValue("ListJobsResponse.Data.Records["+ i +"].CurrentExecuteStatus"));

			records.add(record);
		}
		data.setRecords(records);
		listJobsResponse.setData(data);
	 
	 	return listJobsResponse;
	}
}