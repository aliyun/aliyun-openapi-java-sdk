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

import com.aliyuncs.ga.model.v20191120.DescribeAcceleratorResponse;
import com.aliyuncs.ga.model.v20191120.DescribeAcceleratorResponse.BasicBandwidthPackage;
import com.aliyuncs.ga.model.v20191120.DescribeAcceleratorResponse.CrossDomainBandwidthPackage;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAcceleratorResponseUnmarshaller {

	public static DescribeAcceleratorResponse unmarshall(DescribeAcceleratorResponse describeAcceleratorResponse, UnmarshallerContext _ctx) {
		
		describeAcceleratorResponse.setRequestId(_ctx.stringValue("DescribeAcceleratorResponse.RequestId"));
		describeAcceleratorResponse.setAcceleratorId(_ctx.stringValue("DescribeAcceleratorResponse.AcceleratorId"));
		describeAcceleratorResponse.setName(_ctx.stringValue("DescribeAcceleratorResponse.Name"));
		describeAcceleratorResponse.setDescription(_ctx.stringValue("DescribeAcceleratorResponse.Description"));
		describeAcceleratorResponse.setInstanceChargeType(_ctx.stringValue("DescribeAcceleratorResponse.InstanceChargeType"));
		describeAcceleratorResponse.setExpiredTime(_ctx.longValue("DescribeAcceleratorResponse.ExpiredTime"));
		describeAcceleratorResponse.setCenId(_ctx.stringValue("DescribeAcceleratorResponse.CenId"));
		describeAcceleratorResponse.setState(_ctx.stringValue("DescribeAcceleratorResponse.State"));
		describeAcceleratorResponse.setDnsName(_ctx.stringValue("DescribeAcceleratorResponse.DnsName"));
		describeAcceleratorResponse.setCreateTime(_ctx.longValue("DescribeAcceleratorResponse.CreateTime"));
		describeAcceleratorResponse.setSpec(_ctx.stringValue("DescribeAcceleratorResponse.Spec"));
		describeAcceleratorResponse.setRegionId(_ctx.stringValue("DescribeAcceleratorResponse.RegionId"));

		BasicBandwidthPackage basicBandwidthPackage = new BasicBandwidthPackage();
		basicBandwidthPackage.setInstanceId(_ctx.stringValue("DescribeAcceleratorResponse.BasicBandwidthPackage.InstanceId"));
		basicBandwidthPackage.setBandwidth(_ctx.integerValue("DescribeAcceleratorResponse.BasicBandwidthPackage.Bandwidth"));
		basicBandwidthPackage.setBandwidthType(_ctx.stringValue("DescribeAcceleratorResponse.BasicBandwidthPackage.BandwidthType"));
		describeAcceleratorResponse.setBasicBandwidthPackage(basicBandwidthPackage);

		CrossDomainBandwidthPackage crossDomainBandwidthPackage = new CrossDomainBandwidthPackage();
		crossDomainBandwidthPackage.setInstanceId(_ctx.stringValue("DescribeAcceleratorResponse.CrossDomainBandwidthPackage.InstanceId"));
		crossDomainBandwidthPackage.setBandwidth(_ctx.integerValue("DescribeAcceleratorResponse.CrossDomainBandwidthPackage.Bandwidth"));
		describeAcceleratorResponse.setCrossDomainBandwidthPackage(crossDomainBandwidthPackage);
	 
	 	return describeAcceleratorResponse;
	}
}