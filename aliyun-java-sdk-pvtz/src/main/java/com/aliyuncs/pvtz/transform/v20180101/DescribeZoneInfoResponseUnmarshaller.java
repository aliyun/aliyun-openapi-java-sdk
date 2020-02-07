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

import com.aliyuncs.pvtz.model.v20180101.DescribeZoneInfoResponse;
import com.aliyuncs.pvtz.model.v20180101.DescribeZoneInfoResponse.Vpc;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeZoneInfoResponseUnmarshaller {

	public static DescribeZoneInfoResponse unmarshall(DescribeZoneInfoResponse describeZoneInfoResponse, UnmarshallerContext _ctx) {
		
		describeZoneInfoResponse.setRequestId(_ctx.stringValue("DescribeZoneInfoResponse.RequestId"));
		describeZoneInfoResponse.setZoneId(_ctx.stringValue("DescribeZoneInfoResponse.ZoneId"));
		describeZoneInfoResponse.setZoneName(_ctx.stringValue("DescribeZoneInfoResponse.ZoneName"));
		describeZoneInfoResponse.setRemark(_ctx.stringValue("DescribeZoneInfoResponse.Remark"));
		describeZoneInfoResponse.setRecordCount(_ctx.integerValue("DescribeZoneInfoResponse.RecordCount"));
		describeZoneInfoResponse.setCreateTime(_ctx.stringValue("DescribeZoneInfoResponse.CreateTime"));
		describeZoneInfoResponse.setCreateTimestamp(_ctx.longValue("DescribeZoneInfoResponse.CreateTimestamp"));
		describeZoneInfoResponse.setUpdateTime(_ctx.stringValue("DescribeZoneInfoResponse.UpdateTime"));
		describeZoneInfoResponse.setUpdateTimestamp(_ctx.longValue("DescribeZoneInfoResponse.UpdateTimestamp"));
		describeZoneInfoResponse.setIsPtr(_ctx.booleanValue("DescribeZoneInfoResponse.IsPtr"));
		describeZoneInfoResponse.setProxyPattern(_ctx.stringValue("DescribeZoneInfoResponse.ProxyPattern"));
		describeZoneInfoResponse.setSlaveDns(_ctx.booleanValue("DescribeZoneInfoResponse.SlaveDns"));

		List<Vpc> bindVpcs = new ArrayList<Vpc>();
		for (int i = 0; i < _ctx.lengthValue("DescribeZoneInfoResponse.BindVpcs.Length"); i++) {
			Vpc vpc = new Vpc();
			vpc.setVpcId(_ctx.stringValue("DescribeZoneInfoResponse.BindVpcs["+ i +"].VpcId"));
			vpc.setVpcName(_ctx.stringValue("DescribeZoneInfoResponse.BindVpcs["+ i +"].VpcName"));
			vpc.setRegionName(_ctx.stringValue("DescribeZoneInfoResponse.BindVpcs["+ i +"].RegionName"));
			vpc.setRegionId(_ctx.stringValue("DescribeZoneInfoResponse.BindVpcs["+ i +"].RegionId"));

			bindVpcs.add(vpc);
		}
		describeZoneInfoResponse.setBindVpcs(bindVpcs);
	 
	 	return describeZoneInfoResponse;
	}
}