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

import com.aliyuncs.dataphin_public.model.v20230630.GetTableLineageByTaskIdResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetTableLineageByTaskIdResponse.LineageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTableLineageByTaskIdResponseUnmarshaller {

	public static GetTableLineageByTaskIdResponse unmarshall(GetTableLineageByTaskIdResponse getTableLineageByTaskIdResponse, UnmarshallerContext _ctx) {
		
		getTableLineageByTaskIdResponse.setRequestId(_ctx.stringValue("GetTableLineageByTaskIdResponse.RequestId"));
		getTableLineageByTaskIdResponse.setSuccess(_ctx.booleanValue("GetTableLineageByTaskIdResponse.Success"));
		getTableLineageByTaskIdResponse.setHttpStatusCode(_ctx.integerValue("GetTableLineageByTaskIdResponse.HttpStatusCode"));
		getTableLineageByTaskIdResponse.setCode(_ctx.stringValue("GetTableLineageByTaskIdResponse.Code"));
		getTableLineageByTaskIdResponse.setMessage(_ctx.stringValue("GetTableLineageByTaskIdResponse.Message"));

		List<LineageInfo> data = new ArrayList<LineageInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetTableLineageByTaskIdResponse.Data.Length"); i++) {
			LineageInfo lineageInfo = new LineageInfo();
			lineageInfo.setTenantId(_ctx.longValue("GetTableLineageByTaskIdResponse.Data["+ i +"].TenantId"));
			lineageInfo.setTaskId(_ctx.stringValue("GetTableLineageByTaskIdResponse.Data["+ i +"].TaskId"));
			lineageInfo.setTaskEnv(_ctx.stringValue("GetTableLineageByTaskIdResponse.Data["+ i +"].TaskEnv"));
			lineageInfo.setInputEnv(_ctx.stringValue("GetTableLineageByTaskIdResponse.Data["+ i +"].InputEnv"));
			lineageInfo.setInputTableId(_ctx.stringValue("GetTableLineageByTaskIdResponse.Data["+ i +"].InputTableId"));
			lineageInfo.setInputTableName(_ctx.stringValue("GetTableLineageByTaskIdResponse.Data["+ i +"].InputTableName"));
			lineageInfo.setInputTableType(_ctx.stringValue("GetTableLineageByTaskIdResponse.Data["+ i +"].InputTableType"));
			lineageInfo.setInputDataSourceType(_ctx.stringValue("GetTableLineageByTaskIdResponse.Data["+ i +"].InputDataSourceType"));
			lineageInfo.setInputDbType(_ctx.stringValue("GetTableLineageByTaskIdResponse.Data["+ i +"].InputDbType"));
			lineageInfo.setInputProjectId(_ctx.longValue("GetTableLineageByTaskIdResponse.Data["+ i +"].InputProjectId"));
			lineageInfo.setInputBizUnitId(_ctx.longValue("GetTableLineageByTaskIdResponse.Data["+ i +"].InputBizUnitId"));
			lineageInfo.setInputDataSourceId(_ctx.longValue("GetTableLineageByTaskIdResponse.Data["+ i +"].InputDataSourceId"));
			lineageInfo.setInputTableDeleted(_ctx.booleanValue("GetTableLineageByTaskIdResponse.Data["+ i +"].InputTableDeleted"));
			lineageInfo.setOutputTableType(_ctx.stringValue("GetTableLineageByTaskIdResponse.Data["+ i +"].OutputTableType"));
			lineageInfo.setOutputEnv(_ctx.stringValue("GetTableLineageByTaskIdResponse.Data["+ i +"].OutputEnv"));
			lineageInfo.setOutputBizUnitId(_ctx.longValue("GetTableLineageByTaskIdResponse.Data["+ i +"].OutputBizUnitId"));
			lineageInfo.setOutputDataSourceType(_ctx.stringValue("GetTableLineageByTaskIdResponse.Data["+ i +"].OutputDataSourceType"));
			lineageInfo.setOutputDbType(_ctx.stringValue("GetTableLineageByTaskIdResponse.Data["+ i +"].OutputDbType"));
			lineageInfo.setOutputProjectId(_ctx.longValue("GetTableLineageByTaskIdResponse.Data["+ i +"].OutputProjectId"));
			lineageInfo.setOutputDataSourceId(_ctx.longValue("GetTableLineageByTaskIdResponse.Data["+ i +"].OutputDataSourceId"));
			lineageInfo.setOutputTableId(_ctx.stringValue("GetTableLineageByTaskIdResponse.Data["+ i +"].OutputTableId"));
			lineageInfo.setOutputTableName(_ctx.stringValue("GetTableLineageByTaskIdResponse.Data["+ i +"].OutputTableName"));
			lineageInfo.setOutputTableDeleted(_ctx.booleanValue("GetTableLineageByTaskIdResponse.Data["+ i +"].OutputTableDeleted"));

			data.add(lineageInfo);
		}
		getTableLineageByTaskIdResponse.setData(data);
	 
	 	return getTableLineageByTaskIdResponse;
	}
}