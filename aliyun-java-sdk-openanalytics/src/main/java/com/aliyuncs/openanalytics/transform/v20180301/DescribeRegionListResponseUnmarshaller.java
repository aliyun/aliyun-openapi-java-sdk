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

package com.aliyuncs.openanalytics.transform.v20180301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openanalytics.model.v20180301.DescribeRegionListResponse;
import com.aliyuncs.openanalytics.model.v20180301.DescribeRegionListResponse.RegionListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionListResponseUnmarshaller {

	public static DescribeRegionListResponse unmarshall(DescribeRegionListResponse describeRegionListResponse, UnmarshallerContext context) {
		
		describeRegionListResponse.setRequestId(context.stringValue("DescribeRegionListResponse.RequestId"));
		describeRegionListResponse.setRegionId(context.stringValue("DescribeRegionListResponse.RegionId"));

		List<RegionListItem> regionList = new ArrayList<RegionListItem>();
		for (int i = 0; i < context.lengthValue("DescribeRegionListResponse.RegionList.Length"); i++) {
			RegionListItem regionListItem = new RegionListItem();
			regionListItem.setRegionID(context.stringValue("DescribeRegionListResponse.RegionList["+ i +"].regionID"));

			regionList.add(regionListItem);
		}
		describeRegionListResponse.setRegionList(regionList);
	 
	 	return describeRegionListResponse;
	}
}