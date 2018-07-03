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

import com.aliyuncs.vod.model.v20170321.GetVideoInfoResponse;
import com.aliyuncs.vod.model.v20170321.GetVideoInfoResponse.Video;
import com.aliyuncs.vod.model.v20170321.GetVideoInfoResponse.Video.Thumbnail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVideoInfoResponseUnmarshaller {

	public static GetVideoInfoResponse unmarshall(GetVideoInfoResponse getVideoInfoResponse, UnmarshallerContext context) {
		
		getVideoInfoResponse.setRequestId(context.stringValue("GetVideoInfoResponse.RequestId"));
		getVideoInfoResponse.setAI(context.stringValue("GetVideoInfoResponse.AI"));

		Video video = new Video();
		video.setVideoId(context.stringValue("GetVideoInfoResponse.Video.VideoId"));
		video.setTitle(context.stringValue("GetVideoInfoResponse.Video.Title"));
		video.setTags(context.stringValue("GetVideoInfoResponse.Video.Tags"));
		video.setStatus(context.stringValue("GetVideoInfoResponse.Video.Status"));
		video.setSize(context.longValue("GetVideoInfoResponse.Video.Size"));
		video.setDuration(context.floatValue("GetVideoInfoResponse.Video.Duration"));
		video.setDescription(context.stringValue("GetVideoInfoResponse.Video.Description"));
		video.setCreateTime(context.stringValue("GetVideoInfoResponse.Video.CreateTime"));
		video.setModifyTime(context.stringValue("GetVideoInfoResponse.Video.ModifyTime"));
		video.setModificationTime(context.stringValue("GetVideoInfoResponse.Video.ModificationTime"));
		video.setCreationTime(context.stringValue("GetVideoInfoResponse.Video.CreationTime"));
		video.setCoverURL(context.stringValue("GetVideoInfoResponse.Video.CoverURL"));
		video.setCateId(context.longValue("GetVideoInfoResponse.Video.CateId"));
		video.setCateName(context.stringValue("GetVideoInfoResponse.Video.CateName"));
		video.setPreprocessStatus(context.stringValue("GetVideoInfoResponse.Video.PreprocessStatus"));

		List<String> snapshots = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetVideoInfoResponse.Video.Snapshots.Length"); i++) {
			snapshots.add(context.stringValue("GetVideoInfoResponse.Video.Snapshots["+ i +"]"));
		}
		video.setSnapshots(snapshots);

		List<Thumbnail> thumbnailList = new ArrayList<Thumbnail>();
		for (int i = 0; i < context.lengthValue("GetVideoInfoResponse.Video.ThumbnailList.Length"); i++) {
			Thumbnail thumbnail = new Thumbnail();
			thumbnail.setURL(context.stringValue("GetVideoInfoResponse.Video.ThumbnailList["+ i +"].URL"));

			thumbnailList.add(thumbnail);
		}
		video.setThumbnailList(thumbnailList);
		getVideoInfoResponse.setVideo(video);
	 
	 	return getVideoInfoResponse;
	}
}