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

import com.aliyuncs.vcs.model.v20200515.RemoveSearchItemsResponse;
import com.aliyuncs.vcs.model.v20200515.RemoveSearchItemsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveSearchItemsResponseUnmarshaller {

	public static RemoveSearchItemsResponse unmarshall(RemoveSearchItemsResponse removeSearchItemsResponse, UnmarshallerContext _ctx) {
		
		removeSearchItemsResponse.setRequestId(_ctx.stringValue("RemoveSearchItemsResponse.RequestId"));
		removeSearchItemsResponse.setSuccess(_ctx.stringValue("RemoveSearchItemsResponse.Success"));
		removeSearchItemsResponse.setCode(_ctx.stringValue("RemoveSearchItemsResponse.Code"));
		removeSearchItemsResponse.setMessage(_ctx.stringValue("RemoveSearchItemsResponse.Message"));

		Data data = new Data();
		data.setDeletedItemIds(_ctx.stringValue("RemoveSearchItemsResponse.Data.DeletedItemIds"));
		data.setFailedItemIds(_ctx.stringValue("RemoveSearchItemsResponse.Data.FailedItemIds"));
		removeSearchItemsResponse.setData(data);
	 
	 	return removeSearchItemsResponse;
	}
}