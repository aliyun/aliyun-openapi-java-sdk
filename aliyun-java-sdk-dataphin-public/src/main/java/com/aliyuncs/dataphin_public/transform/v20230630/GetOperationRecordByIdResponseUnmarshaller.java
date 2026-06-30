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

import com.aliyuncs.dataphin_public.model.v20230630.GetOperationRecordByIdResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetOperationRecordByIdResponse.OperationLogDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOperationRecordByIdResponseUnmarshaller {

	public static GetOperationRecordByIdResponse unmarshall(GetOperationRecordByIdResponse getOperationRecordByIdResponse, UnmarshallerContext _ctx) {
		
		getOperationRecordByIdResponse.setRequestId(_ctx.stringValue("GetOperationRecordByIdResponse.RequestId"));
		getOperationRecordByIdResponse.setSuccess(_ctx.booleanValue("GetOperationRecordByIdResponse.Success"));
		getOperationRecordByIdResponse.setHttpStatusCode(_ctx.integerValue("GetOperationRecordByIdResponse.HttpStatusCode"));
		getOperationRecordByIdResponse.setCode(_ctx.stringValue("GetOperationRecordByIdResponse.Code"));
		getOperationRecordByIdResponse.setMessage(_ctx.stringValue("GetOperationRecordByIdResponse.Message"));

		OperationLogDTO operationLogDTO = new OperationLogDTO();
		operationLogDTO.setId(_ctx.longValue("GetOperationRecordByIdResponse.OperationLogDTO.Id"));
		operationLogDTO.setName(_ctx.stringValue("GetOperationRecordByIdResponse.OperationLogDTO.Name"));
		operationLogDTO.setObjectType(_ctx.stringValue("GetOperationRecordByIdResponse.OperationLogDTO.ObjectType"));
		operationLogDTO.setCodeType(_ctx.integerValue("GetOperationRecordByIdResponse.OperationLogDTO.CodeType"));
		operationLogDTO.setStatus(_ctx.integerValue("GetOperationRecordByIdResponse.OperationLogDTO.Status"));
		operationLogDTO.setBeginTime(_ctx.stringValue("GetOperationRecordByIdResponse.OperationLogDTO.BeginTime"));
		operationLogDTO.setRunner(_ctx.stringValue("GetOperationRecordByIdResponse.OperationLogDTO.Runner"));
		operationLogDTO.setRunnerName(_ctx.stringValue("GetOperationRecordByIdResponse.OperationLogDTO.RunnerName"));
		operationLogDTO.setProjectId(_ctx.longValue("GetOperationRecordByIdResponse.OperationLogDTO.ProjectId"));
		operationLogDTO.setTenantId(_ctx.longValue("GetOperationRecordByIdResponse.OperationLogDTO.TenantId"));
		operationLogDTO.setOperationId(_ctx.longValue("GetOperationRecordByIdResponse.OperationLogDTO.OperationId"));
		operationLogDTO.setDuration(_ctx.longValue("GetOperationRecordByIdResponse.OperationLogDTO.Duration"));

		List<String> relationTables = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOperationRecordByIdResponse.OperationLogDTO.RelationTables.Length"); i++) {
			relationTables.add(_ctx.stringValue("GetOperationRecordByIdResponse.OperationLogDTO.RelationTables["+ i +"]"));
		}
		operationLogDTO.setRelationTables(relationTables);
		getOperationRecordByIdResponse.setOperationLogDTO(operationLogDTO);
	 
	 	return getOperationRecordByIdResponse;
	}
}