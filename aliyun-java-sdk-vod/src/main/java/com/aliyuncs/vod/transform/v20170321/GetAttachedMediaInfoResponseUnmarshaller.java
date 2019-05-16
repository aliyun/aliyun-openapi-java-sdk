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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetAttachedMediaInfoResponse;
import com.aliyuncs.vod.model.v20170321.GetAttachedMediaInfoResponse.AttachedMedia;
import com.aliyuncs.vod.model.v20170321.GetAttachedMediaInfoResponse.AttachedMedia.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAttachedMediaInfoResponseUnmarshaller {

	public static GetAttachedMediaInfoResponse unmarshall(GetAttachedMediaInfoResponse getAttachedMediaInfoResponse, UnmarshallerContext context) {
		
		getAttachedMediaInfoResponse.setRequestId(context.stringValue("GetAttachedMediaInfoResponse.RequestId"));

		List<String> nonExistMediaIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetAttachedMediaInfoResponse.NonExistMediaIds.Length"); i++) {
			nonExistMediaIds.add(context.stringValue("GetAttachedMediaInfoResponse.NonExistMediaIds["+ i +"]"));
		}
		getAttachedMediaInfoResponse.setNonExistMediaIds(nonExistMediaIds);

		List<AttachedMedia> attachedMediaList = new ArrayList<AttachedMedia>();
		for (int i = 0; i < context.lengthValue("GetAttachedMediaInfoResponse.AttachedMediaList.Length"); i++) {
			AttachedMedia attachedMedia = new AttachedMedia();
			attachedMedia.setMediaId(context.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].MediaId"));
			attachedMedia.setTitle(context.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Title"));
			attachedMedia.setType(context.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Type"));
			attachedMedia.setTags(context.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Tags"));
			attachedMedia.setURL(context.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].URL"));
			attachedMedia.setDescription(context.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Description"));
			attachedMedia.setFileSize(context.longValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].FileSize"));
			attachedMedia.setStorageLocation(context.longValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].StorageLocation"));
			attachedMedia.setCreationTime(context.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].CreationTime"));
			attachedMedia.setModificationTime(context.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].ModificationTime"));
			attachedMedia.setAppId(context.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].AppId"));
			attachedMedia.setStatus(context.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Status"));
			attachedMedia.setOnlineStatus(context.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].OnlineStatus"));
			attachedMedia.setIcon(context.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Icon"));
			attachedMedia.setRegionId(context.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].RegionId"));

			List<Category> categories = new ArrayList<Category>();
			for (int j = 0; j < context.lengthValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Categories.Length"); j++) {
				Category category = new Category();
				category.setCateId(context.longValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Categories["+ j +"].CateId"));
				category.setCateName(context.stringValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Categories["+ j +"].CateName"));
				category.setLevel(context.longValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Categories["+ j +"].Level"));
				category.setParentId(context.longValue("GetAttachedMediaInfoResponse.AttachedMediaList["+ i +"].Categories["+ j +"].ParentId"));

				categories.add(category);
			}
			attachedMedia.setCategories(categories);

			attachedMediaList.add(attachedMedia);
		}
		getAttachedMediaInfoResponse.setAttachedMediaList(attachedMediaList);
	 
	 	return getAttachedMediaInfoResponse;
	}
}