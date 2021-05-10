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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnBlockedRegionsResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnBlockedRegionsResponse.InfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnBlockedRegionsResponseUnmarshaller {

	public static DescribeDcdnBlockedRegionsResponse unmarshall(DescribeDcdnBlockedRegionsResponse describeDcdnBlockedRegionsResponse, UnmarshallerContext _ctx) {
		
		describeDcdnBlockedRegionsResponse.setRequestId(_ctx.stringValue("DescribeDcdnBlockedRegionsResponse.RequestId"));

		List<InfoItem> infoList = new ArrayList<InfoItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnBlockedRegionsResponse.InfoList.Length"); i++) {
			InfoItem infoItem = new InfoItem();
			infoItem.setCountriesAndRegions(_ctx.stringValue("DescribeDcdnBlockedRegionsResponse.InfoList["+ i +"].CountriesAndRegions"));
			infoItem.setCountriesAndRegionsName(_ctx.stringValue("DescribeDcdnBlockedRegionsResponse.InfoList["+ i +"].CountriesAndRegionsName"));
			infoItem.setContinent(_ctx.stringValue("DescribeDcdnBlockedRegionsResponse.InfoList["+ i +"].Continent"));

			infoList.add(infoItem);
		}
		describeDcdnBlockedRegionsResponse.setInfoList(infoList);
	 
	 	return describeDcdnBlockedRegionsResponse;
	}
}