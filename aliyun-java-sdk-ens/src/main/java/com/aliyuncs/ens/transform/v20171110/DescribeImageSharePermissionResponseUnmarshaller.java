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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeImageSharePermissionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageSharePermissionResponseUnmarshaller {

	public static DescribeImageSharePermissionResponse unmarshall(DescribeImageSharePermissionResponse describeImageSharePermissionResponse, UnmarshallerContext _ctx) {
		
		describeImageSharePermissionResponse.setRequestId(_ctx.stringValue("DescribeImageSharePermissionResponse.RequestId"));
		describeImageSharePermissionResponse.setTotalCount(_ctx.integerValue("DescribeImageSharePermissionResponse.TotalCount"));
		describeImageSharePermissionResponse.setPageNumber(_ctx.integerValue("DescribeImageSharePermissionResponse.PageNumber"));
		describeImageSharePermissionResponse.setPageSize(_ctx.integerValue("DescribeImageSharePermissionResponse.PageSize"));
		describeImageSharePermissionResponse.setImageId(_ctx.stringValue("DescribeImageSharePermissionResponse.ImageId"));

		List<String> accounts = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageSharePermissionResponse.Accounts.Length"); i++) {
			accounts.add(_ctx.stringValue("DescribeImageSharePermissionResponse.Accounts["+ i +"]"));
		}
		describeImageSharePermissionResponse.setAccounts(accounts);
	 
	 	return describeImageSharePermissionResponse;
	}
}