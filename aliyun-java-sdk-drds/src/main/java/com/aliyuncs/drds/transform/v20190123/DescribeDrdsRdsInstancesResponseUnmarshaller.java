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

import com.aliyuncs.drds.model.v20190123.DescribeDrdsRdsInstancesResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsRdsInstancesResponse.DbInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsRdsInstancesResponseUnmarshaller {

	public static DescribeDrdsRdsInstancesResponse unmarshall(DescribeDrdsRdsInstancesResponse describeDrdsRdsInstancesResponse, UnmarshallerContext _ctx) {
		
		describeDrdsRdsInstancesResponse.setRequestId(_ctx.stringValue("DescribeDrdsRdsInstancesResponse.RequestId"));
		describeDrdsRdsInstancesResponse.setPageSize(_ctx.stringValue("DescribeDrdsRdsInstancesResponse.PageSize"));
		describeDrdsRdsInstancesResponse.setPageNumber(_ctx.stringValue("DescribeDrdsRdsInstancesResponse.PageNumber"));
		describeDrdsRdsInstancesResponse.setTotal(_ctx.stringValue("DescribeDrdsRdsInstancesResponse.Total"));
		describeDrdsRdsInstancesResponse.setSuccess(_ctx.booleanValue("DescribeDrdsRdsInstancesResponse.Success"));

		List<DbInstance> dbInstances = new ArrayList<DbInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsRdsInstancesResponse.DbInstances.Length"); i++) {
			DbInstance dbInstance = new DbInstance();
			dbInstance.setDBInstanceCPU(_ctx.stringValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].DBInstanceCPU"));
			dbInstance.setExpireTime(_ctx.stringValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].ExpireTime"));
			dbInstance.setDBInstanceMemory(_ctx.longValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].DBInstanceMemory"));
			dbInstance.setPayType(_ctx.stringValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].PayType"));
			dbInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].DBInstanceStatus"));
			dbInstance.setNetworkType(_ctx.stringValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].NetworkType"));
			dbInstance.setPort(_ctx.integerValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].Port"));
			dbInstance.setEngineVersion(_ctx.stringValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].EngineVersion"));
			dbInstance.setDmInstanceId(_ctx.stringValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].DmInstanceId"));
			dbInstance.setDBInstanceStorage(_ctx.longValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].DBInstanceStorage"));
			dbInstance.setConnectUrl(_ctx.stringValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].ConnectUrl"));
			dbInstance.setReadWeight(_ctx.integerValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].ReadWeight"));
			dbInstance.setRdsInstType(_ctx.stringValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].RdsInstType"));
			dbInstance.setRemainDays(_ctx.integerValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].RemainDays"));
			dbInstance.setDBInstanceClassType(_ctx.stringValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].DBInstanceClassType"));
			dbInstance.setDBInstanceId(_ctx.stringValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].DBInstanceId"));
			dbInstance.setEngine(_ctx.stringValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].Engine"));
			dbInstance.setDbInstType(_ctx.stringValue("DescribeDrdsRdsInstancesResponse.DbInstances["+ i +"].DbInstType"));

			dbInstances.add(dbInstance);
		}
		describeDrdsRdsInstancesResponse.setDbInstances(dbInstances);
	 
	 	return describeDrdsRdsInstancesResponse;
	}
}