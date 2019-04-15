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

import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryUserImagesResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryUserImagesResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerImageQueryUserImagesResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerImageQueryUserImagesResponseUnmarshaller {

	public static InnerImageQueryUserImagesResponse unmarshall(InnerImageQueryUserImagesResponse innerImageQueryUserImagesResponse, UnmarshallerContext context) {
		
		innerImageQueryUserImagesResponse.setRequestId(context.stringValue("InnerImageQueryUserImagesResponse.RequestId"));
		innerImageQueryUserImagesResponse.setCount(context.integerValue("InnerImageQueryUserImagesResponse.count"));
		innerImageQueryUserImagesResponse.setPageNo(context.integerValue("InnerImageQueryUserImagesResponse.pageNo"));
		innerImageQueryUserImagesResponse.setPageSize(context.integerValue("InnerImageQueryUserImagesResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerImageQueryUserImagesResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerImageQueryUserImagesResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerImageQueryUserImagesResponse.errorCode.isSuccess"));
		innerImageQueryUserImagesResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerImageQueryUserImagesResponse.data.Length"); i++) {
			Item item = new Item();
			item.setKind(context.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].kind"));
			item.setVersion(context.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].version"));
			item.setWindowsOS(context.booleanValue("InnerImageQueryUserImagesResponse.data["+ i +"].windowsOS"));
			item.setAliUid(context.longValue("InnerImageQueryUserImagesResponse.data["+ i +"].aliUid"));
			item.setType(context.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].type"));
			item.setGmtRelease(context.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].gmtRelease"));
			item.setMinMemory(context.integerValue("InnerImageQueryUserImagesResponse.data["+ i +"].minMemory"));
			item.setOsTypeId(context.longValue("InnerImageQueryUserImagesResponse.data["+ i +"].osTypeId"));
			item.setMaxCpu(context.integerValue("InnerImageQueryUserImagesResponse.data["+ i +"].maxCpu"));
			item.setMinCpu(context.integerValue("InnerImageQueryUserImagesResponse.data["+ i +"].minCpu"));
			item.setRemark(context.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].remark"));
			item.setGmtModified(context.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].gmtModified"));
			item.setImageNo(context.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].imageNo"));
			item.setBid(context.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].bid"));
			item.setOsBit(context.integerValue("InnerImageQueryUserImagesResponse.data["+ i +"].osBit"));
			item.setGmtCreated(context.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].gmtCreated"));
			item.setId(context.longValue("InnerImageQueryUserImagesResponse.data["+ i +"].id"));
			item.setOsMemo(context.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].osMemo"));
			item.setImageSize(context.integerValue("InnerImageQueryUserImagesResponse.data["+ i +"].imageSize"));
			item.setIsPublic(context.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].isPublic"));
			item.setRegionNo(context.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].regionNo"));
			item.setMaxMemory(context.integerValue("InnerImageQueryUserImagesResponse.data["+ i +"].maxMemory"));
			item.setSnapshotNo(context.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].snapshotNo"));
			item.setStatus(context.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].status"));
			item.setImageName(context.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].imageName"));
			item.setPlatform(context.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].platform"));
			item.setOsName(context.stringValue("InnerImageQueryUserImagesResponse.data["+ i +"].osName"));

			data.add(item);
		}
		innerImageQueryUserImagesResponse.setData(data);
	 
	 	return innerImageQueryUserImagesResponse;
	}
}