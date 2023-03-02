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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.DescribeDatabaseSlowLogRecordsResponse;
import com.aliyuncs.swas_open.model.v20200601.DescribeDatabaseSlowLogRecordsResponse.SlowLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDatabaseSlowLogRecordsResponseUnmarshaller {

	public static DescribeDatabaseSlowLogRecordsResponse unmarshall(DescribeDatabaseSlowLogRecordsResponse describeDatabaseSlowLogRecordsResponse, UnmarshallerContext _ctx) {
		
		describeDatabaseSlowLogRecordsResponse.setRequestId(_ctx.stringValue("DescribeDatabaseSlowLogRecordsResponse.RequestId"));
		describeDatabaseSlowLogRecordsResponse.setPageNumber(_ctx.integerValue("DescribeDatabaseSlowLogRecordsResponse.PageNumber"));
		describeDatabaseSlowLogRecordsResponse.setPageSize(_ctx.integerValue("DescribeDatabaseSlowLogRecordsResponse.PageSize"));
		describeDatabaseSlowLogRecordsResponse.setTotalCount(_ctx.integerValue("DescribeDatabaseSlowLogRecordsResponse.TotalCount"));
		describeDatabaseSlowLogRecordsResponse.setPhysicalIORead(_ctx.longValue("DescribeDatabaseSlowLogRecordsResponse.PhysicalIORead"));
		describeDatabaseSlowLogRecordsResponse.setEngine(_ctx.stringValue("DescribeDatabaseSlowLogRecordsResponse.Engine"));

		List<SlowLog> slowLogs = new ArrayList<SlowLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDatabaseSlowLogRecordsResponse.SlowLogs.Length"); i++) {
			SlowLog slowLog = new SlowLog();
			slowLog.setHostAddress(_ctx.stringValue("DescribeDatabaseSlowLogRecordsResponse.SlowLogs["+ i +"].HostAddress"));
			slowLog.setQueryTimes(_ctx.longValue("DescribeDatabaseSlowLogRecordsResponse.SlowLogs["+ i +"].QueryTimes"));
			slowLog.setSQLText(_ctx.stringValue("DescribeDatabaseSlowLogRecordsResponse.SlowLogs["+ i +"].SQLText"));
			slowLog.setQueryTimeMS(_ctx.longValue("DescribeDatabaseSlowLogRecordsResponse.SlowLogs["+ i +"].QueryTimeMS"));
			slowLog.setLockTimes(_ctx.longValue("DescribeDatabaseSlowLogRecordsResponse.SlowLogs["+ i +"].LockTimes"));
			slowLog.setExecutionStartTime(_ctx.stringValue("DescribeDatabaseSlowLogRecordsResponse.SlowLogs["+ i +"].ExecutionStartTime"));
			slowLog.setReturnRowCounts(_ctx.longValue("DescribeDatabaseSlowLogRecordsResponse.SlowLogs["+ i +"].ReturnRowCounts"));
			slowLog.setParseRowCounts(_ctx.longValue("DescribeDatabaseSlowLogRecordsResponse.SlowLogs["+ i +"].ParseRowCounts"));
			slowLog.setDBName(_ctx.stringValue("DescribeDatabaseSlowLogRecordsResponse.SlowLogs["+ i +"].DBName"));

			slowLogs.add(slowLog);
		}
		describeDatabaseSlowLogRecordsResponse.setSlowLogs(slowLogs);
	 
	 	return describeDatabaseSlowLogRecordsResponse;
	}
}