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

package com.aliyuncs.digitalstore.transform.v20200107;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.digitalstore.model.v20200107.ListApisResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListApisResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApisResponseUnmarshaller {

	public static ListApisResponse unmarshall(ListApisResponse listApisResponse, UnmarshallerContext _ctx) {
		
		listApisResponse.setRequestId(_ctx.stringValue("ListApisResponse.RequestId"));
		listApisResponse.setSuccess(_ctx.booleanValue("ListApisResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListApisResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("ListApisResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("ListApisResponse.Data["+ i +"].Name"));
			dataItem.setCode(_ctx.stringValue("ListApisResponse.Data["+ i +"].Code"));
			dataItem.setStatus(_ctx.integerValue("ListApisResponse.Data["+ i +"].Status"));
			dataItem.setType(_ctx.integerValue("ListApisResponse.Data["+ i +"].Type"));
			dataItem.setUrl(_ctx.stringValue("ListApisResponse.Data["+ i +"].Url"));

			data.add(dataItem);
		}
		listApisResponse.setData(data);
	 
	 	return listApisResponse;
	}
}