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

package com.aliyuncs.mns.transform.v20210319;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mns.model.v20210319.ListLogStoreResponse;
import com.aliyuncs.mns.model.v20210319.ListLogStoreResponse.Data;
import com.aliyuncs.mns.model.v20210319.ListLogStoreResponse.Data.LogStoresItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLogStoreResponseUnmarshaller {

	public static ListLogStoreResponse unmarshall(ListLogStoreResponse listLogStoreResponse, UnmarshallerContext _ctx) {
		
		listLogStoreResponse.setRequestId(_ctx.stringValue("ListLogStoreResponse.RequestId"));
		listLogStoreResponse.setCode(_ctx.longValue("ListLogStoreResponse.Code"));
		listLogStoreResponse.setStatus(_ctx.stringValue("ListLogStoreResponse.Status"));
		listLogStoreResponse.setMessage(_ctx.stringValue("ListLogStoreResponse.Message"));
		listLogStoreResponse.setSuccess(_ctx.booleanValue("ListLogStoreResponse.Success"));

		Data data = new Data();
		data.setProjectName(_ctx.stringValue("ListLogStoreResponse.Data.ProjectName"));

		List<LogStoresItem> logStores = new ArrayList<LogStoresItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLogStoreResponse.Data.LogStores.Length"); i++) {
			LogStoresItem logStoresItem = new LogStoresItem();
			logStoresItem.setLogStoreName(_ctx.stringValue("ListLogStoreResponse.Data.LogStores["+ i +"].LogStoreName"));

			logStores.add(logStoresItem);
		}
		data.setLogStores(logStores);
		listLogStoreResponse.setData(data);
	 
	 	return listLogStoreResponse;
	}
}