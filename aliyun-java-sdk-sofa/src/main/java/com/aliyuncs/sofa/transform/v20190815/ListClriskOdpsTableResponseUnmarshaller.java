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

import com.aliyuncs.sofa.model.v20190815.ListClriskOdpsTableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskOdpsTableResponseUnmarshaller {

	public static ListClriskOdpsTableResponse unmarshall(ListClriskOdpsTableResponse listClriskOdpsTableResponse, UnmarshallerContext _ctx) {
		
		listClriskOdpsTableResponse.setRequestId(_ctx.stringValue("ListClriskOdpsTableResponse.RequestId"));
		listClriskOdpsTableResponse.setResultCode(_ctx.stringValue("ListClriskOdpsTableResponse.ResultCode"));
		listClriskOdpsTableResponse.setResultMessage(_ctx.stringValue("ListClriskOdpsTableResponse.ResultMessage"));

		List<String> tables = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskOdpsTableResponse.Tables.Length"); i++) {
			tables.add(_ctx.stringValue("ListClriskOdpsTableResponse.Tables["+ i +"]"));
		}
		listClriskOdpsTableResponse.setTables(tables);
	 
	 	return listClriskOdpsTableResponse;
	}
}