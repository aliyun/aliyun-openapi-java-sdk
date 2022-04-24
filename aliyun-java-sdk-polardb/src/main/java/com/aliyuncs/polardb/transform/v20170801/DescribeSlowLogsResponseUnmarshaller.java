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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeSlowLogsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeSlowLogsResponse.SQLSlowLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowLogsResponseUnmarshaller {

	public static DescribeSlowLogsResponse unmarshall(DescribeSlowLogsResponse describeSlowLogsResponse, UnmarshallerContext _ctx) {
		
		describeSlowLogsResponse.setRequestId(_ctx.stringValue("DescribeSlowLogsResponse.RequestId"));
		describeSlowLogsResponse.setTotalRecordCount(_ctx.integerValue("DescribeSlowLogsResponse.TotalRecordCount"));
		describeSlowLogsResponse.setPageRecordCount(_ctx.integerValue("DescribeSlowLogsResponse.PageRecordCount"));
		describeSlowLogsResponse.setEndTime(_ctx.stringValue("DescribeSlowLogsResponse.EndTime"));
		describeSlowLogsResponse.setPageNumber(_ctx.integerValue("DescribeSlowLogsResponse.PageNumber"));
		describeSlowLogsResponse.setStartTime(_ctx.stringValue("DescribeSlowLogsResponse.StartTime"));
		describeSlowLogsResponse.setDBClusterId(_ctx.stringValue("DescribeSlowLogsResponse.DBClusterId"));
		describeSlowLogsResponse.setEngine(_ctx.stringValue("DescribeSlowLogsResponse.Engine"));

		List<SQLSlowLog> items = new ArrayList<SQLSlowLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowLogsResponse.Items.Length"); i++) {
			SQLSlowLog sQLSlowLog = new SQLSlowLog();
			sQLSlowLog.setSQLText(_ctx.stringValue("DescribeSlowLogsResponse.Items["+ i +"].SQLText"));
			sQLSlowLog.setReturnMaxRowCount(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].ReturnMaxRowCount"));
			sQLSlowLog.setCreateTime(_ctx.stringValue("DescribeSlowLogsResponse.Items["+ i +"].CreateTime"));
			sQLSlowLog.setMaxExecutionTime(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MaxExecutionTime"));
			sQLSlowLog.setParseTotalRowCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].ParseTotalRowCounts"));
			sQLSlowLog.setTotalLockTimes(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].TotalLockTimes"));
			sQLSlowLog.setTotalExecutionTimes(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].TotalExecutionTimes"));
			sQLSlowLog.setDBNodeId(_ctx.stringValue("DescribeSlowLogsResponse.Items["+ i +"].DBNodeId"));
			sQLSlowLog.setSQLHASH(_ctx.stringValue("DescribeSlowLogsResponse.Items["+ i +"].SQLHASH"));
			sQLSlowLog.setParseMaxRowCount(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].ParseMaxRowCount"));
			sQLSlowLog.setMaxLockTime(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].MaxLockTime"));
			sQLSlowLog.setReturnTotalRowCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].ReturnTotalRowCounts"));
			sQLSlowLog.setDBName(_ctx.stringValue("DescribeSlowLogsResponse.Items["+ i +"].DBName"));
			sQLSlowLog.setTotalExecutionCounts(_ctx.longValue("DescribeSlowLogsResponse.Items["+ i +"].TotalExecutionCounts"));

			items.add(sQLSlowLog);
		}
		describeSlowLogsResponse.setItems(items);
	 
	 	return describeSlowLogsResponse;
	}
}