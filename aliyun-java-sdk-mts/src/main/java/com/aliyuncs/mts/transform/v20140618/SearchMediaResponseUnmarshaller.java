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

	public static SearchMediaResponse unmarshall(SearchMediaResponse searchMediaResponse, UnmarshallerContext _ctx) {
		
		searchMediaResponse.setRequestId(_ctx.stringValue("SearchMediaResponse.RequestId"));
		searchMediaResponse.setTotalNum(_ctx.longValue("SearchMediaResponse.TotalNum"));
		searchMediaResponse.setPageSize(_ctx.longValue("SearchMediaResponse.PageSize"));
		searchMediaResponse.setPageNumber(_ctx.longValue("SearchMediaResponse.PageNumber"));

		List<Media> mediaList = new ArrayList<Media>();
		for (int i = 0; i < _ctx.lengthValue("SearchMediaResponse.MediaList.Length"); i++) {
			Media media = new Media();
			media.setCreationTime(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].CreationTime"));
			media.setCateId(_ctx.longValue("SearchMediaResponse.MediaList["+ i +"].CateId"));
			media.setHeight(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Height"));
			media.setBitrate(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Bitrate"));
			media.setMediaId(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].MediaId"));
			media.setPublishState(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].PublishState"));
			media.setDescription(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Description"));
			media.setWidth(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Width"));
			media.setSize(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Size"));
			media.setCoverURL(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].CoverURL"));
			media.setDuration(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Duration"));
			media.setFps(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Fps"));
			media.setTitle(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Title"));
			media.setFormat(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Format"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchMediaResponse.MediaList["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].Tags["+ j +"]"));
			}
			media.setTags(tags);

			List<String> runIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchMediaResponse.MediaList["+ i +"].RunIdList.Length"); j++) {
				runIdList.add(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].RunIdList["+ j +"]"));
			}
			media.setRunIdList(runIdList);

			File file = new File();
			file.setState(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].File.State"));
			file.setURL(_ctx.stringValue("SearchMediaResponse.MediaList["+ i +"].File.URL"));
			media.setFile(file);

			mediaList.add(media);
		}
		searchMediaResponse.setMediaList(mediaList);
	 
	 	return searchMediaResponse;
	}
}