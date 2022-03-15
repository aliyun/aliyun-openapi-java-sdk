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

import com.aliyuncs.miniapplcdp.model.v20200113.ListModulesByPageResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListModulesByPageResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListModulesByPageResponse.Data.ModuleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListModulesByPageResponseUnmarshaller {

	public static ListModulesByPageResponse unmarshall(ListModulesByPageResponse listModulesByPageResponse, UnmarshallerContext _ctx) {
		
		listModulesByPageResponse.setRequestId(_ctx.stringValue("ListModulesByPageResponse.RequestId"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListModulesByPageResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListModulesByPageResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListModulesByPageResponse.Data.TotalCount"));

		List<ModuleItem> items = new ArrayList<ModuleItem>();
		for (int i = 0; i < _ctx.lengthValue("ListModulesByPageResponse.Data.Items.Length"); i++) {
			ModuleItem moduleItem = new ModuleItem();
			moduleItem.setDescription(_ctx.stringValue("ListModulesByPageResponse.Data.Items["+ i +"].Description"));
			moduleItem.setCreateTime(_ctx.stringValue("ListModulesByPageResponse.Data.Items["+ i +"].CreateTime"));
			moduleItem.setModifiedTime(_ctx.stringValue("ListModulesByPageResponse.Data.Items["+ i +"].ModifiedTime"));
			moduleItem.setIcon(_ctx.stringValue("ListModulesByPageResponse.Data.Items["+ i +"].Icon"));
			moduleItem.setLatestPublishedCommit(_ctx.stringValue("ListModulesByPageResponse.Data.Items["+ i +"].LatestPublishedCommit"));
			moduleItem.setLatestPublishedVersion(_ctx.stringValue("ListModulesByPageResponse.Data.Items["+ i +"].LatestPublishedVersion"));
			moduleItem.setMinimumPlatformVersion(_ctx.stringValue("ListModulesByPageResponse.Data.Items["+ i +"].MinimumPlatformVersion"));
			moduleItem.setModuleId(_ctx.stringValue("ListModulesByPageResponse.Data.Items["+ i +"].ModuleId"));
			moduleItem.setModuleName(_ctx.stringValue("ListModulesByPageResponse.Data.Items["+ i +"].ModuleName"));
			moduleItem.setOwnerUserId(_ctx.stringValue("ListModulesByPageResponse.Data.Items["+ i +"].OwnerUserId"));
			moduleItem.setPlatform(_ctx.stringValue("ListModulesByPageResponse.Data.Items["+ i +"].Platform"));

			items.add(moduleItem);
		}
		data.setItems(items);
		listModulesByPageResponse.setData(data);
	 
	 	return listModulesByPageResponse;
	}
}