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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeAvailableResourceResponse;
import com.aliyuncs.dds.model.v20151201.DescribeAvailableResourceResponse.AvailableZone;
import com.aliyuncs.dds.model.v20151201.DescribeAvailableResourceResponse.AvailableZone.SupportedEngineVersion;
import com.aliyuncs.dds.model.v20151201.DescribeAvailableResourceResponse.AvailableZone.SupportedEngineVersion.SupportedEngine;
import com.aliyuncs.dds.model.v20151201.DescribeAvailableResourceResponse.AvailableZone.SupportedEngineVersion.SupportedEngine.SupportedNodeType;
import com.aliyuncs.dds.model.v20151201.DescribeAvailableResourceResponse.AvailableZone.SupportedEngineVersion.SupportedEngine.SupportedNodeType.AvailableResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableResourceResponseUnmarshaller {

	public static DescribeAvailableResourceResponse unmarshall(DescribeAvailableResourceResponse describeAvailableResourceResponse, UnmarshallerContext _ctx) {
		
		describeAvailableResourceResponse.setRequestId(_ctx.stringValue("DescribeAvailableResourceResponse.RequestId"));

		List<AvailableZone> availableZones = new ArrayList<AvailableZone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones.Length"); i++) {
			AvailableZone availableZone = new AvailableZone();
			availableZone.setRegionId(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].RegionId"));
			availableZone.setZoneId(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].ZoneId"));

			List<SupportedEngineVersion> supportedEngineVersions = new ArrayList<SupportedEngineVersion>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngineVersions.Length"); j++) {
				SupportedEngineVersion supportedEngineVersion = new SupportedEngineVersion();
				supportedEngineVersion.setVersion(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngineVersions["+ j +"].Version"));

				List<SupportedEngine> supportedEngines = new ArrayList<SupportedEngine>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngineVersions["+ j +"].SupportedEngines.Length"); k++) {
					SupportedEngine supportedEngine = new SupportedEngine();
					supportedEngine.setEngine(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngineVersions["+ j +"].SupportedEngines["+ k +"].Engine"));

					List<SupportedNodeType> supportedNodeTypes = new ArrayList<SupportedNodeType>();
					for (int l = 0; l < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngineVersions["+ j +"].SupportedEngines["+ k +"].SupportedNodeTypes.Length"); l++) {
						SupportedNodeType supportedNodeType = new SupportedNodeType();
						supportedNodeType.setNodeType(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngineVersions["+ j +"].SupportedEngines["+ k +"].SupportedNodeTypes["+ l +"].NodeType"));
						supportedNodeType.setNetworkTypes(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngineVersions["+ j +"].SupportedEngines["+ k +"].SupportedNodeTypes["+ l +"].NetworkTypes"));

						List<AvailableResource> availableResources = new ArrayList<AvailableResource>();
						for (int m = 0; m < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngineVersions["+ j +"].SupportedEngines["+ k +"].SupportedNodeTypes["+ l +"].AvailableResources.Length"); m++) {
							AvailableResource availableResource = new AvailableResource();
							availableResource.setInstanceClass(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngineVersions["+ j +"].SupportedEngines["+ k +"].SupportedNodeTypes["+ l +"].AvailableResources["+ m +"].InstanceClass"));

							availableResources.add(availableResource);
						}
						supportedNodeType.setAvailableResources(availableResources);

						supportedNodeTypes.add(supportedNodeType);
					}
					supportedEngine.setSupportedNodeTypes(supportedNodeTypes);

					supportedEngines.add(supportedEngine);
				}
				supportedEngineVersion.setSupportedEngines(supportedEngines);

				supportedEngineVersions.add(supportedEngineVersion);
			}
			availableZone.setSupportedEngineVersions(supportedEngineVersions);

			availableZones.add(availableZone);
		}
		describeAvailableResourceResponse.setAvailableZones(availableZones);
	 
	 	return describeAvailableResourceResponse;
	}
}