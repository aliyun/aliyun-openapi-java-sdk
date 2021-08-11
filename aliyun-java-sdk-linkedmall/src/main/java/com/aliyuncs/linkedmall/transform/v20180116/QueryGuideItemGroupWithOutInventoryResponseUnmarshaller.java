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

import com.aliyuncs.linkedmall.model.v20180116.QueryGuideItemGroupWithOutInventoryResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryGuideItemGroupWithOutInventoryResponse.Item;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryGuideItemGroupWithOutInventoryResponseUnmarshaller {

	public static QueryGuideItemGroupWithOutInventoryResponse unmarshall(QueryGuideItemGroupWithOutInventoryResponse queryGuideItemGroupWithOutInventoryResponse, UnmarshallerContext _ctx) {
		
		queryGuideItemGroupWithOutInventoryResponse.setRequestId(_ctx.stringValue("QueryGuideItemGroupWithOutInventoryResponse.RequestId"));
		queryGuideItemGroupWithOutInventoryResponse.setCode(_ctx.stringValue("QueryGuideItemGroupWithOutInventoryResponse.Code"));
		queryGuideItemGroupWithOutInventoryResponse.setMessage(_ctx.stringValue("QueryGuideItemGroupWithOutInventoryResponse.Message"));
		queryGuideItemGroupWithOutInventoryResponse.setPageSize(_ctx.longValue("QueryGuideItemGroupWithOutInventoryResponse.PageSize"));
		queryGuideItemGroupWithOutInventoryResponse.setPageNumber(_ctx.longValue("QueryGuideItemGroupWithOutInventoryResponse.PageNumber"));
		queryGuideItemGroupWithOutInventoryResponse.setTotalCount(_ctx.longValue("QueryGuideItemGroupWithOutInventoryResponse.TotalCount"));

		List<Item> itemList = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryGuideItemGroupWithOutInventoryResponse.ItemList.Length"); i++) {
			Item item = new Item();
			item.setItemId(_ctx.stringValue("QueryGuideItemGroupWithOutInventoryResponse.ItemList["+ i +"].ItemId"));
			item.setLmItemId(_ctx.stringValue("QueryGuideItemGroupWithOutInventoryResponse.ItemList["+ i +"].LmItemId"));
			item.setItemTitle(_ctx.stringValue("QueryGuideItemGroupWithOutInventoryResponse.ItemList["+ i +"].ItemTitle"));
			item.setMainPicUrl(_ctx.stringValue("QueryGuideItemGroupWithOutInventoryResponse.ItemList["+ i +"].MainPicUrl"));
			item.setItemUrl(_ctx.stringValue("QueryGuideItemGroupWithOutInventoryResponse.ItemList["+ i +"].ItemUrl"));
			item.setPriceCent(_ctx.longValue("QueryGuideItemGroupWithOutInventoryResponse.ItemList["+ i +"].PriceCent"));
			item.setPoints(_ctx.longValue("QueryGuideItemGroupWithOutInventoryResponse.ItemList["+ i +"].Points"));
			item.setPointsAmount(_ctx.longValue("QueryGuideItemGroupWithOutInventoryResponse.ItemList["+ i +"].PointsAmount"));
			item.setPointPrice(_ctx.longValue("QueryGuideItemGroupWithOutInventoryResponse.ItemList["+ i +"].PointPrice"));
			item.setReservePrice(_ctx.stringValue("QueryGuideItemGroupWithOutInventoryResponse.ItemList["+ i +"].ReservePrice"));
			item.setCustomizedAttributeMap(_ctx.mapValue("QueryGuideItemGroupWithOutInventoryResponse.ItemList["+ i +"].CustomizedAttributeMap"));
			item.setWhitePicUrl(_ctx.stringValue("QueryGuideItemGroupWithOutInventoryResponse.ItemList["+ i +"].WhitePicUrl"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryGuideItemGroupWithOutInventoryResponse.ItemList["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("QueryGuideItemGroupWithOutInventoryResponse.ItemList["+ i +"].Tags["+ j +"]"));
			}
			item.setTags(tags);

			itemList.add(item);
		}
		queryGuideItemGroupWithOutInventoryResponse.setItemList(itemList);
	 
	 	return queryGuideItemGroupWithOutInventoryResponse;
	}
}