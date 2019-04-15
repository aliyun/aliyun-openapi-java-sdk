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

import com.aliyuncs.ecsinc.model.v20160314.InnerGroupDetailResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerGroupDetailResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerGroupDetailResponse.Data.Permission;
import com.aliyuncs.ecsinc.model.v20160314.InnerGroupDetailResponse.Data.Tag;
import com.aliyuncs.ecsinc.model.v20160314.InnerGroupDetailResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerGroupDetailResponseUnmarshaller {

	public static InnerGroupDetailResponse unmarshall(InnerGroupDetailResponse innerGroupDetailResponse, UnmarshallerContext context) {
		
		innerGroupDetailResponse.setRequestId(context.stringValue("InnerGroupDetailResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerGroupDetailResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerGroupDetailResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerGroupDetailResponse.errorCode.isSuccess"));
		innerGroupDetailResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setEcsCount(context.integerValue("InnerGroupDetailResponse.data.ecsCount"));
		data.setVpcInstanceId(context.stringValue("InnerGroupDetailResponse.data.vpcInstanceId"));
		data.setGroupDesc(context.stringValue("InnerGroupDetailResponse.data.groupDesc"));
		data.setRegionNo(context.stringValue("InnerGroupDetailResponse.data.regionNo"));
		data.setGroupName(context.stringValue("InnerGroupDetailResponse.data.groupName"));
		data.setGmtCreated(context.stringValue("InnerGroupDetailResponse.data.gmtCreated"));
		data.setGroupNo(context.stringValue("InnerGroupDetailResponse.data.groupNo"));
		data.setGmtModified(context.stringValue("InnerGroupDetailResponse.data.gmtModified"));

		List<Permission> permissions = new ArrayList<Permission>();
		for (int i = 0; i < context.lengthValue("InnerGroupDetailResponse.data.permissions.Length"); i++) {
			Permission permission = new Permission();
			permission.setPortRange(context.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].portRange"));
			permission.setDestCidrIp(context.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].destCidrIp"));
			permission.setDirection(context.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].direction"));
			permission.setNic(context.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].nic"));
			permission.setSourceGroupOwnerUserAccount(context.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].sourceGroupOwnerUserAccount"));
			permission.setPolicy(context.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].policy"));
			permission.setIpProtocal(context.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].ipProtocal"));
			permission.setDestGroupNo(context.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].destGroupNo"));
			permission.setDestGroupOwnerUserAccount(context.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].destGroupOwnerUserAccount"));
			permission.setSourceGroupNo(context.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].sourceGroupNo"));
			permission.setLevel(context.integerValue("InnerGroupDetailResponse.data.permissions["+ i +"].level"));
			permission.setSourceCidrIp(context.stringValue("InnerGroupDetailResponse.data.permissions["+ i +"].sourceCidrIp"));

			permissions.add(permission);
		}
		data.setPermissions(permissions);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < context.lengthValue("InnerGroupDetailResponse.data.tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(context.stringValue("InnerGroupDetailResponse.data.tags["+ i +"].key"));
			tag.setValue(context.stringValue("InnerGroupDetailResponse.data.tags["+ i +"].value"));

			tags.add(tag);
		}
		data.setTags(tags);
		innerGroupDetailResponse.setData(data);
	 
	 	return innerGroupDetailResponse;
	}
}