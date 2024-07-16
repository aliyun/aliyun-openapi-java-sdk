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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.ListCustomImagesResponse;
import com.aliyuncs.swas_open.model.v20200601.ListCustomImagesResponse.CustomImage;
import com.aliyuncs.swas_open.model.v20200601.ListCustomImagesResponse.CustomImage.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomImagesResponseUnmarshaller {

	public static ListCustomImagesResponse unmarshall(ListCustomImagesResponse listCustomImagesResponse, UnmarshallerContext _ctx) {
		
		listCustomImagesResponse.setRequestId(_ctx.stringValue("ListCustomImagesResponse.RequestId"));
		listCustomImagesResponse.setTotalCount(_ctx.stringValue("ListCustomImagesResponse.TotalCount"));
		listCustomImagesResponse.setPageSize(_ctx.stringValue("ListCustomImagesResponse.PageSize"));
		listCustomImagesResponse.setPageNumber(_ctx.stringValue("ListCustomImagesResponse.PageNumber"));

		List<CustomImage> customImages = new ArrayList<CustomImage>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomImagesResponse.CustomImages.Length"); i++) {
			CustomImage customImage = new CustomImage();
			customImage.setCreationTime(_ctx.stringValue("ListCustomImagesResponse.CustomImages["+ i +"].CreationTime"));
			customImage.setDataSnapshotName(_ctx.stringValue("ListCustomImagesResponse.CustomImages["+ i +"].DataSnapshotName"));
			customImage.setSystemSnapshotId(_ctx.stringValue("ListCustomImagesResponse.CustomImages["+ i +"].SystemSnapshotId"));
			customImage.setInShare(_ctx.booleanValue("ListCustomImagesResponse.CustomImages["+ i +"].InShare"));
			customImage.setInShareUser(_ctx.booleanValue("ListCustomImagesResponse.CustomImages["+ i +"].InShareUser"));
			customImage.setInstanceId(_ctx.stringValue("ListCustomImagesResponse.CustomImages["+ i +"].InstanceId"));
			customImage.setDataSnapshotId(_ctx.stringValue("ListCustomImagesResponse.CustomImages["+ i +"].DataSnapshotId"));
			customImage.setRegionId(_ctx.stringValue("ListCustomImagesResponse.CustomImages["+ i +"].RegionId"));
			customImage.setSystemSnapshotName(_ctx.stringValue("ListCustomImagesResponse.CustomImages["+ i +"].SystemSnapshotName"));
			customImage.setDescription(_ctx.stringValue("ListCustomImagesResponse.CustomImages["+ i +"].Description"));
			customImage.setName(_ctx.stringValue("ListCustomImagesResponse.CustomImages["+ i +"].Name"));
			customImage.setImageId(_ctx.stringValue("ListCustomImagesResponse.CustomImages["+ i +"].ImageId"));
			customImage.setStatus(_ctx.stringValue("ListCustomImagesResponse.CustomImages["+ i +"].Status"));
			customImage.setInstanceName(_ctx.stringValue("ListCustomImagesResponse.CustomImages["+ i +"].InstanceName"));
			customImage.setResourceGroupId(_ctx.stringValue("ListCustomImagesResponse.CustomImages["+ i +"].ResourceGroupId"));
			customImage.setUserId(_ctx.longValue("ListCustomImagesResponse.CustomImages["+ i +"].UserId"));
			customImage.setOsType(_ctx.stringValue("ListCustomImagesResponse.CustomImages["+ i +"].OsType"));

			List<String> createInstances = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListCustomImagesResponse.CustomImages["+ i +"].CreateInstances.Length"); j++) {
				createInstances.add(_ctx.stringValue("ListCustomImagesResponse.CustomImages["+ i +"].CreateInstances["+ j +"]"));
			}
			customImage.setCreateInstances(createInstances);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListCustomImagesResponse.CustomImages["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListCustomImagesResponse.CustomImages["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListCustomImagesResponse.CustomImages["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			customImage.setTags(tags);

			customImages.add(customImage);
		}
		listCustomImagesResponse.setCustomImages(customImages);
	 
	 	return listCustomImagesResponse;
	}
}