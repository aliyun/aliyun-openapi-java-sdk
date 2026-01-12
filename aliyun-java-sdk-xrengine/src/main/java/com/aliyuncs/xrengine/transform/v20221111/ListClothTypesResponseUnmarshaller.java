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

package com.aliyuncs.xrengine.transform.v20221111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.xrengine.model.v20221111.ListClothTypesResponse;
import com.aliyuncs.xrengine.model.v20221111.ListClothTypesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClothTypesResponseUnmarshaller {

	public static ListClothTypesResponse unmarshall(ListClothTypesResponse listClothTypesResponse, UnmarshallerContext _ctx) {
		
		listClothTypesResponse.setRequestId(_ctx.stringValue("ListClothTypesResponse.RequestId"));
		listClothTypesResponse.setSuccess(_ctx.booleanValue("ListClothTypesResponse.Success"));
		listClothTypesResponse.setCode(_ctx.stringValue("ListClothTypesResponse.Code"));
		listClothTypesResponse.setMessage(_ctx.stringValue("ListClothTypesResponse.Message"));
		listClothTypesResponse.setErrorName(_ctx.stringValue("ListClothTypesResponse.ErrorName"));
		listClothTypesResponse.setHttpCode(_ctx.integerValue("ListClothTypesResponse.HttpCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClothTypesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setType(_ctx.stringValue("ListClothTypesResponse.Data["+ i +"].Type"));
			dataItem.setName(_ctx.stringValue("ListClothTypesResponse.Data["+ i +"].Name"));

			data.add(dataItem);
		}
		listClothTypesResponse.setData(data);
	 
	 	return listClothTypesResponse;
	}
}