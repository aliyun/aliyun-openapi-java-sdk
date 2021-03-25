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

import com.aliyuncs.linkedmall.model.v20180116.QueryItemInSubBizsResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryItemInSubBizsResponse.ItemBiz;
import com.aliyuncs.linkedmall.model.v20180116.QueryItemInSubBizsResponse.ItemBiz.Sku;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryItemInSubBizsResponseUnmarshaller {

	public static QueryItemInSubBizsResponse unmarshall(QueryItemInSubBizsResponse queryItemInSubBizsResponse, UnmarshallerContext _ctx) {
		
		queryItemInSubBizsResponse.setRequestId(_ctx.stringValue("QueryItemInSubBizsResponse.RequestId"));
		queryItemInSubBizsResponse.setCode(_ctx.stringValue("QueryItemInSubBizsResponse.Code"));
		queryItemInSubBizsResponse.setMessage(_ctx.stringValue("QueryItemInSubBizsResponse.Message"));

		List<ItemBiz> itemBizList = new ArrayList<ItemBiz>();
		for (int i = 0; i < _ctx.lengthValue("QueryItemInSubBizsResponse.ItemBizList.Length"); i++) {
			ItemBiz itemBiz = new ItemBiz();
			itemBiz.setItemId(_ctx.longValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].ItemId"));
			itemBiz.setLmItemId(_ctx.stringValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].LmItemId"));
			itemBiz.setSubBizId(_ctx.stringValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].SubBizId"));
			itemBiz.setQuantity(_ctx.longValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].Quantity"));
			itemBiz.setItemTitle(_ctx.stringValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].ItemTitle"));
			itemBiz.setMainPicUrl(_ctx.stringValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].MainPicUrl"));
			itemBiz.setDescOption(_ctx.stringValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].DescOption"));
			itemBiz.setPropertiesJson(_ctx.stringValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].PropertiesJson"));
			itemBiz.setSellerId(_ctx.longValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].SellerId"));
			itemBiz.setCategoryId(_ctx.longValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].CategoryId"));
			itemBiz.setTbShopName(_ctx.stringValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].TbShopName"));
			itemBiz.setReservePrice(_ctx.longValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].ReservePrice"));
			itemBiz.setCanSell(_ctx.booleanValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].CanSell"));

			List<String> itemImages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].ItemImages.Length"); j++) {
				itemImages.add(_ctx.stringValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].ItemImages["+ j +"]"));
			}
			itemBiz.setItemImages(itemImages);

			List<Sku> skuList = new ArrayList<Sku>();
			for (int j = 0; j < _ctx.lengthValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].SkuList.Length"); j++) {
				Sku sku = new Sku();
				sku.setSkuId(_ctx.longValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].SkuList["+ j +"].SkuId"));
				sku.setSkuPicUrl(_ctx.stringValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].SkuList["+ j +"].SkuPicUrl"));
				sku.setSkuTitle(_ctx.stringValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].SkuList["+ j +"].SkuTitle"));
				sku.setPriceCent(_ctx.longValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].SkuList["+ j +"].PriceCent"));
				sku.setPoints(_ctx.longValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].SkuList["+ j +"].Points"));
				sku.setPointsAmount(_ctx.longValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].SkuList["+ j +"].PointsAmount"));
				sku.setBenefitId(_ctx.stringValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].SkuList["+ j +"].BenefitId"));
				sku.setReservePrice(_ctx.longValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].SkuList["+ j +"].ReservePrice"));
				sku.setSkuProperties(_ctx.stringValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].SkuList["+ j +"].SkuProperties"));
				sku.setSkuPropertiesJson(_ctx.stringValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].SkuList["+ j +"].SkuPropertiesJson"));
				sku.setCustomizedAttributeMap(_ctx.mapValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].SkuList["+ j +"].CustomizedAttributeMap"));
				sku.setCanSell(_ctx.booleanValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].SkuList["+ j +"].CanSell"));
				sku.setPointPrice(_ctx.longValue("QueryItemInSubBizsResponse.ItemBizList["+ i +"].SkuList["+ j +"].PointPrice"));

				skuList.add(sku);
			}
			itemBiz.setSkuList(skuList);

			itemBizList.add(itemBiz);
		}
		queryItemInSubBizsResponse.setItemBizList(itemBizList);
	 
	 	return queryItemInSubBizsResponse;
	}
}