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

import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbInstanceResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbInstanceResponse.DbInstance;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsDbInstanceResponseUnmarshaller {

	public static DescribeDrdsDbInstanceResponse unmarshall(DescribeDrdsDbInstanceResponse describeDrdsDbInstanceResponse, UnmarshallerContext _ctx) {
		
		describeDrdsDbInstanceResponse.setRequestId(_ctx.stringValue("DescribeDrdsDbInstanceResponse.RequestId"));
		describeDrdsDbInstanceResponse.setSuccess(_ctx.booleanValue("DescribeDrdsDbInstanceResponse.Success"));

		DbInstance dbInstance = new DbInstance();
		dbInstance.setDBInstanceId(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.DBInstanceId"));
		dbInstance.setConnectUrl(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ConnectUrl"));
		dbInstance.setPort(_ctx.integerValue("DescribeDrdsDbInstanceResponse.DbInstance.Port"));
		dbInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.DBInstanceStatus"));
		dbInstance.setDbInstType(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.DbInstType"));
		dbInstance.setReadWeight(_ctx.integerValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadWeight"));
		dbInstance.setEngine(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.Engine"));
		dbInstance.setEngineVersion(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.EngineVersion"));
		dbInstance.setRdsInstType(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.RdsInstType"));
		dbInstance.setPayType(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.PayType"));
		dbInstance.setExpireTime(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ExpireTime"));
		dbInstance.setRemainDays(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.RemainDays"));
		dbInstance.setNetworkType(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.NetworkType"));

		List<ReadOnlyInstance> readOnlyInstances = new ArrayList<ReadOnlyInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances.Length"); i++) {
			ReadOnlyInstance readOnlyInstance = new ReadOnlyInstance();
			readOnlyInstance.setDBInstanceId(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].DBInstanceId"));
			readOnlyInstance.setConnectUrl(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].ConnectUrl"));
			readOnlyInstance.setPort(_ctx.integerValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].Port"));
			readOnlyInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].DBInstanceStatus"));
			readOnlyInstance.setDbInstType(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].DbInstType"));
			readOnlyInstance.setReadWeight(_ctx.integerValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].ReadWeight"));
			readOnlyInstance.setEngine(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].Engine"));
			readOnlyInstance.setEngineVersion(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].EngineVersion"));
			readOnlyInstance.setRdsInstType(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].RdsInstType"));
			readOnlyInstance.setPayType(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].PayType"));
			readOnlyInstance.setExpireTime(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].ExpireTime"));
			readOnlyInstance.setRemainDays(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].RemainDays"));
			readOnlyInstance.setNetworkType(_ctx.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].NetworkType"));
			readOnlyInstance.setVersionAction(_ctx.integerValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].VersionAction"));

			readOnlyInstances.add(readOnlyInstance);
		}
		dbInstance.setReadOnlyInstances(readOnlyInstances);
		describeDrdsDbInstanceResponse.setDbInstance(dbInstance);
	 
	 	return describeDrdsDbInstanceResponse;
	}
}