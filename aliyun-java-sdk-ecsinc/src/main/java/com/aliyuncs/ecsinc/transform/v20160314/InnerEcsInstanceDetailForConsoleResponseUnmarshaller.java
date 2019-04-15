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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceDetailForConsoleResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceDetailForConsoleResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceDetailForConsoleResponse.Data.Group;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceDetailForConsoleResponse.Data.Img;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceDetailForConsoleResponse.Data.PublicIp;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceDetailForConsoleResponse.Data.Tag;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceDetailForConsoleResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsInstanceDetailForConsoleResponseUnmarshaller {

	public static InnerEcsInstanceDetailForConsoleResponse unmarshall(InnerEcsInstanceDetailForConsoleResponse innerEcsInstanceDetailForConsoleResponse, UnmarshallerContext context) {
		
		innerEcsInstanceDetailForConsoleResponse.setRequestId(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsInstanceDetailForConsoleResponse.errorCode.isSuccess"));
		innerEcsInstanceDetailForConsoleResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setInternetTx(context.integerValue("InnerEcsInstanceDetailForConsoleResponse.data.internetTx"));
		data.setVswitchInstanceId(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.vswitchInstanceId"));
		data.setInstanceTypeFamily(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.instanceTypeFamily"));
		data.setNetworkValidation(context.booleanValue("InnerEcsInstanceDetailForConsoleResponse.data.networkValidation"));
		data.setRegionNo(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.regionNo"));
		data.setInstanceName(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.instanceName"));
		data.setBusinessStatus(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.businessStatus"));
		data.setEip(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.eip"));
		data.setAliUid(context.longValue("InnerEcsInstanceDetailForConsoleResponse.data.aliUid"));
		data.setHouyiStatus(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.houyiStatus"));
		data.setIntranetTx(context.integerValue("InnerEcsInstanceDetailForConsoleResponse.data.intranetTx"));
		data.setCores(context.integerValue("InnerEcsInstanceDetailForConsoleResponse.data.cores"));
		data.setInnerIp(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.innerIp"));
		data.setEcsName(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.ecsName"));
		data.setBps(context.integerValue("InnerEcsInstanceDetailForConsoleResponse.data.bps"));
		data.setVpcInstanceId(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.vpcInstanceId"));
		data.setId(context.longValue("InnerEcsInstanceDetailForConsoleResponse.data.id"));
		data.setBid(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.bid"));
		data.setMem(context.integerValue("InnerEcsInstanceDetailForConsoleResponse.data.mem"));
		data.setStatus(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.status"));
		data.setInternetRx(context.integerValue("InnerEcsInstanceDetailForConsoleResponse.data.internetRx"));
		data.setHostname(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.hostname"));
		data.setEipBandwidth(context.integerValue("InnerEcsInstanceDetailForConsoleResponse.data.eipBandwidth"));
		data.setZoneNo(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.zoneNo"));
		data.setNatIp(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.natIp"));
		data.setInstanceType(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.instanceType"));
		data.setNetWorkType(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.netWorkType"));
		data.setDeviceAvailable(context.booleanValue("InnerEcsInstanceDetailForConsoleResponse.data.deviceAvailable"));
		data.setIoOptimized(context.booleanValue("InnerEcsInstanceDetailForConsoleResponse.data.ioOptimized"));
		data.setSystemDeviceCategory(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.systemDeviceCategory"));
		data.setDisk(context.integerValue("InnerEcsInstanceDetailForConsoleResponse.data.disk"));
		data.setSecurityControl(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.securityControl"));
		data.setEipInstanceId(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.eipInstanceId"));
		data.setIntranetRx(context.integerValue("InnerEcsInstanceDetailForConsoleResponse.data.intranetRx"));
		data.setIzNo(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.izNo"));
		data.setSerialNumber(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.serialNumber"));
		data.setRealZoneNo(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.realZoneNo"));
		data.setDescription(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.description"));
		data.setCreationTime(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.creationTime"));

		PublicIp publicIp = new PublicIp();
		publicIp.setAssignIp(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.publicIp.assignIp"));
		publicIp.setBindIp(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.publicIp.bindIp"));
		publicIp.setAssignNatIp(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.publicIp.assignNatIp"));
		data.setPublicIp(publicIp);

		Img img = new Img();
		img.setName(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.img.name"));
		img.setImageNo(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.img.imageNo"));
		data.setImg(img);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < context.lengthValue("InnerEcsInstanceDetailForConsoleResponse.data.tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.tags["+ i +"].key"));
			tag.setValue(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.tags["+ i +"].value"));

			tags.add(tag);
		}
		data.setTags(tags);

		List<Group> groups = new ArrayList<Group>();
		for (int i = 0; i < context.lengthValue("InnerEcsInstanceDetailForConsoleResponse.data.groups.Length"); i++) {
			Group group = new Group();
			group.setGroupDesc(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.groups["+ i +"].groupDesc"));
			group.setGroupNo(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.groups["+ i +"].groupNo"));
			group.setGroupName(context.stringValue("InnerEcsInstanceDetailForConsoleResponse.data.groups["+ i +"].groupName"));

			groups.add(group);
		}
		data.setGroups(groups);
		innerEcsInstanceDetailForConsoleResponse.setData(data);
	 
	 	return innerEcsInstanceDetailForConsoleResponse;
	}
}