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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByInternetIpResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByInternetIpResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByInternetIpResponse.Data.Iz;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByInternetIpResponse.Data.Iz.IzResourceModelItem;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByInternetIpResponse.Data.Region;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByInternetIpResponse.Data.Region.Attributes;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByInternetIpResponse.Data.Zone;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByInternetIpResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsQueryByInternetIpResponseUnmarshaller {

	public static InnerEcsQueryByInternetIpResponse unmarshall(InnerEcsQueryByInternetIpResponse innerEcsQueryByInternetIpResponse, UnmarshallerContext context) {
		
		innerEcsQueryByInternetIpResponse.setRequestId(context.stringValue("InnerEcsQueryByInternetIpResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsQueryByInternetIpResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsQueryByInternetIpResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsQueryByInternetIpResponse.errorCode.isSuccess"));
		innerEcsQueryByInternetIpResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setRecoverable(context.booleanValue("InnerEcsQueryByInternetIpResponse.data.recoverable"));
		data.setEipInstanceId(context.stringValue("InnerEcsQueryByInternetIpResponse.data.eipInstanceId"));
		data.setIsWin(context.booleanValue("InnerEcsQueryByInternetIpResponse.data.isWin"));
		data.setGmtRelease(context.stringValue("InnerEcsQueryByInternetIpResponse.data.gmtRelease"));
		data.setSerialNumber(context.stringValue("InnerEcsQueryByInternetIpResponse.data.serialNumber"));
		data.setInstanceTypeGeneration(context.stringValue("InnerEcsQueryByInternetIpResponse.data.instanceTypeGeneration"));
		data.setIntranetRx(context.integerValue("InnerEcsQueryByInternetIpResponse.data.intranetRx"));
		data.setImageProductCode(context.stringValue("InnerEcsQueryByInternetIpResponse.data.imageProductCode"));
		data.setEcsBusinessStatus(context.stringValue("InnerEcsQueryByInternetIpResponse.data.ecsBusinessStatus"));
		data.setDescription(context.stringValue("InnerEcsQueryByInternetIpResponse.data.description"));
		data.setInternetIp(context.stringValue("InnerEcsQueryByInternetIpResponse.data.internetIp"));
		data.setImageNo(context.stringValue("InnerEcsQueryByInternetIpResponse.data.imageNo"));
		data.setInternetRx(context.integerValue("InnerEcsQueryByInternetIpResponse.data.internetRx"));
		data.setStatus(context.stringValue("InnerEcsQueryByInternetIpResponse.data.status"));
		data.setImageName(context.stringValue("InnerEcsQueryByInternetIpResponse.data.imageName"));
		data.setOsType(context.stringValue("InnerEcsQueryByInternetIpResponse.data.osType"));
		data.setHostname(context.stringValue("InnerEcsQueryByInternetIpResponse.data.hostname"));
		data.setEipBandwidth(context.integerValue("InnerEcsQueryByInternetIpResponse.data.eipBandwidth"));
		data.setNetWorkType(context.stringValue("InnerEcsQueryByInternetIpResponse.data.netWorkType"));
		data.setNatIp(context.stringValue("InnerEcsQueryByInternetIpResponse.data.natIp"));
		data.setInstanceType(context.stringValue("InnerEcsQueryByInternetIpResponse.data.instanceType"));
		data.setRecoverPolicy(context.stringValue("InnerEcsQueryByInternetIpResponse.data.recoverPolicy"));
		data.setIoOptimized(context.booleanValue("InnerEcsQueryByInternetIpResponse.data.ioOptimized"));
		data.setOsName(context.stringValue("InnerEcsQueryByInternetIpResponse.data.osName"));
		data.setIntranetIp(context.stringValue("InnerEcsQueryByInternetIpResponse.data.intranetIp"));
		data.setEip(context.stringValue("InnerEcsQueryByInternetIpResponse.data.eip"));
		data.setGmtModified(context.stringValue("InnerEcsQueryByInternetIpResponse.data.gmtModified"));
		data.setIopsSize(context.integerValue("InnerEcsQueryByInternetIpResponse.data.iopsSize"));
		data.setSystemDiskCategory(context.stringValue("InnerEcsQueryByInternetIpResponse.data.systemDiskCategory"));
		data.setIntranetTx(context.integerValue("InnerEcsQueryByInternetIpResponse.data.intranetTx"));
		data.setGmtStarted(context.stringValue("InnerEcsQueryByInternetIpResponse.data.gmtStarted"));
		data.setGmtSync(context.stringValue("InnerEcsQueryByInternetIpResponse.data.gmtSync"));
		data.setCores(context.integerValue("InnerEcsQueryByInternetIpResponse.data.cores"));
		data.setAliUid(context.longValue("InnerEcsQueryByInternetIpResponse.data.aliUid"));
		data.setImageId(context.longValue("InnerEcsQueryByInternetIpResponse.data.imageId"));
		data.setGmtCreated(context.stringValue("InnerEcsQueryByInternetIpResponse.data.gmtCreated"));
		data.setGroupNo(context.stringValue("InnerEcsQueryByInternetIpResponse.data.groupNo"));
		data.setVpcInstanceId(context.stringValue("InnerEcsQueryByInternetIpResponse.data.vpcInstanceId"));
		data.setBid(context.stringValue("InnerEcsQueryByInternetIpResponse.data.bid"));
		data.setId(context.longValue("InnerEcsQueryByInternetIpResponse.data.id"));
		data.setAgentId(context.integerValue("InnerEcsQueryByInternetIpResponse.data.agentId"));
		data.setRealHostname(context.stringValue("InnerEcsQueryByInternetIpResponse.data.realHostname"));
		data.setInstanceId(context.stringValue("InnerEcsQueryByInternetIpResponse.data.instanceId"));
		data.setInstanceTypeFamily(context.stringValue("InnerEcsQueryByInternetIpResponse.data.instanceTypeFamily"));
		data.setNetworkValidation(context.booleanValue("InnerEcsQueryByInternetIpResponse.data.networkValidation"));
		data.setZoneId(context.longValue("InnerEcsQueryByInternetIpResponse.data.zoneId"));
		data.setMemory(context.integerValue("InnerEcsQueryByInternetIpResponse.data.memory"));
		data.setInternetTx(context.integerValue("InnerEcsQueryByInternetIpResponse.data.internetTx"));
		data.setVswitchInstanceId(context.stringValue("InnerEcsQueryByInternetIpResponse.data.vswitchInstanceId"));
		data.setImageType(context.stringValue("InnerEcsQueryByInternetIpResponse.data.imageType"));
		data.setIzId(context.longValue("InnerEcsQueryByInternetIpResponse.data.izId"));
		data.setDiskSize(context.integerValue("InnerEcsQueryByInternetIpResponse.data.diskSize"));

		Region region = new Region();
		region.setId(context.longValue("InnerEcsQueryByInternetIpResponse.data.region.id"));
		region.setIsActive(context.stringValue("InnerEcsQueryByInternetIpResponse.data.region.isActive"));
		region.setRegionEnName(context.stringValue("InnerEcsQueryByInternetIpResponse.data.region.regionEnName"));
		region.setRegionNoAlias(context.stringValue("InnerEcsQueryByInternetIpResponse.data.region.regionNoAlias"));
		region.setRegionName(context.stringValue("InnerEcsQueryByInternetIpResponse.data.region.regionName"));
		region.setRegionMemo(context.stringValue("InnerEcsQueryByInternetIpResponse.data.region.regionMemo"));
		region.setRegionNo(context.stringValue("InnerEcsQueryByInternetIpResponse.data.region.regionNo"));

		Attributes attributes = new Attributes();
		attributes.setSupport_image_copy(context.stringValue("InnerEcsQueryByInternetIpResponse.data.region.attributes.support_image_copy"));
		attributes.setInternal_use(context.stringValue("InnerEcsQueryByInternetIpResponse.data.region.attributes.internal_use"));
		attributes.setAk_name(context.stringValue("InnerEcsQueryByInternetIpResponse.data.region.attributes.ak_name"));
		region.setAttributes(attributes);
		data.setRegion(region);

		Iz iz = new Iz();
		iz.setRegionNo(context.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.regionNo"));
		iz.setStatus(context.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.status"));
		iz.setNo(context.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.no"));
		iz.setEnName(context.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.enName"));
		iz.setCnName(context.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.cnName"));

		List<String> supportedInstanceGenerations = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.supportedInstanceGenerations.Length"); i++) {
			supportedInstanceGenerations.add(context.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.supportedInstanceGenerations["+ i +"]"));
		}
		iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

		List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.supportedInstanceTypeFamilies.Length"); i++) {
			supportedInstanceTypeFamilies.add(context.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.supportedInstanceTypeFamilies["+ i +"]"));
		}
		iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

		List<String> supportedInstanceTypeNames = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.supportedInstanceTypeNames.Length"); i++) {
			supportedInstanceTypeNames.add(context.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.supportedInstanceTypeNames["+ i +"]"));
		}
		iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

		List<IzResourceModelItem> izResourceModel = new ArrayList<IzResourceModelItem>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel.Length"); i++) {
			IzResourceModelItem izResourceModelItem = new IzResourceModelItem();
			izResourceModelItem.setSupportIoOptimized(context.booleanValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportIoOptimized"));

			List<String> allowedResourceCreation = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation.Length"); j++) {
				allowedResourceCreation.add(context.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation["+ j +"]"));
			}
			izResourceModelItem.setAllowedResourceCreation(allowedResourceCreation);

			List<String> supportedDataDiskCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories.Length"); j++) {
				supportedDataDiskCategories.add(context.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedDataDiskCategories(supportedDataDiskCategories);

			List<String> supportedInstanceGenerations1 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations1.add(context.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

			List<String> supportedNetworkCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories.Length"); j++) {
				supportedNetworkCategories.add(context.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedNetworkCategories(supportedNetworkCategories);

			List<String> supportedSystemDiskCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories.Length"); j++) {
				supportedSystemDiskCategories.add(context.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

			List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies2.add(context.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

			List<String> supportedInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes.Length"); j++) {
				supportedInstanceTypes.add(context.stringValue("InnerEcsQueryByInternetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceTypes(supportedInstanceTypes);

			izResourceModel.add(izResourceModelItem);
		}
		iz.setIzResourceModel(izResourceModel);
		data.setIz(iz);

		Zone zone = new Zone();
		zone.setZoneMemo(context.stringValue("InnerEcsQueryByInternetIpResponse.data.zone.zoneMemo"));
		zone.setIsWritable(context.booleanValue("InnerEcsQueryByInternetIpResponse.data.zone.isWritable"));
		zone.setZoneName(context.stringValue("InnerEcsQueryByInternetIpResponse.data.zone.zoneName"));
		zone.setZoneNoAlias(context.stringValue("InnerEcsQueryByInternetIpResponse.data.zone.zoneNoAlias"));
		zone.setIsActive(context.stringValue("InnerEcsQueryByInternetIpResponse.data.zone.isActive"));
		zone.setId(context.longValue("InnerEcsQueryByInternetIpResponse.data.zone.id"));
		zone.setZoneEnName(context.stringValue("InnerEcsQueryByInternetIpResponse.data.zone.zoneEnName"));
		zone.setZoneNo(context.stringValue("InnerEcsQueryByInternetIpResponse.data.zone.zoneNo"));
		zone.setRouteIpSegment(context.stringValue("InnerEcsQueryByInternetIpResponse.data.zone.routeIpSegment"));
		zone.setRegionId(context.longValue("InnerEcsQueryByInternetIpResponse.data.zone.regionId"));

		List<String> supportedDeviceCategories = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByInternetIpResponse.data.zone.supportedDeviceCategories.Length"); i++) {
			supportedDeviceCategories.add(context.stringValue("InnerEcsQueryByInternetIpResponse.data.zone.supportedDeviceCategories["+ i +"]"));
		}
		zone.setSupportedDeviceCategories(supportedDeviceCategories);
		data.setZone(zone);
		innerEcsQueryByInternetIpResponse.setData(data);
	 
	 	return innerEcsQueryByInternetIpResponse;
	}
}