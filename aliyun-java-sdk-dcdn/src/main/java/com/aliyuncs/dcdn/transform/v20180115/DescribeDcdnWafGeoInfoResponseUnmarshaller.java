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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafGeoInfoResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafGeoInfoResponse.GeoInfo;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafGeoInfoResponse.GeoInfo.ContinentsItem;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafGeoInfoResponse.GeoInfo.ContinentsItem.RegionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnWafGeoInfoResponseUnmarshaller {

	public static DescribeDcdnWafGeoInfoResponse unmarshall(DescribeDcdnWafGeoInfoResponse describeDcdnWafGeoInfoResponse, UnmarshallerContext _ctx) {
		
		describeDcdnWafGeoInfoResponse.setRequestId(_ctx.stringValue("DescribeDcdnWafGeoInfoResponse.RequestId"));

		List<GeoInfo> content = new ArrayList<GeoInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnWafGeoInfoResponse.Content.Length"); i++) {
			GeoInfo geoInfo = new GeoInfo();
			geoInfo.setType(_ctx.stringValue("DescribeDcdnWafGeoInfoResponse.Content["+ i +"].Type"));

			List<ContinentsItem> continents = new ArrayList<ContinentsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnWafGeoInfoResponse.Content["+ i +"].Continents.Length"); j++) {
				ContinentsItem continentsItem = new ContinentsItem();
				continentsItem.setName(_ctx.stringValue("DescribeDcdnWafGeoInfoResponse.Content["+ i +"].Continents["+ j +"].Name"));

				List<RegionsItem> regions = new ArrayList<RegionsItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDcdnWafGeoInfoResponse.Content["+ i +"].Continents["+ j +"].Regions.Length"); k++) {
					RegionsItem regionsItem = new RegionsItem();
					regionsItem.setName(_ctx.stringValue("DescribeDcdnWafGeoInfoResponse.Content["+ i +"].Continents["+ j +"].Regions["+ k +"].Name"));
					regionsItem.setValue(_ctx.stringValue("DescribeDcdnWafGeoInfoResponse.Content["+ i +"].Continents["+ j +"].Regions["+ k +"].Value"));

					regions.add(regionsItem);
				}
				continentsItem.setRegions(regions);

				continents.add(continentsItem);
			}
			geoInfo.setContinents(continents);

			content.add(geoInfo);
		}
		describeDcdnWafGeoInfoResponse.setContent(content);
	 
	 	return describeDcdnWafGeoInfoResponse;
	}
}