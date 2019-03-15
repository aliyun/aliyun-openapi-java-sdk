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

	public static ListMediaResponse unmarshall(ListMediaResponse listMediaResponse, UnmarshallerContext context) {
		
		listMediaResponse.setRequestId(context.stringValue("ListMediaResponse.RequestId"));
		listMediaResponse.setNextPageToken(context.stringValue("ListMediaResponse.NextPageToken"));

		List<Media> mediaList = new ArrayList<Media>();
		for (int i = 0; i < context.lengthValue("ListMediaResponse.MediaList.Length"); i++) {
			Media media = new Media();
			media.setMediaId(context.stringValue("ListMediaResponse.MediaList["+ i +"].MediaId"));
			media.setTitle(context.stringValue("ListMediaResponse.MediaList["+ i +"].Title"));
			media.setDescription(context.stringValue("ListMediaResponse.MediaList["+ i +"].Description"));
			media.setCoverURL(context.stringValue("ListMediaResponse.MediaList["+ i +"].CoverURL"));
			media.setCateId(context.longValue("ListMediaResponse.MediaList["+ i +"].CateId"));
			media.setDuration(context.stringValue("ListMediaResponse.MediaList["+ i +"].Duration"));
			media.setFormat(context.stringValue("ListMediaResponse.MediaList["+ i +"].Format"));
			media.setSize(context.stringValue("ListMediaResponse.MediaList["+ i +"].Size"));
			media.setBitrate(context.stringValue("ListMediaResponse.MediaList["+ i +"].Bitrate"));
			media.setWidth(context.stringValue("ListMediaResponse.MediaList["+ i +"].Width"));
			media.setHeight(context.stringValue("ListMediaResponse.MediaList["+ i +"].Height"));
			media.setFps(context.stringValue("ListMediaResponse.MediaList["+ i +"].Fps"));
			media.setPublishState(context.stringValue("ListMediaResponse.MediaList["+ i +"].PublishState"));
			media.setCensorState(context.stringValue("ListMediaResponse.MediaList["+ i +"].CensorState"));
			media.setCreationTime(context.stringValue("ListMediaResponse.MediaList["+ i +"].CreationTime"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListMediaResponse.MediaList["+ i +"].Tags.Length"); j++) {
				tags.add(context.stringValue("ListMediaResponse.MediaList["+ i +"].Tags["+ j +"]"));
			}
			media.setTags(tags);

			List<String> runIdList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListMediaResponse.MediaList["+ i +"].RunIdList.Length"); j++) {
				runIdList.add(context.stringValue("ListMediaResponse.MediaList["+ i +"].RunIdList["+ j +"]"));
			}
			media.setRunIdList(runIdList);

			File file = new File();
			file.setURL(context.stringValue("ListMediaResponse.MediaList["+ i +"].File.URL"));
			file.setState(context.stringValue("ListMediaResponse.MediaList["+ i +"].File.State"));
			media.setFile(file);

			mediaList.add(media);
		}
		listMediaResponse.setMediaList(mediaList);
	 
	 	return listMediaResponse;
	}
}