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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeAvailableResourceResponse;
import com.aliyuncs.adb.model.v20190315.DescribeAvailableResourceResponse.AvailableZone;
import com.aliyuncs.adb.model.v20190315.DescribeAvailableResourceResponse.AvailableZone.SupportedModeItem;
import com.aliyuncs.adb.model.v20190315.DescribeAvailableResourceResponse.AvailableZone.SupportedModeItem.SupportedSerialListItem;
import com.aliyuncs.adb.model.v20190315.DescribeAvailableResourceResponse.AvailableZone.SupportedModeItem.SupportedSerialListItem.SupportedFlexibleResourceItem;
import com.aliyuncs.adb.model.v20190315.DescribeAvailableResourceResponse.AvailableZone.SupportedModeItem.SupportedSerialListItem.SupportedFlexibleResourceItem.SupportedElasticIOResource;
import com.aliyuncs.adb.model.v20190315.DescribeAvailableResourceResponse.AvailableZone.SupportedModeItem.SupportedSerialListItem.SupportedInstanceClass;
import com.aliyuncs.adb.model.v20190315.DescribeAvailableResourceResponse.AvailableZone.SupportedModeItem.SupportedSerialListItem.SupportedInstanceClass.SupportedExecutor;
import com.aliyuncs.adb.model.v20190315.DescribeAvailableResourceResponse.AvailableZone.SupportedModeItem.SupportedSerialListItem.SupportedInstanceClass.SupportedExecutor.NodeCount3;
import com.aliyuncs.adb.model.v20190315.DescribeAvailableResourceResponse.AvailableZone.SupportedModeItem.SupportedSerialListItem.SupportedInstanceClass.SupportedNodeCount;
import com.aliyuncs.adb.model.v20190315.DescribeAvailableResourceResponse.AvailableZone.SupportedModeItem.SupportedSerialListItem.SupportedInstanceClass.SupportedNodeCount.NodeCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableResourceResponseUnmarshaller {

	public static DescribeAvailableResourceResponse unmarshall(DescribeAvailableResourceResponse describeAvailableResourceResponse, UnmarshallerContext _ctx) {
		
		describeAvailableResourceResponse.setRequestId(_ctx.stringValue("DescribeAvailableResourceResponse.RequestId"));
		describeAvailableResourceResponse.setRegionId(_ctx.stringValue("DescribeAvailableResourceResponse.RegionId"));

		List<AvailableZone> availableZoneList = new ArrayList<AvailableZone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList.Length"); i++) {
			AvailableZone availableZone = new AvailableZone();
			availableZone.setZoneId(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].ZoneId"));
			availableZone.setZoneName(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].ZoneName"));

			List<String> supportedComputeResource = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedComputeResource.Length"); j++) {
				supportedComputeResource.add(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedComputeResource["+ j +"]"));
			}
			availableZone.setSupportedComputeResource(supportedComputeResource);

			List<String> supportedStorageResource = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedStorageResource.Length"); j++) {
				supportedStorageResource.add(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedStorageResource["+ j +"]"));
			}
			availableZone.setSupportedStorageResource(supportedStorageResource);

			List<SupportedModeItem> supportedMode = new ArrayList<SupportedModeItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode.Length"); j++) {
				SupportedModeItem supportedModeItem = new SupportedModeItem();
				supportedModeItem.setMode(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].Mode"));

				List<SupportedSerialListItem> supportedSerialList = new ArrayList<SupportedSerialListItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList.Length"); k++) {
					SupportedSerialListItem supportedSerialListItem = new SupportedSerialListItem();
					supportedSerialListItem.setSerial(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].Serial"));

					List<SupportedFlexibleResourceItem> supportedFlexibleResource = new ArrayList<SupportedFlexibleResourceItem>();
					for (int l = 0; l < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedFlexibleResource.Length"); l++) {
						SupportedFlexibleResourceItem supportedFlexibleResourceItem = new SupportedFlexibleResourceItem();
						supportedFlexibleResourceItem.setStorageType(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedFlexibleResource["+ l +"].StorageType"));

						List<String> supportedComputeResource1 = new ArrayList<String>();
						for (int m = 0; m < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedFlexibleResource["+ l +"].SupportedComputeResource.Length"); m++) {
							supportedComputeResource1.add(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedFlexibleResource["+ l +"].SupportedComputeResource["+ m +"]"));
						}
						supportedFlexibleResourceItem.setSupportedComputeResource1(supportedComputeResource1);

						List<String> supportedStorageResource2 = new ArrayList<String>();
						for (int m = 0; m < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedFlexibleResource["+ l +"].SupportedStorageResource.Length"); m++) {
							supportedStorageResource2.add(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedFlexibleResource["+ l +"].SupportedStorageResource["+ m +"]"));
						}
						supportedFlexibleResourceItem.setSupportedStorageResource2(supportedStorageResource2);

						SupportedElasticIOResource supportedElasticIOResource = new SupportedElasticIOResource();
						supportedElasticIOResource.setStep(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedFlexibleResource["+ l +"].SupportedElasticIOResource.Step"));
						supportedElasticIOResource.setMinCount(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedFlexibleResource["+ l +"].SupportedElasticIOResource.MinCount"));
						supportedElasticIOResource.setMaxCount(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedFlexibleResource["+ l +"].SupportedElasticIOResource.MaxCount"));
						supportedFlexibleResourceItem.setSupportedElasticIOResource(supportedElasticIOResource);

						supportedFlexibleResource.add(supportedFlexibleResourceItem);
					}
					supportedSerialListItem.setSupportedFlexibleResource(supportedFlexibleResource);

					List<SupportedInstanceClass> supportedInstanceClassList = new ArrayList<SupportedInstanceClass>();
					for (int l = 0; l < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedInstanceClassList.Length"); l++) {
						SupportedInstanceClass supportedInstanceClass = new SupportedInstanceClass();
						supportedInstanceClass.setInstanceClass(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedInstanceClassList["+ l +"].InstanceClass"));
						supportedInstanceClass.setTips(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedInstanceClassList["+ l +"].Tips"));

						List<SupportedNodeCount> supportedNodeCountList = new ArrayList<SupportedNodeCount>();
						for (int m = 0; m < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedInstanceClassList["+ l +"].SupportedNodeCountList.Length"); m++) {
							SupportedNodeCount supportedNodeCount = new SupportedNodeCount();

							List<String> storageSize = new ArrayList<String>();
							for (int n = 0; n < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedInstanceClassList["+ l +"].SupportedNodeCountList["+ m +"].StorageSize.Length"); n++) {
								storageSize.add(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedInstanceClassList["+ l +"].SupportedNodeCountList["+ m +"].StorageSize["+ n +"]"));
							}
							supportedNodeCount.setStorageSize(storageSize);

							NodeCount nodeCount = new NodeCount();
							nodeCount.setStep(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedInstanceClassList["+ l +"].SupportedNodeCountList["+ m +"].NodeCount.Step"));
							nodeCount.setMinCount(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedInstanceClassList["+ l +"].SupportedNodeCountList["+ m +"].NodeCount.MinCount"));
							nodeCount.setMaxCount(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedInstanceClassList["+ l +"].SupportedNodeCountList["+ m +"].NodeCount.MaxCount"));
							supportedNodeCount.setNodeCount(nodeCount);

							supportedNodeCountList.add(supportedNodeCount);
						}
						supportedInstanceClass.setSupportedNodeCountList(supportedNodeCountList);

						List<SupportedExecutor> supportedExecutorList = new ArrayList<SupportedExecutor>();
						for (int m = 0; m < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedInstanceClassList["+ l +"].SupportedExecutorList.Length"); m++) {
							SupportedExecutor supportedExecutor = new SupportedExecutor();

							NodeCount3 nodeCount3 = new NodeCount3();
							nodeCount3.setStep(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedInstanceClassList["+ l +"].SupportedExecutorList["+ m +"].NodeCount.Step"));
							nodeCount3.setMinCount(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedInstanceClassList["+ l +"].SupportedExecutorList["+ m +"].NodeCount.MinCount"));
							nodeCount3.setMaxCount(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedMode["+ j +"].SupportedSerialList["+ k +"].SupportedInstanceClassList["+ l +"].SupportedExecutorList["+ m +"].NodeCount.MaxCount"));
							supportedExecutor.setNodeCount3(nodeCount3);

							supportedExecutorList.add(supportedExecutor);
						}
						supportedInstanceClass.setSupportedExecutorList(supportedExecutorList);

						supportedInstanceClassList.add(supportedInstanceClass);
					}
					supportedSerialListItem.setSupportedInstanceClassList(supportedInstanceClassList);

					supportedSerialList.add(supportedSerialListItem);
				}
				supportedModeItem.setSupportedSerialList(supportedSerialList);

				supportedMode.add(supportedModeItem);
			}
			availableZone.setSupportedMode(supportedMode);

			availableZoneList.add(availableZone);
		}
		describeAvailableResourceResponse.setAvailableZoneList(availableZoneList);
	 
	 	return describeAvailableResourceResponse;
	}
}