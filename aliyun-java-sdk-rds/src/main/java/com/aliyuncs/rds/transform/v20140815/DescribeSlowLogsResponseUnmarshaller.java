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
		describeSlowLogsResponse.setEndTime(_ctx.stringValue("DescribeSlowLogsResponse.EndTime"));
		describeSlowLogsResponse.setStartTime(_ctx.stringValue("DescribeSlowLogsResponse.StartTime"));
		describeSlowLogsResponse.setPageRecordCount(_ctx.integerValue("DescribeSlowLogsResponse.PageRecordCount"));
		describeSlowLogsResponse.setTotalRecordCount(_ctx.integerValue("DescribeSlowLogsResponse.TotalRecordCount"));
		describeSlowLogsResponse.setDBInstanceId(_ctx.stringValue("DescribeSlowLogsResponse.DBInstanceId"));
		describeSlowLogsResponse.setPageNumber(_ctx.integerValue("DescribeSlowLogsResponse.PageNumber"));
		describeSlowLogsResponse.setEngine(_ctx.stringValue("DescribeSlowLogsResponse.Engine"));

		List<SQLSlowLog> items = new ArrayList<SQLSlowLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowLogsResponse.Items.Length"); i++) {
			SQLSlowLog sQLSlowLog = new SQLSlowLog();
			sQLSlowLog.setMaxLastRowsAffectedCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MaxLastRowsAffectedCounts"));
			sQLSlowLog.setReturnMaxRowCount(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].ReturnMaxRowCount"));
			sQLSlowLog.setSQLText(_ctx.stringValue("DescribeSlowLogsResponse.Items["+ i +"].SQLText"));
			sQLSlowLog.setSQLServerMaxCpuTime(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].SQLServerMaxCpuTime"));
			sQLSlowLog.setCreateTime(_ctx.stringValue("DescribeSlowLogsResponse.Items["+ i +"].CreateTime"));
			sQLSlowLog.setAvgLastRowsAffectedCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].AvgLastRowsAffectedCounts"));
			sQLSlowLog.setMinLastRowsAffectedCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MinLastRowsAffectedCounts"));
			sQLSlowLog.setParseTotalRowCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].ParseTotalRowCounts"));
			sQLSlowLog.setTotalLockTimes(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].TotalLockTimes"));
			sQLSlowLog.setMySQLTotalExecutionCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MySQLTotalExecutionCounts"));
			sQLSlowLog.setSQLServerMinCpuTime(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].SQLServerMinCpuTime"));
			sQLSlowLog.setSQLHASH(_ctx.stringValue("DescribeSlowLogsResponse.Items["+ i +"].SQLHASH"));
			sQLSlowLog.setMinIOWriteCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MinIOWriteCounts"));
			sQLSlowLog.setParseMaxRowCount(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].ParseMaxRowCount"));
			sQLSlowLog.setMaxLogicalReadCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MaxLogicalReadCounts"));
			sQLSlowLog.setMySQLTotalExecutionTimes(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MySQLTotalExecutionTimes"));
			sQLSlowLog.setSQLServerTotalExecutionCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].SQLServerTotalExecutionCounts"));
			sQLSlowLog.setReturnTotalRowCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].ReturnTotalRowCounts"));
			sQLSlowLog.setMaxLockTime(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MaxLockTime"));
			sQLSlowLog.setDBName(_ctx.stringValue("DescribeSlowLogsResponse.Items["+ i +"].DBName"));
			sQLSlowLog.setMinRowsAffectedCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MinRowsAffectedCounts"));
			sQLSlowLog.setTotalLogicalReadCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].TotalLogicalReadCounts"));
			sQLSlowLog.setTotalPhysicalReadCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].TotalPhysicalReadCounts"));
			sQLSlowLog.setReportTime(_ctx.stringValue("DescribeSlowLogsResponse.Items["+ i +"].ReportTime"));
			sQLSlowLog.setMaxPhysicalReadCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MaxPhysicalReadCounts"));
			sQLSlowLog.setSQLServerTotalCpuTime(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].SQLServerTotalCpuTime"));
			sQLSlowLog.setTotalIOWriteCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].TotalIOWriteCounts"));
			sQLSlowLog.setMaxRowsAffectedCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MaxRowsAffectedCounts"));
			sQLSlowLog.setAvgIOWriteCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].AvgIOWriteCounts"));
			sQLSlowLog.setMinPhysicalReadCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MinPhysicalReadCounts"));
			sQLSlowLog.setSlowLogId(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].SlowLogId"));
			sQLSlowLog.setMaxExecutionTime(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MaxExecutionTime"));
			sQLSlowLog.setAvgExecutionTime(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].AvgExecutionTime"));
			sQLSlowLog.setSQLServerAvgExecutionTime(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].SQLServerAvgExecutionTime"));
			sQLSlowLog.setMaxIOWriteCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MaxIOWriteCounts"));
			sQLSlowLog.setSQLServerAvgCpuTime(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].SQLServerAvgCpuTime"));
			sQLSlowLog.setTotalLastRowsAffectedCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].TotalLastRowsAffectedCounts"));
			sQLSlowLog.setAvgLogicalReadCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].AvgLogicalReadCounts"));
			sQLSlowLog.setSQLServerMinExecutionTime(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].SQLServerMinExecutionTime"));
			sQLSlowLog.setSQLIdStr(_ctx.stringValue("DescribeSlowLogsResponse.Items["+ i +"].SQLIdStr"));
			sQLSlowLog.setSQLServerTotalExecutionTimes(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].SQLServerTotalExecutionTimes"));
			sQLSlowLog.setAvgRowsAffectedCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].AvgRowsAffectedCounts"));
			sQLSlowLog.setTotalRowsAffectedCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].TotalRowsAffectedCounts"));
			sQLSlowLog.setAvgPhysicalReadCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].AvgPhysicalReadCounts"));
			sQLSlowLog.setMinLogicalReadCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MinLogicalReadCounts"));

			items.add(sQLSlowLog);
		}
		describeSlowLogsResponse.setItems(items);
	 
	 	return describeSlowLogsResponse;
	}
}