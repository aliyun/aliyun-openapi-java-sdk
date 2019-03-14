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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeZonesResponseUnmarshaller {

	public static DescribeZonesResponse unmarshall(DescribeZonesResponse describeZonesResponse, UnmarshallerContext context) {
		
		describeZonesResponse.setRequestId(context.stringValue("DescribeZonesResponse.RequestId"));
		describeZonesResponse.setTotalItems(context.integerValue("DescribeZonesResponse.TotalItems"));
		describeZonesResponse.setTotalPages(context.integerValue("DescribeZonesResponse.TotalPages"));
		describeZonesResponse.setPageSize(context.integerValue("DescribeZonesResponse.PageSize"));
		describeZonesResponse.setPageNumber(context.integerValue("DescribeZonesResponse.PageNumber"));

		List<Zone> zones = new ArrayList<Zone>();
		for (int i = 0; i < context.lengthValue("DescribeZonesResponse.Zones.Length"); i++) {
			Zone zone = new Zone();
			zone.setZoneId(context.stringValue("DescribeZonesResponse.Zones["+ i +"].ZoneId"));
			zone.setZoneName(context.stringValue("DescribeZonesResponse.Zones["+ i +"].ZoneName"));
			zone.setRemark(context.stringValue("DescribeZonesResponse.Zones["+ i +"].Remark"));
			zone.setRecordCount(context.integerValue("DescribeZonesResponse.Zones["+ i +"].RecordCount"));
			zone.setCreateTime(context.stringValue("DescribeZonesResponse.Zones["+ i +"].CreateTime"));
			zone.setCreateTimestamp(context.longValue("DescribeZonesResponse.Zones["+ i +"].CreateTimestamp"));
			zone.setUpdateTime(context.stringValue("DescribeZonesResponse.Zones["+ i +"].UpdateTime"));
			zone.setUpdateTimestamp(context.longValue("DescribeZonesResponse.Zones["+ i +"].UpdateTimestamp"));
			zone.setIsPtr(context.booleanValue("DescribeZonesResponse.Zones["+ i +"].IsPtr"));
			zone.setProxyPattern(context.stringValue("DescribeZonesResponse.Zones["+ i +"].ProxyPattern"));

			zones.add(zone);
		}
		describeZonesResponse.setZones(zones);
	 
	 	return describeZonesResponse;
	}
}