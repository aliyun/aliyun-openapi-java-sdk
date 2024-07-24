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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSQLTuningAdvicesResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSQLTuningAdvicesResponse.DataItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSQLTuningAdvicesResponse.DataItem.ColumnsItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSQLTuningAdvicesResponse.DataItem.Plan;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLTuningAdvicesResponseUnmarshaller {

	public static DescribeSQLTuningAdvicesResponse unmarshall(DescribeSQLTuningAdvicesResponse describeSQLTuningAdvicesResponse, UnmarshallerContext _ctx) {
		
		describeSQLTuningAdvicesResponse.setRequestId(_ctx.stringValue("DescribeSQLTuningAdvicesResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLTuningAdvicesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setType(_ctx.stringValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Type"));
			dataItem.setColumnNames(_ctx.stringValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].ColumnNames"));
			dataItem.setLocalityType(_ctx.stringValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].LocalityType"));
			dataItem.setDbName(_ctx.stringValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].DbName"));
			dataItem.setTable(_ctx.stringValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Table"));

			Plan plan = new Plan();
			plan.setExecutions(_ctx.longValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.Executions"));
			plan.setAvgCpuTime(_ctx.floatValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.AvgCpuTime"));
			plan.setPlanHash(_ctx.stringValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.PlanHash"));
			plan.setTimeoutPercentage(_ctx.floatValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.TimeoutPercentage"));
			plan.setAvgConcurrencyWaitTime(_ctx.floatValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.AvgConcurrencyWaitTime"));
			plan.setFirstLoadTimeUs(_ctx.longValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.FirstLoadTimeUs"));
			plan.setAvgDiskWrites(_ctx.floatValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.AvgDiskWrites"));
			plan.setAvgUserIoWaitTime(_ctx.floatValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.AvgUserIoWaitTime"));
			plan.setPlanSize(_ctx.longValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.PlanSize"));
			plan.setServerSn(_ctx.stringValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.ServerSn"));
			plan.setOutlineData(_ctx.stringValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.OutlineData"));
			plan.setPlanType(_ctx.stringValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.PlanType"));
			plan.setObDbId(_ctx.longValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.ObDbId"));
			plan.setHitPercentage(_ctx.floatValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.HitPercentage"));
			plan.setAvgBufferGets(_ctx.floatValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.AvgBufferGets"));
			plan.setExecPs(_ctx.floatValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.ExecPs"));
			plan.setDelayedLargeQueryPercentage(_ctx.floatValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.DelayedLargeQueryPercentage"));
			plan.setTableScan(_ctx.booleanValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.TableScan"));
			plan.setLargeQueryPercentage(_ctx.floatValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.LargeQueryPercentage"));
			plan.setSchemaVersion(_ctx.longValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.SchemaVersion"));
			plan.setPlanId(_ctx.longValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.PlanId"));
			plan.setFirstLoadTime(_ctx.stringValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.FirstLoadTime"));
			plan.setAvgRowProcessed(_ctx.floatValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.AvgRowProcessed"));
			plan.setMergedVersion(_ctx.longValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.MergedVersion"));
			plan.setHitDiagnosis(_ctx.booleanValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.HitDiagnosis"));
			plan.setUid(_ctx.stringValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.Uid"));
			plan.setAvgApplicationWaitTime(_ctx.floatValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.AvgApplicationWaitTime"));
			plan.setCollectTimeUs(_ctx.longValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.CollectTimeUs"));
			plan.setAvgElapsedTime(_ctx.floatValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.AvgElapsedTime"));
			plan.setObServerId(_ctx.longValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.ObServerId"));
			plan.setOutlineId(_ctx.longValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.OutlineId"));
			plan.setAvgDiskReads(_ctx.floatValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Plan.AvgDiskReads"));
			dataItem.setPlan(plan);

			List<ColumnsItem> columns = new ArrayList<ColumnsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Columns.Length"); j++) {
				ColumnsItem columnsItem = new ColumnsItem();
				columnsItem.setColumnName(_ctx.stringValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Columns["+ j +"].ColumnName"));
				columnsItem.setNdv(_ctx.floatValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Columns["+ j +"].Ndv"));
				columnsItem.setMinValue(_ctx.stringValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Columns["+ j +"].MinValue"));
				columnsItem.setMaxValue(_ctx.stringValue("DescribeSQLTuningAdvicesResponse.Data["+ i +"].Columns["+ j +"].MaxValue"));

				columns.add(columnsItem);
			}
			dataItem.setColumns(columns);

			data.add(dataItem);
		}
		describeSQLTuningAdvicesResponse.setData(data);
	 
	 	return describeSQLTuningAdvicesResponse;
	}
}