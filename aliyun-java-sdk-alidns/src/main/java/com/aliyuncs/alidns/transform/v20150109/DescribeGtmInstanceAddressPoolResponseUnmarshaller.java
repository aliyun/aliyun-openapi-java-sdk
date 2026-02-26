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

import com.aliyuncs.alidns.model.v20150109.DescribeGtmInstanceAddressPoolResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmInstanceAddressPoolResponse.Addr;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGtmInstanceAddressPoolResponseUnmarshaller {

	public static DescribeGtmInstanceAddressPoolResponse unmarshall(DescribeGtmInstanceAddressPoolResponse describeGtmInstanceAddressPoolResponse, UnmarshallerContext _ctx) {
		
		describeGtmInstanceAddressPoolResponse.setRequestId(_ctx.stringValue("DescribeGtmInstanceAddressPoolResponse.RequestId"));
		describeGtmInstanceAddressPoolResponse.setStatus(_ctx.stringValue("DescribeGtmInstanceAddressPoolResponse.Status"));
		describeGtmInstanceAddressPoolResponse.setCreateTime(_ctx.stringValue("DescribeGtmInstanceAddressPoolResponse.CreateTime"));
		describeGtmInstanceAddressPoolResponse.setAddrCount(_ctx.integerValue("DescribeGtmInstanceAddressPoolResponse.AddrCount"));
		describeGtmInstanceAddressPoolResponse.setName(_ctx.stringValue("DescribeGtmInstanceAddressPoolResponse.Name"));
		describeGtmInstanceAddressPoolResponse.setType(_ctx.stringValue("DescribeGtmInstanceAddressPoolResponse.Type"));
		describeGtmInstanceAddressPoolResponse.setUpdateTime(_ctx.stringValue("DescribeGtmInstanceAddressPoolResponse.UpdateTime"));
		describeGtmInstanceAddressPoolResponse.setAddrPoolId(_ctx.stringValue("DescribeGtmInstanceAddressPoolResponse.AddrPoolId"));
		describeGtmInstanceAddressPoolResponse.setUpdateTimestamp(_ctx.longValue("DescribeGtmInstanceAddressPoolResponse.UpdateTimestamp"));
		describeGtmInstanceAddressPoolResponse.setMonitorConfigId(_ctx.stringValue("DescribeGtmInstanceAddressPoolResponse.MonitorConfigId"));
		describeGtmInstanceAddressPoolResponse.setMinAvailableAddrNum(_ctx.integerValue("DescribeGtmInstanceAddressPoolResponse.MinAvailableAddrNum"));
		describeGtmInstanceAddressPoolResponse.setMonitorStatus(_ctx.stringValue("DescribeGtmInstanceAddressPoolResponse.MonitorStatus"));
		describeGtmInstanceAddressPoolResponse.setCreateTimestamp(_ctx.longValue("DescribeGtmInstanceAddressPoolResponse.CreateTimestamp"));

		List<Addr> addrs = new ArrayList<Addr>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGtmInstanceAddressPoolResponse.Addrs.Length"); i++) {
			Addr addr = new Addr();
			addr.setValue(_ctx.stringValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].Value"));
			addr.setUpdateTimestamp(_ctx.longValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].UpdateTimestamp"));
			addr.setUpdateTime(_ctx.stringValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].UpdateTime"));
			addr.setAlertStatus(_ctx.stringValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].AlertStatus"));
			addr.setLbaWeight(_ctx.integerValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].LbaWeight"));
			addr.setCreateTime(_ctx.stringValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].CreateTime"));
			addr.setAddrId(_ctx.longValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].AddrId"));
			addr.setMode(_ctx.stringValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].Mode"));
			addr.setCreateTimestamp(_ctx.longValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].CreateTimestamp"));

			addrs.add(addr);
		}
		describeGtmInstanceAddressPoolResponse.setAddrs(addrs);
	 
	 	return describeGtmInstanceAddressPoolResponse;
	}
}