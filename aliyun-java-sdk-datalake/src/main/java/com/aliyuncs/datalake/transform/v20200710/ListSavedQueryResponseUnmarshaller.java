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

package com.aliyuncs.datalake.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datalake.model.v20200710.ListSavedQueryResponse;
import com.aliyuncs.datalake.model.v20200710.ListSavedQueryResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSavedQueryResponseUnmarshaller {

	public static ListSavedQueryResponse unmarshall(ListSavedQueryResponse listSavedQueryResponse, UnmarshallerContext _ctx) {
		
		listSavedQueryResponse.setRequestId(_ctx.stringValue("ListSavedQueryResponse.RequestId"));
		listSavedQueryResponse.setSuccess(_ctx.booleanValue("ListSavedQueryResponse.Success"));
		listSavedQueryResponse.setTotalCount(_ctx.integerValue("ListSavedQueryResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSavedQueryResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreator(_ctx.stringValue("ListSavedQueryResponse.Data["+ i +"].Creator"));
			dataItem.setCreatorLoginName(_ctx.stringValue("ListSavedQueryResponse.Data["+ i +"].CreatorLoginName"));
			dataItem.setSql(_ctx.stringValue("ListSavedQueryResponse.Data["+ i +"].Sql"));
			dataItem.setName(_ctx.stringValue("ListSavedQueryResponse.Data["+ i +"].Name"));
			dataItem.setDescription(_ctx.stringValue("ListSavedQueryResponse.Data["+ i +"].Description"));
			dataItem.setWorkspaceId(_ctx.stringValue("ListSavedQueryResponse.Data["+ i +"].WorkspaceId"));
			dataItem.setGmtCreate(_ctx.stringValue("ListSavedQueryResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListSavedQueryResponse.Data["+ i +"].GmtModified"));
			dataItem.setId(_ctx.stringValue("ListSavedQueryResponse.Data["+ i +"].Id"));
			dataItem.setOwner(_ctx.stringValue("ListSavedQueryResponse.Data["+ i +"].Owner"));
			dataItem.setRegionId(_ctx.stringValue("ListSavedQueryResponse.Data["+ i +"].RegionId"));

			data.add(dataItem);
		}
		listSavedQueryResponse.setData(data);
	 
	 	return listSavedQueryResponse;
	}
}