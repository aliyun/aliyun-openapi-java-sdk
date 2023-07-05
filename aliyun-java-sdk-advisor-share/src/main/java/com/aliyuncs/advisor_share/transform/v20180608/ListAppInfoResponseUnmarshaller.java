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

import com.aliyuncs.advisor_share.model.v20180608.ListAppInfoResponse;
import com.aliyuncs.advisor_share.model.v20180608.ListAppInfoResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.ListAppInfoResponse.Data.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppInfoResponseUnmarshaller {

	public static ListAppInfoResponse unmarshall(ListAppInfoResponse listAppInfoResponse, UnmarshallerContext _ctx) {
		
		listAppInfoResponse.setRequestId(_ctx.stringValue("ListAppInfoResponse.RequestId"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("ListAppInfoResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("ListAppInfoResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("ListAppInfoResponse.Data.Total"));

		List<Resource> result = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("ListAppInfoResponse.Data.Result.Length"); i++) {
			Resource resource = new Resource();
			resource.setAppId(_ctx.longValue("ListAppInfoResponse.Data.Result["+ i +"].AppId"));
			resource.setAppName(_ctx.stringValue("ListAppInfoResponse.Data.Result["+ i +"].AppName"));
			resource.setResourceCount(_ctx.integerValue("ListAppInfoResponse.Data.Result["+ i +"].ResourceCount"));
			resource.setContactName(_ctx.stringValue("ListAppInfoResponse.Data.Result["+ i +"].ContactName"));
			resource.setContactMobile(_ctx.stringValue("ListAppInfoResponse.Data.Result["+ i +"].ContactMobile"));

			result.add(resource);
		}
		data.setResult(result);
		listAppInfoResponse.setData(data);
	 
	 	return listAppInfoResponse;
	}
}