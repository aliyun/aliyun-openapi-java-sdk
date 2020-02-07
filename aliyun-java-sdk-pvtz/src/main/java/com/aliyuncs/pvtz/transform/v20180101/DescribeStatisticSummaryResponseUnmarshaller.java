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

import com.aliyuncs.pvtz.model.v20180101.DescribeStatisticSummaryResponse;
import com.aliyuncs.pvtz.model.v20180101.DescribeStatisticSummaryResponse.VpcRequestTop;
import com.aliyuncs.pvtz.model.v20180101.DescribeStatisticSummaryResponse.ZoneRequestTop;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStatisticSummaryResponseUnmarshaller {

	public static DescribeStatisticSummaryResponse unmarshall(DescribeStatisticSummaryResponse describeStatisticSummaryResponse, UnmarshallerContext _ctx) {
		
		describeStatisticSummaryResponse.setRequestId(_ctx.stringValue("DescribeStatisticSummaryResponse.RequestId"));
		describeStatisticSummaryResponse.setTotalCount(_ctx.longValue("DescribeStatisticSummaryResponse.TotalCount"));

		List<ZoneRequestTop> zoneRequestTops = new ArrayList<ZoneRequestTop>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStatisticSummaryResponse.ZoneRequestTops.Length"); i++) {
			ZoneRequestTop zoneRequestTop = new ZoneRequestTop();
			zoneRequestTop.setZoneName(_ctx.stringValue("DescribeStatisticSummaryResponse.ZoneRequestTops["+ i +"].ZoneName"));
			zoneRequestTop.setRequestCount(_ctx.longValue("DescribeStatisticSummaryResponse.ZoneRequestTops["+ i +"].RequestCount"));

			zoneRequestTops.add(zoneRequestTop);
		}
		describeStatisticSummaryResponse.setZoneRequestTops(zoneRequestTops);

		List<VpcRequestTop> vpcRequestTops = new ArrayList<VpcRequestTop>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStatisticSummaryResponse.VpcRequestTops.Length"); i++) {
			VpcRequestTop vpcRequestTop = new VpcRequestTop();
			vpcRequestTop.setRegionId(_ctx.stringValue("DescribeStatisticSummaryResponse.VpcRequestTops["+ i +"].RegionId"));
			vpcRequestTop.setVpcId(_ctx.stringValue("DescribeStatisticSummaryResponse.VpcRequestTops["+ i +"].VpcId"));
			vpcRequestTop.setTunnelId(_ctx.stringValue("DescribeStatisticSummaryResponse.VpcRequestTops["+ i +"].TunnelId"));
			vpcRequestTop.setRequestCount(_ctx.longValue("DescribeStatisticSummaryResponse.VpcRequestTops["+ i +"].RequestCount"));
			vpcRequestTop.setRegionName(_ctx.stringValue("DescribeStatisticSummaryResponse.VpcRequestTops["+ i +"].RegionName"));

			vpcRequestTops.add(vpcRequestTop);
		}
		describeStatisticSummaryResponse.setVpcRequestTops(vpcRequestTops);
	 
	 	return describeStatisticSummaryResponse;
	}
}