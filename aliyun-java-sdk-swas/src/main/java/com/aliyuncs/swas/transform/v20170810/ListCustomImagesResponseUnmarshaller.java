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

import com.aliyuncs.swas.model.v20170810.ListCustomImagesResponse;
import com.aliyuncs.swas.model.v20170810.ListCustomImagesResponse.CustomImageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomImagesResponseUnmarshaller {

	public static ListCustomImagesResponse unmarshall(ListCustomImagesResponse listCustomImagesResponse, UnmarshallerContext _ctx) {
		
		listCustomImagesResponse.setRequestId(_ctx.stringValue("ListCustomImagesResponse.RequestId"));
		listCustomImagesResponse.setIsSuccess(_ctx.booleanValue("ListCustomImagesResponse.IsSuccess"));
		listCustomImagesResponse.setCode(_ctx.stringValue("ListCustomImagesResponse.Code"));

		List<CustomImageInfo> customImageInfos = new ArrayList<CustomImageInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomImagesResponse.CustomImageInfos.Length"); i++) {
			CustomImageInfo customImageInfo = new CustomImageInfo();
			customImageInfo.setCreationTime(_ctx.longValue("ListCustomImagesResponse.CustomImageInfos["+ i +"].CreationTime"));
			customImageInfo.setDataSnapshotName(_ctx.stringValue("ListCustomImagesResponse.CustomImageInfos["+ i +"].DataSnapshotName"));
			customImageInfo.setSystemSnapshotId(_ctx.stringValue("ListCustomImagesResponse.CustomImageInfos["+ i +"].SystemSnapshotId"));
			customImageInfo.setInShare(_ctx.integerValue("ListCustomImagesResponse.CustomImageInfos["+ i +"].InShare"));
			customImageInfo.setInstanceId(_ctx.stringValue("ListCustomImagesResponse.CustomImageInfos["+ i +"].InstanceId"));
			customImageInfo.setDataSnapshotId(_ctx.stringValue("ListCustomImagesResponse.CustomImageInfos["+ i +"].DataSnapshotId"));
			customImageInfo.setRegionId(_ctx.stringValue("ListCustomImagesResponse.CustomImageInfos["+ i +"].RegionId"));
			customImageInfo.setServerName(_ctx.stringValue("ListCustomImagesResponse.CustomImageInfos["+ i +"].ServerName"));
			customImageInfo.setSystemSnapshotName(_ctx.stringValue("ListCustomImagesResponse.CustomImageInfos["+ i +"].SystemSnapshotName"));
			customImageInfo.setDescription(_ctx.stringValue("ListCustomImagesResponse.CustomImageInfos["+ i +"].Description"));
			customImageInfo.setName(_ctx.stringValue("ListCustomImagesResponse.CustomImageInfos["+ i +"].Name"));
			customImageInfo.setImageId(_ctx.stringValue("ListCustomImagesResponse.CustomImageInfos["+ i +"].ImageId"));
			customImageInfo.setStatus(_ctx.longValue("ListCustomImagesResponse.CustomImageInfos["+ i +"].Status"));
			customImageInfo.setResourceImageName(_ctx.stringValue("ListCustomImagesResponse.CustomImageInfos["+ i +"].ResourceImageName"));
			customImageInfo.setResourceImageVersion(_ctx.stringValue("ListCustomImagesResponse.CustomImageInfos["+ i +"].ResourceImageVersion"));

			customImageInfos.add(customImageInfo);
		}
		listCustomImagesResponse.setCustomImageInfos(customImageInfos);
	 
	 	return listCustomImagesResponse;
	}
}