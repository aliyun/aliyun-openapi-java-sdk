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

import com.aliyuncs.ecsinc.model.v20160314.InnerDiskFindDiskByDiskIdResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerDiskFindDiskByDiskIdResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerDiskFindDiskByDiskIdResponse.Data.Tag;
import com.aliyuncs.ecsinc.model.v20160314.InnerDiskFindDiskByDiskIdResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerDiskFindDiskByDiskIdResponseUnmarshaller {

	public static InnerDiskFindDiskByDiskIdResponse unmarshall(InnerDiskFindDiskByDiskIdResponse innerDiskFindDiskByDiskIdResponse, UnmarshallerContext context) {
		
		innerDiskFindDiskByDiskIdResponse.setRequestId(context.stringValue("InnerDiskFindDiskByDiskIdResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerDiskFindDiskByDiskIdResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerDiskFindDiskByDiskIdResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerDiskFindDiskByDiskIdResponse.errorCode.isSuccess"));
		innerDiskFindDiskByDiskIdResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setSeq(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.seq"));
		data.setEnableAutoSnapshot(context.booleanValue("InnerDiskFindDiskByDiskIdResponse.data.enableAutoSnapshot"));
		data.setActive(context.booleanValue("InnerDiskFindDiskByDiskIdResponse.data.active"));
		data.setDiskSize(context.integerValue("InnerDiskFindDiskByDiskIdResponse.data.diskSize"));
		data.setDiskDesc(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.diskDesc"));
		data.setBusinessStatus(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.businessStatus"));
		data.setZoneNo(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.zoneNo"));
		data.setRegionNo(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.regionNo"));
		data.setDiskCategory(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.diskCategory"));
		data.setSnapshotNo(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.snapshotNo"));
		data.setHouyiDiskId(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.houyiDiskId"));
		data.setDiskName(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.diskName"));
		data.setProductCode(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.productCode"));
		data.setMountPoint(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.mountPoint"));
		data.setDeleteAutoSnapshot(context.booleanValue("InnerDiskFindDiskByDiskIdResponse.data.deleteAutoSnapshot"));
		data.setImageNo(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.imageNo"));
		data.setId(context.longValue("InnerDiskFindDiskByDiskIdResponse.data.id"));
		data.setBootable(context.booleanValue("InnerDiskFindDiskByDiskIdResponse.data.bootable"));
		data.setDeleteWithInstance(context.booleanValue("InnerDiskFindDiskByDiskIdResponse.data.deleteWithInstance"));
		data.setDiskType(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.diskType"));
		data.setEcsInstanceId(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.ecsInstanceId"));
		data.setLastAttachTime(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.lastAttachTime"));
		data.setLastDetachTime(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.lastDetachTime"));
		data.setIzNo(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.izNo"));
		data.setPortable(context.booleanValue("InnerDiskFindDiskByDiskIdResponse.data.portable"));
		data.setIopsSize(context.integerValue("InnerDiskFindDiskByDiskIdResponse.data.iopsSize"));
		data.setAutoSnapshotPolicyId(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.autoSnapshotPolicyId"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < context.lengthValue("InnerDiskFindDiskByDiskIdResponse.data.tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.tags["+ i +"].key"));
			tag.setValue(context.stringValue("InnerDiskFindDiskByDiskIdResponse.data.tags["+ i +"].value"));

			tags.add(tag);
		}
		data.setTags(tags);
		innerDiskFindDiskByDiskIdResponse.setData(data);
	 
	 	return innerDiskFindDiskByDiskIdResponse;
	}
}