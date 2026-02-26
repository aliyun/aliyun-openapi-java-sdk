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

import com.aliyuncs.dms_enterprise.model.v20181101.ListDataImportSQLTypeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataImportSQLTypeResponseUnmarshaller {

	public static ListDataImportSQLTypeResponse unmarshall(ListDataImportSQLTypeResponse listDataImportSQLTypeResponse, UnmarshallerContext _ctx) {
		
		listDataImportSQLTypeResponse.setRequestId(_ctx.stringValue("ListDataImportSQLTypeResponse.RequestId"));
		listDataImportSQLTypeResponse.setSuccess(_ctx.booleanValue("ListDataImportSQLTypeResponse.Success"));
		listDataImportSQLTypeResponse.setErrorMessage(_ctx.stringValue("ListDataImportSQLTypeResponse.ErrorMessage"));
		listDataImportSQLTypeResponse.setErrorCode(_ctx.stringValue("ListDataImportSQLTypeResponse.ErrorCode"));

		List<String> sqlTypeResult = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListDataImportSQLTypeResponse.SqlTypeResult.Length"); i++) {
			sqlTypeResult.add(_ctx.stringValue("ListDataImportSQLTypeResponse.SqlTypeResult["+ i +"]"));
		}
		listDataImportSQLTypeResponse.setSqlTypeResult(sqlTypeResult);
	 
	 	return listDataImportSQLTypeResponse;
	}
}