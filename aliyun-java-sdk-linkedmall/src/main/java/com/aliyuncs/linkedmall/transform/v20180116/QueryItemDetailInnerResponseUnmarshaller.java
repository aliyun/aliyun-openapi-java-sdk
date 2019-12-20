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

import com.aliyuncs.linkedmall.model.v20180116.QueryItemDetailInnerResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryItemDetailInnerResponse.Item;
import com.aliyuncs.linkedmall.model.v20180116.QueryItemDetailInnerResponse.Item.Sku;
import com.aliyuncs.linkedmall.model.v20180116.QueryItemDetailInnerResponse.Item.SkuProperty;
import com.aliyuncs.linkedmall.model.v20180116.QueryItemDetailInnerResponse.Item.SkuProperty.Value;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryItemDetailInnerResponseUnmarshaller {

	public static QueryItemDetailInnerResponse unmarshall(QueryItemDetailInnerResponse queryItemDetailInnerResponse, UnmarshallerContext _ctx) {
		
		queryItemDetailInnerResponse.setRequestId(_ctx.stringValue("QueryItemDetailInnerResponse.RequestId"));
		queryItemDetailInnerResponse.setCode(_ctx.stringValue("QueryItemDetailInnerResponse.Code"));
		queryItemDetailInnerResponse.setMessage(_ctx.stringValue("QueryItemDetailInnerResponse.Message"));

		Item item = new Item();
		item.setItemId(_ctx.longValue("QueryItemDetailInnerResponse.Item.ItemId"));
		item.setItemTitle(_ctx.stringValue("QueryItemDetailInnerResponse.Item.ItemTitle"));
		item.setMainPicUrl(_ctx.stringValue("QueryItemDetailInnerResponse.Item.MainPicUrl"));
		item.setDescPath(_ctx.stringValue("QueryItemDetailInnerResponse.Item.DescPath"));
		item.setMinPrice(_ctx.longValue("QueryItemDetailInnerResponse.Item.MinPrice"));
		item.setMinPoints(_ctx.longValue("QueryItemDetailInnerResponse.Item.MinPoints"));
		item.setReservePrice(_ctx.longValue("QueryItemDetailInnerResponse.Item.ReservePrice"));
		item.setQuantity(_ctx.integerValue("QueryItemDetailInnerResponse.Item.Quantity"));
		item.setIsSellerPayPostfee(_ctx.booleanValue("QueryItemDetailInnerResponse.Item.IsSellerPayPostfee"));
		item.setIsCanSell(_ctx.booleanValue("QueryItemDetailInnerResponse.Item.IsCanSell"));
		item.setTotalSoldQuantity(_ctx.integerValue("QueryItemDetailInnerResponse.Item.TotalSoldQuantity"));
		item.setProperties(_ctx.mapValue("QueryItemDetailInnerResponse.Item.Properties"));
		item.setCanSell(_ctx.booleanValue("QueryItemDetailInnerResponse.Item.CanSell"));
		item.setSellerPayPostfee(_ctx.booleanValue("QueryItemDetailInnerResponse.Item.SellerPayPostfee"));
		item.setCategoryId(_ctx.longValue("QueryItemDetailInnerResponse.Item.CategoryId"));
		item.setSellerId(_ctx.longValue("QueryItemDetailInnerResponse.Item.SellerId"));
		item.setTbShopName(_ctx.stringValue("QueryItemDetailInnerResponse.Item.TbShopName"));
		item.setLmItemCategory(_ctx.stringValue("QueryItemDetailInnerResponse.Item.LmItemCategory"));
		item.setCenterInventory(_ctx.booleanValue("QueryItemDetailInnerResponse.Item.CenterInventory"));
		item.setProvince(_ctx.stringValue("QueryItemDetailInnerResponse.Item.Province"));
		item.setCity(_ctx.stringValue("QueryItemDetailInnerResponse.Item.City"));
		item.setDescOption(_ctx.stringValue("QueryItemDetailInnerResponse.Item.DescOption"));
		item.setSellerNick(_ctx.stringValue("QueryItemDetailInnerResponse.Item.SellerNick"));
		item.setLmShopId(_ctx.longValue("QueryItemDetailInnerResponse.Item.LmShopId"));

		List<Map<Object, Object>> iforestProps = _ctx.listMapValue("QueryItemDetailInnerResponse.Item.IforestProps");
		item.setIforestProps(iforestProps);

		List<String> itemImages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryItemDetailInnerResponse.Item.ItemImages.Length"); i++) {
			itemImages.add(_ctx.stringValue("QueryItemDetailInnerResponse.Item.ItemImages["+ i +"]"));
		}
		item.setItemImages(itemImages);

		List<Long> categoryIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("QueryItemDetailInnerResponse.Item.CategoryIds.Length"); i++) {
			categoryIds.add(_ctx.longValue("QueryItemDetailInnerResponse.Item.CategoryIds["+ i +"]"));
		}
		item.setCategoryIds(categoryIds);

		List<Sku> skus = new ArrayList<Sku>();
		for (int i = 0; i < _ctx.lengthValue("QueryItemDetailInnerResponse.Item.Skus.Length"); i++) {
			Sku sku = new Sku();
			sku.setExtJson(_ctx.stringValue("QueryItemDetailInnerResponse.Item.Skus["+ i +"].ExtJson"));
			sku.setItemId(_ctx.longValue("QueryItemDetailInnerResponse.Item.Skus["+ i +"].ItemId"));
			sku.setSkuId(_ctx.longValue("QueryItemDetailInnerResponse.Item.Skus["+ i +"].SkuId"));
			sku.setSkuPvs(_ctx.stringValue("QueryItemDetailInnerResponse.Item.Skus["+ i +"].SkuPvs"));
			sku.setSkuPicUrl(_ctx.stringValue("QueryItemDetailInnerResponse.Item.Skus["+ i +"].SkuPicUrl"));
			sku.setSkuTitle(_ctx.stringValue("QueryItemDetailInnerResponse.Item.Skus["+ i +"].SkuTitle"));
			sku.setQuantity(_ctx.integerValue("QueryItemDetailInnerResponse.Item.Skus["+ i +"].Quantity"));
			sku.setPriceCent(_ctx.longValue("QueryItemDetailInnerResponse.Item.Skus["+ i +"].PriceCent"));
			sku.setPoints(_ctx.longValue("QueryItemDetailInnerResponse.Item.Skus["+ i +"].Points"));
			sku.setPointsAmount(_ctx.longValue("QueryItemDetailInnerResponse.Item.Skus["+ i +"].PointsAmount"));
			sku.setPointPrice(_ctx.longValue("QueryItemDetailInnerResponse.Item.Skus["+ i +"].PointPrice"));
			sku.setReservePrice(_ctx.longValue("QueryItemDetailInnerResponse.Item.Skus["+ i +"].ReservePrice"));
			sku.setStatus(_ctx.integerValue("QueryItemDetailInnerResponse.Item.Skus["+ i +"].Status"));
			sku.setLmItemId(_ctx.stringValue("QueryItemDetailInnerResponse.Item.Skus["+ i +"].LmItemId"));
			sku.setSkuDesc(_ctx.stringValue("QueryItemDetailInnerResponse.Item.Skus["+ i +"].SkuDesc"));

			skus.add(sku);
		}
		item.setSkus(skus);

		List<SkuProperty> skuPropertys = new ArrayList<SkuProperty>();
		for (int i = 0; i < _ctx.lengthValue("QueryItemDetailInnerResponse.Item.SkuPropertys.Length"); i++) {
			SkuProperty skuProperty = new SkuProperty();
			skuProperty.setId(_ctx.longValue("QueryItemDetailInnerResponse.Item.SkuPropertys["+ i +"].Id"));
			skuProperty.setText(_ctx.stringValue("QueryItemDetailInnerResponse.Item.SkuPropertys["+ i +"].Text"));

			List<Value> values = new ArrayList<Value>();
			for (int j = 0; j < _ctx.lengthValue("QueryItemDetailInnerResponse.Item.SkuPropertys["+ i +"].Values.Length"); j++) {
				Value value = new Value();
				value.setId(_ctx.longValue("QueryItemDetailInnerResponse.Item.SkuPropertys["+ i +"].Values["+ j +"].Id"));
				value.setText(_ctx.stringValue("QueryItemDetailInnerResponse.Item.SkuPropertys["+ i +"].Values["+ j +"].Text"));

				values.add(value);
			}
			skuProperty.setValues(values);

			skuPropertys.add(skuProperty);
		}
		item.setSkuPropertys(skuPropertys);
		queryItemDetailInnerResponse.setItem(item);
	 
	 	return queryItemDetailInnerResponse;
	}
}