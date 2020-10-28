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

package com.aliyuncs.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.DescribePolarxDbInstancesResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribePolarxDbInstancesResponse.DbInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePolarxDbInstancesResponseUnmarshaller {

	public static DescribePolarxDbInstancesResponse unmarshall(DescribePolarxDbInstancesResponse describePolarxDbInstancesResponse, UnmarshallerContext _ctx) {
		
		describePolarxDbInstancesResponse.setRequestId(_ctx.stringValue("DescribePolarxDbInstancesResponse.RequestId"));
		describePolarxDbInstancesResponse.setSuccess(_ctx.booleanValue("DescribePolarxDbInstancesResponse.Success"));
		describePolarxDbInstancesResponse.setPageNumber(_ctx.stringValue("DescribePolarxDbInstancesResponse.PageNumber"));
		describePolarxDbInstancesResponse.setPageSize(_ctx.stringValue("DescribePolarxDbInstancesResponse.PageSize"));
		describePolarxDbInstancesResponse.setTotal(_ctx.stringValue("DescribePolarxDbInstancesResponse.Total"));

		List<DbInstance> dbInstances = new ArrayList<DbInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribePolarxDbInstancesResponse.DbInstances.Length"); i++) {
			DbInstance dbInstance = new DbInstance();
			dbInstance.setDBInstanceId(_ctx.stringValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].DBInstanceId"));
			dbInstance.setDescription(_ctx.stringValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].Description"));
			dbInstance.setPayType(_ctx.stringValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].PayType"));
			dbInstance.setCreateTime(_ctx.stringValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].CreateTime"));
			dbInstance.setExpireTime(_ctx.stringValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].ExpireTime"));
			dbInstance.setRegionId(_ctx.stringValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].RegionId"));
			dbInstance.setZoneId(_ctx.stringValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].ZoneId"));
			dbInstance.setNetwork(_ctx.stringValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].Network"));
			dbInstance.setVPCId(_ctx.stringValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].VPCId"));
			dbInstance.setEngine(_ctx.stringValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].Engine"));
			dbInstance.setDBType(_ctx.stringValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].DBType"));
			dbInstance.setDBVersion(_ctx.stringValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].DBVersion"));
			dbInstance.setStatus(_ctx.stringValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].Status"));
			dbInstance.setStatusDesc(_ctx.stringValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].StatusDesc"));
			dbInstance.setLockMode(_ctx.stringValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].LockMode"));
			dbInstance.setLockReason(_ctx.stringValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].lockReason"));
			dbInstance.setNodeCount(_ctx.integerValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].NodeCount"));
			dbInstance.setNodeClass(_ctx.stringValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].NodeClass"));
			dbInstance.setStorageUsed(_ctx.integerValue("DescribePolarxDbInstancesResponse.DbInstances["+ i +"].StorageUsed"));

			dbInstances.add(dbInstance);
		}
		describePolarxDbInstancesResponse.setDbInstances(dbInstances);
	 
	 	return describePolarxDbInstancesResponse;
	}
}