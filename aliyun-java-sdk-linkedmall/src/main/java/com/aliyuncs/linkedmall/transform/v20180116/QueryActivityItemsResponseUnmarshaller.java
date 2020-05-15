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

import com.aliyuncs.linkedmall.model.v20180116.QueryActivityItemsResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryActivityItemsResponse.LmActivityItemModel;
import com.aliyuncs.linkedmall.model.v20180116.QueryActivityItemsResponse.LmActivityItemModel.LmActivityItemSkuModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryActivityItemsResponseUnmarshaller {

	public static QueryActivityItemsResponse unmarshall(QueryActivityItemsResponse queryActivityItemsResponse, UnmarshallerContext _ctx) {
		
		queryActivityItemsResponse.setRequestId(_ctx.stringValue("QueryActivityItemsResponse.RequestId"));
		queryActivityItemsResponse.setCode(_ctx.stringValue("QueryActivityItemsResponse.Code"));
		queryActivityItemsResponse.setMessage(_ctx.stringValue("QueryActivityItemsResponse.Message"));
		queryActivityItemsResponse.setTotalCount(_ctx.longValue("QueryActivityItemsResponse.TotalCount"));
		queryActivityItemsResponse.setPageNumber(_ctx.longValue("QueryActivityItemsResponse.PageNumber"));
		queryActivityItemsResponse.setPageSize(_ctx.longValue("QueryActivityItemsResponse.PageSize"));

		List<LmActivityItemModel> lmActivityItemModelList = new ArrayList<LmActivityItemModel>();
		for (int i = 0; i < _ctx.lengthValue("QueryActivityItemsResponse.LmActivityItemModelList.Length"); i++) {
			LmActivityItemModel lmActivityItemModel = new LmActivityItemModel();
			lmActivityItemModel.setLmItemId(_ctx.stringValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].LmItemId"));
			lmActivityItemModel.setItemId(_ctx.longValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].ItemId"));
			lmActivityItemModel.setItemTitle(_ctx.stringValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].ItemTitle"));
			lmActivityItemModel.setLmActivityId(_ctx.longValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].LmActivityId"));
			lmActivityItemModel.setMainPicUrl(_ctx.stringValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].MainPicUrl"));
			lmActivityItemModel.setTbSellerId(_ctx.longValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].TbSellerId"));
			lmActivityItemModel.setTbShopId(_ctx.longValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].TbShopId"));
			lmActivityItemModel.setLmShopId(_ctx.stringValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].LmShopId"));
			lmActivityItemModel.setTbShopName(_ctx.stringValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].TbShopName"));
			lmActivityItemModel.setItemActivityQuantity(_ctx.integerValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].ItemActivityQuantity"));
			lmActivityItemModel.setSellableQuantity(_ctx.integerValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].SellableQuantity"));
			lmActivityItemModel.setItemActivityStatus(_ctx.stringValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].ItemActivityStatus"));
			lmActivityItemModel.setCanSell(_ctx.booleanValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].CanSell"));
			lmActivityItemModel.setTips(_ctx.stringValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].Tips"));

			List<LmActivityItemSkuModel> skuModelList = new ArrayList<LmActivityItemSkuModel>();
			for (int j = 0; j < _ctx.lengthValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].SkuModelList.Length"); j++) {
				LmActivityItemSkuModel lmActivityItemSkuModel = new LmActivityItemSkuModel();
				lmActivityItemSkuModel.setBizId(_ctx.stringValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].SkuModelList["+ j +"].BizId"));
				lmActivityItemSkuModel.setSkuId(_ctx.longValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].SkuModelList["+ j +"].SkuId"));
				lmActivityItemSkuModel.setSkuTitle(_ctx.stringValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].SkuModelList["+ j +"].SkuTitle"));
				lmActivityItemSkuModel.setSkuPicUrl(_ctx.stringValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].SkuModelList["+ j +"].SkuPicUrl"));
				lmActivityItemSkuModel.setReservedPrice(_ctx.longValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].SkuModelList["+ j +"].ReservedPrice"));
				lmActivityItemSkuModel.setActivityPrice(_ctx.longValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].SkuModelList["+ j +"].ActivityPrice"));
				lmActivityItemSkuModel.setActivityStatus(_ctx.stringValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].SkuModelList["+ j +"].ActivityStatus"));
				lmActivityItemSkuModel.setTips(_ctx.stringValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].SkuModelList["+ j +"].Tips"));
				lmActivityItemSkuModel.setLmItemId(_ctx.stringValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].SkuModelList["+ j +"].LmItemId"));
				lmActivityItemSkuModel.setItemId(_ctx.longValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].SkuModelList["+ j +"].ItemId"));
				lmActivityItemSkuModel.setLmActivityId(_ctx.longValue("QueryActivityItemsResponse.LmActivityItemModelList["+ i +"].SkuModelList["+ j +"].LmActivityId"));

				skuModelList.add(lmActivityItemSkuModel);
			}
			lmActivityItemModel.setSkuModelList(skuModelList);

			lmActivityItemModelList.add(lmActivityItemModel);
		}
		queryActivityItemsResponse.setLmActivityItemModelList(lmActivityItemModelList);
	 
	 	return queryActivityItemsResponse;
	}
}