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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTopSQLListResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTopSQLListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTopSQLListResponseUnmarshaller {

	public static DescribeTopSQLListResponse unmarshall(DescribeTopSQLListResponse describeTopSQLListResponse, UnmarshallerContext _ctx) {
		
		describeTopSQLListResponse.setRequestId(_ctx.stringValue("DescribeTopSQLListResponse.RequestId"));
		describeTopSQLListResponse.setTotalCount(_ctx.longValue("DescribeTopSQLListResponse.TotalCount"));

		List<Data> topSQLList = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTopSQLListResponse.TopSQLList.Length"); i++) {
			Data data = new Data();
			data.setKey(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].Key"));
			data.setExecPerSecond(_ctx.floatValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].ExecPerSecond"));
			data.setSQLText(_ctx.stringValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].SQLText"));
			data.setMaxCpuTime(_ctx.floatValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].MaxCpuTime"));
			data.setBlockCacheHit(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].BlockCacheHit"));
			data.setDecodeTime(_ctx.floatValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].DecodeTime"));
			data.setRemotePlans(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].RemotePlans"));
			data.setRPCCount(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].RPCCount"));
			data.setNetWaitTime(_ctx.floatValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].NetWaitTime"));
			data.setDiskRead(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].DiskRead"));
			data.setNodeIp(_ctx.stringValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].NodeIp"));
			data.setConcurrencyWaitTime(_ctx.floatValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].ConcurrencyWaitTime"));
			data.setMemstoreReadRowCount(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].MemstoreReadRowCount"));
			data.setDbName(_ctx.stringValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].DbName"));
			data.setAppWaitTime(_ctx.floatValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].AppWaitTime"));
			data.setElapsedTime(_ctx.floatValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].ElapsedTime"));
			data.setMissPlans(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].MissPlans"));
			data.setAffectedRows(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].AffectedRows"));
			data.setScheduleTime(_ctx.floatValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].ScheduleTime"));
			data.setEvent(_ctx.stringValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].Event"));
			data.setTotalWaitTime(_ctx.floatValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].TotalWaitTime"));
			data.setReturnRows(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].ReturnRows"));
			data.setExecuteTime(_ctx.floatValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].ExecuteTime"));
			data.setUserName(_ctx.stringValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].UserName"));
			data.setExecutions(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].Executions"));
			data.setGetPlanTime(_ctx.floatValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].GetPlanTime"));
			data.setCpuTime(_ctx.floatValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].CpuTime"));
			data.setMaxElapsedTime(_ctx.floatValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].MaxElapsedTime"));
			data.setSQLType(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].SQLType"));
			data.setBlockIndexCacheHit(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].BlockIndexCacheHit"));
			data.setRetryCount(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].RetryCount"));
			data.setSQLId(_ctx.stringValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].SQLId"));
			data.setClientIp(_ctx.stringValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].ClientIp"));
			data.setBloomFilterCacheHit(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].BloomFilterCacheHit"));
			data.setIOWaitTime(_ctx.floatValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].IOWaitTime"));
			data.setFailTimes(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].FailTimes"));
			data.setQueueTime(_ctx.floatValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].QueueTime"));
			data.setRowCacheHit(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].RowCacheHit"));
			data.setLogicalRead(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].LogicalRead"));
			data.setSsstoreReadRowCount(_ctx.longValue("DescribeTopSQLListResponse.TopSQLList["+ i +"].SsstoreReadRowCount"));

			topSQLList.add(data);
		}
		describeTopSQLListResponse.setTopSQLList(topSQLList);
	 
	 	return describeTopSQLListResponse;
	}
}