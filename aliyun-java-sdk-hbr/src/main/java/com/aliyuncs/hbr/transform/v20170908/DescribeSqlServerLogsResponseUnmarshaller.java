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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeSqlServerLogsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeSqlServerLogsResponse.NextStartKey;
import com.aliyuncs.hbr.model.v20170908.DescribeSqlServerLogsResponse.SqlServerLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSqlServerLogsResponseUnmarshaller {

	public static DescribeSqlServerLogsResponse unmarshall(DescribeSqlServerLogsResponse describeSqlServerLogsResponse, UnmarshallerContext _ctx) {
		
		describeSqlServerLogsResponse.setRequestId(_ctx.stringValue("DescribeSqlServerLogsResponse.RequestId"));
		describeSqlServerLogsResponse.setSuccess(_ctx.booleanValue("DescribeSqlServerLogsResponse.Success"));
		describeSqlServerLogsResponse.setCode(_ctx.stringValue("DescribeSqlServerLogsResponse.Code"));
		describeSqlServerLogsResponse.setMessage(_ctx.stringValue("DescribeSqlServerLogsResponse.Message"));

		NextStartKey nextStartKey = new NextStartKey();
		nextStartKey.setClusterId(_ctx.stringValue("DescribeSqlServerLogsResponse.NextStartKey.ClusterId"));
		nextStartKey.setDatabaseId(_ctx.stringValue("DescribeSqlServerLogsResponse.NextStartKey.DatabaseId"));
		nextStartKey.setSnapshotHash(_ctx.stringValue("DescribeSqlServerLogsResponse.NextStartKey.SnapshotHash"));
		nextStartKey.setCompleteTime(_ctx.longValue("DescribeSqlServerLogsResponse.NextStartKey.CompleteTime"));
		describeSqlServerLogsResponse.setNextStartKey(nextStartKey);

		List<SqlServerLog> sqlServerLogs = new ArrayList<SqlServerLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSqlServerLogsResponse.SqlServerLogs.Length"); i++) {
			SqlServerLog sqlServerLog = new SqlServerLog();
			sqlServerLog.setClusterId(_ctx.stringValue("DescribeSqlServerLogsResponse.SqlServerLogs["+ i +"].ClusterId"));
			sqlServerLog.setDatabaseId(_ctx.stringValue("DescribeSqlServerLogsResponse.SqlServerLogs["+ i +"].DatabaseId"));
			sqlServerLog.setSnapshotHash(_ctx.stringValue("DescribeSqlServerLogsResponse.SqlServerLogs["+ i +"].SnapshotHash"));
			sqlServerLog.setStartTime(_ctx.longValue("DescribeSqlServerLogsResponse.SqlServerLogs["+ i +"].StartTime"));
			sqlServerLog.setCompleteTime(_ctx.longValue("DescribeSqlServerLogsResponse.SqlServerLogs["+ i +"].CompleteTime"));
			sqlServerLog.setBytesTotal(_ctx.longValue("DescribeSqlServerLogsResponse.SqlServerLogs["+ i +"].BytesTotal"));
			sqlServerLog.setDatabaseName(_ctx.stringValue("DescribeSqlServerLogsResponse.SqlServerLogs["+ i +"].DatabaseName"));
			sqlServerLog.setStatus(_ctx.stringValue("DescribeSqlServerLogsResponse.SqlServerLogs["+ i +"].Status"));
			sqlServerLog.setExpireTime(_ctx.longValue("DescribeSqlServerLogsResponse.SqlServerLogs["+ i +"].ExpireTime"));

			sqlServerLogs.add(sqlServerLog);
		}
		describeSqlServerLogsResponse.setSqlServerLogs(sqlServerLogs);
	 
	 	return describeSqlServerLogsResponse;
	}
}