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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSQLSamplesResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSQLSamplesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLSamplesResponseUnmarshaller {

	public static DescribeSQLSamplesResponse unmarshall(DescribeSQLSamplesResponse describeSQLSamplesResponse, UnmarshallerContext _ctx) {
		
		describeSQLSamplesResponse.setRequestId(_ctx.stringValue("DescribeSQLSamplesResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLSamplesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRequestId(_ctx.stringValue("DescribeSQLSamplesResponse.Data["+ i +"].RequestId"));
			dataItem.setTraceId(_ctx.stringValue("DescribeSQLSamplesResponse.Data["+ i +"].TraceId"));
			dataItem.setRequestTime(_ctx.stringValue("DescribeSQLSamplesResponse.Data["+ i +"].RequestTime"));
			dataItem.setServer(_ctx.stringValue("DescribeSQLSamplesResponse.Data["+ i +"].Server"));
			dataItem.setClientIp(_ctx.stringValue("DescribeSQLSamplesResponse.Data["+ i +"].ClientIp"));
			dataItem.setClientPort(_ctx.stringValue("DescribeSQLSamplesResponse.Data["+ i +"].ClientPort"));
			dataItem.setDbName(_ctx.stringValue("DescribeSQLSamplesResponse.Data["+ i +"].DbName"));
			dataItem.setUserName(_ctx.stringValue("DescribeSQLSamplesResponse.Data["+ i +"].UserName"));
			dataItem.setSqlType(_ctx.stringValue("DescribeSQLSamplesResponse.Data["+ i +"].SqlType"));
			dataItem.setPlanId(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].PlanId"));
			dataItem.setAffectedRows(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].AffectedRows"));
			dataItem.setReturnRows(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].ReturnRows"));
			dataItem.setPartitionCount(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].PartitionCount"));
			dataItem.setRetCode(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].RetCode"));
			dataItem.setWaitEvent(_ctx.stringValue("DescribeSQLSamplesResponse.Data["+ i +"].WaitEvent"));
			dataItem.setWaitTime(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].WaitTime"));
			dataItem.setWaitCount(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].WaitCount"));
			dataItem.setRpcCount(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].RpcCount"));
			dataItem.setPlanType(_ctx.stringValue("DescribeSQLSamplesResponse.Data["+ i +"].PlanType"));
			dataItem.setInner(_ctx.booleanValue("DescribeSQLSamplesResponse.Data["+ i +"].Inner"));
			dataItem.setExecutorRpc(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].ExecutorRpc"));
			dataItem.setHitPlan(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].HitPlan"));
			dataItem.setElapsedTime(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].ElapsedTime"));
			dataItem.setCpuTime(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].CpuTime"));
			dataItem.setNetTime(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].NetTime"));
			dataItem.setNetWaitTime(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].NetWaitTime"));
			dataItem.setQueueTime(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].QueueTime"));
			dataItem.setDecodeTime(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].DecodeTime"));
			dataItem.setGetPlanTime(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].GetPlanTime"));
			dataItem.setExecuteTime(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].ExecuteTime"));
			dataItem.setApplicationWaitTime(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].ApplicationWaitTime"));
			dataItem.setConcurrencyWaitTime(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].ConcurrencyWaitTime"));
			dataItem.setUserIoWaitTime(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].UserIoWaitTime"));
			dataItem.setScheduleTime(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].ScheduleTime"));
			dataItem.setRowCacheHit(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].RowCacheHit"));
			dataItem.setBloomFilterCacheHit(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].BloomFilterCacheHit"));
			dataItem.setBlockCacheHit(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].BlockCacheHit"));
			dataItem.setBlockIndexCacheHit(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].BlockIndexCacheHit"));
			dataItem.setDiskReads(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].DiskReads"));
			dataItem.setRetryCount(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].RetryCount"));
			dataItem.setTableScan(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].TableScan"));
			dataItem.setConsistencyLevel(_ctx.stringValue("DescribeSQLSamplesResponse.Data["+ i +"].ConsistencyLevel"));
			dataItem.setMemstoreReadRows(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].MemstoreReadRows"));
			dataItem.setExpectedWorkerCount(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].ExpectedWorkerCount"));
			dataItem.setUsedWorkerCount(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].UsedWorkerCount"));
			dataItem.setSsstoreReadRows(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].SsstoreReadRows"));
			dataItem.setObServerId(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].ObServerId"));
			dataItem.setObUserId(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].ObUserId"));
			dataItem.setObDbId(_ctx.doubleValue("DescribeSQLSamplesResponse.Data["+ i +"].ObDbId"));
			dataItem.setStatement(_ctx.stringValue("DescribeSQLSamplesResponse.Data["+ i +"].Statement"));
			dataItem.setTransHash(_ctx.stringValue("DescribeSQLSamplesResponse.Data["+ i +"].TransHash"));
			dataItem.setFullSqlText(_ctx.stringValue("DescribeSQLSamplesResponse.Data["+ i +"].FullSqlText"));

			data.add(dataItem);
		}
		describeSQLSamplesResponse.setData(data);
	 
	 	return describeSQLSamplesResponse;
	}
}