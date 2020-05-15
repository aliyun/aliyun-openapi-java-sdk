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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.DescribeRestoreTablesResponse;
import com.aliyuncs.hbase.model.v20190101.DescribeRestoreTablesResponse.RestoreFull;
import com.aliyuncs.hbase.model.v20190101.DescribeRestoreTablesResponse.RestoreFull.RestoreFullDetail;
import com.aliyuncs.hbase.model.v20190101.DescribeRestoreTablesResponse.RestoreIncrDetail;
import com.aliyuncs.hbase.model.v20190101.DescribeRestoreTablesResponse.RestoreSchema;
import com.aliyuncs.hbase.model.v20190101.DescribeRestoreTablesResponse.RestoreSchema.RestoreSchemaDetail;
import com.aliyuncs.hbase.model.v20190101.DescribeRestoreTablesResponse.RestoreSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestoreTablesResponseUnmarshaller {

	public static DescribeRestoreTablesResponse unmarshall(DescribeRestoreTablesResponse describeRestoreTablesResponse, UnmarshallerContext _ctx) {
		
		describeRestoreTablesResponse.setRequestId(_ctx.stringValue("DescribeRestoreTablesResponse.RequestId"));

		List<String> tables = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreTablesResponse.Tables.Length"); i++) {
			tables.add(_ctx.stringValue("DescribeRestoreTablesResponse.Tables["+ i +"]"));
		}
		describeRestoreTablesResponse.setTables(tables);

		RestoreSummary restoreSummary = new RestoreSummary();
		restoreSummary.setRecordId(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreSummary.RecordId"));
		restoreSummary.setStartTime(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreSummary.StartTime"));
		restoreSummary.setEndTime(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreSummary.EndTime"));
		restoreSummary.setState(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreSummary.State"));
		restoreSummary.setTargetCluster(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreSummary.TargetCluster"));
		restoreSummary.setRestoreToDate(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreSummary.RestoreToDate"));
		describeRestoreTablesResponse.setRestoreSummary(restoreSummary);

		RestoreSchema restoreSchema = new RestoreSchema();
		restoreSchema.setSucceed(_ctx.integerValue("DescribeRestoreTablesResponse.RestoreSchema.Succeed"));
		restoreSchema.setFail(_ctx.integerValue("DescribeRestoreTablesResponse.RestoreSchema.Fail"));
		restoreSchema.setTotal(_ctx.longValue("DescribeRestoreTablesResponse.RestoreSchema.Total"));
		restoreSchema.setPageNumber(_ctx.integerValue("DescribeRestoreTablesResponse.RestoreSchema.PageNumber"));
		restoreSchema.setPageSize(_ctx.integerValue("DescribeRestoreTablesResponse.RestoreSchema.PageSize"));

		List<RestoreSchemaDetail> restoreSchemaDetails = new ArrayList<RestoreSchemaDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreTablesResponse.RestoreSchema.RestoreSchemaDetails.Length"); i++) {
			RestoreSchemaDetail restoreSchemaDetail = new RestoreSchemaDetail();
			restoreSchemaDetail.setTable(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreSchema.RestoreSchemaDetails["+ i +"].Table"));
			restoreSchemaDetail.setStartTime(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreSchema.RestoreSchemaDetails["+ i +"].StartTime"));
			restoreSchemaDetail.setEndTime(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreSchema.RestoreSchemaDetails["+ i +"].EndTime"));
			restoreSchemaDetail.setState(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreSchema.RestoreSchemaDetails["+ i +"].State"));
			restoreSchemaDetail.setMessage(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreSchema.RestoreSchemaDetails["+ i +"].Message"));

			restoreSchemaDetails.add(restoreSchemaDetail);
		}
		restoreSchema.setRestoreSchemaDetails(restoreSchemaDetails);
		describeRestoreTablesResponse.setRestoreSchema(restoreSchema);

		RestoreFull restoreFull = new RestoreFull();
		restoreFull.setSucceed(_ctx.integerValue("DescribeRestoreTablesResponse.RestoreFull.Succeed"));
		restoreFull.setFail(_ctx.integerValue("DescribeRestoreTablesResponse.RestoreFull.Fail"));
		restoreFull.setDataSize(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreFull.DataSize"));
		restoreFull.setSpeed(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreFull.Speed"));
		restoreFull.setTotal(_ctx.longValue("DescribeRestoreTablesResponse.RestoreFull.Total"));
		restoreFull.setPageNumber(_ctx.integerValue("DescribeRestoreTablesResponse.RestoreFull.PageNumber"));
		restoreFull.setPageSize(_ctx.integerValue("DescribeRestoreTablesResponse.RestoreFull.PageSize"));

		List<RestoreFullDetail> restoreFullDetails = new ArrayList<RestoreFullDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreTablesResponse.RestoreFull.RestoreFullDetails.Length"); i++) {
			RestoreFullDetail restoreFullDetail = new RestoreFullDetail();
			restoreFullDetail.setTable(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreFull.RestoreFullDetails["+ i +"].Table"));
			restoreFullDetail.setState(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreFull.RestoreFullDetails["+ i +"].State"));
			restoreFullDetail.setStartTime(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreFull.RestoreFullDetails["+ i +"].StartTime"));
			restoreFullDetail.setEndTime(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreFull.RestoreFullDetails["+ i +"].EndTime"));
			restoreFullDetail.setProcess(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreFull.RestoreFullDetails["+ i +"].Process"));
			restoreFullDetail.setDataSize(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreFull.RestoreFullDetails["+ i +"].DataSize"));
			restoreFullDetail.setSpeed(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreFull.RestoreFullDetails["+ i +"].Speed"));
			restoreFullDetail.setMessage(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreFull.RestoreFullDetails["+ i +"].Message"));

			restoreFullDetails.add(restoreFullDetail);
		}
		restoreFull.setRestoreFullDetails(restoreFullDetails);
		describeRestoreTablesResponse.setRestoreFull(restoreFull);

		RestoreIncrDetail restoreIncrDetail = new RestoreIncrDetail();
		restoreIncrDetail.setState(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreIncrDetail.State"));
		restoreIncrDetail.setStartTime(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreIncrDetail.StartTime"));
		restoreIncrDetail.setEndTime(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreIncrDetail.EndTime"));
		restoreIncrDetail.setRestoreStartTs(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreIncrDetail.RestoreStartTs"));
		restoreIncrDetail.setRestoredTs(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreIncrDetail.RestoredTs"));
		restoreIncrDetail.setRestoreDelay(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreIncrDetail.RestoreDelay"));
		restoreIncrDetail.setProcess(_ctx.stringValue("DescribeRestoreTablesResponse.RestoreIncrDetail.Process"));
		describeRestoreTablesResponse.setRestoreIncrDetail(restoreIncrDetail);
	 
	 	return describeRestoreTablesResponse;
	}
}