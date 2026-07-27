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

import com.aliyuncs.dataphin_public.model.v20230630.GetSecurityIdentifyResultResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSecurityIdentifyResultResponseUnmarshaller {

	public static GetSecurityIdentifyResultResponse unmarshall(GetSecurityIdentifyResultResponse getSecurityIdentifyResultResponse, UnmarshallerContext _ctx) {
		
		getSecurityIdentifyResultResponse.setRequestId(_ctx.stringValue("GetSecurityIdentifyResultResponse.RequestId"));
		getSecurityIdentifyResultResponse.setMessage(_ctx.stringValue("GetSecurityIdentifyResultResponse.Message"));
		getSecurityIdentifyResultResponse.setHttpStatusCode(_ctx.integerValue("GetSecurityIdentifyResultResponse.HttpStatusCode"));
		getSecurityIdentifyResultResponse.setCode(_ctx.stringValue("GetSecurityIdentifyResultResponse.Code"));
		getSecurityIdentifyResultResponse.setSuccess(_ctx.booleanValue("GetSecurityIdentifyResultResponse.Success"));

		SecurityIdentifyResultInfo securityIdentifyResultInfo = new SecurityIdentifyResultInfo();
		securityIdentifyResultInfo.setLevelAbbreviation(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.LevelAbbreviation"));
		securityIdentifyResultInfo.setTableId(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.TableId"));
		securityIdentifyResultInfo.setModifyTime(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.ModifyTime"));
		securityIdentifyResultInfo.setLevelColor(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.LevelColor"));
		securityIdentifyResultInfo.setClassifyAbbreviation(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.ClassifyAbbreviation"));
		securityIdentifyResultInfo.setDatasourceId(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.DatasourceId"));
		securityIdentifyResultInfo.setIsCustomIdentify(_ctx.booleanValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.IsCustomIdentify"));
		securityIdentifyResultInfo.setProjectName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.ProjectName"));
		securityIdentifyResultInfo.setTableTaskId(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.TableTaskId"));
		securityIdentifyResultInfo.setCreator(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.Creator"));
		securityIdentifyResultInfo.setTableDescription(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.TableDescription"));
		securityIdentifyResultInfo.setHasBetterRule(_ctx.booleanValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.HasBetterRule"));
		securityIdentifyResultInfo.setBizUnitId(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.BizUnitId"));
		securityIdentifyResultInfo.setBizUnitDisplayName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.BizUnitDisplayName"));
		securityIdentifyResultInfo.setScanTaskId(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.ScanTaskId"));
		securityIdentifyResultInfo.setClassifyId(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.ClassifyId"));
		securityIdentifyResultInfo.setTableCatalog(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.TableCatalog"));
		securityIdentifyResultInfo.setBizUnitName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.BizUnitName"));
		securityIdentifyResultInfo.setFieldName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.FieldName"));
		securityIdentifyResultInfo.setModifier(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.Modifier"));
		securityIdentifyResultInfo.setBizDate(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.BizDate"));
		securityIdentifyResultInfo.setStatus(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.Status"));
		securityIdentifyResultInfo.setProjectDisplayName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.ProjectDisplayName"));
		securityIdentifyResultInfo.setIdentifyRecordId(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.IdentifyRecordId"));
		securityIdentifyResultInfo.setDatasourceName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.DatasourceName"));
		securityIdentifyResultInfo.setTableType(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.TableType"));
		securityIdentifyResultInfo.setTableEnv(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.TableEnv"));
		securityIdentifyResultInfo.setCreateTime(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.CreateTime"));
		securityIdentifyResultInfo.setProjectId(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.ProjectId"));
		securityIdentifyResultInfo.setIsLocked(_ctx.booleanValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.IsLocked"));
		securityIdentifyResultInfo.setFieldDescription(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.FieldDescription"));
		securityIdentifyResultInfo.setTableName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.TableName"));
		securityIdentifyResultInfo.setClassifyName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.ClassifyName"));
		securityIdentifyResultInfo.setFieldId(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.FieldId"));
		securityIdentifyResultInfo.setLevelName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.LevelName"));
		securityIdentifyResultInfo.setId(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.Id"));
		securityIdentifyResultInfo.setLevelIndex(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.LevelIndex"));
		getSecurityIdentifyResultResponse.setSecurityIdentifyResultInfo(securityIdentifyResultInfo);
	 
	 	return getSecurityIdentifyResultResponse;
	}
}