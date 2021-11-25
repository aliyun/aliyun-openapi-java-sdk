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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.AddWatchItemsResponse;
import com.aliyuncs.vcs.model.v20200515.AddWatchItemsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddWatchItemsResponseUnmarshaller {

	public static AddWatchItemsResponse unmarshall(AddWatchItemsResponse addWatchItemsResponse, UnmarshallerContext _ctx) {
		
		addWatchItemsResponse.setRequestId(_ctx.stringValue("AddWatchItemsResponse.RequestId"));
		addWatchItemsResponse.setSuccess(_ctx.booleanValue("AddWatchItemsResponse.Success"));
		addWatchItemsResponse.setCode(_ctx.stringValue("AddWatchItemsResponse.Code"));
		addWatchItemsResponse.setMessage(_ctx.stringValue("AddWatchItemsResponse.Message"));

		Data data = new Data();
		data.setAddedItemIds(_ctx.stringValue("AddWatchItemsResponse.Data.AddedItemIds"));
		data.setFailedItemIds(_ctx.stringValue("AddWatchItemsResponse.Data.FailedItemIds"));
		addWatchItemsResponse.setData(data);
	 
	 	return addWatchItemsResponse;
	}
}