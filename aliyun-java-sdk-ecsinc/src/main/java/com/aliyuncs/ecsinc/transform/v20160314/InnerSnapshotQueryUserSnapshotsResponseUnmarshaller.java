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

import com.aliyuncs.ecsinc.model.v20160314.InnerSnapshotQueryUserSnapshotsResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerSnapshotQueryUserSnapshotsResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerSnapshotQueryUserSnapshotsResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerSnapshotQueryUserSnapshotsResponse.Item.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerSnapshotQueryUserSnapshotsResponseUnmarshaller {

	public static InnerSnapshotQueryUserSnapshotsResponse unmarshall(InnerSnapshotQueryUserSnapshotsResponse innerSnapshotQueryUserSnapshotsResponse, UnmarshallerContext context) {
		
		innerSnapshotQueryUserSnapshotsResponse.setRequestId(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.RequestId"));
		innerSnapshotQueryUserSnapshotsResponse.setCount(context.integerValue("InnerSnapshotQueryUserSnapshotsResponse.count"));
		innerSnapshotQueryUserSnapshotsResponse.setPageNo(context.integerValue("InnerSnapshotQueryUserSnapshotsResponse.pageNo"));
		innerSnapshotQueryUserSnapshotsResponse.setPageSize(context.integerValue("InnerSnapshotQueryUserSnapshotsResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerSnapshotQueryUserSnapshotsResponse.errorCode.isSuccess"));
		innerSnapshotQueryUserSnapshotsResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerSnapshotQueryUserSnapshotsResponse.data.Length"); i++) {
			Item item = new Item();
			item.setSnapshotType(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].snapshotType"));
			item.setGmtModified(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].gmtModified"));
			item.setSnapshotId(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].snapshotId"));
			item.setAliUid(context.longValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].aliUid"));
			item.setImgPc(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].imgPc"));
			item.setDiskType(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].diskType"));
			item.setSnapshotNickname(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].snapshotNickname"));
			item.setDeviceType(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].deviceType"));
			item.setSnapshotName(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].snapshotName"));
			item.setDescription(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].description"));
			item.setId(context.longValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].id"));
			item.setEcsSnapshotStatus(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].ecsSnapshotStatus"));
			item.setGmtCreated(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].gmtCreated"));
			item.setBid(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].bid"));
			item.setEcsId(context.longValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].ecsId"));
			item.setDiskId(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].diskId"));
			item.setSnapshotProcess(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].snapshotProcess"));
			item.setStatus(context.integerValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].status"));
			item.setSnapshotSize(context.integerValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].snapshotSize"));
			item.setSnapshotNo(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].snapshotNo"));
			item.setQuoteType(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].quoteType"));
			item.setImgId(context.longValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].imgId"));
			item.setDeviceNo(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].deviceNo"));
			item.setDiskSize(context.integerValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].diskSize"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].tags["+ j +"].key"));
				tag.setValue(context.stringValue("InnerSnapshotQueryUserSnapshotsResponse.data["+ i +"].tags["+ j +"].value"));

				tags.add(tag);
			}
			item.setTags(tags);

			data.add(item);
		}
		innerSnapshotQueryUserSnapshotsResponse.setData(data);
	 
	 	return innerSnapshotQueryUserSnapshotsResponse;
	}
}