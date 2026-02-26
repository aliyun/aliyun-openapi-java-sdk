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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paifeaturestore.model.v20230621.ListDatasourcesResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.ListDatasourcesResponse.DatasourcesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDatasourcesResponseUnmarshaller {

	public static ListDatasourcesResponse unmarshall(ListDatasourcesResponse listDatasourcesResponse, UnmarshallerContext _ctx) {
		
		listDatasourcesResponse.setRequestId(_ctx.stringValue("ListDatasourcesResponse.RequestId"));
		listDatasourcesResponse.setTotalCount(_ctx.longValue("ListDatasourcesResponse.TotalCount"));

		List<DatasourcesItem> datasources = new ArrayList<DatasourcesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDatasourcesResponse.Datasources.Length"); i++) {
			DatasourcesItem datasourcesItem = new DatasourcesItem();
			datasourcesItem.setDatasourceId(_ctx.stringValue("ListDatasourcesResponse.Datasources["+ i +"].DatasourceId"));
			datasourcesItem.setName(_ctx.stringValue("ListDatasourcesResponse.Datasources["+ i +"].Name"));
			datasourcesItem.setType(_ctx.stringValue("ListDatasourcesResponse.Datasources["+ i +"].Type"));
			datasourcesItem.setUri(_ctx.stringValue("ListDatasourcesResponse.Datasources["+ i +"].Uri"));
			datasourcesItem.setConfig(_ctx.stringValue("ListDatasourcesResponse.Datasources["+ i +"].Config"));
			datasourcesItem.setGmtCreateTime(_ctx.stringValue("ListDatasourcesResponse.Datasources["+ i +"].GmtCreateTime"));
			datasourcesItem.setGmtModifiedTime(_ctx.stringValue("ListDatasourcesResponse.Datasources["+ i +"].GmtModifiedTime"));
			datasourcesItem.setWorkspaceId(_ctx.stringValue("ListDatasourcesResponse.Datasources["+ i +"].WorkspaceId"));

			datasources.add(datasourcesItem);
		}
		listDatasourcesResponse.setDatasources(datasources);
	 
	 	return listDatasourcesResponse;
	}
}