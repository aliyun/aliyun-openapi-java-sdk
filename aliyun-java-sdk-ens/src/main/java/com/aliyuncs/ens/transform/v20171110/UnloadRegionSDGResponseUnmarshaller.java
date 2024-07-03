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

import com.aliyuncs.ens.model.v20171110.UnloadRegionSDGResponse;
import com.aliyuncs.ens.model.v20171110.UnloadRegionSDGResponse.Data;
import com.aliyuncs.ens.model.v20171110.UnloadRegionSDGResponse.Data.Result;
import com.aliyuncs.ens.model.v20171110.UnloadRegionSDGResponse.Data.Result.FailedItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnloadRegionSDGResponseUnmarshaller {

	public static UnloadRegionSDGResponse unmarshall(UnloadRegionSDGResponse unloadRegionSDGResponse, UnmarshallerContext _ctx) {
		
		unloadRegionSDGResponse.setRequestId(_ctx.stringValue("UnloadRegionSDGResponse.RequestId"));

		Data data = new Data();
		data.setMessage(_ctx.stringValue("UnloadRegionSDGResponse.Data.Message"));
		data.setSuccess(_ctx.booleanValue("UnloadRegionSDGResponse.Data.Success"));

		Result result = new Result();
		result.setFailedCount(_ctx.longValue("UnloadRegionSDGResponse.Data.Result.FailedCount"));
		result.setSuccessCount(_ctx.longValue("UnloadRegionSDGResponse.Data.Result.SuccessCount"));

		List<FailedItemsItem> failedItems = new ArrayList<FailedItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("UnloadRegionSDGResponse.Data.Result.FailedItems.Length"); i++) {
			FailedItemsItem failedItemsItem = new FailedItemsItem();
			failedItemsItem.setErrorMessage(_ctx.stringValue("UnloadRegionSDGResponse.Data.Result.FailedItems["+ i +"].ErrorMessage"));
			failedItemsItem.setDestinationRegionId(_ctx.stringValue("UnloadRegionSDGResponse.Data.Result.FailedItems["+ i +"].DestinationRegionId"));

			failedItems.add(failedItemsItem);
		}
		result.setFailedItems(failedItems);
		data.setResult(result);
		unloadRegionSDGResponse.setData(data);
	 
	 	return unloadRegionSDGResponse;
	}
}