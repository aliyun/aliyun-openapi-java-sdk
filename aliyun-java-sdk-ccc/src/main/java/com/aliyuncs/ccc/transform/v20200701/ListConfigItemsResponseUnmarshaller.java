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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListConfigItemsResponse;
import com.aliyuncs.ccc.model.v20200701.ListConfigItemsResponse.ConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConfigItemsResponseUnmarshaller {

	public static ListConfigItemsResponse unmarshall(ListConfigItemsResponse listConfigItemsResponse, UnmarshallerContext _ctx) {
		
		listConfigItemsResponse.setRequestId(_ctx.stringValue("ListConfigItemsResponse.RequestId"));
		listConfigItemsResponse.setCode(_ctx.stringValue("ListConfigItemsResponse.Code"));
		listConfigItemsResponse.setHttpStatusCode(_ctx.integerValue("ListConfigItemsResponse.HttpStatusCode"));
		listConfigItemsResponse.setMessage(_ctx.stringValue("ListConfigItemsResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListConfigItemsResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ListConfigItemsResponse.Params["+ i +"]"));
		}
		listConfigItemsResponse.setParams(params);

		List<ConfigItem> data = new ArrayList<ConfigItem>();
		for (int i = 0; i < _ctx.lengthValue("ListConfigItemsResponse.Data.Length"); i++) {
			ConfigItem configItem = new ConfigItem();
			configItem.setInstanceId(_ctx.stringValue("ListConfigItemsResponse.Data["+ i +"].InstanceId"));
			configItem.setName(_ctx.stringValue("ListConfigItemsResponse.Data["+ i +"].Name"));
			configItem.setObjectId(_ctx.stringValue("ListConfigItemsResponse.Data["+ i +"].ObjectId"));
			configItem.setObjectType(_ctx.stringValue("ListConfigItemsResponse.Data["+ i +"].ObjectType"));
			configItem.setValue(_ctx.stringValue("ListConfigItemsResponse.Data["+ i +"].Value"));

			data.add(configItem);
		}
		listConfigItemsResponse.setData(data);
	 
	 	return listConfigItemsResponse;
	}
}