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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSQLHistoryListResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSQLHistoryListResponse.SQLHistoryList;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSQLHistoryListResponse.SQLHistoryList.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLHistoryListResponseUnmarshaller {

	public static DescribeSQLHistoryListResponse unmarshall(DescribeSQLHistoryListResponse describeSQLHistoryListResponse, UnmarshallerContext _ctx) {
		
		describeSQLHistoryListResponse.setRequestId(_ctx.stringValue("DescribeSQLHistoryListResponse.RequestId"));

		SQLHistoryList sQLHistoryList = new SQLHistoryList();
		sQLHistoryList.setCount(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.Count"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLHistoryListResponse.SQLHistoryList.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setExecPerSecond(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].ExecPerSecond"));
			listItem.setMaxCpuTime(_ctx.floatValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].MaxCpuTime"));
			listItem.setBlockCacheHit(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].BlockCacheHit"));
			listItem.setDecodeTime(_ctx.floatValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].DecodeTime"));
			listItem.setRemotePlans(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].RemotePlans"));
			listItem.setRPCCount(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].RPCCount"));
			listItem.setNetWaitTime(_ctx.floatValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].NetWaitTime"));
			listItem.setDiskRead(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].DiskRead"));
			listItem.setNodeIp(_ctx.stringValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].NodeIp"));
			listItem.setConcurrencyWaitTime(_ctx.floatValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].ConcurrencyWaitTime"));
			listItem.setDbName(_ctx.stringValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].DbName"));
			listItem.setMemstoreReadRowCount(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].MemstoreReadRowCount"));
			listItem.setAppWaitTime(_ctx.floatValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].AppWaitTime"));
			listItem.setElapsedTime(_ctx.floatValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].ElapsedTime"));
			listItem.setMissPlans(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].MissPlans"));
			listItem.setAffectedRows(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].AffectedRows"));
			listItem.setScheduleTime(_ctx.floatValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].ScheduleTime"));
			listItem.setEvent(_ctx.stringValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].Event"));
			listItem.setTotalWaitTime(_ctx.floatValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].TotalWaitTime"));
			listItem.setReturnRows(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].ReturnRows"));
			listItem.setExecuteTime(_ctx.floatValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].ExecuteTime"));
			listItem.setUserName(_ctx.stringValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].UserName"));
			listItem.setExecutions(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].Executions"));
			listItem.setGetPlanTime(_ctx.floatValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].GetPlanTime"));
			listItem.setCpuTime(_ctx.floatValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].CpuTime"));
			listItem.setMaxElapsedTime(_ctx.floatValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].MaxElapsedTime"));
			listItem.setBlockIndexCacheHit(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].BlockIndexCacheHit"));
			listItem.setEndTimeUTCString(_ctx.stringValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].EndTimeUTCString"));
			listItem.setEndTime(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].EndTime"));
			listItem.setRetryCount(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].RetryCount"));
			listItem.setClientIp(_ctx.stringValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].ClientIp"));
			listItem.setBloomFilterCacheHit(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].BloomFilterCacheHit"));
			listItem.setIOWaitTime(_ctx.floatValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].IOWaitTime"));
			listItem.setFailTimes(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].FailTimes"));
			listItem.setQueueTime(_ctx.floatValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].QueueTime"));
			listItem.setRowCacheHit(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].RowCacheHit"));
			listItem.setLogicalRead(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].LogicalRead"));
			listItem.setSsstoreReadRowCount(_ctx.longValue("DescribeSQLHistoryListResponse.SQLHistoryList.List["+ i +"].SsstoreReadRowCount"));

			list.add(listItem);
		}
		sQLHistoryList.setList(list);
		describeSQLHistoryListResponse.setSQLHistoryList(sQLHistoryList);
	 
	 	return describeSQLHistoryListResponse;
	}
}