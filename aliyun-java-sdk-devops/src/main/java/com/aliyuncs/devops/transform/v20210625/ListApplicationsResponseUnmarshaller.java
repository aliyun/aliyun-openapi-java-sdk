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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListApplicationsResponse;
import com.aliyuncs.devops.model.v20210625.ListApplicationsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationsResponseUnmarshaller {

	public static ListApplicationsResponse unmarshall(ListApplicationsResponse listApplicationsResponse, UnmarshallerContext _ctx) {
		
		listApplicationsResponse.setNextToken(_ctx.stringValue("ListApplicationsResponse.nextToken"));
		listApplicationsResponse.setRequestId(_ctx.stringValue("ListApplicationsResponse.requestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationsResponse.data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreatorAccountId(_ctx.stringValue("ListApplicationsResponse.data["+ i +"].creatorAccountId"));
			dataItem.setName(_ctx.stringValue("ListApplicationsResponse.data["+ i +"].name"));
			dataItem.setGmtCreate(_ctx.stringValue("ListApplicationsResponse.data["+ i +"].gmtCreate"));
			dataItem.setDescription(_ctx.stringValue("ListApplicationsResponse.data["+ i +"].description"));

			data.add(dataItem);
		}
		listApplicationsResponse.setData(data);
	 
	 	return listApplicationsResponse;
	}
}