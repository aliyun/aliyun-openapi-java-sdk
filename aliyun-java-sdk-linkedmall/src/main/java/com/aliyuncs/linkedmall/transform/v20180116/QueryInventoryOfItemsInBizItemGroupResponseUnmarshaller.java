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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.QueryInventoryOfItemsInBizItemGroupResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryInventoryOfItemsInBizItemGroupResponse.Item;
import com.aliyuncs.linkedmall.model.v20180116.QueryInventoryOfItemsInBizItemGroupResponse.Item.Sku;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInventoryOfItemsInBizItemGroupResponseUnmarshaller {

	public static QueryInventoryOfItemsInBizItemGroupResponse unmarshall(QueryInventoryOfItemsInBizItemGroupResponse queryInventoryOfItemsInBizItemGroupResponse, UnmarshallerContext _ctx) {
		
		queryInventoryOfItemsInBizItemGroupResponse.setRequestId(_ctx.stringValue("QueryInventoryOfItemsInBizItemGroupResponse.RequestId"));
		queryInventoryOfItemsInBizItemGroupResponse.setCode(_ctx.stringValue("QueryInventoryOfItemsInBizItemGroupResponse.Code"));
		queryInventoryOfItemsInBizItemGroupResponse.setMessage(_ctx.stringValue("QueryInventoryOfItemsInBizItemGroupResponse.Message"));

		List<Item> itemList = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryInventoryOfItemsInBizItemGroupResponse.ItemList.Length"); i++) {
			Item item = new Item();
			item.setItemId(_ctx.longValue("QueryInventoryOfItemsInBizItemGroupResponse.ItemList["+ i +"].ItemId"));
			item.setLmItemId(_ctx.stringValue("QueryInventoryOfItemsInBizItemGroupResponse.ItemList["+ i +"].LmItemId"));
			item.setQuantity(_ctx.integerValue("QueryInventoryOfItemsInBizItemGroupResponse.ItemList["+ i +"].Quantity"));

			List<Sku> skuList = new ArrayList<Sku>();
			for (int j = 0; j < _ctx.lengthValue("QueryInventoryOfItemsInBizItemGroupResponse.ItemList["+ i +"].SkuList.Length"); j++) {
				Sku sku = new Sku();
				sku.setSkuId(_ctx.longValue("QueryInventoryOfItemsInBizItemGroupResponse.ItemList["+ i +"].SkuList["+ j +"].SkuId"));
				sku.setQuantity(_ctx.integerValue("QueryInventoryOfItemsInBizItemGroupResponse.ItemList["+ i +"].SkuList["+ j +"].Quantity"));

				skuList.add(sku);
			}
			item.setSkuList(skuList);

			itemList.add(item);
		}
		queryInventoryOfItemsInBizItemGroupResponse.setItemList(itemList);
	 
	 	return queryInventoryOfItemsInBizItemGroupResponse;
	}
}