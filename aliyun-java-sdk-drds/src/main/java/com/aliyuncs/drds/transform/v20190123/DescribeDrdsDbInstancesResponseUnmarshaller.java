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

import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbInstancesResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbInstancesResponse.DbInstance;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbInstancesResponse.DbInstance.ReadOnlyInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsDbInstancesResponseUnmarshaller {

	public static DescribeDrdsDbInstancesResponse unmarshall(DescribeDrdsDbInstancesResponse describeDrdsDbInstancesResponse, UnmarshallerContext _ctx) {
		
		describeDrdsDbInstancesResponse.setRequestId(_ctx.stringValue("DescribeDrdsDbInstancesResponse.RequestId"));
		describeDrdsDbInstancesResponse.setPageSize(_ctx.stringValue("DescribeDrdsDbInstancesResponse.PageSize"));
		describeDrdsDbInstancesResponse.setPageNumber(_ctx.stringValue("DescribeDrdsDbInstancesResponse.PageNumber"));
		describeDrdsDbInstancesResponse.setTotal(_ctx.stringValue("DescribeDrdsDbInstancesResponse.Total"));
		describeDrdsDbInstancesResponse.setSuccess(_ctx.booleanValue("DescribeDrdsDbInstancesResponse.Success"));

		List<DbInstance> dbInstances = new ArrayList<DbInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsDbInstancesResponse.DbInstances.Length"); i++) {
			DbInstance dbInstance = new DbInstance();
			dbInstance.setExpireTime(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ExpireTime"));
			dbInstance.setPayType(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].PayType"));
			dbInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].DBInstanceStatus"));
			dbInstance.setNetworkType(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].NetworkType"));
			dbInstance.setPort(_ctx.integerValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].Port"));
			dbInstance.setEngineVersion(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].EngineVersion"));
			dbInstance.setDmInstanceId(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].DmInstanceId"));
			dbInstance.setConnectUrl(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ConnectUrl"));
			dbInstance.setReadWeight(_ctx.integerValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadWeight"));
			dbInstance.setRdsInstType(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].RdsInstType"));
			dbInstance.setRemainDays(_ctx.integerValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].RemainDays"));
			dbInstance.setDBInstanceId(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].DBInstanceId"));
			dbInstance.setDbInstType(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].DbInstType"));
			dbInstance.setEngine(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].Engine"));

			List<ReadOnlyInstance> readOnlyInstances = new ArrayList<ReadOnlyInstance>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances.Length"); j++) {
				ReadOnlyInstance readOnlyInstance = new ReadOnlyInstance();
				readOnlyInstance.setExpireTime(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].ExpireTime"));
				readOnlyInstance.setPayType(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].PayType"));
				readOnlyInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].DBInstanceStatus"));
				readOnlyInstance.setNetworkType(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].NetworkType"));
				readOnlyInstance.setPort(_ctx.integerValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].Port"));
				readOnlyInstance.setEngineVersion(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].EngineVersion"));
				readOnlyInstance.setDmInstanceId(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].DmInstanceId"));
				readOnlyInstance.setConnectUrl(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].ConnectUrl"));
				readOnlyInstance.setReadWeight(_ctx.integerValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].ReadWeight"));
				readOnlyInstance.setRdsInstType(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].RdsInstType"));
				readOnlyInstance.setInstanceName(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].InstanceName"));
				readOnlyInstance.setRemainDays(_ctx.integerValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].RemainDays"));
				readOnlyInstance.setDbInstType(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].DbInstType"));
				readOnlyInstance.setEngine(_ctx.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].Engine"));

				readOnlyInstances.add(readOnlyInstance);
			}
			dbInstance.setReadOnlyInstances(readOnlyInstances);

			dbInstances.add(dbInstance);
		}
		describeDrdsDbInstancesResponse.setDbInstances(dbInstances);
	 
	 	return describeDrdsDbInstancesResponse;
	}
}