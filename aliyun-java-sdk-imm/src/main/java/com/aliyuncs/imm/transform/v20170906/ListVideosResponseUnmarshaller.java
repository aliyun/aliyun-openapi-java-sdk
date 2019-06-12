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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.ListVideosResponse;
import com.aliyuncs.imm.model.v20170906.ListVideosResponse.VideosItem;
import com.aliyuncs.imm.model.v20170906.ListVideosResponse.VideosItem.CelebrityItem;
import com.aliyuncs.imm.model.v20170906.ListVideosResponse.VideosItem.PersonsItem;
import com.aliyuncs.imm.model.v20170906.ListVideosResponse.VideosItem.VideoTagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVideosResponseUnmarshaller {

	public static ListVideosResponse unmarshall(ListVideosResponse listVideosResponse, UnmarshallerContext context) {
		
		listVideosResponse.setRequestId(context.stringValue("ListVideosResponse.RequestId"));
		listVideosResponse.setSetId(context.stringValue("ListVideosResponse.SetId"));
		listVideosResponse.setNextMarker(context.stringValue("ListVideosResponse.NextMarker"));

		List<VideosItem> videos = new ArrayList<VideosItem>();
		for (int i = 0; i < context.lengthValue("ListVideosResponse.Videos.Length"); i++) {
			VideosItem videosItem = new VideosItem();
			videosItem.setVideoUri(context.stringValue("ListVideosResponse.Videos["+ i +"].VideoUri"));
			videosItem.setRemarksA(context.stringValue("ListVideosResponse.Videos["+ i +"].RemarksA"));
			videosItem.setRemarksB(context.stringValue("ListVideosResponse.Videos["+ i +"].RemarksB"));
			videosItem.setCreateTime(context.stringValue("ListVideosResponse.Videos["+ i +"].CreateTime"));
			videosItem.setModifyTime(context.stringValue("ListVideosResponse.Videos["+ i +"].ModifyTime"));
			videosItem.setVideoWidth(context.integerValue("ListVideosResponse.Videos["+ i +"].VideoWidth"));
			videosItem.setVideoHeight(context.integerValue("ListVideosResponse.Videos["+ i +"].VideoHeight"));
			videosItem.setVideoFormat(context.stringValue("ListVideosResponse.Videos["+ i +"].VideoFormat"));
			videosItem.setVideoDuration(context.floatValue("ListVideosResponse.Videos["+ i +"].VideoDuration"));
			videosItem.setFileSize(context.integerValue("ListVideosResponse.Videos["+ i +"].FileSize"));
			videosItem.setVideoFrames(context.integerValue("ListVideosResponse.Videos["+ i +"].VideoFrames"));
			videosItem.setSourceType(context.stringValue("ListVideosResponse.Videos["+ i +"].SourceType"));
			videosItem.setSourceUri(context.stringValue("ListVideosResponse.Videos["+ i +"].SourceUri"));
			videosItem.setSourcePosition(context.stringValue("ListVideosResponse.Videos["+ i +"].SourcePosition"));
			videosItem.setProcessStatus(context.stringValue("ListVideosResponse.Videos["+ i +"].ProcessStatus"));
			videosItem.setProcessModifyTime(context.stringValue("ListVideosResponse.Videos["+ i +"].ProcessModifyTime"));
			videosItem.setVideoTagsStatus(context.stringValue("ListVideosResponse.Videos["+ i +"].VideoTagsStatus"));
			videosItem.setVideoTagsModifyTime(context.stringValue("ListVideosResponse.Videos["+ i +"].VideoTagsModifyTime"));
			videosItem.setCelebrityStatus(context.stringValue("ListVideosResponse.Videos["+ i +"].CelebrityStatus"));
			videosItem.setCelebrityModifyTime(context.stringValue("ListVideosResponse.Videos["+ i +"].CelebrityModifyTime"));
			videosItem.setCelebrityFailReason(context.stringValue("ListVideosResponse.Videos["+ i +"].CelebrityFailReason"));
			videosItem.setVideoTagsFailReason(context.stringValue("ListVideosResponse.Videos["+ i +"].VideoTagsFailReason"));
			videosItem.setProcessFailReason(context.stringValue("ListVideosResponse.Videos["+ i +"].ProcessFailReason"));
			videosItem.setRemarksC(context.stringValue("ListVideosResponse.Videos["+ i +"].RemarksC"));
			videosItem.setRemarksD(context.stringValue("ListVideosResponse.Videos["+ i +"].RemarksD"));
			videosItem.setExternalId(context.stringValue("ListVideosResponse.Videos["+ i +"].ExternalId"));

			List<VideoTagsItem> videoTags = new ArrayList<VideoTagsItem>();
			for (int j = 0; j < context.lengthValue("ListVideosResponse.Videos["+ i +"].VideoTags.Length"); j++) {
				VideoTagsItem videoTagsItem = new VideoTagsItem();
				videoTagsItem.setVideoTagName(context.stringValue("ListVideosResponse.Videos["+ i +"].VideoTags["+ j +"].VideoTagName"));
				videoTagsItem.setVideoTagEnName(context.stringValue("ListVideosResponse.Videos["+ i +"].VideoTags["+ j +"].VideoTagEnName"));
				videoTagsItem.setVideoTagConfidence(context.floatValue("ListVideosResponse.Videos["+ i +"].VideoTags["+ j +"].VideoTagConfidence"));

				videoTags.add(videoTagsItem);
			}
			videosItem.setVideoTags(videoTags);

			List<CelebrityItem> celebrity = new ArrayList<CelebrityItem>();
			for (int j = 0; j < context.lengthValue("ListVideosResponse.Videos["+ i +"].Celebrity.Length"); j++) {
				CelebrityItem celebrityItem = new CelebrityItem();
				celebrityItem.setCelebrityName(context.stringValue("ListVideosResponse.Videos["+ i +"].Celebrity["+ j +"].CelebrityName"));
				celebrityItem.setCelebrityNum(context.integerValue("ListVideosResponse.Videos["+ i +"].Celebrity["+ j +"].CelebrityNum"));
				celebrityItem.setCelebrityLibraryName(context.stringValue("ListVideosResponse.Videos["+ i +"].Celebrity["+ j +"].CelebrityLibraryName"));

				celebrity.add(celebrityItem);
			}
			videosItem.setCelebrity(celebrity);

			List<PersonsItem> persons = new ArrayList<PersonsItem>();
			for (int j = 0; j < context.lengthValue("ListVideosResponse.Videos["+ i +"].Persons.Length"); j++) {
				PersonsItem personsItem = new PersonsItem();
				personsItem.setPersonId(context.stringValue("ListVideosResponse.Videos["+ i +"].Persons["+ j +"].PersonId"));
				personsItem.setAge(context.integerValue("ListVideosResponse.Videos["+ i +"].Persons["+ j +"].Age"));
				personsItem.setAgeConfidence(context.floatValue("ListVideosResponse.Videos["+ i +"].Persons["+ j +"].AgeConfidence"));
				personsItem.setGender(context.stringValue("ListVideosResponse.Videos["+ i +"].Persons["+ j +"].Gender"));
				personsItem.setGenderConfidence(context.floatValue("ListVideosResponse.Videos["+ i +"].Persons["+ j +"].GenderConfidence"));

				persons.add(personsItem);
			}
			videosItem.setPersons(persons);

			videos.add(videosItem);
		}
		listVideosResponse.setVideos(videos);
	 
	 	return listVideosResponse;
	}
}