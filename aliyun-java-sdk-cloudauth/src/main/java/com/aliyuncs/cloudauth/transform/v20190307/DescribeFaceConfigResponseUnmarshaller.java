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

package com.aliyuncs.cloudauth.transform.v20190307;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth.model.v20190307.DescribeFaceConfigResponse;
import com.aliyuncs.cloudauth.model.v20190307.DescribeFaceConfigResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFaceConfigResponseUnmarshaller {

	public static DescribeFaceConfigResponse unmarshall(DescribeFaceConfigResponse describeFaceConfigResponse, UnmarshallerContext _ctx) {
		
		describeFaceConfigResponse.setRequestId(_ctx.stringValue("DescribeFaceConfigResponse.RequestId"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFaceConfigResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setBizType(_ctx.stringValue("DescribeFaceConfigResponse.Items["+ i +"].BizType"));
			itemsItem.setBizName(_ctx.stringValue("DescribeFaceConfigResponse.Items["+ i +"].BizName"));
			itemsItem.setGmtUpdated(_ctx.longValue("DescribeFaceConfigResponse.Items["+ i +"].GmtUpdated"));

			items.add(itemsItem);
		}
		describeFaceConfigResponse.setItems(items);
	 
	 	return describeFaceConfigResponse;
	}
}