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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeSlowLogsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSlowLogsResponse.SQLSlowLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowLogsResponseUnmarshaller {

	public static DescribeSlowLogsResponse unmarshall(DescribeSlowLogsResponse describeSlowLogsResponse, UnmarshallerContext _ctx) {
		
		describeSlowLogsResponse.setRequestId(_ctx.stringValue("DescribeSlowLogsResponse.RequestId"));
		describeSlowLogsResponse.setDBInstanceId(_ctx.stringValue("DescribeSlowLogsResponse.DBInstanceId"));
		describeSlowLogsResponse.setEngine(_ctx.stringValue("DescribeSlowLogsResponse.Engine"));
		describeSlowLogsResponse.setStartTime(_ctx.stringValue("DescribeSlowLogsResponse.StartTime"));
		describeSlowLogsResponse.setEndTime(_ctx.stringValue("DescribeSlowLogsResponse.EndTime"));
		describeSlowLogsResponse.setTotalRecordCount(_ctx.integerValue("DescribeSlowLogsResponse.TotalRecordCount"));
		describeSlowLogsResponse.setPageNumber(_ctx.integerValue("DescribeSlowLogsResponse.PageNumber"));
		describeSlowLogsResponse.setPageRecordCount(_ctx.integerValue("DescribeSlowLogsResponse.PageRecordCount"));

		List<SQLSlowLog> items = new ArrayList<SQLSlowLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowLogsResponse.Items.Length"); i++) {
			SQLSlowLog sQLSlowLog = new SQLSlowLog();
			sQLSlowLog.setSlowLogId(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].SlowLogId"));
			sQLSlowLog.setSQLHASH(_ctx.stringValue("DescribeSlowLogsResponse.Items["+ i +"].SQLHASH"));
			sQLSlowLog.setSQLIdStr(_ctx.stringValue("DescribeSlowLogsResponse.Items["+ i +"].SQLIdStr"));
			sQLSlowLog.setDBName(_ctx.stringValue("DescribeSlowLogsResponse.Items["+ i +"].DBName"));
			sQLSlowLog.setSQLText(_ctx.stringValue("DescribeSlowLogsResponse.Items["+ i +"].SQLText"));
			sQLSlowLog.setMySQLTotalExecutionCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MySQLTotalExecutionCounts"));
			sQLSlowLog.setMySQLTotalExecutionTimes(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MySQLTotalExecutionTimes"));
			sQLSlowLog.setTotalLockTimes(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].TotalLockTimes"));
			sQLSlowLog.setMaxLockTime(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MaxLockTime"));
			sQLSlowLog.setParseTotalRowCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].ParseTotalRowCounts"));
			sQLSlowLog.setParseMaxRowCount(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].ParseMaxRowCount"));
			sQLSlowLog.setReturnTotalRowCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].ReturnTotalRowCounts"));
			sQLSlowLog.setReturnMaxRowCount(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].ReturnMaxRowCount"));
			sQLSlowLog.setCreateTime(_ctx.stringValue("DescribeSlowLogsResponse.Items["+ i +"].CreateTime"));
			sQLSlowLog.setSQLServerTotalExecutionCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].SQLServerTotalExecutionCounts"));
			sQLSlowLog.setSQLServerTotalExecutionTimes(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].SQLServerTotalExecutionTimes"));
			sQLSlowLog.setTotalLogicalReadCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].TotalLogicalReadCounts"));
			sQLSlowLog.setTotalPhysicalReadCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].TotalPhysicalReadCounts"));
			sQLSlowLog.setReportTime(_ctx.stringValue("DescribeSlowLogsResponse.Items["+ i +"].ReportTime"));
			sQLSlowLog.setMaxExecutionTime(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MaxExecutionTime"));
			sQLSlowLog.setAvgExecutionTime(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].AvgExecutionTime"));

			items.add(sQLSlowLog);
		}
		describeSlowLogsResponse.setItems(items);
	 
	 	return describeSlowLogsResponse;
	}
}