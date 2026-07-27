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
		listSecurityIdentifyResultsResponse.setMessage(_ctx.stringValue("ListSecurityIdentifyResultsResponse.Message"));
		listSecurityIdentifyResultsResponse.setHttpStatusCode(_ctx.integerValue("ListSecurityIdentifyResultsResponse.HttpStatusCode"));
		listSecurityIdentifyResultsResponse.setCode(_ctx.stringValue("ListSecurityIdentifyResultsResponse.Code"));
		listSecurityIdentifyResultsResponse.setSuccess(_ctx.booleanValue("ListSecurityIdentifyResultsResponse.Success"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListSecurityIdentifyResultsResponse.PageResult.TotalCount"));

		List<SecurityIdentifyResult> securityIdentifyResultList = new ArrayList<SecurityIdentifyResult>();
		for (int i = 0; i < _ctx.lengthValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList.Length"); i++) {
			SecurityIdentifyResult securityIdentifyResult = new SecurityIdentifyResult();
			securityIdentifyResult.setLevelAbbreviation(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].LevelAbbreviation"));
			securityIdentifyResult.setTableId(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].TableId"));
			securityIdentifyResult.setModifyTime(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].ModifyTime"));
			securityIdentifyResult.setLevelColor(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].LevelColor"));
			securityIdentifyResult.setClassifyAbbreviation(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].ClassifyAbbreviation"));
			securityIdentifyResult.setDatasourceId(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].DatasourceId"));
			securityIdentifyResult.setIsCustomIdentify(_ctx.booleanValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].IsCustomIdentify"));
			securityIdentifyResult.setProjectName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].ProjectName"));
			securityIdentifyResult.setTableTaskId(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].TableTaskId"));
			securityIdentifyResult.setCreator(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].Creator"));
			securityIdentifyResult.setTableDescription(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].TableDescription"));
			securityIdentifyResult.setHasBetterRule(_ctx.booleanValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].HasBetterRule"));
			securityIdentifyResult.setBizUnitId(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].BizUnitId"));
			securityIdentifyResult.setBizUnitDisplayName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].BizUnitDisplayName"));
			securityIdentifyResult.setScanTaskId(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].ScanTaskId"));
			securityIdentifyResult.setClassifyId(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].ClassifyId"));
			securityIdentifyResult.setTableCatalog(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].TableCatalog"));
			securityIdentifyResult.setBizUnitName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].BizUnitName"));
			securityIdentifyResult.setFieldName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].FieldName"));
			securityIdentifyResult.setModifier(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].Modifier"));
			securityIdentifyResult.setBizDate(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].BizDate"));
			securityIdentifyResult.setStatus(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].Status"));
			securityIdentifyResult.setProjectDisplayName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].ProjectDisplayName"));
			securityIdentifyResult.setIdentifyRecordId(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].IdentifyRecordId"));
			securityIdentifyResult.setDatasourceName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].DatasourceName"));
			securityIdentifyResult.setTableType(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].TableType"));
			securityIdentifyResult.setTableEnv(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].TableEnv"));
			securityIdentifyResult.setCreateTime(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].CreateTime"));
			securityIdentifyResult.setProjectId(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].ProjectId"));
			securityIdentifyResult.setIsLocked(_ctx.booleanValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].IsLocked"));
			securityIdentifyResult.setFieldDescription(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].FieldDescription"));
			securityIdentifyResult.setTableName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].TableName"));
			securityIdentifyResult.setClassifyName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].ClassifyName"));
			securityIdentifyResult.setFieldId(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].FieldId"));
			securityIdentifyResult.setLevelName(_ctx.stringValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].LevelName"));
			securityIdentifyResult.setId(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].Id"));
			securityIdentifyResult.setLevelIndex(_ctx.longValue("ListSecurityIdentifyResultsResponse.PageResult.SecurityIdentifyResultList["+ i +"].LevelIndex"));

			securityIdentifyResultList.add(securityIdentifyResult);
		}
		pageResult.setSecurityIdentifyResultList(securityIdentifyResultList);
		listSecurityIdentifyResultsResponse.setPageResult(pageResult);
	 
	 	return listSecurityIdentifyResultsResponse;
	}
}