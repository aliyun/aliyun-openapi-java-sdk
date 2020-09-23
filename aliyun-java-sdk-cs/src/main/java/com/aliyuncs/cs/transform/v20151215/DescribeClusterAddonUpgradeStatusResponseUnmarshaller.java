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

package com.aliyuncs.cs.transform.v20151215;

import com.aliyuncs.cs.model.v20151215.DescribeClusterAddonUpgradeStatusResponse;
import com.aliyuncs.cs.model.v20151215.DescribeClusterAddonUpgradeStatusResponse.Addon_info;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterAddonUpgradeStatusResponseUnmarshaller {

	public static DescribeClusterAddonUpgradeStatusResponse unmarshall(DescribeClusterAddonUpgradeStatusResponse describeClusterAddonUpgradeStatusResponse, UnmarshallerContext _ctx) {
		
		describeClusterAddonUpgradeStatusResponse.setTemplate(_ctx.stringValue("DescribeClusterAddonUpgradeStatusResponse.template"));
		describeClusterAddonUpgradeStatusResponse.setCan_upgrade(_ctx.booleanValue("DescribeClusterAddonUpgradeStatusResponse.can_upgrade"));

		Addon_info addon_info = new Addon_info();
		addon_info.setComponent_name(_ctx.stringValue("DescribeClusterAddonUpgradeStatusResponse.addon_info.component_name"));
		addon_info.setMessage(_ctx.stringValue("DescribeClusterAddonUpgradeStatusResponse.addon_info.message"));
		addon_info.setCategory(_ctx.stringValue("DescribeClusterAddonUpgradeStatusResponse.addon_info.category"));
		addon_info.setVersion(_ctx.stringValue("DescribeClusterAddonUpgradeStatusResponse.addon_info.version"));
		addon_info.setYaml(_ctx.stringValue("DescribeClusterAddonUpgradeStatusResponse.addon_info.yaml"));
		describeClusterAddonUpgradeStatusResponse.setAddon_info(addon_info);
	 
	 	return describeClusterAddonUpgradeStatusResponse;
	}
}