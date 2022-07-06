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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListSceneItemsResponse;
import com.aliyuncs.airec.model.v20201126.ListSceneItemsResponse.Result;
import com.aliyuncs.airec.model.v20201126.ListSceneItemsResponse.Result.DetailItem;
import com.aliyuncs.airec.model.v20201126.ListSceneItemsResponse.Result.Total;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSceneItemsResponseUnmarshaller {

	public static ListSceneItemsResponse unmarshall(ListSceneItemsResponse listSceneItemsResponse, UnmarshallerContext _ctx) {
		
		listSceneItemsResponse.setCode(_ctx.stringValue("ListSceneItemsResponse.code"));
		listSceneItemsResponse.setRequestId(_ctx.stringValue("ListSceneItemsResponse.requestId"));
		listSceneItemsResponse.setMessage(_ctx.stringValue("ListSceneItemsResponse.message"));

		Result result = new Result();

		Total total = new Total();
		total.setTotalCount(_ctx.longValue("ListSceneItemsResponse.result.total.totalCount"));
		total.setSceneWeightItem(_ctx.longValue("ListSceneItemsResponse.result.total.sceneWeightItem"));
		total.setSceneRecommendItem(_ctx.longValue("ListSceneItemsResponse.result.total.sceneRecommendItem"));
		total.setWeightItem(_ctx.longValue("ListSceneItemsResponse.result.total.weightItem"));
		total.setInstanceRecommendItem(_ctx.longValue("ListSceneItemsResponse.result.total.instanceRecommendItem"));
		result.setTotal(total);

		List<DetailItem> detail = new ArrayList<DetailItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSceneItemsResponse.result.detail.Length"); i++) {
			DetailItem detailItem = new DetailItem();
			detailItem.setTitle(_ctx.stringValue("ListSceneItemsResponse.result.detail["+ i +"].title"));
			detailItem.setCategoryPath(_ctx.stringValue("ListSceneItemsResponse.result.detail["+ i +"].categoryPath"));
			detailItem.setItemId(_ctx.stringValue("ListSceneItemsResponse.result.detail["+ i +"].itemId"));
			detailItem.setItemType(_ctx.stringValue("ListSceneItemsResponse.result.detail["+ i +"].itemType"));
			detailItem.setStatus(_ctx.stringValue("ListSceneItemsResponse.result.detail["+ i +"].status"));
			detailItem.setBrandId(_ctx.stringValue("ListSceneItemsResponse.result.detail["+ i +"].brandId"));
			detailItem.setShopId(_ctx.stringValue("ListSceneItemsResponse.result.detail["+ i +"].shopId"));
			detailItem.setPubTime(_ctx.stringValue("ListSceneItemsResponse.result.detail["+ i +"].pubTime"));
			detailItem.setChannel(_ctx.stringValue("ListSceneItemsResponse.result.detail["+ i +"].channel"));
			detailItem.setDuration(_ctx.stringValue("ListSceneItemsResponse.result.detail["+ i +"].duration"));
			detailItem.setAuthor(_ctx.stringValue("ListSceneItemsResponse.result.detail["+ i +"].author"));
			detailItem.setExpireTime(_ctx.stringValue("ListSceneItemsResponse.result.detail["+ i +"].expireTime"));

			detail.add(detailItem);
		}
		result.setDetail(detail);
		listSceneItemsResponse.setResult(result);
	 
	 	return listSceneItemsResponse;
	}
}