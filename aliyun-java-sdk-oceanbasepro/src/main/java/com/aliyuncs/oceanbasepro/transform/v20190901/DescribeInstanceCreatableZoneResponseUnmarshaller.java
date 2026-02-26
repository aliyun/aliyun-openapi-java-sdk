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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceCreatableZoneResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceCreatableZoneResponse.ZoneListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceCreatableZoneResponseUnmarshaller {

	public static DescribeInstanceCreatableZoneResponse unmarshall(DescribeInstanceCreatableZoneResponse describeInstanceCreatableZoneResponse, UnmarshallerContext _ctx) {
		
		describeInstanceCreatableZoneResponse.setRequestId(_ctx.stringValue("DescribeInstanceCreatableZoneResponse.RequestId"));

		List<ZoneListItem> zoneList = new ArrayList<ZoneListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceCreatableZoneResponse.ZoneList.Length"); i++) {
			ZoneListItem zoneListItem = new ZoneListItem();
			zoneListItem.setIsInCluster(_ctx.booleanValue("DescribeInstanceCreatableZoneResponse.ZoneList["+ i +"].IsInCluster"));
			zoneListItem.setZone(_ctx.stringValue("DescribeInstanceCreatableZoneResponse.ZoneList["+ i +"].Zone"));
			zoneListItem.setFullCopyId(_ctx.stringValue("DescribeInstanceCreatableZoneResponse.ZoneList["+ i +"].FullCopyId"));
			zoneListItem.setLogicalZoneName(_ctx.stringValue("DescribeInstanceCreatableZoneResponse.ZoneList["+ i +"].LogicalZoneName"));
			zoneListItem.setReplicateZoneIndex(_ctx.longValue("DescribeInstanceCreatableZoneResponse.ZoneList["+ i +"].ReplicateZoneIndex"));

			zoneList.add(zoneListItem);
		}
		describeInstanceCreatableZoneResponse.setZoneList(zoneList);
	 
	 	return describeInstanceCreatableZoneResponse;
	}
}