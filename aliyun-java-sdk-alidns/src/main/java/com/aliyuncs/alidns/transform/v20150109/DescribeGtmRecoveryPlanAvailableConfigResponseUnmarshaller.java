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

import com.aliyuncs.alidns.model.v20150109.DescribeGtmRecoveryPlanAvailableConfigResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmRecoveryPlanAvailableConfigResponse.Instance;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmRecoveryPlanAvailableConfigResponse.Instance.AddrPool;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGtmRecoveryPlanAvailableConfigResponseUnmarshaller {

	public static DescribeGtmRecoveryPlanAvailableConfigResponse unmarshall(DescribeGtmRecoveryPlanAvailableConfigResponse describeGtmRecoveryPlanAvailableConfigResponse, UnmarshallerContext _ctx) {
		
		describeGtmRecoveryPlanAvailableConfigResponse.setRequestId(_ctx.stringValue("DescribeGtmRecoveryPlanAvailableConfigResponse.RequestId"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGtmRecoveryPlanAvailableConfigResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("DescribeGtmRecoveryPlanAvailableConfigResponse.Instances["+ i +"].InstanceId"));
			instance.setInstanceName(_ctx.stringValue("DescribeGtmRecoveryPlanAvailableConfigResponse.Instances["+ i +"].InstanceName"));

			List<AddrPool> addrPools = new ArrayList<AddrPool>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGtmRecoveryPlanAvailableConfigResponse.Instances["+ i +"].AddrPools.Length"); j++) {
				AddrPool addrPool = new AddrPool();
				addrPool.setAddrPoolId(_ctx.stringValue("DescribeGtmRecoveryPlanAvailableConfigResponse.Instances["+ i +"].AddrPools["+ j +"].AddrPoolId"));
				addrPool.setName(_ctx.stringValue("DescribeGtmRecoveryPlanAvailableConfigResponse.Instances["+ i +"].AddrPools["+ j +"].Name"));

				addrPools.add(addrPool);
			}
			instance.setAddrPools(addrPools);

			instances.add(instance);
		}
		describeGtmRecoveryPlanAvailableConfigResponse.setInstances(instances);
	 
	 	return describeGtmRecoveryPlanAvailableConfigResponse;
	}
}