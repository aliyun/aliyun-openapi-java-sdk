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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeEnsResourceUsageResponse;
import com.aliyuncs.ens.model.v20171110.DescribeEnsResourceUsageResponse.EnsResourceUsageItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnsResourceUsageResponseUnmarshaller {

	public static DescribeEnsResourceUsageResponse unmarshall(DescribeEnsResourceUsageResponse describeEnsResourceUsageResponse, UnmarshallerContext _ctx) {
		
		describeEnsResourceUsageResponse.setRequestId(_ctx.stringValue("DescribeEnsResourceUsageResponse.RequestId"));

		List<EnsResourceUsageItem> ensResourceUsage = new ArrayList<EnsResourceUsageItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnsResourceUsageResponse.EnsResourceUsage.Length"); i++) {
			EnsResourceUsageItem ensResourceUsageItem = new EnsResourceUsageItem();
			ensResourceUsageItem.setServiceType(_ctx.stringValue("DescribeEnsResourceUsageResponse.EnsResourceUsage["+ i +"].ServiceType"));
			ensResourceUsageItem.setInstanceCount(_ctx.integerValue("DescribeEnsResourceUsageResponse.EnsResourceUsage["+ i +"].InstanceCount"));
			ensResourceUsageItem.setCpuSum(_ctx.longValue("DescribeEnsResourceUsageResponse.EnsResourceUsage["+ i +"].CpuSum"));
			ensResourceUsageItem.setGpuSum(_ctx.longValue("DescribeEnsResourceUsageResponse.EnsResourceUsage["+ i +"].GpuSum"));
			ensResourceUsageItem.setDownCount(_ctx.integerValue("DescribeEnsResourceUsageResponse.EnsResourceUsage["+ i +"].DownCount"));
			ensResourceUsageItem.setExpiredCount(_ctx.integerValue("DescribeEnsResourceUsageResponse.EnsResourceUsage["+ i +"].ExpiredCount"));
			ensResourceUsageItem.setExpiringCount(_ctx.integerValue("DescribeEnsResourceUsageResponse.EnsResourceUsage["+ i +"].ExpiringCount"));
			ensResourceUsageItem.setRunningCount(_ctx.integerValue("DescribeEnsResourceUsageResponse.EnsResourceUsage["+ i +"].RunningCount"));
			ensResourceUsageItem.setDiskCount(_ctx.integerValue("DescribeEnsResourceUsageResponse.EnsResourceUsage["+ i +"].DiskCount"));
			ensResourceUsageItem.setStorageSum(_ctx.longValue("DescribeEnsResourceUsageResponse.EnsResourceUsage["+ i +"].StorageSum"));
			ensResourceUsageItem.setComputeResourceCount(_ctx.integerValue("DescribeEnsResourceUsageResponse.EnsResourceUsage["+ i +"].ComputeResourceCount"));

			ensResourceUsage.add(ensResourceUsageItem);
		}
		describeEnsResourceUsageResponse.setEnsResourceUsage(ensResourceUsage);
	 
	 	return describeEnsResourceUsageResponse;
	}
}