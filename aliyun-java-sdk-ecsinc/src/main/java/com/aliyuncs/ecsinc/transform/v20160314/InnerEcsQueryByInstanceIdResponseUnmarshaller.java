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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByInstanceIdResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByInstanceIdResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByInstanceIdResponse.Data.Iz;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByInstanceIdResponse.Data.Iz.IzResourceModelItem;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByInstanceIdResponse.Data.Region;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByInstanceIdResponse.Data.Region.Attributes;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByInstanceIdResponse.Data.Zone;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByInstanceIdResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsQueryByInstanceIdResponseUnmarshaller {

	public static InnerEcsQueryByInstanceIdResponse unmarshall(InnerEcsQueryByInstanceIdResponse innerEcsQueryByInstanceIdResponse, UnmarshallerContext context) {
		
		innerEcsQueryByInstanceIdResponse.setRequestId(context.stringValue("InnerEcsQueryByInstanceIdResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsQueryByInstanceIdResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsQueryByInstanceIdResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsQueryByInstanceIdResponse.errorCode.isSuccess"));
		innerEcsQueryByInstanceIdResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setRecoverable(context.booleanValue("InnerEcsQueryByInstanceIdResponse.data.recoverable"));
		data.setEipInstanceId(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.eipInstanceId"));
		data.setIsWin(context.booleanValue("InnerEcsQueryByInstanceIdResponse.data.isWin"));
		data.setGmtRelease(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.gmtRelease"));
		data.setSerialNumber(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.serialNumber"));
		data.setInstanceTypeGeneration(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.instanceTypeGeneration"));
		data.setIntranetRx(context.integerValue("InnerEcsQueryByInstanceIdResponse.data.intranetRx"));
		data.setImageProductCode(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.imageProductCode"));
		data.setEcsBusinessStatus(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.ecsBusinessStatus"));
		data.setDescription(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.description"));
		data.setInternetIp(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.internetIp"));
		data.setImageNo(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.imageNo"));
		data.setInternetRx(context.integerValue("InnerEcsQueryByInstanceIdResponse.data.internetRx"));
		data.setStatus(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.status"));
		data.setImageName(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.imageName"));
		data.setOsType(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.osType"));
		data.setHostname(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.hostname"));
		data.setEipBandwidth(context.integerValue("InnerEcsQueryByInstanceIdResponse.data.eipBandwidth"));
		data.setNetWorkType(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.netWorkType"));
		data.setNatIp(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.natIp"));
		data.setInstanceType(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.instanceType"));
		data.setRecoverPolicy(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.recoverPolicy"));
		data.setIoOptimized(context.booleanValue("InnerEcsQueryByInstanceIdResponse.data.ioOptimized"));
		data.setOsName(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.osName"));
		data.setIntranetIp(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.intranetIp"));
		data.setEip(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.eip"));
		data.setGmtModified(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.gmtModified"));
		data.setIopsSize(context.integerValue("InnerEcsQueryByInstanceIdResponse.data.iopsSize"));
		data.setSystemDiskCategory(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.systemDiskCategory"));
		data.setIntranetTx(context.integerValue("InnerEcsQueryByInstanceIdResponse.data.intranetTx"));
		data.setGmtStarted(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.gmtStarted"));
		data.setGmtSync(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.gmtSync"));
		data.setCores(context.integerValue("InnerEcsQueryByInstanceIdResponse.data.cores"));
		data.setAliUid(context.longValue("InnerEcsQueryByInstanceIdResponse.data.aliUid"));
		data.setImageId(context.longValue("InnerEcsQueryByInstanceIdResponse.data.imageId"));
		data.setGmtCreated(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.gmtCreated"));
		data.setGroupNo(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.groupNo"));
		data.setVpcInstanceId(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.vpcInstanceId"));
		data.setBid(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.bid"));
		data.setId(context.longValue("InnerEcsQueryByInstanceIdResponse.data.id"));
		data.setAgentId(context.integerValue("InnerEcsQueryByInstanceIdResponse.data.agentId"));
		data.setRealHostname(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.realHostname"));
		data.setInstanceId(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.instanceId"));
		data.setInstanceTypeFamily(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.instanceTypeFamily"));
		data.setNetworkValidation(context.booleanValue("InnerEcsQueryByInstanceIdResponse.data.networkValidation"));
		data.setZoneId(context.longValue("InnerEcsQueryByInstanceIdResponse.data.zoneId"));
		data.setMemory(context.integerValue("InnerEcsQueryByInstanceIdResponse.data.memory"));
		data.setInternetTx(context.integerValue("InnerEcsQueryByInstanceIdResponse.data.internetTx"));
		data.setVswitchInstanceId(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.vswitchInstanceId"));
		data.setImageType(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.imageType"));
		data.setIzId(context.longValue("InnerEcsQueryByInstanceIdResponse.data.izId"));
		data.setDiskSize(context.integerValue("InnerEcsQueryByInstanceIdResponse.data.diskSize"));
		data.setStoppedMode(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.StoppedMode"));
		data.setHpcClusterId(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.hpcClusterId"));
		data.setHpcClusterName(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.hpcClusterName"));
		data.setRdmaIp(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.rdmaIp"));

		Region region = new Region();
		region.setId(context.longValue("InnerEcsQueryByInstanceIdResponse.data.region.id"));
		region.setIsActive(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.isActive"));
		region.setRegionEnName(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.regionEnName"));
		region.setRegionNoAlias(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.regionNoAlias"));
		region.setRegionName(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.regionName"));
		region.setRegionMemo(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.regionMemo"));
		region.setRegionNo(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.regionNo"));

		Attributes attributes = new Attributes();
		attributes.setSupport_image_copy(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.attributes.support_image_copy"));
		attributes.setInternal_use(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.attributes.internal_use"));
		attributes.setAk_name(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.region.attributes.ak_name"));
		region.setAttributes(attributes);
		data.setRegion(region);

		Iz iz = new Iz();
		iz.setRegionNo(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.regionNo"));
		iz.setStatus(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.status"));
		iz.setNo(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.no"));
		iz.setEnName(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.enName"));
		iz.setCnName(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.cnName"));

		List<String> supportedInstanceGenerations = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.supportedInstanceGenerations.Length"); i++) {
			supportedInstanceGenerations.add(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.supportedInstanceGenerations["+ i +"]"));
		}
		iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

		List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.supportedInstanceTypeFamilies.Length"); i++) {
			supportedInstanceTypeFamilies.add(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.supportedInstanceTypeFamilies["+ i +"]"));
		}
		iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

		List<String> supportedInstanceTypeNames = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.supportedInstanceTypeNames.Length"); i++) {
			supportedInstanceTypeNames.add(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.supportedInstanceTypeNames["+ i +"]"));
		}
		iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

		List<IzResourceModelItem> izResourceModel = new ArrayList<IzResourceModelItem>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel.Length"); i++) {
			IzResourceModelItem izResourceModelItem = new IzResourceModelItem();
			izResourceModelItem.setSupportIoOptimized(context.booleanValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportIoOptimized"));

			List<String> allowedResourceCreation = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation.Length"); j++) {
				allowedResourceCreation.add(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation["+ j +"]"));
			}
			izResourceModelItem.setAllowedResourceCreation(allowedResourceCreation);

			List<String> supportedDataDiskCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories.Length"); j++) {
				supportedDataDiskCategories.add(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedDataDiskCategories(supportedDataDiskCategories);

			List<String> supportedInstanceGenerations1 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations1.add(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

			List<String> supportedNetworkCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories.Length"); j++) {
				supportedNetworkCategories.add(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedNetworkCategories(supportedNetworkCategories);

			List<String> supportedSystemDiskCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories.Length"); j++) {
				supportedSystemDiskCategories.add(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

			List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies2.add(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

			List<String> supportedInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes.Length"); j++) {
				supportedInstanceTypes.add(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceTypes(supportedInstanceTypes);

			izResourceModel.add(izResourceModelItem);
		}
		iz.setIzResourceModel(izResourceModel);
		data.setIz(iz);

		Zone zone = new Zone();
		zone.setZoneMemo(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.zone.zoneMemo"));
		zone.setIsWritable(context.booleanValue("InnerEcsQueryByInstanceIdResponse.data.zone.isWritable"));
		zone.setZoneName(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.zone.zoneName"));
		zone.setZoneNoAlias(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.zone.zoneNoAlias"));
		zone.setIsActive(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.zone.isActive"));
		zone.setId(context.longValue("InnerEcsQueryByInstanceIdResponse.data.zone.id"));
		zone.setZoneEnName(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.zone.zoneEnName"));
		zone.setZoneNo(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.zone.zoneNo"));
		zone.setRouteIpSegment(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.zone.routeIpSegment"));
		zone.setRegionId(context.longValue("InnerEcsQueryByInstanceIdResponse.data.zone.regionId"));

		List<String> supportedDeviceCategories = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByInstanceIdResponse.data.zone.supportedDeviceCategories.Length"); i++) {
			supportedDeviceCategories.add(context.stringValue("InnerEcsQueryByInstanceIdResponse.data.zone.supportedDeviceCategories["+ i +"]"));
		}
		zone.setSupportedDeviceCategories(supportedDeviceCategories);
		data.setZone(zone);
		innerEcsQueryByInstanceIdResponse.setData(data);
	 
	 	return innerEcsQueryByInstanceIdResponse;
	}
}