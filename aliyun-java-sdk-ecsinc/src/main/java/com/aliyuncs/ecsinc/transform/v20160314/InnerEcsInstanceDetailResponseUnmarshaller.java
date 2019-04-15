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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceDetailResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceDetailResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceDetailResponse.Data.Group;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceDetailResponse.Data.Img;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceDetailResponse.Data.PublicIp;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceDetailResponse.Data.Tag;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceDetailResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsInstanceDetailResponseUnmarshaller {

	public static InnerEcsInstanceDetailResponse unmarshall(InnerEcsInstanceDetailResponse innerEcsInstanceDetailResponse, UnmarshallerContext context) {
		
		innerEcsInstanceDetailResponse.setRequestId(context.stringValue("InnerEcsInstanceDetailResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsInstanceDetailResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsInstanceDetailResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsInstanceDetailResponse.errorCode.isSuccess"));
		innerEcsInstanceDetailResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setInternetTx(context.integerValue("InnerEcsInstanceDetailResponse.data.internetTx"));
		data.setVswitchInstanceId(context.stringValue("InnerEcsInstanceDetailResponse.data.vswitchInstanceId"));
		data.setInstanceTypeFamily(context.stringValue("InnerEcsInstanceDetailResponse.data.instanceTypeFamily"));
		data.setNetworkValidation(context.booleanValue("InnerEcsInstanceDetailResponse.data.networkValidation"));
		data.setRegionNo(context.stringValue("InnerEcsInstanceDetailResponse.data.regionNo"));
		data.setInstanceName(context.stringValue("InnerEcsInstanceDetailResponse.data.instanceName"));
		data.setBusinessStatus(context.stringValue("InnerEcsInstanceDetailResponse.data.businessStatus"));
		data.setEip(context.stringValue("InnerEcsInstanceDetailResponse.data.eip"));
		data.setAliUid(context.longValue("InnerEcsInstanceDetailResponse.data.aliUid"));
		data.setHouyiStatus(context.stringValue("InnerEcsInstanceDetailResponse.data.houyiStatus"));
		data.setIntranetTx(context.integerValue("InnerEcsInstanceDetailResponse.data.intranetTx"));
		data.setCores(context.integerValue("InnerEcsInstanceDetailResponse.data.cores"));
		data.setInnerIp(context.stringValue("InnerEcsInstanceDetailResponse.data.innerIp"));
		data.setEcsName(context.stringValue("InnerEcsInstanceDetailResponse.data.ecsName"));
		data.setBps(context.integerValue("InnerEcsInstanceDetailResponse.data.bps"));
		data.setVpcInstanceId(context.stringValue("InnerEcsInstanceDetailResponse.data.vpcInstanceId"));
		data.setId(context.longValue("InnerEcsInstanceDetailResponse.data.id"));
		data.setBid(context.stringValue("InnerEcsInstanceDetailResponse.data.bid"));
		data.setMem(context.integerValue("InnerEcsInstanceDetailResponse.data.mem"));
		data.setStatus(context.stringValue("InnerEcsInstanceDetailResponse.data.status"));
		data.setInternetRx(context.integerValue("InnerEcsInstanceDetailResponse.data.internetRx"));
		data.setHostname(context.stringValue("InnerEcsInstanceDetailResponse.data.hostname"));
		data.setEipBandwidth(context.integerValue("InnerEcsInstanceDetailResponse.data.eipBandwidth"));
		data.setZoneNo(context.stringValue("InnerEcsInstanceDetailResponse.data.zoneNo"));
		data.setNatIp(context.stringValue("InnerEcsInstanceDetailResponse.data.natIp"));
		data.setInstanceType(context.stringValue("InnerEcsInstanceDetailResponse.data.instanceType"));
		data.setNetWorkType(context.stringValue("InnerEcsInstanceDetailResponse.data.netWorkType"));
		data.setDeviceAvailable(context.booleanValue("InnerEcsInstanceDetailResponse.data.deviceAvailable"));
		data.setIoOptimized(context.booleanValue("InnerEcsInstanceDetailResponse.data.ioOptimized"));
		data.setSystemDeviceCategory(context.stringValue("InnerEcsInstanceDetailResponse.data.systemDeviceCategory"));
		data.setDisk(context.integerValue("InnerEcsInstanceDetailResponse.data.disk"));
		data.setSecurityControl(context.stringValue("InnerEcsInstanceDetailResponse.data.securityControl"));
		data.setEipInstanceId(context.stringValue("InnerEcsInstanceDetailResponse.data.eipInstanceId"));
		data.setIntranetRx(context.integerValue("InnerEcsInstanceDetailResponse.data.intranetRx"));
		data.setIzNo(context.stringValue("InnerEcsInstanceDetailResponse.data.izNo"));
		data.setSerialNumber(context.stringValue("InnerEcsInstanceDetailResponse.data.serialNumber"));
		data.setRealZoneNo(context.stringValue("InnerEcsInstanceDetailResponse.data.realZoneNo"));
		data.setDescription(context.stringValue("InnerEcsInstanceDetailResponse.data.description"));
		data.setCreationTime(context.stringValue("InnerEcsInstanceDetailResponse.data.creationTime"));

		PublicIp publicIp = new PublicIp();
		publicIp.setAssignIp(context.stringValue("InnerEcsInstanceDetailResponse.data.publicIp.assignIp"));
		publicIp.setBindIp(context.stringValue("InnerEcsInstanceDetailResponse.data.publicIp.bindIp"));
		publicIp.setAssignNatIp(context.stringValue("InnerEcsInstanceDetailResponse.data.publicIp.assignNatIp"));
		data.setPublicIp(publicIp);

		Img img = new Img();
		img.setName(context.stringValue("InnerEcsInstanceDetailResponse.data.img.name"));
		img.setImageNo(context.stringValue("InnerEcsInstanceDetailResponse.data.img.imageNo"));
		data.setImg(img);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < context.lengthValue("InnerEcsInstanceDetailResponse.data.tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(context.stringValue("InnerEcsInstanceDetailResponse.data.tags["+ i +"].key"));
			tag.setValue(context.stringValue("InnerEcsInstanceDetailResponse.data.tags["+ i +"].value"));

			tags.add(tag);
		}
		data.setTags(tags);

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < context.lengthValue("InnerEcsInstanceDetailResponse.data.groups.Length"); i++) {
			Group group = new Group();
			group.setGroupDesc(context.stringValue("InnerEcsInstanceDetailResponse.data.groups["+ i +"].groupDesc"));
			group.setGroupNo(context.stringValue("InnerEcsInstanceDetailResponse.data.groups["+ i +"].groupNo"));
			group.setGroupName(context.stringValue("InnerEcsInstanceDetailResponse.data.groups["+ i +"].groupName"));

			groups.add(group);
		}
		data.setGroups(groups);
		innerEcsInstanceDetailResponse.setData(data);
	 
	 	return innerEcsInstanceDetailResponse;
	}
}