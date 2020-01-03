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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeSecurityGroupConfigurationResponse;
import com.aliyuncs.dds.model.v20151201.DescribeSecurityGroupConfigurationResponse.RdsEcsSecurityGroupRel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityGroupConfigurationResponseUnmarshaller {

	public static DescribeSecurityGroupConfigurationResponse unmarshall(DescribeSecurityGroupConfigurationResponse describeSecurityGroupConfigurationResponse, UnmarshallerContext _ctx) {
		
		describeSecurityGroupConfigurationResponse.setRequestId(_ctx.stringValue("DescribeSecurityGroupConfigurationResponse.RequestId"));

		List<RdsEcsSecurityGroupRel> items = new ArrayList<RdsEcsSecurityGroupRel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityGroupConfigurationResponse.Items.Length"); i++) {
			RdsEcsSecurityGroupRel rdsEcsSecurityGroupRel = new RdsEcsSecurityGroupRel();
			rdsEcsSecurityGroupRel.setRegionId(_ctx.stringValue("DescribeSecurityGroupConfigurationResponse.Items["+ i +"].RegionId"));
			rdsEcsSecurityGroupRel.setSecurityGroupId(_ctx.stringValue("DescribeSecurityGroupConfigurationResponse.Items["+ i +"].SecurityGroupId"));
			rdsEcsSecurityGroupRel.setNetType(_ctx.stringValue("DescribeSecurityGroupConfigurationResponse.Items["+ i +"].NetType"));

			items.add(rdsEcsSecurityGroupRel);
		}
		describeSecurityGroupConfigurationResponse.setItems(items);
	 
	 	return describeSecurityGroupConfigurationResponse;
	}
}