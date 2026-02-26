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

import com.aliyuncs.miniapplcdp.model.v20200113.GetAppResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetAppResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.GetAppResponse.Data.CategoryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppResponseUnmarshaller {

	public static GetAppResponse unmarshall(GetAppResponse getAppResponse, UnmarshallerContext _ctx) {
		
		getAppResponse.setRequestId(_ctx.stringValue("GetAppResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("GetAppResponse.Data.AppId"));
		data.setDescription(_ctx.stringValue("GetAppResponse.Data.Description"));
		data.setCreateTime(_ctx.stringValue("GetAppResponse.Data.CreateTime"));
		data.setModifiedTime(_ctx.stringValue("GetAppResponse.Data.ModifiedTime"));
		data.setIcon(_ctx.stringValue("GetAppResponse.Data.Icon"));
		data.setIsTemplate(_ctx.booleanValue("GetAppResponse.Data.IsTemplate"));
		data.setLastEditTime(_ctx.stringValue("GetAppResponse.Data.LastEditTime"));
		data.setMainModuleId(_ctx.stringValue("GetAppResponse.Data.MainModuleId"));
		data.setAppName(_ctx.stringValue("GetAppResponse.Data.AppName"));
		data.setSchemaVersion(_ctx.stringValue("GetAppResponse.Data.SchemaVersion"));
		data.setSource(_ctx.stringValue("GetAppResponse.Data.Source"));
		data.setAppStatus(_ctx.stringValue("GetAppResponse.Data.AppStatus"));
		data.setAppType(_ctx.stringValue("GetAppResponse.Data.AppType"));
		data.setPlatformVersion(_ctx.stringValue("GetAppResponse.Data.PlatformVersion"));

		List<CategoryItem> categories = new ArrayList<CategoryItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppResponse.Data.Categories.Length"); i++) {
			CategoryItem categoryItem = new CategoryItem();
			categoryItem.setCategoryId(_ctx.stringValue("GetAppResponse.Data.Categories["+ i +"].CategoryId"));
			categoryItem.setCategoryName(_ctx.stringValue("GetAppResponse.Data.Categories["+ i +"].CategoryName"));
			categoryItem.setParentCategoryId(_ctx.stringValue("GetAppResponse.Data.Categories["+ i +"].ParentCategoryId"));

			categories.add(categoryItem);
		}
		data.setCategories(categories);
		getAppResponse.setData(data);
	 
	 	return getAppResponse;
	}
}