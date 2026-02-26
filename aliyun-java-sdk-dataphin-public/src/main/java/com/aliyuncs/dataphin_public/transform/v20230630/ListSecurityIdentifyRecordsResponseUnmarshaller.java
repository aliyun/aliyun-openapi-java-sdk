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

import com.aliyuncs.dataphin_public.model.v20230630.ListSecurityIdentifyRecordsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListSecurityIdentifyRecordsResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSecurityIdentifyRecordsResponseUnmarshaller {

	public static ListSecurityIdentifyRecordsResponse unmarshall(ListSecurityIdentifyRecordsResponse listSecurityIdentifyRecordsResponse, UnmarshallerContext _ctx) {
		
		listSecurityIdentifyRecordsResponse.setRequestId(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.RequestId"));
		listSecurityIdentifyRecordsResponse.setSuccess(_ctx.booleanValue("ListSecurityIdentifyRecordsResponse.Success"));
		listSecurityIdentifyRecordsResponse.setHttpStatusCode(_ctx.integerValue("ListSecurityIdentifyRecordsResponse.HttpStatusCode"));
		listSecurityIdentifyRecordsResponse.setCode(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.Code"));
		listSecurityIdentifyRecordsResponse.setMessage(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListSecurityIdentifyRecordsResponse.PageResult.TotalCount"));

		List<IdentifyRecord> identifyRecordList = new ArrayList<IdentifyRecord>();
		for (int i = 0; i < _ctx.lengthValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList.Length"); i++) {
			IdentifyRecord identifyRecord = new IdentifyRecord();
			identifyRecord.setId(_ctx.longValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].Id"));
			identifyRecord.setBizUnitId(_ctx.longValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].BizUnitId"));
			identifyRecord.setBizUnitName(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].BizUnitName"));
			identifyRecord.setBizUnitDisplayName(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].BizUnitDisplayName"));
			identifyRecord.setProjectId(_ctx.longValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].ProjectId"));
			identifyRecord.setProjectName(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].ProjectName"));
			identifyRecord.setProjectDisplayName(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].ProjectDisplayName"));
			identifyRecord.setDatasourceId(_ctx.longValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].DatasourceId"));
			identifyRecord.setDatasourceName(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].DatasourceName"));
			identifyRecord.setTableEnv(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].TableEnv"));
			identifyRecord.setTableId(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].TableId"));
			identifyRecord.setTableName(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].TableName"));
			identifyRecord.setTableDescription(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].TableDescription"));
			identifyRecord.setTableType(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].TableType"));
			identifyRecord.setFieldId(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].FieldId"));
			identifyRecord.setFieldName(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].FieldName"));
			identifyRecord.setFieldDescription(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].FieldDescription"));
			identifyRecord.setActualIdentifyRate(_ctx.doubleValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].ActualIdentifyRate"));
			identifyRecord.setClassifyId(_ctx.longValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].ClassifyId"));
			identifyRecord.setClassifyName(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].ClassifyName"));
			identifyRecord.setClassifyAbbreviation(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].ClassifyAbbreviation"));
			identifyRecord.setClassifyStatus(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].ClassifyStatus"));
			identifyRecord.setLevelIndex(_ctx.longValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].LevelIndex"));
			identifyRecord.setLevelName(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].LevelName"));
			identifyRecord.setLevelAbbreviation(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].LevelAbbreviation"));
			identifyRecord.setIsCustomIdentify(_ctx.booleanValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].IsCustomIdentify"));
			identifyRecord.setIsLocked(_ctx.booleanValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].IsLocked"));
			identifyRecord.setIsBetterMatch(_ctx.booleanValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].IsBetterMatch"));
			identifyRecord.setBizDate(_ctx.stringValue("ListSecurityIdentifyRecordsResponse.PageResult.IdentifyRecordList["+ i +"].BizDate"));

			identifyRecordList.add(identifyRecord);
		}
		pageResult.setIdentifyRecordList(identifyRecordList);
		listSecurityIdentifyRecordsResponse.setPageResult(pageResult);
	 
	 	return listSecurityIdentifyRecordsResponse;
	}
}