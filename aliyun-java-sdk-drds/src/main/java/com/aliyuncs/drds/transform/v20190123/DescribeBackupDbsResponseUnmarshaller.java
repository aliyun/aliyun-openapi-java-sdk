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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeBackupDbsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupDbsResponseUnmarshaller {

	public static DescribeBackupDbsResponse unmarshall(DescribeBackupDbsResponse describeBackupDbsResponse, UnmarshallerContext _ctx) {
		
		describeBackupDbsResponse.setRequestId(_ctx.stringValue("DescribeBackupDbsResponse.RequestId"));
		describeBackupDbsResponse.setSuccess(_ctx.booleanValue("DescribeBackupDbsResponse.Success"));

		List<String> dbNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupDbsResponse.DbNames.Length"); i++) {
			dbNames.add(_ctx.stringValue("DescribeBackupDbsResponse.DbNames["+ i +"]"));
		}
		describeBackupDbsResponse.setDbNames(dbNames);
	 
	 	return describeBackupDbsResponse;
	}
}