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

	public static GetVideoInfoResponse unmarshall(GetVideoInfoResponse getVideoInfoResponse, UnmarshallerContext _ctx) {
		
		getVideoInfoResponse.setRequestId(_ctx.stringValue("GetVideoInfoResponse.RequestId"));
		getVideoInfoResponse.setAI(_ctx.stringValue("GetVideoInfoResponse.AI"));

		Video video = new Video();
		video.setStorageLocation(_ctx.stringValue("GetVideoInfoResponse.Video.StorageLocation"));
		video.setCreationTime(_ctx.stringValue("GetVideoInfoResponse.Video.CreationTime"));
		video.setStatus(_ctx.stringValue("GetVideoInfoResponse.Video.Status"));
		video.setCateId(_ctx.longValue("GetVideoInfoResponse.Video.CateId"));
		video.setVideoId(_ctx.stringValue("GetVideoInfoResponse.Video.VideoId"));
		video.setCreateTime(_ctx.stringValue("GetVideoInfoResponse.Video.CreateTime"));
		video.setDownloadSwitch(_ctx.stringValue("GetVideoInfoResponse.Video.DownloadSwitch"));
		video.setTags(_ctx.stringValue("GetVideoInfoResponse.Video.Tags"));
		video.setModificationTime(_ctx.stringValue("GetVideoInfoResponse.Video.ModificationTime"));
		video.setRegionId(_ctx.stringValue("GetVideoInfoResponse.Video.RegionId"));
		video.setCustomMediaInfo(_ctx.stringValue("GetVideoInfoResponse.Video.CustomMediaInfo"));
		video.setCateName(_ctx.stringValue("GetVideoInfoResponse.Video.CateName"));
		video.setDescription(_ctx.stringValue("GetVideoInfoResponse.Video.Description"));
		video.setPreprocessStatus(_ctx.stringValue("GetVideoInfoResponse.Video.PreprocessStatus"));
		video.setAppId(_ctx.stringValue("GetVideoInfoResponse.Video.AppId"));
		video.setSize(_ctx.longValue("GetVideoInfoResponse.Video.Size"));
		video.setCoverURL(_ctx.stringValue("GetVideoInfoResponse.Video.CoverURL"));
		video.setTemplateGroupId(_ctx.stringValue("GetVideoInfoResponse.Video.TemplateGroupId"));
		video.setDuration(_ctx.floatValue("GetVideoInfoResponse.Video.Duration"));
		video.setTitle(_ctx.stringValue("GetVideoInfoResponse.Video.Title"));
		video.setAuditStatus(_ctx.stringValue("GetVideoInfoResponse.Video.AuditStatus"));
		video.setModifyTime(_ctx.stringValue("GetVideoInfoResponse.Video.ModifyTime"));

		List<String> snapshots = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetVideoInfoResponse.Video.Snapshots.Length"); i++) {
			snapshots.add(_ctx.stringValue("GetVideoInfoResponse.Video.Snapshots["+ i +"]"));
		}
		video.setSnapshots(snapshots);

		List<Thumbnail> thumbnailList = new ArrayList<Thumbnail>();
		for (int i = 0; i < _ctx.lengthValue("GetVideoInfoResponse.Video.ThumbnailList.Length"); i++) {
			Thumbnail thumbnail = new Thumbnail();
			thumbnail.setURL(_ctx.stringValue("GetVideoInfoResponse.Video.ThumbnailList["+ i +"].URL"));

			thumbnailList.add(thumbnail);
		}
		video.setThumbnailList(thumbnailList);
		getVideoInfoResponse.setVideo(video);
	 
	 	return getVideoInfoResponse;
	}
}