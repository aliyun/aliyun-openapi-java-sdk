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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByHpcClusterIdResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByHpcClusterIdResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByHpcClusterIdResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByHpcClusterIdResponse.Item.Iz;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByHpcClusterIdResponse.Item.Iz.IzResourceModelItem;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByHpcClusterIdResponse.Item.Region;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByHpcClusterIdResponse.Item.Region.Attributes;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByHpcClusterIdResponse.Item.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsQueryByHpcClusterIdResponseUnmarshaller {

	public static InnerEcsQueryByHpcClusterIdResponse unmarshall(InnerEcsQueryByHpcClusterIdResponse innerEcsQueryByHpcClusterIdResponse, UnmarshallerContext context) {
		
		innerEcsQueryByHpcClusterIdResponse.setRequestId(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.RequestId"));
		innerEcsQueryByHpcClusterIdResponse.setCount(context.integerValue("InnerEcsQueryByHpcClusterIdResponse.count"));
		innerEcsQueryByHpcClusterIdResponse.setPageNo(context.integerValue("InnerEcsQueryByHpcClusterIdResponse.pageNo"));
		innerEcsQueryByHpcClusterIdResponse.setPageSize(context.integerValue("InnerEcsQueryByHpcClusterIdResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsQueryByHpcClusterIdResponse.errorCode.isSuccess"));
		innerEcsQueryByHpcClusterIdResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByHpcClusterIdResponse.data.Length"); i++) {
			Item item = new Item();
			item.setRecoverable(context.booleanValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].recoverable"));
			item.setEipInstanceId(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].eipInstanceId"));
			item.setIsWin(context.booleanValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].isWin"));
			item.setGmtRelease(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].gmtRelease"));
			item.setSerialNumber(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].serialNumber"));
			item.setInstanceTypeGeneration(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].instanceTypeGeneration"));
			item.setIntranetRx(context.integerValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].intranetRx"));
			item.setImageProductCode(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].imageProductCode"));
			item.setEcsBusinessStatus(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].ecsBusinessStatus"));
			item.setDescription(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].description"));
			item.setInternetIp(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].internetIp"));
			item.setImageNo(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].imageNo"));
			item.setInternetRx(context.integerValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].internetRx"));
			item.setStatus(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].status"));
			item.setImageName(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].imageName"));
			item.setOsType(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].osType"));
			item.setHostname(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].hostname"));
			item.setEipBandwidth(context.integerValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].eipBandwidth"));
			item.setNetWorkType(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].netWorkType"));
			item.setNatIp(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].natIp"));
			item.setInstanceType(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].instanceType"));
			item.setRecoverPolicy(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].recoverPolicy"));
			item.setIoOptimized(context.booleanValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].ioOptimized"));
			item.setOsName(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].osName"));
			item.setIntranetIp(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].intranetIp"));
			item.setEip(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].eip"));
			item.setGmtModified(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].gmtModified"));
			item.setIopsSize(context.integerValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iopsSize"));
			item.setSystemDiskCategory(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].systemDiskCategory"));
			item.setIntranetTx(context.integerValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].intranetTx"));
			item.setGmtStarted(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].gmtStarted"));
			item.setGmtSync(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].gmtSync"));
			item.setCores(context.integerValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].cores"));
			item.setAliUid(context.longValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].aliUid"));
			item.setImageId(context.longValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].imageId"));
			item.setGmtCreated(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].gmtCreated"));
			item.setGroupNo(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].groupNo"));
			item.setVpcInstanceId(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].vpcInstanceId"));
			item.setBid(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].bid"));
			item.setId(context.longValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].id"));
			item.setAgentId(context.integerValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].agentId"));
			item.setRealHostname(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].realHostname"));
			item.setInstanceId(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].instanceId"));
			item.setInstanceTypeFamily(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].instanceTypeFamily"));
			item.setNetworkValidation(context.booleanValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].networkValidation"));
			item.setZoneId(context.longValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].zoneId"));
			item.setMemory(context.integerValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].memory"));
			item.setInternetTx(context.integerValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].internetTx"));
			item.setVswitchInstanceId(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].vswitchInstanceId"));
			item.setImageType(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].imageType"));
			item.setIzId(context.longValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].izId"));
			item.setDiskSize(context.integerValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].diskSize"));
			item.setHpcClusterId(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].hpcClusterId"));
			item.setRdmaIp(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].rdmaIp"));

			Region region = new Region();
			region.setId(context.longValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].region.id"));
			region.setIsActive(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].region.isActive"));
			region.setRegionEnName(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].region.regionEnName"));
			region.setRegionNoAlias(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].region.regionNoAlias"));
			region.setRegionName(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].region.regionName"));
			region.setRegionMemo(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].region.regionMemo"));
			region.setRegionNo(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].region.regionNo"));

			Attributes attributes = new Attributes();
			attributes.setSupport_image_copy(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].region.attributes.support_image_copy"));
			attributes.setInternal_use(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].region.attributes.internal_use"));
			attributes.setAk_name(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].region.attributes.ak_name"));
			region.setAttributes(attributes);
			item.setRegion(region);

			Iz iz = new Iz();
			iz.setRegionNo(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.regionNo"));
			iz.setStatus(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.status"));
			iz.setNo(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.no"));
			iz.setEnName(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.enName"));
			iz.setCnName(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.cnName"));

			List<String> supportedInstanceGenerations = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations.add(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.supportedInstanceGenerations["+ j +"]"));
			}
			iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.supportedInstanceTypeFamilies["+ j +"]"));
			}
			iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			List<String> supportedInstanceTypeNames = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.supportedInstanceTypeNames.Length"); j++) {
				supportedInstanceTypeNames.add(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.supportedInstanceTypeNames["+ j +"]"));
			}
			iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

			List<IzResourceModelItem> izResourceModel = new ArrayList<IzResourceModelItem>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.izResourceModel.Length"); j++) {
				IzResourceModelItem izResourceModelItem = new IzResourceModelItem();
				izResourceModelItem.setSupportIoOptimized(context.booleanValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportIoOptimized"));

				List<String> allowedResourceCreation = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.izResourceModel["+ j +"].allowedResourceCreation.Length"); k++) {
					allowedResourceCreation.add(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.izResourceModel["+ j +"].allowedResourceCreation["+ k +"]"));
				}
				izResourceModelItem.setAllowedResourceCreation(allowedResourceCreation);

				List<String> supportedDataDiskCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedDataDiskCategories.Length"); k++) {
					supportedDataDiskCategories.add(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedDataDiskCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedDataDiskCategories(supportedDataDiskCategories);

				List<String> supportedInstanceGenerations1 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceGenerations.Length"); k++) {
					supportedInstanceGenerations1.add(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceGenerations["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

				List<String> supportedNetworkCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedNetworkCategories.Length"); k++) {
					supportedNetworkCategories.add(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedNetworkCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedNetworkCategories(supportedNetworkCategories);

				List<String> supportedSystemDiskCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedSystemDiskCategories.Length"); k++) {
					supportedSystemDiskCategories.add(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedSystemDiskCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

				List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypeFamilies.Length"); k++) {
					supportedInstanceTypeFamilies2.add(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypeFamilies["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

				List<String> supportedInstanceTypes = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypes.Length"); k++) {
					supportedInstanceTypes.add(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypes["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceTypes(supportedInstanceTypes);

				izResourceModel.add(izResourceModelItem);
			}
			iz.setIzResourceModel(izResourceModel);
			item.setIz(iz);

			Zone zone = new Zone();
			zone.setZoneMemo(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].zone.zoneMemo"));
			zone.setIsWritable(context.booleanValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].zone.isWritable"));
			zone.setZoneName(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].zone.zoneName"));
			zone.setZoneNoAlias(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].zone.zoneNoAlias"));
			zone.setIsActive(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].zone.isActive"));
			zone.setId(context.longValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].zone.id"));
			zone.setZoneEnName(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].zone.zoneEnName"));
			zone.setZoneNo(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].zone.zoneNo"));
			zone.setRouteIpSegment(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].zone.routeIpSegment"));
			zone.setRegionId(context.longValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].zone.regionId"));

			List<String> supportedDeviceCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].zone.supportedDeviceCategories.Length"); j++) {
				supportedDeviceCategories.add(context.stringValue("InnerEcsQueryByHpcClusterIdResponse.data["+ i +"].zone.supportedDeviceCategories["+ j +"]"));
			}
			zone.setSupportedDeviceCategories(supportedDeviceCategories);
			item.setZone(zone);

			data.add(item);
		}
		innerEcsQueryByHpcClusterIdResponse.setData(data);
	 
	 	return innerEcsQueryByHpcClusterIdResponse;
	}
}