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

import com.aliyuncs.clickhouse.model.v20191111.DescribeAccountAuthorityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountAuthorityResponseUnmarshaller {

	public static DescribeAccountAuthorityResponse unmarshall(DescribeAccountAuthorityResponse describeAccountAuthorityResponse, UnmarshallerContext _ctx) {
		
		describeAccountAuthorityResponse.setRequestId(_ctx.stringValue("DescribeAccountAuthorityResponse.RequestId"));
		describeAccountAuthorityResponse.setDdlAuthority(_ctx.booleanValue("DescribeAccountAuthorityResponse.DdlAuthority"));
		describeAccountAuthorityResponse.setDmlAuthority(_ctx.stringValue("DescribeAccountAuthorityResponse.DmlAuthority"));
		describeAccountAuthorityResponse.setAccountName(_ctx.stringValue("DescribeAccountAuthorityResponse.AccountName"));

		List<String> totalDatabases = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountAuthorityResponse.TotalDatabases.Length"); i++) {
			totalDatabases.add(_ctx.stringValue("DescribeAccountAuthorityResponse.TotalDatabases["+ i +"]"));
		}
		describeAccountAuthorityResponse.setTotalDatabases(totalDatabases);

		List<String> totalDictionaries = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountAuthorityResponse.TotalDictionaries.Length"); i++) {
			totalDictionaries.add(_ctx.stringValue("DescribeAccountAuthorityResponse.TotalDictionaries["+ i +"]"));
		}
		describeAccountAuthorityResponse.setTotalDictionaries(totalDictionaries);

		List<String> allowDictionaries = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountAuthorityResponse.AllowDictionaries.Length"); i++) {
			allowDictionaries.add(_ctx.stringValue("DescribeAccountAuthorityResponse.AllowDictionaries["+ i +"]"));
		}
		describeAccountAuthorityResponse.setAllowDictionaries(allowDictionaries);

		List<String> allowDatabases = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountAuthorityResponse.AllowDatabases.Length"); i++) {
			allowDatabases.add(_ctx.stringValue("DescribeAccountAuthorityResponse.AllowDatabases["+ i +"]"));
		}
		describeAccountAuthorityResponse.setAllowDatabases(allowDatabases);
	 
	 	return describeAccountAuthorityResponse;
	}
}