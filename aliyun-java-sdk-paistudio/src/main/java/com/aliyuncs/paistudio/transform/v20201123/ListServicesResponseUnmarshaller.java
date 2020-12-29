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

package com.aliyuncs.paistudio.transform.v20201123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paistudio.model.v20201123.ListServicesResponse;
import com.aliyuncs.paistudio.model.v20201123.ListServicesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServicesResponseUnmarshaller {

	public static ListServicesResponse unmarshall(ListServicesResponse listServicesResponse, UnmarshallerContext _ctx) {
		
		listServicesResponse.setRequestId(_ctx.stringValue("ListServicesResponse.RequestId"));
		listServicesResponse.setMessage(_ctx.stringValue("ListServicesResponse.Message"));
		listServicesResponse.setCode(_ctx.stringValue("ListServicesResponse.Code"));
		listServicesResponse.setTotalCount(_ctx.integerValue("ListServicesResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListServicesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setUrl(_ctx.stringValue("ListServicesResponse.Data["+ i +"].Url"));
			dataItem.setServiceId(_ctx.stringValue("ListServicesResponse.Data["+ i +"].ServiceId"));

			data.add(dataItem);
		}
		listServicesResponse.setData(data);
	 
	 	return listServicesResponse;
	}
}