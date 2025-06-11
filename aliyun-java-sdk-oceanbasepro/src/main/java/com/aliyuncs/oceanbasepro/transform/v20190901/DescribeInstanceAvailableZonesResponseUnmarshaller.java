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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceAvailableZonesResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceAvailableZonesResponse.ZoneListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceAvailableZonesResponseUnmarshaller {

	public static DescribeInstanceAvailableZonesResponse unmarshall(DescribeInstanceAvailableZonesResponse describeInstanceAvailableZonesResponse, UnmarshallerContext _ctx) {
		
		describeInstanceAvailableZonesResponse.setRequestId(_ctx.stringValue("DescribeInstanceAvailableZonesResponse.RequestId"));

		List<ZoneListItem> zoneList = new ArrayList<ZoneListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceAvailableZonesResponse.ZoneList.Length"); i++) {
			ZoneListItem zoneListItem = new ZoneListItem();
			zoneListItem.setZone(_ctx.stringValue("DescribeInstanceAvailableZonesResponse.ZoneList["+ i +"].Zone"));
			zoneListItem.setIsInCluster(_ctx.booleanValue("DescribeInstanceAvailableZonesResponse.ZoneList["+ i +"].IsInCluster"));
			zoneListItem.setReplicateZoneIndex(_ctx.stringValue("DescribeInstanceAvailableZonesResponse.ZoneList["+ i +"].ReplicateZoneIndex"));
			zoneListItem.setLogicalZoneName(_ctx.stringValue("DescribeInstanceAvailableZonesResponse.ZoneList["+ i +"].LogicalZoneName"));

			zoneList.add(zoneListItem);
		}
		describeInstanceAvailableZonesResponse.setZoneList(zoneList);
	 
	 	return describeInstanceAvailableZonesResponse;
	}
}