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

	public static SearchMediaResponse unmarshall(SearchMediaResponse searchMediaResponse, UnmarshallerContext context) {
		
		searchMediaResponse.setRequestId(context.stringValue("SearchMediaResponse.RequestId"));
		searchMediaResponse.setScrollToken(context.stringValue("SearchMediaResponse.ScrollToken"));
		searchMediaResponse.setTotal(context.longValue("SearchMediaResponse.Total"));

		List<Media> mediaList = new ArrayList<Media>();
		for (int i = 0; i < context.lengthValue("SearchMediaResponse.MediaList.Length"); i++) {
			Media media = new Media();
			media.setMediaType(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaType"));
			media.setCreationTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].CreationTime"));
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
			video.setModificationTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.ModificationTime"));
			video.setCreationTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.CreationTime"));
			video.setCoverURL(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.CoverURL"));
			video.setCateId(context.longValue("SearchMediaResponse.MediaList["+ i +"].Video.CateId"));
			video.setCateName(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.CateName"));
			video.setDownloadSwitch(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.DownloadSwitch"));
			video.setPreprocessStatus(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PreprocessStatus"));
			video.setStorageLocation(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.StorageLocation"));
			video.setRegionId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.RegionId"));
			video.setTranscodeMode(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.TranscodeMode"));
			video.setAuditStatus(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.AuditStatus"));
			video.setAuditAIStatus(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.AuditAIStatus"));
			video.setAuditManualStatus(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.AuditManualStatus"));
			video.setAuditAIResult(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.AuditAIResult"));
			video.setAuditTemplateId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.AuditTemplateId"));
			video.setCustomMediaInfo(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.CustomMediaInfo"));
			video.setAppId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.AppId"));

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

			List<PlayInfo> playInfoList = new ArrayList<PlayInfo>();
			for (int j = 0; j < context.lengthValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList.Length"); j++) {
				PlayInfo playInfo = new PlayInfo();
				playInfo.setWidth(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Width"));
				playInfo.setHeight(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Height"));
				playInfo.setSize(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Size"));
				playInfo.setPlayURL(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].PlayURL"));
				playInfo.setBitrate(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Bitrate"));
				playInfo.setDefinition(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Definition"));
				playInfo.setDuration(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Duration"));
				playInfo.setFormat(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Format"));
				playInfo.setFps(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Fps"));
				playInfo.setEncrypt(context.longValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Encrypt"));
				playInfo.setPlaintext(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Plaintext"));
				playInfo.setComplexity(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Complexity"));
				playInfo.setStreamType(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].StreamType"));
				playInfo.setRand(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].Rand"));
				playInfo.setJobId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Video.PlayInfoList["+ j +"].JobId"));

				playInfoList.add(playInfo);
			}
			video.setPlayInfoList(playInfoList);
			media.setVideo(video);

			Audio audio = new Audio();
			audio.setAudioId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.AudioId"));
			audio.setMediaSource(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.MediaSource"));
			audio.setTitle(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.Title"));
			audio.setTags(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.Tags"));
			audio.setStatus(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.Status"));
			audio.setSize(context.longValue("SearchMediaResponse.MediaList["+ i +"].Audio.Size"));
			audio.setDuration(context.floatValue("SearchMediaResponse.MediaList["+ i +"].Audio.Duration"));
			audio.setDescription(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.Description"));
			audio.setModificationTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.ModificationTime"));
			audio.setCreationTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.CreationTime"));
			audio.setCoverURL(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.CoverURL"));
			audio.setCateId(context.longValue("SearchMediaResponse.MediaList["+ i +"].Audio.CateId"));
			audio.setCateName(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.CateName"));
			audio.setDownloadSwitch(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.DownloadSwitch"));
			audio.setPreprocessStatus(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PreprocessStatus"));
			audio.setStorageLocation(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.StorageLocation"));
			audio.setRegionId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.RegionId"));
			audio.setTranscodeMode(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.TranscodeMode"));
			audio.setAuditStatus(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.AuditStatus"));
			audio.setAuditAIStatus(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.AuditAIStatus"));
			audio.setAuditManualStatus(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.AuditManualStatus"));
			audio.setAuditAIResult(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.AuditAIResult"));
			audio.setAuditTemplateId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.AuditTemplateId"));
			audio.setCustomMediaInfo(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.CustomMediaInfo"));
			audio.setAppId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.AppId"));

			List<String> snapshots1 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("SearchMediaResponse.MediaList["+ i +"].Audio.Snapshots.Length"); j++) {
				snapshots1.add(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.Snapshots["+ j +"]"));
			}
			audio.setSnapshots1(snapshots1);

			List<String> spriteSnapshots2 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("SearchMediaResponse.MediaList["+ i +"].Audio.SpriteSnapshots.Length"); j++) {
				spriteSnapshots2.add(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.SpriteSnapshots["+ j +"]"));
			}
			audio.setSpriteSnapshots2(spriteSnapshots2);

			List<PlayInfo4> playInfoList3 = new ArrayList<PlayInfo4>();
			for (int j = 0; j < context.lengthValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList.Length"); j++) {
				PlayInfo4 playInfo4 = new PlayInfo4();
				playInfo4.setWidth(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Width"));
				playInfo4.setHeight(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Height"));
				playInfo4.setSize(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Size"));
				playInfo4.setPlayURL(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].PlayURL"));
				playInfo4.setBitrate(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Bitrate"));
				playInfo4.setDefinition(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Definition"));
				playInfo4.setDuration(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Duration"));
				playInfo4.setFormat(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Format"));
				playInfo4.setFps(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Fps"));
				playInfo4.setEncrypt(context.longValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Encrypt"));
				playInfo4.setPlaintext(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Plaintext"));
				playInfo4.setComplexity(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Complexity"));
				playInfo4.setStreamType(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].StreamType"));
				playInfo4.setRand(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].Rand"));
				playInfo4.setJobId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Audio.PlayInfoList["+ j +"].JobId"));

				playInfoList3.add(playInfo4);
			}
			audio.setPlayInfoList3(playInfoList3);
			media.setAudio(audio);

			Image image = new Image();
			image.setTitle(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.Title"));
			image.setImageId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.ImageId"));
			image.setCateId(context.longValue("SearchMediaResponse.MediaList["+ i +"].Image.CateId"));
			image.setCateName(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.CateName"));
			image.setExt(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.Ext"));
			image.setCreationTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.CreationTime"));
			image.setModificationTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.ModificationTime"));
			image.setTags(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.Tags"));
			image.setType(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.Type"));
			image.setURL(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.URL"));
			image.setStatus(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.Status"));
			image.setDescription(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.Description"));
			image.setStorageLocation(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.StorageLocation"));
			image.setRegionId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.RegionId"));
			image.setAppId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Image.AppId"));
			media.setImage(image);

			AttachedMedia attachedMedia = new AttachedMedia();
			attachedMedia.setTitle(context.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Title"));
			attachedMedia.setMediaId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.MediaId"));
			attachedMedia.setExt(context.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Ext"));
			attachedMedia.setCreationTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.CreationTime"));
			attachedMedia.setModificationTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.ModificationTime"));
			attachedMedia.setTags(context.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Tags"));
			attachedMedia.setBusinessType(context.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.BusinessType"));
			attachedMedia.setURL(context.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.URL"));
			attachedMedia.setStatus(context.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Status"));
			attachedMedia.setDescription(context.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Description"));
			attachedMedia.setStorageLocation(context.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.StorageLocation"));
			attachedMedia.setRegionId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.RegionId"));
			attachedMedia.setAppId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.AppId"));
			attachedMedia.setIcon(context.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Icon"));
			attachedMedia.setOnlineStatus(context.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.OnlineStatus"));

			List<Category> categories = new ArrayList<Category>();
			for (int j = 0; j < context.lengthValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Categories.Length"); j++) {
				Category category = new Category();
				category.setCateId(context.longValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Categories["+ j +"].CateId"));
				category.setCateName(context.stringValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Categories["+ j +"].CateName"));
				category.setLevel(context.longValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Categories["+ j +"].Level"));
				category.setParentId(context.longValue("SearchMediaResponse.MediaList["+ i +"].AttachedMedia.Categories["+ j +"].ParentId"));

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