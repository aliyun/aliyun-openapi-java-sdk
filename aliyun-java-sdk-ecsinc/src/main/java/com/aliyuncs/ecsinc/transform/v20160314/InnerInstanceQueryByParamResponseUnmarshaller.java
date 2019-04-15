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

import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryByParamResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryByParamResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryByParamResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryByParamResponse.Item.Iz;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryByParamResponse.Item.Iz.IzResourceModelItem;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryByParamResponse.Item.Region;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryByParamResponse.Item.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerInstanceQueryByParamResponseUnmarshaller {

	public static InnerInstanceQueryByParamResponse unmarshall(InnerInstanceQueryByParamResponse innerInstanceQueryByParamResponse, UnmarshallerContext context) {
		
		innerInstanceQueryByParamResponse.setRequestId(context.stringValue("InnerInstanceQueryByParamResponse.RequestId"));
		innerInstanceQueryByParamResponse.setCount(context.integerValue("InnerInstanceQueryByParamResponse.count"));
		innerInstanceQueryByParamResponse.setPageNo(context.integerValue("InnerInstanceQueryByParamResponse.pageNo"));
		innerInstanceQueryByParamResponse.setPageSize(context.integerValue("InnerInstanceQueryByParamResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerInstanceQueryByParamResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerInstanceQueryByParamResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerInstanceQueryByParamResponse.errorCode.isSuccess"));
		innerInstanceQueryByParamResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerInstanceQueryByParamResponse.data.Length"); i++) {
			Item item = new Item();
			item.setImageType(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].imageType"));
			item.setRecoverPolicy(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].recoverPolicy"));
			item.setBusinessStatus(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].businessStatus"));
			item.setIntranetIp(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].intranetIp"));
			item.setDiskSize(context.integerValue("InnerInstanceQueryByParamResponse.data["+ i +"].diskSize"));
			item.setOsName(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].osName"));
			item.setIzId(context.longValue("InnerInstanceQueryByParamResponse.data["+ i +"].izId"));
			item.setIoOptimized(context.booleanValue("InnerInstanceQueryByParamResponse.data["+ i +"].ioOptimized"));
			item.setStatus(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].status"));
			item.setImageName(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].imageName"));
			item.setInternetRx(context.integerValue("InnerInstanceQueryByParamResponse.data["+ i +"].internetRx"));
			item.setInternetTx(context.integerValue("InnerInstanceQueryByParamResponse.data["+ i +"].internetTx"));
			item.setZoneId(context.longValue("InnerInstanceQueryByParamResponse.data["+ i +"].zoneId"));
			item.setMemory(context.integerValue("InnerInstanceQueryByParamResponse.data["+ i +"].memory"));
			item.setHostname(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].hostname"));
			item.setAgentId(context.integerValue("InnerInstanceQueryByParamResponse.data["+ i +"].agentId"));
			item.setInstanceId(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].instanceId"));
			item.setOsType(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].osType"));
			item.setEcsBusinessStatus(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].ecsBusinessStatus"));
			item.setGroupNo(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].groupNo"));
			item.setId(context.longValue("InnerInstanceQueryByParamResponse.data["+ i +"].id"));
			item.setImageId(context.longValue("InnerInstanceQueryByParamResponse.data["+ i +"].imageId"));
			item.setGmtCreated(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].gmtCreated"));
			item.setInternetIp(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].internetIp"));
			item.setBid(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].bid"));
			item.setImageNo(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].imageNo"));
			item.setGmtModified(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].gmtModified"));
			item.setIsWin(context.booleanValue("InnerInstanceQueryByParamResponse.data["+ i +"].isWin"));
			item.setRecoverable(context.booleanValue("InnerInstanceQueryByParamResponse.data["+ i +"].recoverable"));
			item.setImagePc(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].imagePc"));
			item.setIntranetRx(context.integerValue("InnerInstanceQueryByParamResponse.data["+ i +"].intranetRx"));
			item.setAliUid(context.longValue("InnerInstanceQueryByParamResponse.data["+ i +"].aliUid"));
			item.setGmtStarted(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].gmtStarted"));
			item.setIntranetTx(context.integerValue("InnerInstanceQueryByParamResponse.data["+ i +"].intranetTx"));
			item.setCores(context.integerValue("InnerInstanceQueryByParamResponse.data["+ i +"].cores"));
			item.setGmtSync(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].gmtSync"));
			item.setSystemDiskCategory(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].systemDiskCategory"));
			item.setGmtRelease(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].gmtRelease"));

			Zone zone = new Zone();
			zone.setZoneNo(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.zoneNo"));
			zone.setId(context.longValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.id"));
			zone.setIsActive(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.isActive"));
			zone.setZoneNoAlias(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.zoneNoAlias"));
			zone.setRegionId(context.longValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.regionId"));
			zone.setRouteIpSegment(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.routeIpSegment"));
			zone.setZoneMemo(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.zoneMemo"));
			zone.setZoneName(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.zoneName"));
			zone.setIsWritable(context.booleanValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.isWritable"));
			zone.setAvailableZoneID(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.availableZoneID"));

			List<String> supportedDeviceCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.supportedDeviceCategories.Length"); j++) {
				supportedDeviceCategories.add(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.supportedDeviceCategories["+ j +"]"));
			}
			zone.setSupportedDeviceCategories(supportedDeviceCategories);

			List<String> networkType = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.networkType.Length"); j++) {
				networkType.add(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.networkType["+ j +"]"));
			}
			zone.setNetworkType(networkType);

			List<String> diskType = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.diskType.Length"); j++) {
				diskType.add(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].zone.diskType["+ j +"]"));
			}
			zone.setDiskType(diskType);
			item.setZone(zone);

			Iz iz = new Iz();
			iz.setRegionNo(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.regionNo"));
			iz.setStatus(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.status"));
			iz.setNo(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.no"));
			iz.setEnName(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.enName"));
			iz.setCnName(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.cnName"));

			List<String> supportedInstanceGenerations = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations.add(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.supportedInstanceGenerations["+ j +"]"));
			}
			iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.supportedInstanceTypeFamilies["+ j +"]"));
			}
			iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			List<String> supportedInstanceTypeNames = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.supportedInstanceTypeNames.Length"); j++) {
				supportedInstanceTypeNames.add(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.supportedInstanceTypeNames["+ j +"]"));
			}
			iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

			List<IzResourceModelItem> izResourceModel = new ArrayList<IzResourceModelItem>();
			for (int j = 0; j < context.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel.Length"); j++) {
				IzResourceModelItem izResourceModelItem = new IzResourceModelItem();
				izResourceModelItem.setSupportIoOptimized(context.booleanValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportIoOptimized"));

				List<String> allowedResourceCreation = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].allowedResourceCreation.Length"); k++) {
					allowedResourceCreation.add(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].allowedResourceCreation["+ k +"]"));
				}
				izResourceModelItem.setAllowedResourceCreation(allowedResourceCreation);

				List<String> supportedDataDiskCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedDataDiskCategories.Length"); k++) {
					supportedDataDiskCategories.add(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedDataDiskCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedDataDiskCategories(supportedDataDiskCategories);

				List<String> supportedInstanceGenerations1 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceGenerations.Length"); k++) {
					supportedInstanceGenerations1.add(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceGenerations["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

				List<String> supportedNetworkCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedNetworkCategories.Length"); k++) {
					supportedNetworkCategories.add(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedNetworkCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedNetworkCategories(supportedNetworkCategories);

				List<String> supportedSystemDiskCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedSystemDiskCategories.Length"); k++) {
					supportedSystemDiskCategories.add(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedSystemDiskCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

				List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypeFamilies.Length"); k++) {
					supportedInstanceTypeFamilies2.add(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypeFamilies["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

				List<String> supportedInstanceTypes = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypes.Length"); k++) {
					supportedInstanceTypes.add(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypes["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceTypes(supportedInstanceTypes);

				izResourceModel.add(izResourceModelItem);
			}
			iz.setIzResourceModel(izResourceModel);
			item.setIz(iz);

			Region region = new Region();
			region.setRegionNoAlias(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].region.regionNoAlias"));
			region.setRegionNo(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].region.regionNo"));
			region.setRegionName(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].region.regionName"));
			region.setRegionMemo(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].region.regionMemo"));
			region.setId(context.longValue("InnerInstanceQueryByParamResponse.data["+ i +"].region.id"));
			region.setIsActive(context.stringValue("InnerInstanceQueryByParamResponse.data["+ i +"].region.isActive"));
			item.setRegion(region);

			data.add(item);
		}
		innerInstanceQueryByParamResponse.setData(data);
	 
	 	return innerInstanceQueryByParamResponse;
	}
}