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

import com.aliyuncs.advisor_share.model.v20180608.ListPrimaryAccountsResponse;
import com.aliyuncs.advisor_share.model.v20180608.ListPrimaryAccountsResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.ListPrimaryAccountsResponse.Data.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrimaryAccountsResponseUnmarshaller {

	public static ListPrimaryAccountsResponse unmarshall(ListPrimaryAccountsResponse listPrimaryAccountsResponse, UnmarshallerContext _ctx) {
		
		listPrimaryAccountsResponse.setRequestId(_ctx.stringValue("ListPrimaryAccountsResponse.RequestId"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("ListPrimaryAccountsResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("ListPrimaryAccountsResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("ListPrimaryAccountsResponse.Data.Total"));

		List<Resource> result = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("ListPrimaryAccountsResponse.Data.Result.Length"); i++) {
			Resource resource = new Resource();
			resource.setId(_ctx.longValue("ListPrimaryAccountsResponse.Data.Result["+ i +"].Id"));
			resource.setPrimaryAliyunId(_ctx.longValue("ListPrimaryAccountsResponse.Data.Result["+ i +"].PrimaryAliyunId"));
			resource.setPrimaryUserName(_ctx.stringValue("ListPrimaryAccountsResponse.Data.Result["+ i +"].PrimaryUserName"));
			resource.setSubAliyunId(_ctx.longValue("ListPrimaryAccountsResponse.Data.Result["+ i +"].SubAliyunId"));
			resource.setSubUserName(_ctx.stringValue("ListPrimaryAccountsResponse.Data.Result["+ i +"].SubUserName"));
			resource.setStatus(_ctx.integerValue("ListPrimaryAccountsResponse.Data.Result["+ i +"].Status"));
			resource.setGmtModified(_ctx.stringValue("ListPrimaryAccountsResponse.Data.Result["+ i +"].GmtModified"));

			result.add(resource);
		}
		data.setResult(result);
		listPrimaryAccountsResponse.setData(data);
	 
	 	return listPrimaryAccountsResponse;
	}
}