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

import com.aliyuncs.mts.model.v20140618.AddMediaResponse;
import com.aliyuncs.mts.model.v20140618.AddMediaResponse.Media;
import com.aliyuncs.mts.model.v20140618.AddMediaResponse.Media.File;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMediaResponseUnmarshaller {

	public static AddMediaResponse unmarshall(AddMediaResponse addMediaResponse, UnmarshallerContext _ctx) {
		
		addMediaResponse.setRequestId(_ctx.stringValue("AddMediaResponse.RequestId"));

		Media media = new Media();
		media.setCreationTime(_ctx.stringValue("AddMediaResponse.Media.CreationTime"));
		media.setCateId(_ctx.longValue("AddMediaResponse.Media.CateId"));
		media.setHeight(_ctx.stringValue("AddMediaResponse.Media.Height"));
		media.setCensorState(_ctx.stringValue("AddMediaResponse.Media.CensorState"));
		media.setBitrate(_ctx.stringValue("AddMediaResponse.Media.Bitrate"));
		media.setMediaId(_ctx.stringValue("AddMediaResponse.Media.MediaId"));
		media.setPublishState(_ctx.stringValue("AddMediaResponse.Media.PublishState"));
		media.setDescription(_ctx.stringValue("AddMediaResponse.Media.Description"));
		media.setWidth(_ctx.stringValue("AddMediaResponse.Media.Width"));
		media.setSize(_ctx.stringValue("AddMediaResponse.Media.Size"));
		media.setCoverURL(_ctx.stringValue("AddMediaResponse.Media.CoverURL"));
		media.setDuration(_ctx.stringValue("AddMediaResponse.Media.Duration"));
		media.setFps(_ctx.stringValue("AddMediaResponse.Media.Fps"));
		media.setTitle(_ctx.stringValue("AddMediaResponse.Media.Title"));
		media.setFormat(_ctx.stringValue("AddMediaResponse.Media.Format"));

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddMediaResponse.Media.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("AddMediaResponse.Media.Tags["+ i +"]"));
		}
		media.setTags(tags);

		List<String> runIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddMediaResponse.Media.RunIdList.Length"); i++) {
			runIdList.add(_ctx.stringValue("AddMediaResponse.Media.RunIdList["+ i +"]"));
		}
		media.setRunIdList(runIdList);

		File file = new File();
		file.setState(_ctx.stringValue("AddMediaResponse.Media.File.State"));
		file.setURL(_ctx.stringValue("AddMediaResponse.Media.File.URL"));
		media.setFile(file);
		addMediaResponse.setMedia(media);
	 
	 	return addMediaResponse;
	}
}