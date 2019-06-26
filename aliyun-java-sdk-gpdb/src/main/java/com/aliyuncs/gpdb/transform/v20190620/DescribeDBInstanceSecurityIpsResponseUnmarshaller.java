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

package com.aliyuncs.gpdb.transform.v20190620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20190620.DescribeDBInstanceSecurityIpsResponse;
import com.aliyuncs.gpdb.model.v20190620.DescribeDBInstanceSecurityIpsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceSecurityIpsResponseUnmarshaller {

	public static DescribeDBInstanceSecurityIpsResponse unmarshall(DescribeDBInstanceSecurityIpsResponse describeDBInstanceSecurityIpsResponse, UnmarshallerContext context) {
		
		describeDBInstanceSecurityIpsResponse.setRequestId(context.stringValue("DescribeDBInstanceSecurityIpsResponse.RequestId"));
		describeDBInstanceSecurityIpsResponse.setCount(context.longValue("DescribeDBInstanceSecurityIpsResponse.Count"));
		describeDBInstanceSecurityIpsResponse.setSuccess(context.booleanValue("DescribeDBInstanceSecurityIpsResponse.Success"));
		describeDBInstanceSecurityIpsResponse.setHttpStatusCode(context.integerValue("DescribeDBInstanceSecurityIpsResponse.HttpStatusCode"));
		describeDBInstanceSecurityIpsResponse.setCode(context.stringValue("DescribeDBInstanceSecurityIpsResponse.Code"));
		describeDBInstanceSecurityIpsResponse.setMessage(context.stringValue("DescribeDBInstanceSecurityIpsResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstanceSecurityIpsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setGroupName(context.stringValue("DescribeDBInstanceSecurityIpsResponse.Result["+ i +"].GroupName"));

			List<String> whiteList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeDBInstanceSecurityIpsResponse.Result["+ i +"].WhiteList.Length"); j++) {
				whiteList.add(context.stringValue("DescribeDBInstanceSecurityIpsResponse.Result["+ i +"].WhiteList["+ j +"]"));
			}
			resultItem.setWhiteList(whiteList);

			result.add(resultItem);
		}
		describeDBInstanceSecurityIpsResponse.setResult(result);
	 
	 	return describeDBInstanceSecurityIpsResponse;
	}
}