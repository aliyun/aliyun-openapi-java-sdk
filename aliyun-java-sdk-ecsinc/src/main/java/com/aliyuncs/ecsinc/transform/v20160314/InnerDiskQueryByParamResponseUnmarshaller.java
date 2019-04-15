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

import com.aliyuncs.ecsinc.model.v20160314.InnerDiskQueryByParamResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerDiskQueryByParamResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerDiskQueryByParamResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerDiskQueryByParamResponse.Item.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerDiskQueryByParamResponseUnmarshaller {

	public static InnerDiskQueryByParamResponse unmarshall(InnerDiskQueryByParamResponse innerDiskQueryByParamResponse, UnmarshallerContext context) {
		
		innerDiskQueryByParamResponse.setRequestId(context.stringValue("InnerDiskQueryByParamResponse.RequestId"));
		innerDiskQueryByParamResponse.setCount(context.integerValue("InnerDiskQueryByParamResponse.count"));
		innerDiskQueryByParamResponse.setPageNo(context.integerValue("InnerDiskQueryByParamResponse.pageNo"));
		innerDiskQueryByParamResponse.setPageSize(context.integerValue("InnerDiskQueryByParamResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerDiskQueryByParamResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerDiskQueryByParamResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerDiskQueryByParamResponse.errorCode.isSuccess"));
		innerDiskQueryByParamResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerDiskQueryByParamResponse.data.Length"); i++) {
			Item item = new Item();
			item.setSeq(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].seq"));
			item.setEnableAutoSnapshot(context.booleanValue("InnerDiskQueryByParamResponse.data["+ i +"].enableAutoSnapshot"));
			item.setActive(context.booleanValue("InnerDiskQueryByParamResponse.data["+ i +"].active"));
			item.setDiskSize(context.integerValue("InnerDiskQueryByParamResponse.data["+ i +"].diskSize"));
			item.setDiskDesc(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].diskDesc"));
			item.setBusinessStatus(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].businessStatus"));
			item.setZoneNo(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].zoneNo"));
			item.setRegionNo(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].regionNo"));
			item.setDiskCategory(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].diskCategory"));
			item.setSnapshotNo(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].snapshotNo"));
			item.setHouyiDiskId(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].houyiDiskId"));
			item.setDiskName(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].diskName"));
			item.setProductCode(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].productCode"));
			item.setMountPoint(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].mountPoint"));
			item.setDeleteAutoSnapshot(context.booleanValue("InnerDiskQueryByParamResponse.data["+ i +"].deleteAutoSnapshot"));
			item.setImageNo(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].imageNo"));
			item.setId(context.longValue("InnerDiskQueryByParamResponse.data["+ i +"].id"));
			item.setBootable(context.booleanValue("InnerDiskQueryByParamResponse.data["+ i +"].bootable"));
			item.setDeleteWithInstance(context.booleanValue("InnerDiskQueryByParamResponse.data["+ i +"].deleteWithInstance"));
			item.setDiskType(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].diskType"));
			item.setEcsInstanceId(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].ecsInstanceId"));
			item.setLastAttachTime(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].lastAttachTime"));
			item.setLastDetachTime(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].lastDetachTime"));
			item.setIzNo(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].izNo"));
			item.setPortable(context.booleanValue("InnerDiskQueryByParamResponse.data["+ i +"].portable"));
			item.setIopsSize(context.integerValue("InnerDiskQueryByParamResponse.data["+ i +"].iopsSize"));
			item.setAutoSnapshotPolicyId(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].autoSnapshotPolicyId"));
			item.setInstanceId(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].instanceId"));
			item.setStatus(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].status"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("InnerDiskQueryByParamResponse.data["+ i +"].tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].tags["+ j +"].key"));
				tag.setValue(context.stringValue("InnerDiskQueryByParamResponse.data["+ i +"].tags["+ j +"].value"));

				tags.add(tag);
			}
			item.setTags(tags);

			data.add(item);
		}
		innerDiskQueryByParamResponse.setData(data);
	 
	 	return innerDiskQueryByParamResponse;
	}
}