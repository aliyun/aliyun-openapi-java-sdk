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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ExecuteScriptResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ExecuteScriptResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecuteScriptResponseUnmarshaller {

	public static ExecuteScriptResponse unmarshall(ExecuteScriptResponse executeScriptResponse, UnmarshallerContext _ctx) {
		
		executeScriptResponse.setRequestId(_ctx.stringValue("ExecuteScriptResponse.RequestId"));
		executeScriptResponse.setErrorCode(_ctx.stringValue("ExecuteScriptResponse.ErrorCode"));
		executeScriptResponse.setErrorMessage(_ctx.stringValue("ExecuteScriptResponse.ErrorMessage"));
		executeScriptResponse.setSuccess(_ctx.booleanValue("ExecuteScriptResponse.Success"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("ExecuteScriptResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setMessage(_ctx.stringValue("ExecuteScriptResponse.Results["+ i +"].Message"));
			result.setRowCount(_ctx.longValue("ExecuteScriptResponse.Results["+ i +"].RowCount"));
			result.setSuccess(_ctx.booleanValue("ExecuteScriptResponse.Results["+ i +"].Success"));

			List<String> columnNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ExecuteScriptResponse.Results["+ i +"].ColumnNames.Length"); j++) {
				columnNames.add(_ctx.stringValue("ExecuteScriptResponse.Results["+ i +"].ColumnNames["+ j +"]"));
			}
			result.setColumnNames(columnNames);

			List<Map<Object, Object>> rows = _ctx.listMapValue("ExecuteScriptResponse.Results["+ i +"].Rows");
			result.setRows(rows);

			results.add(result);
		}
		executeScriptResponse.setResults(results);
	 
	 	return executeScriptResponse;
	}
}