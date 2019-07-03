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

import com.aliyuncs.alidns.model.v20150109.DescribeGtmInstanceAddressPoolsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmInstanceAddressPoolsResponse.AddrPool;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGtmInstanceAddressPoolsResponseUnmarshaller {

	public static DescribeGtmInstanceAddressPoolsResponse unmarshall(DescribeGtmInstanceAddressPoolsResponse describeGtmInstanceAddressPoolsResponse, UnmarshallerContext _ctx) {
		
		describeGtmInstanceAddressPoolsResponse.setRequestId(_ctx.stringValue("DescribeGtmInstanceAddressPoolsResponse.RequestId"));
		describeGtmInstanceAddressPoolsResponse.setTotalItems(_ctx.integerValue("DescribeGtmInstanceAddressPoolsResponse.TotalItems"));
		describeGtmInstanceAddressPoolsResponse.setTotalPages(_ctx.integerValue("DescribeGtmInstanceAddressPoolsResponse.TotalPages"));
		describeGtmInstanceAddressPoolsResponse.setPageNumber(_ctx.integerValue("DescribeGtmInstanceAddressPoolsResponse.PageNumber"));
		describeGtmInstanceAddressPoolsResponse.setPageSize(_ctx.integerValue("DescribeGtmInstanceAddressPoolsResponse.PageSize"));

		List<AddrPool> addrPools = new ArrayList<AddrPool>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGtmInstanceAddressPoolsResponse.AddrPools.Length"); i++) {
			AddrPool addrPool = new AddrPool();
			addrPool.setAddrPoolId(_ctx.stringValue("DescribeGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].AddrPoolId"));
			addrPool.setCreateTime(_ctx.stringValue("DescribeGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].CreateTime"));
			addrPool.setCreateTimestamp(_ctx.longValue("DescribeGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].CreateTimestamp"));
			addrPool.setUpdateTime(_ctx.stringValue("DescribeGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].UpdateTime"));
			addrPool.setUpdateTimestamp(_ctx.longValue("DescribeGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].UpdateTimestamp"));
			addrPool.setAddrCount(_ctx.integerValue("DescribeGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].AddrCount"));
			addrPool.setMinAvailableAddrNum(_ctx.integerValue("DescribeGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].MinAvailableAddrNum"));
			addrPool.setMonitorConfigId(_ctx.stringValue("DescribeGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].MonitorConfigId"));
			addrPool.setMonitorStatus(_ctx.stringValue("DescribeGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].MonitorStatus"));
			addrPool.setName(_ctx.stringValue("DescribeGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].Name"));
			addrPool.setStatus(_ctx.stringValue("DescribeGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].Status"));
			addrPool.setType(_ctx.stringValue("DescribeGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].Type"));

			addrPools.add(addrPool);
		}
		describeGtmInstanceAddressPoolsResponse.setAddrPools(addrPools);
	 
	 	return describeGtmInstanceAddressPoolsResponse;
	}
}