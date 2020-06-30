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

package com.aliyuncs.airec.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20181012.ListSceneItemsResponse;
import com.aliyuncs.airec.model.v20181012.ListSceneItemsResponse.Result;
import com.aliyuncs.airec.model.v20181012.ListSceneItemsResponse.Result.DetailItem;
import com.aliyuncs.airec.model.v20181012.ListSceneItemsResponse.Result.Total;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSceneItemsResponseUnmarshaller {

	public static ListSceneItemsResponse unmarshall(ListSceneItemsResponse listSceneItemsResponse, UnmarshallerContext _ctx) {
		
		listSceneItemsResponse.setRequestId(_ctx.stringValue("ListSceneItemsResponse.RequestId"));

		Result result = new Result();

		Total total = new Total();
		total.setInstanceRecommendItem(_ctx.longValue("ListSceneItemsResponse.Result.Total.InstanceRecommendItem"));
		total.setSceneRecommendItem(_ctx.longValue("ListSceneItemsResponse.Result.Total.SceneRecommendItem"));
		total.setWeightItem(_ctx.longValue("ListSceneItemsResponse.Result.Total.WeightItem"));
		total.setSceneWeightItem(_ctx.longValue("ListSceneItemsResponse.Result.Total.SceneWeightItem"));
		total.setTotalCount(_ctx.longValue("ListSceneItemsResponse.Result.Total.TotalCount"));
		result.setTotal(total);

		List<DetailItem> detail = new ArrayList<DetailItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSceneItemsResponse.Result.Detail.Length"); i++) {
			DetailItem detailItem = new DetailItem();
			detailItem.setItemId(_ctx.stringValue("ListSceneItemsResponse.Result.Detail["+ i +"].ItemId"));
			detailItem.setItemType(_ctx.stringValue("ListSceneItemsResponse.Result.Detail["+ i +"].ItemType"));
			detailItem.setExpireTime(_ctx.stringValue("ListSceneItemsResponse.Result.Detail["+ i +"].ExpireTime"));
			detailItem.setCategoryPath(_ctx.stringValue("ListSceneItemsResponse.Result.Detail["+ i +"].CategoryPath"));
			detailItem.setPubTime(_ctx.stringValue("ListSceneItemsResponse.Result.Detail["+ i +"].PubTime"));
			detailItem.setBrandId(_ctx.stringValue("ListSceneItemsResponse.Result.Detail["+ i +"].BrandId"));
			detailItem.setShopId(_ctx.stringValue("ListSceneItemsResponse.Result.Detail["+ i +"].ShopId"));
			detailItem.setTitle(_ctx.stringValue("ListSceneItemsResponse.Result.Detail["+ i +"].Title"));
			detailItem.setStatus(_ctx.stringValue("ListSceneItemsResponse.Result.Detail["+ i +"].Status"));
			detailItem.setDuration(_ctx.stringValue("ListSceneItemsResponse.Result.Detail["+ i +"].Duration"));
			detailItem.setAuthor(_ctx.stringValue("ListSceneItemsResponse.Result.Detail["+ i +"].Author"));
			detailItem.setChannel(_ctx.stringValue("ListSceneItemsResponse.Result.Detail["+ i +"].Channel"));

			detail.add(detailItem);
		}
		result.setDetail(detail);
		listSceneItemsResponse.setResult(result);
	 
	 	return listSceneItemsResponse;
	}
}