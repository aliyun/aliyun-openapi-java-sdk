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
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEditionType;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEditionType.SupportedSeriesType;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEditionType.SupportedSeriesType.SupportedEngineVersion;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEditionType.SupportedSeriesType.SupportedEngineVersion.SupportedArchitectureType;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEditionType.SupportedSeriesType.SupportedEngineVersion.SupportedArchitectureType.SupportedShardNumber;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEditionType.SupportedSeriesType.SupportedEngineVersion.SupportedArchitectureType.SupportedShardNumber.SupportedNodeType;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEditionType.SupportedSeriesType.SupportedEngineVersion.SupportedArchitectureType.SupportedShardNumber.SupportedNodeType.AvailableResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableResourceResponseUnmarshaller {

	public static DescribeAvailableResourceResponse unmarshall(DescribeAvailableResourceResponse describeAvailableResourceResponse, UnmarshallerContext _ctx) {
		
		describeAvailableResourceResponse.setRequestId(_ctx.stringValue("DescribeAvailableResourceResponse.RequestId"));

		List<AvailableZone> availableZones = new ArrayList<AvailableZone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones.Length"); i++) {
			AvailableZone availableZone = new AvailableZone();
			availableZone.setRegionId(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].RegionId"));
			availableZone.setZoneId(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].ZoneId"));
			availableZone.setStatus(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].Status"));
			availableZone.setNetworkTypes(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].NetworkTypes"));
			availableZone.setZoneName(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].ZoneName"));

			List<SupportedEngine> supportedEngines = new ArrayList<SupportedEngine>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines.Length"); j++) {
				SupportedEngine supportedEngine = new SupportedEngine();
				supportedEngine.setEngine(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].Engine"));

				List<SupportedEditionType> supportedEditionTypes = new ArrayList<SupportedEditionType>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEditionTypes.Length"); k++) {
					SupportedEditionType supportedEditionType = new SupportedEditionType();
					supportedEditionType.setEditionType(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEditionTypes["+ k +"].EditionType"));

					List<SupportedSeriesType> supportedSeriesTypes = new ArrayList<SupportedSeriesType>();
					for (int l = 0; l < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEditionTypes["+ k +"].SupportedSeriesTypes.Length"); l++) {
						SupportedSeriesType supportedSeriesType = new SupportedSeriesType();
						supportedSeriesType.setSeriesType(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEditionTypes["+ k +"].SupportedSeriesTypes["+ l +"].SeriesType"));

						List<SupportedEngineVersion> supportedEngineVersions = new ArrayList<SupportedEngineVersion>();
						for (int m = 0; m < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEditionTypes["+ k +"].SupportedSeriesTypes["+ l +"].SupportedEngineVersions.Length"); m++) {
							SupportedEngineVersion supportedEngineVersion = new SupportedEngineVersion();
							supportedEngineVersion.setVersion(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEditionTypes["+ k +"].SupportedSeriesTypes["+ l +"].SupportedEngineVersions["+ m +"].Version"));

							List<SupportedArchitectureType> supportedArchitectureTypes = new ArrayList<SupportedArchitectureType>();
							for (int n = 0; n < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEditionTypes["+ k +"].SupportedSeriesTypes["+ l +"].SupportedEngineVersions["+ m +"].SupportedArchitectureTypes.Length"); n++) {
								SupportedArchitectureType supportedArchitectureType = new SupportedArchitectureType();
								supportedArchitectureType.setArchitecture(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEditionTypes["+ k +"].SupportedSeriesTypes["+ l +"].SupportedEngineVersions["+ m +"].SupportedArchitectureTypes["+ n +"].Architecture"));

								List<SupportedShardNumber> supportedShardNumbers = new ArrayList<SupportedShardNumber>();
								for (int o = 0; o < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEditionTypes["+ k +"].SupportedSeriesTypes["+ l +"].SupportedEngineVersions["+ m +"].SupportedArchitectureTypes["+ n +"].SupportedShardNumbers.Length"); o++) {
									SupportedShardNumber supportedShardNumber = new SupportedShardNumber();
									supportedShardNumber.setShardNumber(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEditionTypes["+ k +"].SupportedSeriesTypes["+ l +"].SupportedEngineVersions["+ m +"].SupportedArchitectureTypes["+ n +"].SupportedShardNumbers["+ o +"].ShardNumber"));

									List<SupportedNodeType> supportedNodeTypes = new ArrayList<SupportedNodeType>();
									for (int p = 0; p < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEditionTypes["+ k +"].SupportedSeriesTypes["+ l +"].SupportedEngineVersions["+ m +"].SupportedArchitectureTypes["+ n +"].SupportedShardNumbers["+ o +"].SupportedNodeTypes.Length"); p++) {
										SupportedNodeType supportedNodeType = new SupportedNodeType();
										supportedNodeType.setSupportedNodeType(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEditionTypes["+ k +"].SupportedSeriesTypes["+ l +"].SupportedEngineVersions["+ m +"].SupportedArchitectureTypes["+ n +"].SupportedShardNumbers["+ o +"].SupportedNodeTypes["+ p +"].SupportedNodeType"));

										List<AvailableResource> availableResources = new ArrayList<AvailableResource>();
										for (int q = 0; q < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEditionTypes["+ k +"].SupportedSeriesTypes["+ l +"].SupportedEngineVersions["+ m +"].SupportedArchitectureTypes["+ n +"].SupportedShardNumbers["+ o +"].SupportedNodeTypes["+ p +"].AvailableResources.Length"); q++) {
											AvailableResource availableResource = new AvailableResource();
											availableResource.setInstanceClass(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEditionTypes["+ k +"].SupportedSeriesTypes["+ l +"].SupportedEngineVersions["+ m +"].SupportedArchitectureTypes["+ n +"].SupportedShardNumbers["+ o +"].SupportedNodeTypes["+ p +"].AvailableResources["+ q +"].InstanceClass"));
											availableResource.setInstanceClassRemark(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEditionTypes["+ k +"].SupportedSeriesTypes["+ l +"].SupportedEngineVersions["+ m +"].SupportedArchitectureTypes["+ n +"].SupportedShardNumbers["+ o +"].SupportedNodeTypes["+ p +"].AvailableResources["+ q +"].InstanceClassRemark"));

											availableResources.add(availableResource);
										}
										supportedNodeType.setAvailableResources(availableResources);

										supportedNodeTypes.add(supportedNodeType);
									}
									supportedShardNumber.setSupportedNodeTypes(supportedNodeTypes);

									supportedShardNumbers.add(supportedShardNumber);
								}
								supportedArchitectureType.setSupportedShardNumbers(supportedShardNumbers);

								supportedArchitectureTypes.add(supportedArchitectureType);
							}
							supportedEngineVersion.setSupportedArchitectureTypes(supportedArchitectureTypes);

							supportedEngineVersions.add(supportedEngineVersion);
						}
						supportedSeriesType.setSupportedEngineVersions(supportedEngineVersions);

						supportedSeriesTypes.add(supportedSeriesType);
					}
					supportedEditionType.setSupportedSeriesTypes(supportedSeriesTypes);

					supportedEditionTypes.add(supportedEditionType);
				}
				supportedEngine.setSupportedEditionTypes(supportedEditionTypes);

				supportedEngines.add(supportedEngine);
			}
			availableZone.setSupportedEngines(supportedEngines);

			availableZones.add(availableZone);
		}
		describeAvailableResourceResponse.setAvailableZones(availableZones);
	 
	 	return describeAvailableResourceResponse;
	}
}