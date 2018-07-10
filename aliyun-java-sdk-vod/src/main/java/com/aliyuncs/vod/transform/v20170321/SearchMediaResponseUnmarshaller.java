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

import com.aliyuncs.vod.model.v20170321.SearchMediaResponse;
import com.aliyuncs.vod.model.v20170321.SearchMediaResponse.Media;
import com.aliyuncs.vod.model.v20170321.SearchMediaResponse.Media.Video;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchMediaResponseUnmarshaller {

	public static SearchMediaResponse unmarshall(SearchMediaResponse searchMediaResponse, UnmarshallerContext context) {
		
		searchMediaResponse.setRequestId(context.stringValue("SearchMediaResponse.RequestId"));
		searchMediaResponse.setScrollToken(context.stringValue("SearchMediaResponse.ScrollToken"));
		searchMediaResponse.setTotal(context.longValue("SearchMediaResponse.Total"));

		List<Media> mediaList = new ArrayList<Media>();
		for (int i = 0; i < context.lengthValue("SearchMediaResponse.MediaList.Length"); i++) {
			Media media = new Media();
			media.setMediaType(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaType"));
			media.setCreationTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].CreationTime"));
			media.setMediaType1(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaType"));
			media.setMediaId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaId"));

			Video video = new Video();
			video.setVideoId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.VideoId"));
			video.setMediaSource(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.MediaSource"));
			video.setMediaType(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.MediaType"));
			video.setTitle(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.Title"));
			video.setTags(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.Tags"));
			video.setStatus(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.Status"));
			video.setSize(context.longValue("SearchMediaResponse.MediaList["+ i +"].Video.Size"));
			video.setDuration(context.floatValue("SearchMediaResponse.MediaList["+ i +"].Video.Duration"));
			video.setDescription(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.Description"));
			video.setCustomerId(context.longValue("SearchMediaResponse.MediaList["+ i +"].Video.CustomerId"));
			video.setModificationTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.ModificationTime"));
			video.setCreationTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.CreationTime"));
			video.setCoverURL(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.CoverURL"));
			video.setCateId(context.longValue("SearchMediaResponse.MediaList["+ i +"].Video.CateId"));
			video.setCateName(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.CateName"));
			video.setDownloadSwitch(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.DownloadSwitch"));
			video.setPreprocessStatus(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PreprocessStatus"));
			video.setStorageLocation(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.StorageLocation"));
			video.setRegionId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.RegionId"));

			List<String> snapshots = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("SearchMediaResponse.MediaList["+ i +"].Video.Snapshots.Length"); j++) {
				snapshots.add(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.Snapshots["+ j +"]"));
			}
			video.setSnapshots(snapshots);

			List<String> spriteSnapshots = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("SearchMediaResponse.MediaList["+ i +"].Video.SpriteSnapshots.Length"); j++) {
				spriteSnapshots.add(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.SpriteSnapshots["+ j +"]"));
			}
			video.setSpriteSnapshots(spriteSnapshots);
			media.setVideo(video);

			mediaList.add(media);
		}
		searchMediaResponse.setMediaList(mediaList);
	 
	 	return searchMediaResponse;
	}
}