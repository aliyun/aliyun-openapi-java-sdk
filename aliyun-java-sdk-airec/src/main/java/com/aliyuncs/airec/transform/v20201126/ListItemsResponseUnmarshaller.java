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

import com.aliyuncs.airec.model.v20201126.ListItemsResponse;
import com.aliyuncs.airec.model.v20201126.ListItemsResponse.Result;
import com.aliyuncs.airec.model.v20201126.ListItemsResponse.Result.DetailItem;
import com.aliyuncs.airec.model.v20201126.ListItemsResponse.Result.Total;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListItemsResponseUnmarshaller {

	public static ListItemsResponse unmarshall(ListItemsResponse listItemsResponse, UnmarshallerContext _ctx) {
		
		listItemsResponse.setRequestId(_ctx.stringValue("ListItemsResponse.requestId"));

		Result result = new Result();

		Total total = new Total();
		total.setInstanceRecommendItem(_ctx.longValue("ListItemsResponse.result.total.instanceRecommendItem"));
		total.setQueryCount(_ctx.longValue("ListItemsResponse.result.total.queryCount"));
		total.setSceneRecommendItem(_ctx.longValue("ListItemsResponse.result.total.sceneRecommendItem"));
		total.setSceneWeightItem(_ctx.longValue("ListItemsResponse.result.total.sceneWeightItem"));
		total.setTotalCount(_ctx.longValue("ListItemsResponse.result.total.totalCount"));
		total.setWeightItem(_ctx.longValue("ListItemsResponse.result.total.weightItem"));
		result.setTotal(total);

		List<DetailItem> detail = new ArrayList<DetailItem>();
		for (int i = 0; i < _ctx.lengthValue("ListItemsResponse.result.detail.Length"); i++) {
			DetailItem detailItem = new DetailItem();
			detailItem.setAuthor(_ctx.stringValue("ListItemsResponse.result.detail["+ i +"].author"));
			detailItem.setBrandId(_ctx.stringValue("ListItemsResponse.result.detail["+ i +"].brandId"));
			detailItem.setCategoryPath(_ctx.stringValue("ListItemsResponse.result.detail["+ i +"].categoryPath"));
			detailItem.setChannel(_ctx.stringValue("ListItemsResponse.result.detail["+ i +"].channel"));
			detailItem.setDuration(_ctx.stringValue("ListItemsResponse.result.detail["+ i +"].duration"));
			detailItem.setExpireTime(_ctx.stringValue("ListItemsResponse.result.detail["+ i +"].expireTime"));
			detailItem.setItemId(_ctx.stringValue("ListItemsResponse.result.detail["+ i +"].itemId"));
			detailItem.setItemType(_ctx.stringValue("ListItemsResponse.result.detail["+ i +"].itemType"));
			detailItem.setPubTime(_ctx.stringValue("ListItemsResponse.result.detail["+ i +"].pubTime"));
			detailItem.setShopId(_ctx.stringValue("ListItemsResponse.result.detail["+ i +"].shopId"));
			detailItem.setStatus(_ctx.stringValue("ListItemsResponse.result.detail["+ i +"].status"));
			detailItem.setTitle(_ctx.stringValue("ListItemsResponse.result.detail["+ i +"].title"));

			detail.add(detailItem);
		}
		result.setDetail(detail);
		listItemsResponse.setResult(result);
	 
	 	return listItemsResponse;
	}
}