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

import com.aliyuncs.sofa.model.v20190815.ListClriskDatasourceTableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskDatasourceTableResponseUnmarshaller {

	public static ListClriskDatasourceTableResponse unmarshall(ListClriskDatasourceTableResponse listClriskDatasourceTableResponse, UnmarshallerContext _ctx) {
		
		listClriskDatasourceTableResponse.setRequestId(_ctx.stringValue("ListClriskDatasourceTableResponse.RequestId"));
		listClriskDatasourceTableResponse.setResultCode(_ctx.stringValue("ListClriskDatasourceTableResponse.ResultCode"));
		listClriskDatasourceTableResponse.setResultMessage(_ctx.stringValue("ListClriskDatasourceTableResponse.ResultMessage"));

		List<String> tableList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskDatasourceTableResponse.TableList.Length"); i++) {
			tableList.add(_ctx.stringValue("ListClriskDatasourceTableResponse.TableList["+ i +"]"));
		}
		listClriskDatasourceTableResponse.setTableList(tableList);
	 
	 	return listClriskDatasourceTableResponse;
	}
}