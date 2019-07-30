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

	public static QueryItemDetailResponse unmarshall(QueryItemDetailResponse queryItemDetailResponse, UnmarshallerContext _ctx) {
		
		queryItemDetailResponse.setRequestId(_ctx.stringValue("QueryItemDetailResponse.RequestId"));
		queryItemDetailResponse.setCode(_ctx.stringValue("QueryItemDetailResponse.Code"));
		queryItemDetailResponse.setMessage(_ctx.stringValue("QueryItemDetailResponse.Message"));
		queryItemDetailResponse.setSubCode(_ctx.stringValue("QueryItemDetailResponse.SubCode"));
		queryItemDetailResponse.setSubMessage(_ctx.stringValue("QueryItemDetailResponse.SubMessage"));
		queryItemDetailResponse.setSuccess(_ctx.booleanValue("QueryItemDetailResponse.Success"));

		Item item = new Item();
		item.setItemId(_ctx.longValue("QueryItemDetailResponse.Item.ItemId"));
		item.setItemTitle(_ctx.stringValue("QueryItemDetailResponse.Item.ItemTitle"));
		item.setMainPicUrl(_ctx.stringValue("QueryItemDetailResponse.Item.MainPicUrl"));
		item.setDescPath(_ctx.stringValue("QueryItemDetailResponse.Item.DescPath"));
		item.setMinPrice(_ctx.longValue("QueryItemDetailResponse.Item.MinPrice"));
		item.setMinPoints(_ctx.longValue("QueryItemDetailResponse.Item.MinPoints"));
		item.setReservePrice(_ctx.longValue("QueryItemDetailResponse.Item.ReservePrice"));
		item.setQuantity(_ctx.integerValue("QueryItemDetailResponse.Item.Quantity"));
		item.setIsSellerPayPostfee(_ctx.booleanValue("QueryItemDetailResponse.Item.IsSellerPayPostfee"));
		item.setIsCanSell(_ctx.booleanValue("QueryItemDetailResponse.Item.IsCanSell"));
		item.setTotalSoldQuantity(_ctx.integerValue("QueryItemDetailResponse.Item.TotalSoldQuantity"));
		item.setProperties(_ctx.stringValue("QueryItemDetailResponse.Item.Properties"));
		item.setCanSell(_ctx.booleanValue("QueryItemDetailResponse.Item.CanSell"));
		item.setSellerPayPostfee(_ctx.booleanValue("QueryItemDetailResponse.Item.SellerPayPostfee"));
		item.setCategoryId(_ctx.longValue("QueryItemDetailResponse.Item.CategoryId"));
		item.setExtJson(_ctx.stringValue("QueryItemDetailResponse.Item.ExtJson"));
		item.setPropertiesJson(_ctx.stringValue("QueryItemDetailResponse.Item.PropertiesJson"));
		item.setIforestPropsJson(_ctx.stringValue("QueryItemDetailResponse.Item.IforestPropsJson"));
		item.setDescOption(_ctx.stringValue("QueryItemDetailResponse.Item.DescOption"));
		item.setIforestProps(_ctx.stringValue("QueryItemDetailResponse.Item.IforestProps"));
		item.setSellerId(_ctx.longValue("QueryItemDetailResponse.Item.SellerId"));
		item.setTbShopName(_ctx.stringValue("QueryItemDetailResponse.Item.TbShopName"));
		item.setLmItemCategory(_ctx.stringValue("QueryItemDetailResponse.Item.LmItemCategory"));

		List<String> itemImages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryItemDetailResponse.Item.ItemImages.Length"); i++) {
			itemImages.add(_ctx.stringValue("QueryItemDetailResponse.Item.ItemImages["+ i +"]"));
		}
		item.setItemImages(itemImages);

		List<Sku> skus = new ArrayList<Sku>();
		for (int i = 0; i < _ctx.lengthValue("QueryItemDetailResponse.Item.Skus.Length"); i++) {
			Sku sku = new Sku();
			sku.setExtJson(_ctx.stringValue("QueryItemDetailResponse.Item.Skus["+ i +"].ExtJson"));
			sku.setItemId(_ctx.longValue("QueryItemDetailResponse.Item.Skus["+ i +"].ItemId"));
			sku.setSkuId(_ctx.longValue("QueryItemDetailResponse.Item.Skus["+ i +"].SkuId"));
			sku.setSkuProperties(_ctx.stringValue("QueryItemDetailResponse.Item.Skus["+ i +"].SkuProperties"));
			sku.setSkuPicUrl(_ctx.stringValue("QueryItemDetailResponse.Item.Skus["+ i +"].SkuPicUrl"));
			sku.setSkuTitle(_ctx.stringValue("QueryItemDetailResponse.Item.Skus["+ i +"].SkuTitle"));
			sku.setQuantity(_ctx.integerValue("QueryItemDetailResponse.Item.Skus["+ i +"].Quantity"));
			sku.setPriceCent(_ctx.longValue("QueryItemDetailResponse.Item.Skus["+ i +"].PriceCent"));
			sku.setPoints(_ctx.longValue("QueryItemDetailResponse.Item.Skus["+ i +"].Points"));
			sku.setPointsAmount(_ctx.longValue("QueryItemDetailResponse.Item.Skus["+ i +"].PointsAmount"));
			sku.setPointPrice(_ctx.longValue("QueryItemDetailResponse.Item.Skus["+ i +"].PointPrice"));
			sku.setSkuPropertiesJson(_ctx.stringValue("QueryItemDetailResponse.Item.Skus["+ i +"].SkuPropertiesJson"));

			skus.add(sku);
		}
		item.setSkus(skus);
		queryItemDetailResponse.setItem(item);
	 
	 	return queryItemDetailResponse;
	}
}