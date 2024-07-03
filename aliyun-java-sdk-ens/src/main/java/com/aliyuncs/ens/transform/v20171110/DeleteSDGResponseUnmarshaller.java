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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DeleteSDGResponse;
import com.aliyuncs.ens.model.v20171110.DeleteSDGResponse.Data;
import com.aliyuncs.ens.model.v20171110.DeleteSDGResponse.Data.Result;
import com.aliyuncs.ens.model.v20171110.DeleteSDGResponse.Data.Result.FailedItemsItem;
import com.aliyuncs.ens.model.v20171110.DeleteSDGResponse.Data.Result.FailedItemsItem.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSDGResponseUnmarshaller {

	public static DeleteSDGResponse unmarshall(DeleteSDGResponse deleteSDGResponse, UnmarshallerContext _ctx) {
		
		deleteSDGResponse.setRequestId(_ctx.stringValue("DeleteSDGResponse.RequestId"));

		Data data = new Data();
		data.setMessage(_ctx.stringValue("DeleteSDGResponse.Data.Message"));
		data.setSuccess(_ctx.booleanValue("DeleteSDGResponse.Data.Success"));

		Result result = new Result();
		result.setFailedCount(_ctx.longValue("DeleteSDGResponse.Data.Result.FailedCount"));
		result.setSuccessCount(_ctx.longValue("DeleteSDGResponse.Data.Result.SuccessCount"));

		List<FailedItemsItem> failedItems = new ArrayList<FailedItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DeleteSDGResponse.Data.Result.FailedItems.Length"); i++) {
			FailedItemsItem failedItemsItem = new FailedItemsItem();
			failedItemsItem.setErrMessage(_ctx.stringValue("DeleteSDGResponse.Data.Result.FailedItems["+ i +"].ErrMessage"));

			Item item = new Item();
			item.setSdgId(_ctx.stringValue("DeleteSDGResponse.Data.Result.FailedItems["+ i +"].Item.SdgId"));
			failedItemsItem.setItem(item);

			failedItems.add(failedItemsItem);
		}
		result.setFailedItems(failedItems);
		data.setResult(result);
		deleteSDGResponse.setData(data);
	 
	 	return deleteSDGResponse;
	}
}