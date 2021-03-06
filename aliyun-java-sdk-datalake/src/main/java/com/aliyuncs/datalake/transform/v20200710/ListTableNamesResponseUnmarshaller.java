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

package com.aliyuncs.datalake.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datalake.model.v20200710.ListTableNamesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTableNamesResponseUnmarshaller {

	public static ListTableNamesResponse unmarshall(ListTableNamesResponse listTableNamesResponse, UnmarshallerContext _ctx) {
		
		listTableNamesResponse.setRequestId(_ctx.stringValue("ListTableNamesResponse.RequestId"));
		listTableNamesResponse.setMessage(_ctx.stringValue("ListTableNamesResponse.Message"));
		listTableNamesResponse.setNextPageToken(_ctx.stringValue("ListTableNamesResponse.NextPageToken"));
		listTableNamesResponse.setCode(_ctx.stringValue("ListTableNamesResponse.Code"));
		listTableNamesResponse.setSuccess(_ctx.booleanValue("ListTableNamesResponse.Success"));

		List<String> tableNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListTableNamesResponse.TableNames.Length"); i++) {
			tableNames.add(_ctx.stringValue("ListTableNamesResponse.TableNames["+ i +"]"));
		}
		listTableNamesResponse.setTableNames(tableNames);
	 
	 	return listTableNamesResponse;
	}
}