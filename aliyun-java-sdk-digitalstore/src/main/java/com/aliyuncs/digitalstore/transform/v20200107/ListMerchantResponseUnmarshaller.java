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

import com.aliyuncs.digitalstore.model.v20200107.ListMerchantResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListMerchantResponse.Data;
import com.aliyuncs.digitalstore.model.v20200107.ListMerchantResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMerchantResponseUnmarshaller {

	public static ListMerchantResponse unmarshall(ListMerchantResponse listMerchantResponse, UnmarshallerContext _ctx) {
		
		listMerchantResponse.setRequestId(_ctx.stringValue("ListMerchantResponse.RequestId"));
		listMerchantResponse.setSuccess(_ctx.booleanValue("ListMerchantResponse.Success"));
		listMerchantResponse.setPageSize(_ctx.stringValue("ListMerchantResponse.PageSize"));
		listMerchantResponse.setPageNumber(_ctx.stringValue("ListMerchantResponse.PageNumber"));
		listMerchantResponse.setTotalCount(_ctx.integerValue("ListMerchantResponse.TotalCount"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("ListMerchantResponse.Data.PageSize"));
		data.setPageNumber(_ctx.integerValue("ListMerchantResponse.Data.PageNumber"));
		data.setTotalCount(_ctx.integerValue("ListMerchantResponse.Data.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMerchantResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setMerchantId(_ctx.longValue("ListMerchantResponse.Data.List["+ i +"].MerchantId"));
			listItem.setName(_ctx.stringValue("ListMerchantResponse.Data.List["+ i +"].Name"));
			listItem.setType(_ctx.integerValue("ListMerchantResponse.Data.List["+ i +"].Type"));
			listItem.setCompany(_ctx.stringValue("ListMerchantResponse.Data.List["+ i +"].Company"));
			listItem.setPhone(_ctx.stringValue("ListMerchantResponse.Data.List["+ i +"].Phone"));
			listItem.setAddress(_ctx.stringValue("ListMerchantResponse.Data.List["+ i +"].Address"));
			listItem.setEmail(_ctx.stringValue("ListMerchantResponse.Data.List["+ i +"].Email"));
			listItem.setStatus(_ctx.integerValue("ListMerchantResponse.Data.List["+ i +"].Status"));
			listItem.setRemark(_ctx.stringValue("ListMerchantResponse.Data.List["+ i +"].Remark"));

			list.add(listItem);
		}
		data.setList(list);
		listMerchantResponse.setData(data);
	 
	 	return listMerchantResponse;
	}
}