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

import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryImgsByParamResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryImgsByParamResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryImgsByParamResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryImgsByParamResponse.Item.OsTypeModel;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryImgsByParamResponse.Item.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerImageQueryImgsByParamResponseUnmarshaller {

	public static InnerImageQueryImgsByParamResponse unmarshall(InnerImageQueryImgsByParamResponse innerImageQueryImgsByParamResponse, UnmarshallerContext context) {
		
		innerImageQueryImgsByParamResponse.setRequestId(context.stringValue("InnerImageQueryImgsByParamResponse.RequestId"));
		innerImageQueryImgsByParamResponse.setCount(context.integerValue("InnerImageQueryImgsByParamResponse.count"));
		innerImageQueryImgsByParamResponse.setPageNo(context.integerValue("InnerImageQueryImgsByParamResponse.pageNo"));
		innerImageQueryImgsByParamResponse.setPageSize(context.integerValue("InnerImageQueryImgsByParamResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerImageQueryImgsByParamResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerImageQueryImgsByParamResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerImageQueryImgsByParamResponse.errorCode.isSuccess"));
		innerImageQueryImgsByParamResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerImageQueryImgsByParamResponse.data.Length"); i++) {
			Item item = new Item();
			item.setSnapshotNo(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].snapshotNo"));
			item.setFormat(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].format"));
			item.setIsPublic(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].isPublic"));
			item.setRegionNo(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].regionNo"));
			item.setImageSize(context.integerValue("InnerImageQueryImgsByParamResponse.data["+ i +"].imageSize"));
			item.setImportOSSBucket(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].importOSSBucket"));
			item.setStatus(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].status"));
			item.setOwner(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].owner"));
			item.setVirtBaseImageId(context.longValue("InnerImageQueryImgsByParamResponse.data["+ i +"].virtBaseImageId"));
			item.setDisplayName(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].displayName"));
			item.setQuoteType(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].quoteType"));
			item.setImageCategory(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].imageCategory"));
			item.setGmtRelease(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].gmtRelease"));
			item.setImageProductCode(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].imageProductCode"));
			item.setAliUid(context.longValue("InnerImageQueryImgsByParamResponse.data["+ i +"].aliUid"));
			item.setVersion(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].version"));
			item.setGmtModified(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].gmtModified"));
			item.setProgress(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].progress"));
			item.setImportOSSObject(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].importOSSObject"));
			item.setSupportIoOptimizedInstance(context.booleanValue("InnerImageQueryImgsByParamResponse.data["+ i +"].supportIoOptimizedInstance"));
			item.setRemark(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].remark"));
			item.setVisibility(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].visibility"));
			item.setBid(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].bid"));
			item.setId(context.longValue("InnerImageQueryImgsByParamResponse.data["+ i +"].id"));
			item.setImageId(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].imageId"));
			item.setSrcImageId(context.longValue("InnerImageQueryImgsByParamResponse.data["+ i +"].srcImageId"));
			item.setGmtCreated(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].gmtCreated"));
			item.setName(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].name"));

			OsTypeModel osTypeModel = new OsTypeModel();
			osTypeModel.setPlatform(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].osTypeModel.platform"));
			osTypeModel.setId(context.longValue("InnerImageQueryImgsByParamResponse.data["+ i +"].osTypeModel.id"));
			osTypeModel.setOsBit(context.integerValue("InnerImageQueryImgsByParamResponse.data["+ i +"].osTypeModel.osBit"));
			osTypeModel.setMinCpu(context.integerValue("InnerImageQueryImgsByParamResponse.data["+ i +"].osTypeModel.minCpu"));
			osTypeModel.setMinMemory(context.integerValue("InnerImageQueryImgsByParamResponse.data["+ i +"].osTypeModel.minMemory"));
			osTypeModel.setMaxCpu(context.integerValue("InnerImageQueryImgsByParamResponse.data["+ i +"].osTypeModel.maxCpu"));
			osTypeModel.setMaxMemory(context.integerValue("InnerImageQueryImgsByParamResponse.data["+ i +"].osTypeModel.maxMemory"));
			osTypeModel.setKind(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].osTypeModel.kind"));
			osTypeModel.setOsName(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].osTypeModel.osName"));
			osTypeModel.setOsMemo(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].osTypeModel.osMemo"));
			osTypeModel.setType(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].osTypeModel.type"));
			item.setOsTypeModel(osTypeModel);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("InnerImageQueryImgsByParamResponse.data["+ i +"].tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].tags["+ j +"].key"));
				tag.setValue(context.stringValue("InnerImageQueryImgsByParamResponse.data["+ i +"].tags["+ j +"].value"));

				tags.add(tag);
			}
			item.setTags(tags);

			data.add(item);
		}
		innerImageQueryImgsByParamResponse.setData(data);
	 
	 	return innerImageQueryImgsByParamResponse;
	}
}