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

import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryByParamBackyardResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryByParamBackyardResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryByParamBackyardResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryByParamBackyardResponse.Item.Iz;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryByParamBackyardResponse.Item.Iz.IzResourceMode;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryByParamBackyardResponse.Item.Region;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryByParamBackyardResponse.Item.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerInstanceQueryByParamBackyardResponseUnmarshaller {

	public static InnerInstanceQueryByParamBackyardResponse unmarshall(InnerInstanceQueryByParamBackyardResponse innerInstanceQueryByParamBackyardResponse, UnmarshallerContext context) {
		
		innerInstanceQueryByParamBackyardResponse.setRequestId(context.stringValue("InnerInstanceQueryByParamBackyardResponse.RequestId"));
		innerInstanceQueryByParamBackyardResponse.setCount(context.integerValue("InnerInstanceQueryByParamBackyardResponse.count"));
		innerInstanceQueryByParamBackyardResponse.setPageNo(context.integerValue("InnerInstanceQueryByParamBackyardResponse.pageNo"));
		innerInstanceQueryByParamBackyardResponse.setPageSize(context.integerValue("InnerInstanceQueryByParamBackyardResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerInstanceQueryByParamBackyardResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerInstanceQueryByParamBackyardResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerInstanceQueryByParamBackyardResponse.errorCode.isSuccess"));
		innerInstanceQueryByParamBackyardResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerInstanceQueryByParamBackyardResponse.data.Length"); i++) {
			Item item = new Item();
			item.setBusinessStatus(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].businessStatus"));
			item.setIntranetIp(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].intranetIp"));
			item.setDiskSize(context.integerValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].diskSize"));
			item.setOsName(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].osName"));
			item.setIzId(context.longValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].izId"));
			item.setIoOptimized(context.booleanValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].ioOptimized"));
			item.setImageType(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].imageType"));
			item.setRecoverPolicy(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].recoverPolicy"));
			item.setInternetTx(context.integerValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].internetTx"));
			item.setZoneId(context.longValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].zoneId"));
			item.setMemory(context.integerValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].memory"));
			item.setHostname(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].hostname"));
			item.setAgentId(context.integerValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].agentId"));
			item.setInstanceId(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].instanceId"));
			item.setOsType(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].osType"));
			item.setStatus(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].status"));
			item.setImageName(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].imageName"));
			item.setInternetRx(context.integerValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].internetRx"));
			item.setInternetIp(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].internetIp"));
			item.setBid(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].bid"));
			item.setImageNo(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].imageNo"));
			item.setEcsBusinessStatus(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].ecsBusinessStatus"));
			item.setGroupNo(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].groupNo"));
			item.setId(context.longValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].id"));
			item.setImageId(context.longValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].imageId"));
			item.setGmtCreated(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].gmtCreated"));
			item.setIntranetRx(context.integerValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].intranetRx"));
			item.setAliUid(context.longValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].aliUid"));
			item.setGmtStarted(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].gmtStarted"));
			item.setIntranetTx(context.integerValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].intranetTx"));
			item.setCores(context.integerValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].cores"));
			item.setGmtSync(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].gmtSync"));
			item.setSystemDiskCategory(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].systemDiskCategory"));
			item.setGmtRelease(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].gmtRelease"));
			item.setGmtModified(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].gmtModified"));
			item.setIsWin(context.booleanValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].isWin"));
			item.setRecoverable(context.booleanValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].recoverable"));
			item.setImagePc(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].imagePc"));

			Zone zone = new Zone();
			zone.setZoneNo(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].zone.zoneNo"));
			zone.setId(context.longValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].zone.id"));
			zone.setIsActive(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].zone.isActive"));
			zone.setZoneNoAlias(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].zone.zoneNoAlias"));
			zone.setRegionId(context.longValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].zone.regionId"));
			zone.setRouteIpSegment(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].zone.routeIpSegment"));
			zone.setZoneMemo(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].zone.zoneMemo"));
			zone.setZoneName(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].zone.zoneName"));
			zone.setIsWritable(context.booleanValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].zone.isWritable"));
			zone.setAvailableZoneID(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].zone.availableZoneID"));

			List<String> supportedDeviceCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].zone.supportedDeviceCategories.Length"); j++) {
				supportedDeviceCategories.add(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].zone.supportedDeviceCategories["+ j +"]"));
			}
			zone.setSupportedDeviceCategories(supportedDeviceCategories);

			List<String> networkType = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].zone.networkType.Length"); j++) {
				networkType.add(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].zone.networkType["+ j +"]"));
			}
			zone.setNetworkType(networkType);

			List<String> diskType = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].zone.diskType.Length"); j++) {
				diskType.add(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].zone.diskType["+ j +"]"));
			}
			zone.setDiskType(diskType);
			item.setZone(zone);

			Iz iz = new Iz();
			iz.setRegionNo(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.regionNo"));
			iz.setEnName(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.enName"));
			iz.setStatus(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.status"));
			iz.setCnName(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.cnName"));
			iz.setNo(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.no"));

			List<String> supportedInstanceGenerations = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations.add(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.supportedInstanceGenerations["+ j +"]"));
			}
			iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.supportedInstanceTypeFamilies["+ j +"]"));
			}
			iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			List<String> supportedInstanceTypeNames = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.supportedInstanceTypeNames.Length"); j++) {
				supportedInstanceTypeNames.add(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.supportedInstanceTypeNames["+ j +"]"));
			}
			iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

			List<IzResourceMode> izResourceModel = new ArrayList<IzResourceMode>();
			for (int j = 0; j < context.lengthValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.izResourceModel.Length"); j++) {
				IzResourceMode izResourceMode = new IzResourceMode();
				izResourceMode.setSupportIoOptimized(context.booleanValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportIoOptimized"));

				List<String> allowedResourceCreation = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.izResourceModel["+ j +"].allowedResourceCreation.Length"); k++) {
					allowedResourceCreation.add(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.izResourceModel["+ j +"].allowedResourceCreation["+ k +"]"));
				}
				izResourceMode.setAllowedResourceCreation(allowedResourceCreation);

				List<String> supportedDataDiskCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedDataDiskCategories.Length"); k++) {
					supportedDataDiskCategories.add(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedDataDiskCategories["+ k +"]"));
				}
				izResourceMode.setSupportedDataDiskCategories(supportedDataDiskCategories);

				List<String> supportedInstanceGenerations1 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceGenerations.Length"); k++) {
					supportedInstanceGenerations1.add(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceGenerations["+ k +"]"));
				}
				izResourceMode.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

				List<String> supportedNetworkCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedNetworkCategories.Length"); k++) {
					supportedNetworkCategories.add(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedNetworkCategories["+ k +"]"));
				}
				izResourceMode.setSupportedNetworkCategories(supportedNetworkCategories);

				List<String> supportedSystemDiskCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedSystemDiskCategories.Length"); k++) {
					supportedSystemDiskCategories.add(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedSystemDiskCategories["+ k +"]"));
				}
				izResourceMode.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

				List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypeFamilies.Length"); k++) {
					supportedInstanceTypeFamilies2.add(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypeFamilies["+ k +"]"));
				}
				izResourceMode.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

				List<String> supportedInstanceTypes = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypes.Length"); k++) {
					supportedInstanceTypes.add(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypes["+ k +"]"));
				}
				izResourceMode.setSupportedInstanceTypes(supportedInstanceTypes);

				izResourceModel.add(izResourceMode);
			}
			iz.setIzResourceModel(izResourceModel);
			item.setIz(iz);

			Region region = new Region();
			region.setRegionNoAlias(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].region.regionNoAlias"));
			region.setRegionNo(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].region.regionNo"));
			region.setRegionName(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].region.regionName"));
			region.setRegionMemo(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].region.regionMemo"));
			region.setId(context.longValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].region.id"));
			region.setIsActive(context.stringValue("InnerInstanceQueryByParamBackyardResponse.data["+ i +"].region.isActive"));
			item.setRegion(region);

			data.add(item);
		}
		innerInstanceQueryByParamBackyardResponse.setData(data);
	 
	 	return innerInstanceQueryByParamBackyardResponse;
	}
}