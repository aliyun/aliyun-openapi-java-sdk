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

package com.aliyuncs.drds.transform.v20171016;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20171016.DescribeShardDBsResponse;
import com.aliyuncs.drds.model.v20171016.DescribeShardDBsResponse.DbIntancePair;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeShardDBsResponseUnmarshaller {

	public static DescribeShardDBsResponse unmarshall(DescribeShardDBsResponse describeShardDBsResponse, UnmarshallerContext _ctx) {
		
		describeShardDBsResponse.setRequestId(_ctx.stringValue("DescribeShardDBsResponse.RequestId"));
		describeShardDBsResponse.setSuccess(_ctx.booleanValue("DescribeShardDBsResponse.Success"));

		List<DbIntancePair> data = new ArrayList<DbIntancePair>();
		for (int i = 0; i < _ctx.lengthValue("DescribeShardDBsResponse.Data.Length"); i++) {
			DbIntancePair dbIntancePair = new DbIntancePair();
			dbIntancePair.setSubDbName(_ctx.stringValue("DescribeShardDBsResponse.Data["+ i +"].SubDbName"));
			dbIntancePair.setInstanceName(_ctx.stringValue("DescribeShardDBsResponse.Data["+ i +"].InstanceName"));
			dbIntancePair.setGroupName(_ctx.stringValue("DescribeShardDBsResponse.Data["+ i +"].GroupName"));

			data.add(dbIntancePair);
		}
		describeShardDBsResponse.setData(data);
	 
	 	return describeShardDBsResponse;
	}
}