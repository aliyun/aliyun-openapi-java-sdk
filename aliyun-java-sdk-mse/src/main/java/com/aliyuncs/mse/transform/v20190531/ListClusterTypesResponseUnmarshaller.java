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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListClusterTypesResponse;
import com.aliyuncs.mse.model.v20190531.ListClusterTypesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterTypesResponseUnmarshaller {

	public static ListClusterTypesResponse unmarshall(ListClusterTypesResponse listClusterTypesResponse, UnmarshallerContext _ctx) {
		
		listClusterTypesResponse.setRequestId(_ctx.stringValue("ListClusterTypesResponse.RequestId"));
		listClusterTypesResponse.setHttpStatusCode(_ctx.integerValue("ListClusterTypesResponse.HttpStatusCode"));
		listClusterTypesResponse.setSuccess(_ctx.booleanValue("ListClusterTypesResponse.Success"));
		listClusterTypesResponse.setErrorCode(_ctx.stringValue("ListClusterTypesResponse.ErrorCode"));
		listClusterTypesResponse.setCode(_ctx.integerValue("ListClusterTypesResponse.Code"));
		listClusterTypesResponse.setMessage(_ctx.stringValue("ListClusterTypesResponse.Message"));
		listClusterTypesResponse.setDynamicMessage(_ctx.stringValue("ListClusterTypesResponse.DynamicMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterTypesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCode(_ctx.stringValue("ListClusterTypesResponse.Data["+ i +"].Code"));
			dataItem.setShowName(_ctx.stringValue("ListClusterTypesResponse.Data["+ i +"].ShowName"));

			data.add(dataItem);
		}
		listClusterTypesResponse.setData(data);
	 
	 	return listClusterTypesResponse;
	}
}