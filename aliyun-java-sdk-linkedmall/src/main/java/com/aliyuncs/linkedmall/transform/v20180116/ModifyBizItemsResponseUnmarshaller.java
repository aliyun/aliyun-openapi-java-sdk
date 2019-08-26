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

import com.aliyuncs.linkedmall.model.v20180116.ModifyBizItemsResponse;
import com.aliyuncs.linkedmall.model.v20180116.ModifyBizItemsResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyBizItemsResponseUnmarshaller {

	public static ModifyBizItemsResponse unmarshall(ModifyBizItemsResponse modifyBizItemsResponse, UnmarshallerContext _ctx) {
		
		modifyBizItemsResponse.setRequestId(_ctx.stringValue("ModifyBizItemsResponse.RequestId"));
		modifyBizItemsResponse.setCode(_ctx.stringValue("ModifyBizItemsResponse.Code"));
		modifyBizItemsResponse.setMessage(_ctx.stringValue("ModifyBizItemsResponse.Message"));
		modifyBizItemsResponse.setTotalCount(_ctx.integerValue("ModifyBizItemsResponse.TotalCount"));
		modifyBizItemsResponse.setPageNumber(_ctx.integerValue("ModifyBizItemsResponse.PageNumber"));
		modifyBizItemsResponse.setPageSize(_ctx.integerValue("ModifyBizItemsResponse.PageSize"));

		List<Item> failedItemList = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ModifyBizItemsResponse.FailedItemList.Length"); i++) {
			Item item = new Item();
			item.setItemId(_ctx.longValue("ModifyBizItemsResponse.FailedItemList["+ i +"].ItemId"));

			List<String> skuIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ModifyBizItemsResponse.FailedItemList["+ i +"].SkuIdList.Length"); j++) {
				skuIdList.add(_ctx.stringValue("ModifyBizItemsResponse.FailedItemList["+ i +"].SkuIdList["+ j +"]"));
			}
			item.setSkuIdList(skuIdList);

			failedItemList.add(item);
		}
		modifyBizItemsResponse.setFailedItemList(failedItemList);
	 
	 	return modifyBizItemsResponse;
	}
}