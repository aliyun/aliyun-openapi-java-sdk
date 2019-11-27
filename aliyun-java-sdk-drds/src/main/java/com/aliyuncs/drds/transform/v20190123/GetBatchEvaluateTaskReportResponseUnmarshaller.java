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

import com.aliyuncs.drds.model.v20190123.GetBatchEvaluateTaskReportResponse;
import com.aliyuncs.drds.model.v20190123.GetBatchEvaluateTaskReportResponse.EvaluateResults;
import com.aliyuncs.drds.model.v20190123.GetBatchEvaluateTaskReportResponse.EvaluateResults.RdsInstInfosItem;
import com.aliyuncs.drds.model.v20190123.GetBatchEvaluateTaskReportResponse.EvaluateResults.TableShardResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBatchEvaluateTaskReportResponseUnmarshaller {

	public static GetBatchEvaluateTaskReportResponse unmarshall(GetBatchEvaluateTaskReportResponse getBatchEvaluateTaskReportResponse, UnmarshallerContext _ctx) {
		
		getBatchEvaluateTaskReportResponse.setRequestId(_ctx.stringValue("GetBatchEvaluateTaskReportResponse.RequestId"));
		getBatchEvaluateTaskReportResponse.setSuccess(_ctx.booleanValue("GetBatchEvaluateTaskReportResponse.Success"));

		List<EvaluateResults> data = new ArrayList<EvaluateResults>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchEvaluateTaskReportResponse.Data.Length"); i++) {
			EvaluateResults evaluateResults = new EvaluateResults();
			evaluateResults.setTaskId(_ctx.integerValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].TaskId"));
			evaluateResults.setTaskName(_ctx.stringValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].TaskName"));
			evaluateResults.setInstId(_ctx.integerValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].InstId"));
			evaluateResults.setDbName(_ctx.stringValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].DbName"));
			evaluateResults.setTaskStatus(_ctx.stringValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].TaskStatus"));
			evaluateResults.setGmtCreate(_ctx.stringValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].GmtCreate"));
			evaluateResults.setGmtModified(_ctx.stringValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].GmtModified"));
			evaluateResults.setRdsType(_ctx.stringValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].RdsType"));
			evaluateResults.setRdsCount(_ctx.integerValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].RdsCount"));
			evaluateResults.setRdsTotalSpace(_ctx.stringValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].RdsTotalSpace"));
			evaluateResults.setDrdsType(_ctx.stringValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].DrdsType"));
			evaluateResults.setDrdsCount(_ctx.integerValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].DrdsCount"));
			evaluateResults.setAllSqlCount(_ctx.integerValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].AllSqlCount"));
			evaluateResults.setSlowSqlCount(_ctx.integerValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].SlowSqlCount"));

			List<TableShardResultsItem> tableShardResults = new ArrayList<TableShardResultsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults.Length"); j++) {
				TableShardResultsItem tableShardResultsItem = new TableShardResultsItem();
				tableShardResultsItem.setTable(_ctx.stringValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].Table"));
				tableShardResultsItem.setShardType(_ctx.stringValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].ShardType"));
				tableShardResultsItem.setDbShardKey(_ctx.stringValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].DbShardKey"));
				tableShardResultsItem.setTbShardKey(_ctx.stringValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].TbShardKey"));
				tableShardResultsItem.setTbpartitions(_ctx.integerValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].Tbpartitions"));
				tableShardResultsItem.setDbpartitions(_ctx.integerValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].Dbpartitions"));
				tableShardResultsItem.setCreateTableSql(_ctx.stringValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].CreateTableSql"));
				tableShardResultsItem.setRowCount(_ctx.integerValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].RowCount"));
				tableShardResultsItem.setSqlCount(_ctx.integerValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].SqlCount"));
				tableShardResultsItem.setShardKeyType(_ctx.stringValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].TableShardResults["+ j +"].ShardKeyType"));

				tableShardResults.add(tableShardResultsItem);
			}
			evaluateResults.setTableShardResults(tableShardResults);

			List<RdsInstInfosItem> rdsInstInfos = new ArrayList<RdsInstInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].RdsInstInfos.Length"); j++) {
				RdsInstInfosItem rdsInstInfosItem = new RdsInstInfosItem();
				rdsInstInfosItem.setInstId(_ctx.stringValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].RdsInstInfos["+ j +"].InstId"));
				rdsInstInfosItem.setRdsUsedSpace(_ctx.integerValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].RdsInstInfos["+ j +"].RdsUsedSpace"));
				rdsInstInfosItem.setRdsPeakIopsWeekly(_ctx.integerValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].RdsInstInfos["+ j +"].RdsPeakIopsWeekly"));
				rdsInstInfosItem.setRdsPeakQpsWeekly(_ctx.integerValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].RdsInstInfos["+ j +"].RdsPeakQpsWeekly"));
				rdsInstInfosItem.setRdsPeakSessionsWeekly(_ctx.integerValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].RdsInstInfos["+ j +"].RdsPeakSessionsWeekly"));
				rdsInstInfosItem.setDataGrowthScale(_ctx.integerValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].RdsInstInfos["+ j +"].DataGrowthScale"));
				rdsInstInfosItem.setAvgQpsGrowthScale(_ctx.integerValue("GetBatchEvaluateTaskReportResponse.Data["+ i +"].RdsInstInfos["+ j +"].AvgQpsGrowthScale"));

				rdsInstInfos.add(rdsInstInfosItem);
			}
			evaluateResults.setRdsInstInfos(rdsInstInfos);

			data.add(evaluateResults);
		}
		getBatchEvaluateTaskReportResponse.setData(data);
	 
	 	return getBatchEvaluateTaskReportResponse;
	}
}