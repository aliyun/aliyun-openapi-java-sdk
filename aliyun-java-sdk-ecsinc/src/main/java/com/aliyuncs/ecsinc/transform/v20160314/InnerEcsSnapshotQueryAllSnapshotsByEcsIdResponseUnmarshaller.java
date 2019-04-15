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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.Item.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponseUnmarshaller {

	public static InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse unmarshall(InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse innerEcsSnapshotQueryAllSnapshotsByEcsIdResponse, UnmarshallerContext context) {
		
		innerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.setRequestId(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.RequestId"));
		innerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.setCount(context.integerValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.count"));
		innerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.setPageNo(context.integerValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.pageNo"));
		innerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.setPageSize(context.integerValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.errorCode.isSuccess"));
		innerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data.Length"); i++) {
			Item item = new Item();
			item.setGmtModified(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].gmtModified"));
			item.setSnapshotId(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].snapshotId"));
			item.setSnapshotType(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].snapshotType"));
			item.setDiskType(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].diskType"));
			item.setImgPc(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].imgPc"));
			item.setAliUid(context.longValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].aliUid"));
			item.setGmtCreated(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].gmtCreated"));
			item.setId(context.longValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].id"));
			item.setEcsSnapshotStatus(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].ecsSnapshotStatus"));
			item.setDeviceType(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].deviceType"));
			item.setSnapshotName(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].snapshotName"));
			item.setDescription(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].description"));
			item.setSnapshotNickname(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].snapshotNickname"));
			item.setSnapshotProcess(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].snapshotProcess"));
			item.setDiskId(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].diskId"));
			item.setBid(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].bid"));
			item.setEcsId(context.longValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].ecsId"));
			item.setStatus(context.integerValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].status"));
			item.setSnapshotNo(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].snapshotNo"));
			item.setSnapshotSize(context.integerValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].snapshotSize"));
			item.setDeviceNo(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].deviceNo"));
			item.setImgId(context.longValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].imgId"));
			item.setQuoteType(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].quoteType"));
			item.setDiskSize(context.integerValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].diskSize"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].tags["+ j +"].key"));
				tag.setValue(context.stringValue("InnerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.data["+ i +"].tags["+ j +"].value"));

				tags.add(tag);
			}
			item.setTags(tags);

			data.add(item);
		}
		innerEcsSnapshotQueryAllSnapshotsByEcsIdResponse.setData(data);
	 
	 	return innerEcsSnapshotQueryAllSnapshotsByEcsIdResponse;
	}
}