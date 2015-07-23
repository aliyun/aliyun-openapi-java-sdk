/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.rds.model.v20140815.DescribeSlowLogsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSlowLogsResponse.SQLSlowLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowLogsResponseUnmarshaller {

	public static DescribeSlowLogsResponse unmarshall(DescribeSlowLogsResponse describeSlowLogsResponse, UnmarshallerContext context) {
		
		describeSlowLogsResponse.setRequestId(context.stringValue("DescribeSlowLogsResponse.RequestId"));
		describeSlowLogsResponse.setEngine(context.stringValue("DescribeSlowLogsResponse.Engine"));
		describeSlowLogsResponse.setStartTime(context.stringValue("DescribeSlowLogsResponse.StartTime"));
		describeSlowLogsResponse.setEndTime(context.stringValue("DescribeSlowLogsResponse.EndTime"));
		describeSlowLogsResponse.setTotalRecordCount(context.integerValue("DescribeSlowLogsResponse.TotalRecordCount"));
		describeSlowLogsResponse.setPageNumber(context.integerValue("DescribeSlowLogsResponse.PageNumber"));
		describeSlowLogsResponse.setPageRecordCount(context.integerValue("DescribeSlowLogsResponse.PageRecordCount"));

		List<SQLSlowLog> items = new ArrayList<SQLSlowLog>();
		for (int i = 0; i < context.lengthValue("DescribeSlowLogsResponse.Items.Length"); i++) {
			SQLSlowLog  sQLSlowLog = new SQLSlowLog();
			sQLSlowLog.setSlowLogId(context.longValue("DescribeSlowLogsResponse.Items["+ i +"].SlowLogId"));
			sQLSlowLog.setSQLId(context.longValue("DescribeSlowLogsResponse.Items["+ i +"].SQLId"));
			sQLSlowLog.setDBName(context.stringValue("DescribeSlowLogsResponse.Items["+ i +"].DBName"));
			sQLSlowLog.setSQLText(context.stringValue("DescribeSlowLogsResponse.Items["+ i +"].SQLText"));
			sQLSlowLog.setMySQLTotalExecutionCounts(context.longValue("DescribeSlowLogsResponse.Items["+ i +"].MySQLTotalExecutionCounts"));
			sQLSlowLog.setMySQLTotalExecutionTimes(context.longValue("DescribeSlowLogsResponse.Items["+ i +"].MySQLTotalExecutionTimes"));
			sQLSlowLog.setTotalLockTimes(context.longValue("DescribeSlowLogsResponse.Items["+ i +"].TotalLockTimes"));
			sQLSlowLog.setMaxLockTime(context.longValue("DescribeSlowLogsResponse.Items["+ i +"].MaxLockTime"));
			sQLSlowLog.setParseTotalRowCounts(context.longValue("DescribeSlowLogsResponse.Items["+ i +"].ParseTotalRowCounts"));
			sQLSlowLog.setParseMaxRowCount(context.longValue("DescribeSlowLogsResponse.Items["+ i +"].ParseMaxRowCount"));
			sQLSlowLog.setReturnTotalRowCounts(context.longValue("DescribeSlowLogsResponse.Items["+ i +"].ReturnTotalRowCounts"));
			sQLSlowLog.setReturnMaxRowCount(context.longValue("DescribeSlowLogsResponse.Items["+ i +"].ReturnMaxRowCount"));
			sQLSlowLog.setCreateTime(context.stringValue("DescribeSlowLogsResponse.Items["+ i +"].CreateTime"));
			sQLSlowLog.setSQLServerTotalExecutionCounts(context.longValue("DescribeSlowLogsResponse.Items["+ i +"].SQLServerTotalExecutionCounts"));
			sQLSlowLog.setSQLServerTotalExecutionTimes(context.longValue("DescribeSlowLogsResponse.Items["+ i +"].SQLServerTotalExecutionTimes"));
			sQLSlowLog.setTotalLogicalReadCounts(context.longValue("DescribeSlowLogsResponse.Items["+ i +"].TotalLogicalReadCounts"));
			sQLSlowLog.setTotalPhysicalReadCounts(context.longValue("DescribeSlowLogsResponse.Items["+ i +"].TotalPhysicalReadCounts"));
			sQLSlowLog.setReportTime(context.stringValue("DescribeSlowLogsResponse.Items["+ i +"].ReportTime"));
			sQLSlowLog.setMaxExecutionTime(context.longValue("DescribeSlowLogsResponse.Items["+ i +"].MaxExecutionTime"));
			sQLSlowLog.setAvgExecutionTime(context.longValue("DescribeSlowLogsResponse.Items["+ i +"].AvgExecutionTime"));

			items.add(sQLSlowLog);
		}
		describeSlowLogsResponse.setItems(items);
	 
	 	return describeSlowLogsResponse;
	}
}