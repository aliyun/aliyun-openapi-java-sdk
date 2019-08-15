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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeCdnRegionAndIspResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnRegionAndIspResponse.Isp;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnRegionAndIspResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnRegionAndIspResponseUnmarshaller {

	public static DescribeCdnRegionAndIspResponse unmarshall(DescribeCdnRegionAndIspResponse describeCdnRegionAndIspResponse, UnmarshallerContext _ctx) {
		
		describeCdnRegionAndIspResponse.setRequestId(_ctx.stringValue("DescribeCdnRegionAndIspResponse.RequestId"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdnRegionAndIspResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setNameZh(_ctx.stringValue("DescribeCdnRegionAndIspResponse.Regions["+ i +"].NameZh"));
			region.setNameEn(_ctx.stringValue("DescribeCdnRegionAndIspResponse.Regions["+ i +"].NameEn"));

			regions.add(region);
		}
		describeCdnRegionAndIspResponse.setRegions(regions);

		List<Isp> isps = new ArrayList<Isp>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdnRegionAndIspResponse.Isps.Length"); i++) {
			Isp isp = new Isp();
			isp.setNameZh(_ctx.stringValue("DescribeCdnRegionAndIspResponse.Isps["+ i +"].NameZh"));
			isp.setNameEn(_ctx.stringValue("DescribeCdnRegionAndIspResponse.Isps["+ i +"].NameEn"));

			isps.add(isp);
		}
		describeCdnRegionAndIspResponse.setIsps(isps);
	 
	 	return describeCdnRegionAndIspResponse;
	}
}