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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceSecurityConfigsResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceSecurityConfigsResponse.InstanceSecurityConfigs;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceSecurityConfigsResponse.InstanceSecurityConfigs.SecurityConfigsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceSecurityConfigsResponseUnmarshaller {

	public static DescribeInstanceSecurityConfigsResponse unmarshall(DescribeInstanceSecurityConfigsResponse describeInstanceSecurityConfigsResponse, UnmarshallerContext _ctx) {
		
		describeInstanceSecurityConfigsResponse.setRequestId(_ctx.stringValue("DescribeInstanceSecurityConfigsResponse.RequestId"));

		InstanceSecurityConfigs instanceSecurityConfigs = new InstanceSecurityConfigs();
		instanceSecurityConfigs.setTotalCheckCount(_ctx.integerValue("DescribeInstanceSecurityConfigsResponse.InstanceSecurityConfigs.TotalCheckCount"));
		instanceSecurityConfigs.setTotalRiskCount(_ctx.integerValue("DescribeInstanceSecurityConfigsResponse.InstanceSecurityConfigs.TotalRiskCount"));
		instanceSecurityConfigs.setCheckTime(_ctx.stringValue("DescribeInstanceSecurityConfigsResponse.InstanceSecurityConfigs.CheckTime"));
		instanceSecurityConfigs.setInstanceId(_ctx.stringValue("DescribeInstanceSecurityConfigsResponse.InstanceSecurityConfigs.InstanceId"));
		instanceSecurityConfigs.setCheckId(_ctx.stringValue("DescribeInstanceSecurityConfigsResponse.InstanceSecurityConfigs.CheckId"));

		List<SecurityConfigsItem> securityConfigs = new ArrayList<SecurityConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceSecurityConfigsResponse.InstanceSecurityConfigs.SecurityConfigs.Length"); i++) {
			SecurityConfigsItem securityConfigsItem = new SecurityConfigsItem();
			securityConfigsItem.setConfigName(_ctx.stringValue("DescribeInstanceSecurityConfigsResponse.InstanceSecurityConfigs.SecurityConfigs["+ i +"].ConfigName"));
			securityConfigsItem.setRisk(_ctx.booleanValue("DescribeInstanceSecurityConfigsResponse.InstanceSecurityConfigs.SecurityConfigs["+ i +"].Risk"));
			securityConfigsItem.setRiskDescription(_ctx.stringValue("DescribeInstanceSecurityConfigsResponse.InstanceSecurityConfigs.SecurityConfigs["+ i +"].RiskDescription"));
			securityConfigsItem.setConfigGroup(_ctx.stringValue("DescribeInstanceSecurityConfigsResponse.InstanceSecurityConfigs.SecurityConfigs["+ i +"].ConfigGroup"));
			securityConfigsItem.setConfigDescription(_ctx.stringValue("DescribeInstanceSecurityConfigsResponse.InstanceSecurityConfigs.SecurityConfigs["+ i +"].ConfigDescription"));

			securityConfigs.add(securityConfigsItem);
		}
		instanceSecurityConfigs.setSecurityConfigs(securityConfigs);
		describeInstanceSecurityConfigsResponse.setInstanceSecurityConfigs(instanceSecurityConfigs);
	 
	 	return describeInstanceSecurityConfigsResponse;
	}
}