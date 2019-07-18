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
import com.aliyuncs.vod.model.v20170321.SearchMediaResponse.Media.AttachedMedia;
import com.aliyuncs.vod.model.v20170321.SearchMediaResponse.Media.AttachedMedia.Category;
import com.aliyuncs.vod.model.v20170321.SearchMediaResponse.Media.Audio;
import com.aliyuncs.vod.model.v20170321.SearchMediaResponse.Media.Audio.PlayInfo4;
import com.aliyuncs.vod.model.v20170321.SearchMediaResponse.Media.Image;
import com.aliyuncs.vod.model.v20170321.SearchMediaResponse.Media.Video;
import com.aliyuncs.vod.model.v20170321.SearchMediaResponse.Media.Video.PlayInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchMediaResponseUnmarshaller {

	public static SearchMediaResponse unmarshall(SearchMediaResponse searchMediaResponse, UnmarshallerContext _ctx) {
		
		searchMediaResponse.setRequestId(_ctx.stringValue("SearchMediaResponse.RequestId"));
		searchMediaResponse.setScrollToken(_ctx.stringValue("SearchMediaResponse.ScrollToken"));
		searchMediaResponse.setTotal(_ctx.longValue("SearchMediaResponse.Total"));

		List<Media> mediaList = new ArrayList<Media>();
		for (int i = 0; i < _ctx.lengthValue("SearchMediaResponse.MediaList.Length"); i++) {
			Media media = new Media();
			media.setMediaType(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaType"));
			media.setCreationTime(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].CreationTime"));
			media.setMediaId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaId"));

			Video video = new Video();
			video.setVideoId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.VideoId"));
			video.setMediaSource(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.MediaSource"));
			video.setMediaType(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.MediaType"));
			video.setTitle(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.Title"));
			video.setTags(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.Tags"));
			video.setStatus(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.Status"));
			video.setSize(_ctx.longValue("SearchMediaResponse.MediaList["+ i +"].Video.Size"));
			video.setDuration(_ctx.floatValue("SearchMediaResponse.MediaList["+ i +"].Video.Duration"));
			video.setDescription(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.Description"));
			video.setModificationTime(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.ModificationTime"));
			video.setCreationTime(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.CreationTime"));
			video.setCoverURL(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.CoverURL"));
			video.setCateId(_ctx.longValue("SearchMediaResponse.MediaList["+ i +"].Video.CateId"));
			video.setCateName(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.CateName"));
			video.setDownloadSwitch(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.DownloadSwitch"));
			video.setPreprocessStatus(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PreprocessStatus"));
			video.setStorageLocation(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.StorageLocation"));
			video.setRegionId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.RegionId"));
			video.setTranscodeMode(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.TranscodeMode"));
			video.setAuditStatus(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.AuditStatus"));
			video.setAuditAIStatus(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.AuditAIStatus"));
			video.setAuditManualStatus(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.AuditManualStatus"));
			video.setAuditAIResult(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.AuditAIResult"));
			video.setAuditTemplateId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.AuditTemplateId"));
			video.setCustomMediaInfo(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.CustomMediaInfo"));
			video.setAppId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.AppId"));

			List<String> snapshots = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchMediaResponse.MediaList["+ i +"].Video.Snapshots.Length"); j++) {
				snapshots.add(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.Snapshots["+ j +"]"));
			}
			video.setSnapshots(snapshots);

			List<String> spriteSnapshots = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchMediaResponse.MediaList["+ i +"].Video.SpriteSnapshots.Length"); j++) {
				spriteSnapshots.add(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.SpriteSnapshots["+ j +"]"));
			}
			video.setSpriteSnapshots(spriteSnapshots);

			List<PlayInfo> playInfoList = new ArrayList<PlayInfo>();
			for (int j = 0; j < _ctx.lengthValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList.Length"); j++) {
				PlayInfo playInfo = new PlayInfo();
				playInfo.setWidth(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Width"));
				playInfo.setHeight(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Height"));
				playInfo.setSize(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Size"));
				playInfo.setPlayURL(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].PlayURL"));
				playInfo.setBitrate(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Bitrate"));
				playInfo.setDefinition(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Definition"));
				playInfo.setDuration(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Duration"));
				playInfo.setFormat(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Format"));
				playInfo.setFps(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Fps"));
				playInfo.setEncrypt(_ctx.longValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Encrypt"));
				playInfo.setPlaintext(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Plaintext"));
				playInfo.setComplexity(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Complexity"));
				playInfo.setStreamType(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].StreamType"));
				playInfo.setRand(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Rand"));
				playInfo.setJobId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].JobId"));

				playInfoList.add(playInfo);
			}
			video.setPlayInfoList(playInfoList);
			media.setVideo(video);

			Audio audio = new Audio();
			audio.setAudioId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.AudioId"));
			audio.setMediaSource(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.MediaSource"));
			audio.setTitle(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.Title"));
			audio.setTags(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.Tags"));
			audio.setStatus(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.Status"));
			audio.setSize(_ctx.longValue("SearchMediaResponse.MediaList["+ i +"].Audio.Size"));
			audio.setDuration(_ctx.floatValue("SearchMediaResponse.MediaList["+ i +"].Audio.Duration"));
			audio.setDescription(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.Description"));
			audio.setModificationTime(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.ModificationTime"));
			audio.setCreationTime(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.CreationTime"));
			audio.setCoverURL(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.CoverURL"));
			audio.setCateId(_ctx.longValue("SearchMediaResponse.MediaList["+ i +"].Audio.CateId"));
			audio.setCateName(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.CateName"));
			audio.setDownloadSwitch(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.DownloadSwitch"));
			audio.setPreprocessStatus(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PreprocessStatus"));
			audio.setStorageLocation(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.StorageLocation"));
			audio.setRegionId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.RegionId"));
			audio.setTranscodeMode(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.TranscodeMode"));
			audio.setAuditStatus(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.AuditStatus"));
			audio.setAuditAIStatus(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.AuditAIStatus"));
			audio.setAuditManualStatus(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.AuditManualStatus"));
			audio.setAuditAIResult(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.AuditAIResult"));
			audio.setAuditTemplateId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.AuditTemplateId"));
			audio.setCustomMediaInfo(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.CustomMediaInfo"));
			audio.setAppId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.AppId"));

			List<String> snapshots1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchMediaResponse.MediaList["+ i +"].Audio.Snapshots.Length"); j++) {
				snapshots1.add(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.Snapshots["+ j +"]"));
			}
			audio.setSnapshots1(snapshots1);

			List<String> spriteSnapshots2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchMediaResponse.MediaList["+ i +"].Audio.SpriteSnapshots.Length"); j++) {
				spriteSnapshots2.add(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.SpriteSnapshots["+ j +"]"));
			}
			audio.setSpriteSnapshots2(spriteSnapshots2);

			List<PlayInfo4> playInfoList3 = new ArrayList<PlayInfo4>();
			for (int j = 0; j < _ctx.lengthValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList.Length"); j++) {
				PlayInfo4 playInfo4 = new PlayInfo4();
				playInfo4.setWidth(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Width"));
				playInfo4.setHeight(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Height"));
				playInfo4.setSize(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Size"));
				playInfo4.setPlayURL(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].PlayURL"));
				playInfo4.setBitrate(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Bitrate"));
				playInfo4.setDefinition(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Definition"));
				playInfo4.setDuration(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Duration"));
				playInfo4.setFormat(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Format"));
				playInfo4.setFps(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Fps"));
				playInfo4.setEncrypt(_ctx.longValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Encrypt"));
				playInfo4.setPlaintext(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Plaintext"));
				playInfo4.setComplexity(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Complexity"));
				playInfo4.setStreamType(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].StreamType"));
				playInfo4.setRand(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Rand"));
				playInfo4.setJobId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].JobId"));

				playInfoList3.add(playInfo4);
			}
			audio.setPlayInfoList3(playInfoList3);
			media.setAudio(audio);

			Image image = new Image();
			image.setTitle(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.Title"));
			image.setImageId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.ImageId"));
			image.setCateId(_ctx.longValue("SearchMediaResponse.MediaList["+ i +"].Image.CateId"));
			image.setCateName(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.CateName"));
			image.setExt(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.Ext"));
			image.setCreationTime(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.CreationTime"));
			image.setModificationTime(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.ModificationTime"));
			image.setTags(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.Tags"));
			image.setType(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.Type"));
			image.setURL(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.URL"));
			image.setStatus(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.Status"));
			image.setDescription(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.Description"));
			image.setStorageLocation(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.StorageLocation"));
			image.setRegionId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.RegionId"));
			image.setAppId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.AppId"));
			media.setImage(image);

			AttachedMedia attachedMedia = new AttachedMedia();
			attachedMedia.setTitle(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Title"));
			attachedMedia.setMediaId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.MediaId"));
			attachedMedia.setExt(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Ext"));
			attachedMedia.setCreationTime(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.CreationTime"));
			attachedMedia.setModificationTime(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.ModificationTime"));
			attachedMedia.setTags(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Tags"));
			attachedMedia.setBusinessType(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.BusinessType"));
			attachedMedia.setURL(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.URL"));
			attachedMedia.setStatus(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Status"));
			attachedMedia.setDescription(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Description"));
			attachedMedia.setStorageLocation(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.StorageLocation"));
			attachedMedia.setRegionId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.RegionId"));
			attachedMedia.setAppId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.AppId"));
			attachedMedia.setIcon(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Icon"));
			attachedMedia.setOnlineStatus(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.OnlineStatus"));

			List<Category> categories = new ArrayList<Category>();
			for (int j = 0; j < _ctx.lengthValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Categories.Length"); j++) {
				Category category = new Category();
				category.setCateId(_ctx.longValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Categories["+ j +"].CateId"));
				category.setCateName(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Categories["+ j +"].CateName"));
				category.setLevel(_ctx.longValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Categories["+ j +"].Level"));
				category.setParentId(_ctx.longValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Categories["+ j +"].ParentId"));

				categories.add(category);
			}
			attachedMedia.setCategories(categories);
			media.setAttachedMedia(attachedMedia);

			mediaList.add(media);
		}
		searchMediaResponse.setMediaList(mediaList);
	 
	 	return searchMediaResponse;
	}
}