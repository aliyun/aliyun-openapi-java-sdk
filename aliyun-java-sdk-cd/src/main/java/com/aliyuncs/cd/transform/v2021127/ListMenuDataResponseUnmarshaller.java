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

package com.aliyuncs.cd.transform.v2021127;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cd.model.v2021127.ListMenuDataResponse;
import com.aliyuncs.cd.model.v2021127.ListMenuDataResponse.DataItem;
import com.aliyuncs.cd.model.v2021127.ListMenuDataResponse.DataItem.ProductCombineListItem;
import com.aliyuncs.cd.model.v2021127.ListMenuDataResponse.DataItem.ProductCombineListItem.ProductItemListItem;
import com.aliyuncs.cd.model.v2021127.ListMenuDataResponse.DataItem.ProductCombineListItem.ProductItemListItem.ProductInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMenuDataResponseUnmarshaller {

	public static ListMenuDataResponse unmarshall(ListMenuDataResponse listMenuDataResponse, UnmarshallerContext _ctx) {
		
		listMenuDataResponse.setRequestId(_ctx.stringValue("ListMenuDataResponse.RequestId"));
		listMenuDataResponse.setSuccess(_ctx.booleanValue("ListMenuDataResponse.Success"));
		listMenuDataResponse.setMessage(_ctx.stringValue("ListMenuDataResponse.Message"));
		listMenuDataResponse.setCode(_ctx.stringValue("ListMenuDataResponse.Code"));
		listMenuDataResponse.setHttpStatusCode(_ctx.integerValue("ListMenuDataResponse.HttpStatusCode"));
		listMenuDataResponse.setTotalCount(_ctx.longValue("ListMenuDataResponse.TotalCount"));
		listMenuDataResponse.setPageNumber(_ctx.integerValue("ListMenuDataResponse.PageNumber"));
		listMenuDataResponse.setPageSize(_ctx.integerValue("ListMenuDataResponse.PageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMenuDataResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setProductContainerId(_ctx.stringValue("ListMenuDataResponse.Data["+ i +"].ProductContainerId"));
			dataItem.setBatchId(_ctx.stringValue("ListMenuDataResponse.Data["+ i +"].BatchId"));
			dataItem.setShopGroupId(_ctx.stringValue("ListMenuDataResponse.Data["+ i +"].ShopGroupId"));
			dataItem.setType(_ctx.stringValue("ListMenuDataResponse.Data["+ i +"].Type"));
			dataItem.setPriority(_ctx.integerValue("ListMenuDataResponse.Data["+ i +"].Priority"));

			List<String> shopIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListMenuDataResponse.Data["+ i +"].ShopIdList.Length"); j++) {
				shopIdList.add(_ctx.stringValue("ListMenuDataResponse.Data["+ i +"].ShopIdList["+ j +"]"));
			}
			dataItem.setShopIdList(shopIdList);

			List<ProductCombineListItem> productCombineList = new ArrayList<ProductCombineListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListMenuDataResponse.Data["+ i +"].ProductCombineList.Length"); j++) {
				ProductCombineListItem productCombineListItem = new ProductCombineListItem();
				productCombineListItem.setOrder(_ctx.integerValue("ListMenuDataResponse.Data["+ i +"].ProductCombineList["+ j +"].Order"));
				productCombineListItem.setName(_ctx.stringValue("ListMenuDataResponse.Data["+ i +"].ProductCombineList["+ j +"].Name"));

				List<ProductItemListItem> productItemList = new ArrayList<ProductItemListItem>();
				for (int k = 0; k < _ctx.lengthValue("ListMenuDataResponse.Data["+ i +"].ProductCombineList["+ j +"].ProductItemList.Length"); k++) {
					ProductItemListItem productItemListItem = new ProductItemListItem();
					productItemListItem.setOrder(_ctx.integerValue("ListMenuDataResponse.Data["+ i +"].ProductCombineList["+ j +"].ProductItemList["+ k +"].Order"));

					ProductInfo productInfo = new ProductInfo();
					productInfo.setProductId(_ctx.stringValue("ListMenuDataResponse.Data["+ i +"].ProductCombineList["+ j +"].ProductItemList["+ k +"].ProductInfo.ProductId"));
					productInfo.setChineseName(_ctx.stringValue("ListMenuDataResponse.Data["+ i +"].ProductCombineList["+ j +"].ProductItemList["+ k +"].ProductInfo.ChineseName"));
					productInfo.setEnglishName(_ctx.stringValue("ListMenuDataResponse.Data["+ i +"].ProductCombineList["+ j +"].ProductItemList["+ k +"].ProductInfo.EnglishName"));
					productInfo.setDescription(_ctx.stringValue("ListMenuDataResponse.Data["+ i +"].ProductCombineList["+ j +"].ProductItemList["+ k +"].ProductInfo.Description"));
					productInfo.setIconText(_ctx.stringValue("ListMenuDataResponse.Data["+ i +"].ProductCombineList["+ j +"].ProductItemList["+ k +"].ProductInfo.IconText"));
					productInfo.setProductType(_ctx.stringValue("ListMenuDataResponse.Data["+ i +"].ProductCombineList["+ j +"].ProductItemList["+ k +"].ProductInfo.ProductType"));
					productInfo.setTemperature(_ctx.stringValue("ListMenuDataResponse.Data["+ i +"].ProductCombineList["+ j +"].ProductItemList["+ k +"].ProductInfo.Temperature"));
					productInfo.setOriginalPrice(_ctx.stringValue("ListMenuDataResponse.Data["+ i +"].ProductCombineList["+ j +"].ProductItemList["+ k +"].ProductInfo.OriginalPrice"));
					productInfo.setCurrentPrice(_ctx.stringValue("ListMenuDataResponse.Data["+ i +"].ProductCombineList["+ j +"].ProductItemList["+ k +"].ProductInfo.CurrentPrice"));
					productItemListItem.setProductInfo(productInfo);

					productItemList.add(productItemListItem);
				}
				productCombineListItem.setProductItemList(productItemList);

				productCombineList.add(productCombineListItem);
			}
			dataItem.setProductCombineList(productCombineList);

			data.add(dataItem);
		}
		listMenuDataResponse.setData(data);
	 
	 	return listMenuDataResponse;
	}
}