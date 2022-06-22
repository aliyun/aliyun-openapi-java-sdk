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

import com.aliyuncs.mse.model.v20190531.ListUserInstancesResponse;
import com.aliyuncs.mse.model.v20190531.ListUserInstancesResponse.Clusters;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserInstancesResponseUnmarshaller {

	public static ListUserInstancesResponse unmarshall(ListUserInstancesResponse listUserInstancesResponse, UnmarshallerContext _ctx) {
		
		listUserInstancesResponse.setRequestId(_ctx.stringValue("ListUserInstancesResponse.RequestId"));
		listUserInstancesResponse.setHttpStatusCode(_ctx.integerValue("ListUserInstancesResponse.HttpStatusCode"));
		listUserInstancesResponse.setMessage(_ctx.stringValue("ListUserInstancesResponse.Message"));
		listUserInstancesResponse.setCode(_ctx.integerValue("ListUserInstancesResponse.Code"));
		listUserInstancesResponse.setSuccess(_ctx.booleanValue("ListUserInstancesResponse.Success"));

		List<Clusters> data = new ArrayList<Clusters>();
		for (int i = 0; i < _ctx.lengthValue("ListUserInstancesResponse.Data.Length"); i++) {
			Clusters clusters = new Clusters();
			clusters.setAppClusterId(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].AppClusterId"));
			clusters.setAppVersion(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].AppVersion"));
			clusters.setDbPassword(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].DbPassword"));
			clusters.setDbUrl(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].DbUrl"));
			clusters.setDbUserName(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].DbUserName"));
			clusters.setEndDate(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].EndDate"));
			clusters.setEnvironmentId(_ctx.longValue("ListUserInstancesResponse.Data["+ i +"].EnvironmentId"));
			clusters.setGmtCreate(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].GmtCreate"));
			clusters.setGmtModified(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].GmtModified"));
			clusters.setId(_ctx.longValue("ListUserInstancesResponse.Data["+ i +"].Id"));
			clusters.setImageVersion(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].ImageVersion"));
			clusters.setInstanceId(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].InstanceId"));
			clusters.setIsCreatedRedis(_ctx.booleanValue("ListUserInstancesResponse.Data["+ i +"].IsCreatedRedis"));
			clusters.setK8sResourceId(_ctx.longValue("ListUserInstancesResponse.Data["+ i +"].K8sResourceId"));
			clusters.setName(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].Name"));
			clusters.setNameServer(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].NameServer"));
			clusters.setOrderId(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].OrderId"));
			clusters.setPodCidr(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].PodCidr"));
			clusters.setPrimaryUser(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].PrimaryUser"));
			clusters.setRegion(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].Region"));
			clusters.setReplica(_ctx.longValue("ListUserInstancesResponse.Data["+ i +"].Replica"));
			clusters.setSeataServerUniqueId(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].SeataServerUniqueId"));
			clusters.setSecurityGroup(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].SecurityGroup"));
			clusters.setSpec(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].Spec"));
			clusters.setStartDate(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].StartDate"));
			clusters.setStatus(_ctx.longValue("ListUserInstancesResponse.Data["+ i +"].Status"));
			clusters.setStatusDesc(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].StatusDesc"));
			clusters.setStoreMode(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].StoreMode"));
			clusters.setVpc(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].Vpc"));
			clusters.setZoneId(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].ZoneId"));
			clusters.setVswitch(_ctx.stringValue("ListUserInstancesResponse.Data["+ i +"].Vswitch"));

			data.add(clusters);
		}
		listUserInstancesResponse.setData(data);
	 
	 	return listUserInstancesResponse;
	}
}