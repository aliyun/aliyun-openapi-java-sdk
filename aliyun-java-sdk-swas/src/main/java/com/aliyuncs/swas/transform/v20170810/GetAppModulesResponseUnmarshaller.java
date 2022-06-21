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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.GetAppModulesResponse;
import com.aliyuncs.swas.model.v20170810.GetAppModulesResponse.ModulesItem;
import com.aliyuncs.swas.model.v20170810.GetAppModulesResponse.ModulesItem.ConfigsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppModulesResponseUnmarshaller {

	public static GetAppModulesResponse unmarshall(GetAppModulesResponse getAppModulesResponse, UnmarshallerContext _ctx) {
		
		getAppModulesResponse.setRequestId(_ctx.stringValue("GetAppModulesResponse.RequestId"));
		getAppModulesResponse.setIsSuccess(_ctx.booleanValue("GetAppModulesResponse.IsSuccess"));
		getAppModulesResponse.setCode(_ctx.stringValue("GetAppModulesResponse.Code"));

		List<ModulesItem> modules = new ArrayList<ModulesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppModulesResponse.Modules.Length"); i++) {
			ModulesItem modulesItem = new ModulesItem();
			modulesItem.setIcon(_ctx.stringValue("GetAppModulesResponse.Modules["+ i +"].Icon"));
			modulesItem.setName(_ctx.stringValue("GetAppModulesResponse.Modules["+ i +"].Name"));

			List<ConfigsItem> configs = new ArrayList<ConfigsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAppModulesResponse.Modules["+ i +"].Configs.Length"); j++) {
				ConfigsItem configsItem = new ConfigsItem();
				configsItem.setValue(_ctx.stringValue("GetAppModulesResponse.Modules["+ i +"].Configs["+ j +"].Value"));
				configsItem.setName(_ctx.stringValue("GetAppModulesResponse.Modules["+ i +"].Configs["+ j +"].Name"));

				configs.add(configsItem);
			}
			modulesItem.setConfigs(configs);

			modules.add(modulesItem);
		}
		getAppModulesResponse.setModules(modules);
	 
	 	return getAppModulesResponse;
	}
}