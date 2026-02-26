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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSlowSQLListResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSlowSQLListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlowSQLListResponseUnmarshaller {

	public static DescribeSlowSQLListResponse unmarshall(DescribeSlowSQLListResponse describeSlowSQLListResponse, UnmarshallerContext _ctx) {
		
		describeSlowSQLListResponse.setRequestId(_ctx.stringValue("DescribeSlowSQLListResponse.RequestId"));
		describeSlowSQLListResponse.setTotalCount(_ctx.longValue("DescribeSlowSQLListResponse.TotalCount"));

		List<Data> slowSQLList = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowSQLListResponse.SlowSQLList.Length"); i++) {
			Data data = new Data();
			data.setKey(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].Key"));
			data.setExecPerSecond(_ctx.floatValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].ExecPerSecond"));
			data.setSQLText(_ctx.stringValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].SQLText"));
			data.setMaxCpuTime(_ctx.floatValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].MaxCpuTime"));
			data.setBlockCacheHit(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].BlockCacheHit"));
			data.setDecodeTime(_ctx.floatValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].DecodeTime"));
			data.setRemotePlans(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].RemotePlans"));
			data.setRPCCount(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].RPCCount"));
			data.setNetWaitTime(_ctx.floatValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].NetWaitTime"));
			data.setDiskRead(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].DiskRead"));
			data.setNodeIp(_ctx.stringValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].NodeIp"));
			data.setConcurrencyWaitTime(_ctx.floatValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].ConcurrencyWaitTime"));
			data.setMemstoreReadRowCount(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].MemstoreReadRowCount"));
			data.setDbName(_ctx.stringValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].DbName"));
			data.setAppWaitTime(_ctx.floatValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].AppWaitTime"));
			data.setElapsedTime(_ctx.floatValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].ElapsedTime"));
			data.setMissPlans(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].MissPlans"));
			data.setAffectedRows(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].AffectedRows"));
			data.setScheduleTime(_ctx.floatValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].ScheduleTime"));
			data.setEvent(_ctx.stringValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].Event"));
			data.setTotalWaitTime(_ctx.floatValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].TotalWaitTime"));
			data.setReturnRows(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].ReturnRows"));
			data.setExecuteTime(_ctx.floatValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].ExecuteTime"));
			data.setUserName(_ctx.stringValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].UserName"));
			data.setExecutions(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].Executions"));
			data.setGetPlanTime(_ctx.floatValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].GetPlanTime"));
			data.setCpuTime(_ctx.floatValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].CpuTime"));
			data.setMaxElapsedTime(_ctx.floatValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].MaxElapsedTime"));
			data.setSQLType(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].SQLType"));
			data.setBlockIndexCacheHit(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].BlockIndexCacheHit"));
			data.setRetryCount(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].RetryCount"));
			data.setSQLId(_ctx.stringValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].SQLId"));
			data.setClientIp(_ctx.stringValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].ClientIp"));
			data.setBloomFilterCacheHit(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].BloomFilterCacheHit"));
			data.setIOWaitTime(_ctx.floatValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].IOWaitTime"));
			data.setFailTimes(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].FailTimes"));
			data.setQueueTime(_ctx.floatValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].QueueTime"));
			data.setRowCacheHit(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].RowCacheHit"));
			data.setLogicalRead(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].LogicalRead"));
			data.setSsstoreReadRowCount(_ctx.longValue("DescribeSlowSQLListResponse.SlowSQLList["+ i +"].SsstoreReadRowCount"));

			slowSQLList.add(data);
		}
		describeSlowSQLListResponse.setSlowSQLList(slowSQLList);
	 
	 	return describeSlowSQLListResponse;
	}
}