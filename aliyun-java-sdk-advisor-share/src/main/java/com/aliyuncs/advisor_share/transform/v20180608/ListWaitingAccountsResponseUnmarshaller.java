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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.ListWaitingAccountsResponse;
import com.aliyuncs.advisor_share.model.v20180608.ListWaitingAccountsResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.ListWaitingAccountsResponse.Data.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWaitingAccountsResponseUnmarshaller {

	public static ListWaitingAccountsResponse unmarshall(ListWaitingAccountsResponse listWaitingAccountsResponse, UnmarshallerContext _ctx) {
		
		listWaitingAccountsResponse.setRequestId(_ctx.stringValue("ListWaitingAccountsResponse.RequestId"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("ListWaitingAccountsResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("ListWaitingAccountsResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("ListWaitingAccountsResponse.Data.Total"));

		List<Resource> result = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("ListWaitingAccountsResponse.Data.Result.Length"); i++) {
			Resource resource = new Resource();
			resource.setId(_ctx.longValue("ListWaitingAccountsResponse.Data.Result["+ i +"].Id"));
			resource.setPrimaryAliyunId(_ctx.longValue("ListWaitingAccountsResponse.Data.Result["+ i +"].PrimaryAliyunId"));
			resource.setPrimaryUserName(_ctx.stringValue("ListWaitingAccountsResponse.Data.Result["+ i +"].PrimaryUserName"));
			resource.setSubAliyunId(_ctx.longValue("ListWaitingAccountsResponse.Data.Result["+ i +"].SubAliyunId"));
			resource.setSubUserName(_ctx.stringValue("ListWaitingAccountsResponse.Data.Result["+ i +"].SubUserName"));
			resource.setStatus(_ctx.integerValue("ListWaitingAccountsResponse.Data.Result["+ i +"].Status"));
			resource.setGmtModified(_ctx.stringValue("ListWaitingAccountsResponse.Data.Result["+ i +"].GmtModified"));

			result.add(resource);
		}
		data.setResult(result);
		listWaitingAccountsResponse.setData(data);
	 
	 	return listWaitingAccountsResponse;
	}
}