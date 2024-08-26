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

package com.aliyuncs.gdb.transform.v20190903;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gdb.model.v20190903.DescribeSecurityGroupConfigurationResponse;
import com.aliyuncs.gdb.model.v20190903.DescribeSecurityGroupConfigurationResponse.EcsSecurityGroupRelation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSecurityGroupConfigurationResponseUnmarshaller {

	public static DescribeSecurityGroupConfigurationResponse unmarshall(DescribeSecurityGroupConfigurationResponse describeSecurityGroupConfigurationResponse, UnmarshallerContext _ctx) {
		
		describeSecurityGroupConfigurationResponse.setRequestId(_ctx.stringValue("DescribeSecurityGroupConfigurationResponse.RequestId"));
		describeSecurityGroupConfigurationResponse.setDBInstanceId(_ctx.stringValue("DescribeSecurityGroupConfigurationResponse.DBInstanceId"));

		List<EcsSecurityGroupRelation> items = new ArrayList<EcsSecurityGroupRelation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSecurityGroupConfigurationResponse.Items.Length"); i++) {
			EcsSecurityGroupRelation ecsSecurityGroupRelation = new EcsSecurityGroupRelation();
			ecsSecurityGroupRelation.setNetworkType(_ctx.stringValue("DescribeSecurityGroupConfigurationResponse.Items["+ i +"].NetworkType"));
			ecsSecurityGroupRelation.setSecurityGroupId(_ctx.stringValue("DescribeSecurityGroupConfigurationResponse.Items["+ i +"].SecurityGroupId"));
			ecsSecurityGroupRelation.setRegionId(_ctx.stringValue("DescribeSecurityGroupConfigurationResponse.Items["+ i +"].RegionId"));

			items.add(ecsSecurityGroupRelation);
		}
		describeSecurityGroupConfigurationResponse.setItems(items);
	 
	 	return describeSecurityGroupConfigurationResponse;
	}
}