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

import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmInstanceAddressPoolsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmInstanceAddressPoolsResponse.AddrPool;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsGtmInstanceAddressPoolsResponseUnmarshaller {

	public static DescribeDnsGtmInstanceAddressPoolsResponse unmarshall(DescribeDnsGtmInstanceAddressPoolsResponse describeDnsGtmInstanceAddressPoolsResponse, UnmarshallerContext _ctx) {
		
		describeDnsGtmInstanceAddressPoolsResponse.setRequestId(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolsResponse.RequestId"));
		describeDnsGtmInstanceAddressPoolsResponse.setPageSize(_ctx.integerValue("DescribeDnsGtmInstanceAddressPoolsResponse.PageSize"));
		describeDnsGtmInstanceAddressPoolsResponse.setPageNumber(_ctx.integerValue("DescribeDnsGtmInstanceAddressPoolsResponse.PageNumber"));
		describeDnsGtmInstanceAddressPoolsResponse.setTotalPages(_ctx.integerValue("DescribeDnsGtmInstanceAddressPoolsResponse.TotalPages"));
		describeDnsGtmInstanceAddressPoolsResponse.setTotalItems(_ctx.integerValue("DescribeDnsGtmInstanceAddressPoolsResponse.TotalItems"));

		List<AddrPool> addrPools = new ArrayList<AddrPool>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmInstanceAddressPoolsResponse.AddrPools.Length"); i++) {
			AddrPool addrPool = new AddrPool();
			addrPool.setType(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].Type"));
			addrPool.setUpdateTimestamp(_ctx.longValue("DescribeDnsGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].UpdateTimestamp"));
			addrPool.setMonitorStatus(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].MonitorStatus"));
			addrPool.setUpdateTime(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].UpdateTime"));
			addrPool.setCreateTime(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].CreateTime"));
			addrPool.setAddrPoolId(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].AddrPoolId"));
			addrPool.setLbaStrategy(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].LbaStrategy"));
			addrPool.setName(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].Name"));
			addrPool.setAddrCount(_ctx.integerValue("DescribeDnsGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].AddrCount"));
			addrPool.setMonitorConfigId(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].MonitorConfigId"));
			addrPool.setCreateTimestamp(_ctx.longValue("DescribeDnsGtmInstanceAddressPoolsResponse.AddrPools["+ i +"].CreateTimestamp"));

			addrPools.add(addrPool);
		}
		describeDnsGtmInstanceAddressPoolsResponse.setAddrPools(addrPools);
	 
	 	return describeDnsGtmInstanceAddressPoolsResponse;
	}
}