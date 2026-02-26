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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceIpAddressResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceIpAddressResponse.RCInstanceListItem;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstanceIpAddressResponse.RCInstanceListItem.IpAddressConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCInstanceIpAddressResponseUnmarshaller {

	public static DescribeRCInstanceIpAddressResponse unmarshall(DescribeRCInstanceIpAddressResponse describeRCInstanceIpAddressResponse, UnmarshallerContext _ctx) {
		
		describeRCInstanceIpAddressResponse.setRequestId(_ctx.stringValue("DescribeRCInstanceIpAddressResponse.RequestId"));
		describeRCInstanceIpAddressResponse.setTotal(_ctx.stringValue("DescribeRCInstanceIpAddressResponse.Total"));

		List<RCInstanceListItem> rCInstanceList = new ArrayList<RCInstanceListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCInstanceIpAddressResponse.RCInstanceList.Length"); i++) {
			RCInstanceListItem rCInstanceListItem = new RCInstanceListItem();
			rCInstanceListItem.setInstanceId(_ctx.stringValue("DescribeRCInstanceIpAddressResponse.RCInstanceList["+ i +"].InstanceId"));
			rCInstanceListItem.setInstanceType(_ctx.stringValue("DescribeRCInstanceIpAddressResponse.RCInstanceList["+ i +"].InstanceType"));
			rCInstanceListItem.setInstanceName(_ctx.stringValue("DescribeRCInstanceIpAddressResponse.RCInstanceList["+ i +"].InstanceName"));
			rCInstanceListItem.setInstanceStatus(_ctx.stringValue("DescribeRCInstanceIpAddressResponse.RCInstanceList["+ i +"].InstanceStatus"));

			List<IpAddressConfigItem> ipAddressConfig = new ArrayList<IpAddressConfigItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRCInstanceIpAddressResponse.RCInstanceList["+ i +"].IpAddressConfig.Length"); j++) {
				IpAddressConfigItem ipAddressConfigItem = new IpAddressConfigItem();
				ipAddressConfigItem.setInstanceIp(_ctx.stringValue("DescribeRCInstanceIpAddressResponse.RCInstanceList["+ i +"].IpAddressConfig["+ j +"].InstanceIp"));
				ipAddressConfigItem.setIsBgppack(_ctx.booleanValue("DescribeRCInstanceIpAddressResponse.RCInstanceList["+ i +"].IpAddressConfig["+ j +"].IsBgppack"));
				ipAddressConfigItem.setIpVersion(_ctx.stringValue("DescribeRCInstanceIpAddressResponse.RCInstanceList["+ i +"].IpAddressConfig["+ j +"].IpVersion"));
				ipAddressConfigItem.setIpStatus(_ctx.stringValue("DescribeRCInstanceIpAddressResponse.RCInstanceList["+ i +"].IpAddressConfig["+ j +"].IpStatus"));
				ipAddressConfigItem.setRegionId(_ctx.stringValue("DescribeRCInstanceIpAddressResponse.RCInstanceList["+ i +"].IpAddressConfig["+ j +"].RegionId"));
				ipAddressConfigItem.setElasticThreshold(_ctx.integerValue("DescribeRCInstanceIpAddressResponse.RCInstanceList["+ i +"].IpAddressConfig["+ j +"].ElasticThreshold"));
				ipAddressConfigItem.setBlackholeThreshold(_ctx.integerValue("DescribeRCInstanceIpAddressResponse.RCInstanceList["+ i +"].IpAddressConfig["+ j +"].BlackholeThreshold"));
				ipAddressConfigItem.setDefenseBpsThreshold(_ctx.integerValue("DescribeRCInstanceIpAddressResponse.RCInstanceList["+ i +"].IpAddressConfig["+ j +"].DefenseBpsThreshold"));
				ipAddressConfigItem.setDefensePpsThreshold(_ctx.integerValue("DescribeRCInstanceIpAddressResponse.RCInstanceList["+ i +"].IpAddressConfig["+ j +"].DefensePpsThreshold"));
				ipAddressConfigItem.setIsFullProtection(_ctx.integerValue("DescribeRCInstanceIpAddressResponse.RCInstanceList["+ i +"].IpAddressConfig["+ j +"].IsFullProtection"));

				ipAddressConfig.add(ipAddressConfigItem);
			}
			rCInstanceListItem.setIpAddressConfig(ipAddressConfig);

			rCInstanceList.add(rCInstanceListItem);
		}
		describeRCInstanceIpAddressResponse.setRCInstanceList(rCInstanceList);
	 
	 	return describeRCInstanceIpAddressResponse;
	}
}