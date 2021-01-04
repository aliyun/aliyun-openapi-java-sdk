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

import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmInstanceAddressPoolResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmInstanceAddressPoolResponse.Addr;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsGtmInstanceAddressPoolResponseUnmarshaller {

	public static DescribeDnsGtmInstanceAddressPoolResponse unmarshall(DescribeDnsGtmInstanceAddressPoolResponse describeDnsGtmInstanceAddressPoolResponse, UnmarshallerContext _ctx) {
		
		describeDnsGtmInstanceAddressPoolResponse.setRequestId(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolResponse.RequestId"));
		describeDnsGtmInstanceAddressPoolResponse.setAddrPoolId(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolResponse.AddrPoolId"));
		describeDnsGtmInstanceAddressPoolResponse.setCreateTime(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolResponse.CreateTime"));
		describeDnsGtmInstanceAddressPoolResponse.setCreateTimestamp(_ctx.longValue("DescribeDnsGtmInstanceAddressPoolResponse.CreateTimestamp"));
		describeDnsGtmInstanceAddressPoolResponse.setUpdateTime(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolResponse.UpdateTime"));
		describeDnsGtmInstanceAddressPoolResponse.setUpdateTimestamp(_ctx.longValue("DescribeDnsGtmInstanceAddressPoolResponse.UpdateTimestamp"));
		describeDnsGtmInstanceAddressPoolResponse.setAddrCount(_ctx.integerValue("DescribeDnsGtmInstanceAddressPoolResponse.AddrCount"));
		describeDnsGtmInstanceAddressPoolResponse.setMonitorConfigId(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolResponse.MonitorConfigId"));
		describeDnsGtmInstanceAddressPoolResponse.setMonitorStatus(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolResponse.MonitorStatus"));
		describeDnsGtmInstanceAddressPoolResponse.setName(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolResponse.Name"));
		describeDnsGtmInstanceAddressPoolResponse.setType(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolResponse.Type"));
		describeDnsGtmInstanceAddressPoolResponse.setLbaStrategy(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolResponse.LbaStrategy"));

		List<Addr> addrs = new ArrayList<Addr>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmInstanceAddressPoolResponse.Addrs.Length"); i++) {
			Addr addr = new Addr();
			addr.setCreateTime(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolResponse.Addrs["+ i +"].CreateTime"));
			addr.setCreateTimestamp(_ctx.longValue("DescribeDnsGtmInstanceAddressPoolResponse.Addrs["+ i +"].CreateTimestamp"));
			addr.setUpdateTime(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolResponse.Addrs["+ i +"].UpdateTime"));
			addr.setUpdateTimestamp(_ctx.longValue("DescribeDnsGtmInstanceAddressPoolResponse.Addrs["+ i +"].UpdateTimestamp"));
			addr.setAddr(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolResponse.Addrs["+ i +"].Addr"));
			addr.setLbaWeight(_ctx.integerValue("DescribeDnsGtmInstanceAddressPoolResponse.Addrs["+ i +"].LbaWeight"));
			addr.setMode(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolResponse.Addrs["+ i +"].Mode"));
			addr.setAlertStatus(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolResponse.Addrs["+ i +"].AlertStatus"));
			addr.setRemark(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolResponse.Addrs["+ i +"].Remark"));
			addr.setAttributeInfo(_ctx.stringValue("DescribeDnsGtmInstanceAddressPoolResponse.Addrs["+ i +"].AttributeInfo"));

			addrs.add(addr);
		}
		describeDnsGtmInstanceAddressPoolResponse.setAddrs(addrs);
	 
	 	return describeDnsGtmInstanceAddressPoolResponse;
	}
}