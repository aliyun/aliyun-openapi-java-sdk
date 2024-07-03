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

import com.aliyuncs.ens.model.v20171110.PreloadRegionSDGResponse;
import com.aliyuncs.ens.model.v20171110.PreloadRegionSDGResponse.Data;
import com.aliyuncs.ens.model.v20171110.PreloadRegionSDGResponse.Data.Result;
import com.aliyuncs.ens.model.v20171110.PreloadRegionSDGResponse.Data.Result.FailedItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PreloadRegionSDGResponseUnmarshaller {

	public static PreloadRegionSDGResponse unmarshall(PreloadRegionSDGResponse preloadRegionSDGResponse, UnmarshallerContext _ctx) {
		
		preloadRegionSDGResponse.setRequestId(_ctx.stringValue("PreloadRegionSDGResponse.RequestId"));

		Data data = new Data();
		data.setMessage(_ctx.stringValue("PreloadRegionSDGResponse.Data.Message"));
		data.setSuccess(_ctx.booleanValue("PreloadRegionSDGResponse.Data.Success"));

		Result result = new Result();
		result.setFailedCount(_ctx.longValue("PreloadRegionSDGResponse.Data.Result.FailedCount"));
		result.setSuccessCount(_ctx.longValue("PreloadRegionSDGResponse.Data.Result.SuccessCount"));

		List<FailedItemsItem> failedItems = new ArrayList<FailedItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("PreloadRegionSDGResponse.Data.Result.FailedItems.Length"); i++) {
			FailedItemsItem failedItemsItem = new FailedItemsItem();
			failedItemsItem.setErrorMessage(_ctx.stringValue("PreloadRegionSDGResponse.Data.Result.FailedItems["+ i +"].ErrorMessage"));
			failedItemsItem.setDestinationRegionId(_ctx.stringValue("PreloadRegionSDGResponse.Data.Result.FailedItems["+ i +"].DestinationRegionId"));

			failedItems.add(failedItemsItem);
		}
		result.setFailedItems(failedItems);
		data.setResult(result);
		preloadRegionSDGResponse.setData(data);
	 
	 	return preloadRegionSDGResponse;
	}
}