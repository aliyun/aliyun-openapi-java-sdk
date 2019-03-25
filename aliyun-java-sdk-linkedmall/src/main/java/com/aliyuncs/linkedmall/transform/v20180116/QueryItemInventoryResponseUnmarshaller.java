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

import com.aliyuncs.linkedmall.model.v20180116.QueryItemInventoryResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryItemInventoryResponse.Item;
import com.aliyuncs.linkedmall.model.v20180116.QueryItemInventoryResponse.Item.Sku;
import com.aliyuncs.linkedmall.model.v20180116.QueryItemInventoryResponse.Item.Sku.Inventory;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryItemInventoryResponseUnmarshaller {

	public static QueryItemInventoryResponse unmarshall(QueryItemInventoryResponse queryItemInventoryResponse, UnmarshallerContext context) {
		
		queryItemInventoryResponse.setRequestId(context.stringValue("QueryItemInventoryResponse.RequestId"));
		queryItemInventoryResponse.setCode(context.stringValue("QueryItemInventoryResponse.Code"));
		queryItemInventoryResponse.setMessage(context.stringValue("QueryItemInventoryResponse.Message"));
		queryItemInventoryResponse.setSubCode(context.stringValue("QueryItemInventoryResponse.SubCode"));
		queryItemInventoryResponse.setSubMessage(context.stringValue("QueryItemInventoryResponse.SubMessage"));
		queryItemInventoryResponse.setSuccess(context.booleanValue("QueryItemInventoryResponse.Success"));

		List<Item> itemList = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("QueryItemInventoryResponse.ItemList.Length"); i++) {
			Item item = new Item();
			item.setItemId(context.longValue("QueryItemInventoryResponse.ItemList["+ i +"].ItemId"));

			List<Sku> skuList = new ArrayList<Sku>();
			for (int j = 0; j < context.lengthValue("QueryItemInventoryResponse.ItemList["+ i +"].SkuList.Length"); j++) {
				Sku sku = new Sku();
				sku.setSkuId(context.longValue("QueryItemInventoryResponse.ItemList["+ i +"].SkuList["+ j +"].SkuId"));

				Inventory inventory = new Inventory();
				inventory.setQuantity(context.longValue("QueryItemInventoryResponse.ItemList["+ i +"].SkuList["+ j +"].Inventory.Quantity"));
				sku.setInventory(inventory);

				skuList.add(sku);
			}
			item.setSkuList(skuList);

			itemList.add(item);
		}
		queryItemInventoryResponse.setItemList(itemList);
	 
	 	return queryItemInventoryResponse;
	}
}