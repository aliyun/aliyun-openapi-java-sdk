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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskUdfLineagesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskUdfLineagesResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskUdfLineagesResponse.Data.LineageGroup;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskUdfLineagesResponse.Data.LineageGroup.LineageTable;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskUdfLineagesResponse.Data.LineageGroup.LineageTable.LineageColumn;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBatchTaskUdfLineagesResponseUnmarshaller {

	public static GetBatchTaskUdfLineagesResponse unmarshall(GetBatchTaskUdfLineagesResponse getBatchTaskUdfLineagesResponse, UnmarshallerContext _ctx) {
		
		getBatchTaskUdfLineagesResponse.setRequestId(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.RequestId"));
		getBatchTaskUdfLineagesResponse.setSuccess(_ctx.booleanValue("GetBatchTaskUdfLineagesResponse.Success"));
		getBatchTaskUdfLineagesResponse.setHttpStatusCode(_ctx.integerValue("GetBatchTaskUdfLineagesResponse.HttpStatusCode"));
		getBatchTaskUdfLineagesResponse.setCode(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Code"));
		getBatchTaskUdfLineagesResponse.setMessage(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Message"));

		Data data = new Data();

		List<LineageGroup> lineageGroupList = new ArrayList<LineageGroup>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList.Length"); i++) {
			LineageGroup lineageGroup = new LineageGroup();

			List<LineageTable> inputLineageList = new ArrayList<LineageTable>();
			for (int j = 0; j < _ctx.lengthValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList.Length"); j++) {
				LineageTable lineageTable = new LineageTable();
				lineageTable.setName(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].Name"));
				lineageTable.setDisplayName(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].DisplayName"));
				lineageTable.setGuid(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].Guid"));
				lineageTable.setDescription(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].Description"));
				lineageTable.setOwnerName(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].OwnerName"));
				lineageTable.setOwnerUserId(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].OwnerUserId"));
				lineageTable.setProjectName(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].ProjectName"));
				lineageTable.setProjectId(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].ProjectId"));
				lineageTable.setBizUnitId(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].BizUnitId"));
				lineageTable.setBizUnitName(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].BizUnitName"));
				lineageTable.setEnv(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].Env"));
				lineageTable.setSubType(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].SubType"));
				lineageTable.setFullTable(_ctx.booleanValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].FullTable"));

				List<LineageColumn> columnList = new ArrayList<LineageColumn>();
				for (int k = 0; k < _ctx.lengthValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].ColumnList.Length"); k++) {
					LineageColumn lineageColumn = new LineageColumn();
					lineageColumn.setId(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].ColumnList["+ k +"].Id"));
					lineageColumn.setName(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].ColumnList["+ k +"].Name"));
					lineageColumn.setDescription(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].ColumnList["+ k +"].Description"));
					lineageColumn.setDataType(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].ColumnList["+ k +"].DataType"));
					lineageColumn.setPartitionKey(_ctx.booleanValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].ColumnList["+ k +"].PartitionKey"));
					lineageColumn.setPrimaryKey(_ctx.booleanValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].InputLineageList["+ j +"].ColumnList["+ k +"].PrimaryKey"));

					columnList.add(lineageColumn);
				}
				lineageTable.setColumnList(columnList);

				inputLineageList.add(lineageTable);
			}
			lineageGroup.setInputLineageList(inputLineageList);

			List<LineageTable> outputLineageList = new ArrayList<LineageTable>();
			for (int j = 0; j < _ctx.lengthValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList.Length"); j++) {
				LineageTable lineageTable1 = new LineageTable();
				lineageTable1.setName(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].Name"));
				lineageTable1.setDisplayName(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].DisplayName"));
				lineageTable1.setGuid(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].Guid"));
				lineageTable1.setDescription(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].Description"));
				lineageTable1.setOwnerName(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].OwnerName"));
				lineageTable1.setOwnerUserId(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].OwnerUserId"));
				lineageTable1.setProjectName(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].ProjectName"));
				lineageTable1.setProjectId(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].ProjectId"));
				lineageTable1.setBizUnitId(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].BizUnitId"));
				lineageTable1.setBizUnitName(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].BizUnitName"));
				lineageTable1.setEnv(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].Env"));
				lineageTable1.setSubType(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].SubType"));
				lineageTable1.setFullTable(_ctx.booleanValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].FullTable"));

				List<LineageColumn> columnList1 = new ArrayList<LineageColumn>();
				for (int k = 0; k < _ctx.lengthValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].ColumnList.Length"); k++) {
					com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskUdfLineagesResponse.Data.LineageGroup.LineageTable.LineageColumn lineageColumn1 = new com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskUdfLineagesResponse.Data.LineageGroup.LineageTable.LineageColumn();
					lineageColumn1.setId(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].ColumnList["+ k +"].Id"));
					lineageColumn1.setName(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].ColumnList["+ k +"].Name"));
					lineageColumn1.setDescription(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].ColumnList["+ k +"].Description"));
					lineageColumn1.setDataType(_ctx.stringValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].ColumnList["+ k +"].DataType"));
					lineageColumn1.setPartitionKey(_ctx.booleanValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].ColumnList["+ k +"].PartitionKey"));
					lineageColumn1.setPrimaryKey(_ctx.booleanValue("GetBatchTaskUdfLineagesResponse.Data.LineageGroupList["+ i +"].OutputLineageList["+ j +"].ColumnList["+ k +"].PrimaryKey"));

					columnList1.add(lineageColumn1);
				}
				lineageTable1.setColumnList(columnList1);

				outputLineageList.add(lineageTable1);
			}
			lineageGroup.setOutputLineageList(outputLineageList);

			lineageGroupList.add(lineageGroup);
		}
		data.setLineageGroupList(lineageGroupList);
		getBatchTaskUdfLineagesResponse.setData(data);
	 
	 	return getBatchTaskUdfLineagesResponse;
	}
}