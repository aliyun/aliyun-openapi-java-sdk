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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListEmrAvailableResourceResponse;
import com.aliyuncs.emr.model.v20160408.ListEmrAvailableResourceResponse.EmrZoneInfo;
import com.aliyuncs.emr.model.v20160408.ListEmrAvailableResourceResponse.EmrZoneInfo.EmrResourceInfo;
import com.aliyuncs.emr.model.v20160408.ListEmrAvailableResourceResponse.EmrZoneInfo.EmrResourceInfo.SupportedResource;
import com.aliyuncs.emr.model.v20160408.ListEmrAvailableResourceResponse.EmrZoneInfo.EmrResourceInfo.SupportedResource.EmrInstanceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEmrAvailableResourceResponseUnmarshaller {

	public static ListEmrAvailableResourceResponse unmarshall(ListEmrAvailableResourceResponse listEmrAvailableResourceResponse, UnmarshallerContext context) {
		
		listEmrAvailableResourceResponse.setRequestId(context.stringValue("ListEmrAvailableResourceResponse.RequestId"));
		listEmrAvailableResourceResponse.setRegionId(context.stringValue("ListEmrAvailableResourceResponse.RegionId"));

		List<EmrZoneInfo> emrZoneInfoList = new ArrayList<EmrZoneInfo>();
		for (int i = 0; i < context.lengthValue("ListEmrAvailableResourceResponse.EmrZoneInfoList.Length"); i++) {
			EmrZoneInfo emrZoneInfo = new EmrZoneInfo();
			emrZoneInfo.setZoneId(context.stringValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].ZoneId"));

			List<EmrResourceInfo> emrResourceInfoList = new ArrayList<EmrResourceInfo>();
			for (int j = 0; j < context.lengthValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList.Length"); j++) {
				EmrResourceInfo emrResourceInfo = new EmrResourceInfo();
				emrResourceInfo.setType(context.stringValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].Type"));

				List<SupportedResource> supportedResourceList = new ArrayList<SupportedResource>();
				for (int k = 0; k < context.lengthValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList.Length"); k++) {
					SupportedResource supportedResource = new SupportedResource();
					supportedResource.setValue(context.stringValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].Value"));
					supportedResource.setMin(context.integerValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].Min"));
					supportedResource.setMax(context.integerValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].Max"));
					supportedResource.setUnit(context.stringValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].Unit"));
					supportedResource.setValue1(context.stringValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].Value"));

					List<String> supportNodeTypeList = new ArrayList<String>();
					for (int l = 0; l < context.lengthValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].SupportNodeTypeList.Length"); l++) {
						supportNodeTypeList.add(context.stringValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].SupportNodeTypeList["+ l +"]"));
					}
					supportedResource.setSupportNodeTypeList(supportNodeTypeList);

					EmrInstanceType emrInstanceType = new EmrInstanceType();
					emrInstanceType.setInstanceType(context.stringValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].EmrInstanceType.InstanceType"));
					emrInstanceType.setCpuCoreCount(context.integerValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].EmrInstanceType.CpuCoreCount"));
					emrInstanceType.setMemorySize(context.integerValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].EmrInstanceType.MemorySize"));
					emrInstanceType.setInstanceTypeFamily(context.stringValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].EmrInstanceType.InstanceTypeFamily"));
					emrInstanceType.setLocalStorageCapacity(context.longValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].EmrInstanceType.LocalStorageCapacity"));
					emrInstanceType.setLocalStorageAmount(context.integerValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].EmrInstanceType.LocalStorageAmount"));
					emrInstanceType.setLocalStorageCategory(context.stringValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].EmrInstanceType.LocalStorageCategory"));
					emrInstanceType.setGPUAmount(context.integerValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].EmrInstanceType.GPUAmount"));
					emrInstanceType.setGPUSpec(context.stringValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].EmrInstanceType.GPUSpec"));
					emrInstanceType.setInitialCredit(context.integerValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].EmrInstanceType.InitialCredit"));
					emrInstanceType.setBaselineCredit(context.integerValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].EmrInstanceType.BaselineCredit"));
					emrInstanceType.setEniQuantity(context.integerValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].EmrInstanceType.EniQuantity"));
					emrInstanceType.setInstanceBandwidthRx(context.integerValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].EmrInstanceType.InstanceBandwidthRx"));
					emrInstanceType.setInstanceBandwidthTx(context.integerValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].EmrInstanceType.InstanceBandwidthTx"));
					emrInstanceType.setInstancePpsRx(context.longValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].EmrInstanceType.InstancePpsRx"));
					emrInstanceType.setInstancePpsTx(context.longValue("ListEmrAvailableResourceResponse.EmrZoneInfoList["+ i +"].EmrResourceInfoList["+ j +"].SupportedResourceList["+ k +"].EmrInstanceType.InstancePpsTx"));
					supportedResource.setEmrInstanceType(emrInstanceType);

					supportedResourceList.add(supportedResource);
				}
				emrResourceInfo.setSupportedResourceList(supportedResourceList);

				emrResourceInfoList.add(emrResourceInfo);
			}
			emrZoneInfo.setEmrResourceInfoList(emrResourceInfoList);

			emrZoneInfoList.add(emrZoneInfo);
		}
		listEmrAvailableResourceResponse.setEmrZoneInfoList(emrZoneInfoList);
	 
	 	return listEmrAvailableResourceResponse;
	}
}