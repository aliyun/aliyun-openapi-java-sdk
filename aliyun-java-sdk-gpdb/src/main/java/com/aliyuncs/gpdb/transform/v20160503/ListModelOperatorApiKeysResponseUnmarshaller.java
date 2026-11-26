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

import com.aliyuncs.gpdb.model.v20160503.ListModelOperatorApiKeysResponse;
import com.aliyuncs.gpdb.model.v20160503.ListModelOperatorApiKeysResponse.ApiKeysItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListModelOperatorApiKeysResponseUnmarshaller {

	public static ListModelOperatorApiKeysResponse unmarshall(ListModelOperatorApiKeysResponse listModelOperatorApiKeysResponse, UnmarshallerContext _ctx) {
		
		listModelOperatorApiKeysResponse.setRequestId(_ctx.stringValue("ListModelOperatorApiKeysResponse.RequestId"));
		listModelOperatorApiKeysResponse.setTotalRecordCount(_ctx.integerValue("ListModelOperatorApiKeysResponse.TotalRecordCount"));
		listModelOperatorApiKeysResponse.setPageRecordCount(_ctx.integerValue("ListModelOperatorApiKeysResponse.PageRecordCount"));
		listModelOperatorApiKeysResponse.setPageNumber(_ctx.integerValue("ListModelOperatorApiKeysResponse.PageNumber"));

		List<ApiKeysItem> apiKeys = new ArrayList<ApiKeysItem>();
		for (int i = 0; i < _ctx.lengthValue("ListModelOperatorApiKeysResponse.ApiKeys.Length"); i++) {
			ApiKeysItem apiKeysItem = new ApiKeysItem();
			apiKeysItem.setStatus(_ctx.stringValue("ListModelOperatorApiKeysResponse.ApiKeys["+ i +"].Status"));
			apiKeysItem.setApiKeyId(_ctx.integerValue("ListModelOperatorApiKeysResponse.ApiKeys["+ i +"].ApiKeyId"));
			apiKeysItem.setDescription(_ctx.stringValue("ListModelOperatorApiKeysResponse.ApiKeys["+ i +"].Description"));
			apiKeysItem.setEndpoint(_ctx.stringValue("ListModelOperatorApiKeysResponse.ApiKeys["+ i +"].Endpoint"));
			apiKeysItem.setCreateTime(_ctx.stringValue("ListModelOperatorApiKeysResponse.ApiKeys["+ i +"].CreateTime"));

			apiKeys.add(apiKeysItem);
		}
		listModelOperatorApiKeysResponse.setApiKeys(apiKeys);
	 
	 	return listModelOperatorApiKeysResponse;
	}
}