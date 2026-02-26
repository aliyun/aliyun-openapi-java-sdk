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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeCrossCloudRegionMappingToAliyunResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeCrossCloudRegionMappingToAliyunResponse.CrossCloudRegionMappingListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCrossCloudRegionMappingToAliyunResponseUnmarshaller {

	public static DescribeCrossCloudRegionMappingToAliyunResponse unmarshall(DescribeCrossCloudRegionMappingToAliyunResponse describeCrossCloudRegionMappingToAliyunResponse, UnmarshallerContext _ctx) {
		
		describeCrossCloudRegionMappingToAliyunResponse.setRequestId(_ctx.stringValue("DescribeCrossCloudRegionMappingToAliyunResponse.RequestId"));

		List<CrossCloudRegionMappingListItem> crossCloudRegionMappingList = new ArrayList<CrossCloudRegionMappingListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCrossCloudRegionMappingToAliyunResponse.CrossCloudRegionMappingList.Length"); i++) {
			CrossCloudRegionMappingListItem crossCloudRegionMappingListItem = new CrossCloudRegionMappingListItem();
			crossCloudRegionMappingListItem.setCloudProvider(_ctx.stringValue("DescribeCrossCloudRegionMappingToAliyunResponse.CrossCloudRegionMappingList["+ i +"].CloudProvider"));
			crossCloudRegionMappingListItem.setAliyunRegionId(_ctx.stringValue("DescribeCrossCloudRegionMappingToAliyunResponse.CrossCloudRegionMappingList["+ i +"].AliyunRegionId"));
			crossCloudRegionMappingListItem.setCrossCloudRegionId(_ctx.stringValue("DescribeCrossCloudRegionMappingToAliyunResponse.CrossCloudRegionMappingList["+ i +"].CrossCloudRegionId"));

			crossCloudRegionMappingList.add(crossCloudRegionMappingListItem);
		}
		describeCrossCloudRegionMappingToAliyunResponse.setCrossCloudRegionMappingList(crossCloudRegionMappingList);
	 
	 	return describeCrossCloudRegionMappingToAliyunResponse;
	}
}