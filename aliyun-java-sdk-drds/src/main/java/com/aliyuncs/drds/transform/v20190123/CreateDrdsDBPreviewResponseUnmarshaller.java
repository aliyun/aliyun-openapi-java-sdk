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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.CreateDrdsDBPreviewResponse;
import com.aliyuncs.drds.model.v20190123.CreateDrdsDBPreviewResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDrdsDBPreviewResponseUnmarshaller {

	public static CreateDrdsDBPreviewResponse unmarshall(CreateDrdsDBPreviewResponse createDrdsDBPreviewResponse, UnmarshallerContext _ctx) {
		
		createDrdsDBPreviewResponse.setRequestId(_ctx.stringValue("CreateDrdsDBPreviewResponse.RequestId"));
		createDrdsDBPreviewResponse.setSuccess(_ctx.booleanValue("CreateDrdsDBPreviewResponse.Success"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("CreateDrdsDBPreviewResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setDbInstanceId(_ctx.stringValue("CreateDrdsDBPreviewResponse.Items["+ i +"].DbInstanceId"));

			List<String> dbNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateDrdsDBPreviewResponse.Items["+ i +"].DbNames.Length"); j++) {
				dbNames.add(_ctx.stringValue("CreateDrdsDBPreviewResponse.Items["+ i +"].DbNames["+ j +"]"));
			}
			item.setDbNames(dbNames);

			items.add(item);
		}
		createDrdsDBPreviewResponse.setItems(items);
	 
	 	return createDrdsDBPreviewResponse;
	}
}