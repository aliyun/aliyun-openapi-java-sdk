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

import com.aliyuncs.miniapplcdp.model.v20200113.ListModulesResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListModulesResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListModulesResponse.Data.ModuleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListModulesResponseUnmarshaller {

	public static ListModulesResponse unmarshall(ListModulesResponse listModulesResponse, UnmarshallerContext _ctx) {
		
		listModulesResponse.setRequestId(_ctx.stringValue("ListModulesResponse.RequestId"));

		Data data = new Data();

		List<ModuleItem> items = new ArrayList<ModuleItem>();
		for (int i = 0; i < _ctx.lengthValue("ListModulesResponse.Data.Items.Length"); i++) {
			ModuleItem moduleItem = new ModuleItem();
			moduleItem.setDescription(_ctx.stringValue("ListModulesResponse.Data.Items["+ i +"].Description"));
			moduleItem.setCreateTime(_ctx.stringValue("ListModulesResponse.Data.Items["+ i +"].CreateTime"));
			moduleItem.setModifiedTime(_ctx.stringValue("ListModulesResponse.Data.Items["+ i +"].ModifiedTime"));
			moduleItem.setIcon(_ctx.stringValue("ListModulesResponse.Data.Items["+ i +"].Icon"));
			moduleItem.setLatestPublishedCommit(_ctx.stringValue("ListModulesResponse.Data.Items["+ i +"].LatestPublishedCommit"));
			moduleItem.setLatestPublishedVersion(_ctx.stringValue("ListModulesResponse.Data.Items["+ i +"].LatestPublishedVersion"));
			moduleItem.setMinimumPlatformVersion(_ctx.stringValue("ListModulesResponse.Data.Items["+ i +"].MinimumPlatformVersion"));
			moduleItem.setModuleId(_ctx.stringValue("ListModulesResponse.Data.Items["+ i +"].ModuleId"));
			moduleItem.setModuleName(_ctx.stringValue("ListModulesResponse.Data.Items["+ i +"].ModuleName"));
			moduleItem.setOwnerAppId(_ctx.stringValue("ListModulesResponse.Data.Items["+ i +"].OwnerAppId"));
			moduleItem.setOwnerUserId(_ctx.stringValue("ListModulesResponse.Data.Items["+ i +"].OwnerUserId"));
			moduleItem.setPlatform(_ctx.stringValue("ListModulesResponse.Data.Items["+ i +"].Platform"));
			moduleItem.setPlatformVersion(_ctx.stringValue("ListModulesResponse.Data.Items["+ i +"].PlatformVersion"));

			items.add(moduleItem);
		}
		data.setItems(items);
		listModulesResponse.setData(data);
	 
	 	return listModulesResponse;
	}
}