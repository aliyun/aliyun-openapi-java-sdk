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

import com.aliyuncs.ens.model.v20171110.UnmountInstanceSDGResponse;
import com.aliyuncs.ens.model.v20171110.UnmountInstanceSDGResponse.Data;
import com.aliyuncs.ens.model.v20171110.UnmountInstanceSDGResponse.Data.Result;
import com.aliyuncs.ens.model.v20171110.UnmountInstanceSDGResponse.Data.Result.FailedItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnmountInstanceSDGResponseUnmarshaller {

	public static UnmountInstanceSDGResponse unmarshall(UnmountInstanceSDGResponse unmountInstanceSDGResponse, UnmarshallerContext _ctx) {
		
		unmountInstanceSDGResponse.setRequestId(_ctx.stringValue("UnmountInstanceSDGResponse.RequestId"));

		Data data = new Data();
		data.setMessage(_ctx.stringValue("UnmountInstanceSDGResponse.Data.Message"));
		data.setSuccess(_ctx.booleanValue("UnmountInstanceSDGResponse.Data.Success"));

		Result result = new Result();
		result.setFailedCount(_ctx.longValue("UnmountInstanceSDGResponse.Data.Result.FailedCount"));
		result.setSuccessCount(_ctx.longValue("UnmountInstanceSDGResponse.Data.Result.SuccessCount"));

		List<FailedItem> failedItems = new ArrayList<FailedItem>();
		for (int i = 0; i < _ctx.lengthValue("UnmountInstanceSDGResponse.Data.Result.FailedItems.Length"); i++) {
			FailedItem failedItem = new FailedItem();
			failedItem.setErrMessage(_ctx.stringValue("UnmountInstanceSDGResponse.Data.Result.FailedItems["+ i +"].ErrMessage"));
			failedItem.setInstanceId(_ctx.stringValue("UnmountInstanceSDGResponse.Data.Result.FailedItems["+ i +"].InstanceId"));

			failedItems.add(failedItem);
		}
		result.setFailedItems(failedItems);
		data.setResult(result);
		unmountInstanceSDGResponse.setData(data);
	 
	 	return unmountInstanceSDGResponse;
	}
}