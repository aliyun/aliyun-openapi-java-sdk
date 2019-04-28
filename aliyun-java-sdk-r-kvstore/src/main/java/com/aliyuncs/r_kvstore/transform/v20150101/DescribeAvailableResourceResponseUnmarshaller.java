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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeAvailableResourceResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAvailableResourceResponse.AvailableZone;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion.SupportedArchitectureType;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion.SupportedArchitectureType.SupportedPerformanceType;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion.SupportedArchitectureType.SupportedPerformanceType.SupportedStorageType;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion.SupportedArchitectureType.SupportedPerformanceType.SupportedStorageType.SupportedNodeType;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion.SupportedArchitectureType.SupportedPerformanceType.SupportedStorageType.SupportedNodeType.SupportedPackageType;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion.SupportedArchitectureType.SupportedPerformanceType.SupportedStorageType.SupportedNodeType.SupportedPackageType.AvailableResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableResourceResponseUnmarshaller {

	public static DescribeAvailableResourceResponse unmarshall(DescribeAvailableResourceResponse describeAvailableResourceResponse, UnmarshallerContext context) {
		
		describeAvailableResourceResponse.setRequestId(context.stringValue("DescribeAvailableResourceResponse.RequestId"));

		List<AvailableZone> availableZones = new ArrayList<AvailableZone>();
		for (int i = 0; i < context.lengthValue("DescribeAvailableResourceResponse.AvailableZones.Length"); i++) {
			AvailableZone availableZone = new AvailableZone();
			availableZone.setRegionId(context.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].RegionId"));
			availableZone.setZoneId(context.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].ZoneId"));
			availableZone.setStatus(context.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].Status"));
			availableZone.setNetworkTypes(context.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].NetworkTypes"));

			List<SupportedEngine> supportedEngines = new ArrayList<SupportedEngine>();
			for (int j = 0; j < context.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines.Length"); j++) {
				SupportedEngine supportedEngine = new SupportedEngine();
				supportedEngine.setEngine(context.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].Engine"));

				List<SupportedEngineVersion> supportedEngineVersions = new ArrayList<SupportedEngineVersion>();
				for (int k = 0; k < context.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions.Length"); k++) {
					SupportedEngineVersion supportedEngineVersion = new SupportedEngineVersion();
					supportedEngineVersion.setVersion(context.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].Version"));

					List<SupportedArchitectureType> supportedArchitectureTypes = new ArrayList<SupportedArchitectureType>();
					for (int l = 0; l < context.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedArchitectureTypes.Length"); l++) {
						SupportedArchitectureType supportedArchitectureType = new SupportedArchitectureType();
						supportedArchitectureType.setArchitecture(context.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedArchitectureTypes["+ l +"].Architecture"));

						List<SupportedPerformanceType> supportedPerformanceTypes = new ArrayList<SupportedPerformanceType>();
						for (int m = 0; m < context.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedArchitectureTypes["+ l +"].SupportedPerformanceTypes.Length"); m++) {
							SupportedPerformanceType supportedPerformanceType = new SupportedPerformanceType();
							supportedPerformanceType.setPerformanceType(context.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedArchitectureTypes["+ l +"].SupportedPerformanceTypes["+ m +"].PerformanceType"));

							List<SupportedStorageType> supportedStorageTypes = new ArrayList<SupportedStorageType>();
							for (int n = 0; n < context.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedArchitectureTypes["+ l +"].SupportedPerformanceTypes["+ m +"].SupportedStorageTypes.Length"); n++) {
								SupportedStorageType supportedStorageType = new SupportedStorageType();
								supportedStorageType.setStorageType(context.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedArchitectureTypes["+ l +"].SupportedPerformanceTypes["+ m +"].SupportedStorageTypes["+ n +"].StorageType"));

								List<SupportedNodeType> supportedNodeTypes = new ArrayList<SupportedNodeType>();
								for (int o = 0; o < context.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedArchitectureTypes["+ l +"].SupportedPerformanceTypes["+ m +"].SupportedStorageTypes["+ n +"].SupportedNodeTypes.Length"); o++) {
									SupportedNodeType supportedNodeType = new SupportedNodeType();
									supportedNodeType.setNodeType(context.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedArchitectureTypes["+ l +"].SupportedPerformanceTypes["+ m +"].SupportedStorageTypes["+ n +"].SupportedNodeTypes["+ o +"].NodeType"));

									List<SupportedPackageType> supportedPackageTypes = new ArrayList<SupportedPackageType>();
									for (int p = 0; p < context.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedArchitectureTypes["+ l +"].SupportedPerformanceTypes["+ m +"].SupportedStorageTypes["+ n +"].SupportedNodeTypes["+ o +"].SupportedPackageTypes.Length"); p++) {
										SupportedPackageType supportedPackageType = new SupportedPackageType();
										supportedPackageType.setPackageType(context.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedArchitectureTypes["+ l +"].SupportedPerformanceTypes["+ m +"].SupportedStorageTypes["+ n +"].SupportedNodeTypes["+ o +"].SupportedPackageTypes["+ p +"].PackageType"));

										List<AvailableResource> availableResources = new ArrayList<AvailableResource>();
										for (int q = 0; q < context.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedArchitectureTypes["+ l +"].SupportedPerformanceTypes["+ m +"].SupportedStorageTypes["+ n +"].SupportedNodeTypes["+ o +"].SupportedPackageTypes["+ p +"].AvailableResources.Length"); q++) {
											AvailableResource availableResource = new AvailableResource();
											availableResource.setInstanceClass(context.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedArchitectureTypes["+ l +"].SupportedPerformanceTypes["+ m +"].SupportedStorageTypes["+ n +"].SupportedNodeTypes["+ o +"].SupportedPackageTypes["+ p +"].AvailableResources["+ q +"].InstanceClass"));

											availableResources.add(availableResource);
										}
										supportedPackageType.setAvailableResources(availableResources);

										supportedPackageTypes.add(supportedPackageType);
									}
									supportedNodeType.setSupportedPackageTypes(supportedPackageTypes);

									supportedNodeTypes.add(supportedNodeType);
								}
								supportedStorageType.setSupportedNodeTypes(supportedNodeTypes);

								supportedStorageTypes.add(supportedStorageType);
							}
							supportedPerformanceType.setSupportedStorageTypes(supportedStorageTypes);

							supportedPerformanceTypes.add(supportedPerformanceType);
						}
						supportedArchitectureType.setSupportedPerformanceTypes(supportedPerformanceTypes);

						supportedArchitectureTypes.add(supportedArchitectureType);
					}
					supportedEngineVersion.setSupportedArchitectureTypes(supportedArchitectureTypes);

					supportedEngineVersions.add(supportedEngineVersion);
				}
				supportedEngine.setSupportedEngineVersions(supportedEngineVersions);

				supportedEngines.add(supportedEngine);
			}
			availableZone.setSupportedEngines(supportedEngines);

			availableZones.add(availableZone);
		}
		describeAvailableResourceResponse.setAvailableZones(availableZones);
	 
	 	return describeAvailableResourceResponse;
	}
}