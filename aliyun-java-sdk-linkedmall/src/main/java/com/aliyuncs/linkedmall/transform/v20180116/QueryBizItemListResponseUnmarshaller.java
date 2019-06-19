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

import com.aliyuncs.linkedmall.model.v20180116.QueryBizItemListResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryBizItemListResponse.Item;
import com.aliyuncs.linkedmall.model.v20180116.QueryBizItemListResponse.Item.Sku;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBizItemListResponseUnmarshaller {

	public static QueryBizItemListResponse unmarshall(QueryBizItemListResponse queryBizItemListResponse, UnmarshallerContext context) {
		
		queryBizItemListResponse.setRequestId(context.stringValue("QueryBizItemListResponse.RequestId"));
		queryBizItemListResponse.setCode(context.stringValue("QueryBizItemListResponse.Code"));
		queryBizItemListResponse.setMessage(context.stringValue("QueryBizItemListResponse.Message"));
		queryBizItemListResponse.setTotalCount(context.integerValue("QueryBizItemListResponse.TotalCount"));
		queryBizItemListResponse.setPageNumber(context.integerValue("QueryBizItemListResponse.PageNumber"));
		queryBizItemListResponse.setPageSize(context.integerValue("QueryBizItemListResponse.PageSize"));

		List<Item> itemList = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("QueryBizItemListResponse.ItemList.Length"); i++) {
			Item item = new Item();
			item.setItemId(context.longValue("QueryBizItemListResponse.ItemList["+ i +"].ItemId"));
			item.setItemTitle(context.stringValue("QueryBizItemListResponse.ItemList["+ i +"].ItemTitle"));
			item.setCustomizedItemName(context.stringValue("QueryBizItemListResponse.ItemList["+ i +"].CustomizedItemName"));
			item.setMainPicUrl(context.stringValue("QueryBizItemListResponse.ItemList["+ i +"].MainPicUrl"));
			item.setReservePrice(context.longValue("QueryBizItemListResponse.ItemList["+ i +"].ReservePrice"));
			item.setCategoryId(context.longValue("QueryBizItemListResponse.ItemList["+ i +"].CategoryId"));
			item.setCanSell(context.booleanValue("QueryBizItemListResponse.ItemList["+ i +"].CanSell"));
			item.setTaobaoShopName(context.stringValue("QueryBizItemListResponse.ItemList["+ i +"].TaobaoShopName"));
			item.setExtJson(context.stringValue("QueryBizItemListResponse.ItemList["+ i +"].ExtJson"));
			item.setSellerId(context.longValue("QueryBizItemListResponse.ItemList["+ i +"].SellerId"));

			List<Sku> skuList = new ArrayList<Sku>();
			for (int j = 0; j < context.lengthValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList.Length"); j++) {
				Sku sku = new Sku();
				sku.setSkuId(context.longValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].SkuId"));
				sku.setSkuPicUrl(context.stringValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].SkuPicUrl"));
				sku.setSkuTitle(context.stringValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].SkuTitle"));
				sku.setPriceCent(context.longValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].PriceCent"));
				sku.setPoints(context.longValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].Points"));
				sku.setPointsAmount(context.longValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].PointsAmount"));
				sku.setBenefitId(context.stringValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].BenefitId"));
				sku.setCanSell(context.booleanValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].CanSell"));

				skuList.add(sku);
			}
			item.setSkuList(skuList);

			itemList.add(item);
		}
		queryBizItemListResponse.setItemList(itemList);
	 
	 	return queryBizItemListResponse;
	}
}