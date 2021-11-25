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

	public static ListVideosResponse unmarshall(ListVideosResponse listVideosResponse, UnmarshallerContext _ctx) {
		
		listVideosResponse.setRequestId(_ctx.stringValue("ListVideosResponse.RequestId"));
		listVideosResponse.setNextMarker(_ctx.stringValue("ListVideosResponse.NextMarker"));
		listVideosResponse.setSetId(_ctx.stringValue("ListVideosResponse.SetId"));

		List<VideosItem> videos = new ArrayList<VideosItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVideosResponse.Videos.Length"); i++) {
			VideosItem videosItem = new VideosItem();
			videosItem.setCreateTime(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].CreateTime"));
			videosItem.setRemarksC(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].RemarksC"));
			videosItem.setVideoTagsFailReason(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].VideoTagsFailReason"));
			videosItem.setSourceType(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].SourceType"));
			videosItem.setCelebrityModifyTime(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].CelebrityModifyTime"));
			videosItem.setVideoDuration(_ctx.floatValue("ListVideosResponse.Videos["+ i +"].VideoDuration"));
			videosItem.setProcessModifyTime(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].ProcessModifyTime"));
			videosItem.setVideoFrames(_ctx.integerValue("ListVideosResponse.Videos["+ i +"].VideoFrames"));
			videosItem.setVideoTagsStatus(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].VideoTagsStatus"));
			videosItem.setExternalId(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].ExternalId"));
			videosItem.setSourceUri(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].SourceUri"));
			videosItem.setFileSize(_ctx.integerValue("ListVideosResponse.Videos["+ i +"].FileSize"));
			videosItem.setModifyTime(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].ModifyTime"));
			videosItem.setCelebrityFailReason(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].CelebrityFailReason"));
			videosItem.setSourcePosition(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].SourcePosition"));
			videosItem.setVideoWidth(_ctx.integerValue("ListVideosResponse.Videos["+ i +"].VideoWidth"));
			videosItem.setVideoFormat(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].VideoFormat"));
			videosItem.setVideoHeight(_ctx.integerValue("ListVideosResponse.Videos["+ i +"].VideoHeight"));
			videosItem.setRemarksD(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].RemarksD"));
			videosItem.setVideoUri(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].VideoUri"));
			videosItem.setProcessFailReason(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].ProcessFailReason"));
			videosItem.setVideoTagsModifyTime(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].VideoTagsModifyTime"));
			videosItem.setRemarksA(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].RemarksA"));
			videosItem.setCelebrityStatus(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].CelebrityStatus"));
			videosItem.setProcessStatus(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].ProcessStatus"));
			videosItem.setRemarksB(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].RemarksB"));

			List<VideoTagsItem> videoTags = new ArrayList<VideoTagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListVideosResponse.Videos["+ i +"].VideoTags.Length"); j++) {
				VideoTagsItem videoTagsItem = new VideoTagsItem();
				videoTagsItem.setTagName(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].VideoTags["+ j +"].TagName"));
				videoTagsItem.setTagConfidence(_ctx.floatValue("ListVideosResponse.Videos["+ i +"].VideoTags["+ j +"].TagConfidence"));
				videoTagsItem.setTagLevel(_ctx.integerValue("ListVideosResponse.Videos["+ i +"].VideoTags["+ j +"].TagLevel"));
				videoTagsItem.setParentTagName(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].VideoTags["+ j +"].ParentTagName"));

				videoTags.add(videoTagsItem);
			}
			videosItem.setVideoTags(videoTags);

			List<CelebrityItem> celebrity = new ArrayList<CelebrityItem>();
			for (int j = 0; j < _ctx.lengthValue("ListVideosResponse.Videos["+ i +"].Celebrity.Length"); j++) {
				CelebrityItem celebrityItem = new CelebrityItem();
				celebrityItem.setCelebrityNum(_ctx.integerValue("ListVideosResponse.Videos["+ i +"].Celebrity["+ j +"].CelebrityNum"));
				celebrityItem.setCelebrityName(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].Celebrity["+ j +"].CelebrityName"));
				celebrityItem.setCelebrityLibraryName(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].Celebrity["+ j +"].CelebrityLibraryName"));

				celebrity.add(celebrityItem);
			}
			videosItem.setCelebrity(celebrity);

			List<PersonsItem> persons = new ArrayList<PersonsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListVideosResponse.Videos["+ i +"].Persons.Length"); j++) {
				PersonsItem personsItem = new PersonsItem();
				personsItem.setGender(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].Persons["+ j +"].Gender"));
				personsItem.setAgeConfidence(_ctx.floatValue("ListVideosResponse.Videos["+ i +"].Persons["+ j +"].AgeConfidence"));
				personsItem.setGenderConfidence(_ctx.floatValue("ListVideosResponse.Videos["+ i +"].Persons["+ j +"].GenderConfidence"));
				personsItem.setAge(_ctx.integerValue("ListVideosResponse.Videos["+ i +"].Persons["+ j +"].Age"));
				personsItem.setPersonId(_ctx.stringValue("ListVideosResponse.Videos["+ i +"].Persons["+ j +"].PersonId"));

				persons.add(personsItem);
			}
			videosItem.setPersons(persons);

			videos.add(videosItem);
		}
		listVideosResponse.setVideos(videos);
	 
	 	return listVideosResponse;
	}
}