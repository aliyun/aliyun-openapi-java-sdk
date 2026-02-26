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

import com.aliyuncs.miniapplcdp.model.v20200113.CreateAppResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.CreateAppResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.CreateAppResponse.Data.CategoryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppResponseUnmarshaller {

	public static CreateAppResponse unmarshall(CreateAppResponse createAppResponse, UnmarshallerContext _ctx) {
		
		createAppResponse.setRequestId(_ctx.stringValue("CreateAppResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("CreateAppResponse.Data.AppId"));
		data.setDescription(_ctx.stringValue("CreateAppResponse.Data.Description"));
		data.setCreateTime(_ctx.stringValue("CreateAppResponse.Data.CreateTime"));
		data.setModifiedTime(_ctx.stringValue("CreateAppResponse.Data.ModifiedTime"));
		data.setIcon(_ctx.stringValue("CreateAppResponse.Data.Icon"));
		data.setIsTemplate(_ctx.booleanValue("CreateAppResponse.Data.IsTemplate"));
		data.setLastEditTime(_ctx.stringValue("CreateAppResponse.Data.LastEditTime"));
		data.setMainModuleId(_ctx.stringValue("CreateAppResponse.Data.MainModuleId"));
		data.setAppName(_ctx.stringValue("CreateAppResponse.Data.AppName"));
		data.setSchemaVersion(_ctx.stringValue("CreateAppResponse.Data.SchemaVersion"));
		data.setSource(_ctx.stringValue("CreateAppResponse.Data.Source"));
		data.setAppStatus(_ctx.stringValue("CreateAppResponse.Data.AppStatus"));
		data.setAppType(_ctx.stringValue("CreateAppResponse.Data.AppType"));
		data.setPlatformVersion(_ctx.stringValue("CreateAppResponse.Data.PlatformVersion"));

		List<CategoryItem> categories = new ArrayList<CategoryItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateAppResponse.Data.Categories.Length"); i++) {
			CategoryItem categoryItem = new CategoryItem();
			categoryItem.setCategoryId(_ctx.stringValue("CreateAppResponse.Data.Categories["+ i +"].CategoryId"));
			categoryItem.setCategoryName(_ctx.stringValue("CreateAppResponse.Data.Categories["+ i +"].CategoryName"));
			categoryItem.setParentCategoryId(_ctx.stringValue("CreateAppResponse.Data.Categories["+ i +"].ParentCategoryId"));

			categories.add(categoryItem);
		}
		data.setCategories(categories);
		createAppResponse.setData(data);
	 
	 	return createAppResponse;
	}
}