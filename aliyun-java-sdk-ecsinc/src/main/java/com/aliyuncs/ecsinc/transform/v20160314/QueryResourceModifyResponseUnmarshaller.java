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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.QueryResourceModifyResponse;
import com.aliyuncs.ecsinc.model.v20160314.QueryResourceModifyResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryResourceModifyResponseUnmarshaller {

	public static QueryResourceModifyResponse unmarshall(QueryResourceModifyResponse queryResourceModifyResponse, UnmarshallerContext context) {
		
		queryResourceModifyResponse.setRequestId(context.stringValue("QueryResourceModifyResponse.RequestId"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < context.lengthValue("QueryResourceModifyResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setIoOptimized(context.booleanValue("QueryResourceModifyResponse.Resources["+ i +"].IoOptimized"));

			List<String> systemDiskCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryResourceModifyResponse.Resources["+ i +"].SystemDiskCategories.Length"); j++) {
				systemDiskCategories.add(context.stringValue("QueryResourceModifyResponse.Resources["+ i +"].SystemDiskCategories["+ j +"]"));
			}
			resource.setSystemDiskCategories(systemDiskCategories);

			List<String> dataDiskCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryResourceModifyResponse.Resources["+ i +"].DataDiskCategories.Length"); j++) {
				dataDiskCategories.add(context.stringValue("QueryResourceModifyResponse.Resources["+ i +"].DataDiskCategories["+ j +"]"));
			}
			resource.setDataDiskCategories(dataDiskCategories);

			List<String> networkTypes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryResourceModifyResponse.Resources["+ i +"].NetworkTypes.Length"); j++) {
				networkTypes.add(context.stringValue("QueryResourceModifyResponse.Resources["+ i +"].NetworkTypes["+ j +"]"));
			}
			resource.setNetworkTypes(networkTypes);

			List<String> instanceTypes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryResourceModifyResponse.Resources["+ i +"].InstanceTypes.Length"); j++) {
				instanceTypes.add(context.stringValue("QueryResourceModifyResponse.Resources["+ i +"].InstanceTypes["+ j +"]"));
			}
			resource.setInstanceTypes(instanceTypes);

			List<String> instanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryResourceModifyResponse.Resources["+ i +"].InstanceTypeFamilies.Length"); j++) {
				instanceTypeFamilies.add(context.stringValue("QueryResourceModifyResponse.Resources["+ i +"].InstanceTypeFamilies["+ j +"]"));
			}
			resource.setInstanceTypeFamilies(instanceTypeFamilies);

			List<String> instanceGenerations = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryResourceModifyResponse.Resources["+ i +"].InstanceGenerations.Length"); j++) {
				instanceGenerations.add(context.stringValue("QueryResourceModifyResponse.Resources["+ i +"].InstanceGenerations["+ j +"]"));
			}
			resource.setInstanceGenerations(instanceGenerations);

			resources.add(resource);
		}
		queryResourceModifyResponse.setResources(resources);
	 
	 	return queryResourceModifyResponse;
	}
}