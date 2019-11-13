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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeGtmRecoveryPlanResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmRecoveryPlanResponse.FaultAddrPool;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmRecoveryPlanResponse.FaultAddrPool.Addr;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGtmRecoveryPlanResponseUnmarshaller {

	public static DescribeGtmRecoveryPlanResponse unmarshall(DescribeGtmRecoveryPlanResponse describeGtmRecoveryPlanResponse, UnmarshallerContext _ctx) {
		
		describeGtmRecoveryPlanResponse.setRequestId(_ctx.stringValue("DescribeGtmRecoveryPlanResponse.RequestId"));
		describeGtmRecoveryPlanResponse.setRecoveryPlanId(_ctx.longValue("DescribeGtmRecoveryPlanResponse.RecoveryPlanId"));
		describeGtmRecoveryPlanResponse.setName(_ctx.stringValue("DescribeGtmRecoveryPlanResponse.Name"));
		describeGtmRecoveryPlanResponse.setRemark(_ctx.stringValue("DescribeGtmRecoveryPlanResponse.Remark"));
		describeGtmRecoveryPlanResponse.setFaultAddrPoolNum(_ctx.integerValue("DescribeGtmRecoveryPlanResponse.FaultAddrPoolNum"));
		describeGtmRecoveryPlanResponse.setStatus(_ctx.stringValue("DescribeGtmRecoveryPlanResponse.Status"));
		describeGtmRecoveryPlanResponse.setLastExecuteTime(_ctx.stringValue("DescribeGtmRecoveryPlanResponse.LastExecuteTime"));
		describeGtmRecoveryPlanResponse.setLastExecuteTimestamp(_ctx.longValue("DescribeGtmRecoveryPlanResponse.LastExecuteTimestamp"));
		describeGtmRecoveryPlanResponse.setLastRollbackTime(_ctx.stringValue("DescribeGtmRecoveryPlanResponse.LastRollbackTime"));
		describeGtmRecoveryPlanResponse.setLastRollbackTimestamp(_ctx.longValue("DescribeGtmRecoveryPlanResponse.LastRollbackTimestamp"));
		describeGtmRecoveryPlanResponse.setCreateTime(_ctx.stringValue("DescribeGtmRecoveryPlanResponse.CreateTime"));
		describeGtmRecoveryPlanResponse.setCreateTimestamp(_ctx.longValue("DescribeGtmRecoveryPlanResponse.CreateTimestamp"));
		describeGtmRecoveryPlanResponse.setUpdateTime(_ctx.stringValue("DescribeGtmRecoveryPlanResponse.UpdateTime"));
		describeGtmRecoveryPlanResponse.setUpdateTimestamp(_ctx.longValue("DescribeGtmRecoveryPlanResponse.UpdateTimestamp"));

		List<FaultAddrPool> faultAddrPools = new ArrayList<FaultAddrPool>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGtmRecoveryPlanResponse.FaultAddrPools.Length"); i++) {
			FaultAddrPool faultAddrPool = new FaultAddrPool();
			faultAddrPool.setAddrPoolId(_ctx.stringValue("DescribeGtmRecoveryPlanResponse.FaultAddrPools["+ i +"].AddrPoolId"));
			faultAddrPool.setAddrPoolName(_ctx.stringValue("DescribeGtmRecoveryPlanResponse.FaultAddrPools["+ i +"].AddrPoolName"));
			faultAddrPool.setInstanceId(_ctx.stringValue("DescribeGtmRecoveryPlanResponse.FaultAddrPools["+ i +"].InstanceId"));

			List<Addr> addrs = new ArrayList<Addr>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGtmRecoveryPlanResponse.FaultAddrPools["+ i +"].Addrs.Length"); j++) {
				Addr addr = new Addr();
				addr.setId(_ctx.longValue("DescribeGtmRecoveryPlanResponse.FaultAddrPools["+ i +"].Addrs["+ j +"].Id"));
				addr.setMode(_ctx.stringValue("DescribeGtmRecoveryPlanResponse.FaultAddrPools["+ i +"].Addrs["+ j +"].Mode"));
				addr.setValue(_ctx.stringValue("DescribeGtmRecoveryPlanResponse.FaultAddrPools["+ i +"].Addrs["+ j +"].Value"));

				addrs.add(addr);
			}
			faultAddrPool.setAddrs(addrs);

			faultAddrPools.add(faultAddrPool);
		}
		describeGtmRecoveryPlanResponse.setFaultAddrPools(faultAddrPools);
	 
	 	return describeGtmRecoveryPlanResponse;
	}
}