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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.ListIdpDepartmentsResponse;
import com.aliyuncs.csas.model.v20230120.ListIdpDepartmentsResponse.Data;
import com.aliyuncs.csas.model.v20230120.ListIdpDepartmentsResponse.Data.DataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIdpDepartmentsResponseUnmarshaller {

	public static ListIdpDepartmentsResponse unmarshall(ListIdpDepartmentsResponse listIdpDepartmentsResponse, UnmarshallerContext _ctx) {
		
		listIdpDepartmentsResponse.setRequestId(_ctx.stringValue("ListIdpDepartmentsResponse.RequestId"));

		Data data = new Data();
		data.setTotalNum(_ctx.longValue("ListIdpDepartmentsResponse.Data.TotalNum"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListIdpDepartmentsResponse.Data.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setId(_ctx.stringValue("ListIdpDepartmentsResponse.Data.DataList["+ i +"].Id"));
			dataListItem.setName(_ctx.stringValue("ListIdpDepartmentsResponse.Data.DataList["+ i +"].Name"));
			dataListItem.setIdpConfigId(_ctx.stringValue("ListIdpDepartmentsResponse.Data.DataList["+ i +"].IdpConfigId"));

			dataList.add(dataListItem);
		}
		data.setDataList(dataList);
		listIdpDepartmentsResponse.setData(data);
	 
	 	return listIdpDepartmentsResponse;
	}
}