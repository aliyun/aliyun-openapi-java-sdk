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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.ListMediaResponse;
import com.aliyuncs.mts.model.v20140618.ListMediaResponse.Media;
import com.aliyuncs.mts.model.v20140618.ListMediaResponse.Media.File;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMediaResponseUnmarshaller {

	public static ListMediaResponse unmarshall(ListMediaResponse listMediaResponse, UnmarshallerContext _ctx) {
		
		listMediaResponse.setRequestId(_ctx.stringValue("ListMediaResponse.RequestId"));
		listMediaResponse.setNextPageToken(_ctx.stringValue("ListMediaResponse.NextPageToken"));

		List<Media> mediaList = new ArrayList<Media>();
		for (int i = 0; i < _ctx.lengthValue("ListMediaResponse.MediaList.Length"); i++) {
			Media media = new Media();
			media.setCreationTime(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].CreationTime"));
			media.setCateId(_ctx.longValue("ListMediaResponse.MediaList["+ i +"].CateId"));
			media.setHeight(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].Height"));
			media.setCensorState(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].CensorState"));
			media.setBitrate(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].Bitrate"));
			media.setMediaId(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].MediaId"));
			media.setPublishState(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].PublishState"));
			media.setDescription(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].Description"));
			media.setWidth(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].Width"));
			media.setSize(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].Size"));
			media.setCoverURL(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].CoverURL"));
			media.setDuration(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].Duration"));
			media.setFps(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].Fps"));
			media.setTitle(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].Title"));
			media.setFormat(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].Format"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListMediaResponse.MediaList["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].Tags["+ j +"]"));
			}
			media.setTags(tags);

			List<String> runIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListMediaResponse.MediaList["+ i +"].RunIdList.Length"); j++) {
				runIdList.add(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].RunIdList["+ j +"]"));
			}
			media.setRunIdList(runIdList);

			File file = new File();
			file.setState(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].File.State"));
			file.setURL(_ctx.stringValue("ListMediaResponse.MediaList["+ i +"].File.URL"));
			media.setFile(file);

			mediaList.add(media);
		}
		listMediaResponse.setMediaList(mediaList);
	 
	 	return listMediaResponse;
	}
}