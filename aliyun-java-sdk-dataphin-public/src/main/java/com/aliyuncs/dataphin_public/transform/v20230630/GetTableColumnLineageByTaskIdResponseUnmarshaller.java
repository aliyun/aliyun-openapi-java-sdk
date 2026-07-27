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

import com.aliyuncs.dataphin_public.model.v20230630.GetTableColumnLineageByTaskIdResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetTableColumnLineageByTaskIdResponse.LineageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTableColumnLineageByTaskIdResponseUnmarshaller {

	public static GetTableColumnLineageByTaskIdResponse unmarshall(GetTableColumnLineageByTaskIdResponse getTableColumnLineageByTaskIdResponse, UnmarshallerContext _ctx) {
		
		getTableColumnLineageByTaskIdResponse.setRequestId(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.RequestId"));
		getTableColumnLineageByTaskIdResponse.setMessage(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Message"));
		getTableColumnLineageByTaskIdResponse.setHttpStatusCode(_ctx.integerValue("GetTableColumnLineageByTaskIdResponse.HttpStatusCode"));
		getTableColumnLineageByTaskIdResponse.setCode(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Code"));
		getTableColumnLineageByTaskIdResponse.setSuccess(_ctx.booleanValue("GetTableColumnLineageByTaskIdResponse.Success"));

		List<LineageInfo> data = new ArrayList<LineageInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetTableColumnLineageByTaskIdResponse.Data.Length"); i++) {
			LineageInfo lineageInfo = new LineageInfo();
			lineageInfo.setTaskId(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].TaskId"));
			lineageInfo.setOutputTableName(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].OutputTableName"));
			lineageInfo.setInputTableDeleted(_ctx.booleanValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].InputTableDeleted"));
			lineageInfo.setInputEnv(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].InputEnv"));
			lineageInfo.setOutputTableDeleted(_ctx.booleanValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].OutputTableDeleted"));
			lineageInfo.setOutputEnv(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].OutputEnv"));
			lineageInfo.setInputTableName(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].InputTableName"));
			lineageInfo.setInputColumnName(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].InputColumnName"));
			lineageInfo.setOutputDataSourceId(_ctx.longValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].OutputDataSourceId"));
			lineageInfo.setOutputDataSourceType(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].OutputDataSourceType"));
			lineageInfo.setTaskEnv(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].TaskEnv"));
			lineageInfo.setInputColumnId(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].InputColumnId"));
			lineageInfo.setOutputProjectId(_ctx.longValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].OutputProjectId"));
			lineageInfo.setInputTableType(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].InputTableType"));
			lineageInfo.setOutputTableType(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].OutputTableType"));
			lineageInfo.setInputProjectId(_ctx.longValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].InputProjectId"));
			lineageInfo.setInputDbType(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].InputDbType"));
			lineageInfo.setOutputBizUnitId(_ctx.longValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].OutputBizUnitId"));
			lineageInfo.setTenantId(_ctx.longValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].TenantId"));
			lineageInfo.setOutputTableId(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].OutputTableId"));
			lineageInfo.setOutputColumnId(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].OutputColumnId"));
			lineageInfo.setInputTableId(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].InputTableId"));
			lineageInfo.setOutputDbType(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].OutputDbType"));
			lineageInfo.setInputDataSourceType(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].InputDataSourceType"));
			lineageInfo.setInputBizUnitId(_ctx.longValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].InputBizUnitId"));
			lineageInfo.setInputDataSourceId(_ctx.longValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].InputDataSourceId"));
			lineageInfo.setOutputColumnName(_ctx.stringValue("GetTableColumnLineageByTaskIdResponse.Data["+ i +"].OutputColumnName"));

			data.add(lineageInfo);
		}
		getTableColumnLineageByTaskIdResponse.setData(data);
	 
	 	return getTableColumnLineageByTaskIdResponse;
	}
}