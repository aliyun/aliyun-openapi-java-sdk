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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.GetSqlServerDatabasesToRestoreResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSqlServerDatabasesToRestoreResponseUnmarshaller {

	public static GetSqlServerDatabasesToRestoreResponse unmarshall(GetSqlServerDatabasesToRestoreResponse getSqlServerDatabasesToRestoreResponse, UnmarshallerContext _ctx) {
		
		getSqlServerDatabasesToRestoreResponse.setRequestId(_ctx.stringValue("GetSqlServerDatabasesToRestoreResponse.RequestId"));
		getSqlServerDatabasesToRestoreResponse.setSuccess(_ctx.booleanValue("GetSqlServerDatabasesToRestoreResponse.Success"));
		getSqlServerDatabasesToRestoreResponse.setCode(_ctx.stringValue("GetSqlServerDatabasesToRestoreResponse.Code"));
		getSqlServerDatabasesToRestoreResponse.setMessage(_ctx.stringValue("GetSqlServerDatabasesToRestoreResponse.Message"));
		getSqlServerDatabasesToRestoreResponse.setTotalCount(_ctx.integerValue("GetSqlServerDatabasesToRestoreResponse.TotalCount"));
		getSqlServerDatabasesToRestoreResponse.setPageSize(_ctx.integerValue("GetSqlServerDatabasesToRestoreResponse.PageSize"));
		getSqlServerDatabasesToRestoreResponse.setPageNumber(_ctx.integerValue("GetSqlServerDatabasesToRestoreResponse.PageNumber"));

		List<String> databaseNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetSqlServerDatabasesToRestoreResponse.DatabaseNames.Length"); i++) {
			databaseNames.add(_ctx.stringValue("GetSqlServerDatabasesToRestoreResponse.DatabaseNames["+ i +"]"));
		}
		getSqlServerDatabasesToRestoreResponse.setDatabaseNames(databaseNames);
	 
	 	return getSqlServerDatabasesToRestoreResponse;
	}
}