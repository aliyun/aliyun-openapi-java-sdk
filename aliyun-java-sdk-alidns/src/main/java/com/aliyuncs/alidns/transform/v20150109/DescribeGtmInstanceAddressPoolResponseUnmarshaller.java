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

	public static DescribeGtmInstanceAddressPoolResponse unmarshall(DescribeGtmInstanceAddressPoolResponse describeGtmInstanceAddressPoolResponse, UnmarshallerContext context) {
		
		describeGtmInstanceAddressPoolResponse.setRequestId(context.stringValue("DescribeGtmInstanceAddressPoolResponse.RequestId"));
		describeGtmInstanceAddressPoolResponse.setAddrPoolId(context.stringValue("DescribeGtmInstanceAddressPoolResponse.AddrPoolId"));
		describeGtmInstanceAddressPoolResponse.setCreateTime(context.stringValue("DescribeGtmInstanceAddressPoolResponse.CreateTime"));
		describeGtmInstanceAddressPoolResponse.setCreateTimestamp(context.longValue("DescribeGtmInstanceAddressPoolResponse.CreateTimestamp"));
		describeGtmInstanceAddressPoolResponse.setUpdateTime(context.stringValue("DescribeGtmInstanceAddressPoolResponse.UpdateTime"));
		describeGtmInstanceAddressPoolResponse.setUpdateTimestamp(context.longValue("DescribeGtmInstanceAddressPoolResponse.UpdateTimestamp"));
		describeGtmInstanceAddressPoolResponse.setAddrCount(context.integerValue("DescribeGtmInstanceAddressPoolResponse.AddrCount"));
		describeGtmInstanceAddressPoolResponse.setMinAvailableAddrNum(context.integerValue("DescribeGtmInstanceAddressPoolResponse.MinAvailableAddrNum"));
		describeGtmInstanceAddressPoolResponse.setMonitorConfigId(context.stringValue("DescribeGtmInstanceAddressPoolResponse.MonitorConfigId"));
		describeGtmInstanceAddressPoolResponse.setMonitorStatus(context.stringValue("DescribeGtmInstanceAddressPoolResponse.MonitorStatus"));
		describeGtmInstanceAddressPoolResponse.setName(context.stringValue("DescribeGtmInstanceAddressPoolResponse.Name"));
		describeGtmInstanceAddressPoolResponse.setStatus(context.stringValue("DescribeGtmInstanceAddressPoolResponse.Status"));
		describeGtmInstanceAddressPoolResponse.setType(context.stringValue("DescribeGtmInstanceAddressPoolResponse.Type"));

		List<Addr> addrs = new ArrayList<Addr>();
		for (int i = 0; i < context.lengthValue("DescribeGtmInstanceAddressPoolResponse.Addrs.Length"); i++) {
			Addr addr = new Addr();
			addr.setAddrId(context.longValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].AddrId"));
			addr.setCreateTime(context.stringValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].CreateTime"));
			addr.setCreateTimestamp(context.longValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].CreateTimestamp"));
			addr.setUpdateTime(context.stringValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].UpdateTime"));
			addr.setUpdateTimestamp(context.longValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].UpdateTimestamp"));
			addr.setValue(context.stringValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].Value"));
			addr.setLbaWeight(context.integerValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].LbaWeight"));
			addr.setMode(context.stringValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].Mode"));
			addr.setAlertStatus(context.stringValue("DescribeGtmInstanceAddressPoolResponse.Addrs["+ i +"].AlertStatus"));

			addrs.add(addr);
		}
		describeGtmInstanceAddressPoolResponse.setAddrs(addrs);
	 
	 	return describeGtmInstanceAddressPoolResponse;
	}
}