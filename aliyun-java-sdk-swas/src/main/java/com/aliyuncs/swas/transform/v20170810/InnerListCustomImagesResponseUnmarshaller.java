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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.InnerListCustomImagesResponse;
import com.aliyuncs.swas.model.v20170810.InnerListCustomImagesResponse.CustomImageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerListCustomImagesResponseUnmarshaller {

	public static InnerListCustomImagesResponse unmarshall(InnerListCustomImagesResponse innerListCustomImagesResponse, UnmarshallerContext _ctx) {
		
		innerListCustomImagesResponse.setRequestId(_ctx.stringValue("InnerListCustomImagesResponse.RequestId"));
		innerListCustomImagesResponse.setIsSuccess(_ctx.booleanValue("InnerListCustomImagesResponse.IsSuccess"));
		innerListCustomImagesResponse.setCode(_ctx.stringValue("InnerListCustomImagesResponse.Code"));
		innerListCustomImagesResponse.setPageNumber(_ctx.longValue("InnerListCustomImagesResponse.PageNumber"));
		innerListCustomImagesResponse.setPageSize(_ctx.longValue("InnerListCustomImagesResponse.PageSize"));
		innerListCustomImagesResponse.setTotalCount(_ctx.longValue("InnerListCustomImagesResponse.TotalCount"));

		List<CustomImageInfo> customImageInfos = new ArrayList<CustomImageInfo>();
		for (int i = 0; i < _ctx.lengthValue("InnerListCustomImagesResponse.CustomImageInfos.Length"); i++) {
			CustomImageInfo customImageInfo = new CustomImageInfo();
			customImageInfo.setCreationTime(_ctx.longValue("InnerListCustomImagesResponse.CustomImageInfos["+ i +"].CreationTime"));
			customImageInfo.setDataSnapshotName(_ctx.stringValue("InnerListCustomImagesResponse.CustomImageInfos["+ i +"].DataSnapshotName"));
			customImageInfo.setSystemSnapshotId(_ctx.stringValue("InnerListCustomImagesResponse.CustomImageInfos["+ i +"].SystemSnapshotId"));
			customImageInfo.setInShare(_ctx.integerValue("InnerListCustomImagesResponse.CustomImageInfos["+ i +"].InShare"));
			customImageInfo.setInstanceId(_ctx.stringValue("InnerListCustomImagesResponse.CustomImageInfos["+ i +"].InstanceId"));
			customImageInfo.setDataSnapshotId(_ctx.stringValue("InnerListCustomImagesResponse.CustomImageInfos["+ i +"].DataSnapshotId"));
			customImageInfo.setRegionId(_ctx.stringValue("InnerListCustomImagesResponse.CustomImageInfos["+ i +"].RegionId"));
			customImageInfo.setServerName(_ctx.stringValue("InnerListCustomImagesResponse.CustomImageInfos["+ i +"].ServerName"));
			customImageInfo.setSystemSnapshotName(_ctx.stringValue("InnerListCustomImagesResponse.CustomImageInfos["+ i +"].SystemSnapshotName"));
			customImageInfo.setDescription(_ctx.stringValue("InnerListCustomImagesResponse.CustomImageInfos["+ i +"].Description"));
			customImageInfo.setName(_ctx.stringValue("InnerListCustomImagesResponse.CustomImageInfos["+ i +"].Name"));
			customImageInfo.setImageId(_ctx.stringValue("InnerListCustomImagesResponse.CustomImageInfos["+ i +"].ImageId"));
			customImageInfo.setStatus(_ctx.longValue("InnerListCustomImagesResponse.CustomImageInfos["+ i +"].Status"));
			customImageInfo.setResourceImageName(_ctx.stringValue("InnerListCustomImagesResponse.CustomImageInfos["+ i +"].ResourceImageName"));
			customImageInfo.setResourceImageVersion(_ctx.stringValue("InnerListCustomImagesResponse.CustomImageInfos["+ i +"].ResourceImageVersion"));

			customImageInfos.add(customImageInfo);
		}
		innerListCustomImagesResponse.setCustomImageInfos(customImageInfos);
	 
	 	return innerListCustomImagesResponse;
	}
}