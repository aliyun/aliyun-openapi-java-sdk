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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOasSlowSQLListResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOasSlowSQLListResponse.DataItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOasSlowSQLListResponse.DataItem.SqlListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOasSlowSQLListResponseUnmarshaller {

	public static DescribeOasSlowSQLListResponse unmarshall(DescribeOasSlowSQLListResponse describeOasSlowSQLListResponse, UnmarshallerContext _ctx) {
		
		describeOasSlowSQLListResponse.setRequestId(_ctx.stringValue("DescribeOasSlowSQLListResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOasSlowSQLListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setExecutions(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].Executions"));
			dataItem.setRpcCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].RpcCount"));
			dataItem.setRemotePlans(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].RemotePlans"));
			dataItem.setMissPlans(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].MissPlans"));
			dataItem.setMaxElapsedTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].MaxElapsedTime"));
			dataItem.setTotalWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].TotalWaitTime"));
			dataItem.setExecPs(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].ExecPs"));
			dataItem.setMaxCpuTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].MaxCpuTime"));
			dataItem.setClientIp(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].ClientIp"));
			dataItem.setUserName(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].UserName"));
			dataItem.setDbName(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].DbName"));
			dataItem.setRetCode4012Count(_ctx.longValue("DescribeOasSlowSQLListResponse.Data["+ i +"].RetCode4012Count"));
			dataItem.setRetCode4013Count(_ctx.longValue("DescribeOasSlowSQLListResponse.Data["+ i +"].RetCode4013Count"));
			dataItem.setRetCode5001Count(_ctx.longValue("DescribeOasSlowSQLListResponse.Data["+ i +"].RetCode5001Count"));
			dataItem.setRetCode5024Count(_ctx.longValue("DescribeOasSlowSQLListResponse.Data["+ i +"].RetCode5024Count"));
			dataItem.setRetCode5167Count(_ctx.longValue("DescribeOasSlowSQLListResponse.Data["+ i +"].RetCode5167Count"));
			dataItem.setRetCode5217Count(_ctx.longValue("DescribeOasSlowSQLListResponse.Data["+ i +"].RetCode5217Count"));
			dataItem.setRetCode6002Count(_ctx.longValue("DescribeOasSlowSQLListResponse.Data["+ i +"].RetCode6002Count"));
			dataItem.setFailPercentage(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].FailPercentage"));
			dataItem.setSumWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SumWaitTime"));
			dataItem.setAvgWaitCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgWaitCount"));
			dataItem.setAvgRpcCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgRpcCount"));
			dataItem.setLocalPlanPercentage(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].LocalPlanPercentage"));
			dataItem.setRemotePlanPercentage(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].RemotePlanPercentage"));
			dataItem.setDistPlanPercentage(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].DistPlanPercentage"));
			dataItem.setSumElapsedTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SumElapsedTime"));
			dataItem.setAvgNetTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgNetTime"));
			dataItem.setAvgExecutorRpcCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgExecutorRpcCount"));
			dataItem.setMissPlanPercentage(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].MissPlanPercentage"));
			dataItem.setTableScanPercentage(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].TableScanPercentage"));
			dataItem.setStrongConsistencyPercentage(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].StrongConsistencyPercentage"));
			dataItem.setWeakConsistencyPercentage(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].WeakConsistencyPercentage"));
			dataItem.setMaxAffectedRows(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].MaxAffectedRows"));
			dataItem.setMaxReturnRows(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].MaxReturnRows"));
			dataItem.setMaxWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].MaxWaitTime"));
			dataItem.setMaxApplicationWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].MaxApplicationWaitTime"));
			dataItem.setMaxConcurrencyWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].MaxConcurrencyWaitTime"));
			dataItem.setMaxUserIoWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].MaxUserIoWaitTime"));
			dataItem.setMaxDiskReads(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].MaxDiskReads"));
			dataItem.setAvgExpectedWorkerCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgExpectedWorkerCount"));
			dataItem.setAvgUsedWorkerCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgUsedWorkerCount"));
			dataItem.setSumLogicalReads(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SumLogicalReads"));
			dataItem.setServer(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].Server"));
			dataItem.setServerIp(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].ServerIp"));
			dataItem.setServerPort(_ctx.longValue("DescribeOasSlowSQLListResponse.Data["+ i +"].ServerPort"));
			dataItem.setSqlTextShort(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlTextShort"));
			dataItem.setSqlType(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlType"));
			dataItem.setSqlId(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlId"));
			dataItem.setInner(_ctx.booleanValue("DescribeOasSlowSQLListResponse.Data["+ i +"].Inner"));
			dataItem.setWaitEvent(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].WaitEvent"));
			dataItem.setAvgAffectedRows(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgAffectedRows"));
			dataItem.setAvgReturnRows(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgReturnRows"));
			dataItem.setAvgPartitionCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgPartitionCount"));
			dataItem.setFailCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].FailCount"));
			dataItem.setAvgWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgWaitTime"));
			dataItem.setAvgElapsedTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgElapsedTime"));
			dataItem.setAvgCpuTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgCpuTime"));
			dataItem.setAvgNetWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgNetWaitTime"));
			dataItem.setAvgQueueTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgQueueTime"));
			dataItem.setAvgDecodeTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgDecodeTime"));
			dataItem.setAvgGetPlanTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgGetPlanTime"));
			dataItem.setAvgExecuteTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgExecuteTime"));
			dataItem.setAvgApplicationWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgApplicationWaitTime"));
			dataItem.setAvgConcurrencyWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgConcurrencyWaitTime"));
			dataItem.setAvgUserIoWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgUserIoWaitTime"));
			dataItem.setAvgScheduleTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgScheduleTime"));
			dataItem.setAvgRowCacheHit(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgRowCacheHit"));
			dataItem.setAvgBloomFilterCacheHit(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgBloomFilterCacheHit"));
			dataItem.setAvgBlockCacheHit(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgBlockCacheHit"));
			dataItem.setAvgBlockIndexCacheHit(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgBlockIndexCacheHit"));
			dataItem.setAvgDiskReads(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgDiskReads"));
			dataItem.setRetryCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].RetryCount"));
			dataItem.setAvgMemstoreReadRows(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgMemstoreReadRows"));
			dataItem.setAvgSsstoreReadRows(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgSsstoreReadRows"));
			dataItem.setAvgLogicalReads(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgLogicalReads"));
			dataItem.setDynamicSql(_ctx.booleanValue("DescribeOasSlowSQLListResponse.Data["+ i +"].DynamicSql"));
			dataItem.setAvgDbTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].AvgDbTime"));
			dataItem.setSumDbTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SumDbTime"));

			List<SqlListItem> sqlList = new ArrayList<SqlListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList.Length"); j++) {
				SqlListItem sqlListItem = new SqlListItem();
				sqlListItem.setExecutions(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].Executions"));
				sqlListItem.setRpcCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].RpcCount"));
				sqlListItem.setRemotePlans(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].RemotePlans"));
				sqlListItem.setMissPlans(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].MissPlans"));
				sqlListItem.setMaxElapsedTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].MaxElapsedTime"));
				sqlListItem.setTotalWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].TotalWaitTime"));
				sqlListItem.setExecPs(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].ExecPs"));
				sqlListItem.setMaxCpuTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].MaxCpuTime"));
				sqlListItem.setClientIp(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].ClientIp"));
				sqlListItem.setUserName(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].UserName"));
				sqlListItem.setDbName(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].DbName"));
				sqlListItem.setRetCode4012Count(_ctx.longValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].RetCode4012Count"));
				sqlListItem.setRetCode4013Count(_ctx.longValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].RetCode4013Count"));
				sqlListItem.setRetCode5001Count(_ctx.longValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].RetCode5001Count"));
				sqlListItem.setRetCode5024Count(_ctx.longValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].RetCode5024Count"));
				sqlListItem.setRetCode5167Count(_ctx.longValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].RetCode5167Count"));
				sqlListItem.setRetCode5217Count(_ctx.longValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].RetCode5217Count"));
				sqlListItem.setRetCode6002Count(_ctx.longValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].RetCode6002Count"));
				sqlListItem.setFailPercentage(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].FailPercentage"));
				sqlListItem.setSumWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].SumWaitTime"));
				sqlListItem.setAvgWaitCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgWaitCount"));
				sqlListItem.setAvgRpcCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgRpcCount"));
				sqlListItem.setLocalPlanPercentage(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].LocalPlanPercentage"));
				sqlListItem.setRemotePlanPercentage(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].RemotePlanPercentage"));
				sqlListItem.setDistPlanPercentage(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].DistPlanPercentage"));
				sqlListItem.setSumElapsedTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].SumElapsedTime"));
				sqlListItem.setAvgNetTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgNetTime"));
				sqlListItem.setAvgExecutorRpcCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgExecutorRpcCount"));
				sqlListItem.setMissPlanPercentage(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].MissPlanPercentage"));
				sqlListItem.setTableScanPercentage(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].TableScanPercentage"));
				sqlListItem.setStrongConsistencyPercentage(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].StrongConsistencyPercentage"));
				sqlListItem.setWeakConsistencyPercentage(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].WeakConsistencyPercentage"));
				sqlListItem.setMaxAffectedRows(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].MaxAffectedRows"));
				sqlListItem.setMaxReturnRows(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].MaxReturnRows"));
				sqlListItem.setMaxWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].MaxWaitTime"));
				sqlListItem.setMaxApplicationWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].MaxApplicationWaitTime"));
				sqlListItem.setMaxConcurrencyWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].MaxConcurrencyWaitTime"));
				sqlListItem.setMaxUserIoWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].MaxUserIoWaitTime"));
				sqlListItem.setMaxDiskReads(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].MaxDiskReads"));
				sqlListItem.setAvgExpectedWorkerCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgExpectedWorkerCount"));
				sqlListItem.setAvgUsedWorkerCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgUsedWorkerCount"));
				sqlListItem.setSumLogicalReads(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].SumLogicalReads"));
				sqlListItem.setServer(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].Server"));
				sqlListItem.setServerIp(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].ServerIp"));
				sqlListItem.setServerPort(_ctx.longValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].ServerPort"));
				sqlListItem.setSqlTextShort(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].SqlTextShort"));
				sqlListItem.setSqlType(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].SqlType"));
				sqlListItem.setSqlId(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].SqlId"));
				sqlListItem.setInner(_ctx.booleanValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].Inner"));
				sqlListItem.setWaitEvent(_ctx.stringValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].WaitEvent"));
				sqlListItem.setAvgAffectedRows(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgAffectedRows"));
				sqlListItem.setAvgReturnRows(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgReturnRows"));
				sqlListItem.setAvgPartitionCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgPartitionCount"));
				sqlListItem.setFailCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].FailCount"));
				sqlListItem.setAvgWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgWaitTime"));
				sqlListItem.setAvgElapsedTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgElapsedTime"));
				sqlListItem.setAvgCpuTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgCpuTime"));
				sqlListItem.setAvgNetWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgNetWaitTime"));
				sqlListItem.setAvgQueueTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgQueueTime"));
				sqlListItem.setAvgDecodeTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgDecodeTime"));
				sqlListItem.setAvgGetPlanTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgGetPlanTime"));
				sqlListItem.setAvgExecuteTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgExecuteTime"));
				sqlListItem.setAvgApplicationWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgApplicationWaitTime"));
				sqlListItem.setAvgConcurrencyWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgConcurrencyWaitTime"));
				sqlListItem.setAvgUserIoWaitTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgUserIoWaitTime"));
				sqlListItem.setAvgScheduleTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgScheduleTime"));
				sqlListItem.setAvgRowCacheHit(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgRowCacheHit"));
				sqlListItem.setAvgBloomFilterCacheHit(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgBloomFilterCacheHit"));
				sqlListItem.setAvgBlockCacheHit(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgBlockCacheHit"));
				sqlListItem.setAvgBlockIndexCacheHit(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgBlockIndexCacheHit"));
				sqlListItem.setAvgDiskReads(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgDiskReads"));
				sqlListItem.setRetryCount(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].RetryCount"));
				sqlListItem.setAvgMemstoreReadRows(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgMemstoreReadRows"));
				sqlListItem.setAvgSsstoreReadRows(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgSsstoreReadRows"));
				sqlListItem.setAvgLogicalReads(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgLogicalReads"));
				sqlListItem.setAvgDbTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].AvgDbTime"));
				sqlListItem.setSumDbTime(_ctx.doubleValue("DescribeOasSlowSQLListResponse.Data["+ i +"].SqlList["+ j +"].SumDbTime"));

				sqlList.add(sqlListItem);
			}
			dataItem.setSqlList(sqlList);

			data.add(dataItem);
		}
		describeOasSlowSQLListResponse.setData(data);
	 
	 	return describeOasSlowSQLListResponse;
	}
}