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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListFlashSmsApplicationsResponse;
import com.aliyuncs.ccc.model.v20200701.ListFlashSmsApplicationsResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListFlashSmsApplicationsResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlashSmsApplicationsResponseUnmarshaller {

	public static ListFlashSmsApplicationsResponse unmarshall(ListFlashSmsApplicationsResponse listFlashSmsApplicationsResponse, UnmarshallerContext _ctx) {
		
		listFlashSmsApplicationsResponse.setRequestId(_ctx.stringValue("ListFlashSmsApplicationsResponse.RequestId"));
		listFlashSmsApplicationsResponse.setHttpStatusCode(_ctx.integerValue("ListFlashSmsApplicationsResponse.HttpStatusCode"));
		listFlashSmsApplicationsResponse.setCode(_ctx.stringValue("ListFlashSmsApplicationsResponse.Code"));
		listFlashSmsApplicationsResponse.setMessage(_ctx.stringValue("ListFlashSmsApplicationsResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListFlashSmsApplicationsResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ListFlashSmsApplicationsResponse.Params["+ i +"]"));
		}
		listFlashSmsApplicationsResponse.setParams(params);

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListFlashSmsApplicationsResponse.Data.TotalCount"));
		data.setPageNumber(_ctx.integerValue("ListFlashSmsApplicationsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListFlashSmsApplicationsResponse.Data.PageSize"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFlashSmsApplicationsResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setInstanceId(_ctx.stringValue("ListFlashSmsApplicationsResponse.Data.List["+ i +"].InstanceId"));
			listItem.setProviderId(_ctx.stringValue("ListFlashSmsApplicationsResponse.Data.List["+ i +"].ProviderId"));
			listItem.setApplicationId(_ctx.stringValue("ListFlashSmsApplicationsResponse.Data.List["+ i +"].ApplicationId"));
			listItem.setName(_ctx.stringValue("ListFlashSmsApplicationsResponse.Data.List["+ i +"].Name"));
			listItem.setValue(_ctx.stringValue("ListFlashSmsApplicationsResponse.Data.List["+ i +"].Value"));

			list.add(listItem);
		}
		data.setList(list);
		listFlashSmsApplicationsResponse.setData(data);
	 
	 	return listFlashSmsApplicationsResponse;
	}
}