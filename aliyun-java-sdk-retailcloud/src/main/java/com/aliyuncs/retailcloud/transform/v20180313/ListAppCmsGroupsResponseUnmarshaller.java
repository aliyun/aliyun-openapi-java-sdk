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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.ListAppCmsGroupsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppCmsGroupsResponseUnmarshaller {

	public static ListAppCmsGroupsResponse unmarshall(ListAppCmsGroupsResponse listAppCmsGroupsResponse, UnmarshallerContext _ctx) {
		
		listAppCmsGroupsResponse.setRequestId(_ctx.stringValue("ListAppCmsGroupsResponse.RequestId"));
		listAppCmsGroupsResponse.setCode(_ctx.integerValue("ListAppCmsGroupsResponse.Code"));
		listAppCmsGroupsResponse.setErrorMsg(_ctx.stringValue("ListAppCmsGroupsResponse.ErrorMsg"));
		listAppCmsGroupsResponse.setPageNumber(_ctx.integerValue("ListAppCmsGroupsResponse.PageNumber"));
		listAppCmsGroupsResponse.setPageSize(_ctx.integerValue("ListAppCmsGroupsResponse.PageSize"));
		listAppCmsGroupsResponse.setTotalCount(_ctx.longValue("ListAppCmsGroupsResponse.TotalCount"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAppCmsGroupsResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("ListAppCmsGroupsResponse.Data["+ i +"]"));
		}
		listAppCmsGroupsResponse.setData(data);
	 
	 	return listAppCmsGroupsResponse;
	}
}