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

package com.aliyuncs.emap.transform.v20200608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emap.model.v20200608.ListStoresResponse;
import com.aliyuncs.emap.model.v20200608.ListStoresResponse.Store;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStoresResponseUnmarshaller {

	public static ListStoresResponse unmarshall(ListStoresResponse listStoresResponse, UnmarshallerContext _ctx) {
		
		listStoresResponse.setRequestId(_ctx.stringValue("ListStoresResponse.RequestId"));
		listStoresResponse.setMessage(_ctx.stringValue("ListStoresResponse.Message"));
		listStoresResponse.setTotalCount(_ctx.longValue("ListStoresResponse.TotalCount"));
		listStoresResponse.setErrorCode(_ctx.stringValue("ListStoresResponse.ErrorCode"));
		listStoresResponse.setErrorMessage(_ctx.stringValue("ListStoresResponse.ErrorMessage"));
		listStoresResponse.setPageSize(_ctx.integerValue("ListStoresResponse.PageSize"));
		listStoresResponse.setDynamicMessage(_ctx.stringValue("ListStoresResponse.DynamicMessage"));
		listStoresResponse.setSuccess(_ctx.booleanValue("ListStoresResponse.Success"));
		listStoresResponse.setDynamicCode(_ctx.stringValue("ListStoresResponse.DynamicCode"));
		listStoresResponse.setPageNumber(_ctx.integerValue("ListStoresResponse.PageNumber"));
		listStoresResponse.setCode(_ctx.stringValue("ListStoresResponse.Code"));

		List<Store> stores = new ArrayList<Store>();
		for (int i = 0; i < _ctx.lengthValue("ListStoresResponse.Stores.Length"); i++) {
			Store store = new Store();
			store.setName(_ctx.stringValue("ListStoresResponse.Stores["+ i +"].Name"));
			store.setWidth(_ctx.floatValue("ListStoresResponse.Stores["+ i +"].Width"));
			store.setId(_ctx.longValue("ListStoresResponse.Stores["+ i +"].Id"));
			store.setExtId(_ctx.stringValue("ListStoresResponse.Stores["+ i +"].ExtId"));
			store.setHeight(_ctx.floatValue("ListStoresResponse.Stores["+ i +"].Height"));
			store.setDesc(_ctx.stringValue("ListStoresResponse.Stores["+ i +"].Desc"));
			store.setStatus(_ctx.stringValue("ListStoresResponse.Stores["+ i +"].Status"));
			store.setModifiedTime(_ctx.longValue("ListStoresResponse.Stores["+ i +"].ModifiedTime"));
			store.setAddress(_ctx.stringValue("ListStoresResponse.Stores["+ i +"].Address"));
			store.setCreateTime(_ctx.longValue("ListStoresResponse.Stores["+ i +"].CreateTime"));
			store.setCenter(_ctx.stringValue("ListStoresResponse.Stores["+ i +"].Center"));

			stores.add(store);
		}
		listStoresResponse.setStores(stores);
	 
	 	return listStoresResponse;
	}
}