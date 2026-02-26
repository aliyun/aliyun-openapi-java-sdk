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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.miniapplcdp.model.v20200113.ListModuleDependenciesResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListModuleDependenciesResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListModuleDependenciesResponse.Data.ModuleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListModuleDependenciesResponseUnmarshaller {

	public static ListModuleDependenciesResponse unmarshall(ListModuleDependenciesResponse listModuleDependenciesResponse, UnmarshallerContext _ctx) {
		
		listModuleDependenciesResponse.setRequestId(_ctx.stringValue("ListModuleDependenciesResponse.RequestId"));

		Data data = new Data();

		List<ModuleItem> items = new ArrayList<ModuleItem>();
		for (int i = 0; i < _ctx.lengthValue("ListModuleDependenciesResponse.Data.Items.Length"); i++) {
			ModuleItem moduleItem = new ModuleItem();
			moduleItem.setCommitId(_ctx.stringValue("ListModuleDependenciesResponse.Data.Items["+ i +"].CommitId"));
			moduleItem.setDescription(_ctx.stringValue("ListModuleDependenciesResponse.Data.Items["+ i +"].Description"));
			moduleItem.setDirectDependency(_ctx.booleanValue("ListModuleDependenciesResponse.Data.Items["+ i +"].DirectDependency"));
			moduleItem.setIcon(_ctx.stringValue("ListModuleDependenciesResponse.Data.Items["+ i +"].Icon"));
			moduleItem.setMinimumPlatformVersion(_ctx.stringValue("ListModuleDependenciesResponse.Data.Items["+ i +"].MinimumPlatformVersion"));
			moduleItem.setModuleId(_ctx.stringValue("ListModuleDependenciesResponse.Data.Items["+ i +"].ModuleId"));
			moduleItem.setModuleName(_ctx.stringValue("ListModuleDependenciesResponse.Data.Items["+ i +"].ModuleName"));
			moduleItem.setOwnerUserId(_ctx.stringValue("ListModuleDependenciesResponse.Data.Items["+ i +"].OwnerUserId"));
			moduleItem.setPlatform(_ctx.stringValue("ListModuleDependenciesResponse.Data.Items["+ i +"].Platform"));
			moduleItem.setVersion(_ctx.stringValue("ListModuleDependenciesResponse.Data.Items["+ i +"].Version"));
			moduleItem.setOrigin(_ctx.stringValue("ListModuleDependenciesResponse.Data.Items["+ i +"].Origin"));

			items.add(moduleItem);
		}
		data.setItems(items);
		listModuleDependenciesResponse.setData(data);
	 
	 	return listModuleDependenciesResponse;
	}
}