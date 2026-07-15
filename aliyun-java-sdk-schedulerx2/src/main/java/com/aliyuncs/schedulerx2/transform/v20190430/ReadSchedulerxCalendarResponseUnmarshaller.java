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

package com.aliyuncs.schedulerx2.transform.v20190430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxCalendarResponse;
import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxCalendarResponse.AccessDeniedDetail;
import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxCalendarResponse.Data;
import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxCalendarResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReadSchedulerxCalendarResponseUnmarshaller {

	public static ReadSchedulerxCalendarResponse unmarshall(ReadSchedulerxCalendarResponse readSchedulerxCalendarResponse, UnmarshallerContext _ctx) {
		
		readSchedulerxCalendarResponse.setRequestId(_ctx.stringValue("ReadSchedulerxCalendarResponse.RequestId"));
		readSchedulerxCalendarResponse.setMessage(_ctx.stringValue("ReadSchedulerxCalendarResponse.Message"));
		readSchedulerxCalendarResponse.setCode(_ctx.integerValue("ReadSchedulerxCalendarResponse.Code"));
		readSchedulerxCalendarResponse.setSuccess(_ctx.booleanValue("ReadSchedulerxCalendarResponse.Success"));

		AccessDeniedDetail accessDeniedDetail = new AccessDeniedDetail();
		accessDeniedDetail.setPolicyType(_ctx.stringValue("ReadSchedulerxCalendarResponse.AccessDeniedDetail.PolicyType"));
		accessDeniedDetail.setAuthPrincipalOwnerId(_ctx.stringValue("ReadSchedulerxCalendarResponse.AccessDeniedDetail.AuthPrincipalOwnerId"));
		accessDeniedDetail.setEncodedDiagnosticMessage(_ctx.stringValue("ReadSchedulerxCalendarResponse.AccessDeniedDetail.EncodedDiagnosticMessage"));
		accessDeniedDetail.setAuthPrincipalType(_ctx.stringValue("ReadSchedulerxCalendarResponse.AccessDeniedDetail.AuthPrincipalType"));
		accessDeniedDetail.setAuthPrincipalDisplayName(_ctx.stringValue("ReadSchedulerxCalendarResponse.AccessDeniedDetail.AuthPrincipalDisplayName"));
		accessDeniedDetail.setNoPermissionType(_ctx.stringValue("ReadSchedulerxCalendarResponse.AccessDeniedDetail.NoPermissionType"));
		accessDeniedDetail.setAuthAction(_ctx.stringValue("ReadSchedulerxCalendarResponse.AccessDeniedDetail.AuthAction"));
		readSchedulerxCalendarResponse.setAccessDeniedDetail(accessDeniedDetail);

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ReadSchedulerxCalendarResponse.Data.NextToken"));
		data.setTotal(_ctx.longValue("ReadSchedulerxCalendarResponse.Data.Total"));
		data.setMaxResults(_ctx.integerValue("ReadSchedulerxCalendarResponse.Data.MaxResults"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("ReadSchedulerxCalendarResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setYear(_ctx.integerValue("ReadSchedulerxCalendarResponse.Data.Records["+ i +"].Year"));
			record.setSystemCalendar(_ctx.booleanValue("ReadSchedulerxCalendarResponse.Data.Records["+ i +"].SystemCalendar"));
			record.setCalendarName(_ctx.stringValue("ReadSchedulerxCalendarResponse.Data.Records["+ i +"].CalendarName"));
			record.setCreator(_ctx.stringValue("ReadSchedulerxCalendarResponse.Data.Records["+ i +"].Creator"));
			record.setMonthDaysContent(_ctx.stringValue("ReadSchedulerxCalendarResponse.Data.Records["+ i +"].MonthDaysContent"));

			records.add(record);
		}
		data.setRecords(records);
		readSchedulerxCalendarResponse.setData(data);
	 
	 	return readSchedulerxCalendarResponse;
	}
}