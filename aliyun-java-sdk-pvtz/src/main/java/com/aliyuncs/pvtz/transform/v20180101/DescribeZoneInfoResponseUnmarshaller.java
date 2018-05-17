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

	public static DescribeZoneInfoResponse unmarshall(DescribeZoneInfoResponse describeZoneInfoResponse, UnmarshallerContext context) {
		
		describeZoneInfoResponse.setRequestId(context.stringValue("DescribeZoneInfoResponse.RequestId"));
		describeZoneInfoResponse.setZoneId(context.stringValue("DescribeZoneInfoResponse.ZoneId"));
		describeZoneInfoResponse.setZoneName(context.stringValue("DescribeZoneInfoResponse.ZoneName"));
		describeZoneInfoResponse.setRemark(context.stringValue("DescribeZoneInfoResponse.Remark"));
		describeZoneInfoResponse.setRecordCount(context.integerValue("DescribeZoneInfoResponse.RecordCount"));
		describeZoneInfoResponse.setCreateTime(context.stringValue("DescribeZoneInfoResponse.CreateTime"));
		describeZoneInfoResponse.setCreateTimestamp(context.longValue("DescribeZoneInfoResponse.CreateTimestamp"));
		describeZoneInfoResponse.setUpdateTime(context.stringValue("DescribeZoneInfoResponse.UpdateTime"));
		describeZoneInfoResponse.setUpdateTimestamp(context.longValue("DescribeZoneInfoResponse.UpdateTimestamp"));
		describeZoneInfoResponse.setIsPtr(context.booleanValue("DescribeZoneInfoResponse.IsPtr"));

		List<Vpc> bindVpcs = new ArrayList<Vpc>();
		for (int i = 0; i < context.lengthValue("DescribeZoneInfoResponse.BindVpcs.Length"); i++) {
			Vpc vpc = new Vpc();
			vpc.setReionId(context.stringValue("DescribeZoneInfoResponse.BindVpcs["+ i +"].ReionId"));
			vpc.setVpcId(context.stringValue("DescribeZoneInfoResponse.BindVpcs["+ i +"].VpcId"));
			vpc.setVpcName(context.stringValue("DescribeZoneInfoResponse.BindVpcs["+ i +"].VpcName"));
			vpc.setRegionName(context.stringValue("DescribeZoneInfoResponse.BindVpcs["+ i +"].RegionName"));

			bindVpcs.add(vpc);
		}
		describeZoneInfoResponse.setBindVpcs(bindVpcs);
	 
	 	return describeZoneInfoResponse;
	}
}