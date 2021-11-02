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

import com.aliyuncs.cdn.model.v20180510.DescribeBlockedRegionsResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeBlockedRegionsResponse.InfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBlockedRegionsResponseUnmarshaller {

	public static DescribeBlockedRegionsResponse unmarshall(DescribeBlockedRegionsResponse describeBlockedRegionsResponse, UnmarshallerContext _ctx) {
		
		describeBlockedRegionsResponse.setRequestId(_ctx.stringValue("DescribeBlockedRegionsResponse.RequestId"));

		List<InfoItem> infoList = new ArrayList<InfoItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBlockedRegionsResponse.InfoList.Length"); i++) {
			InfoItem infoItem = new InfoItem();
			infoItem.setCountriesAndRegions(_ctx.stringValue("DescribeBlockedRegionsResponse.InfoList["+ i +"].CountriesAndRegions"));
			infoItem.setCountriesAndRegionsName(_ctx.stringValue("DescribeBlockedRegionsResponse.InfoList["+ i +"].CountriesAndRegionsName"));
			infoItem.setContinent(_ctx.stringValue("DescribeBlockedRegionsResponse.InfoList["+ i +"].Continent"));

			infoList.add(infoItem);
		}
		describeBlockedRegionsResponse.setInfoList(infoList);
	 
	 	return describeBlockedRegionsResponse;
	}
}