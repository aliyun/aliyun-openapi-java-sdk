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

import com.aliyuncs.linkedmall.model.v20180116.ModifyBasicAndBizItemsResponse;
import com.aliyuncs.linkedmall.model.v20180116.ModifyBasicAndBizItemsResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyBasicAndBizItemsResponseUnmarshaller {

	public static ModifyBasicAndBizItemsResponse unmarshall(ModifyBasicAndBizItemsResponse modifyBasicAndBizItemsResponse, UnmarshallerContext _ctx) {
		
		modifyBasicAndBizItemsResponse.setRequestId(_ctx.stringValue("ModifyBasicAndBizItemsResponse.RequestId"));
		modifyBasicAndBizItemsResponse.setCode(_ctx.stringValue("ModifyBasicAndBizItemsResponse.Code"));
		modifyBasicAndBizItemsResponse.setMessage(_ctx.stringValue("ModifyBasicAndBizItemsResponse.Message"));

		List<Item> failedItemList = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ModifyBasicAndBizItemsResponse.FailedItemList.Length"); i++) {
			Item item = new Item();
			item.setItemId(_ctx.longValue("ModifyBasicAndBizItemsResponse.FailedItemList["+ i +"].ItemId"));
			item.setLmItemId(_ctx.stringValue("ModifyBasicAndBizItemsResponse.FailedItemList["+ i +"].LmItemId"));

			List<String> skuIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ModifyBasicAndBizItemsResponse.FailedItemList["+ i +"].SkuIdList.Length"); j++) {
				skuIdList.add(_ctx.stringValue("ModifyBasicAndBizItemsResponse.FailedItemList["+ i +"].SkuIdList["+ j +"]"));
			}
			item.setSkuIdList(skuIdList);

			failedItemList.add(item);
		}
		modifyBasicAndBizItemsResponse.setFailedItemList(failedItemList);
	 
	 	return modifyBasicAndBizItemsResponse;
	}
}