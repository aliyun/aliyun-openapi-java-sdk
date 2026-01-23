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

import com.aliyuncs.dataphin_public.model.v20230630.ListSecurityIdentifyResultsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListSecurityIdentifyResultsResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSecurityIdentifyResultsResponseUnmarshaller {

	public static ListSecurityIdentifyResultsResponse unmarshall(ListSecurityIdentifyResultsResponse listSecurityIdentifyResultsResponse, UnmarshallerContext _ctx) {
		
		listSecurityIdentifyResultsResponse.setRequestId(_ctx.stringValue("ListSecurityIdentifyResultsResponse.RequestId"));
		listSecurityIdentifyResultsResponse.setSuccess(_ctx.booleanValue("ListSecurityIdentifyResultsResponse.Success"));
		listSecurityIdentifyResultsResponse.setHttpStatusCode(_ctx.integerValue("ListSecurityIdentifyResultsResponse.HttpStatusCode"));
		listSecurityIdentifyResultsResponse.setCode(_ctx.stringValue("ListSecurityIdentifyResultsResponse.Code"));
		listSecurityIdentifyResultsResponse.setMessage(_ctx.stringValue("ListSecurityIdentifyResultsResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListSecurityIdentifyResultsResponse.PageResult.TotalCount"));

		List<SecurityIdentifyResult> securityIdentifyResultList = new ArrayList<SecurityIdentifyResult>();
		for (int i = 0; i < _ctx.lengthValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList.Length"); i++) {
			SecurityIdentifyResult securityIdentifyResult = new SecurityIdentifyResult();
			securityIdentifyResult.setId(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].Id"));
			securityIdentifyResult.setScanTaskId(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].ScanTaskId"));
			securityIdentifyResult.setTableTaskId(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].TableTaskId"));
			securityIdentifyResult.setClassifyId(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].ClassifyId"));
			securityIdentifyResult.setClassifyName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].ClassifyName"));
			securityIdentifyResult.setClassifyAbbreviation(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].ClassifyAbbreviation"));
			securityIdentifyResult.setLevelIndex(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].LevelIndex"));
			securityIdentifyResult.setLevelName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].LevelName"));
			securityIdentifyResult.setLevelAbbreviation(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].LevelAbbreviation"));
			securityIdentifyResult.setLevelColor(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].LevelColor"));
			securityIdentifyResult.setBizUnitId(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].BizUnitId"));
			securityIdentifyResult.setBizUnitName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].BizUnitName"));
			securityIdentifyResult.setBizUnitDisplayName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].BizUnitDisplayName"));
			securityIdentifyResult.setProjectId(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].ProjectId"));
			securityIdentifyResult.setProjectName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].ProjectName"));
			securityIdentifyResult.setProjectDisplayName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].ProjectDisplayName"));
			securityIdentifyResult.setDatasourceId(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].DatasourceId"));
			securityIdentifyResult.setDatasourceName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].DatasourceName"));
			securityIdentifyResult.setTableEnv(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].TableEnv"));
			securityIdentifyResult.setTableType(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].TableType"));
			securityIdentifyResult.setTableCatalog(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].TableCatalog"));
			securityIdentifyResult.setTableId(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].TableId"));
			securityIdentifyResult.setTableName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].TableName"));
			securityIdentifyResult.setTableDescription(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].TableDescription"));
			securityIdentifyResult.setFieldId(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].FieldId"));
			securityIdentifyResult.setFieldName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].FieldName"));
			securityIdentifyResult.setFieldDescription(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].FieldDescription"));
			securityIdentifyResult.setIsCustomIdentify(_ctx.booleanValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].IsCustomIdentify"));
			securityIdentifyResult.setIsLocked(_ctx.booleanValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].IsLocked"));
			securityIdentifyResult.setHasBetterRule(_ctx.booleanValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].HasBetterRule"));
			securityIdentifyResult.setIdentifyRecordId(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].IdentifyRecordId"));
			securityIdentifyResult.setStatus(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].Status"));
			securityIdentifyResult.setBizDate(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].BizDate"));
			securityIdentifyResult.setCreator(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].Creator"));
			securityIdentifyResult.setCreateTime(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].CreateTime"));
			securityIdentifyResult.setModifier(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].Modifier"));
			securityIdentifyResult.setModifyTime(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].ModifyTime"));

			securityIdentifyResultList.add(securityIdentifyResult);
		}
		pageResult.setSecurityIdentifyResultList(securityIdentifyResultList);
		listSecurityIdentifyResultsResponse.setPageResult(pageResult);
	 
	 	return listSecurityIdentifyResultsResponse;
	}
}