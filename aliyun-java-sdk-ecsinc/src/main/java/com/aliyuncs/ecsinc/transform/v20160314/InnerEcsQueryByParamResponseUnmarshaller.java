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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByParamResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByParamResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByParamResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByParamResponse.Item.Iz;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByParamResponse.Item.Iz.IzResourceModelItem;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByParamResponse.Item.Region;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByParamResponse.Item.Region.Attributes;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByParamResponse.Item.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsQueryByParamResponseUnmarshaller {

	public static InnerEcsQueryByParamResponse unmarshall(InnerEcsQueryByParamResponse innerEcsQueryByParamResponse, UnmarshallerContext context) {
		
		innerEcsQueryByParamResponse.setRequestId(context.stringValue("InnerEcsQueryByParamResponse.RequestId"));
		innerEcsQueryByParamResponse.setCount(context.integerValue("InnerEcsQueryByParamResponse.count"));
		innerEcsQueryByParamResponse.setPageNo(context.integerValue("InnerEcsQueryByParamResponse.pageNo"));
		innerEcsQueryByParamResponse.setPageSize(context.integerValue("InnerEcsQueryByParamResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsQueryByParamResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsQueryByParamResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsQueryByParamResponse.errorCode.isSuccess"));
		innerEcsQueryByParamResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByParamResponse.data.Length"); i++) {
			Item item = new Item();
			item.setRecoverable(context.booleanValue("InnerEcsQueryByParamResponse.data["+ i +"].recoverable"));
			item.setEipInstanceId(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].eipInstanceId"));
			item.setIsWin(context.booleanValue("InnerEcsQueryByParamResponse.data["+ i +"].isWin"));
			item.setGmtRelease(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].gmtRelease"));
			item.setSerialNumber(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].serialNumber"));
			item.setInstanceTypeGeneration(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].instanceTypeGeneration"));
			item.setIntranetRx(context.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].intranetRx"));
			item.setImageProductCode(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].imageProductCode"));
			item.setEcsBusinessStatus(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].ecsBusinessStatus"));
			item.setDescription(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].description"));
			item.setInternetIp(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].internetIp"));
			item.setImageNo(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].imageNo"));
			item.setInternetRx(context.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].internetRx"));
			item.setStatus(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].status"));
			item.setImageName(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].imageName"));
			item.setOsType(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].osType"));
			item.setHostname(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].hostname"));
			item.setEipBandwidth(context.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].eipBandwidth"));
			item.setNetWorkType(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].netWorkType"));
			item.setNatIp(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].natIp"));
			item.setInstanceType(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].instanceType"));
			item.setRecoverPolicy(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].recoverPolicy"));
			item.setIoOptimized(context.booleanValue("InnerEcsQueryByParamResponse.data["+ i +"].ioOptimized"));
			item.setOsName(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].osName"));
			item.setIntranetIp(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].intranetIp"));
			item.setEip(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].eip"));
			item.setGmtModified(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].gmtModified"));
			item.setIopsSize(context.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].iopsSize"));
			item.setSystemDiskCategory(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].systemDiskCategory"));
			item.setIntranetTx(context.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].intranetTx"));
			item.setGmtStarted(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].gmtStarted"));
			item.setGmtSync(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].gmtSync"));
			item.setCores(context.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].cores"));
			item.setAliUid(context.longValue("InnerEcsQueryByParamResponse.data["+ i +"].aliUid"));
			item.setImageId(context.longValue("InnerEcsQueryByParamResponse.data["+ i +"].imageId"));
			item.setGmtCreated(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].gmtCreated"));
			item.setGroupNo(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].groupNo"));
			item.setVpcInstanceId(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].vpcInstanceId"));
			item.setBid(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].bid"));
			item.setId(context.longValue("InnerEcsQueryByParamResponse.data["+ i +"].id"));
			item.setAgentId(context.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].agentId"));
			item.setRealHostname(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].realHostname"));
			item.setInstanceId(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].instanceId"));
			item.setInstanceTypeFamily(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].instanceTypeFamily"));
			item.setNetworkValidation(context.booleanValue("InnerEcsQueryByParamResponse.data["+ i +"].networkValidation"));
			item.setZoneId(context.longValue("InnerEcsQueryByParamResponse.data["+ i +"].zoneId"));
			item.setMemory(context.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].memory"));
			item.setInternetTx(context.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].internetTx"));
			item.setVswitchInstanceId(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].vswitchInstanceId"));
			item.setImageType(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].imageType"));
			item.setIzId(context.longValue("InnerEcsQueryByParamResponse.data["+ i +"].izId"));
			item.setDiskSize(context.integerValue("InnerEcsQueryByParamResponse.data["+ i +"].diskSize"));

			Region region = new Region();
			region.setId(context.longValue("InnerEcsQueryByParamResponse.data["+ i +"].region.id"));
			region.setIsActive(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.isActive"));
			region.setRegionEnName(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.regionEnName"));
			region.setRegionNoAlias(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.regionNoAlias"));
			region.setRegionName(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.regionName"));
			region.setRegionMemo(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.regionMemo"));
			region.setRegionNo(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.regionNo"));

			Attributes attributes = new Attributes();
			attributes.setSupport_image_copy(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.attributes.support_image_copy"));
			attributes.setInternal_use(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.attributes.internal_use"));
			attributes.setAk_name(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].region.attributes.ak_name"));
			region.setAttributes(attributes);
			item.setRegion(region);

			Iz iz = new Iz();
			iz.setRegionNo(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.regionNo"));
			iz.setStatus(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.status"));
			iz.setNo(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.no"));
			iz.setEnName(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.enName"));
			iz.setCnName(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.cnName"));

			List<String> supportedInstanceGenerations = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations.add(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.supportedInstanceGenerations["+ j +"]"));
			}
			iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.supportedInstanceTypeFamilies["+ j +"]"));
			}
			iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			List<String> supportedInstanceTypeNames = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.supportedInstanceTypeNames.Length"); j++) {
				supportedInstanceTypeNames.add(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.supportedInstanceTypeNames["+ j +"]"));
			}
			iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

			List<IzResourceModelItem> izResourceModel = new ArrayList<IzResourceModelItem>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel.Length"); j++) {
				IzResourceModelItem izResourceModelItem = new IzResourceModelItem();
				izResourceModelItem.setSupportIoOptimized(context.booleanValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportIoOptimized"));

				List<String> allowedResourceCreation = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].allowedResourceCreation.Length"); k++) {
					allowedResourceCreation.add(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].allowedResourceCreation["+ k +"]"));
				}
				izResourceModelItem.setAllowedResourceCreation(allowedResourceCreation);

				List<String> supportedDataDiskCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedDataDiskCategories.Length"); k++) {
					supportedDataDiskCategories.add(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedDataDiskCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedDataDiskCategories(supportedDataDiskCategories);

				List<String> supportedInstanceGenerations1 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceGenerations.Length"); k++) {
					supportedInstanceGenerations1.add(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceGenerations["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

				List<String> supportedNetworkCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedNetworkCategories.Length"); k++) {
					supportedNetworkCategories.add(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedNetworkCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedNetworkCategories(supportedNetworkCategories);

				List<String> supportedSystemDiskCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedSystemDiskCategories.Length"); k++) {
					supportedSystemDiskCategories.add(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedSystemDiskCategories["+ k +"]"));
				}
				izResourceModelItem.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

				List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypeFamilies.Length"); k++) {
					supportedInstanceTypeFamilies2.add(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypeFamilies["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

				List<String> supportedInstanceTypes = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypes.Length"); k++) {
					supportedInstanceTypes.add(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].iz.izResourceModel["+ j +"].supportedInstanceTypes["+ k +"]"));
				}
				izResourceModelItem.setSupportedInstanceTypes(supportedInstanceTypes);

				izResourceModel.add(izResourceModelItem);
			}
			iz.setIzResourceModel(izResourceModel);
			item.setIz(iz);

			Zone zone = new Zone();
			zone.setZoneMemo(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.zoneMemo"));
			zone.setIsWritable(context.booleanValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.isWritable"));
			zone.setZoneName(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.zoneName"));
			zone.setZoneNoAlias(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.zoneNoAlias"));
			zone.setIsActive(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.isActive"));
			zone.setId(context.longValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.id"));
			zone.setZoneEnName(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.zoneEnName"));
			zone.setZoneNo(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.zoneNo"));
			zone.setRouteIpSegment(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.routeIpSegment"));
			zone.setRegionId(context.longValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.regionId"));

			List<String> supportedDeviceCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.supportedDeviceCategories.Length"); j++) {
				supportedDeviceCategories.add(context.stringValue("InnerEcsQueryByParamResponse.data["+ i +"].zone.supportedDeviceCategories["+ j +"]"));
			}
			zone.setSupportedDeviceCategories(supportedDeviceCategories);
			item.setZone(zone);

			data.add(item);
		}
		innerEcsQueryByParamResponse.setData(data);
	 
	 	return innerEcsQueryByParamResponse;
	}
}