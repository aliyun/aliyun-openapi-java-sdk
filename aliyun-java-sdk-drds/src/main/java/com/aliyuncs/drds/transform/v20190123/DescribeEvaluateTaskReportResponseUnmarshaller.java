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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeEvaluateTaskReportResponse;
import com.aliyuncs.drds.model.v20190123.DescribeEvaluateTaskReportResponse.EvaluateResult;
import com.aliyuncs.drds.model.v20190123.DescribeEvaluateTaskReportResponse.EvaluateResult.RdsInstInfosItem;
import com.aliyuncs.drds.model.v20190123.DescribeEvaluateTaskReportResponse.EvaluateResult.TableShardResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEvaluateTaskReportResponseUnmarshaller {

	public static DescribeEvaluateTaskReportResponse unmarshall(DescribeEvaluateTaskReportResponse describeEvaluateTaskReportResponse, UnmarshallerContext _ctx) {
		
		describeEvaluateTaskReportResponse.setRequestId(_ctx.stringValue("DescribeEvaluateTaskReportResponse.RequestId"));
		describeEvaluateTaskReportResponse.setSuccess(_ctx.booleanValue("DescribeEvaluateTaskReportResponse.Success"));

		EvaluateResult evaluateResult = new EvaluateResult();
		evaluateResult.setTaskId(_ctx.integerValue("DescribeEvaluateTaskReportResponse.EvaluateResult.TaskId"));
		evaluateResult.setTaskName(_ctx.stringValue("DescribeEvaluateTaskReportResponse.EvaluateResult.TaskName"));
		evaluateResult.setInstId(_ctx.integerValue("DescribeEvaluateTaskReportResponse.EvaluateResult.InstId"));
		evaluateResult.setDbName(_ctx.stringValue("DescribeEvaluateTaskReportResponse.EvaluateResult.DbName"));
		evaluateResult.setTaskStatus(_ctx.stringValue("DescribeEvaluateTaskReportResponse.EvaluateResult.TaskStatus"));
		evaluateResult.setGmtCreate(_ctx.stringValue("DescribeEvaluateTaskReportResponse.EvaluateResult.GmtCreate"));
		evaluateResult.setGmtModified(_ctx.stringValue("DescribeEvaluateTaskReportResponse.EvaluateResult.GmtModified"));
		evaluateResult.setRdsType(_ctx.stringValue("DescribeEvaluateTaskReportResponse.EvaluateResult.RdsType"));
		evaluateResult.setRdsCount(_ctx.integerValue("DescribeEvaluateTaskReportResponse.EvaluateResult.RdsCount"));
		evaluateResult.setRdsTotalSpace(_ctx.stringValue("DescribeEvaluateTaskReportResponse.EvaluateResult.RdsTotalSpace"));
		evaluateResult.setDrdsType(_ctx.stringValue("DescribeEvaluateTaskReportResponse.EvaluateResult.DrdsType"));
		evaluateResult.setDrdsCount(_ctx.integerValue("DescribeEvaluateTaskReportResponse.EvaluateResult.DrdsCount"));
		evaluateResult.setAllSqlCount(_ctx.integerValue("DescribeEvaluateTaskReportResponse.EvaluateResult.AllSqlCount"));
		evaluateResult.setSlowSqlCount(_ctx.integerValue("DescribeEvaluateTaskReportResponse.EvaluateResult.SlowSqlCount"));

		List<TableShardResultsItem> tableShardResults = new ArrayList<TableShardResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEvaluateTaskReportResponse.EvaluateResult.TableShardResults.Length"); i++) {
			TableShardResultsItem tableShardResultsItem = new TableShardResultsItem();
			tableShardResultsItem.setTable(_ctx.stringValue("DescribeEvaluateTaskReportResponse.EvaluateResult.TableShardResults["+ i +"].Table"));
			tableShardResultsItem.setShardType(_ctx.stringValue("DescribeEvaluateTaskReportResponse.EvaluateResult.TableShardResults["+ i +"].ShardType"));
			tableShardResultsItem.setDbShardKey(_ctx.stringValue("DescribeEvaluateTaskReportResponse.EvaluateResult.TableShardResults["+ i +"].DbShardKey"));
			tableShardResultsItem.setTbShardKey(_ctx.stringValue("DescribeEvaluateTaskReportResponse.EvaluateResult.TableShardResults["+ i +"].TbShardKey"));
			tableShardResultsItem.setTbpartitions(_ctx.integerValue("DescribeEvaluateTaskReportResponse.EvaluateResult.TableShardResults["+ i +"].Tbpartitions"));
			tableShardResultsItem.setDbpartitions(_ctx.integerValue("DescribeEvaluateTaskReportResponse.EvaluateResult.TableShardResults["+ i +"].Dbpartitions"));
			tableShardResultsItem.setCreateTableSql(_ctx.stringValue("DescribeEvaluateTaskReportResponse.EvaluateResult.TableShardResults["+ i +"].CreateTableSql"));
			tableShardResultsItem.setRowCount(_ctx.integerValue("DescribeEvaluateTaskReportResponse.EvaluateResult.TableShardResults["+ i +"].RowCount"));
			tableShardResultsItem.setSqlCount(_ctx.integerValue("DescribeEvaluateTaskReportResponse.EvaluateResult.TableShardResults["+ i +"].SqlCount"));
			tableShardResultsItem.setShardKeyType(_ctx.stringValue("DescribeEvaluateTaskReportResponse.EvaluateResult.TableShardResults["+ i +"].ShardKeyType"));

			tableShardResults.add(tableShardResultsItem);
		}
		evaluateResult.setTableShardResults(tableShardResults);

		List<RdsInstInfosItem> rdsInstInfos = new ArrayList<RdsInstInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEvaluateTaskReportResponse.EvaluateResult.RdsInstInfos.Length"); i++) {
			RdsInstInfosItem rdsInstInfosItem = new RdsInstInfosItem();
			rdsInstInfosItem.setInstId(_ctx.stringValue("DescribeEvaluateTaskReportResponse.EvaluateResult.RdsInstInfos["+ i +"].InstId"));
			rdsInstInfosItem.setRdsUsedSpace(_ctx.integerValue("DescribeEvaluateTaskReportResponse.EvaluateResult.RdsInstInfos["+ i +"].RdsUsedSpace"));
			rdsInstInfosItem.setRdsPeakIopsWeekly(_ctx.integerValue("DescribeEvaluateTaskReportResponse.EvaluateResult.RdsInstInfos["+ i +"].RdsPeakIopsWeekly"));
			rdsInstInfosItem.setRdsPeakQpsWeekly(_ctx.integerValue("DescribeEvaluateTaskReportResponse.EvaluateResult.RdsInstInfos["+ i +"].RdsPeakQpsWeekly"));
			rdsInstInfosItem.setRdsPeakSessionsWeekly(_ctx.integerValue("DescribeEvaluateTaskReportResponse.EvaluateResult.RdsInstInfos["+ i +"].RdsPeakSessionsWeekly"));
			rdsInstInfosItem.setDataGrowthScale(_ctx.integerValue("DescribeEvaluateTaskReportResponse.EvaluateResult.RdsInstInfos["+ i +"].DataGrowthScale"));
			rdsInstInfosItem.setAvgQpsGrowthScale(_ctx.integerValue("DescribeEvaluateTaskReportResponse.EvaluateResult.RdsInstInfos["+ i +"].AvgQpsGrowthScale"));

			rdsInstInfos.add(rdsInstInfosItem);
		}
		evaluateResult.setRdsInstInfos(rdsInstInfos);
		describeEvaluateTaskReportResponse.setEvaluateResult(evaluateResult);
	 
	 	return describeEvaluateTaskReportResponse;
	}
}