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

import com.aliyuncs.ga.model.v20191120.DescribeBandwidthPackageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBandwidthPackageResponseUnmarshaller {

	public static DescribeBandwidthPackageResponse unmarshall(DescribeBandwidthPackageResponse describeBandwidthPackageResponse, UnmarshallerContext _ctx) {
		
		describeBandwidthPackageResponse.setRequestId(_ctx.stringValue("DescribeBandwidthPackageResponse.RequestId"));
		describeBandwidthPackageResponse.setBandwidthPackageId(_ctx.stringValue("DescribeBandwidthPackageResponse.BandwidthPackageId"));
		describeBandwidthPackageResponse.setName(_ctx.stringValue("DescribeBandwidthPackageResponse.Name"));
		describeBandwidthPackageResponse.setDescription(_ctx.stringValue("DescribeBandwidthPackageResponse.Description"));
		describeBandwidthPackageResponse.setState(_ctx.stringValue("DescribeBandwidthPackageResponse.State"));
		describeBandwidthPackageResponse.setBandwidth(_ctx.integerValue("DescribeBandwidthPackageResponse.Bandwidth"));
		describeBandwidthPackageResponse.setChargeType(_ctx.stringValue("DescribeBandwidthPackageResponse.ChargeType"));
		describeBandwidthPackageResponse.setExpiredTime(_ctx.stringValue("DescribeBandwidthPackageResponse.ExpiredTime"));
		describeBandwidthPackageResponse.setCreateTime(_ctx.stringValue("DescribeBandwidthPackageResponse.CreateTime"));
		describeBandwidthPackageResponse.setRegionId(_ctx.stringValue("DescribeBandwidthPackageResponse.RegionId"));
		describeBandwidthPackageResponse.setType(_ctx.stringValue("DescribeBandwidthPackageResponse.Type"));
		describeBandwidthPackageResponse.setBandwidthType(_ctx.stringValue("DescribeBandwidthPackageResponse.BandwidthType"));
		describeBandwidthPackageResponse.setCbnGeographicRegionIdA(_ctx.stringValue("DescribeBandwidthPackageResponse.CbnGeographicRegionIdA"));
		describeBandwidthPackageResponse.setCbnGeographicRegionIdB(_ctx.stringValue("DescribeBandwidthPackageResponse.CbnGeographicRegionIdB"));

		List<String> accelerators = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBandwidthPackageResponse.Accelerators.Length"); i++) {
			accelerators.add(_ctx.stringValue("DescribeBandwidthPackageResponse.Accelerators["+ i +"]"));
		}
		describeBandwidthPackageResponse.setAccelerators(accelerators);
	 
	 	return describeBandwidthPackageResponse;
	}
}