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

import com.aliyuncs.drds.model.v20190123.DescribeRdsReadOnlyResponse;
import com.aliyuncs.drds.model.v20190123.DescribeRdsReadOnlyResponse.DbInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRdsReadOnlyResponseUnmarshaller {

	public static DescribeRdsReadOnlyResponse unmarshall(DescribeRdsReadOnlyResponse describeRdsReadOnlyResponse, UnmarshallerContext _ctx) {
		
		describeRdsReadOnlyResponse.setRequestId(_ctx.stringValue("DescribeRdsReadOnlyResponse.RequestId"));
		describeRdsReadOnlyResponse.setSuccess(_ctx.booleanValue("DescribeRdsReadOnlyResponse.Success"));

		List<DbInstance> dbInstances = new ArrayList<DbInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRdsReadOnlyResponse.DbInstances.Length"); i++) {
			DbInstance dbInstance = new DbInstance();
			dbInstance.setDBInstanceId(_ctx.stringValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].DBInstanceId"));
			dbInstance.setDmInstanceId(_ctx.stringValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].DmInstanceId"));
			dbInstance.setConnectUrl(_ctx.stringValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].ConnectUrl"));
			dbInstance.setPort(_ctx.integerValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].Port"));
			dbInstance.setDBInstanceStatus(_ctx.stringValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].DBInstanceStatus"));
			dbInstance.setDbInstType(_ctx.stringValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].DbInstType"));
			dbInstance.setReadWeight(_ctx.integerValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].ReadWeight"));
			dbInstance.setNetworkType(_ctx.stringValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].NetworkType"));
			dbInstance.setEngine(_ctx.stringValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].Engine"));
			dbInstance.setEngineVersion(_ctx.stringValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].EngineVersion"));
			dbInstance.setRdsInstType(_ctx.stringValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].RdsInstType"));
			dbInstance.setPayType(_ctx.stringValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].PayType"));
			dbInstance.setExpireTime(_ctx.stringValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].ExpireTime"));
			dbInstance.setRemainDays(_ctx.integerValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].RemainDays"));
			dbInstance.setDBInstanceClassType(_ctx.stringValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].DBInstanceClassType"));
			dbInstance.setDBInstanceCPU(_ctx.stringValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].DBInstanceCPU"));
			dbInstance.setDBInstanceMemory(_ctx.longValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].DBInstanceMemory"));
			dbInstance.setDBInstanceStorage(_ctx.longValue("DescribeRdsReadOnlyResponse.DbInstances["+ i +"].DBInstanceStorage"));

			dbInstances.add(dbInstance);
		}
		describeRdsReadOnlyResponse.setDbInstances(dbInstances);
	 
	 	return describeRdsReadOnlyResponse;
	}
}