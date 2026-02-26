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

import com.aliyuncs.dataphin_public.model.v20230630.GetTableColumnLineagesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetTableColumnLineagesResponse.TableColumnLineage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTableColumnLineagesResponseUnmarshaller {

	public static GetTableColumnLineagesResponse unmarshall(GetTableColumnLineagesResponse getTableColumnLineagesResponse, UnmarshallerContext _ctx) {
		
		getTableColumnLineagesResponse.setRequestId(_ctx.stringValue("GetTableColumnLineagesResponse.RequestId"));
		getTableColumnLineagesResponse.setSuccess(_ctx.booleanValue("GetTableColumnLineagesResponse.Success"));
		getTableColumnLineagesResponse.setHttpStatusCode(_ctx.integerValue("GetTableColumnLineagesResponse.HttpStatusCode"));
		getTableColumnLineagesResponse.setCode(_ctx.stringValue("GetTableColumnLineagesResponse.Code"));
		getTableColumnLineagesResponse.setMessage(_ctx.stringValue("GetTableColumnLineagesResponse.Message"));

		List<TableColumnLineage> tableColumnLineageList = new ArrayList<TableColumnLineage>();
		for (int i = 0; i < _ctx.lengthValue("GetTableColumnLineagesResponse.TableColumnLineageList.Length"); i++) {
			TableColumnLineage tableColumnLineage = new TableColumnLineage();
			tableColumnLineage.setNodeId(_ctx.stringValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].NodeId"));
			tableColumnLineage.setNodeEnv(_ctx.stringValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].NodeEnv"));
			tableColumnLineage.setInputTableEnv(_ctx.stringValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].InputTableEnv"));
			tableColumnLineage.setInputTableGuid(_ctx.stringValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].InputTableGuid"));
			tableColumnLineage.setInputTableName(_ctx.stringValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].InputTableName"));
			tableColumnLineage.setInputColumnName(_ctx.stringValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].InputColumnName"));
			tableColumnLineage.setInputColumnGuid(_ctx.stringValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].InputColumnGuid"));
			tableColumnLineage.setInputProjectId(_ctx.longValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].InputProjectId"));
			tableColumnLineage.setInputBizUnitId(_ctx.longValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].InputBizUnitId"));
			tableColumnLineage.setInputDataSourceId(_ctx.longValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].InputDataSourceId"));
			tableColumnLineage.setInputDataSourceType(_ctx.stringValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].InputDataSourceType"));
			tableColumnLineage.setInputTableDeleted(_ctx.booleanValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].InputTableDeleted"));
			tableColumnLineage.setOutputTableEnv(_ctx.stringValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].OutputTableEnv"));
			tableColumnLineage.setOutputTableGuid(_ctx.stringValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].OutputTableGuid"));
			tableColumnLineage.setOutputTableName(_ctx.stringValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].OutputTableName"));
			tableColumnLineage.setOutputColumnName(_ctx.stringValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].OutputColumnName"));
			tableColumnLineage.setOutputColumnGuid(_ctx.stringValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].OutputColumnGuid"));
			tableColumnLineage.setOutputProjectId(_ctx.longValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].OutputProjectId"));
			tableColumnLineage.setOutputBizUnitId(_ctx.longValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].OutputBizUnitId"));
			tableColumnLineage.setOutputDataSourceId(_ctx.longValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].OutputDataSourceId"));
			tableColumnLineage.setOutputDataSourceType(_ctx.stringValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].OutputDataSourceType"));
			tableColumnLineage.setOutputTableDeleted(_ctx.booleanValue("GetTableColumnLineagesResponse.TableColumnLineageList["+ i +"].OutputTableDeleted"));

			tableColumnLineageList.add(tableColumnLineage);
		}
		getTableColumnLineagesResponse.setTableColumnLineageList(tableColumnLineageList);
	 
	 	return getTableColumnLineagesResponse;
	}
}