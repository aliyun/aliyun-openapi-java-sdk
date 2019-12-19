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

package com.aliyuncs.reid.transform.v20190928;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid.model.v20190928.ListStoreResponse;
import com.aliyuncs.reid.model.v20190928.ListStoreResponse.OpenStore;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStoreResponseUnmarshaller {

	public static ListStoreResponse unmarshall(ListStoreResponse listStoreResponse, UnmarshallerContext _ctx) {
		
		listStoreResponse.setRequestId(_ctx.stringValue("ListStoreResponse.RequestId"));
		listStoreResponse.setErrorCode(_ctx.stringValue("ListStoreResponse.ErrorCode"));
		listStoreResponse.setErrorMessage(_ctx.stringValue("ListStoreResponse.ErrorMessage"));
		listStoreResponse.setSuccess(_ctx.booleanValue("ListStoreResponse.Success"));

		List<OpenStore> stores = new ArrayList<OpenStore>();
		for (int i = 0; i < _ctx.lengthValue("ListStoreResponse.Stores.Length"); i++) {
			OpenStore openStore = new OpenStore();
			openStore.setStoreId(_ctx.longValue("ListStoreResponse.Stores["+ i +"].StoreId"));
			openStore.setGmtCreate(_ctx.longValue("ListStoreResponse.Stores["+ i +"].GmtCreate"));
			openStore.setSqm(_ctx.floatValue("ListStoreResponse.Stores["+ i +"].Sqm"));
			openStore.setStatus(_ctx.integerValue("ListStoreResponse.Stores["+ i +"].Status"));
			openStore.setName(_ctx.stringValue("ListStoreResponse.Stores["+ i +"].Name"));
			openStore.setOpeningEndTime(_ctx.stringValue("ListStoreResponse.Stores["+ i +"].OpeningEndTime"));
			openStore.setOpeningStartTime(_ctx.stringValue("ListStoreResponse.Stores["+ i +"].OpeningStartTime"));
			openStore.setStoreType(_ctx.stringValue("ListStoreResponse.Stores["+ i +"].StoreType"));
			openStore.setGmtModified(_ctx.longValue("ListStoreResponse.Stores["+ i +"].GmtModified"));
			openStore.setAddress(_ctx.stringValue("ListStoreResponse.Stores["+ i +"].Address"));

			stores.add(openStore);
		}
		listStoreResponse.setStores(stores);
	 
	 	return listStoreResponse;
	}
}