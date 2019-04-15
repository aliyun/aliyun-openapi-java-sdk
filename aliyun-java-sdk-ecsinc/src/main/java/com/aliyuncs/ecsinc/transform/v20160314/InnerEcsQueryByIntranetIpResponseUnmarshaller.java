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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByIntranetIpResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByIntranetIpResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByIntranetIpResponse.Data.Iz;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByIntranetIpResponse.Data.Iz.IzResourceModelItem;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByIntranetIpResponse.Data.Region;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByIntranetIpResponse.Data.Region.Attributes;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByIntranetIpResponse.Data.Zone;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQueryByIntranetIpResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsQueryByIntranetIpResponseUnmarshaller {

	public static InnerEcsQueryByIntranetIpResponse unmarshall(InnerEcsQueryByIntranetIpResponse innerEcsQueryByIntranetIpResponse, UnmarshallerContext context) {
		
		innerEcsQueryByIntranetIpResponse.setRequestId(context.stringValue("InnerEcsQueryByIntranetIpResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsQueryByIntranetIpResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsQueryByIntranetIpResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsQueryByIntranetIpResponse.errorCode.isSuccess"));
		innerEcsQueryByIntranetIpResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setRecoverable(context.booleanValue("InnerEcsQueryByIntranetIpResponse.data.recoverable"));
		data.setEipInstanceId(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.eipInstanceId"));
		data.setIsWin(context.booleanValue("InnerEcsQueryByIntranetIpResponse.data.isWin"));
		data.setGmtRelease(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.gmtRelease"));
		data.setSerialNumber(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.serialNumber"));
		data.setInstanceTypeGeneration(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.instanceTypeGeneration"));
		data.setIntranetRx(context.integerValue("InnerEcsQueryByIntranetIpResponse.data.intranetRx"));
		data.setImageProductCode(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.imageProductCode"));
		data.setEcsBusinessStatus(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.ecsBusinessStatus"));
		data.setDescription(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.description"));
		data.setInternetIp(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.internetIp"));
		data.setImageNo(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.imageNo"));
		data.setInternetRx(context.integerValue("InnerEcsQueryByIntranetIpResponse.data.internetRx"));
		data.setStatus(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.status"));
		data.setImageName(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.imageName"));
		data.setOsType(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.osType"));
		data.setHostname(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.hostname"));
		data.setEipBandwidth(context.integerValue("InnerEcsQueryByIntranetIpResponse.data.eipBandwidth"));
		data.setNetWorkType(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.netWorkType"));
		data.setNatIp(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.natIp"));
		data.setInstanceType(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.instanceType"));
		data.setRecoverPolicy(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.recoverPolicy"));
		data.setIoOptimized(context.booleanValue("InnerEcsQueryByIntranetIpResponse.data.ioOptimized"));
		data.setOsName(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.osName"));
		data.setIntranetIp(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.intranetIp"));
		data.setEip(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.eip"));
		data.setGmtModified(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.gmtModified"));
		data.setIopsSize(context.integerValue("InnerEcsQueryByIntranetIpResponse.data.iopsSize"));
		data.setSystemDiskCategory(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.systemDiskCategory"));
		data.setIntranetTx(context.integerValue("InnerEcsQueryByIntranetIpResponse.data.intranetTx"));
		data.setGmtStarted(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.gmtStarted"));
		data.setGmtSync(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.gmtSync"));
		data.setCores(context.integerValue("InnerEcsQueryByIntranetIpResponse.data.cores"));
		data.setAliUid(context.longValue("InnerEcsQueryByIntranetIpResponse.data.aliUid"));
		data.setImageId(context.longValue("InnerEcsQueryByIntranetIpResponse.data.imageId"));
		data.setGmtCreated(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.gmtCreated"));
		data.setGroupNo(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.groupNo"));
		data.setVpcInstanceId(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.vpcInstanceId"));
		data.setBid(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.bid"));
		data.setId(context.longValue("InnerEcsQueryByIntranetIpResponse.data.id"));
		data.setAgentId(context.integerValue("InnerEcsQueryByIntranetIpResponse.data.agentId"));
		data.setRealHostname(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.realHostname"));
		data.setInstanceId(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.instanceId"));
		data.setInstanceTypeFamily(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.instanceTypeFamily"));
		data.setNetworkValidation(context.booleanValue("InnerEcsQueryByIntranetIpResponse.data.networkValidation"));
		data.setZoneId(context.longValue("InnerEcsQueryByIntranetIpResponse.data.zoneId"));
		data.setMemory(context.integerValue("InnerEcsQueryByIntranetIpResponse.data.memory"));
		data.setInternetTx(context.integerValue("InnerEcsQueryByIntranetIpResponse.data.internetTx"));
		data.setVswitchInstanceId(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.vswitchInstanceId"));
		data.setImageType(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.imageType"));
		data.setIzId(context.longValue("InnerEcsQueryByIntranetIpResponse.data.izId"));
		data.setDiskSize(context.integerValue("InnerEcsQueryByIntranetIpResponse.data.diskSize"));

		Region region = new Region();
		region.setId(context.longValue("InnerEcsQueryByIntranetIpResponse.data.region.id"));
		region.setIsActive(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.isActive"));
		region.setRegionEnName(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.regionEnName"));
		region.setRegionNoAlias(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.regionNoAlias"));
		region.setRegionName(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.regionName"));
		region.setRegionMemo(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.regionMemo"));
		region.setRegionNo(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.regionNo"));

		Attributes attributes = new Attributes();
		attributes.setSupport_image_copy(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.attributes.support_image_copy"));
		attributes.setInternal_use(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.attributes.internal_use"));
		attributes.setAk_name(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.region.attributes.ak_name"));
		region.setAttributes(attributes);
		data.setRegion(region);

		Iz iz = new Iz();
		iz.setRegionNo(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.regionNo"));
		iz.setStatus(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.status"));
		iz.setNo(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.no"));
		iz.setEnName(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.enName"));
		iz.setCnName(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.cnName"));

		List<String> supportedInstanceGenerations = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.supportedInstanceGenerations.Length"); i++) {
			supportedInstanceGenerations.add(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.supportedInstanceGenerations["+ i +"]"));
		}
		iz.setSupportedInstanceGenerations(supportedInstanceGenerations);

		List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.supportedInstanceTypeFamilies.Length"); i++) {
			supportedInstanceTypeFamilies.add(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.supportedInstanceTypeFamilies["+ i +"]"));
		}
		iz.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

		List<String> supportedInstanceTypeNames = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.supportedInstanceTypeNames.Length"); i++) {
			supportedInstanceTypeNames.add(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.supportedInstanceTypeNames["+ i +"]"));
		}
		iz.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

		List<IzResourceModelItem> izResourceModel = new ArrayList<IzResourceModelItem>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel.Length"); i++) {
			IzResourceModelItem izResourceModelItem = new IzResourceModelItem();
			izResourceModelItem.setSupportIoOptimized(context.booleanValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportIoOptimized"));

			List<String> allowedResourceCreation = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation.Length"); j++) {
				allowedResourceCreation.add(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].allowedResourceCreation["+ j +"]"));
			}
			izResourceModelItem.setAllowedResourceCreation(allowedResourceCreation);

			List<String> supportedDataDiskCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories.Length"); j++) {
				supportedDataDiskCategories.add(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedDataDiskCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedDataDiskCategories(supportedDataDiskCategories);

			List<String> supportedInstanceGenerations1 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations1.add(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceGenerations["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

			List<String> supportedNetworkCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories.Length"); j++) {
				supportedNetworkCategories.add(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedNetworkCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedNetworkCategories(supportedNetworkCategories);

			List<String> supportedSystemDiskCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories.Length"); j++) {
				supportedSystemDiskCategories.add(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedSystemDiskCategories["+ j +"]"));
			}
			izResourceModelItem.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

			List<String> supportedInstanceTypeFamilies2 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies2.add(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypeFamilies["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceTypeFamilies2(supportedInstanceTypeFamilies2);

			List<String> supportedInstanceTypes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes.Length"); j++) {
				supportedInstanceTypes.add(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.iz.izResourceModel["+ i +"].supportedInstanceTypes["+ j +"]"));
			}
			izResourceModelItem.setSupportedInstanceTypes(supportedInstanceTypes);

			izResourceModel.add(izResourceModelItem);
		}
		iz.setIzResourceModel(izResourceModel);
		data.setIz(iz);

		Zone zone = new Zone();
		zone.setZoneMemo(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.zone.zoneMemo"));
		zone.setIsWritable(context.booleanValue("InnerEcsQueryByIntranetIpResponse.data.zone.isWritable"));
		zone.setZoneName(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.zone.zoneName"));
		zone.setZoneNoAlias(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.zone.zoneNoAlias"));
		zone.setIsActive(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.zone.isActive"));
		zone.setId(context.longValue("InnerEcsQueryByIntranetIpResponse.data.zone.id"));
		zone.setZoneEnName(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.zone.zoneEnName"));
		zone.setZoneNo(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.zone.zoneNo"));
		zone.setRouteIpSegment(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.zone.routeIpSegment"));
		zone.setRegionId(context.longValue("InnerEcsQueryByIntranetIpResponse.data.zone.regionId"));

		List<String> supportedDeviceCategories = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerEcsQueryByIntranetIpResponse.data.zone.supportedDeviceCategories.Length"); i++) {
			supportedDeviceCategories.add(context.stringValue("InnerEcsQueryByIntranetIpResponse.data.zone.supportedDeviceCategories["+ i +"]"));
		}
		zone.setSupportedDeviceCategories(supportedDeviceCategories);
		data.setZone(zone);
		innerEcsQueryByIntranetIpResponse.setData(data);
	 
	 	return innerEcsQueryByIntranetIpResponse;
	}
}