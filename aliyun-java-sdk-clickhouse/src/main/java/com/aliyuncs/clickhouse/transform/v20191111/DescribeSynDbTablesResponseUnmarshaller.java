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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeSynDbTablesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSynDbTablesResponseUnmarshaller {

	public static DescribeSynDbTablesResponse unmarshall(DescribeSynDbTablesResponse describeSynDbTablesResponse, UnmarshallerContext _ctx) {
		
		describeSynDbTablesResponse.setRequestId(_ctx.stringValue("DescribeSynDbTablesResponse.RequestId"));

		List<String> tables = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSynDbTablesResponse.Tables.Length"); i++) {
			tables.add(_ctx.stringValue("DescribeSynDbTablesResponse.Tables["+ i +"]"));
		}
		describeSynDbTablesResponse.setTables(tables);
	 
	 	return describeSynDbTablesResponse;
	}
}