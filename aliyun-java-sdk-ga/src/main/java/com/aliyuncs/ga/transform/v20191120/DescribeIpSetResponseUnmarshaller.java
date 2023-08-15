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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.DescribeIpSetResponse;
import com.aliyuncs.ga.model.v20191120.DescribeIpSetResponse.ServiceManagedInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpSetResponseUnmarshaller {

	public static DescribeIpSetResponse unmarshall(DescribeIpSetResponse describeIpSetResponse, UnmarshallerContext _ctx) {
		
		describeIpSetResponse.setRequestId(_ctx.stringValue("DescribeIpSetResponse.RequestId"));
		describeIpSetResponse.setIpSetId(_ctx.stringValue("DescribeIpSetResponse.IpSetId"));
		describeIpSetResponse.setIpVersion(_ctx.stringValue("DescribeIpSetResponse.IpVersion"));
		describeIpSetResponse.setState(_ctx.stringValue("DescribeIpSetResponse.State"));
		describeIpSetResponse.setBandwidth(_ctx.integerValue("DescribeIpSetResponse.Bandwidth"));
		describeIpSetResponse.setIspType(_ctx.stringValue("DescribeIpSetResponse.IspType"));
		describeIpSetResponse.setAccelerateRegionId(_ctx.stringValue("DescribeIpSetResponse.AccelerateRegionId"));
		describeIpSetResponse.setAcceleratorId(_ctx.stringValue("DescribeIpSetResponse.AcceleratorId"));
		describeIpSetResponse.setServiceId(_ctx.stringValue("DescribeIpSetResponse.ServiceId"));
		describeIpSetResponse.setServiceManaged(_ctx.booleanValue("DescribeIpSetResponse.ServiceManaged"));

		List<String> ipAddressList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIpSetResponse.IpAddressList.Length"); i++) {
			ipAddressList.add(_ctx.stringValue("DescribeIpSetResponse.IpAddressList["+ i +"]"));
		}
		describeIpSetResponse.setIpAddressList(ipAddressList);

		List<ServiceManagedInfosItem> serviceManagedInfos = new ArrayList<ServiceManagedInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIpSetResponse.ServiceManagedInfos.Length"); i++) {
			ServiceManagedInfosItem serviceManagedInfosItem = new ServiceManagedInfosItem();
			serviceManagedInfosItem.setAction(_ctx.stringValue("DescribeIpSetResponse.ServiceManagedInfos["+ i +"].Action"));
			serviceManagedInfosItem.setChildType(_ctx.stringValue("DescribeIpSetResponse.ServiceManagedInfos["+ i +"].ChildType"));
			serviceManagedInfosItem.setIsManaged(_ctx.booleanValue("DescribeIpSetResponse.ServiceManagedInfos["+ i +"].IsManaged"));

			serviceManagedInfos.add(serviceManagedInfosItem);
		}
		describeIpSetResponse.setServiceManagedInfos(serviceManagedInfos);
	 
	 	return describeIpSetResponse;
	}
}