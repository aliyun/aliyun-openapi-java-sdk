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

import com.aliyuncs.linkedmall.model.v20180116.QueryBizItemsWithActivityResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryBizItemsWithActivityResponse.Item;
import com.aliyuncs.linkedmall.model.v20180116.QueryBizItemsWithActivityResponse.Item.Activity;
import com.aliyuncs.linkedmall.model.v20180116.QueryBizItemsWithActivityResponse.Item.Activity.ActivityItem;
import com.aliyuncs.linkedmall.model.v20180116.QueryBizItemsWithActivityResponse.Item.Activity.ActivityItem.ActivityItemSku;
import com.aliyuncs.linkedmall.model.v20180116.QueryBizItemsWithActivityResponse.Item.Activity.ActivitySession;
import com.aliyuncs.linkedmall.model.v20180116.QueryBizItemsWithActivityResponse.Item.Activity.ActivitySession.ActivitySessionItem;
import com.aliyuncs.linkedmall.model.v20180116.QueryBizItemsWithActivityResponse.Item.Activity.ActivitySession.ActivitySessionItem.ActivitySessionItemSkuList;
import com.aliyuncs.linkedmall.model.v20180116.QueryBizItemsWithActivityResponse.Item.Sku;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBizItemsWithActivityResponseUnmarshaller {

	public static QueryBizItemsWithActivityResponse unmarshall(QueryBizItemsWithActivityResponse queryBizItemsWithActivityResponse, UnmarshallerContext _ctx) {
		
		queryBizItemsWithActivityResponse.setRequestId(_ctx.stringValue("QueryBizItemsWithActivityResponse.RequestId"));
		queryBizItemsWithActivityResponse.setCode(_ctx.stringValue("QueryBizItemsWithActivityResponse.Code"));
		queryBizItemsWithActivityResponse.setMessage(_ctx.stringValue("QueryBizItemsWithActivityResponse.Message"));

		List<Item> itemList = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryBizItemsWithActivityResponse.ItemList.Length"); i++) {
			Item item = new Item();
			item.setItemId(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].ItemId"));
			item.setLmItemId(_ctx.stringValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].LmItemId"));
			item.setItemTitle(_ctx.stringValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].ItemTitle"));
			item.setPicUrl(_ctx.stringValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].PicUrl"));
			item.setReservePrice(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].ReservePrice"));
			item.setCategoryId(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].CategoryId"));
			item.setTaobaoShopName(_ctx.stringValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].TaobaoShopName"));
			item.setSellerId(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].SellerId"));
			item.setQuantity(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Quantity"));
			item.setMaxAllowedCount(_ctx.integerValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].MaxAllowedCount"));
			item.setTotalSoldQuantity(_ctx.integerValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].TotalSoldQuantity"));

			List<Sku> skuList = new ArrayList<Sku>();
			for (int j = 0; j < _ctx.lengthValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].SkuList.Length"); j++) {
				Sku sku = new Sku();
				sku.setSkuId(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].SkuList["+ j +"].SkuId"));
				sku.setPriceCent(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].SkuList["+ j +"].PriceCent"));
				sku.setPoints(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].SkuList["+ j +"].Points"));
				sku.setPointsAmount(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].SkuList["+ j +"].PointsAmount"));
				sku.setStatus(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].SkuList["+ j +"].Status"));
				sku.setPointsKey(_ctx.stringValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].SkuList["+ j +"].PointsKey"));
				sku.setPointsInfo(_ctx.stringValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].SkuList["+ j +"].PointsInfo"));
				sku.setMaxAllowedCount(_ctx.integerValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].SkuList["+ j +"].MaxAllowedCount"));
				sku.setQuantity(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].SkuList["+ j +"].Quantity"));

				skuList.add(sku);
			}
			item.setSkuList(skuList);

			List<Activity> activities = new ArrayList<Activity>();
			for (int j = 0; j < _ctx.lengthValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities.Length"); j++) {
				Activity activity = new Activity();
				activity.setLmActivityId(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].LmActivityId"));
				activity.setTitle(_ctx.stringValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].Title"));
				activity.setDescription(_ctx.stringValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].Description"));
				activity.setStartDate(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].StartDate"));
				activity.setEndDate(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].EndDate"));

				ActivityItem activityItem = new ActivityItem();
				activityItem.setActivityQuantity(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivityItem.ActivityQuantity"));
				activityItem.setLimitQuantityForPerson(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivityItem.LimitQuantityForPerson"));

				List<ActivityItemSku> activityItemSkuList = new ArrayList<ActivityItemSku>();
				for (int k = 0; k < _ctx.lengthValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivityItem.ActivityItemSkuList.Length"); k++) {
					ActivityItemSku activityItemSku = new ActivityItemSku();
					activityItemSku.setSkuId(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivityItem.ActivityItemSkuList["+ k +"].SkuId"));
					activityItemSku.setActivityPrice(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivityItem.ActivityItemSkuList["+ k +"].ActivityPrice"));

					activityItemSkuList.add(activityItemSku);
				}
				activityItem.setActivityItemSkuList(activityItemSkuList);
				activity.setActivityItem(activityItem);

				List<ActivitySession> activitySessions = new ArrayList<ActivitySession>();
				for (int k = 0; k < _ctx.lengthValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivitySessions.Length"); k++) {
					ActivitySession activitySession = new ActivitySession();
					activitySession.setLmSessionId(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivitySessions["+ k +"].LmSessionId"));
					activitySession.setTitle(_ctx.stringValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivitySessions["+ k +"].Title"));
					activitySession.setDescription(_ctx.stringValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivitySessions["+ k +"].Description"));
					activitySession.setSubBizCode(_ctx.stringValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivitySessions["+ k +"].SubBizCode"));
					activitySession.setDisplayDate(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivitySessions["+ k +"].DisplayDate"));
					activitySession.setStartDate(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivitySessions["+ k +"].StartDate"));
					activitySession.setEndDate(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivitySessions["+ k +"].EndDate"));

					ActivitySessionItem activitySessionItem = new ActivitySessionItem();
					activitySessionItem.setSessionQuantity(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivitySessions["+ k +"].ActivitySessionItem.SessionQuantity"));
					activitySessionItem.setLimitQuantityForPerson(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivitySessions["+ k +"].ActivitySessionItem.LimitQuantityForPerson"));
					activitySessionItem.setSaleableQuantity(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivitySessions["+ k +"].ActivitySessionItem.SaleableQuantity"));

					ActivitySessionItemSkuList activitySessionItemSkuList = new ActivitySessionItemSkuList();
					activitySessionItemSkuList.setSkuId(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivitySessions["+ k +"].ActivitySessionItem.ActivitySessionItemSkuList.SkuId"));
					activitySessionItemSkuList.setPriceCent(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivitySessions["+ k +"].ActivitySessionItem.ActivitySessionItemSkuList.PriceCent"));
					activitySessionItemSkuList.setPoints(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivitySessions["+ k +"].ActivitySessionItem.ActivitySessionItemSkuList.Points"));
					activitySessionItemSkuList.setPointsAmount(_ctx.longValue("QueryBizItemsWithActivityResponse.ItemList["+ i +"].Activities["+ j +"].ActivitySessions["+ k +"].ActivitySessionItem.ActivitySessionItemSkuList.PointsAmount"));
					activitySessionItem.setActivitySessionItemSkuList(activitySessionItemSkuList);
					activitySession.setActivitySessionItem(activitySessionItem);

					activitySessions.add(activitySession);
				}
				activity.setActivitySessions(activitySessions);

				activities.add(activity);
			}
			item.setActivities(activities);

			itemList.add(item);
		}
		queryBizItemsWithActivityResponse.setItemList(itemList);
	 
	 	return queryBizItemsWithActivityResponse;
	}
}