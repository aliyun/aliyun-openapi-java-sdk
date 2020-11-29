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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeAvailableResourcesResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeAvailableResourcesResponse.Resource;
import com.aliyuncs.gpdb.model.v20160503.DescribeAvailableResourcesResponse.Resource.SupportedEngine;
import com.aliyuncs.gpdb.model.v20160503.DescribeAvailableResourcesResponse.Resource.SupportedEngine.SupportedInstanceClass;
import com.aliyuncs.gpdb.model.v20160503.DescribeAvailableResourcesResponse.Resource.SupportedEngine.SupportedInstanceClass.NodeCount;
import com.aliyuncs.gpdb.model.v20160503.DescribeAvailableResourcesResponse.Resource.SupportedEngine.SupportedInstanceClass.StorageSize;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableResourcesResponseUnmarshaller {

	public static DescribeAvailableResourcesResponse unmarshall(DescribeAvailableResourcesResponse describeAvailableResourcesResponse, UnmarshallerContext _ctx) {
		
		describeAvailableResourcesResponse.setRequestId(_ctx.stringValue("DescribeAvailableResourcesResponse.RequestId"));
		describeAvailableResourcesResponse.setRegionId(_ctx.stringValue("DescribeAvailableResourcesResponse.RegionId"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableResourcesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setZoneId(_ctx.stringValue("DescribeAvailableResourcesResponse.Resources["+ i +"].ZoneId"));

			List<SupportedEngine> supportedEngines = new ArrayList<SupportedEngine>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableResourcesResponse.Resources["+ i +"].SupportedEngines.Length"); j++) {
				SupportedEngine supportedEngine = new SupportedEngine();
				supportedEngine.setSupportedEngineVersion(_ctx.stringValue("DescribeAvailableResourcesResponse.Resources["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersion"));
				supportedEngine.setMode(_ctx.stringValue("DescribeAvailableResourcesResponse.Resources["+ i +"].SupportedEngines["+ j +"].Mode"));

				List<SupportedInstanceClass> supportedInstanceClasses = new ArrayList<SupportedInstanceClass>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAvailableResourcesResponse.Resources["+ i +"].SupportedEngines["+ j +"].SupportedInstanceClasses.Length"); k++) {
					SupportedInstanceClass supportedInstanceClass = new SupportedInstanceClass();
					supportedInstanceClass.setDisplayClass(_ctx.stringValue("DescribeAvailableResourcesResponse.Resources["+ i +"].SupportedEngines["+ j +"].SupportedInstanceClasses["+ k +"].DisplayClass"));
					supportedInstanceClass.setInstanceClass(_ctx.stringValue("DescribeAvailableResourcesResponse.Resources["+ i +"].SupportedEngines["+ j +"].SupportedInstanceClasses["+ k +"].InstanceClass"));
					supportedInstanceClass.setDescription(_ctx.stringValue("DescribeAvailableResourcesResponse.Resources["+ i +"].SupportedEngines["+ j +"].SupportedInstanceClasses["+ k +"].Description"));
					supportedInstanceClass.setStorageType(_ctx.stringValue("DescribeAvailableResourcesResponse.Resources["+ i +"].SupportedEngines["+ j +"].SupportedInstanceClasses["+ k +"].StorageType"));

					NodeCount nodeCount = new NodeCount();
					nodeCount.setMinCount(_ctx.stringValue("DescribeAvailableResourcesResponse.Resources["+ i +"].SupportedEngines["+ j +"].SupportedInstanceClasses["+ k +"].NodeCount.MinCount"));
					nodeCount.setMaxCount(_ctx.stringValue("DescribeAvailableResourcesResponse.Resources["+ i +"].SupportedEngines["+ j +"].SupportedInstanceClasses["+ k +"].NodeCount.MaxCount"));
					nodeCount.setStep(_ctx.stringValue("DescribeAvailableResourcesResponse.Resources["+ i +"].SupportedEngines["+ j +"].SupportedInstanceClasses["+ k +"].NodeCount.Step"));
					supportedInstanceClass.setNodeCount(nodeCount);

					StorageSize storageSize = new StorageSize();
					storageSize.setMinCount(_ctx.stringValue("DescribeAvailableResourcesResponse.Resources["+ i +"].SupportedEngines["+ j +"].SupportedInstanceClasses["+ k +"].StorageSize.MinCount"));
					storageSize.setMaxCount(_ctx.stringValue("DescribeAvailableResourcesResponse.Resources["+ i +"].SupportedEngines["+ j +"].SupportedInstanceClasses["+ k +"].StorageSize.MaxCount"));
					storageSize.setStep(_ctx.stringValue("DescribeAvailableResourcesResponse.Resources["+ i +"].SupportedEngines["+ j +"].SupportedInstanceClasses["+ k +"].StorageSize.Step"));
					supportedInstanceClass.setStorageSize(storageSize);

					supportedInstanceClasses.add(supportedInstanceClass);
				}
				supportedEngine.setSupportedInstanceClasses(supportedInstanceClasses);

				supportedEngines.add(supportedEngine);
			}
			resource.setSupportedEngines(supportedEngines);

			resources.add(resource);
		}
		describeAvailableResourcesResponse.setResources(resources);
	 
	 	return describeAvailableResourcesResponse;
	}
}