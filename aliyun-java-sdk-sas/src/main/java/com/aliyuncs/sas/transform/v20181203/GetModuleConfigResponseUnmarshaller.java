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

import com.aliyuncs.sas.model.v20181203.GetModuleConfigResponse;
import com.aliyuncs.sas.model.v20181203.GetModuleConfigResponse.ModuleConfig;
import com.aliyuncs.sas.model.v20181203.GetModuleConfigResponse.ModuleConfig.Item;
import com.aliyuncs.sas.model.v20181203.GetModuleConfigResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetModuleConfigResponseUnmarshaller {

	public static GetModuleConfigResponse unmarshall(GetModuleConfigResponse getModuleConfigResponse, UnmarshallerContext _ctx) {
		
		getModuleConfigResponse.setRequestId(_ctx.stringValue("GetModuleConfigResponse.RequestId"));
		getModuleConfigResponse.setHttpStatusCode(_ctx.integerValue("GetModuleConfigResponse.HttpStatusCode"));
		getModuleConfigResponse.setSuccess(_ctx.booleanValue("GetModuleConfigResponse.Success"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("GetModuleConfigResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("GetModuleConfigResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("GetModuleConfigResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("GetModuleConfigResponse.PageInfo.Count"));
		getModuleConfigResponse.setPageInfo(pageInfo);

		List<ModuleConfig> moduleConfigList = new ArrayList<ModuleConfig>();
		for (int i = 0; i < _ctx.lengthValue("GetModuleConfigResponse.ModuleConfigList.Length"); i++) {
			ModuleConfig moduleConfig = new ModuleConfig();
			moduleConfig.setModuleName(_ctx.stringValue("GetModuleConfigResponse.ModuleConfigList["+ i +"].ModuleName"));
			moduleConfig.setConfigName(_ctx.stringValue("GetModuleConfigResponse.ModuleConfigList["+ i +"].ConfigName"));

			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < _ctx.lengthValue("GetModuleConfigResponse.ModuleConfigList["+ i +"].Items.Length"); j++) {
				Item item = new Item();
				item.setUuid(_ctx.stringValue("GetModuleConfigResponse.ModuleConfigList["+ i +"].Items["+ j +"].Uuid"));
				item.setGroupId(_ctx.integerValue("GetModuleConfigResponse.ModuleConfigList["+ i +"].Items["+ j +"].GroupId"));
				item.setInstanceName(_ctx.stringValue("GetModuleConfigResponse.ModuleConfigList["+ i +"].Items["+ j +"].InstanceName"));
				item.setRegion(_ctx.stringValue("GetModuleConfigResponse.ModuleConfigList["+ i +"].Items["+ j +"].Region"));
				item.setIp(_ctx.stringValue("GetModuleConfigResponse.ModuleConfigList["+ i +"].Items["+ j +"].Ip"));
				item.setInstanceId(_ctx.stringValue("GetModuleConfigResponse.ModuleConfigList["+ i +"].Items["+ j +"].InstanceId"));

				items.add(item);
			}
			moduleConfig.setItems(items);

			moduleConfigList.add(moduleConfig);
		}
		getModuleConfigResponse.setModuleConfigList(moduleConfigList);
	 
	 	return getModuleConfigResponse;
	}
}