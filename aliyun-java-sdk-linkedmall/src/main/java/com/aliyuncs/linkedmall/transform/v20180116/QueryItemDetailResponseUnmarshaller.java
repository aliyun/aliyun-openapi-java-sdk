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

import com.aliyuncs.linkedmall.model.v20180116.QueryItemDetailResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryItemDetailResponse.Item;
import com.aliyuncs.linkedmall.model.v20180116.QueryItemDetailResponse.Item.Sku;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryItemDetailResponseUnmarshaller {

	public static QueryItemDetailResponse unmarshall(QueryItemDetailResponse queryItemDetailResponse, UnmarshallerContext context) {
		
		queryItemDetailResponse.setRequestId(context.stringValue("QueryItemDetailResponse.RequestId"));
		queryItemDetailResponse.setCode(context.stringValue("QueryItemDetailResponse.Code"));
		queryItemDetailResponse.setMessage(context.stringValue("QueryItemDetailResponse.Message"));
		queryItemDetailResponse.setSubCode(context.stringValue("QueryItemDetailResponse.SubCode"));
		queryItemDetailResponse.setSubMessage(context.stringValue("QueryItemDetailResponse.SubMessage"));
		queryItemDetailResponse.setSuccess(context.booleanValue("QueryItemDetailResponse.Success"));

		Item item = new Item();
		item.setItemId(context.longValue("QueryItemDetailResponse.Item.ItemId"));
		item.setItemTitle(context.stringValue("QueryItemDetailResponse.Item.ItemTitle"));
		item.setMainPicUrl(context.stringValue("QueryItemDetailResponse.Item.MainPicUrl"));
		item.setDescPath(context.stringValue("QueryItemDetailResponse.Item.DescPath"));
		item.setMinPrice(context.longValue("QueryItemDetailResponse.Item.MinPrice"));
		item.setMinPoints(context.longValue("QueryItemDetailResponse.Item.MinPoints"));
		item.setReservePrice(context.longValue("QueryItemDetailResponse.Item.ReservePrice"));
		item.setQuantity(context.integerValue("QueryItemDetailResponse.Item.Quantity"));
		item.setIsSellerPayPostfee(context.booleanValue("QueryItemDetailResponse.Item.IsSellerPayPostfee"));
		item.setIsCanSell(context.booleanValue("QueryItemDetailResponse.Item.IsCanSell"));
		item.setTotalSoldQuantity(context.integerValue("QueryItemDetailResponse.Item.TotalSoldQuantity"));
		item.setProperties(context.stringValue("QueryItemDetailResponse.Item.Properties"));
		item.setCanSell(context.booleanValue("QueryItemDetailResponse.Item.CanSell"));
		item.setSellerPayPostfee(context.booleanValue("QueryItemDetailResponse.Item.SellerPayPostfee"));
		item.setCategoryId(context.longValue("QueryItemDetailResponse.Item.CategoryId"));
		item.setExtJson(context.stringValue("QueryItemDetailResponse.Item.ExtJson"));
		item.setPropertiesJson(context.stringValue("QueryItemDetailResponse.Item.PropertiesJson"));
		item.setIforestPropsJson(context.stringValue("QueryItemDetailResponse.Item.IforestPropsJson"));
		item.setDescOption(context.stringValue("QueryItemDetailResponse.Item.DescOption"));
		item.setIforestProps(context.stringValue("QueryItemDetailResponse.Item.IforestProps"));
		item.setSellerId(context.longValue("QueryItemDetailResponse.Item.SellerId"));
		item.setTbShopName(context.stringValue("QueryItemDetailResponse.Item.TbShopName"));

		List<String> itemImages = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryItemDetailResponse.Item.ItemImages.Length"); i++) {
			itemImages.add(context.stringValue("QueryItemDetailResponse.Item.ItemImages["+ i +"]"));
		}
		item.setItemImages(itemImages);

		List<Sku> skus = new ArrayList<Sku>();
		for (int i = 0; i < context.lengthValue("QueryItemDetailResponse.Item.Skus.Length"); i++) {
			Sku sku = new Sku();
			sku.setExtJson(context.stringValue("QueryItemDetailResponse.Item.Skus["+ i +"].ExtJson"));
			sku.setItemId(context.longValue("QueryItemDetailResponse.Item.Skus["+ i +"].ItemId"));
			sku.setSkuId(context.longValue("QueryItemDetailResponse.Item.Skus["+ i +"].SkuId"));
			sku.setSkuProperties(context.stringValue("QueryItemDetailResponse.Item.Skus["+ i +"].SkuProperties"));
			sku.setSkuPicUrl(context.stringValue("QueryItemDetailResponse.Item.Skus["+ i +"].SkuPicUrl"));
			sku.setSkuTitle(context.stringValue("QueryItemDetailResponse.Item.Skus["+ i +"].SkuTitle"));
			sku.setQuantity(context.integerValue("QueryItemDetailResponse.Item.Skus["+ i +"].Quantity"));
			sku.setPriceCent(context.longValue("QueryItemDetailResponse.Item.Skus["+ i +"].PriceCent"));
			sku.setPoints(context.longValue("QueryItemDetailResponse.Item.Skus["+ i +"].Points"));
			sku.setPointsAmount(context.longValue("QueryItemDetailResponse.Item.Skus["+ i +"].PointsAmount"));
			sku.setPointPrice(context.longValue("QueryItemDetailResponse.Item.Skus["+ i +"].PointPrice"));
			sku.setSkuPropertiesJson(context.stringValue("QueryItemDetailResponse.Item.Skus["+ i +"].SkuPropertiesJson"));

			skus.add(sku);
		}
		item.setSkus(skus);
		queryItemDetailResponse.setItem(item);
	 
	 	return queryItemDetailResponse;
	}
}