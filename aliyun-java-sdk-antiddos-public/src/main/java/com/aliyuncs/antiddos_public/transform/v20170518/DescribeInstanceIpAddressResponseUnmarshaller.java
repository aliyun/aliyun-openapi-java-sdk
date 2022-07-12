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

package com.aliyuncs.antiddos_public.transform.v20170518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.antiddos_public.model.v20170518.DescribeInstanceIpAddressResponse;
import com.aliyuncs.antiddos_public.model.v20170518.DescribeInstanceIpAddressResponse.Instance;
import com.aliyuncs.antiddos_public.model.v20170518.DescribeInstanceIpAddressResponse.Instance.IpAddressConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceIpAddressResponseUnmarshaller {

	public static DescribeInstanceIpAddressResponse unmarshall(DescribeInstanceIpAddressResponse describeInstanceIpAddressResponse, UnmarshallerContext _ctx) {
		
		describeInstanceIpAddressResponse.setRequestId(_ctx.stringValue("DescribeInstanceIpAddressResponse.RequestId"));
		describeInstanceIpAddressResponse.setTotal(_ctx.integerValue("DescribeInstanceIpAddressResponse.Total"));

		List<Instance> instanceList = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceIpAddressResponse.InstanceList.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("DescribeInstanceIpAddressResponse.InstanceList["+ i +"].InstanceId"));
			instance.setInstanceType(_ctx.stringValue("DescribeInstanceIpAddressResponse.InstanceList["+ i +"].InstanceType"));
			instance.setInstanceName(_ctx.stringValue("DescribeInstanceIpAddressResponse.InstanceList["+ i +"].InstanceName"));
			instance.setInstanceStatus(_ctx.stringValue("DescribeInstanceIpAddressResponse.InstanceList["+ i +"].InstanceStatus"));

			List<IpAddressConfigItem> ipAddressConfig = new ArrayList<IpAddressConfigItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceIpAddressResponse.InstanceList["+ i +"].IpAddressConfig.Length"); j++) {
				IpAddressConfigItem ipAddressConfigItem = new IpAddressConfigItem();
				ipAddressConfigItem.setInstanceIp(_ctx.stringValue("DescribeInstanceIpAddressResponse.InstanceList["+ i +"].IpAddressConfig["+ j +"].InstanceIp"));
				ipAddressConfigItem.setIsBgppack(_ctx.booleanValue("DescribeInstanceIpAddressResponse.InstanceList["+ i +"].IpAddressConfig["+ j +"].IsBgppack"));
				ipAddressConfigItem.setIpVersion(_ctx.stringValue("DescribeInstanceIpAddressResponse.InstanceList["+ i +"].IpAddressConfig["+ j +"].IpVersion"));
				ipAddressConfigItem.setIpStatus(_ctx.stringValue("DescribeInstanceIpAddressResponse.InstanceList["+ i +"].IpAddressConfig["+ j +"].IpStatus"));
				ipAddressConfigItem.setRegionId(_ctx.stringValue("DescribeInstanceIpAddressResponse.InstanceList["+ i +"].IpAddressConfig["+ j +"].RegionId"));
				ipAddressConfigItem.setElasticThreshold(_ctx.integerValue("DescribeInstanceIpAddressResponse.InstanceList["+ i +"].IpAddressConfig["+ j +"].ElasticThreshold"));
				ipAddressConfigItem.setBlackholeThreshold(_ctx.integerValue("DescribeInstanceIpAddressResponse.InstanceList["+ i +"].IpAddressConfig["+ j +"].BlackholeThreshold"));
				ipAddressConfigItem.setDefenseBpsThreshold(_ctx.integerValue("DescribeInstanceIpAddressResponse.InstanceList["+ i +"].IpAddressConfig["+ j +"].DefenseBpsThreshold"));
				ipAddressConfigItem.setDefensePpsThreshold(_ctx.integerValue("DescribeInstanceIpAddressResponse.InstanceList["+ i +"].IpAddressConfig["+ j +"].DefensePpsThreshold"));

				ipAddressConfig.add(ipAddressConfigItem);
			}
			instance.setIpAddressConfig(ipAddressConfig);

			instanceList.add(instance);
		}
		describeInstanceIpAddressResponse.setInstanceList(instanceList);
	 
	 	return describeInstanceIpAddressResponse;
	}
}