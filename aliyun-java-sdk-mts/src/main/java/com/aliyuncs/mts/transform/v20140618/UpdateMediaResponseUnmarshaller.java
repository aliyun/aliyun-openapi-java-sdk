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

import com.aliyuncs.mts.model.v20140618.UpdateMediaResponse;
import com.aliyuncs.mts.model.v20140618.UpdateMediaResponse.Media;
import com.aliyuncs.mts.model.v20140618.UpdateMediaResponse.Media.File;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMediaResponseUnmarshaller {

	public static UpdateMediaResponse unmarshall(UpdateMediaResponse updateMediaResponse, UnmarshallerContext _ctx) {
		
		updateMediaResponse.setRequestId(_ctx.stringValue("UpdateMediaResponse.RequestId"));

		Media media = new Media();
		media.setCreationTime(_ctx.stringValue("UpdateMediaResponse.Media.CreationTime"));
		media.setCateId(_ctx.longValue("UpdateMediaResponse.Media.CateId"));
		media.setHeight(_ctx.stringValue("UpdateMediaResponse.Media.Height"));
		media.setCensorState(_ctx.stringValue("UpdateMediaResponse.Media.CensorState"));
		media.setBitrate(_ctx.stringValue("UpdateMediaResponse.Media.Bitrate"));
		media.setMediaId(_ctx.stringValue("UpdateMediaResponse.Media.MediaId"));
		media.setPublishState(_ctx.stringValue("UpdateMediaResponse.Media.PublishState"));
		media.setDescription(_ctx.stringValue("UpdateMediaResponse.Media.Description"));
		media.setWidth(_ctx.stringValue("UpdateMediaResponse.Media.Width"));
		media.setSize(_ctx.stringValue("UpdateMediaResponse.Media.Size"));
		media.setCoverURL(_ctx.stringValue("UpdateMediaResponse.Media.CoverURL"));
		media.setDuration(_ctx.stringValue("UpdateMediaResponse.Media.Duration"));
		media.setFps(_ctx.stringValue("UpdateMediaResponse.Media.Fps"));
		media.setTitle(_ctx.stringValue("UpdateMediaResponse.Media.Title"));
		media.setFormat(_ctx.stringValue("UpdateMediaResponse.Media.Format"));

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateMediaResponse.Media.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("UpdateMediaResponse.Media.Tags["+ i +"]"));
		}
		media.setTags(tags);

		List<String> runIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateMediaResponse.Media.RunIdList.Length"); i++) {
			runIdList.add(_ctx.stringValue("UpdateMediaResponse.Media.RunIdList["+ i +"]"));
		}
		media.setRunIdList(runIdList);

		File file = new File();
		file.setState(_ctx.stringValue("UpdateMediaResponse.Media.File.State"));
		file.setURL(_ctx.stringValue("UpdateMediaResponse.Media.File.URL"));
		media.setFile(file);
		updateMediaResponse.setMedia(media);
	 
	 	return updateMediaResponse;
	}
}