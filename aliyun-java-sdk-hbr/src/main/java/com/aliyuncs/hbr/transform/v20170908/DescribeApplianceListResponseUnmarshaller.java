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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeApplianceListResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeApplianceListResponse.Appliance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplianceListResponseUnmarshaller {

	public static DescribeApplianceListResponse unmarshall(DescribeApplianceListResponse describeApplianceListResponse, UnmarshallerContext _ctx) {
		
		describeApplianceListResponse.setRequestId(_ctx.stringValue("DescribeApplianceListResponse.RequestId"));
		describeApplianceListResponse.setSuccess(_ctx.booleanValue("DescribeApplianceListResponse.Success"));
		describeApplianceListResponse.setCode(_ctx.stringValue("DescribeApplianceListResponse.Code"));
		describeApplianceListResponse.setMessage(_ctx.stringValue("DescribeApplianceListResponse.Message"));
		describeApplianceListResponse.setTotalCount(_ctx.integerValue("DescribeApplianceListResponse.TotalCount"));
		describeApplianceListResponse.setPageNumber(_ctx.integerValue("DescribeApplianceListResponse.PageNumber"));
		describeApplianceListResponse.setPageSize(_ctx.integerValue("DescribeApplianceListResponse.PageSize"));

		List<Appliance> applianceList = new ArrayList<Appliance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplianceListResponse.ApplianceList.Length"); i++) {
			Appliance appliance = new Appliance();
			appliance.setApplianceId(_ctx.stringValue("DescribeApplianceListResponse.ApplianceList["+ i +"].ApplianceId"));
			appliance.setApplianceType(_ctx.stringValue("DescribeApplianceListResponse.ApplianceList["+ i +"].ApplianceType"));
			appliance.setUuid(_ctx.stringValue("DescribeApplianceListResponse.ApplianceList["+ i +"].Uuid"));
			appliance.setApplianceName(_ctx.stringValue("DescribeApplianceListResponse.ApplianceList["+ i +"].ApplianceName"));
			appliance.setIpAddress(_ctx.stringValue("DescribeApplianceListResponse.ApplianceList["+ i +"].IpAddress"));
			appliance.setMacAddress(_ctx.stringValue("DescribeApplianceListResponse.ApplianceList["+ i +"].MacAddress"));
			appliance.setVersion(_ctx.stringValue("DescribeApplianceListResponse.ApplianceList["+ i +"].Version"));
			appliance.setHostname(_ctx.stringValue("DescribeApplianceListResponse.ApplianceList["+ i +"].Hostname"));
			appliance.setHeartbeatedTime(_ctx.longValue("DescribeApplianceListResponse.ApplianceList["+ i +"].HeartbeatedTime"));
			appliance.setCreatedTime(_ctx.longValue("DescribeApplianceListResponse.ApplianceList["+ i +"].CreatedTime"));
			appliance.setUpdatedTime(_ctx.longValue("DescribeApplianceListResponse.ApplianceList["+ i +"].UpdatedTime"));
			appliance.setHardwareModel(_ctx.stringValue("DescribeApplianceListResponse.ApplianceList["+ i +"].HardwareModel"));
			appliance.setApplianceRegionId(_ctx.stringValue("DescribeApplianceListResponse.ApplianceList["+ i +"].ApplianceRegionId"));

			applianceList.add(appliance);
		}
		describeApplianceListResponse.setApplianceList(applianceList);
	 
	 	return describeApplianceListResponse;
	}
}