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

import com.aliyuncs.ens.model.v20171110.RemoveInstanceSDGResponse;
import com.aliyuncs.ens.model.v20171110.RemoveInstanceSDGResponse.Data;
import com.aliyuncs.ens.model.v20171110.RemoveInstanceSDGResponse.Data.Result;
import com.aliyuncs.ens.model.v20171110.RemoveInstanceSDGResponse.Data.Result.FailedItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveInstanceSDGResponseUnmarshaller {

	public static RemoveInstanceSDGResponse unmarshall(RemoveInstanceSDGResponse removeInstanceSDGResponse, UnmarshallerContext _ctx) {
		
		removeInstanceSDGResponse.setRequestId(_ctx.stringValue("RemoveInstanceSDGResponse.RequestId"));
		removeInstanceSDGResponse.setCode(_ctx.integerValue("RemoveInstanceSDGResponse.Code"));

		Data data = new Data();
		data.setMessage(_ctx.stringValue("RemoveInstanceSDGResponse.Data.Message"));
		data.setSuccess(_ctx.booleanValue("RemoveInstanceSDGResponse.Data.Success"));

		Result result = new Result();
		result.setFailedCount(_ctx.longValue("RemoveInstanceSDGResponse.Data.Result.FailedCount"));
		result.setSuccessCount(_ctx.longValue("RemoveInstanceSDGResponse.Data.Result.SuccessCount"));

		List<FailedItemsItem> failedItems = new ArrayList<FailedItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("RemoveInstanceSDGResponse.Data.Result.FailedItems.Length"); i++) {
			FailedItemsItem failedItemsItem = new FailedItemsItem();
			failedItemsItem.setErrMessage(_ctx.stringValue("RemoveInstanceSDGResponse.Data.Result.FailedItems["+ i +"].ErrMessage"));
			failedItemsItem.setInstanceId(_ctx.stringValue("RemoveInstanceSDGResponse.Data.Result.FailedItems["+ i +"].InstanceId"));

			failedItems.add(failedItemsItem);
		}
		result.setFailedItems(failedItems);
		data.setResult(result);
		removeInstanceSDGResponse.setData(data);
	 
	 	return removeInstanceSDGResponse;
	}
}