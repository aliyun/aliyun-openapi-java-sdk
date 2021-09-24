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

import com.aliyuncs.mse.model.v20190531.ListClusterConnectionTypesResponse;
import com.aliyuncs.mse.model.v20190531.ListClusterConnectionTypesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterConnectionTypesResponseUnmarshaller {

	public static ListClusterConnectionTypesResponse unmarshall(ListClusterConnectionTypesResponse listClusterConnectionTypesResponse, UnmarshallerContext _ctx) {
		
		listClusterConnectionTypesResponse.setRequestId(_ctx.stringValue("ListClusterConnectionTypesResponse.RequestId"));
		listClusterConnectionTypesResponse.setHttpStatusCode(_ctx.integerValue("ListClusterConnectionTypesResponse.HttpStatusCode"));
		listClusterConnectionTypesResponse.setSuccess(_ctx.booleanValue("ListClusterConnectionTypesResponse.Success"));
		listClusterConnectionTypesResponse.setErrorCode(_ctx.stringValue("ListClusterConnectionTypesResponse.ErrorCode"));
		listClusterConnectionTypesResponse.setCode(_ctx.integerValue("ListClusterConnectionTypesResponse.Code"));
		listClusterConnectionTypesResponse.setMessage(_ctx.stringValue("ListClusterConnectionTypesResponse.Message"));
		listClusterConnectionTypesResponse.setDynamicMessage(_ctx.stringValue("ListClusterConnectionTypesResponse.DynamicMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterConnectionTypesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCode(_ctx.stringValue("ListClusterConnectionTypesResponse.Data["+ i +"].Code"));
			dataItem.setShowName(_ctx.stringValue("ListClusterConnectionTypesResponse.Data["+ i +"].ShowName"));

			data.add(dataItem);
		}
		listClusterConnectionTypesResponse.setData(data);
	 
	 	return listClusterConnectionTypesResponse;
	}
}