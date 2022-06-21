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

import com.aliyuncs.swas.model.v20170810.GetAppInfoResponse;
import com.aliyuncs.swas.model.v20170810.GetAppInfoResponse.InstallionsItem;
import com.aliyuncs.swas.model.v20170810.GetAppInfoResponse.ModulesItem;
import com.aliyuncs.swas.model.v20170810.GetAppInfoResponse.ModulesItem.ConfigsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppInfoResponseUnmarshaller {

	public static GetAppInfoResponse unmarshall(GetAppInfoResponse getAppInfoResponse, UnmarshallerContext _ctx) {
		
		getAppInfoResponse.setRequestId(_ctx.stringValue("GetAppInfoResponse.RequestId"));
		getAppInfoResponse.setStatus(_ctx.stringValue("GetAppInfoResponse.Status"));
		getAppInfoResponse.setIsSuccess(_ctx.booleanValue("GetAppInfoResponse.IsSuccess"));
		getAppInfoResponse.setType(_ctx.stringValue("GetAppInfoResponse.Type"));
		getAppInfoResponse.setAppUid(_ctx.stringValue("GetAppInfoResponse.AppUid"));
		getAppInfoResponse.setIcon(_ctx.stringValue("GetAppInfoResponse.Icon"));
		getAppInfoResponse.setCode(_ctx.stringValue("GetAppInfoResponse.Code"));
		getAppInfoResponse.setName(_ctx.stringValue("GetAppInfoResponse.Name"));

		List<InstallionsItem> installions = new ArrayList<InstallionsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInfoResponse.Installions.Length"); i++) {
			InstallionsItem installionsItem = new InstallionsItem();
			installionsItem.setVersion(_ctx.stringValue("GetAppInfoResponse.Installions["+ i +"].Version"));
			installionsItem.setPath(_ctx.stringValue("GetAppInfoResponse.Installions["+ i +"].Path"));
			installionsItem.setIcon(_ctx.stringValue("GetAppInfoResponse.Installions["+ i +"].Icon"));
			installionsItem.setName(_ctx.stringValue("GetAppInfoResponse.Installions["+ i +"].Name"));

			installions.add(installionsItem);
		}
		getAppInfoResponse.setInstallions(installions);

		List<ModulesItem> modules = new ArrayList<ModulesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInfoResponse.Modules.Length"); i++) {
			ModulesItem modulesItem = new ModulesItem();
			modulesItem.setIcon(_ctx.stringValue("GetAppInfoResponse.Modules["+ i +"].Icon"));
			modulesItem.setName(_ctx.stringValue("GetAppInfoResponse.Modules["+ i +"].Name"));

			List<ConfigsItem> configs = new ArrayList<ConfigsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAppInfoResponse.Modules["+ i +"].Configs.Length"); j++) {
				ConfigsItem configsItem = new ConfigsItem();
				configsItem.setValue(_ctx.stringValue("GetAppInfoResponse.Modules["+ i +"].Configs["+ j +"].Value"));
				configsItem.setName(_ctx.stringValue("GetAppInfoResponse.Modules["+ i +"].Configs["+ j +"].Name"));

				configs.add(configsItem);
			}
			modulesItem.setConfigs(configs);

			modules.add(modulesItem);
		}
		getAppInfoResponse.setModules(modules);
	 
	 	return getAppInfoResponse;
	}
}