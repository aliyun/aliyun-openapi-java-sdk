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

import com.aliyuncs.miniapplcdp.model.v20200113.ListAppModulesResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListAppModulesResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListAppModulesResponse.Data.ModuleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppModulesResponseUnmarshaller {

	public static ListAppModulesResponse unmarshall(ListAppModulesResponse listAppModulesResponse, UnmarshallerContext _ctx) {
		
		listAppModulesResponse.setRequestId(_ctx.stringValue("ListAppModulesResponse.RequestId"));

		Data data = new Data();

		List<ModuleItem> items = new ArrayList<ModuleItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppModulesResponse.Data.Items.Length"); i++) {
			ModuleItem moduleItem = new ModuleItem();
			moduleItem.setModuleName(_ctx.stringValue("ListAppModulesResponse.Data.Items["+ i +"].ModuleName"));
			moduleItem.setModifiedTime(_ctx.stringValue("ListAppModulesResponse.Data.Items["+ i +"].ModifiedTime"));
			moduleItem.setModuleId(_ctx.stringValue("ListAppModulesResponse.Data.Items["+ i +"].ModuleId"));
			moduleItem.setDescription(_ctx.stringValue("ListAppModulesResponse.Data.Items["+ i +"].Description"));
			moduleItem.setCreateTime(_ctx.stringValue("ListAppModulesResponse.Data.Items["+ i +"].CreateTime"));
			moduleItem.setTargetAppSource(_ctx.stringValue("ListAppModulesResponse.Data.Items["+ i +"].TargetAppSource"));

			items.add(moduleItem);
		}
		data.setItems(items);
		listAppModulesResponse.setData(data);
	 
	 	return listAppModulesResponse;
	}
}