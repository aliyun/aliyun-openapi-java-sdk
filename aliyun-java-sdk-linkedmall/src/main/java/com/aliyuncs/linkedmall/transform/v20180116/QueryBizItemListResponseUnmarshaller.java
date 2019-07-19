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

	public static QueryBizItemListResponse unmarshall(QueryBizItemListResponse queryBizItemListResponse, UnmarshallerContext _ctx) {
		
		queryBizItemListResponse.setRequestId(_ctx.stringValue("QueryBizItemListResponse.RequestId"));
		queryBizItemListResponse.setCode(_ctx.stringValue("QueryBizItemListResponse.Code"));
		queryBizItemListResponse.setMessage(_ctx.stringValue("QueryBizItemListResponse.Message"));
		queryBizItemListResponse.setTotalCount(_ctx.integerValue("QueryBizItemListResponse.TotalCount"));
		queryBizItemListResponse.setPageNumber(_ctx.integerValue("QueryBizItemListResponse.PageNumber"));
		queryBizItemListResponse.setPageSize(_ctx.integerValue("QueryBizItemListResponse.PageSize"));

		List<Item> itemList = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryBizItemListResponse.ItemList.Length"); i++) {
			Item item = new Item();
			item.setItemId(_ctx.longValue("QueryBizItemListResponse.ItemList["+ i +"].ItemId"));
			item.setItemTitle(_ctx.stringValue("QueryBizItemListResponse.ItemList["+ i +"].ItemTitle"));
			item.setCustomizedItemName(_ctx.stringValue("QueryBizItemListResponse.ItemList["+ i +"].CustomizedItemName"));
			item.setMainPicUrl(_ctx.stringValue("QueryBizItemListResponse.ItemList["+ i +"].MainPicUrl"));
			item.setReservePrice(_ctx.longValue("QueryBizItemListResponse.ItemList["+ i +"].ReservePrice"));
			item.setCategoryId(_ctx.longValue("QueryBizItemListResponse.ItemList["+ i +"].CategoryId"));
			item.setCanSell(_ctx.booleanValue("QueryBizItemListResponse.ItemList["+ i +"].CanSell"));
			item.setTaobaoShopName(_ctx.stringValue("QueryBizItemListResponse.ItemList["+ i +"].TaobaoShopName"));
			item.setExtJson(_ctx.stringValue("QueryBizItemListResponse.ItemList["+ i +"].ExtJson"));
			item.setSellerId(_ctx.longValue("QueryBizItemListResponse.ItemList["+ i +"].SellerId"));

			List<Sku> skuList = new ArrayList<Sku>();
			for (int j = 0; j < _ctx.lengthValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList.Length"); j++) {
				Sku sku = new Sku();
				sku.setSkuId(_ctx.longValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].SkuId"));
				sku.setSkuPicUrl(_ctx.stringValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].SkuPicUrl"));
				sku.setSkuTitle(_ctx.stringValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].SkuTitle"));
				sku.setPriceCent(_ctx.longValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].PriceCent"));
				sku.setPoints(_ctx.longValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].Points"));
				sku.setPointsAmount(_ctx.longValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].PointsAmount"));
				sku.setBenefitId(_ctx.stringValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].BenefitId"));
				sku.setCanSell(_ctx.booleanValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].CanSell"));

				skuList.add(sku);
			}
			item.setSkuList(skuList);

			itemList.add(item);
		}
		queryBizItemListResponse.setItemList(itemList);
	 
	 	return queryBizItemListResponse;
	}
}