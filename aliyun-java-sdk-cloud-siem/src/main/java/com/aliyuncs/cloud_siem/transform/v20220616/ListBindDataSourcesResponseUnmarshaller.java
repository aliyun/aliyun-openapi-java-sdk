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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.ListBindDataSourcesResponse;
import com.aliyuncs.cloud_siem.model.v20220616.ListBindDataSourcesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBindDataSourcesResponseUnmarshaller {

	public static ListBindDataSourcesResponse unmarshall(ListBindDataSourcesResponse listBindDataSourcesResponse, UnmarshallerContext _ctx) {
		
		listBindDataSourcesResponse.setRequestId(_ctx.stringValue("ListBindDataSourcesResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBindDataSourcesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAccountName(_ctx.stringValue("ListBindDataSourcesResponse.Data["+ i +"].AccountName"));
			dataItem.setDataSourceInstanceId(_ctx.stringValue("ListBindDataSourcesResponse.Data["+ i +"].DataSourceInstanceId"));
			dataItem.setDataSourceType(_ctx.stringValue("ListBindDataSourcesResponse.Data["+ i +"].DataSourceType"));
			dataItem.setDataSourceName(_ctx.stringValue("ListBindDataSourcesResponse.Data["+ i +"].DataSourceName"));
			dataItem.setDataSourceRemark(_ctx.stringValue("ListBindDataSourcesResponse.Data["+ i +"].DataSourceRemark"));
			dataItem.setLogCount(_ctx.integerValue("ListBindDataSourcesResponse.Data["+ i +"].LogCount"));
			dataItem.setTaskCount(_ctx.integerValue("ListBindDataSourcesResponse.Data["+ i +"].TaskCount"));
			dataItem.setAccountId(_ctx.stringValue("ListBindDataSourcesResponse.Data["+ i +"].AccountId"));
			dataItem.setCloudCode(_ctx.stringValue("ListBindDataSourcesResponse.Data["+ i +"].CloudCode"));

			data.add(dataItem);
		}
		listBindDataSourcesResponse.setData(data);
	 
	 	return listBindDataSourcesResponse;
	}
}