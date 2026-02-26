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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSlowSQLHistoryListResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowSQLHistoryListResponseUnmarshaller {

	public static DescribeSlowSQLHistoryListResponse unmarshall(DescribeSlowSQLHistoryListResponse describeSlowSQLHistoryListResponse, UnmarshallerContext _ctx) {
		
		describeSlowSQLHistoryListResponse.setRequestId(_ctx.stringValue("DescribeSlowSQLHistoryListResponse.RequestId"));

		SlowSQLHistoryList slowSQLHistoryList = new SlowSQLHistoryList();
		slowSQLHistoryList.setCount(_ctx.longValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.Count"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setSqlId(_ctx.stringValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].SqlId"));
			listItem.setSqlType(_ctx.stringValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].SqlType"));
			listItem.setTenantName(_ctx.stringValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].TenantName"));
			listItem.setUserName(_ctx.stringValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].UserName"));
			listItem.setClientIp(_ctx.stringValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].ClientIp"));
			listItem.setDbName(_ctx.stringValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].DbName"));
			listItem.setEvent(_ctx.stringValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].Event"));
			listItem.setNodeIp(_ctx.stringValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].NodeIp"));
			listItem.setAffectedRows(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].AffectedRows"));
			listItem.setBlockCacheHit(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].BlockCacheHit"));
			listItem.setBlockIndexCacheHit(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].BlockIndexCacheHit"));
			listItem.setBloomFilterCacheHit(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].BloomFilterCacheHit"));
			listItem.setExecutions(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].Executions"));
			listItem.setFailTimes(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].FailTimes"));
			listItem.setRPCCount(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].RPCCount"));
			listItem.setRemotePlans(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].RemotePlans"));
			listItem.setMissPlans(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].MissPlans"));
			listItem.setReturnRows(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].ReturnRows"));
			listItem.setLogicalRead(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].LogicalRead"));
			listItem.setRetryCount(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].RetryCount"));
			listItem.setRowCacheHit(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].RowCacheHit"));
			listItem.setDiskRead(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].DiskRead"));
			listItem.setMemstoreReadRowCount(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].MemstoreReadRowCount"));
			listItem.setSsstoreReadRowCount(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].SsstoreReadRowCount"));
			listItem.setExecPerSecond(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].ExecPerSecond"));
			listItem.setAppWaitTime(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].AppWaitTime"));
			listItem.setElapsedTime(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].ElapsedTime"));
			listItem.setExecuteTime(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].ExecuteTime"));
			listItem.setQueueTime(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].QueueTime"));
			listItem.setConcurrencyWaitTime(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].ConcurrencyWaitTime"));
			listItem.setCpuTime(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].CpuTime"));
			listItem.setDecodeTime(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].DecodeTime"));
			listItem.setNetWaitTime(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].NetWaitTime"));
			listItem.setIOWaitTime(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].IOWaitTime"));
			listItem.setGetPlanTime(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].GetPlanTime"));
			listItem.setMaxElapsedTime(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].MaxElapsedTime"));
			listItem.setTotalWaitTime(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].TotalWaitTime"));
			listItem.setScheduleTime(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].ScheduleTime"));
			listItem.setMaxCpuTime(_ctx.doubleValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].MaxCpuTime"));
			listItem.setEndTimeUTCString(_ctx.stringValue("DescribeSlowSQLHistoryListResponse.SlowSQLHistoryList.List["+ i +"].EndTimeUTCString"));

			list.add(listItem);
		}
		slowSQLHistoryList.setList(list);
		describeSlowSQLHistoryListResponse.setSlowSQLHistoryList(slowSQLHistoryList);
	 
	 	return describeSlowSQLHistoryListResponse;
	}
}