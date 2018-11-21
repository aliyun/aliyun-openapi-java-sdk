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

import com.aliyuncs.vod.model.v20170321.GetVideoListResponse;
import com.aliyuncs.vod.model.v20170321.GetVideoListResponse.Video;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVideoListResponseUnmarshaller {

	public static GetVideoListResponse unmarshall(GetVideoListResponse getVideoListResponse, UnmarshallerContext context) {
		
		getVideoListResponse.setRequestId(context.stringValue("GetVideoListResponse.RequestId"));
		getVideoListResponse.setTotal(context.integerValue("GetVideoListResponse.Total"));

		List<Video> videoList = new ArrayList<Video>();
		for (int i = 0; i < context.lengthValue("GetVideoListResponse.VideoList.Length"); i++) {
			Video video = new Video();
			video.setVideoId(context.stringValue("GetVideoListResponse.VideoList["+ i +"].VideoId"));
			video.setTitle(context.stringValue("GetVideoListResponse.VideoList["+ i +"].Title"));
			video.setTags(context.stringValue("GetVideoListResponse.VideoList["+ i +"].Tags"));
			video.setStatus(context.stringValue("GetVideoListResponse.VideoList["+ i +"].Status"));
			video.setSize(context.longValue("GetVideoListResponse.VideoList["+ i +"].Size"));
			video.setDuration(context.floatValue("GetVideoListResponse.VideoList["+ i +"].Duration"));
			video.setDescription(context.stringValue("GetVideoListResponse.VideoList["+ i +"].Description"));
			video.setCreateTime(context.stringValue("GetVideoListResponse.VideoList["+ i +"].CreateTime"));
			video.setModifyTime(context.stringValue("GetVideoListResponse.VideoList["+ i +"].ModifyTime"));
			video.setModificationTime(context.stringValue("GetVideoListResponse.VideoList["+ i +"].ModificationTime"));
			video.setCreationTime(context.stringValue("GetVideoListResponse.VideoList["+ i +"].CreationTime"));
			video.setCoverURL(context.stringValue("GetVideoListResponse.VideoList["+ i +"].CoverURL"));
			video.setCateId(context.longValue("GetVideoListResponse.VideoList["+ i +"].CateId"));
			video.setCateName(context.stringValue("GetVideoListResponse.VideoList["+ i +"].CateName"));
			video.setStorageLocation(context.stringValue("GetVideoListResponse.VideoList["+ i +"].StorageLocation"));

			List<String> snapshots = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetVideoListResponse.VideoList["+ i +"].Snapshots.Length"); j++) {
				snapshots.add(context.stringValue("GetVideoListResponse.VideoList["+ i +"].Snapshots["+ j +"]"));
			}
			video.setSnapshots(snapshots);

			videoList.add(video);
		}
		getVideoListResponse.setVideoList(videoList);
	 
	 	return getVideoListResponse;
	}
}