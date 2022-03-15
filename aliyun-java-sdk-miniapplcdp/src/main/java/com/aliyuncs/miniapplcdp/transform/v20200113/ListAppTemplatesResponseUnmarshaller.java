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

import com.aliyuncs.miniapplcdp.model.v20200113.ListAppTemplatesResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListAppTemplatesResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListAppTemplatesResponse.Data.AppItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppTemplatesResponseUnmarshaller {

	public static ListAppTemplatesResponse unmarshall(ListAppTemplatesResponse listAppTemplatesResponse, UnmarshallerContext _ctx) {
		
		listAppTemplatesResponse.setRequestId(_ctx.stringValue("ListAppTemplatesResponse.RequestId"));

		Data data = new Data();

		List<AppItem> items = new ArrayList<AppItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppTemplatesResponse.Data.Items.Length"); i++) {
			AppItem appItem = new AppItem();
			appItem.setTemplateId(_ctx.stringValue("ListAppTemplatesResponse.Data.Items["+ i +"].TemplateId"));
			appItem.setAppName(_ctx.stringValue("ListAppTemplatesResponse.Data.Items["+ i +"].AppName"));
			appItem.setAppType(_ctx.stringValue("ListAppTemplatesResponse.Data.Items["+ i +"].AppType"));
			appItem.setTemplateType(_ctx.stringValue("ListAppTemplatesResponse.Data.Items["+ i +"].TemplateType"));
			appItem.setCategoryName(_ctx.stringValue("ListAppTemplatesResponse.Data.Items["+ i +"].CategoryName"));
			appItem.setDescription(_ctx.stringValue("ListAppTemplatesResponse.Data.Items["+ i +"].Description"));
			appItem.setCreateTime(_ctx.stringValue("ListAppTemplatesResponse.Data.Items["+ i +"].CreateTime"));
			appItem.setModifiedTime(_ctx.stringValue("ListAppTemplatesResponse.Data.Items["+ i +"].ModifiedTime"));
			appItem.setIcon(_ctx.stringValue("ListAppTemplatesResponse.Data.Items["+ i +"].Icon"));
			appItem.setLastEditTime(_ctx.stringValue("ListAppTemplatesResponse.Data.Items["+ i +"].LastEditTime"));
			appItem.setMainModuleId(_ctx.stringValue("ListAppTemplatesResponse.Data.Items["+ i +"].MainModuleId"));
			appItem.setSchemaVersion(_ctx.stringValue("ListAppTemplatesResponse.Data.Items["+ i +"].SchemaVersion"));
			appItem.setSource(_ctx.stringValue("ListAppTemplatesResponse.Data.Items["+ i +"].Source"));

			items.add(appItem);
		}
		data.setItems(items);
		listAppTemplatesResponse.setData(data);
	 
	 	return listAppTemplatesResponse;
	}
}