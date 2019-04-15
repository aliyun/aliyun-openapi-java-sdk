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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsFindByIdResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsFindByIdResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsFindByIdResponse.Data.Iz;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsFindByIdResponse.Data.Iz.IzResourceMode;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsFindByIdResponse.Data.Region;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsFindByIdResponse.Data.Region.Attributes;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsFindByIdResponse.Data.Zone;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsFindByIdResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsFindByIdResponseUnmarshaller {

	public static InnerEcsFindByIdResponse unmarshall(InnerEcsFindByIdResponse innerEcsFindByIdResponse, UnmarshallerContext context) {
		
		innerEcsFindByIdResponse.setRequestId(context.stringValue("InnerEcsFindByIdResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsFindByIdResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsFindByIdResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsFindByIdResponse.errorCode.isSuccess"));
		innerEcsFindByIdResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setInternetIp(context.stringValue("InnerEcsFindByIdResponse.data.internetIp"));
		data.setImageNo(context.stringValue("InnerEcsFindByIdResponse.data.imageNo"));
		data.setDescription(context.stringValue("InnerEcsFindByIdResponse.data.description"));
		data.setEcsBusinessStatus(context.stringValue("InnerEcsFindByIdResponse.data.ecsBusinessStatus"));
		data.setInstanceTypeGeneration(context.stringValue("InnerEcsFindByIdResponse.data.instanceTypeGeneration"));
		data.setIntranetRx(context.integerValue("InnerEcsFindByIdResponse.data.intranetRx"));
		data.setImageProductCode(context.stringValue("InnerEcsFindByIdResponse.data.imageProductCode"));
		data.setSerialNumber(context.stringValue("InnerEcsFindByIdResponse.data.serialNumber"));
		data.setGmtRelease(context.stringValue("InnerEcsFindByIdResponse.data.gmtRelease"));
		data.setIsWin(context.booleanValue("InnerEcsFindByIdResponse.data.isWin"));
		data.setRecoverable(context.booleanValue("InnerEcsFindByIdResponse.data.recoverable"));
		data.setEipInstanceId(context.stringValue("InnerEcsFindByIdResponse.data.eipInstanceId"));
		data.setOsName(context.stringValue("InnerEcsFindByIdResponse.data.osName"));
		data.setIntranetIp(context.stringValue("InnerEcsFindByIdResponse.data.intranetIp"));
		data.setIoOptimized(context.booleanValue("InnerEcsFindByIdResponse.data.ioOptimized"));
		data.setRecoverPolicy(context.stringValue("InnerEcsFindByIdResponse.data.recoverPolicy"));
		data.setNatIp(context.stringValue("InnerEcsFindByIdResponse.data.natIp"));
		data.setInstanceType(context.stringValue("InnerEcsFindByIdResponse.data.instanceType"));
		data.setNetWorkType(context.stringValue("InnerEcsFindByIdResponse.data.netWorkType"));
		data.setHostname(context.stringValue("InnerEcsFindByIdResponse.data.hostname"));
		data.setEipBandwidth(context.integerValue("InnerEcsFindByIdResponse.data.eipBandwidth"));
		data.setOsType(context.stringValue("InnerEcsFindByIdResponse.data.osType"));
		data.setStatus(context.stringValue("InnerEcsFindByIdResponse.data.status"));
		data.setImageName(context.stringValue("InnerEcsFindByIdResponse.data.imageName"));
		data.setInternetRx(context.integerValue("InnerEcsFindByIdResponse.data.internetRx"));
		data.setBid(context.stringValue("InnerEcsFindByIdResponse.data.bid"));
		data.setVpcInstanceId(context.stringValue("InnerEcsFindByIdResponse.data.vpcInstanceId"));
		data.setId(context.longValue("InnerEcsFindByIdResponse.data.id"));
		data.setGroupNo(context.stringValue("InnerEcsFindByIdResponse.data.groupNo"));
		data.setImageId(context.longValue("InnerEcsFindByIdResponse.data.imageId"));
		data.setGmtCreated(context.stringValue("InnerEcsFindByIdResponse.data.gmtCreated"));
		data.setAliUid(context.longValue("InnerEcsFindByIdResponse.data.aliUid"));
		data.setIntranetTx(context.integerValue("InnerEcsFindByIdResponse.data.intranetTx"));
		data.setGmtStarted(context.stringValue("InnerEcsFindByIdResponse.data.gmtStarted"));
		data.setGmtSync(context.stringValue("InnerEcsFindByIdResponse.data.gmtSync"));
		data.setCores(context.integerValue("InnerEcsFindByIdResponse.data.cores"));
		data.setSystemDiskCategory(context.stringValue("InnerEcsFindByIdResponse.data.systemDiskCategory"));
		data.setIopsSize(context.integerValue("InnerEcsFindByIdResponse.data.iopsSize"));
		data.setEip(context.stringValue("InnerEcsFindByIdResponse.data.eip"));
		data.setGmtModified(context.stringValue("InnerEcsFindByIdResponse.data.gmtModified"));
		data.setIzId(context.longValue("InnerEcsFindByIdResponse.data.izId"));
		data.setDiskSize(context.integerValue("InnerEcsFindByIdResponse.data.diskSize"));
		data.setImageType(context.stringValue("InnerEcsFindByIdResponse.data.imageType"));
		data.setInternetTx(context.integerValue("InnerEcsFindByIdResponse.data.internetTx"));
		data.setVswitchInstanceId(context.stringValue("InnerEcsFindByIdResponse.data.vswitchInstanceId"));
		data.setInstanceTypeFamily(context.stringValue("InnerEcsFindByIdResponse.data.instanceTypeFamily"));
		data.setNetworkValidation(context.booleanValue("InnerEcsFindByIdResponse.data.networkValidation"));
		data.setZoneId(context.longValue("InnerEcsFindByIdResponse.data.zoneId"));
		data.setMemory(context.integerValue("InnerEcsFindByIdResponse.data.memory"));
		data.setAgentId(context.integerValue("InnerEcsFindByIdResponse.data.agentId"));
		data.setRealHostname(context.stringValue("InnerEcsFindByIdResponse.data.realHostname"));
		data.setInstanceId(context.stringValue("InnerEcsFindByIdResponse.data.instanceId"));

		Region region = new Region();
		region.setRegionNoAlias(context.stringValue("InnerEcsFindByIdResponse.data.region.regionNoAlias"));
		region.setRegionNo(context.stringValue("InnerEcsFindByIdResponse.data.region.regionNo"));
		region.setRegionName(context.stringValue("InnerEcsFindByIdResponse.data.region.regionName"));
		region.setRegionMemo(context.stringValue("InnerEcsFindByIdResponse.data.region.regionMemo"));
		region.setIsActive(context.stringValue("InnerEcsFindByIdResponse.data.region.isActive"));
		region.setId(context.longValue("InnerEcsFindByIdResponse.data.region.id"));
		region.setRegionEnName(context.stringValue("InnerEcsFindByIdResponse.data.region.regionEnName"));

		Attributes attributes = new Attributes();
		attributes.setSupport_image_copy(context.stringValue("InnerEcsFindByIdResponse.data.region.attributes.support_image_copy"));
		attributes.setInternal_use(context.stringValue("InnerEcsFindByIdResponse.data.region.attributes.internal_use"));
		attributes.setAk_name(context.stringValue("InnerEcsFindByIdResponse.data.region.attributes.ak_name"));
		region.setAttributes(attributes);
		data.setRegion(region);

		Zone zone = new Zone();
		zone.setZoneMemo(context.stringValue("InnerEcsFindByIdResponse.data.zone.zoneMemo"));
		zone.setIsWritable(context.booleanValue("InnerEcsFindByIdResponse.data.zone.isWritable"));
		zone.setZoneName(context.stringValue("InnerEcsFindByIdResponse.data.zone.zoneName"));
		zone.setZoneNoAlias(context.stringValue("InnerEcsFindByIdResponse.data.zone.zoneNoAlias"));
		zone.setIsActive(context.stringValue("InnerEcsFindByIdResponse.data.zone.isActive"));
		zone.setId(context.longValue("InnerEcsFindByIdResponse.data.zone.id"));
		zone.setZoneEnName(context.stringValue("InnerEcsFindByIdResponse.data.zone.zoneEnName"));
		zone.setZoneNo(context.stringValue("InnerEcsFindByIdResponse.data.zone.zoneNo"));
		zone.setRouteIpSegment(context.stringValue("InnerEcsFindByIdResponse.data.zone.routeIpSegment"));
		zone.setRegionId(context.longValue("InnerEcsFindByIdResponse.data.zone.regionId"));

		List<String> supportedDeviceCategories = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsFindByIdResponse.data.zone.supportedDeviceCategories.Length"); i++) {
			supportedDeviceCategories.add(context.stringValue("InnerEcsFindByIdResponse.data.zone.supportedDeviceCategories["+ i +"]"));
		}
		zone.setSupportedDeviceCategories(supportedDeviceCategories);
		data.setZone(zone);

		Iz iz = new Iz();
		iz.setRegionNo(context.stringValue("InnerEcsFindByIdResponse.data.iz.regionNo"));
		iz.setStatus(context.stringValue("InnerEcsFindByIdResponse.data.iz.status"));
		iz.setNo(context.stringValue("InnerEcsFindByIdResponse.data.iz.no"));
		iz.setEnName(context.stringValue("InnerEcsFindByIdResponse.data.iz.enName"));
		iz.setCnName(context.stringValue("InnerEcsFindByIdResponse.data.iz.cnName"));

		List<String> supportedInstanceGenerations = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsFindByIdResponse.data.iz.supportedInstanceGenerations.Length"); i++) {
			supportedInstanceGenerations.add(context.stringValue("InnerEcsFindByIdResponse.data.iz.supportedInstanceGenerations["+ i +"]"));
		}
		iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

		List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsFindByIdResponse.data.iz.supportedInstanceTypeFamilies.Length"); i++) {
			supportedInstanceTypeFamilies.add(context.stringValue("InnerEcsFindByIdResponse.data.iz.supportedInstanceTypeFamilies["+ i +"]"));
		}
		iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

		List<String> supportedInstanceTypeNames = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsFindByIdResponse.data.iz.supportedInstanceTypeNames.Length"); i++) {
			supportedInstanceTypeNames.add(context.stringValue("InnerEcsFindByIdResponse.data.iz.supportedInstanceTypeNames["+ i +"]"));
		}
		iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

		List<IzResourceMode> izResourceModel = new ArrayList<IzResourceMode>();
		for (int i = 0; i < context.lengthValue("InnerEcsFindByIdResponse.data.iz.izResourceModel.Length"); i++) {
			IzResourceMode izResourceMode = new IzResourceMode();
			izResourceMode.setSupportIoOptimized(context.booleanValue("InnerEcsFindByIdResponse.data.iz.izResourceModel["+ i +"].supportIoOptimized"));

			List<String> allowedResourceCreation = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsFindByIdResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation.Length"); j++) {
				allowedResourceCreation.add(context.stringValue("InnerEcsFindByIdResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation["+ j +"]"));
			}
			izResourceMode.setAllowedResourceCreation(allowedResourceCreation);

			List<String> supportedDataDiskCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsFindByIdResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories.Length"); j++) {
				supportedDataDiskCategories.add(context.stringValue("InnerEcsFindByIdResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories["+ j +"]"));
			}
			izResourceMode.setSupportedDataDiskCategories(supportedDataDiskCategories);

			List<String> supportedInstanceGenerations1 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsFindByIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations1.add(context.stringValue("InnerEcsFindByIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations["+ j +"]"));
			}
			izResourceMode.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

			List<String> supportedNetworkCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsFindByIdResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories.Length"); j++) {
				supportedNetworkCategories.add(context.stringValue("InnerEcsFindByIdResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories["+ j +"]"));
			}
			izResourceMode.setSupportedNetworkCategories(supportedNetworkCategories);

			List<String> supportedSystemDiskCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsFindByIdResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories.Length"); j++) {
				supportedSystemDiskCategories.add(context.stringValue("InnerEcsFindByIdResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories["+ j +"]"));
			}
			izResourceMode.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

			List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsFindByIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies2.add(context.stringValue("InnerEcsFindByIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies["+ j +"]"));
			}
			izResourceMode.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

			List<String> supportedInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsFindByIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes.Length"); j++) {
				supportedInstanceTypes.add(context.stringValue("InnerEcsFindByIdResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes["+ j +"]"));
			}
			izResourceMode.setSupportedInstanceTypes(supportedInstanceTypes);

			izResourceModel.add(izResourceMode);
		}
		iz.setIzResourceModel(izResourceModel);
		data.setIz(iz);
		innerEcsFindByIdResponse.setData(data);
	 
	 	return innerEcsFindByIdResponse;
	}
}