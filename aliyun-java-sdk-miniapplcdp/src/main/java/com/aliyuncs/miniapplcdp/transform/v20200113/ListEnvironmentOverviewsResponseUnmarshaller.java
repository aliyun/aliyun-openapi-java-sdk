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

import com.aliyuncs.miniapplcdp.model.v20200113.ListEnvironmentOverviewsResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListEnvironmentOverviewsResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListEnvironmentOverviewsResponse.Data.EnvironmentItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnvironmentOverviewsResponseUnmarshaller {

	public static ListEnvironmentOverviewsResponse unmarshall(ListEnvironmentOverviewsResponse listEnvironmentOverviewsResponse, UnmarshallerContext _ctx) {
		
		listEnvironmentOverviewsResponse.setRequestId(_ctx.stringValue("ListEnvironmentOverviewsResponse.RequestId"));

		Data data = new Data();

		List<EnvironmentItem> items = new ArrayList<EnvironmentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEnvironmentOverviewsResponse.Data.Items.Length"); i++) {
			EnvironmentItem environmentItem = new EnvironmentItem();
			environmentItem.setModifiedTime(_ctx.stringValue("ListEnvironmentOverviewsResponse.Data.Items["+ i +"].ModifiedTime"));
			environmentItem.setEnvStatus(_ctx.stringValue("ListEnvironmentOverviewsResponse.Data.Items["+ i +"].EnvStatus"));
			environmentItem.setCurrentPublish(_ctx.mapValue("ListEnvironmentOverviewsResponse.Data.Items["+ i +"].CurrentPublish"));
			environmentItem.setOpsRecord(_ctx.mapValue("ListEnvironmentOverviewsResponse.Data.Items["+ i +"].OpsRecord"));
			environmentItem.setCreateTime(_ctx.stringValue("ListEnvironmentOverviewsResponse.Data.Items["+ i +"].CreateTime"));
			environmentItem.setAppId(_ctx.stringValue("ListEnvironmentOverviewsResponse.Data.Items["+ i +"].AppId"));
			environmentItem.setEndpoint(_ctx.stringValue("ListEnvironmentOverviewsResponse.Data.Items["+ i +"].Endpoint"));
			environmentItem.setPublishing(_ctx.mapValue("ListEnvironmentOverviewsResponse.Data.Items["+ i +"].Publishing"));
			environmentItem.setEnvId(_ctx.stringValue("ListEnvironmentOverviewsResponse.Data.Items["+ i +"].EnvId"));
			environmentItem.setConfig(_ctx.mapValue("ListEnvironmentOverviewsResponse.Data.Items["+ i +"].Config"));
			environmentItem.setEnvType(_ctx.stringValue("ListEnvironmentOverviewsResponse.Data.Items["+ i +"].EnvType"));

			items.add(environmentItem);
		}
		data.setItems(items);
		listEnvironmentOverviewsResponse.setData(data);
	 
	 	return listEnvironmentOverviewsResponse;
	}
}