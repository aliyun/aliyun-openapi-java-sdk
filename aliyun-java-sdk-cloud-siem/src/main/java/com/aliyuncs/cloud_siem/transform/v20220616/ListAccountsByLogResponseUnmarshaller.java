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

import com.aliyuncs.cloud_siem.model.v20220616.ListAccountsByLogResponse;
import com.aliyuncs.cloud_siem.model.v20220616.ListAccountsByLogResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccountsByLogResponseUnmarshaller {

	public static ListAccountsByLogResponse unmarshall(ListAccountsByLogResponse listAccountsByLogResponse, UnmarshallerContext _ctx) {
		
		listAccountsByLogResponse.setRequestId(_ctx.stringValue("ListAccountsByLogResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAccountsByLogResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSubUserId(_ctx.longValue("ListAccountsByLogResponse.Data["+ i +"].SubUserId"));
			dataItem.setMainUserId(_ctx.longValue("ListAccountsByLogResponse.Data["+ i +"].MainUserId"));
			dataItem.setAccountId(_ctx.stringValue("ListAccountsByLogResponse.Data["+ i +"].AccountId"));
			dataItem.setAccountName(_ctx.stringValue("ListAccountsByLogResponse.Data["+ i +"].AccountName"));
			dataItem.setImported(_ctx.integerValue("ListAccountsByLogResponse.Data["+ i +"].Imported"));
			dataItem.setLogCode(_ctx.stringValue("ListAccountsByLogResponse.Data["+ i +"].LogCode"));
			dataItem.setProdCode(_ctx.stringValue("ListAccountsByLogResponse.Data["+ i +"].ProdCode"));

			data.add(dataItem);
		}
		listAccountsByLogResponse.setData(data);
	 
	 	return listAccountsByLogResponse;
	}
}