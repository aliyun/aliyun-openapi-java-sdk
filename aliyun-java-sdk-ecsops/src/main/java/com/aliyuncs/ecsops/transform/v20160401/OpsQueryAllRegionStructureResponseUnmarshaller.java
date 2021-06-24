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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryAllRegionStructureResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryAllRegionStructureResponse.Region;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryAllRegionStructureResponse.Region.AvailableZone;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryAllRegionStructureResponse.Region.AvailableZone.Cluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryAllRegionStructureResponseUnmarshaller {

	public static OpsQueryAllRegionStructureResponse unmarshall(OpsQueryAllRegionStructureResponse opsQueryAllRegionStructureResponse, UnmarshallerContext _ctx) {
		
		opsQueryAllRegionStructureResponse.setRequestId(_ctx.stringValue("OpsQueryAllRegionStructureResponse.RequestId"));

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryAllRegionStructureResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setDescription(_ctx.stringValue("OpsQueryAllRegionStructureResponse.Regions["+ i +"].Description"));
			region.setRegion(_ctx.stringValue("OpsQueryAllRegionStructureResponse.Regions["+ i +"].Region"));
			region.setEnglishName(_ctx.stringValue("OpsQueryAllRegionStructureResponse.Regions["+ i +"].EnglishName"));
			region.setChineseName(_ctx.stringValue("OpsQueryAllRegionStructureResponse.Regions["+ i +"].ChineseName"));
			region.setAlias(_ctx.stringValue("OpsQueryAllRegionStructureResponse.Regions["+ i +"].Alias"));

			List<AvailableZone> availableZones = new ArrayList<AvailableZone>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryAllRegionStructureResponse.Regions["+ i +"].AvailableZones.Length"); j++) {
				AvailableZone availableZone = new AvailableZone();
				availableZone.setAvailableZone(_ctx.stringValue("OpsQueryAllRegionStructureResponse.Regions["+ i +"].AvailableZones["+ j +"].AvailableZone"));

				List<Cluster> clusters = new ArrayList<Cluster>();
				for (int k = 0; k < _ctx.lengthValue("OpsQueryAllRegionStructureResponse.Regions["+ i +"].AvailableZones["+ j +"].Clusters.Length"); k++) {
					Cluster cluster = new Cluster();
					cluster.setCluster(_ctx.stringValue("OpsQueryAllRegionStructureResponse.Regions["+ i +"].AvailableZones["+ j +"].Clusters["+ k +"].Cluster"));

					List<String> zones = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("OpsQueryAllRegionStructureResponse.Regions["+ i +"].AvailableZones["+ j +"].Clusters["+ k +"].Zones.Length"); l++) {
						zones.add(_ctx.stringValue("OpsQueryAllRegionStructureResponse.Regions["+ i +"].AvailableZones["+ j +"].Clusters["+ k +"].Zones["+ l +"]"));
					}
					cluster.setZones(zones);

					clusters.add(cluster);
				}
				availableZone.setClusters(clusters);

				availableZones.add(availableZone);
			}
			region.setAvailableZones(availableZones);

			regions.add(region);
		}
		opsQueryAllRegionStructureResponse.setRegions(regions);
	 
	 	return opsQueryAllRegionStructureResponse;
	}
}