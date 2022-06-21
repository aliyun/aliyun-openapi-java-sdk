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

import com.aliyuncs.swas.model.v20170810.ListCustomImagesForResetResponse;
import com.aliyuncs.swas.model.v20170810.ListCustomImagesForResetResponse.CustomImageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomImagesForResetResponseUnmarshaller {

	public static ListCustomImagesForResetResponse unmarshall(ListCustomImagesForResetResponse listCustomImagesForResetResponse, UnmarshallerContext _ctx) {
		
		listCustomImagesForResetResponse.setRequestId(_ctx.stringValue("ListCustomImagesForResetResponse.RequestId"));
		listCustomImagesForResetResponse.setIsSuccess(_ctx.booleanValue("ListCustomImagesForResetResponse.IsSuccess"));
		listCustomImagesForResetResponse.setCode(_ctx.stringValue("ListCustomImagesForResetResponse.Code"));

		List<CustomImageInfo> customImageInfos = new ArrayList<CustomImageInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomImagesForResetResponse.CustomImageInfos.Length"); i++) {
			CustomImageInfo customImageInfo = new CustomImageInfo();
			customImageInfo.setCreationTime(_ctx.longValue("ListCustomImagesForResetResponse.CustomImageInfos["+ i +"].CreationTime"));
			customImageInfo.setDataSnapshotName(_ctx.stringValue("ListCustomImagesForResetResponse.CustomImageInfos["+ i +"].DataSnapshotName"));
			customImageInfo.setSystemSnapshotId(_ctx.stringValue("ListCustomImagesForResetResponse.CustomImageInfos["+ i +"].SystemSnapshotId"));
			customImageInfo.setInShare(_ctx.integerValue("ListCustomImagesForResetResponse.CustomImageInfos["+ i +"].InShare"));
			customImageInfo.setInstanceId(_ctx.stringValue("ListCustomImagesForResetResponse.CustomImageInfos["+ i +"].InstanceId"));
			customImageInfo.setDataSnapshotId(_ctx.stringValue("ListCustomImagesForResetResponse.CustomImageInfos["+ i +"].DataSnapshotId"));
			customImageInfo.setRegionId(_ctx.stringValue("ListCustomImagesForResetResponse.CustomImageInfos["+ i +"].RegionId"));
			customImageInfo.setServerName(_ctx.stringValue("ListCustomImagesForResetResponse.CustomImageInfos["+ i +"].ServerName"));
			customImageInfo.setSystemSnapshotName(_ctx.stringValue("ListCustomImagesForResetResponse.CustomImageInfos["+ i +"].SystemSnapshotName"));
			customImageInfo.setDescription(_ctx.stringValue("ListCustomImagesForResetResponse.CustomImageInfos["+ i +"].Description"));
			customImageInfo.setName(_ctx.stringValue("ListCustomImagesForResetResponse.CustomImageInfos["+ i +"].Name"));
			customImageInfo.setImageId(_ctx.stringValue("ListCustomImagesForResetResponse.CustomImageInfos["+ i +"].ImageId"));
			customImageInfo.setSystemDiskSize(_ctx.integerValue("ListCustomImagesForResetResponse.CustomImageInfos["+ i +"].SystemDiskSize"));
			customImageInfo.setDataDiskSize(_ctx.integerValue("ListCustomImagesForResetResponse.CustomImageInfos["+ i +"].DataDiskSize"));
			customImageInfo.setResourceImageName(_ctx.stringValue("ListCustomImagesForResetResponse.CustomImageInfos["+ i +"].ResourceImageName"));
			customImageInfo.setResourceImageVersion(_ctx.stringValue("ListCustomImagesForResetResponse.CustomImageInfos["+ i +"].ResourceImageVersion"));
			customImageInfo.setOsType(_ctx.stringValue("ListCustomImagesForResetResponse.CustomImageInfos["+ i +"].OsType"));

			customImageInfos.add(customImageInfo);
		}
		listCustomImagesForResetResponse.setCustomImageInfos(customImageInfos);
	 
	 	return listCustomImagesForResetResponse;
	}
}