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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetDWSMetaHierarchyResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSMetaHierarchyResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.GetDWSMetaHierarchyResponse.DataItem.AllColumnItem;
import com.aliyuncs.sofa.model.v20190815.GetDWSMetaHierarchyResponse.DataItem.AllColumnItem.ColumnInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSMetaHierarchyResponseUnmarshaller {

	public static GetDWSMetaHierarchyResponse unmarshall(GetDWSMetaHierarchyResponse getDWSMetaHierarchyResponse, UnmarshallerContext _ctx) {
		
		getDWSMetaHierarchyResponse.setRequestId(_ctx.stringValue("GetDWSMetaHierarchyResponse.RequestId"));
		getDWSMetaHierarchyResponse.setResultCode(_ctx.stringValue("GetDWSMetaHierarchyResponse.ResultCode"));
		getDWSMetaHierarchyResponse.setResultMessage(_ctx.stringValue("GetDWSMetaHierarchyResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDWSMetaHierarchyResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTableName(_ctx.stringValue("GetDWSMetaHierarchyResponse.Data["+ i +"].TableName"));

			List<AllColumnItem> allColumn = new ArrayList<AllColumnItem>();
			for (int j = 0; j < _ctx.lengthValue("GetDWSMetaHierarchyResponse.Data["+ i +"].AllColumn.Length"); j++) {
				AllColumnItem allColumnItem = new AllColumnItem();
				allColumnItem.setColumnName(_ctx.stringValue("GetDWSMetaHierarchyResponse.Data["+ i +"].AllColumn["+ j +"].ColumnName"));

				List<ColumnInfoItem> columnInfo = new ArrayList<ColumnInfoItem>();
				for (int k = 0; k < _ctx.lengthValue("GetDWSMetaHierarchyResponse.Data["+ i +"].AllColumn["+ j +"].ColumnInfo.Length"); k++) {
					ColumnInfoItem columnInfoItem = new ColumnInfoItem();
					columnInfoItem.setIsPrimaryKey(_ctx.booleanValue("GetDWSMetaHierarchyResponse.Data["+ i +"].AllColumn["+ j +"].ColumnInfo["+ k +"].IsPrimaryKey"));
					columnInfoItem.setIsUnique(_ctx.booleanValue("GetDWSMetaHierarchyResponse.Data["+ i +"].AllColumn["+ j +"].ColumnInfo["+ k +"].IsUnique"));
					columnInfoItem.setName(_ctx.stringValue("GetDWSMetaHierarchyResponse.Data["+ i +"].AllColumn["+ j +"].ColumnInfo["+ k +"].Name"));
					columnInfoItem.setType(_ctx.stringValue("GetDWSMetaHierarchyResponse.Data["+ i +"].AllColumn["+ j +"].ColumnInfo["+ k +"].Type"));

					columnInfo.add(columnInfoItem);
				}
				allColumnItem.setColumnInfo(columnInfo);

				allColumn.add(allColumnItem);
			}
			dataItem.setAllColumn(allColumn);

			data.add(dataItem);
		}
		getDWSMetaHierarchyResponse.setData(data);
	 
	 	return getDWSMetaHierarchyResponse;
	}
}