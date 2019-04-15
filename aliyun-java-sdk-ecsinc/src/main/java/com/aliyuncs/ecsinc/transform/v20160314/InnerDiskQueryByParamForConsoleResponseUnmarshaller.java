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

import com.aliyuncs.ecsinc.model.v20160314.InnerDiskQueryByParamForConsoleResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerDiskQueryByParamForConsoleResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerDiskQueryByParamForConsoleResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerDiskQueryByParamForConsoleResponse.Item.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerDiskQueryByParamForConsoleResponseUnmarshaller {

	public static InnerDiskQueryByParamForConsoleResponse unmarshall(InnerDiskQueryByParamForConsoleResponse innerDiskQueryByParamForConsoleResponse, UnmarshallerContext context) {
		
		innerDiskQueryByParamForConsoleResponse.setRequestId(context.stringValue("InnerDiskQueryByParamForConsoleResponse.RequestId"));
		innerDiskQueryByParamForConsoleResponse.setCount(context.integerValue("InnerDiskQueryByParamForConsoleResponse.count"));
		innerDiskQueryByParamForConsoleResponse.setPageNo(context.integerValue("InnerDiskQueryByParamForConsoleResponse.pageNo"));
		innerDiskQueryByParamForConsoleResponse.setPageSize(context.integerValue("InnerDiskQueryByParamForConsoleResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerDiskQueryByParamForConsoleResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerDiskQueryByParamForConsoleResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerDiskQueryByParamForConsoleResponse.errorCode.isSuccess"));
		innerDiskQueryByParamForConsoleResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerDiskQueryByParamForConsoleResponse.data.Length"); i++) {
			Item item = new Item();
			item.setSeq(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].seq"));
			item.setEnableAutoSnapshot(context.booleanValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].enableAutoSnapshot"));
			item.setActive(context.booleanValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].active"));
			item.setDiskSize(context.integerValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].diskSize"));
			item.setDiskDesc(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].diskDesc"));
			item.setBusinessStatus(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].businessStatus"));
			item.setZoneNo(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].zoneNo"));
			item.setRegionNo(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].regionNo"));
			item.setDiskCategory(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].diskCategory"));
			item.setSnapshotNo(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].snapshotNo"));
			item.setHouyiDiskId(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].houyiDiskId"));
			item.setDiskName(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].diskName"));
			item.setProductCode(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].productCode"));
			item.setMountPoint(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].mountPoint"));
			item.setDeleteAutoSnapshot(context.booleanValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].deleteAutoSnapshot"));
			item.setImageNo(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].imageNo"));
			item.setId(context.longValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].id"));
			item.setBootable(context.booleanValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].bootable"));
			item.setDeleteWithInstance(context.booleanValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].deleteWithInstance"));
			item.setDiskType(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].diskType"));
			item.setEcsInstanceId(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].ecsInstanceId"));
			item.setLastAttachTime(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].lastAttachTime"));
			item.setLastDetachTime(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].lastDetachTime"));
			item.setIzNo(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].izNo"));
			item.setPortable(context.booleanValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].portable"));
			item.setIopsSize(context.integerValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].iopsSize"));
			item.setAutoSnapshotPolicyId(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].autoSnapshotPolicyId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].tags["+ j +"].key"));
				tag.setValue(context.stringValue("InnerDiskQueryByParamForConsoleResponse.data["+ i +"].tags["+ j +"].value"));

				tags.add(tag);
			}
			item.setTags(tags);

			data.add(item);
		}
		innerDiskQueryByParamForConsoleResponse.setData(data);
	 
	 	return innerDiskQueryByParamForConsoleResponse;
	}
}