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

import com.aliyuncs.pvtz.model.v20180101.DescribeZoneVpcTreeResponse;
import com.aliyuncs.pvtz.model.v20180101.DescribeZoneVpcTreeResponse.Zone;
import com.aliyuncs.pvtz.model.v20180101.DescribeZoneVpcTreeResponse.Zone.Vpc;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeZoneVpcTreeResponseUnmarshaller {

	public static DescribeZoneVpcTreeResponse unmarshall(DescribeZoneVpcTreeResponse describeZoneVpcTreeResponse, UnmarshallerContext _ctx) {
		
		describeZoneVpcTreeResponse.setRequestId(_ctx.stringValue("DescribeZoneVpcTreeResponse.RequestId"));

		List<Zone> zones = new ArrayList<Zone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeZoneVpcTreeResponse.Zones.Length"); i++) {
			Zone zone = new Zone();
			zone.setZoneId(_ctx.stringValue("DescribeZoneVpcTreeResponse.Zones["+ i +"].ZoneId"));
			zone.setZoneName(_ctx.stringValue("DescribeZoneVpcTreeResponse.Zones["+ i +"].ZoneName"));
			zone.setRemark(_ctx.stringValue("DescribeZoneVpcTreeResponse.Zones["+ i +"].Remark"));
			zone.setRecordCount(_ctx.integerValue("DescribeZoneVpcTreeResponse.Zones["+ i +"].RecordCount"));
			zone.setCreateTime(_ctx.stringValue("DescribeZoneVpcTreeResponse.Zones["+ i +"].CreateTime"));
			zone.setCreateTimestamp(_ctx.longValue("DescribeZoneVpcTreeResponse.Zones["+ i +"].CreateTimestamp"));
			zone.setUpdateTime(_ctx.stringValue("DescribeZoneVpcTreeResponse.Zones["+ i +"].UpdateTime"));
			zone.setUpdateTimestamp(_ctx.longValue("DescribeZoneVpcTreeResponse.Zones["+ i +"].UpdateTimestamp"));
			zone.setIsPtr(_ctx.booleanValue("DescribeZoneVpcTreeResponse.Zones["+ i +"].IsPtr"));

			List<Vpc> vpcs = new ArrayList<Vpc>();
			for (int j = 0; j < _ctx.lengthValue("DescribeZoneVpcTreeResponse.Zones["+ i +"].Vpcs.Length"); j++) {
				Vpc vpc = new Vpc();
				vpc.setRegionId(_ctx.stringValue("DescribeZoneVpcTreeResponse.Zones["+ i +"].Vpcs["+ j +"].RegionId"));
				vpc.setRegionName(_ctx.stringValue("DescribeZoneVpcTreeResponse.Zones["+ i +"].Vpcs["+ j +"].RegionName"));
				vpc.setVpcId(_ctx.stringValue("DescribeZoneVpcTreeResponse.Zones["+ i +"].Vpcs["+ j +"].VpcId"));
				vpc.setVpcName(_ctx.stringValue("DescribeZoneVpcTreeResponse.Zones["+ i +"].Vpcs["+ j +"].VpcName"));

				vpcs.add(vpc);
			}
			zone.setVpcs(vpcs);

			zones.add(zone);
		}
		describeZoneVpcTreeResponse.setZones(zones);
	 
	 	return describeZoneVpcTreeResponse;
	}
}