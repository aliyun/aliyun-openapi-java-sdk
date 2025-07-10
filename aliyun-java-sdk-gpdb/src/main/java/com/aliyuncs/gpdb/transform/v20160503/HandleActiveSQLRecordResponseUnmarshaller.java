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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.HandleActiveSQLRecordResponse;
import com.aliyuncs.gpdb.model.v20160503.HandleActiveSQLRecordResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class HandleActiveSQLRecordResponseUnmarshaller {

	public static HandleActiveSQLRecordResponse unmarshall(HandleActiveSQLRecordResponse handleActiveSQLRecordResponse, UnmarshallerContext _ctx) {
		
		handleActiveSQLRecordResponse.setRequestId(_ctx.stringValue("HandleActiveSQLRecordResponse.RequestId"));
		handleActiveSQLRecordResponse.setStatus(_ctx.stringValue("HandleActiveSQLRecordResponse.Status"));
		handleActiveSQLRecordResponse.setDBInstanceId(_ctx.stringValue("HandleActiveSQLRecordResponse.DBInstanceId"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("HandleActiveSQLRecordResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setStatus(_ctx.stringValue("HandleActiveSQLRecordResponse.Results["+ i +"].Status"));
			result.setPid(_ctx.stringValue("HandleActiveSQLRecordResponse.Results["+ i +"].Pid"));

			results.add(result);
		}
		handleActiveSQLRecordResponse.setResults(results);
	 
	 	return handleActiveSQLRecordResponse;
	}
}