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

package com.aliyuncs.cloudgame.transform.v20200429;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudgame.model.v20200429.ListProjectsResponse;
import com.aliyuncs.cloudgame.model.v20200429.ListProjectsResponse.DataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectsResponseUnmarshaller {

	public static ListProjectsResponse unmarshall(ListProjectsResponse listProjectsResponse, UnmarshallerContext _ctx) {
		
		listProjectsResponse.setRequestId(_ctx.stringValue("ListProjectsResponse.RequestId"));
		listProjectsResponse.setCount(_ctx.integerValue("ListProjectsResponse.Count"));
		listProjectsResponse.setCurrentPage(_ctx.integerValue("ListProjectsResponse.CurrentPage"));
		listProjectsResponse.setPageSize(_ctx.integerValue("ListProjectsResponse.PageSize"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectsResponse.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setStandardCodeRate(_ctx.stringValue("ListProjectsResponse.DataList["+ i +"].StandardCodeRate"));
			dataListItem.setHighDefinitionResolution(_ctx.stringValue("ListProjectsResponse.DataList["+ i +"].HighDefinitionResolution"));
			dataListItem.setHighDefinitionCodeRate(_ctx.stringValue("ListProjectsResponse.DataList["+ i +"].HighDefinitionCodeRate"));
			dataListItem.setStandardResolution(_ctx.stringValue("ListProjectsResponse.DataList["+ i +"].StandardResolution"));
			dataListItem.setProjectId(_ctx.stringValue("ListProjectsResponse.DataList["+ i +"].ProjectId"));
			dataListItem.setConcurrencyLimitNumber(_ctx.integerValue("ListProjectsResponse.DataList["+ i +"].ConcurrencyLimitNumber"));
			dataListItem.setHighestCodeRate(_ctx.stringValue("ListProjectsResponse.DataList["+ i +"].HighestCodeRate"));
			dataListItem.setProjectName(_ctx.stringValue("ListProjectsResponse.DataList["+ i +"].ProjectName"));
			dataListItem.setHighestResolution(_ctx.stringValue("ListProjectsResponse.DataList["+ i +"].HighestResolution"));

			dataList.add(dataListItem);
		}
		listProjectsResponse.setDataList(dataList);
	 
	 	return listProjectsResponse;
	}
}