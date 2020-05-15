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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.DescribeBackupPlanConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPlanConfigResponseUnmarshaller {

	public static DescribeBackupPlanConfigResponse unmarshall(DescribeBackupPlanConfigResponse describeBackupPlanConfigResponse, UnmarshallerContext _ctx) {
		
		describeBackupPlanConfigResponse.setRequestId(_ctx.stringValue("DescribeBackupPlanConfigResponse.RequestId"));
		describeBackupPlanConfigResponse.setFullBackupCycle(_ctx.integerValue("DescribeBackupPlanConfigResponse.FullBackupCycle"));
		describeBackupPlanConfigResponse.setMinHFileBackupCount(_ctx.integerValue("DescribeBackupPlanConfigResponse.MinHFileBackupCount"));
		describeBackupPlanConfigResponse.setNextFullBackupDate(_ctx.stringValue("DescribeBackupPlanConfigResponse.NextFullBackupDate"));

		List<String> tables = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupPlanConfigResponse.Tables.Length"); i++) {
			tables.add(_ctx.stringValue("DescribeBackupPlanConfigResponse.Tables["+ i +"]"));
		}
		describeBackupPlanConfigResponse.setTables(tables);
	 
	 	return describeBackupPlanConfigResponse;
	}
}