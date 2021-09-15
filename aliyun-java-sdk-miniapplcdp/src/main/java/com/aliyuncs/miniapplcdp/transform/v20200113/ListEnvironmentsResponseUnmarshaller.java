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

import com.aliyuncs.miniapplcdp.model.v20200113.ListEnvironmentsResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListEnvironmentsResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListEnvironmentsResponse.Data.EnvironmentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnvironmentsResponseUnmarshaller {

	public static ListEnvironmentsResponse unmarshall(ListEnvironmentsResponse listEnvironmentsResponse, UnmarshallerContext _ctx) {
		
		listEnvironmentsResponse.setRequestId(_ctx.stringValue("ListEnvironmentsResponse.RequestId"));

		Data data = new Data();

		List<EnvironmentItem> items = new ArrayList<EnvironmentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEnvironmentsResponse.Data.Items.Length"); i++) {
			EnvironmentItem environmentItem = new EnvironmentItem();
			environmentItem.setCurrentPublishId(_ctx.stringValue("ListEnvironmentsResponse.Data.Items["+ i +"].CurrentPublishId"));
			environmentItem.setModifiedTime(_ctx.stringValue("ListEnvironmentsResponse.Data.Items["+ i +"].ModifiedTime"));
			environmentItem.setAppId(_ctx.stringValue("ListEnvironmentsResponse.Data.Items["+ i +"].AppId"));
			environmentItem.setCreateTime(_ctx.stringValue("ListEnvironmentsResponse.Data.Items["+ i +"].CreateTime"));
			environmentItem.setEndpoint(_ctx.stringValue("ListEnvironmentsResponse.Data.Items["+ i +"].Endpoint"));
			environmentItem.setEnvId(_ctx.stringValue("ListEnvironmentsResponse.Data.Items["+ i +"].EnvId"));
			environmentItem.setEnvType(_ctx.stringValue("ListEnvironmentsResponse.Data.Items["+ i +"].EnvType"));
			environmentItem.setPublishingId(_ctx.stringValue("ListEnvironmentsResponse.Data.Items["+ i +"].PublishingId"));

			items.add(environmentItem);
		}
		data.setItems(items);
		listEnvironmentsResponse.setData(data);
	 
	 	return listEnvironmentsResponse;
	}
}