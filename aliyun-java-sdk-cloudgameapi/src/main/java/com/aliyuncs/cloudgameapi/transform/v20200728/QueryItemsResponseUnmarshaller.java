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

package com.aliyuncs.cloudgameapi.transform.v20200728;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudgameapi.model.v20200728.QueryItemsResponse;
import com.aliyuncs.cloudgameapi.model.v20200728.QueryItemsResponse.Data;
import com.aliyuncs.cloudgameapi.model.v20200728.QueryItemsResponse.Data.ItemsItem;
import com.aliyuncs.cloudgameapi.model.v20200728.QueryItemsResponse.Data.ItemsItem.GamesItem;
import com.aliyuncs.cloudgameapi.model.v20200728.QueryItemsResponse.Data.ItemsItem.Units;
import com.aliyuncs.cloudgameapi.model.v20200728.QueryItemsResponse.Data.ItemsItem.Units.SalePropsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryItemsResponseUnmarshaller {

	public static QueryItemsResponse unmarshall(QueryItemsResponse queryItemsResponse, UnmarshallerContext _ctx) {
		
		queryItemsResponse.setRequestId(_ctx.stringValue("QueryItemsResponse.RequestId"));
		queryItemsResponse.setSuccess(_ctx.booleanValue("QueryItemsResponse.Success"));
		queryItemsResponse.setHttpStatusCode(_ctx.longValue("QueryItemsResponse.HttpStatusCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("QueryItemsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("QueryItemsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("QueryItemsResponse.Data.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryItemsResponse.Data.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setModifyTime(_ctx.longValue("QueryItemsResponse.Data.Items["+ i +"].ModifyTime"));
			itemsItem.setSalePrice(_ctx.longValue("QueryItemsResponse.Data.Items["+ i +"].SalePrice"));
			itemsItem.setDescription(_ctx.stringValue("QueryItemsResponse.Data.Items["+ i +"].Description"));
			itemsItem.setOriginPrice(_ctx.longValue("QueryItemsResponse.Data.Items["+ i +"].OriginPrice"));
			itemsItem.setCreateTime(_ctx.longValue("QueryItemsResponse.Data.Items["+ i +"].CreateTime"));
			itemsItem.setTitle(_ctx.stringValue("QueryItemsResponse.Data.Items["+ i +"].Title"));
			itemsItem.setItemId(_ctx.stringValue("QueryItemsResponse.Data.Items["+ i +"].ItemId"));
			itemsItem.setSellerId(_ctx.stringValue("QueryItemsResponse.Data.Items["+ i +"].SellerId"));
			itemsItem.setSupplier(_ctx.stringValue("QueryItemsResponse.Data.Items["+ i +"].Supplier"));
			itemsItem.setCategoryId(_ctx.longValue("QueryItemsResponse.Data.Items["+ i +"].CategoryId"));
			itemsItem.setStatus(_ctx.integerValue("QueryItemsResponse.Data.Items["+ i +"].Status"));

			List<Units> skus = new ArrayList<Units>();
			for (int j = 0; j < _ctx.lengthValue("QueryItemsResponse.Data.Items["+ i +"].Skus.Length"); j++) {
				Units units = new Units();
				units.setItemId(_ctx.stringValue("QueryItemsResponse.Data.Items["+ i +"].Skus["+ j +"].ItemId"));
				units.setModifyTime(_ctx.longValue("QueryItemsResponse.Data.Items["+ i +"].Skus["+ j +"].ModifyTime"));
				units.setSalePrice(_ctx.longValue("QueryItemsResponse.Data.Items["+ i +"].Skus["+ j +"].SalePrice"));
				units.setOriginPrice(_ctx.longValue("QueryItemsResponse.Data.Items["+ i +"].Skus["+ j +"].OriginPrice"));
				units.setCreateTime(_ctx.longValue("QueryItemsResponse.Data.Items["+ i +"].Skus["+ j +"].CreateTime"));
				units.setSkuId(_ctx.stringValue("QueryItemsResponse.Data.Items["+ i +"].Skus["+ j +"].SkuId"));
				units.setStatus(_ctx.integerValue("QueryItemsResponse.Data.Items["+ i +"].Skus["+ j +"].Status"));

				List<SalePropsItem> saleProps = new ArrayList<SalePropsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryItemsResponse.Data.Items["+ i +"].Skus["+ j +"].SaleProps.Length"); k++) {
					SalePropsItem salePropsItem = new SalePropsItem();
					salePropsItem.setValueId(_ctx.longValue("QueryItemsResponse.Data.Items["+ i +"].Skus["+ j +"].SaleProps["+ k +"].ValueId"));
					salePropsItem.setPropertyName(_ctx.stringValue("QueryItemsResponse.Data.Items["+ i +"].Skus["+ j +"].SaleProps["+ k +"].PropertyName"));
					salePropsItem.setPropertyId(_ctx.longValue("QueryItemsResponse.Data.Items["+ i +"].Skus["+ j +"].SaleProps["+ k +"].PropertyId"));
					salePropsItem.setValue(_ctx.stringValue("QueryItemsResponse.Data.Items["+ i +"].Skus["+ j +"].SaleProps["+ k +"].Value"));

					saleProps.add(salePropsItem);
				}
				units.setSaleProps(saleProps);

				skus.add(units);
			}
			itemsItem.setSkus(skus);

			List<GamesItem> games = new ArrayList<GamesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryItemsResponse.Data.Items["+ i +"].Games.Length"); j++) {
				GamesItem gamesItem = new GamesItem();
				gamesItem.setGameId(_ctx.stringValue("QueryItemsResponse.Data.Items["+ i +"].Games["+ j +"].GameId"));
				gamesItem.setName(_ctx.stringValue("QueryItemsResponse.Data.Items["+ i +"].Games["+ j +"].Name"));

				games.add(gamesItem);
			}
			itemsItem.setGames(games);

			items.add(itemsItem);
		}
		data.setItems(items);
		queryItemsResponse.setData(data);
	 
	 	return queryItemsResponse;
	}
}