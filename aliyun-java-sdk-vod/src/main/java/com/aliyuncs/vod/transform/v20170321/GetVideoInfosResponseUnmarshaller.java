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

	public static GetVideoInfosResponse unmarshall(GetVideoInfosResponse getVideoInfosResponse, UnmarshallerContext _ctx) {
		
		getVideoInfosResponse.setRequestId(_ctx.stringValue("GetVideoInfosResponse.RequestId"));

		List<String> nonExistVideoIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetVideoInfosResponse.NonExistVideoIds.Length"); i++) {
			nonExistVideoIds.add(_ctx.stringValue("GetVideoInfosResponse.NonExistVideoIds["+ i +"]"));
		}
		getVideoInfosResponse.setNonExistVideoIds(nonExistVideoIds);

		List<Video> videoList = new ArrayList<Video>();
		for (int i = 0; i < _ctx.lengthValue("GetVideoInfosResponse.VideoList.Length"); i++) {
			Video video = new Video();
			video.setVideoId(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].VideoId"));
			video.setTitle(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].Title"));
			video.setTags(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].Tags"));
			video.setStatus(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].Status"));
			video.setSize(_ctx.longValue("GetVideoInfosResponse.VideoList["+ i +"].Size"));
			video.setDuration(_ctx.floatValue("GetVideoInfosResponse.VideoList["+ i +"].Duration"));
			video.setDescription(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].Description"));
			video.setModificationTime(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].ModificationTime"));
			video.setCreationTime(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].CreationTime"));
			video.setCoverURL(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].CoverURL"));
			video.setCateId(_ctx.longValue("GetVideoInfosResponse.VideoList["+ i +"].CateId"));
			video.setCateName(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].CateName"));
			video.setDownloadSwitch(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].DownloadSwitch"));
			video.setTemplateGroupId(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].TemplateGroupId"));
			video.setPreprocessStatus(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].PreprocessStatus"));
			video.setStorageLocation(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].StorageLocation"));
			video.setRegionId(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].RegionId"));
			video.setCustomMediaInfo(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].CustomMediaInfo"));
			video.setAppId(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].AppId"));

			List<String> snapshots = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetVideoInfosResponse.VideoList["+ i +"].Snapshots.Length"); j++) {
				snapshots.add(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].Snapshots["+ j +"]"));
			}
			video.setSnapshots(snapshots);

			List<Thumbnail> thumbnailList = new ArrayList<Thumbnail>();
			for (int j = 0; j < _ctx.lengthValue("GetVideoInfosResponse.VideoList["+ i +"].ThumbnailList.Length"); j++) {
				Thumbnail thumbnail = new Thumbnail();
				thumbnail.setURL(_ctx.stringValue("GetVideoInfosResponse.VideoList["+ i +"].ThumbnailList["+ j +"].URL"));

				thumbnailList.add(thumbnail);
			}
			video.setThumbnailList(thumbnailList);

			videoList.add(video);
		}
		getVideoInfosResponse.setVideoList(videoList);
	 
	 	return getVideoInfosResponse;
	}
}