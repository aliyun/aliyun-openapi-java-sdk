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

import com.aliyuncs.cloudgameapi.model.v20200728.GetItemResponse;
import com.aliyuncs.cloudgameapi.model.v20200728.GetItemResponse.Data;
import com.aliyuncs.cloudgameapi.model.v20200728.GetItemResponse.Data.GamesItem;
import com.aliyuncs.cloudgameapi.model.v20200728.GetItemResponse.Data.Units;
import com.aliyuncs.cloudgameapi.model.v20200728.GetItemResponse.Data.Units.SalePropsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetItemResponseUnmarshaller {

	public static GetItemResponse unmarshall(GetItemResponse getItemResponse, UnmarshallerContext _ctx) {
		
		getItemResponse.setRequestId(_ctx.stringValue("GetItemResponse.RequestId"));

		Data data = new Data();
		data.setItemId(_ctx.stringValue("GetItemResponse.Data.ItemId"));
		data.setCreateTime(_ctx.longValue("GetItemResponse.Data.CreateTime"));
		data.setModifyTime(_ctx.longValue("GetItemResponse.Data.ModifyTime"));
		data.setSellerId(_ctx.stringValue("GetItemResponse.Data.SellerId"));
		data.setCategoryId(_ctx.longValue("GetItemResponse.Data.CategoryId"));
		data.setTitle(_ctx.stringValue("GetItemResponse.Data.Title"));
		data.setOriginPrice(_ctx.longValue("GetItemResponse.Data.OriginPrice"));
		data.setSalePrice(_ctx.longValue("GetItemResponse.Data.SalePrice"));
		data.setStatus(_ctx.integerValue("GetItemResponse.Data.Status"));
		data.setDescription(_ctx.stringValue("GetItemResponse.Data.Description"));
		data.setSupplier(_ctx.stringValue("GetItemResponse.Data.Supplier"));

		List<GamesItem> games = new ArrayList<GamesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetItemResponse.Data.Games.Length"); i++) {
			GamesItem gamesItem = new GamesItem();
			gamesItem.setGameId(_ctx.stringValue("GetItemResponse.Data.Games["+ i +"].GameId"));
			gamesItem.setName(_ctx.stringValue("GetItemResponse.Data.Games["+ i +"].Name"));

			games.add(gamesItem);
		}
		data.setGames(games);

		List<Units> skus = new ArrayList<Units>();
		for (int i = 0; i < _ctx.lengthValue("GetItemResponse.Data.Skus.Length"); i++) {
			Units units = new Units();
			units.setSkuId(_ctx.stringValue("GetItemResponse.Data.Skus["+ i +"].SkuId"));
			units.setCreateTime(_ctx.longValue("GetItemResponse.Data.Skus["+ i +"].CreateTime"));
			units.setModifyTime(_ctx.longValue("GetItemResponse.Data.Skus["+ i +"].ModifyTime"));
			units.setItemId(_ctx.stringValue("GetItemResponse.Data.Skus["+ i +"].ItemId"));
			units.setOriginPrice(_ctx.longValue("GetItemResponse.Data.Skus["+ i +"].OriginPrice"));
			units.setSalePrice(_ctx.longValue("GetItemResponse.Data.Skus["+ i +"].SalePrice"));
			units.setStatus(_ctx.integerValue("GetItemResponse.Data.Skus["+ i +"].Status"));

			List<SalePropsItem> saleProps = new ArrayList<SalePropsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetItemResponse.Data.Skus["+ i +"].SaleProps.Length"); j++) {
				SalePropsItem salePropsItem = new SalePropsItem();
				salePropsItem.setPropertyId(_ctx.longValue("GetItemResponse.Data.Skus["+ i +"].SaleProps["+ j +"].PropertyId"));
				salePropsItem.setPropertyName(_ctx.stringValue("GetItemResponse.Data.Skus["+ i +"].SaleProps["+ j +"].PropertyName"));
				salePropsItem.setValueId(_ctx.longValue("GetItemResponse.Data.Skus["+ i +"].SaleProps["+ j +"].ValueId"));
				salePropsItem.setValue(_ctx.stringValue("GetItemResponse.Data.Skus["+ i +"].SaleProps["+ j +"].Value"));

				saleProps.add(salePropsItem);
			}
			units.setSaleProps(saleProps);

			skus.add(units);
		}
		data.setSkus(skus);
		getItemResponse.setData(data);
	 
	 	return getItemResponse;
	}
}