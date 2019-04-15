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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryBySerialNumberResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryBySerialNumberResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryBySerialNumberResponse.Data.Iz;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryBySerialNumberResponse.Data.Iz.IzResourceModelItem;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryBySerialNumberResponse.Data.Region;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryBySerialNumberResponse.Data.Region.Attributes;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryBySerialNumberResponse.Data.Zone;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryBySerialNumberResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsQueryBySerialNumberResponseUnmarshaller {

	public static InnerEcsQueryBySerialNumberResponse unmarshall(InnerEcsQueryBySerialNumberResponse innerEcsQueryBySerialNumberResponse, UnmarshallerContext context) {
		
		innerEcsQueryBySerialNumberResponse.setRequestId(context.stringValue("InnerEcsQueryBySerialNumberResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsQueryBySerialNumberResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsQueryBySerialNumberResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsQueryBySerialNumberResponse.errorCode.isSuccess"));
		innerEcsQueryBySerialNumberResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setRecoverable(context.booleanValue("InnerEcsQueryBySerialNumberResponse.data.recoverable"));
		data.setEipInstanceId(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.eipInstanceId"));
		data.setIsWin(context.booleanValue("InnerEcsQueryBySerialNumberResponse.data.isWin"));
		data.setGmtRelease(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.gmtRelease"));
		data.setSerialNumber(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.serialNumber"));
		data.setInstanceTypeGeneration(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.instanceTypeGeneration"));
		data.setIntranetRx(context.integerValue("InnerEcsQueryBySerialNumberResponse.data.intranetRx"));
		data.setImageProductCode(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.imageProductCode"));
		data.setEcsBusinessStatus(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.ecsBusinessStatus"));
		data.setDescription(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.description"));
		data.setInternetIp(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.internetIp"));
		data.setImageNo(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.imageNo"));
		data.setInternetRx(context.integerValue("InnerEcsQueryBySerialNumberResponse.data.internetRx"));
		data.setStatus(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.status"));
		data.setImageName(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.imageName"));
		data.setOsType(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.osType"));
		data.setHostname(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.hostname"));
		data.setEipBandwidth(context.integerValue("InnerEcsQueryBySerialNumberResponse.data.eipBandwidth"));
		data.setNetWorkType(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.netWorkType"));
		data.setNatIp(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.natIp"));
		data.setInstanceType(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.instanceType"));
		data.setRecoverPolicy(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.recoverPolicy"));
		data.setIoOptimized(context.booleanValue("InnerEcsQueryBySerialNumberResponse.data.ioOptimized"));
		data.setOsName(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.osName"));
		data.setIntranetIp(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.intranetIp"));
		data.setEip(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.eip"));
		data.setGmtModified(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.gmtModified"));
		data.setIopsSize(context.integerValue("InnerEcsQueryBySerialNumberResponse.data.iopsSize"));
		data.setSystemDiskCategory(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.systemDiskCategory"));
		data.setIntranetTx(context.integerValue("InnerEcsQueryBySerialNumberResponse.data.intranetTx"));
		data.setGmtStarted(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.gmtStarted"));
		data.setGmtSync(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.gmtSync"));
		data.setCores(context.integerValue("InnerEcsQueryBySerialNumberResponse.data.cores"));
		data.setAliUid(context.longValue("InnerEcsQueryBySerialNumberResponse.data.aliUid"));
		data.setImageId(context.longValue("InnerEcsQueryBySerialNumberResponse.data.imageId"));
		data.setGmtCreated(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.gmtCreated"));
		data.setGroupNo(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.groupNo"));
		data.setVpcInstanceId(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.vpcInstanceId"));
		data.setBid(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.bid"));
		data.setId(context.longValue("InnerEcsQueryBySerialNumberResponse.data.id"));
		data.setAgentId(context.integerValue("InnerEcsQueryBySerialNumberResponse.data.agentId"));
		data.setRealHostname(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.realHostname"));
		data.setInstanceId(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.instanceId"));
		data.setInstanceTypeFamily(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.instanceTypeFamily"));
		data.setNetworkValidation(context.booleanValue("InnerEcsQueryBySerialNumberResponse.data.networkValidation"));
		data.setZoneId(context.longValue("InnerEcsQueryBySerialNumberResponse.data.zoneId"));
		data.setMemory(context.integerValue("InnerEcsQueryBySerialNumberResponse.data.memory"));
		data.setInternetTx(context.integerValue("InnerEcsQueryBySerialNumberResponse.data.internetTx"));
		data.setVswitchInstanceId(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.vswitchInstanceId"));
		data.setImageType(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.imageType"));
		data.setIzId(context.longValue("InnerEcsQueryBySerialNumberResponse.data.izId"));
		data.setDiskSize(context.integerValue("InnerEcsQueryBySerialNumberResponse.data.diskSize"));

		Region region = new Region();
		region.setId(context.longValue("InnerEcsQueryBySerialNumberResponse.data.region.id"));
		region.setIsActive(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.isActive"));
		region.setRegionEnName(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.regionEnName"));
		region.setRegionNoAlias(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.regionNoAlias"));
		region.setRegionName(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.regionName"));
		region.setRegionMemo(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.regionMemo"));
		region.setRegionNo(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.regionNo"));

		Attributes attributes = new Attributes();
		attributes.setSupport_image_copy(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.attributes.support_image_copy"));
		attributes.setInternal_use(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.attributes.internal_use"));
		attributes.setAk_name(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.region.attributes.ak_name"));
		region.setAttributes(attributes);
		data.setRegion(region);

		Iz iz = new Iz();
		iz.setRegionNo(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.regionNo"));
		iz.setStatus(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.status"));
		iz.setNo(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.no"));
		iz.setEnName(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.enName"));
		iz.setCnName(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.cnName"));

		List<String> supportedInstanceGenerations = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.supportedInstanceGenerations.Length"); i++) {
			supportedInstanceGenerations.add(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.supportedInstanceGenerations["+ i +"]"));
		}
		iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

		List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.supportedInstanceTypeFamilies.Length"); i++) {
			supportedInstanceTypeFamilies.add(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.supportedInstanceTypeFamilies["+ i +"]"));
		}
		iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

		List<String> supportedInstanceTypeNames = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.supportedInstanceTypeNames.Length"); i++) {
			supportedInstanceTypeNames.add(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.supportedInstanceTypeNames["+ i +"]"));
		}
		iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

		List<IzResourceModelItem> izResourceModel = new ArrayList<IzResourceModelItem>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel.Length"); i++) {
			IzResourceModelItem izResourceModelItem = new IzResourceModelItem();
			izResourceModelItem.setSupportIoOptimized(context.booleanValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportIoOptimized"));

			List<String> allowedResourceCreation = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation.Length"); j++) {
				allowedResourceCreation.add(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation["+ j +"]"));
			}
			izResourceModelItem.setAllowedResourceCreation(allowedResourceCreation);

			List<String> supportedDataDiskCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories.Length"); j++) {
				supportedDataDiskCategories.add(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedDataDiskCategories(supportedDataDiskCategories);

			List<String> supportedInstanceGenerations1 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations1.add(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

			List<String> supportedNetworkCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories.Length"); j++) {
				supportedNetworkCategories.add(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedNetworkCategories(supportedNetworkCategories);

			List<String> supportedSystemDiskCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories.Length"); j++) {
				supportedSystemDiskCategories.add(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

			List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies2.add(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

			List<String> supportedInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes.Length"); j++) {
				supportedInstanceTypes.add(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceTypes(supportedInstanceTypes);

			izResourceModel.add(izResourceModelItem);
		}
		iz.setIzResourceModel(izResourceModel);
		data.setIz(iz);

		Zone zone = new Zone();
		zone.setZoneMemo(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.zone.zoneMemo"));
		zone.setIsWritable(context.booleanValue("InnerEcsQueryBySerialNumberResponse.data.zone.isWritable"));
		zone.setZoneName(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.zone.zoneName"));
		zone.setZoneNoAlias(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.zone.zoneNoAlias"));
		zone.setIsActive(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.zone.isActive"));
		zone.setId(context.longValue("InnerEcsQueryBySerialNumberResponse.data.zone.id"));
		zone.setZoneEnName(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.zone.zoneEnName"));
		zone.setZoneNo(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.zone.zoneNo"));
		zone.setRouteIpSegment(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.zone.routeIpSegment"));
		zone.setRegionId(context.longValue("InnerEcsQueryBySerialNumberResponse.data.zone.regionId"));

		List<String> supportedDeviceCategories = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryBySerialNumberResponse.data.zone.supportedDeviceCategories.Length"); i++) {
			supportedDeviceCategories.add(context.stringValue("InnerEcsQueryBySerialNumberResponse.data.zone.supportedDeviceCategories["+ i +"]"));
		}
		zone.setSupportedDeviceCategories(supportedDeviceCategories);
		data.setZone(zone);
		innerEcsQueryBySerialNumberResponse.setData(data);
	 
	 	return innerEcsQueryBySerialNumberResponse;
	}
}