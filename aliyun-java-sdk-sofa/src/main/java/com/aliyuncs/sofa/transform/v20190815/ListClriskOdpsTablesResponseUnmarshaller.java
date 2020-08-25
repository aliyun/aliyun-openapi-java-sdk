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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListClriskOdpsTablesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskOdpsTablesResponseUnmarshaller {

	public static ListClriskOdpsTablesResponse unmarshall(ListClriskOdpsTablesResponse listClriskOdpsTablesResponse, UnmarshallerContext _ctx) {
		
		listClriskOdpsTablesResponse.setRequestId(_ctx.stringValue("ListClriskOdpsTablesResponse.RequestId"));
		listClriskOdpsTablesResponse.setResultCode(_ctx.stringValue("ListClriskOdpsTablesResponse.ResultCode"));
		listClriskOdpsTablesResponse.setResultMessage(_ctx.stringValue("ListClriskOdpsTablesResponse.ResultMessage"));

		List<String> tables = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskOdpsTablesResponse.Tables.Length"); i++) {
			tables.add(_ctx.stringValue("ListClriskOdpsTablesResponse.Tables["+ i +"]"));
		}
		listClriskOdpsTablesResponse.setTables(tables);
	 
	 	return listClriskOdpsTablesResponse;
	}
}