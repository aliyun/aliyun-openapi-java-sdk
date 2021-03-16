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

import com.aliyuncs.ecsops.model.v20160401.OpsDetailInstancesSimpleInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDetailInstancesSimpleInfoResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDetailInstancesSimpleInfoResponseUnmarshaller {

	public static OpsDetailInstancesSimpleInfoResponse unmarshall(OpsDetailInstancesSimpleInfoResponse opsDetailInstancesSimpleInfoResponse, UnmarshallerContext _ctx) {
		
		opsDetailInstancesSimpleInfoResponse.setRequestId(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.RequestId"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("OpsDetailInstancesSimpleInfoResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setAliUid(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].AliUid"));
			resource.setInstanceId(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].InstanceId"));
			resource.setInstanceType(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].InstanceType"));
			resource.setNetworkType(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].NetworkType"));
			resource.setVpcId(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].VpcId"));
			resource.setPrivateIpAddress(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].PrivateIpAddress"));
			resource.setPublicIpAddress(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].PublicIpAddress"));
			resource.setEip(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].Eip"));
			resource.setOsType(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].OsType"));
			resource.setOsVersion(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].OsVersion"));
			resource.setNcId(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].NcId"));
			resource.setNcIp(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].NcIp"));
			resource.setRackId(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].RackId"));
			resource.setZoneId(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].ZoneId"));
			resource.setClusterId(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].ClusterId"));
			resource.setGmtCreated(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].GmtCreated"));
			resource.setAsw(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].Asw"));
			resource.setStatus(_ctx.stringValue("OpsDetailInstancesSimpleInfoResponse.Resources["+ i +"].Status"));

			resources.add(resource);
		}
		opsDetailInstancesSimpleInfoResponse.setResources(resources);
	 
	 	return opsDetailInstancesSimpleInfoResponse;
	}
}