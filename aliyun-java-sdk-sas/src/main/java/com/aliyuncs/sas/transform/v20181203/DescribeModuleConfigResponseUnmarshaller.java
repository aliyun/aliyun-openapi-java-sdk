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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeModuleConfigResponse;
import com.aliyuncs.sas.model.v20181203.DescribeModuleConfigResponse.ModuleConfig;
import com.aliyuncs.sas.model.v20181203.DescribeModuleConfigResponse.ModuleConfig.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeModuleConfigResponseUnmarshaller {

	public static DescribeModuleConfigResponse unmarshall(DescribeModuleConfigResponse describeModuleConfigResponse, UnmarshallerContext _ctx) {
		
		describeModuleConfigResponse.setRequestId(_ctx.stringValue("DescribeModuleConfigResponse.RequestId"));
		describeModuleConfigResponse.setSuccess(_ctx.booleanValue("DescribeModuleConfigResponse.Success"));
		describeModuleConfigResponse.setCount(_ctx.integerValue("DescribeModuleConfigResponse.Count"));
		describeModuleConfigResponse.setHttpStatusCode(_ctx.integerValue("DescribeModuleConfigResponse.HttpStatusCode"));

		List<ModuleConfig> moduleConfigList = new ArrayList<ModuleConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeModuleConfigResponse.ModuleConfigList.Length"); i++) {
			ModuleConfig moduleConfig = new ModuleConfig();
			moduleConfig.setConfigName(_ctx.stringValue("DescribeModuleConfigResponse.ModuleConfigList["+ i +"].ConfigName"));
			moduleConfig.setModuleName(_ctx.stringValue("DescribeModuleConfigResponse.ModuleConfigList["+ i +"].ModuleName"));

			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < _ctx.lengthValue("DescribeModuleConfigResponse.ModuleConfigList["+ i +"].Items.Length"); j++) {
				Item item = new Item();
				item.setInstanceId(_ctx.stringValue("DescribeModuleConfigResponse.ModuleConfigList["+ i +"].Items["+ j +"].InstanceId"));
				item.setInstanceName(_ctx.stringValue("DescribeModuleConfigResponse.ModuleConfigList["+ i +"].Items["+ j +"].InstanceName"));
				item.setGroupId(_ctx.integerValue("DescribeModuleConfigResponse.ModuleConfigList["+ i +"].Items["+ j +"].GroupId"));
				item.setIp(_ctx.stringValue("DescribeModuleConfigResponse.ModuleConfigList["+ i +"].Items["+ j +"].Ip"));
				item.setRegion(_ctx.stringValue("DescribeModuleConfigResponse.ModuleConfigList["+ i +"].Items["+ j +"].Region"));
				item.setUuid(_ctx.stringValue("DescribeModuleConfigResponse.ModuleConfigList["+ i +"].Items["+ j +"].Uuid"));

				items.add(item);
			}
			moduleConfig.setItems(items);

			moduleConfigList.add(moduleConfig);
		}
		describeModuleConfigResponse.setModuleConfigList(moduleConfigList);
	 
	 	return describeModuleConfigResponse;
	}
}