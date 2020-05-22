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

import com.aliyuncs.drds.model.v20190123.DescribeMyCatReportInfoResponse;
import com.aliyuncs.drds.model.v20190123.DescribeMyCatReportInfoResponse.EvaluateReportInfo;
import com.aliyuncs.drds.model.v20190123.DescribeMyCatReportInfoResponse.EvaluateReportInfo.DbInfo;
import com.aliyuncs.drds.model.v20190123.DescribeMyCatReportInfoResponse.EvaluateReportInfo.DbInfo.TableInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMyCatReportInfoResponseUnmarshaller {

	public static DescribeMyCatReportInfoResponse unmarshall(DescribeMyCatReportInfoResponse describeMyCatReportInfoResponse, UnmarshallerContext _ctx) {
		
		describeMyCatReportInfoResponse.setRequestId(_ctx.stringValue("DescribeMyCatReportInfoResponse.RequestId"));
		describeMyCatReportInfoResponse.setSuccess(_ctx.booleanValue("DescribeMyCatReportInfoResponse.Success"));

		EvaluateReportInfo evaluateReportInfo = new EvaluateReportInfo();
		evaluateReportInfo.setErrorSqlCount(_ctx.integerValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.ErrorSqlCount"));
		evaluateReportInfo.setDrdsSpecs(_ctx.stringValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.DrdsSpecs"));
		evaluateReportInfo.setDrdsNodeCount(_ctx.integerValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.DrdsNodeCount"));
		evaluateReportInfo.setRdsSpecs(_ctx.stringValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.RdsSpecs"));
		evaluateReportInfo.setRdsCount(_ctx.integerValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.RdsCount"));
		evaluateReportInfo.setRdsDiskCapacity(_ctx.stringValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.RdsDiskCapacity"));

		DbInfo dbInfo = new DbInfo();
		dbInfo.setDbName(_ctx.stringValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.DbInfo.DbName"));

		List<TableInfo> tableInfoList = new ArrayList<TableInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.DbInfo.TableInfoList.Length"); i++) {
			TableInfo tableInfo = new TableInfo();
			tableInfo.setTableName(_ctx.stringValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.DbInfo.TableInfoList["+ i +"].TableName"));
			tableInfo.setMycatShardAlgorithm(_ctx.stringValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.DbInfo.TableInfoList["+ i +"].MycatShardAlgorithm"));
			tableInfo.setDbShardColumn(_ctx.stringValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.DbInfo.TableInfoList["+ i +"].DbShardColumn"));
			tableInfo.setDbShardAlgorithm(_ctx.stringValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.DbInfo.TableInfoList["+ i +"].DbShardAlgorithm"));
			tableInfo.setTbShardColumn(_ctx.stringValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.DbInfo.TableInfoList["+ i +"].TbShardColumn"));
			tableInfo.setTbShardAlgorithm(_ctx.stringValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.DbInfo.TableInfoList["+ i +"].TbShardAlgorithm"));
			tableInfo.setTbShardNum(_ctx.integerValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.DbInfo.TableInfoList["+ i +"].TbShardNum"));
			tableInfo.setShard(_ctx.booleanValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.DbInfo.TableInfoList["+ i +"].Shard"));
			tableInfo.setBroadcast(_ctx.booleanValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.DbInfo.TableInfoList["+ i +"].Broadcast"));
			tableInfo.setCreateTableSql(_ctx.stringValue("DescribeMyCatReportInfoResponse.EvaluateReportInfo.DbInfo.TableInfoList["+ i +"].CreateTableSql"));

			tableInfoList.add(tableInfo);
		}
		dbInfo.setTableInfoList(tableInfoList);
		evaluateReportInfo.setDbInfo(dbInfo);
		describeMyCatReportInfoResponse.setEvaluateReportInfo(evaluateReportInfo);
	 
	 	return describeMyCatReportInfoResponse;
	}
}