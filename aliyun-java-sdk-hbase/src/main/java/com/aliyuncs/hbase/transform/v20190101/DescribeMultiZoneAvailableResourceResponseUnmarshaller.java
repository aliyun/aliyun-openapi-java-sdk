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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.DescribeMultiZoneAvailableResourceResponse;
import com.aliyuncs.hbase.model.v20190101.DescribeMultiZoneAvailableResourceResponse.AvailableZone;
import com.aliyuncs.hbase.model.v20190101.DescribeMultiZoneAvailableResourceResponse.AvailableZone.MasterResource;
import com.aliyuncs.hbase.model.v20190101.DescribeMultiZoneAvailableResourceResponse.AvailableZone.MasterResource.InstanceTypeDetail;
import com.aliyuncs.hbase.model.v20190101.DescribeMultiZoneAvailableResourceResponse.AvailableZone.SupportedEngine;
import com.aliyuncs.hbase.model.v20190101.DescribeMultiZoneAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion;
import com.aliyuncs.hbase.model.v20190101.DescribeMultiZoneAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion.SupportedCategoriesItem;
import com.aliyuncs.hbase.model.v20190101.DescribeMultiZoneAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion.SupportedCategoriesItem.SupportedStorageType;
import com.aliyuncs.hbase.model.v20190101.DescribeMultiZoneAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion.SupportedCategoriesItem.SupportedStorageType.CoreResource;
import com.aliyuncs.hbase.model.v20190101.DescribeMultiZoneAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion.SupportedCategoriesItem.SupportedStorageType.CoreResource.DBInstanceStorageRange;
import com.aliyuncs.hbase.model.v20190101.DescribeMultiZoneAvailableResourceResponse.AvailableZone.SupportedEngine.SupportedEngineVersion.SupportedCategoriesItem.SupportedStorageType.CoreResource.InstanceTypeDetail1;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMultiZoneAvailableResourceResponseUnmarshaller {

	public static DescribeMultiZoneAvailableResourceResponse unmarshall(DescribeMultiZoneAvailableResourceResponse describeMultiZoneAvailableResourceResponse, UnmarshallerContext _ctx) {
		
		describeMultiZoneAvailableResourceResponse.setRequestId(_ctx.stringValue("DescribeMultiZoneAvailableResourceResponse.RequestId"));

		List<AvailableZone> availableZones = new ArrayList<AvailableZone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones.Length"); i++) {
			AvailableZone availableZone = new AvailableZone();
			availableZone.setRegionId(_ctx.stringValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].RegionId"));
			availableZone.setZoneCombination(_ctx.stringValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].ZoneCombination"));

			List<MasterResource> masterResources = new ArrayList<MasterResource>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].MasterResources.Length"); j++) {
				MasterResource masterResource = new MasterResource();
				masterResource.setInstanceType(_ctx.stringValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].MasterResources["+ j +"].InstanceType"));

				InstanceTypeDetail instanceTypeDetail = new InstanceTypeDetail();
				instanceTypeDetail.setCpu(_ctx.integerValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].MasterResources["+ j +"].InstanceTypeDetail.Cpu"));
				instanceTypeDetail.setMem(_ctx.integerValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].MasterResources["+ j +"].InstanceTypeDetail.Mem"));
				masterResource.setInstanceTypeDetail(instanceTypeDetail);

				masterResources.add(masterResource);
			}
			availableZone.setMasterResources(masterResources);

			List<SupportedEngine> supportedEngines = new ArrayList<SupportedEngine>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines.Length"); j++) {
				SupportedEngine supportedEngine = new SupportedEngine();
				supportedEngine.setEngine(_ctx.stringValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].Engine"));

				List<SupportedEngineVersion> supportedEngineVersions = new ArrayList<SupportedEngineVersion>();
				for (int k = 0; k < _ctx.lengthValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions.Length"); k++) {
					SupportedEngineVersion supportedEngineVersion = new SupportedEngineVersion();
					supportedEngineVersion.setVersion(_ctx.stringValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].Version"));

					List<SupportedCategoriesItem> supportedCategories = new ArrayList<SupportedCategoriesItem>();
					for (int l = 0; l < _ctx.lengthValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategories.Length"); l++) {
						SupportedCategoriesItem supportedCategoriesItem = new SupportedCategoriesItem();
						supportedCategoriesItem.setCategory(_ctx.stringValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategories["+ l +"].Category"));

						List<SupportedStorageType> supportedStorageTypes = new ArrayList<SupportedStorageType>();
						for (int m = 0; m < _ctx.lengthValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategories["+ l +"].SupportedStorageTypes.Length"); m++) {
							SupportedStorageType supportedStorageType = new SupportedStorageType();
							supportedStorageType.setStorageType(_ctx.stringValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategories["+ l +"].SupportedStorageTypes["+ m +"].StorageType"));

							List<CoreResource> coreResources = new ArrayList<CoreResource>();
							for (int n = 0; n < _ctx.lengthValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategories["+ l +"].SupportedStorageTypes["+ m +"].CoreResources.Length"); n++) {
								CoreResource coreResource = new CoreResource();
								coreResource.setInstanceType(_ctx.stringValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategories["+ l +"].SupportedStorageTypes["+ m +"].CoreResources["+ n +"].InstanceType"));
								coreResource.setMaxCoreCount(_ctx.integerValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategories["+ l +"].SupportedStorageTypes["+ m +"].CoreResources["+ n +"].MaxCoreCount"));

								DBInstanceStorageRange dBInstanceStorageRange = new DBInstanceStorageRange();
								dBInstanceStorageRange.setMaxSize(_ctx.integerValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategories["+ l +"].SupportedStorageTypes["+ m +"].CoreResources["+ n +"].DBInstanceStorageRange.MaxSize"));
								dBInstanceStorageRange.setMinSize(_ctx.integerValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategories["+ l +"].SupportedStorageTypes["+ m +"].CoreResources["+ n +"].DBInstanceStorageRange.MinSize"));
								dBInstanceStorageRange.setStepSize(_ctx.integerValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategories["+ l +"].SupportedStorageTypes["+ m +"].CoreResources["+ n +"].DBInstanceStorageRange.StepSize"));
								coreResource.setDBInstanceStorageRange(dBInstanceStorageRange);

								InstanceTypeDetail1 instanceTypeDetail1 = new InstanceTypeDetail1();
								instanceTypeDetail1.setCpu(_ctx.integerValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategories["+ l +"].SupportedStorageTypes["+ m +"].CoreResources["+ n +"].InstanceTypeDetail.Cpu"));
								instanceTypeDetail1.setMem(_ctx.integerValue("DescribeMultiZoneAvailableResourceResponse.AvailableZones["+ i +"].SupportedEngines["+ j +"].SupportedEngineVersions["+ k +"].SupportedCategories["+ l +"].SupportedStorageTypes["+ m +"].CoreResources["+ n +"].InstanceTypeDetail.Mem"));
								coreResource.setInstanceTypeDetail1(instanceTypeDetail1);

								coreResources.add(coreResource);
							}
							supportedStorageType.setCoreResources(coreResources);

							supportedStorageTypes.add(supportedStorageType);
						}
						supportedCategoriesItem.setSupportedStorageTypes(supportedStorageTypes);

						supportedCategories.add(supportedCategoriesItem);
					}
					supportedEngineVersion.setSupportedCategories(supportedCategories);

					supportedEngineVersions.add(supportedEngineVersion);
				}
				supportedEngine.setSupportedEngineVersions(supportedEngineVersions);

				supportedEngines.add(supportedEngine);
			}
			availableZone.setSupportedEngines(supportedEngines);

			availableZones.add(availableZone);
		}
		describeMultiZoneAvailableResourceResponse.setAvailableZones(availableZones);
	 
	 	return describeMultiZoneAvailableResourceResponse;
	}
}