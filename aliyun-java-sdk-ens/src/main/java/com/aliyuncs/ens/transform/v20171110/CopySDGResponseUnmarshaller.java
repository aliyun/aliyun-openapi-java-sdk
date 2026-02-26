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

import com.aliyuncs.ens.model.v20171110.CopySDGResponse;
import com.aliyuncs.ens.model.v20171110.CopySDGResponse.Data;
import com.aliyuncs.ens.model.v20171110.CopySDGResponse.Data.Result;
import com.aliyuncs.ens.model.v20171110.CopySDGResponse.Data.Result.FailedItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CopySDGResponseUnmarshaller {

	public static CopySDGResponse unmarshall(CopySDGResponse copySDGResponse, UnmarshallerContext _ctx) {
		
		copySDGResponse.setRequestId(_ctx.stringValue("CopySDGResponse.RequestId"));

		Data data = new Data();
		data.setMessage(_ctx.stringValue("CopySDGResponse.Data.Message"));
		data.setSuccess(_ctx.booleanValue("CopySDGResponse.Data.Success"));

		Result result = new Result();
		result.setFailedCount(_ctx.longValue("CopySDGResponse.Data.Result.FailedCount"));
		result.setSuccessCount(_ctx.longValue("CopySDGResponse.Data.Result.SuccessCount"));

		List<FailedItemsItem> failedItems = new ArrayList<FailedItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("CopySDGResponse.Data.Result.FailedItems.Length"); i++) {
			FailedItemsItem failedItemsItem = new FailedItemsItem();
			failedItemsItem.setErrorMessage(_ctx.stringValue("CopySDGResponse.Data.Result.FailedItems["+ i +"].ErrorMessage"));
			failedItemsItem.setDestinationRegionId(_ctx.stringValue("CopySDGResponse.Data.Result.FailedItems["+ i +"].DestinationRegionId"));

			failedItems.add(failedItemsItem);
		}
		result.setFailedItems(failedItems);
		data.setResult(result);
		copySDGResponse.setData(data);
	 
	 	return copySDGResponse;
	}
}