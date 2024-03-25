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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOasAnomalySQLListResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOasAnomalySQLListResponse.DataItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOasAnomalySQLListResponse.DataItem.SqlListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOasAnomalySQLListResponseUnmarshaller {

	public static DescribeOasAnomalySQLListResponse unmarshall(DescribeOasAnomalySQLListResponse describeOasAnomalySQLListResponse, UnmarshallerContext _ctx) {
		
		describeOasAnomalySQLListResponse.setRequestId(_ctx.stringValue("DescribeOasAnomalySQLListResponse.RequestId"));
		describeOasAnomalySQLListResponse.setTotalCount(_ctx.longValue("DescribeOasAnomalySQLListResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOasAnomalySQLListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAvgCpuTime(_ctx.doubleValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].AvgCpuTime"));
			dataItem.setAvgElapsedTime(_ctx.doubleValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].AvgElapsedTime"));
			dataItem.setAvgGetPlanTime(_ctx.doubleValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].AvgGetPlanTime"));
			dataItem.setCpuTime(_ctx.doubleValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].CpuTime"));
			dataItem.setDbName(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].DbName"));
			dataItem.setDiagnosis(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].Diagnosis"));
			dataItem.setExecutions(_ctx.doubleValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].Executions"));
			dataItem.setLastExecutedTime(_ctx.doubleValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].LastExecutedTime"));
			dataItem.setRiskLevel(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].RiskLevel"));
			dataItem.setSqlId(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlId"));
			dataItem.setSqlTextShort(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlTextShort"));
			dataItem.setSuggestion(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].Suggestion"));
			dataItem.setSumElapsedTime(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SumElapsedTime"));
			dataItem.setUserName(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].UserName"));
			dataItem.setDynamicSql(_ctx.booleanValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].DynamicSql"));
			dataItem.setAvgDbTime(_ctx.doubleValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].AvgDbTime"));
			dataItem.setSumDbTime(_ctx.doubleValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SumDbTime"));
			dataItem.setAvgRetryCount(_ctx.floatValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].AvgRetryCount"));
			dataItem.setSumRetryCount(_ctx.floatValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SumRetryCount"));
			dataItem.setAvgLogicalReads(_ctx.floatValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].AvgLogicalReads"));

			List<String> diagTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].DiagTypes.Length"); j++) {
				diagTypes.add(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].DiagTypes["+ j +"]"));
			}
			dataItem.setDiagTypes(diagTypes);

			List<SqlListItem> sqlList = new ArrayList<SqlListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList.Length"); j++) {
				SqlListItem sqlListItem = new SqlListItem();
				sqlListItem.setAvgCpuTime(_ctx.doubleValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgCpuTime"));
				sqlListItem.setAvgElapsedTime(_ctx.doubleValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgElapsedTime"));
				sqlListItem.setAvgGetPlanTime(_ctx.doubleValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgGetPlanTime"));
				sqlListItem.setCpuTime(_ctx.doubleValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].CpuTime"));
				sqlListItem.setDbName(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].DbName"));
				sqlListItem.setDiagnosis(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].Diagnosis"));
				sqlListItem.setExecutions(_ctx.doubleValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].Executions"));
				sqlListItem.setLastExecutedTime(_ctx.doubleValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].LastExecutedTime"));
				sqlListItem.setRiskLevel(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].RiskLevel"));
				sqlListItem.setSqlId(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].SqlId"));
				sqlListItem.setSqlTextShort(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].SqlTextShort"));
				sqlListItem.setSuggestion(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].Suggestion"));
				sqlListItem.setSumElapsedTime(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].SumElapsedTime"));
				sqlListItem.setUserName(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].UserName"));
				sqlListItem.setAvgDbTime(_ctx.doubleValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgDbTime"));
				sqlListItem.setSumDbTime(_ctx.doubleValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].SumDbTime"));
				sqlListItem.setAvgRetryCount(_ctx.floatValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgRetryCount"));
				sqlListItem.setSumRetryCount(_ctx.floatValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].SumRetryCount"));
				sqlListItem.setAvgLogicalReads(_ctx.floatValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgLogicalReads"));

				List<String> diagTypes1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].DiagTypes.Length"); k++) {
					diagTypes1.add(_ctx.stringValue("DescribeOasAnomalySQLListResponse.Data["+ i +"].SqlList["+ j +"].DiagTypes["+ k +"]"));
				}
				sqlListItem.setDiagTypes1(diagTypes1);

				sqlList.add(sqlListItem);
			}
			dataItem.setSqlList(sqlList);

			data.add(dataItem);
		}
		describeOasAnomalySQLListResponse.setData(data);
	 
	 	return describeOasAnomalySQLListResponse;
	}
}