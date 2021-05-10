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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.ListDataSourceTablesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataSourceTablesResponseUnmarshaller {

	public static ListDataSourceTablesResponse unmarshall(ListDataSourceTablesResponse listDataSourceTablesResponse, UnmarshallerContext _ctx) {
		
		listDataSourceTablesResponse.setRequestId(_ctx.stringValue("ListDataSourceTablesResponse.requestId"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSourceTablesResponse.result.Length"); i++) {
			result.add(_ctx.stringValue("ListDataSourceTablesResponse.result["+ i +"]"));
		}
		listDataSourceTablesResponse.setResult(result);
	 
	 	return listDataSourceTablesResponse;
	}
}