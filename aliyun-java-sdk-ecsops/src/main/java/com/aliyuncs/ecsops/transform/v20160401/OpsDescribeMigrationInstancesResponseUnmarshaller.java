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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeMigrationInstancesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeMigrationInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeMigrationInstancesResponseUnmarshaller {

	public static OpsDescribeMigrationInstancesResponse unmarshall(OpsDescribeMigrationInstancesResponse opsDescribeMigrationInstancesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeMigrationInstancesResponse.setRequestId(_ctx.stringValue("OpsDescribeMigrationInstancesResponse.RequestId"));
		opsDescribeMigrationInstancesResponse.setPageSize(_ctx.integerValue("OpsDescribeMigrationInstancesResponse.PageSize"));
		opsDescribeMigrationInstancesResponse.setPageNumber(_ctx.integerValue("OpsDescribeMigrationInstancesResponse.PageNumber"));
		opsDescribeMigrationInstancesResponse.setTotal(_ctx.integerValue("OpsDescribeMigrationInstancesResponse.Total"));

		List<Instance> instanceSet = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeMigrationInstancesResponse.InstanceSet.Length"); i++) {
			Instance instance = new Instance();
			instance.setStatus(_ctx.stringValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].Status"));
			instance.setNetworkTranType(_ctx.integerValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].NetworkTranType"));
			instance.setFinishTime(_ctx.stringValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].FinishTime"));
			instance.setSourceIzNo(_ctx.stringValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].SourceIzNo"));
			instance.setNeedKeepPrivateIp(_ctx.booleanValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].NeedKeepPrivateIp"));
			instance.setPrivateIpAfter(_ctx.stringValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].PrivateIpAfter"));
			instance.setCreateTime(_ctx.stringValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].CreateTime"));
			instance.setNeedNetworkConnectivity(_ctx.booleanValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].NeedNetworkConnectivity"));
			instance.setAliUid(_ctx.longValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].AliUid"));
			instance.setInstanceId(_ctx.stringValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].InstanceId"));
			instance.setTargetIzNo(_ctx.stringValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].TargetIzNo"));
			instance.setTransType(_ctx.integerValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].TransType"));
			instance.setNeedTransDisk(_ctx.booleanValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].NeedTransDisk"));
			instance.setMigrationPlanId(_ctx.stringValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].MigrationPlanId"));
			instance.setStartTime(_ctx.stringValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].StartTime"));
			instance.setPublicIp(_ctx.stringValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].PublicIp"));
			instance.setPrivateIpBefore(_ctx.stringValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].PrivateIpBefore"));
			instance.setNumericId(_ctx.longValue("OpsDescribeMigrationInstancesResponse.InstanceSet["+ i +"].NumericId"));

			instanceSet.add(instance);
		}
		opsDescribeMigrationInstancesResponse.setInstanceSet(instanceSet);
	 
	 	return opsDescribeMigrationInstancesResponse;
	}
}