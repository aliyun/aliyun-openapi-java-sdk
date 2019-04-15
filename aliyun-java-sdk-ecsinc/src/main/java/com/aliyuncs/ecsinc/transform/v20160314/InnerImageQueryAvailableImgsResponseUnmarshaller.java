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

import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryAvailableImgsResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryAvailableImgsResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryAvailableImgsResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryAvailableImgsResponse.Item.OsTypeModel;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryAvailableImgsResponse.Item.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerImageQueryAvailableImgsResponseUnmarshaller {

	public static InnerImageQueryAvailableImgsResponse unmarshall(InnerImageQueryAvailableImgsResponse innerImageQueryAvailableImgsResponse, UnmarshallerContext context) {
		
		innerImageQueryAvailableImgsResponse.setRequestId(context.stringValue("InnerImageQueryAvailableImgsResponse.RequestId"));
		innerImageQueryAvailableImgsResponse.setCount(context.integerValue("InnerImageQueryAvailableImgsResponse.count"));
		innerImageQueryAvailableImgsResponse.setPageNo(context.integerValue("InnerImageQueryAvailableImgsResponse.pageNo"));
		innerImageQueryAvailableImgsResponse.setPageSize(context.integerValue("InnerImageQueryAvailableImgsResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerImageQueryAvailableImgsResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerImageQueryAvailableImgsResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerImageQueryAvailableImgsResponse.errorCode.isSuccess"));
		innerImageQueryAvailableImgsResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerImageQueryAvailableImgsResponse.data.Length"); i++) {
			Item item = new Item();
			item.setSnapshotNo(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].snapshotNo"));
			item.setFormat(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].format"));
			item.setRegionNo(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].regionNo"));
			item.setIsPublic(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].isPublic"));
			item.setImageSize(context.integerValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].imageSize"));
			item.setImportOSSBucket(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].importOSSBucket"));
			item.setStatus(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].status"));
			item.setOwner(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].owner"));
			item.setVirtBaseImageId(context.longValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].virtBaseImageId"));
			item.setDisplayName(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].displayName"));
			item.setQuoteType(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].quoteType"));
			item.setImageCategory(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].imageCategory"));
			item.setGmtRelease(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].gmtRelease"));
			item.setImageProductCode(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].imageProductCode"));
			item.setAliUid(context.longValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].aliUid"));
			item.setVersion(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].version"));
			item.setGmtModified(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].gmtModified"));
			item.setProgress(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].progress"));
			item.setImportOSSObject(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].importOSSObject"));
			item.setSupportIoOptimizedInstance(context.booleanValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].supportIoOptimizedInstance"));
			item.setVisibility(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].visibility"));
			item.setRemark(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].remark"));
			item.setBid(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].bid"));
			item.setId(context.longValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].id"));
			item.setImageId(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].imageId"));
			item.setSrcImageId(context.longValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].srcImageId"));
			item.setGmtCreated(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].gmtCreated"));
			item.setName(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].name"));

			OsTypeModel osTypeModel = new OsTypeModel();
			osTypeModel.setId(context.longValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].osTypeModel.id"));
			osTypeModel.setOsBit(context.integerValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].osTypeModel.osBit"));
			osTypeModel.setOsName(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].osTypeModel.osName"));
			osTypeModel.setPlatform(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].osTypeModel.platform"));
			osTypeModel.setMinCpu(context.integerValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].osTypeModel.minCpu"));
			osTypeModel.setMinMemory(context.integerValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].osTypeModel.minMemory"));
			osTypeModel.setMaxCpu(context.integerValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].osTypeModel.maxCpu"));
			osTypeModel.setMaxMemory(context.integerValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].osTypeModel.maxMemory"));
			osTypeModel.setKind(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].osTypeModel.kind"));
			osTypeModel.setOsMemo(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].osTypeModel.osMemo"));
			osTypeModel.setType(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].osTypeModel.type"));
			item.setOsTypeModel(osTypeModel);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].tags["+ j +"].key"));
				tag.setValue(context.stringValue("InnerImageQueryAvailableImgsResponse.data["+ i +"].tags["+ j +"].value"));

				tags.add(tag);
			}
			item.setTags(tags);

			data.add(item);
		}
		innerImageQueryAvailableImgsResponse.setData(data);
	 
	 	return innerImageQueryAvailableImgsResponse;
	}
}