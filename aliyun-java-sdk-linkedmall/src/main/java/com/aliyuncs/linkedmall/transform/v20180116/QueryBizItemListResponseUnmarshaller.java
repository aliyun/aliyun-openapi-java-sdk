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
import com.aliyuncs.linkedmall.model.v20180116.QueryBizItemListResponse.Item.Sku.GradePriceModel;
import java.util.Map;
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
			item.setLmItemId(_ctx.stringValue("QueryBizItemListResponse.ItemList["+ i +"].LmItemId"));
			item.setReservePrice1(_ctx.longValue("QueryBizItemListResponse.ItemList["+ i +"].ReservePrice"));

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
				sku.setCustomizedAttributeMap(_ctx.mapValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].CustomizedAttributeMap"));
				sku.setTaoBaoCurrentPrice(_ctx.longValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].TaoBaoCurrentPrice"));

				List<String> userLabelList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].UserLabelList.Length"); k++) {
					userLabelList.add(_ctx.stringValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].UserLabelList["+ k +"]"));
				}
				sku.setUserLabelList(userLabelList);

				List<GradePriceModel> gradePriceModels = new ArrayList<GradePriceModel>();
				for (int k = 0; k < _ctx.lengthValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].GradePriceModels.Length"); k++) {
					GradePriceModel gradePriceModel = new GradePriceModel();
					gradePriceModel.setCharacteristicCode(_ctx.stringValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].GradePriceModels["+ k +"].CharacteristicCode"));
					gradePriceModel.setCharacteristicName(_ctx.stringValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].GradePriceModels["+ k +"].CharacteristicName"));
					gradePriceModel.setSubBizCode(_ctx.stringValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].GradePriceModels["+ k +"].SubBizCode"));
					gradePriceModel.setCanBuy(_ctx.booleanValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].GradePriceModels["+ k +"].CanBuy"));
					gradePriceModel.setExclusive(_ctx.booleanValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].GradePriceModels["+ k +"].Exclusive"));
					gradePriceModel.setRecommend(_ctx.booleanValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].GradePriceModels["+ k +"].Recommend"));
					gradePriceModel.setPriceCent(_ctx.longValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].GradePriceModels["+ k +"].PriceCent"));
					gradePriceModel.setPointsAmount(_ctx.longValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].GradePriceModels["+ k +"].PointsAmount"));
					gradePriceModel.setPoints(_ctx.longValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].GradePriceModels["+ k +"].Points"));
					gradePriceModel.setPointPrice(_ctx.longValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].GradePriceModels["+ k +"].PointPrice"));
					gradePriceModel.setShowName(_ctx.stringValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].GradePriceModels["+ k +"].ShowName"));
					gradePriceModel.setAccessUrl(_ctx.stringValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].GradePriceModels["+ k +"].AccessUrl"));
					gradePriceModel.setIcon(_ctx.stringValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].GradePriceModels["+ k +"].Icon"));

					List<String> userLabelList2 = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].GradePriceModels["+ k +"].UserLabelList.Length"); l++) {
						userLabelList2.add(_ctx.stringValue("QueryBizItemListResponse.ItemList["+ i +"].SkuList["+ j +"].GradePriceModels["+ k +"].UserLabelList["+ l +"]"));
					}
					gradePriceModel.setUserLabelList2(userLabelList2);

					gradePriceModels.add(gradePriceModel);
				}
				sku.setGradePriceModels(gradePriceModels);

				skuList.add(sku);
			}
			item.setSkuList(skuList);

			itemList.add(item);
		}
		queryBizItemListResponse.setItemList(itemList);
	 
	 	return queryBizItemListResponse;
	}
}