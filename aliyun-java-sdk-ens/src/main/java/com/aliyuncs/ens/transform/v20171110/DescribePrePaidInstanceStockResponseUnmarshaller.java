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

import com.aliyuncs.ens.model.v20171110.DescribePrePaidInstanceStockResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePrePaidInstanceStockResponseUnmarshaller {

	public static DescribePrePaidInstanceStockResponse unmarshall(DescribePrePaidInstanceStockResponse describePrePaidInstanceStockResponse, UnmarshallerContext _ctx) {
		
		describePrePaidInstanceStockResponse.setRequestId(_ctx.stringValue("DescribePrePaidInstanceStockResponse.RequestId"));
		describePrePaidInstanceStockResponse.setDataDiskSize(_ctx.integerValue("DescribePrePaidInstanceStockResponse.DataDiskSize"));
		describePrePaidInstanceStockResponse.setEnsRegionId(_ctx.stringValue("DescribePrePaidInstanceStockResponse.EnsRegionId"));
		describePrePaidInstanceStockResponse.setCores(_ctx.integerValue("DescribePrePaidInstanceStockResponse.Cores"));
		describePrePaidInstanceStockResponse.setMemory(_ctx.integerValue("DescribePrePaidInstanceStockResponse.Memory"));
		describePrePaidInstanceStockResponse.setAvaliableCount(_ctx.integerValue("DescribePrePaidInstanceStockResponse.AvaliableCount"));
		describePrePaidInstanceStockResponse.setInstanceSpec(_ctx.stringValue("DescribePrePaidInstanceStockResponse.InstanceSpec"));
		describePrePaidInstanceStockResponse.setSystemDiskSize(_ctx.integerValue("DescribePrePaidInstanceStockResponse.SystemDiskSize"));
	 
	 	return describePrePaidInstanceStockResponse;
	}
}