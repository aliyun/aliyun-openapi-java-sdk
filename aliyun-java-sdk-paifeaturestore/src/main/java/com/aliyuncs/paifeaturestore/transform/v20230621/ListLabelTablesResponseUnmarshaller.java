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

import com.aliyuncs.paifeaturestore.model.v20230621.ListLabelTablesResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.ListLabelTablesResponse.LabelTable;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLabelTablesResponseUnmarshaller {

	public static ListLabelTablesResponse unmarshall(ListLabelTablesResponse listLabelTablesResponse, UnmarshallerContext _ctx) {
		
		listLabelTablesResponse.setRequestId(_ctx.stringValue("ListLabelTablesResponse.RequestId"));
		listLabelTablesResponse.setTotalCount(_ctx.longValue("ListLabelTablesResponse.TotalCount"));

		List<LabelTable> labelTables = new ArrayList<LabelTable>();
		for (int i = 0; i < _ctx.lengthValue("ListLabelTablesResponse.LabelTables.Length"); i++) {
			LabelTable labelTable = new LabelTable();
			labelTable.setLabelTableId(_ctx.stringValue("ListLabelTablesResponse.LabelTables["+ i +"].LabelTableId"));
			labelTable.setProjectId(_ctx.stringValue("ListLabelTablesResponse.LabelTables["+ i +"].ProjectId"));
			labelTable.setProjectName(_ctx.stringValue("ListLabelTablesResponse.LabelTables["+ i +"].ProjectName"));
			labelTable.setDatasourceId(_ctx.stringValue("ListLabelTablesResponse.LabelTables["+ i +"].DatasourceId"));
			labelTable.setName(_ctx.stringValue("ListLabelTablesResponse.LabelTables["+ i +"].Name"));
			labelTable.setDatasourceName(_ctx.stringValue("ListLabelTablesResponse.LabelTables["+ i +"].DatasourceName"));
			labelTable.setOwner(_ctx.stringValue("ListLabelTablesResponse.LabelTables["+ i +"].Owner"));
			labelTable.setGmtCreateTime(_ctx.stringValue("ListLabelTablesResponse.LabelTables["+ i +"].GmtCreateTime"));
			labelTable.setGmtModifiedTime(_ctx.stringValue("ListLabelTablesResponse.LabelTables["+ i +"].GmtModifiedTime"));

			labelTables.add(labelTable);
		}
		listLabelTablesResponse.setLabelTables(labelTables);
	 
	 	return listLabelTablesResponse;
	}
}