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

import com.aliyuncs.retailcloud.model.v20180313.ListAppResourceAllocsResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListAppResourceAllocsResponse.ListAppResourceAllocResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppResourceAllocsResponseUnmarshaller {

	public static ListAppResourceAllocsResponse unmarshall(ListAppResourceAllocsResponse listAppResourceAllocsResponse, UnmarshallerContext _ctx) {
		
		listAppResourceAllocsResponse.setRequestId(_ctx.stringValue("ListAppResourceAllocsResponse.RequestId"));
		listAppResourceAllocsResponse.setCode(_ctx.integerValue("ListAppResourceAllocsResponse.Code"));
		listAppResourceAllocsResponse.setErrorMsg(_ctx.stringValue("ListAppResourceAllocsResponse.ErrorMsg"));
		listAppResourceAllocsResponse.setPageNumber(_ctx.integerValue("ListAppResourceAllocsResponse.PageNumber"));
		listAppResourceAllocsResponse.setPageSize(_ctx.integerValue("ListAppResourceAllocsResponse.PageSize"));
		listAppResourceAllocsResponse.setTotalCount(_ctx.longValue("ListAppResourceAllocsResponse.TotalCount"));

		List<ListAppResourceAllocResponse> data = new ArrayList<ListAppResourceAllocResponse>();
		for (int i = 0; i < _ctx.lengthValue("ListAppResourceAllocsResponse.Data.Length"); i++) {
			ListAppResourceAllocResponse listAppResourceAllocResponse = new ListAppResourceAllocResponse();
			listAppResourceAllocResponse.setAppEnvId(_ctx.longValue("ListAppResourceAllocsResponse.Data["+ i +"].AppEnvId"));
			listAppResourceAllocResponse.setAppId(_ctx.longValue("ListAppResourceAllocsResponse.Data["+ i +"].AppId"));
			listAppResourceAllocResponse.setClusterId(_ctx.stringValue("ListAppResourceAllocsResponse.Data["+ i +"].ClusterId"));
			listAppResourceAllocResponse.setId(_ctx.longValue("ListAppResourceAllocsResponse.Data["+ i +"].Id"));
			listAppResourceAllocResponse.setResourceDef(_ctx.stringValue("ListAppResourceAllocsResponse.Data["+ i +"].ResourceDef"));

			data.add(listAppResourceAllocResponse);
		}
		listAppResourceAllocsResponse.setData(data);
	 
	 	return listAppResourceAllocsResponse;
	}
}