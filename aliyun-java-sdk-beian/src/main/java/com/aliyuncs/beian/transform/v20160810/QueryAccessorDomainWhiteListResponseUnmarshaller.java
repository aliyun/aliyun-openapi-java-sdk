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

package com.aliyuncs.beian.transform.v20160810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.beian.model.v20160810.QueryAccessorDomainWhiteListResponse;
import com.aliyuncs.beian.model.v20160810.QueryAccessorDomainWhiteListResponse.Data;
import com.aliyuncs.beian.model.v20160810.QueryAccessorDomainWhiteListResponse.Data.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAccessorDomainWhiteListResponseUnmarshaller {

	public static QueryAccessorDomainWhiteListResponse unmarshall(QueryAccessorDomainWhiteListResponse queryAccessorDomainWhiteListResponse, UnmarshallerContext _ctx) {
		
		queryAccessorDomainWhiteListResponse.setRequestId(_ctx.stringValue("QueryAccessorDomainWhiteListResponse.RequestId"));
		queryAccessorDomainWhiteListResponse.setCode(_ctx.integerValue("QueryAccessorDomainWhiteListResponse.Code"));
		queryAccessorDomainWhiteListResponse.setMessage(_ctx.stringValue("QueryAccessorDomainWhiteListResponse.Message"));

		Data data = new Data();
		data.setWhite(_ctx.booleanValue("QueryAccessorDomainWhiteListResponse.Data.White"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAccessorDomainWhiteListResponse.Data.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setType(_ctx.stringValue("QueryAccessorDomainWhiteListResponse.Data.Items["+ i +"].Type"));
			itemsItem.setCreateTime(_ctx.stringValue("QueryAccessorDomainWhiteListResponse.Data.Items["+ i +"].CreateTime"));
			itemsItem.setStartTime(_ctx.stringValue("QueryAccessorDomainWhiteListResponse.Data.Items["+ i +"].StartTime"));
			itemsItem.setEndTime(_ctx.stringValue("QueryAccessorDomainWhiteListResponse.Data.Items["+ i +"].EndTime"));
			itemsItem.setValid(_ctx.booleanValue("QueryAccessorDomainWhiteListResponse.Data.Items["+ i +"].Valid"));

			items.add(itemsItem);
		}
		data.setItems(items);
		queryAccessorDomainWhiteListResponse.setData(data);
	 
	 	return queryAccessorDomainWhiteListResponse;
	}
}