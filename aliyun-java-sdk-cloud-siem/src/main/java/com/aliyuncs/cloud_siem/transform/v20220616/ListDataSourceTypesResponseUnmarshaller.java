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

import com.aliyuncs.cloud_siem.model.v20220616.ListDataSourceTypesResponse;
import com.aliyuncs.cloud_siem.model.v20220616.ListDataSourceTypesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataSourceTypesResponseUnmarshaller {

	public static ListDataSourceTypesResponse unmarshall(ListDataSourceTypesResponse listDataSourceTypesResponse, UnmarshallerContext _ctx) {
		
		listDataSourceTypesResponse.setRequestId(_ctx.stringValue("ListDataSourceTypesResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSourceTypesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDataSourceType(_ctx.stringValue("ListDataSourceTypesResponse.Data["+ i +"].DataSourceType"));
			dataItem.setCloudCode(_ctx.stringValue("ListDataSourceTypesResponse.Data["+ i +"].CloudCode"));

			data.add(dataItem);
		}
		listDataSourceTypesResponse.setData(data);
	 
	 	return listDataSourceTypesResponse;
	}
}