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

package com.aliyuncs.dashscope.transform.v20230320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dashscope.model.v20230320.ListApiKeysResponse;
import com.aliyuncs.dashscope.model.v20230320.ListApiKeysResponse.Data;
import com.aliyuncs.dashscope.model.v20230320.ListApiKeysResponse.Data.ApiKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApiKeysResponseUnmarshaller {

	public static ListApiKeysResponse unmarshall(ListApiKeysResponse listApiKeysResponse, UnmarshallerContext _ctx) {
		
		listApiKeysResponse.setRequestId(_ctx.stringValue("ListApiKeysResponse.RequestId"));
		listApiKeysResponse.setAccessDeniedDetail(_ctx.stringValue("ListApiKeysResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("ListApiKeysResponse.Data.Total"));
		data.setPageSize(_ctx.longValue("ListApiKeysResponse.Data.PageSize"));
		data.setPageNo(_ctx.longValue("ListApiKeysResponse.Data.PageNo"));

		List<ApiKey> apiKeys = new ArrayList<ApiKey>();
		for (int i = 0; i < _ctx.lengthValue("ListApiKeysResponse.Data.ApiKeys.Length"); i++) {
			ApiKey apiKey = new ApiKey();
			apiKey.setId(_ctx.longValue("ListApiKeysResponse.Data.ApiKeys["+ i +"].Id"));
			apiKey.setUserId(_ctx.stringValue("ListApiKeysResponse.Data.ApiKeys["+ i +"].UserId"));
			apiKey.setApiKey(_ctx.stringValue("ListApiKeysResponse.Data.ApiKeys["+ i +"].ApiKey"));
			apiKey.setGmtCreate(_ctx.stringValue("ListApiKeysResponse.Data.ApiKeys["+ i +"].GmtCreate"));
			apiKey.setGmtExpire(_ctx.stringValue("ListApiKeysResponse.Data.ApiKeys["+ i +"].GmtExpire"));
			apiKey.setLatestActiveTime(_ctx.stringValue("ListApiKeysResponse.Data.ApiKeys["+ i +"].LatestActiveTime"));
			apiKey.setDeleted(_ctx.booleanValue("ListApiKeysResponse.Data.ApiKeys["+ i +"].Deleted"));

			apiKeys.add(apiKey);
		}
		data.setApiKeys(apiKeys);
		listApiKeysResponse.setData(data);
	 
	 	return listApiKeysResponse;
	}
}