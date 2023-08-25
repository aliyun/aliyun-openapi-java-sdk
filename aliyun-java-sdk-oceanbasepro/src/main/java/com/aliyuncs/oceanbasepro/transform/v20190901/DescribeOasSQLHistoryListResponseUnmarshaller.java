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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOasSQLHistoryListResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOasSQLHistoryListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOasSQLHistoryListResponseUnmarshaller {

	public static DescribeOasSQLHistoryListResponse unmarshall(DescribeOasSQLHistoryListResponse describeOasSQLHistoryListResponse, UnmarshallerContext _ctx) {
		
		describeOasSQLHistoryListResponse.setRequestId(_ctx.stringValue("DescribeOasSQLHistoryListResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOasSQLHistoryListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSQLId(_ctx.stringValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].SQLId"));
			dataItem.setDbName(_ctx.stringValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].DbName"));
			dataItem.setAvgAffectedRows(_ctx.longValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgAffectedRows"));
			dataItem.setAvgBlockCacheHit(_ctx.longValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgBlockCacheHit"));
			dataItem.setAvgBlockIndexCacheHit(_ctx.longValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgBlockIndexCacheHit"));
			dataItem.setAvgBloomFilterCacheHit(_ctx.longValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgBloomFilterCacheHit"));
			dataItem.setExecutions(_ctx.longValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].Executions"));
			dataItem.setFailCount(_ctx.longValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].FailCount"));
			dataItem.setAvgRpcCount(_ctx.longValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgRpcCount"));
			dataItem.setRemotePlans(_ctx.longValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].RemotePlans"));
			dataItem.setMissPlans(_ctx.longValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].MissPlans"));
			dataItem.setAvgReturnRows(_ctx.longValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgReturnRows"));
			dataItem.setAvgLogicalReads(_ctx.longValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgLogicalReads"));
			dataItem.setRetryCount(_ctx.longValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].RetryCount"));
			dataItem.setAvgRowCacheHit(_ctx.longValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgRowCacheHit"));
			dataItem.setAvgDiskReads(_ctx.longValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgDiskReads"));
			dataItem.setAvgMemstoreReadRows(_ctx.longValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgMemstoreReadRows"));
			dataItem.setAvgSsstoreReadRows(_ctx.longValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgSsstoreReadRows"));
			dataItem.setAvgApplicationWaitTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgApplicationWaitTime"));
			dataItem.setAvgElapsedTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgElapsedTime"));
			dataItem.setAvgExecuteTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgExecuteTime"));
			dataItem.setAvgQueueTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgQueueTime"));
			dataItem.setAvgConcurrencyWaitTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgConcurrencyWaitTime"));
			dataItem.setAvgCpuTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgCpuTime"));
			dataItem.setAvgDecodeTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgDecodeTime"));
			dataItem.setAvgNetWaitTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgNetWaitTime"));
			dataItem.setAvgUserIoWaitTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgUserIoWaitTime"));
			dataItem.setAvgGetPlanTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgGetPlanTime"));
			dataItem.setMaxElapsedTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].MaxElapsedTime"));
			dataItem.setSumWaitTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].SumWaitTime"));
			dataItem.setAvgScheduleTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgScheduleTime"));
			dataItem.setMaxCpuTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].MaxCpuTime"));
			dataItem.setSumElapsedTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].SumElapsedTime"));
			dataItem.setTimestamp(_ctx.stringValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].Timestamp"));
			dataItem.setServer(_ctx.stringValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].Server"));
			dataItem.setUserName(_ctx.stringValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].UserName"));
			dataItem.setAvgPartitionCount(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgPartitionCount"));
			dataItem.setFailPercentage(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].FailPercentage"));
			dataItem.setRetCode4012Count(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].RetCode4012Count"));
			dataItem.setRetCode4013Count(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].RetCode4013Count"));
			dataItem.setRetCode5001Count(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].RetCode5001Count"));
			dataItem.setRetCode5024Count(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].RetCode5024Count"));
			dataItem.setRetCode5167Count(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].RetCode5167Count"));
			dataItem.setRetCode5217Count(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].RetCode5217Count"));
			dataItem.setRetCode6002Count(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].RetCode6002Count"));
			dataItem.setAvgWaitTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgWaitTime"));
			dataItem.setAvgWaitCount(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgWaitCount"));
			dataItem.setLocalPlanPercentage(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].LocalPlanPercentage"));
			dataItem.setRemotePlanPercentage(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].RemotePlanPercentage"));
			dataItem.setDistPlanPercentage(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].DistPlanPercentage"));
			dataItem.setAvgNetTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgNetTime"));
			dataItem.setAvgExecutorRpcCount(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgExecutorRpcCount"));
			dataItem.setMissPlanPercentage(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].MissPlanPercentage"));
			dataItem.setTableScanPercentage(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].TableScanPercentage"));
			dataItem.setStrongConsistencyPercentage(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].StrongConsistencyPercentage"));
			dataItem.setWeakConsistencyPercentage(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].WeakConsistencyPercentage"));
			dataItem.setMaxAffectedRows(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].MaxAffectedRows"));
			dataItem.setMaxReturnRows(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].MaxReturnRows"));
			dataItem.setMaxWaitTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].MaxWaitTime"));
			dataItem.setMaxApplicationWaitTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].MaxApplicationWaitTime"));
			dataItem.setMaxConcurrencyWaitTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].MaxConcurrencyWaitTime"));
			dataItem.setMaxUserIoWaitTime(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].MaxUserIoWaitTime"));
			dataItem.setMaxDiskReads(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].MaxDiskReads"));
			dataItem.setAvgExpectedWorkerCount(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgExpectedWorkerCount"));
			dataItem.setAvgUsedWorkerCount(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].AvgUsedWorkerCount"));
			dataItem.setSumLogicalReads(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].SumLogicalReads"));
			dataItem.setExecPs(_ctx.doubleValue("DescribeOasSQLHistoryListResponse.Data["+ i +"].ExecPs"));

			data.add(dataItem);
		}
		describeOasSQLHistoryListResponse.setData(data);
	 
	 	return describeOasSQLHistoryListResponse;
	}
}