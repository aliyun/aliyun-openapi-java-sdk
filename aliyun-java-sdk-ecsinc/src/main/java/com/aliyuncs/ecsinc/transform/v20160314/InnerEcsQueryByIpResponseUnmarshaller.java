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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByIpResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByIpResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByIpResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByIpResponse.Item.Iz;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByIpResponse.Item.Iz.IzResourceModelItem;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByIpResponse.Item.Region;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByIpResponse.Item.Region.Attributes;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByIpResponse.Item.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsQueryByIpResponseUnmarshaller {

	public static InnerEcsQueryByIpResponse unmarshall(InnerEcsQueryByIpResponse innerEcsQueryByIpResponse, UnmarshallerContext context) {
		
		innerEcsQueryByIpResponse.setRequestId(context.stringValue("InnerEcsQueryByIpResponse.RequestId"));
		innerEcsQueryByIpResponse.setCount(context.integerValue("InnerEcsQueryByIpResponse.count"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsQueryByIpResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsQueryByIpResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsQueryByIpResponse.errorCode.isSuccess"));
		innerEcsQueryByIpResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByIpResponse.data.Length"); i++) {
			Item item = new Item();
			item.setRecoverable(context.booleanValue("InnerEcsQueryByIpResponse.data["+ i +"].recoverable"));
			item.setEipInstanceId(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].eipInstanceId"));
			item.setIsWin(context.booleanValue("InnerEcsQueryByIpResponse.data["+ i +"].isWin"));
			item.setGmtRelease(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].gmtRelease"));
			item.setSerialNumber(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].serialNumber"));
			item.setInstanceTypeGeneration(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].instanceTypeGeneration"));
			item.setIntranetRx(context.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].intranetRx"));
			item.setImageProductCode(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].imageProductCode"));
			item.setEcsBusinessStatus(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].ecsBusinessStatus"));
			item.setDescription(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].description"));
			item.setInternetIp(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].internetIp"));
			item.setImageNo(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].imageNo"));
			item.setInternetRx(context.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].internetRx"));
			item.setStatus(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].status"));
			item.setImageName(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].imageName"));
			item.setOsType(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].osType"));
			item.setHostname(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].hostname"));
			item.setEipBandwidth(context.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].eipBandwidth"));
			item.setNetWorkType(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].netWorkType"));
			item.setNatIp(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].natIp"));
			item.setInstanceType(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].instanceType"));
			item.setRecoverPolicy(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].recoverPolicy"));
			item.setIoOptimized(context.booleanValue("InnerEcsQueryByIpResponse.data["+ i +"].ioOptimized"));
			item.setOsName(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].osName"));
			item.setIntranetIp(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].intranetIp"));
			item.setEip(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].eip"));
			item.setGmtModified(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].gmtModified"));
			item.setIopsSize(context.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].iopsSize"));
			item.setSystemDiskCategory(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].systemDiskCategory"));
			item.setIntranetTx(context.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].intranetTx"));
			item.setGmtStarted(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].gmtStarted"));
			item.setGmtSync(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].gmtSync"));
			item.setCores(context.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].cores"));
			item.setAliUid(context.longValue("InnerEcsQueryByIpResponse.data["+ i +"].aliUid"));
			item.setImageId(context.longValue("InnerEcsQueryByIpResponse.data["+ i +"].imageId"));
			item.setGmtCreated(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].gmtCreated"));
			item.setGroupNo(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].groupNo"));
			item.setVpcInstanceId(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].vpcInstanceId"));
			item.setBid(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].bid"));
			item.setId(context.longValue("InnerEcsQueryByIpResponse.data["+ i +"].id"));
			item.setAgentId(context.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].agentId"));
			item.setRealHostname(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].realHostname"));
			item.setInstanceId(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].instanceId"));
			item.setInstanceTypeFamily(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].instanceTypeFamily"));
			item.setNetworkValidation(context.booleanValue("InnerEcsQueryByIpResponse.data["+ i +"].networkValidation"));
			item.setZoneId(context.longValue("InnerEcsQueryByIpResponse.data["+ i +"].zoneId"));
			item.setMemory(context.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].memory"));
			item.setInternetTx(context.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].internetTx"));
			item.setVswitchInstanceId(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].vswitchInstanceId"));
			item.setImageType(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].imageType"));
			item.setIzId(context.longValue("InnerEcsQueryByIpResponse.data["+ i +"].izId"));
			item.setDiskSize(context.integerValue("InnerEcsQueryByIpResponse.data["+ i +"].diskSize"));

			Region region = new Region();
			region.setId(context.longValue("InnerEcsQueryByIpResponse.data["+ i +"].region.id"));
			region.setIsActive(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.isActive"));
			region.setRegionEnName(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.regionEnName"));
			region.setRegionNoAlias(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.regionNoAlias"));
			region.setRegionName(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.regionName"));
			region.setRegionMemo(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.regionMemo"));
			region.setRegionNo(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.regionNo"));

			Attributes attributes = new Attributes();
			attributes.setSupport_image_copy(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.attributes.support_image_copy"));
			attributes.setInternal_use(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.attributes.internal_use"));
			attributes.setAk_name(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].region.attributes.ak_name"));
			region.setAttributes(attributes);
			item.setRegion(region);

			Iz iz = new Iz();
			iz.setRegionNo(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.regionNo"));
			iz.setStatus(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.status"));
			iz.setNo(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.no"));
			iz.setEnName(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.enName"));
			iz.setCnName(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.cnName"));

			List<String> supportedInstanceGenerations = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations.add(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.supportedInstanceGenerations["+ j +"]"));
			}
			iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.supportedInstanceTypeFamilies["+ j +"]"));
			}
			iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			List<String> supportedInstanceTypeNames = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.supportedInstanceTypeNames.Length"); j++) {
				supportedInstanceTypeNames.add(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.supportedInstanceTypeNames["+ j +"]"));
			}
			iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

			List<IzResourceModelItem> izResourceModel = new ArrayList<IzResourceModelItem>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel.Length"); j++) {
				IzResourceModelItem izResourceModelItem = new IzResourceModelItem();
				izResourceModelItem.setSupportIoOptimized(context.booleanValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportIoOptimized"));

				List<String> allowedResourceCreation = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].allowedResourceCreation.Length"); k++) {
					allowedResourceCreation.add(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].allowedResourceCreation["+ k +"]"));
				}
				izResourceModelItem.setAllowedResourceCreation(allowedResourceCreation);

				List<String> supportedDataDiskCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedDataDiskCategories.Length"); k++) {
					supportedDataDiskCategories.add(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedDataDiskCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedDataDiskCategories(supportedDataDiskCategories);

				List<String> supportedInstanceGenerations1 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceGenerations.Length"); k++) {
					supportedInstanceGenerations1.add(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceGenerations["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

				List<String> supportedNetworkCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedNetworkCategories.Length"); k++) {
					supportedNetworkCategories.add(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedNetworkCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedNetworkCategories(supportedNetworkCategories);

				List<String> supportedSystemDiskCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedSystemDiskCategories.Length"); k++) {
					supportedSystemDiskCategories.add(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedSystemDiskCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

				List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypeFamilies.Length"); k++) {
					supportedInstanceTypeFamilies2.add(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypeFamilies["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

				List<String> supportedInstanceTypes = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypes.Length"); k++) {
					supportedInstanceTypes.add(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypes["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceTypes(supportedInstanceTypes);

				izResourceModel.add(izResourceModelItem);
			}
			iz.setIzResourceModel(izResourceModel);
			item.setIz(iz);

			Zone zone = new Zone();
			zone.setZoneMemo(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.zoneMemo"));
			zone.setIsWritable(context.booleanValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.isWritable"));
			zone.setZoneName(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.zoneName"));
			zone.setZoneNoAlias(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.zoneNoAlias"));
			zone.setIsActive(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.isActive"));
			zone.setId(context.longValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.id"));
			zone.setZoneEnName(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.zoneEnName"));
			zone.setZoneNo(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.zoneNo"));
			zone.setRouteIpSegment(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.routeIpSegment"));
			zone.setRegionId(context.longValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.regionId"));

			List<String> supportedDeviceCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.supportedDeviceCategories.Length"); j++) {
				supportedDeviceCategories.add(context.stringValue("InnerEcsQueryByIpResponse.data["+ i +"].zone.supportedDeviceCategories["+ j +"]"));
			}
			zone.setSupportedDeviceCategories(supportedDeviceCategories);
			item.setZone(zone);

			data.add(item);
		}
		innerEcsQueryByIpResponse.setData(data);
	 
	 	return innerEcsQueryByIpResponse;
	}
}