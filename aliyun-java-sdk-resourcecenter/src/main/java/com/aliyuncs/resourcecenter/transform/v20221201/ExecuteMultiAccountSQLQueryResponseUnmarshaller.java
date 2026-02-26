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

package com.aliyuncs.resourcecenter.transform.v20221201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcecenter.model.v20221201.ExecuteMultiAccountSQLQueryResponse;
import com.aliyuncs.resourcecenter.model.v20221201.ExecuteMultiAccountSQLQueryResponse.Column;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecuteMultiAccountSQLQueryResponseUnmarshaller {

	public static ExecuteMultiAccountSQLQueryResponse unmarshall(ExecuteMultiAccountSQLQueryResponse executeMultiAccountSQLQueryResponse, UnmarshallerContext _ctx) {
		
		executeMultiAccountSQLQueryResponse.setRequestId(_ctx.stringValue("ExecuteMultiAccountSQLQueryResponse.RequestId"));
		executeMultiAccountSQLQueryResponse.setMaxResults(_ctx.integerValue("ExecuteMultiAccountSQLQueryResponse.MaxResults"));
		executeMultiAccountSQLQueryResponse.setNextToken(_ctx.stringValue("ExecuteMultiAccountSQLQueryResponse.NextToken"));

		List<String> rows = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecuteMultiAccountSQLQueryResponse.Rows.Length"); i++) {
			rows.add(_ctx.stringValue("ExecuteMultiAccountSQLQueryResponse.Rows["+ i +"]"));
		}
		executeMultiAccountSQLQueryResponse.setRows(rows);

		List<Column> columns = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("ExecuteMultiAccountSQLQueryResponse.Columns.Length"); i++) {
			Column column = new Column();
			column.setName(_ctx.stringValue("ExecuteMultiAccountSQLQueryResponse.Columns["+ i +"].Name"));
			column.setType(_ctx.stringValue("ExecuteMultiAccountSQLQueryResponse.Columns["+ i +"].Type"));

			columns.add(column);
		}
		executeMultiAccountSQLQueryResponse.setColumns(columns);
	 
	 	return executeMultiAccountSQLQueryResponse;
	}
}