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

import com.aliyuncs.ga.model.v20191120.GetBasicAcceleratorResponse;
import com.aliyuncs.ga.model.v20191120.GetBasicAcceleratorResponse.BasicBandwidthPackage;
import com.aliyuncs.ga.model.v20191120.GetBasicAcceleratorResponse.CrossDomainBandwidthPackage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBasicAcceleratorResponseUnmarshaller {

	public static GetBasicAcceleratorResponse unmarshall(GetBasicAcceleratorResponse getBasicAcceleratorResponse, UnmarshallerContext _ctx) {
		
		getBasicAcceleratorResponse.setRequestId(_ctx.stringValue("GetBasicAcceleratorResponse.RequestId"));
		getBasicAcceleratorResponse.setDescription(_ctx.stringValue("GetBasicAcceleratorResponse.Description"));
		getBasicAcceleratorResponse.setInstanceChargeType(_ctx.stringValue("GetBasicAcceleratorResponse.InstanceChargeType"));
		getBasicAcceleratorResponse.setCreateTime(_ctx.longValue("GetBasicAcceleratorResponse.CreateTime"));
		getBasicAcceleratorResponse.setName(_ctx.stringValue("GetBasicAcceleratorResponse.Name"));
		getBasicAcceleratorResponse.setState(_ctx.stringValue("GetBasicAcceleratorResponse.State"));
		getBasicAcceleratorResponse.setExpiredTime(_ctx.longValue("GetBasicAcceleratorResponse.ExpiredTime"));
		getBasicAcceleratorResponse.setCenId(_ctx.stringValue("GetBasicAcceleratorResponse.CenId"));
		getBasicAcceleratorResponse.setRegionId(_ctx.stringValue("GetBasicAcceleratorResponse.RegionId"));
		getBasicAcceleratorResponse.setAcceleratorId(_ctx.stringValue("GetBasicAcceleratorResponse.AcceleratorId"));
		getBasicAcceleratorResponse.setBasicEndpointGroupId(_ctx.stringValue("GetBasicAcceleratorResponse.BasicEndpointGroupId"));
		getBasicAcceleratorResponse.setBasicIpSetId(_ctx.stringValue("GetBasicAcceleratorResponse.BasicIpSetId"));

		CrossDomainBandwidthPackage crossDomainBandwidthPackage = new CrossDomainBandwidthPackage();
		crossDomainBandwidthPackage.setBandwidth(_ctx.integerValue("GetBasicAcceleratorResponse.CrossDomainBandwidthPackage.Bandwidth"));
		crossDomainBandwidthPackage.setInstanceId(_ctx.stringValue("GetBasicAcceleratorResponse.CrossDomainBandwidthPackage.InstanceId"));
		getBasicAcceleratorResponse.setCrossDomainBandwidthPackage(crossDomainBandwidthPackage);

		BasicBandwidthPackage basicBandwidthPackage = new BasicBandwidthPackage();
		basicBandwidthPackage.setBandwidth(_ctx.integerValue("GetBasicAcceleratorResponse.BasicBandwidthPackage.Bandwidth"));
		basicBandwidthPackage.setBandwidthType(_ctx.stringValue("GetBasicAcceleratorResponse.BasicBandwidthPackage.BandwidthType"));
		basicBandwidthPackage.setInstanceId(_ctx.stringValue("GetBasicAcceleratorResponse.BasicBandwidthPackage.InstanceId"));
		getBasicAcceleratorResponse.setBasicBandwidthPackage(basicBandwidthPackage);
	 
	 	return getBasicAcceleratorResponse;
	}
}