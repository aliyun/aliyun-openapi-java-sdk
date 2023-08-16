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

package com.aliyuncs.dataworks_public.transform.v20180601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20180601.ListGovernanceIssueTablesResponse;
import com.aliyuncs.dataworks_public.model.v20180601.ListGovernanceIssueTablesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20180601.ListGovernanceIssueTablesResponse.Data.Table;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGovernanceIssueTablesResponseUnmarshaller {

	public static ListGovernanceIssueTablesResponse unmarshall(ListGovernanceIssueTablesResponse listGovernanceIssueTablesResponse, UnmarshallerContext _ctx) {
		
		listGovernanceIssueTablesResponse.setRequestId(_ctx.stringValue("ListGovernanceIssueTablesResponse.RequestId"));
		listGovernanceIssueTablesResponse.setSuccess(_ctx.booleanValue("ListGovernanceIssueTablesResponse.Success"));
		listGovernanceIssueTablesResponse.setErrorCode(_ctx.stringValue("ListGovernanceIssueTablesResponse.ErrorCode"));
		listGovernanceIssueTablesResponse.setErrorMessage(_ctx.stringValue("ListGovernanceIssueTablesResponse.ErrorMessage"));
		listGovernanceIssueTablesResponse.setHttpStatusCode(_ctx.integerValue("ListGovernanceIssueTablesResponse.HttpStatusCode"));
		listGovernanceIssueTablesResponse.setDynamicErrorCode(_ctx.stringValue("ListGovernanceIssueTablesResponse.DynamicErrorCode"));
		listGovernanceIssueTablesResponse.setDynamicErrorMessage(_ctx.stringValue("ListGovernanceIssueTablesResponse.DynamicErrorMessage"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListGovernanceIssueTablesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListGovernanceIssueTablesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListGovernanceIssueTablesResponse.Data.TotalCount"));

		List<Table> tables = new ArrayList<Table>();
		for (int i = 0; i < _ctx.lengthValue("ListGovernanceIssueTablesResponse.Data.Tables.Length"); i++) {
			Table table = new Table();
			table.setDatasourceType(_ctx.stringValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].DatasourceType"));
			table.setMcProjectName(_ctx.stringValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].McProjectName"));
			table.setClusterId(_ctx.stringValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].ClusterId"));
			table.setDatabaseName(_ctx.stringValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].DatabaseName"));
			table.setSchema(_ctx.stringValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].Schema"));
			table.setTableName(_ctx.stringValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].TableName"));
			table.setTableGuid(_ctx.stringValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].TableGuid"));
			table.setTableSize(_ctx.longValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].TableSize"));
			table.setLifeCycle(_ctx.longValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].LifeCycle"));
			table.setCreateTime(_ctx.longValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].CreateTime"));
			table.setLastAccessTime(_ctx.longValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].LastAccessTime"));
			table.setDownstreamDependencyCount(_ctx.integerValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].DownstreamDependencyCount"));
			table.setRuleId(_ctx.stringValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].RuleId"));
			table.setRuleCategory(_ctx.stringValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].RuleCategory"));
			table.setProjectId(_ctx.longValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].ProjectId"));
			table.setOwnerId(_ctx.stringValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].OwnerId"));
			table.setBizDate(_ctx.stringValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].BizDate"));
			table.setProperties(_ctx.stringValue("ListGovernanceIssueTablesResponse.Data.Tables["+ i +"].Properties"));

			tables.add(table);
		}
		data.setTables(tables);
		listGovernanceIssueTablesResponse.setData(data);
	 
	 	return listGovernanceIssueTablesResponse;
	}
}