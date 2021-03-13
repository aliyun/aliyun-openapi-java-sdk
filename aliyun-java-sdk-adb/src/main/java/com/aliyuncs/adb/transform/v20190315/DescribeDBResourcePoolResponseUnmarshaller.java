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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeDBResourcePoolResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDBResourcePoolResponse.PoolInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBResourcePoolResponseUnmarshaller {

	public static DescribeDBResourcePoolResponse unmarshall(DescribeDBResourcePoolResponse describeDBResourcePoolResponse, UnmarshallerContext _ctx) {
		
		describeDBResourcePoolResponse.setRequestId(_ctx.stringValue("DescribeDBResourcePoolResponse.RequestId"));

		List<PoolInfo> poolsInfo = new ArrayList<PoolInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBResourcePoolResponse.PoolsInfo.Length"); i++) {
			PoolInfo poolInfo = new PoolInfo();
			poolInfo.setPoolName(_ctx.stringValue("DescribeDBResourcePoolResponse.PoolsInfo["+ i +"].PoolName"));
			poolInfo.setQueryType(_ctx.stringValue("DescribeDBResourcePoolResponse.PoolsInfo["+ i +"].QueryType"));
			poolInfo.setNodeNum(_ctx.integerValue("DescribeDBResourcePoolResponse.PoolsInfo["+ i +"].NodeNum"));
			poolInfo.setPoolUsers(_ctx.stringValue("DescribeDBResourcePoolResponse.PoolsInfo["+ i +"].PoolUsers"));
			poolInfo.setCreateTime(_ctx.stringValue("DescribeDBResourcePoolResponse.PoolsInfo["+ i +"].CreateTime"));
			poolInfo.setUpdateTime(_ctx.stringValue("DescribeDBResourcePoolResponse.PoolsInfo["+ i +"].UpdateTime"));

			poolsInfo.add(poolInfo);
		}
		describeDBResourcePoolResponse.setPoolsInfo(poolsInfo);
	 
	 	return describeDBResourcePoolResponse;
	}
}