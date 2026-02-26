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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.GetSupabaseProjectApiKeysResponse;
import com.aliyuncs.gpdb.model.v20160503.GetSupabaseProjectApiKeysResponse.ApiKeysItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSupabaseProjectApiKeysResponseUnmarshaller {

	public static GetSupabaseProjectApiKeysResponse unmarshall(GetSupabaseProjectApiKeysResponse getSupabaseProjectApiKeysResponse, UnmarshallerContext _ctx) {
		
		getSupabaseProjectApiKeysResponse.setRequestId(_ctx.stringValue("GetSupabaseProjectApiKeysResponse.RequestId"));

		List<ApiKeysItem> apiKeys = new ArrayList<ApiKeysItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSupabaseProjectApiKeysResponse.ApiKeys.Length"); i++) {
			ApiKeysItem apiKeysItem = new ApiKeysItem();
			apiKeysItem.setApiKey(_ctx.stringValue("GetSupabaseProjectApiKeysResponse.ApiKeys["+ i +"].ApiKey"));
			apiKeysItem.setName(_ctx.stringValue("GetSupabaseProjectApiKeysResponse.ApiKeys["+ i +"].Name"));

			apiKeys.add(apiKeysItem);
		}
		getSupabaseProjectApiKeysResponse.setApiKeys(apiKeys);
	 
	 	return getSupabaseProjectApiKeysResponse;
	}
}