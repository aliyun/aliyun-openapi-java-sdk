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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeAvailableZoneResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeAvailableZoneResponse.Data;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeAvailableZoneResponse.Data.AvailableZonesItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeAvailableZoneResponse.Data.AvailableZonesItem.SupportSpecificationsItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeAvailableZoneResponse.Data.AvailableZonesItem.SupportSpecificationsItem.DiskSizeRange;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeAvailableZoneResponse.Data.AvailableZonesItem.SupportSpecificationsItem.SupportEngineVersionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableZoneResponseUnmarshaller {

	public static DescribeAvailableZoneResponse unmarshall(DescribeAvailableZoneResponse describeAvailableZoneResponse, UnmarshallerContext _ctx) {
		
		describeAvailableZoneResponse.setRequestId(_ctx.stringValue("DescribeAvailableZoneResponse.RequestId"));

		Data data = new Data();

		List<AvailableZonesItem> availableZones = new ArrayList<AvailableZonesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableZoneResponse.Data.AvailableZones.Length"); i++) {
			AvailableZonesItem availableZonesItem = new AvailableZonesItem();
			availableZonesItem.setRegion(_ctx.stringValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].Region"));
			availableZonesItem.setZones(_ctx.stringValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].Zones"));
			availableZonesItem.setChannel(_ctx.stringValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].Channel"));
			availableZonesItem.setDeployType(_ctx.stringValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].DeployType"));
			availableZonesItem.setInstanceType(_ctx.stringValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].InstanceType"));
			availableZonesItem.setSeries(_ctx.stringValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].Series"));
			availableZonesItem.setCpuArch(_ctx.stringValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].CpuArch"));

			List<SupportSpecificationsItem> supportSpecifications = new ArrayList<SupportSpecificationsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].SupportSpecifications.Length"); j++) {
				SupportSpecificationsItem supportSpecificationsItem = new SupportSpecificationsItem();
				supportSpecificationsItem.setSpec(_ctx.stringValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].SupportSpecifications["+ j +"].Spec"));
				supportSpecificationsItem.setInstanceClass(_ctx.stringValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].SupportSpecifications["+ j +"].InstanceClass"));

				List<String> diskTypes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].SupportSpecifications["+ j +"].DiskTypes.Length"); k++) {
					diskTypes.add(_ctx.stringValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].SupportSpecifications["+ j +"].DiskTypes["+ k +"]"));
				}
				supportSpecificationsItem.setDiskTypes(diskTypes);

				DiskSizeRange diskSizeRange = new DiskSizeRange();
				diskSizeRange.setStep(_ctx.longValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].SupportSpecifications["+ j +"].DiskSizeRange.Step"));
				diskSizeRange.setMax(_ctx.longValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].SupportSpecifications["+ j +"].DiskSizeRange.Max"));
				diskSizeRange.setMin(_ctx.longValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].SupportSpecifications["+ j +"].DiskSizeRange.Min"));
				supportSpecificationsItem.setDiskSizeRange(diskSizeRange);

				List<SupportEngineVersionsItem> supportEngineVersions = new ArrayList<SupportEngineVersionsItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].SupportSpecifications["+ j +"].SupportEngineVersions.Length"); k++) {
					SupportEngineVersionsItem supportEngineVersionsItem = new SupportEngineVersionsItem();
					supportEngineVersionsItem.setObVersion(_ctx.stringValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].SupportSpecifications["+ j +"].SupportEngineVersions["+ k +"].ObVersion"));
					supportEngineVersionsItem.setSupportIsolationOptimization(_ctx.booleanValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].SupportSpecifications["+ j +"].SupportEngineVersions["+ k +"].SupportIsolationOptimization"));

					List<String> supportReplicaModes = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].SupportSpecifications["+ j +"].SupportEngineVersions["+ k +"].SupportReplicaModes.Length"); l++) {
						supportReplicaModes.add(_ctx.stringValue("DescribeAvailableZoneResponse.Data.AvailableZones["+ i +"].SupportSpecifications["+ j +"].SupportEngineVersions["+ k +"].SupportReplicaModes["+ l +"]"));
					}
					supportEngineVersionsItem.setSupportReplicaModes(supportReplicaModes);

					supportEngineVersions.add(supportEngineVersionsItem);
				}
				supportSpecificationsItem.setSupportEngineVersions(supportEngineVersions);

				supportSpecifications.add(supportSpecificationsItem);
			}
			availableZonesItem.setSupportSpecifications(supportSpecifications);

			availableZones.add(availableZonesItem);
		}
		data.setAvailableZones(availableZones);
		describeAvailableZoneResponse.setData(data);
	 
	 	return describeAvailableZoneResponse;
	}
}