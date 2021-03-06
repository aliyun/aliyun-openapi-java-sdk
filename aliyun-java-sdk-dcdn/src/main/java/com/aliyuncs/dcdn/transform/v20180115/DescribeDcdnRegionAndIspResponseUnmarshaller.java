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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnRegionAndIspResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnRegionAndIspResponse.Isp;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnRegionAndIspResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnRegionAndIspResponseUnmarshaller {

	public static DescribeDcdnRegionAndIspResponse unmarshall(DescribeDcdnRegionAndIspResponse describeDcdnRegionAndIspResponse, UnmarshallerContext _ctx) {
		
		describeDcdnRegionAndIspResponse.setRequestId(_ctx.stringValue("DescribeDcdnRegionAndIspResponse.RequestId"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnRegionAndIspResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setNameZh(_ctx.stringValue("DescribeDcdnRegionAndIspResponse.Regions["+ i +"].NameZh"));
			region.setNameEn(_ctx.stringValue("DescribeDcdnRegionAndIspResponse.Regions["+ i +"].NameEn"));

			regions.add(region);
		}
		describeDcdnRegionAndIspResponse.setRegions(regions);

		List<Isp> isps = new ArrayList<Isp>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnRegionAndIspResponse.Isps.Length"); i++) {
			Isp isp = new Isp();
			isp.setNameZh(_ctx.stringValue("DescribeDcdnRegionAndIspResponse.Isps["+ i +"].NameZh"));
			isp.setNameEn(_ctx.stringValue("DescribeDcdnRegionAndIspResponse.Isps["+ i +"].NameEn"));

			isps.add(isp);
		}
		describeDcdnRegionAndIspResponse.setIsps(isps);
	 
	 	return describeDcdnRegionAndIspResponse;
	}
}