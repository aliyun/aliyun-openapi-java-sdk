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

import com.aliyuncs.mts.model.v20140618.SearchMediaResponse;
import com.aliyuncs.mts.model.v20140618.SearchMediaResponse.Media;
import com.aliyuncs.mts.model.v20140618.SearchMediaResponse.Media.File;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchMediaResponseUnmarshaller {

	public static SearchMediaResponse unmarshall(SearchMediaResponse searchMediaResponse, UnmarshallerContext context) {
		
		searchMediaResponse.setRequestId(context.stringValue("SearchMediaResponse.RequestId"));
		searchMediaResponse.setTotalNum(context.longValue("SearchMediaResponse.TotalNum"));
		searchMediaResponse.setPageNumber(context.longValue("SearchMediaResponse.PageNumber"));
		searchMediaResponse.setPageSize(context.longValue("SearchMediaResponse.PageSize"));

		List<Media> mediaList = new ArrayList<Media>();
		for (int i = 0; i < context.lengthValue("SearchMediaResponse.MediaList.Length"); i++) {
			Media media = new Media();
			media.setMediaId(context.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaId"));
			media.setTitle(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Title"));
			media.setDescription(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Description"));
			media.setCoverURL(context.stringValue("SearchMediaResponse.MediaList["+ i +"].CoverURL"));
			media.setCateId(context.longValue("SearchMediaResponse.MediaList["+ i +"].CateId"));
			media.setDuration(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Duration"));
			media.setFormat(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Format"));
			media.setSize(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Size"));
			media.setBitrate(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Bitrate"));
			media.setWidth(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Width"));
			media.setHeight(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Height"));
			media.setFps(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Fps"));
			media.setPublishState(context.stringValue("SearchMediaResponse.MediaList["+ i +"].PublishState"));
			media.setCreationTime(context.stringValue("SearchMediaResponse.MediaList["+ i +"].CreationTime"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("SearchMediaResponse.MediaList["+ i +"].Tags.Length"); j++) {
				tags.add(context.stringValue("SearchMediaResponse.MediaList["+ i +"].Tags["+ j +"]"));
			}
			media.setTags(tags);

			List<String> runIdList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("SearchMediaResponse.MediaList["+ i +"].RunIdList.Length"); j++) {
				runIdList.add(context.stringValue("SearchMediaResponse.MediaList["+ i +"].RunIdList["+ j +"]"));
			}
			media.setRunIdList(runIdList);

			File file = new File();
			file.setURL(context.stringValue("SearchMediaResponse.MediaList["+ i +"].File.URL"));
			file.setState(context.stringValue("SearchMediaResponse.MediaList["+ i +"].File.State"));
			media.setFile(file);

			mediaList.add(media);
		}
		searchMediaResponse.setMediaList(mediaList);
	 
	 	return searchMediaResponse;
	}
}