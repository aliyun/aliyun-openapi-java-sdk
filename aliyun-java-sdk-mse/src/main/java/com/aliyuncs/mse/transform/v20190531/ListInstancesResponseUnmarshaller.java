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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListInstancesResponse;
import com.aliyuncs.mse.model.v20190531.ListInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setHttpStatusCode(_ctx.integerValue("ListInstancesResponse.HttpStatusCode"));
		listInstancesResponse.setMessage(_ctx.stringValue("ListInstancesResponse.Message"));
		listInstancesResponse.setCode(_ctx.integerValue("ListInstancesResponse.Code"));
		listInstancesResponse.setSuccess(_ctx.booleanValue("ListInstancesResponse.Success"));

		List<Instance> data = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Data.Length"); i++) {
			Instance instance = new Instance();
			instance.setAppClusterId(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].AppClusterId"));
			instance.setAppVersion(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].AppVersion"));
			instance.setDbPassword(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].DbPassword"));
			instance.setDbUrl(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].DbUrl"));
			instance.setDbUserName(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].DbUserName"));
			instance.setEndDate(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].EndDate"));
			instance.setEnvironmentId(_ctx.longValue("ListInstancesResponse.Data["+ i +"].EnvironmentId"));
			instance.setGmtCreate(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].GmtCreate"));
			instance.setGmtModified(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].GmtModified"));
			instance.setId(_ctx.longValue("ListInstancesResponse.Data["+ i +"].Id"));
			instance.setImageVersion(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].ImageVersion"));
			instance.setInstanceId(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].InstanceId"));
			instance.setIsCreatedRedis(_ctx.booleanValue("ListInstancesResponse.Data["+ i +"].IsCreatedRedis"));
			instance.setK8sResourceId(_ctx.longValue("ListInstancesResponse.Data["+ i +"].K8sResourceId"));
			instance.setName(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].Name"));
			instance.setNameServer(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].NameServer"));
			instance.setOrderId(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].OrderId"));
			instance.setPodCidr(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].PodCidr"));
			instance.setPrimaryUser(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].PrimaryUser"));
			instance.setRegion(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].Region"));
			instance.setReplica(_ctx.longValue("ListInstancesResponse.Data["+ i +"].Replica"));
			instance.setSeataServerUniqueId(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].SeataServerUniqueId"));
			instance.setSecurityGroup(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].SecurityGroup"));
			instance.setSpec(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].Spec"));
			instance.setStartDate(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].StartDate"));
			instance.setStatus(_ctx.longValue("ListInstancesResponse.Data["+ i +"].Status"));
			instance.setStatusDesc(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].StatusDesc"));
			instance.setStoreMode(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].StoreMode"));
			instance.setVpc(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].Vpc"));
			instance.setVswitch(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].Vswitch"));
			instance.setZoneId(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].ZoneId"));
			instance.setIsCreatedSlb(_ctx.booleanValue("ListInstancesResponse.Data["+ i +"].IsCreatedSlb"));
			instance.setNameServerPublic(_ctx.stringValue("ListInstancesResponse.Data["+ i +"].NameServerPublic"));

			data.add(instance);
		}
		listInstancesResponse.setData(data);
	 
	 	return listInstancesResponse;
	}
}