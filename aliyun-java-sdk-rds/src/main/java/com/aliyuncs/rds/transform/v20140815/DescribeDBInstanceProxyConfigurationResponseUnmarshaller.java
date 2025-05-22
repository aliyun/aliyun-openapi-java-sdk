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

package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceProxyConfigurationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceProxyConfigurationResponseUnmarshaller {

	public static DescribeDBInstanceProxyConfigurationResponse unmarshall(DescribeDBInstanceProxyConfigurationResponse describeDBInstanceProxyConfigurationResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceProxyConfigurationResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceProxyConfigurationResponse.RequestId"));
		describeDBInstanceProxyConfigurationResponse.setAttacksProtectionConfiguration(_ctx.stringValue("DescribeDBInstanceProxyConfigurationResponse.AttacksProtectionConfiguration"));
		describeDBInstanceProxyConfigurationResponse.setPersistentConnectionsConfiguration(_ctx.stringValue("DescribeDBInstanceProxyConfigurationResponse.PersistentConnectionsConfiguration"));
		describeDBInstanceProxyConfigurationResponse.setTransparentSwitchConfiguration(_ctx.stringValue("DescribeDBInstanceProxyConfigurationResponse.TransparentSwitchConfiguration"));
	 
	 	return describeDBInstanceProxyConfigurationResponse;
	}
}