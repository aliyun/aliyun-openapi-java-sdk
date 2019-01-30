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

import com.aliyuncs.vod.model.v20170321.GetVideoInfosResponse;
import com.aliyuncs.vod.model.v20170321.GetVideoInfosResponse.Video;
import com.aliyuncs.vod.model.v20170321.GetVideoInfosResponse.Video.Thumbnail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVideoInfosResponseUnmarshaller {

	public static GetVideoInfosResponse unmarshall(GetVideoInfosResponse getVideoInfosResponse, UnmarshallerContext context) {
		
		getVideoInfosResponse.setRequestId(context.stringValue("GetVideoInfosResponse.RequestId"));

		List<String> nonExistVideoIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetVideoInfosResponse.NonExistVideoIds.Length"); i++) {
			nonExistVideoIds.add(context.stringValue("GetVideoInfosResponse.NonExistVideoIds["+ i +"]"));
		}
		getVideoInfosResponse.setNonExistVideoIds(nonExistVideoIds);

		List<Video> videoList = new ArrayList<Video>();
		for (int i = 0; i < context.lengthValue("GetVideoInfosResponse.VideoList.Length"); i++) {
			Video video = new Video();
			video.setVideoId(context.stringValue("GetVideoInfosResponse.VideoList["+ i +"].VideoId"));
			video.setTitle(context.stringValue("GetVideoInfosResponse.VideoList["+ i +"].Title"));
			video.setTags(context.stringValue("GetVideoInfosResponse.VideoList["+ i +"].Tags"));
			video.setStatus(context.stringValue("GetVideoInfosResponse.VideoList["+ i +"].Status"));
			video.setSize(context.longValue("GetVideoInfosResponse.VideoList["+ i +"].Size"));
			video.setDuration(context.floatValue("GetVideoInfosResponse.VideoList["+ i +"].Duration"));
			video.setDescription(context.stringValue("GetVideoInfosResponse.VideoList["+ i +"].Description"));
			video.setModificationTime(context.stringValue("GetVideoInfosResponse.VideoList["+ i +"].ModificationTime"));
			video.setCreationTime(context.stringValue("GetVideoInfosResponse.VideoList["+ i +"].CreationTime"));
			video.setCoverURL(context.stringValue("GetVideoInfosResponse.VideoList["+ i +"].CoverURL"));
			video.setCateId(context.longValue("GetVideoInfosResponse.VideoList["+ i +"].CateId"));
			video.setCateName(context.stringValue("GetVideoInfosResponse.VideoList["+ i +"].CateName"));
			video.setDownloadSwitch(context.stringValue("GetVideoInfosResponse.VideoList["+ i +"].DownloadSwitch"));
			video.setTemplateGroupId(context.stringValue("GetVideoInfosResponse.VideoList["+ i +"].TemplateGroupId"));
			video.setPreprocessStatus(context.stringValue("GetVideoInfosResponse.VideoList["+ i +"].PreprocessStatus"));
			video.setStorageLocation(context.stringValue("GetVideoInfosResponse.VideoList["+ i +"].StorageLocation"));
			video.setRegionId(context.stringValue("GetVideoInfosResponse.VideoList["+ i +"].RegionId"));

			List<String> snapshots = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetVideoInfosResponse.VideoList["+ i +"].Snapshots.Length"); j++) {
				snapshots.add(context.stringValue("GetVideoInfosResponse.VideoList["+ i +"].Snapshots["+ j +"]"));
			}
			video.setSnapshots(snapshots);

			List<Thumbnail> thumbnailList = new ArrayList<Thumbnail>();
			for (int j = 0; j < context.lengthValue("GetVideoInfosResponse.VideoList["+ i +"].ThumbnailList.Length"); j++) {
				Thumbnail thumbnail = new Thumbnail();
				thumbnail.setURL(context.stringValue("GetVideoInfosResponse.VideoList["+ i +"].ThumbnailList["+ j +"].URL"));

				thumbnailList.add(thumbnail);
			}
			video.setThumbnailList(thumbnailList);

			videoList.add(video);
		}
		getVideoInfosResponse.setVideoList(videoList);
	 
	 	return getVideoInfosResponse;
	}
}