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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceQueryByParamResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceQueryByParamResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceQueryByParamResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceQueryByParamResponse.Item.Group;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceQueryByParamResponse.Item.Img;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceQueryByParamResponse.Item.PublicIp;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsInstanceQueryByParamResponse.Item.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsInstanceQueryByParamResponseUnmarshaller {

	public static InnerEcsInstanceQueryByParamResponse unmarshall(InnerEcsInstanceQueryByParamResponse innerEcsInstanceQueryByParamResponse, UnmarshallerContext context) {
		
		innerEcsInstanceQueryByParamResponse.setRequestId(context.stringValue("InnerEcsInstanceQueryByParamResponse.RequestId"));
		innerEcsInstanceQueryByParamResponse.setCount(context.integerValue("InnerEcsInstanceQueryByParamResponse.count"));
		innerEcsInstanceQueryByParamResponse.setPageNo(context.integerValue("InnerEcsInstanceQueryByParamResponse.pageNo"));
		innerEcsInstanceQueryByParamResponse.setPageSize(context.integerValue("InnerEcsInstanceQueryByParamResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsInstanceQueryByParamResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsInstanceQueryByParamResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsInstanceQueryByParamResponse.errorCode.isSuccess"));
		innerEcsInstanceQueryByParamResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerEcsInstanceQueryByParamResponse.data.Length"); i++) {
			Item item = new Item();
			item.setInternetTx(context.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].internetTx"));
			item.setVswitchInstanceId(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].vswitchInstanceId"));
			item.setInstanceTypeFamily(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].instanceTypeFamily"));
			item.setNetworkValidation(context.booleanValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].networkValidation"));
			item.setRegionNo(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].regionNo"));
			item.setInstanceName(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].instanceName"));
			item.setBusinessStatus(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].businessStatus"));
			item.setEip(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].eip"));
			item.setAliUid(context.longValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].aliUid"));
			item.setHouyiStatus(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].houyiStatus"));
			item.setIntranetTx(context.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].intranetTx"));
			item.setCores(context.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].cores"));
			item.setInnerIp(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].innerIp"));
			item.setEcsName(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].ecsName"));
			item.setBps(context.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].bps"));
			item.setVpcInstanceId(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].vpcInstanceId"));
			item.setId(context.longValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].id"));
			item.setBid(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].bid"));
			item.setMem(context.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].mem"));
			item.setStatus(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].status"));
			item.setInternetRx(context.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].internetRx"));
			item.setHostname(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].hostname"));
			item.setEipBandwidth(context.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].eipBandwidth"));
			item.setZoneNo(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].zoneNo"));
			item.setNatIp(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].natIp"));
			item.setInstanceType(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].instanceType"));
			item.setNetWorkType(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].netWorkType"));
			item.setDeviceAvailable(context.booleanValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].deviceAvailable"));
			item.setIoOptimized(context.booleanValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].ioOptimized"));
			item.setSystemDeviceCategory(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].systemDeviceCategory"));
			item.setDisk(context.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].disk"));
			item.setSecurityControl(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].securityControl"));
			item.setEipInstanceId(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].eipInstanceId"));
			item.setIntranetRx(context.integerValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].intranetRx"));
			item.setIzNo(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].izNo"));
			item.setSerialNumber(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].serialNumber"));
			item.setRealZoneNo(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].realZoneNo"));
			item.setDescription(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].description"));
			item.setCreationTime(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].creationTime"));

			PublicIp publicIp = new PublicIp();
			publicIp.setAssignIp(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].publicIp.assignIp"));
			publicIp.setBindIp(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].publicIp.bindIp"));
			publicIp.setAssignNatIp(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].publicIp.assignNatIp"));
			item.setPublicIp(publicIp);

			Img img = new Img();
			img.setName(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].img.name"));
			img.setImageNo(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].img.imageNo"));
			item.setImg(img);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].tags["+ j +"].key"));
				tag.setValue(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].tags["+ j +"].value"));

				tags.add(tag);
			}
			item.setTags(tags);

			List<Group> groups = new ArrayList<Group>();
			for (int j = 0; j < context.lengthValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].groups.Length"); j++) {
				Group group = new Group();
				group.setGroupDesc(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].groups["+ j +"].groupDesc"));
				group.setGroupNo(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].groups["+ j +"].groupNo"));
				group.setGroupName(context.stringValue("InnerEcsInstanceQueryByParamResponse.data["+ i +"].groups["+ j +"].groupName"));

				groups.add(group);
			}
			item.setGroups(groups);

			data.add(item);
		}
		innerEcsInstanceQueryByParamResponse.setData(data);
	 
	 	return innerEcsInstanceQueryByParamResponse;
	}
}