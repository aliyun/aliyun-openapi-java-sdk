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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openanalytics_open.model.v20180619.ListResourcesSpecResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.ListResourcesSpecResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourcesSpecResponseUnmarshaller {

	public static ListResourcesSpecResponse unmarshall(ListResourcesSpecResponse listResourcesSpecResponse, UnmarshallerContext _ctx) {
		
		listResourcesSpecResponse.setRequestId(_ctx.stringValue("ListResourcesSpecResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListResourcesSpecResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setName(_ctx.stringValue("ListResourcesSpecResponse.Data["+ i +"].Name"));
			dataItem.setDescription(_ctx.stringValue("ListResourcesSpecResponse.Data["+ i +"].Description"));

			data.add(dataItem);
		}
		listResourcesSpecResponse.setData(data);
	 
	 	return listResourcesSpecResponse;
	}
}