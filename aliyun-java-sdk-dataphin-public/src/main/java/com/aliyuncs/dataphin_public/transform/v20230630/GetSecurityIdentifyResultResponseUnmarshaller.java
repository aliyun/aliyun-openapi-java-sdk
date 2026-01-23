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
		getSecurityIdentifyResultResponse.setSuccess(_ctx.booleanValue("GetSecurityIdentifyResultResponse.Success"));
		getSecurityIdentifyResultResponse.setHttpStatusCode(_ctx.integerValue("GetSecurityIdentifyResultResponse.HttpStatusCode"));
		getSecurityIdentifyResultResponse.setCode(_ctx.stringValue("GetSecurityIdentifyResultResponse.Code"));
		getSecurityIdentifyResultResponse.setMessage(_ctx.stringValue("GetSecurityIdentifyResultResponse.Message"));

		SecurityIdentifyResultInfo securityIdentifyResultInfo = new SecurityIdentifyResultInfo();
		securityIdentifyResultInfo.setId(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.Id"));
		securityIdentifyResultInfo.setScanTaskId(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.ScanTaskId"));
		securityIdentifyResultInfo.setTableTaskId(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.TableTaskId"));
		securityIdentifyResultInfo.setClassifyId(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.ClassifyId"));
		securityIdentifyResultInfo.setClassifyName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.ClassifyName"));
		securityIdentifyResultInfo.setClassifyAbbreviation(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.ClassifyAbbreviation"));
		securityIdentifyResultInfo.setLevelIndex(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.LevelIndex"));
		securityIdentifyResultInfo.setLevelName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.LevelName"));
		securityIdentifyResultInfo.setLevelAbbreviation(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.LevelAbbreviation"));
		securityIdentifyResultInfo.setLevelColor(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.LevelColor"));
		securityIdentifyResultInfo.setBizUnitId(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.BizUnitId"));
		securityIdentifyResultInfo.setBizUnitName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.BizUnitName"));
		securityIdentifyResultInfo.setBizUnitDisplayName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.BizUnitDisplayName"));
		securityIdentifyResultInfo.setProjectId(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.ProjectId"));
		securityIdentifyResultInfo.setProjectName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.ProjectName"));
		securityIdentifyResultInfo.setProjectDisplayName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.ProjectDisplayName"));
		securityIdentifyResultInfo.setDatasourceId(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.DatasourceId"));
		securityIdentifyResultInfo.setDatasourceName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.DatasourceName"));
		securityIdentifyResultInfo.setTableEnv(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.TableEnv"));
		securityIdentifyResultInfo.setTableType(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.TableType"));
		securityIdentifyResultInfo.setTableCatalog(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.TableCatalog"));
		securityIdentifyResultInfo.setTableId(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.TableId"));
		securityIdentifyResultInfo.setTableName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.TableName"));
		securityIdentifyResultInfo.setTableDescription(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.TableDescription"));
		securityIdentifyResultInfo.setFieldId(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.FieldId"));
		securityIdentifyResultInfo.setFieldName(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.FieldName"));
		securityIdentifyResultInfo.setFieldDescription(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.FieldDescription"));
		securityIdentifyResultInfo.setIsCustomIdentify(_ctx.booleanValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.IsCustomIdentify"));
		securityIdentifyResultInfo.setIsLocked(_ctx.booleanValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.IsLocked"));
		securityIdentifyResultInfo.setHasBetterRule(_ctx.booleanValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.HasBetterRule"));
		securityIdentifyResultInfo.setIdentifyRecordId(_ctx.longValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.IdentifyRecordId"));
		securityIdentifyResultInfo.setStatus(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.Status"));
		securityIdentifyResultInfo.setBizDate(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.BizDate"));
		securityIdentifyResultInfo.setCreator(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.Creator"));
		securityIdentifyResultInfo.setCreateTime(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.CreateTime"));
		securityIdentifyResultInfo.setModifier(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.Modifier"));
		securityIdentifyResultInfo.setModifyTime(_ctx.stringValue("GetSecurityIdentifyResultResponse.SecurityIdentifyResultInfo.ModifyTime"));
		getSecurityIdentifyResultResponse.setSecurityIdentifyResultInfo(securityIdentifyResultInfo);
	 
	 	return getSecurityIdentifyResultResponse;
	}
}