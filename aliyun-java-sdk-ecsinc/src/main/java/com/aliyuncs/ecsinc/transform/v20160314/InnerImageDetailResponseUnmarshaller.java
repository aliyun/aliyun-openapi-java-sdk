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

import com.aliyuncs.ecsinc.model.v20160314.InnerImageDetailResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageDetailResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageDetailResponse.Data.ImageDiskMappingModel;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageDetailResponse.Data.OsTypeModel;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageDetailResponse.Data.OsTypeModel.Kind;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageDetailResponse.Data.QuoteType;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageDetailResponse.Data.Tag;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageDetailResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerImageDetailResponseUnmarshaller {

	public static InnerImageDetailResponse unmarshall(InnerImageDetailResponse innerImageDetailResponse, UnmarshallerContext context) {
		
		innerImageDetailResponse.setRequestId(context.stringValue("InnerImageDetailResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerImageDetailResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerImageDetailResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerImageDetailResponse.errorCode.isSuccess"));
		innerImageDetailResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setName(context.stringValue("InnerImageDetailResponse.data.name"));
		data.setSrcImageId(context.longValue("InnerImageDetailResponse.data.srcImageId"));
		data.setImageId(context.stringValue("InnerImageDetailResponse.data.imageId"));
		data.setGmtCreated(context.stringValue("InnerImageDetailResponse.data.gmtCreated"));
		data.setId(context.longValue("InnerImageDetailResponse.data.id"));
		data.setBid(context.stringValue("InnerImageDetailResponse.data.bid"));
		data.setSupportIoOptimizedInstance(context.booleanValue("InnerImageDetailResponse.data.supportIoOptimizedInstance"));
		data.setRemark(context.stringValue("InnerImageDetailResponse.data.remark"));
		data.setVisibility(context.stringValue("InnerImageDetailResponse.data.visibility"));
		data.setImportOSSObject(context.stringValue("InnerImageDetailResponse.data.importOSSObject"));
		data.setGmtModified(context.stringValue("InnerImageDetailResponse.data.gmtModified"));
		data.setProgress(context.stringValue("InnerImageDetailResponse.data.progress"));
		data.setVersion(context.stringValue("InnerImageDetailResponse.data.version"));
		data.setImageProductCode(context.stringValue("InnerImageDetailResponse.data.imageProductCode"));
		data.setAliUid(context.longValue("InnerImageDetailResponse.data.aliUid"));
		data.setGmtRelease(context.stringValue("InnerImageDetailResponse.data.gmtRelease"));
		data.setImageCategory(context.stringValue("InnerImageDetailResponse.data.imageCategory"));
		data.setDisplayName(context.stringValue("InnerImageDetailResponse.data.displayName"));
		data.setOwner(context.stringValue("InnerImageDetailResponse.data.owner"));
		data.setStatus(context.stringValue("InnerImageDetailResponse.data.status"));
		data.setImportOSSBucket(context.stringValue("InnerImageDetailResponse.data.importOSSBucket"));
		data.setRegionNo(context.stringValue("InnerImageDetailResponse.data.regionNo"));
		data.setFormat(context.stringValue("InnerImageDetailResponse.data.format"));
		data.setImageSize(context.integerValue("InnerImageDetailResponse.data.imageSize"));
		data.setSnapshotNo(context.stringValue("InnerImageDetailResponse.data.snapshotNo"));

		OsTypeModel osTypeModel = new OsTypeModel();
		osTypeModel.setPlatform(context.stringValue("InnerImageDetailResponse.data.osTypeModel.platform"));
		osTypeModel.setId(context.longValue("InnerImageDetailResponse.data.osTypeModel.id"));
		osTypeModel.setOsBit(context.integerValue("InnerImageDetailResponse.data.osTypeModel.osBit"));
		osTypeModel.setMinCpu(context.integerValue("InnerImageDetailResponse.data.osTypeModel.minCpu"));
		osTypeModel.setMinMemory(context.integerValue("InnerImageDetailResponse.data.osTypeModel.minMemory"));
		osTypeModel.setMaxCpu(context.integerValue("InnerImageDetailResponse.data.osTypeModel.maxCpu"));
		osTypeModel.setMaxMemory(context.integerValue("InnerImageDetailResponse.data.osTypeModel.maxMemory"));
		osTypeModel.setOsName(context.stringValue("InnerImageDetailResponse.data.osTypeModel.osName"));
		osTypeModel.setOsMemo(context.stringValue("InnerImageDetailResponse.data.osTypeModel.osMemo"));
		osTypeModel.setType(context.stringValue("InnerImageDetailResponse.data.osTypeModel.type"));

		Kind kind = new Kind();
		kind.setKind(context.stringValue("InnerImageDetailResponse.data.osTypeModel.kind.kind"));
		osTypeModel.setKind(kind);
		data.setOsTypeModel(osTypeModel);

		QuoteType quoteType = new QuoteType();
		quoteType.setQuoteType(context.stringValue("InnerImageDetailResponse.data.quoteType.quoteType"));
		data.setQuoteType(quoteType);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < context.lengthValue("InnerImageDetailResponse.data.tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(context.stringValue("InnerImageDetailResponse.data.tags["+ i +"].key"));
			tag.setValue(context.stringValue("InnerImageDetailResponse.data.tags["+ i +"].value"));

			tags.add(tag);
		}
		data.setTags(tags);

		List<ImageDiskMappingModel> imageDiskMappingModels = new ArrayList<ImageDiskMappingModel>();
		for (int i = 0; i < context.lengthValue("InnerImageDetailResponse.data.imageDiskMappingModels.Length"); i++) {
			ImageDiskMappingModel imageDiskMappingModel = new ImageDiskMappingModel();
			imageDiskMappingModel.setSnapshotId(context.stringValue("InnerImageDetailResponse.data.imageDiskMappingModels["+ i +"].snapshotId"));
			imageDiskMappingModel.setSize(context.integerValue("InnerImageDetailResponse.data.imageDiskMappingModels["+ i +"].size"));
			imageDiskMappingModel.setDevice(context.stringValue("InnerImageDetailResponse.data.imageDiskMappingModels["+ i +"].device"));
			imageDiskMappingModel.setDiskType(context.stringValue("InnerImageDetailResponse.data.imageDiskMappingModels["+ i +"].diskType"));
			imageDiskMappingModel.setFormat(context.stringValue("InnerImageDetailResponse.data.imageDiskMappingModels["+ i +"].format"));
			imageDiskMappingModel.setImportOSSBucket(context.stringValue("InnerImageDetailResponse.data.imageDiskMappingModels["+ i +"].importOSSBucket"));
			imageDiskMappingModel.setImportOSSObject(context.stringValue("InnerImageDetailResponse.data.imageDiskMappingModels["+ i +"].importOSSObject"));

			imageDiskMappingModels.add(imageDiskMappingModel);
		}
		data.setImageDiskMappingModels(imageDiskMappingModels);
		innerImageDetailResponse.setData(data);
	 
	 	return innerImageDetailResponse;
	}
}