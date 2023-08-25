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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOasSQLDetailsResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOasSQLDetailsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOasSQLDetailsResponseUnmarshaller {

	public static DescribeOasSQLDetailsResponse unmarshall(DescribeOasSQLDetailsResponse describeOasSQLDetailsResponse, UnmarshallerContext _ctx) {
		
		describeOasSQLDetailsResponse.setRequestId(_ctx.stringValue("DescribeOasSQLDetailsResponse.RequestId"));

		Data data = new Data();
		data.setFulltext(_ctx.stringValue("DescribeOasSQLDetailsResponse.Data.Fulltext"));
		data.setUserName(_ctx.stringValue("DescribeOasSQLDetailsResponse.Data.UserName"));
		data.setStatement(_ctx.stringValue("DescribeOasSQLDetailsResponse.Data.Statement"));
		data.setDbName(_ctx.stringValue("DescribeOasSQLDetailsResponse.Data.DbName"));

		List<String> tables = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOasSQLDetailsResponse.Data.Tables.Length"); i++) {
			tables.add(_ctx.stringValue("DescribeOasSQLDetailsResponse.Data.Tables["+ i +"]"));
		}
		data.setTables(tables);
		describeOasSQLDetailsResponse.setData(data);
	 
	 	return describeOasSQLDetailsResponse;
	}
}