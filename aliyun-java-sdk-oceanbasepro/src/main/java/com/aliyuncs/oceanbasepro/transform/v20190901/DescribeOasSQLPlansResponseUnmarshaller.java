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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOasSQLPlansResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOasSQLPlansResponse.DataItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOasSQLPlansResponse.DataItem.PlanExplain;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOasSQLPlansResponse.DataItem.PlansItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOasSQLPlansResponseUnmarshaller {

	public static DescribeOasSQLPlansResponse unmarshall(DescribeOasSQLPlansResponse describeOasSQLPlansResponse, UnmarshallerContext _ctx) {
		
		describeOasSQLPlansResponse.setRequestId(_ctx.stringValue("DescribeOasSQLPlansResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOasSQLPlansResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setPlanHash(_ctx.stringValue("DescribeOasSQLPlansResponse.Data["+ i +"].PlanHash"));
			dataItem.setMergedVersion(_ctx.longValue("DescribeOasSQLPlansResponse.Data["+ i +"].MergedVersion"));
			dataItem.setFirstLoadTime(_ctx.stringValue("DescribeOasSQLPlansResponse.Data["+ i +"].FirstLoadTime"));
			dataItem.setPlanType(_ctx.stringValue("DescribeOasSQLPlansResponse.Data["+ i +"].PlanType"));
			dataItem.setHitDiagnosis(_ctx.booleanValue("DescribeOasSQLPlansResponse.Data["+ i +"].HitDiagnosis"));
			dataItem.setHitPercentage(_ctx.doubleValue("DescribeOasSQLPlansResponse.Data["+ i +"].HitPercentage"));
			dataItem.setAvgCpuTime(_ctx.doubleValue("DescribeOasSQLPlansResponse.Data["+ i +"].AvgCpuTime"));
			dataItem.setExecutions(_ctx.longValue("DescribeOasSQLPlansResponse.Data["+ i +"].Executions"));
			dataItem.setPlanUnionHash(_ctx.stringValue("DescribeOasSQLPlansResponse.Data["+ i +"].PlanUnionHash"));
			dataItem.setQuerySql(_ctx.stringValue("DescribeOasSQLPlansResponse.Data["+ i +"].QuerySql"));
			dataItem.setBounded(_ctx.booleanValue("DescribeOasSQLPlansResponse.Data["+ i +"].Bounded"));

			PlanExplain planExplain = new PlanExplain();
			planExplain.setPlanJsonString(_ctx.stringValue("DescribeOasSQLPlansResponse.Data["+ i +"].PlanExplain.PlanJsonString"));
			dataItem.setPlanExplain(planExplain);

			List<PlansItem> plans = new ArrayList<PlansItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans.Length"); j++) {
				PlansItem plansItem = new PlansItem();
				plansItem.setUid(_ctx.stringValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].Uid"));
				plansItem.setPlanId(_ctx.longValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].PlanId"));
				plansItem.setFirstLoadTime(_ctx.stringValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].FirstLoadTime"));
				plansItem.setPlanType(_ctx.stringValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].PlanType"));
				plansItem.setPlanHash(_ctx.stringValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].PlanHash"));
				plansItem.setPlanSize(_ctx.longValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].PlanSize"));
				plansItem.setSchemaVersion(_ctx.longValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].SchemaVersion"));
				plansItem.setMergedVersion(_ctx.longValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].MergedVersion"));
				plansItem.setObServerId(_ctx.longValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].ObServerId"));
				plansItem.setObDbId(_ctx.longValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].ObDbId"));
				plansItem.setServerId(_ctx.longValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].ServerId"));
				plansItem.setFirstLoadTimeUs(_ctx.longValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].FirstLoadTimeUs"));
				plansItem.setHitDiagnosis(_ctx.booleanValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].HitDiagnosis"));
				plansItem.setOutlineData(_ctx.stringValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].OutlineData"));
				plansItem.setOutlineId(_ctx.longValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].OutlineId"));
				plansItem.setCollectTimeUs(_ctx.longValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].CollectTimeUs"));
				plansItem.setServer(_ctx.stringValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].Server"));
				plansItem.setHitPercentage(_ctx.doubleValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].HitPercentage"));
				plansItem.setExecutions(_ctx.longValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].Executions"));
				plansItem.setExecPs(_ctx.doubleValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].ExecPs"));
				plansItem.setAvgDiskReads(_ctx.doubleValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].AvgDiskReads"));
				plansItem.setAvgDiskWrites(_ctx.doubleValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].AvgDiskWrites"));
				plansItem.setAvgBufferGets(_ctx.doubleValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].AvgBufferGets"));
				plansItem.setAvgApplicationWaitTime(_ctx.doubleValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].AvgApplicationWaitTime"));
				plansItem.setAvgConcurrencyWaitTime(_ctx.doubleValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].AvgConcurrencyWaitTime"));
				plansItem.setAvgUserIoWaitTime(_ctx.doubleValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].AvgUserIoWaitTime"));
				plansItem.setAvgRowProcessed(_ctx.doubleValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].AvgRowProcessed"));
				plansItem.setAvgElapsedTime(_ctx.doubleValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].AvgElapsedTime"));
				plansItem.setAvgCpuTime(_ctx.doubleValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].AvgCpuTime"));
				plansItem.setLargeQueryPercentage(_ctx.doubleValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].LargeQueryPercentage"));
				plansItem.setDelayedLargeQueryPercentage(_ctx.doubleValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].DelayedLargeQueryPercentage"));
				plansItem.setTimeoutPercentage(_ctx.doubleValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].TimeoutPercentage"));
				plansItem.setTableScan(_ctx.booleanValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].TableScan"));
				plansItem.setPlanUnionHash(_ctx.stringValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].PlanUnionHash"));
				plansItem.setSqlId(_ctx.stringValue("DescribeOasSQLPlansResponse.Data["+ i +"].Plans["+ j +"].SqlId"));

				plans.add(plansItem);
			}
			dataItem.setPlans(plans);

			data.add(dataItem);
		}
		describeOasSQLPlansResponse.setData(data);
	 
	 	return describeOasSQLPlansResponse;
	}
}