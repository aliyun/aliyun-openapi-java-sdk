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

package com.aliyuncs.pvtz.transform.v20180101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pvtz.model.v20180101.DescribeZonesResponse;
import com.aliyuncs.pvtz.model.v20180101.DescribeZonesResponse.Zone;
import com.aliyuncs.pvtz.model.v20180101.DescribeZonesResponse.Zone.ResourceTag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeZonesResponseUnmarshaller {

	public static DescribeZonesResponse unmarshall(DescribeZonesResponse describeZonesResponse, UnmarshallerContext _ctx) {
		
		describeZonesResponse.setRequestId(_ctx.stringValue("DescribeZonesResponse.RequestId"));
		describeZonesResponse.setPageSize(_ctx.integerValue("DescribeZonesResponse.PageSize"));
		describeZonesResponse.setPageNumber(_ctx.integerValue("DescribeZonesResponse.PageNumber"));
		describeZonesResponse.setTotalPages(_ctx.integerValue("DescribeZonesResponse.TotalPages"));
		describeZonesResponse.setTotalItems(_ctx.integerValue("DescribeZonesResponse.TotalItems"));

		List<Zone> zones = new ArrayList<Zone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeZonesResponse.Zones.Length"); i++) {
			Zone zone = new Zone();
			zone.setUpdateTime(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].UpdateTime"));
			zone.setZoneType(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].ZoneType"));
			zone.setRemark(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].Remark"));
			zone.setCreateTime(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].CreateTime"));
			zone.setRecordCount(_ctx.integerValue("DescribeZonesResponse.Zones["+ i +"].RecordCount"));
			zone.setZoneName(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].ZoneName"));
			zone.setProxyPattern(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].ProxyPattern"));
			zone.setUpdateTimestamp(_ctx.longValue("DescribeZonesResponse.Zones["+ i +"].UpdateTimestamp"));
			zone.setResourceGroupId(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].ResourceGroupId"));
			zone.setZoneId(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].ZoneId"));
			zone.setZoneTag(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].ZoneTag"));
			zone.setIsPtr(_ctx.booleanValue("DescribeZonesResponse.Zones["+ i +"].IsPtr"));
			zone.setCreateTimestamp(_ctx.longValue("DescribeZonesResponse.Zones["+ i +"].CreateTimestamp"));
			zone.setDnsGroup(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].DnsGroup"));
			zone.setCreator(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].Creator"));
			zone.setCreatorSubType(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].CreatorSubType"));
			zone.setDnsGroupChanging(_ctx.booleanValue("DescribeZonesResponse.Zones["+ i +"].DnsGroupChanging"));

			List<ResourceTag> resourceTags = new ArrayList<ResourceTag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].ResourceTags.Length"); j++) {
				ResourceTag resourceTag = new ResourceTag();
				resourceTag.setKey(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].ResourceTags["+ j +"].Key"));
				resourceTag.setValue(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].ResourceTags["+ j +"].Value"));

				resourceTags.add(resourceTag);
			}
			zone.setResourceTags(resourceTags);

			zones.add(zone);
		}
		describeZonesResponse.setZones(zones);
	 
	 	return describeZonesResponse;
	}
}