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

import com.aliyuncs.vcs.model.v20200515.RemoveWatchItemsResponse;
import com.aliyuncs.vcs.model.v20200515.RemoveWatchItemsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveWatchItemsResponseUnmarshaller {

	public static RemoveWatchItemsResponse unmarshall(RemoveWatchItemsResponse removeWatchItemsResponse, UnmarshallerContext _ctx) {
		
		removeWatchItemsResponse.setRequestId(_ctx.stringValue("RemoveWatchItemsResponse.RequestId"));
		removeWatchItemsResponse.setSuccess(_ctx.booleanValue("RemoveWatchItemsResponse.Success"));
		removeWatchItemsResponse.setCode(_ctx.stringValue("RemoveWatchItemsResponse.Code"));
		removeWatchItemsResponse.setMessage(_ctx.stringValue("RemoveWatchItemsResponse.Message"));

		Data data = new Data();
		data.setDeletedItemIds(_ctx.stringValue("RemoveWatchItemsResponse.Data.DeletedItemIds"));
		data.setFailedItemIds(_ctx.stringValue("RemoveWatchItemsResponse.Data.FailedItemIds"));
		removeWatchItemsResponse.setData(data);
	 
	 	return removeWatchItemsResponse;
	}
}