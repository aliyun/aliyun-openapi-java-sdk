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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.ListInstancesTrafficPackagesResponse;
import com.aliyuncs.swas_open.model.v20200601.ListInstancesTrafficPackagesResponse.InstanceTrafficPackageUsage;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesTrafficPackagesResponseUnmarshaller {

	public static ListInstancesTrafficPackagesResponse unmarshall(ListInstancesTrafficPackagesResponse listInstancesTrafficPackagesResponse, UnmarshallerContext _ctx) {
		
		listInstancesTrafficPackagesResponse.setRequestId(_ctx.stringValue("ListInstancesTrafficPackagesResponse.RequestId"));

		List<InstanceTrafficPackageUsage> instanceTrafficPackageUsages = new ArrayList<InstanceTrafficPackageUsage>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesTrafficPackagesResponse.InstanceTrafficPackageUsages.Length"); i++) {
			InstanceTrafficPackageUsage instanceTrafficPackageUsage = new InstanceTrafficPackageUsage();
			instanceTrafficPackageUsage.setInstanceId(_ctx.stringValue("ListInstancesTrafficPackagesResponse.InstanceTrafficPackageUsages["+ i +"].InstanceId"));
			instanceTrafficPackageUsage.setTrafficUsed(_ctx.longValue("ListInstancesTrafficPackagesResponse.InstanceTrafficPackageUsages["+ i +"].TrafficUsed"));
			instanceTrafficPackageUsage.setTrafficPackageTotal(_ctx.longValue("ListInstancesTrafficPackagesResponse.InstanceTrafficPackageUsages["+ i +"].TrafficPackageTotal"));
			instanceTrafficPackageUsage.setTrafficPackageRemaining(_ctx.longValue("ListInstancesTrafficPackagesResponse.InstanceTrafficPackageUsages["+ i +"].TrafficPackageRemaining"));
			instanceTrafficPackageUsage.setTrafficOverflow(_ctx.longValue("ListInstancesTrafficPackagesResponse.InstanceTrafficPackageUsages["+ i +"].TrafficOverflow"));

			instanceTrafficPackageUsages.add(instanceTrafficPackageUsage);
		}
		listInstancesTrafficPackagesResponse.setInstanceTrafficPackageUsages(instanceTrafficPackageUsages);
	 
	 	return listInstancesTrafficPackagesResponse;
	}
}