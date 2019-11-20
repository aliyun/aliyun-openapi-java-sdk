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
		media.setMediaId(_ctx.stringValue("UpdateMediaResponse.Media.MediaId"));
		media.setTitle(_ctx.stringValue("UpdateMediaResponse.Media.Title"));
		media.setDescription(_ctx.stringValue("UpdateMediaResponse.Media.Description"));
		media.setCoverURL(_ctx.stringValue("UpdateMediaResponse.Media.CoverURL"));
		media.setCateId(_ctx.longValue("UpdateMediaResponse.Media.CateId"));
		media.setDuration(_ctx.stringValue("UpdateMediaResponse.Media.Duration"));
		media.setFormat(_ctx.stringValue("UpdateMediaResponse.Media.Format"));
		media.setSize(_ctx.stringValue("UpdateMediaResponse.Media.Size"));
		media.setBitrate(_ctx.stringValue("UpdateMediaResponse.Media.Bitrate"));
		media.setWidth(_ctx.stringValue("UpdateMediaResponse.Media.Width"));
		media.setHeight(_ctx.stringValue("UpdateMediaResponse.Media.Height"));
		media.setFps(_ctx.stringValue("UpdateMediaResponse.Media.Fps"));
		media.setPublishState(_ctx.stringValue("UpdateMediaResponse.Media.PublishState"));
		media.setCensorState(_ctx.stringValue("UpdateMediaResponse.Media.CensorState"));
		media.setCreationTime(_ctx.stringValue("UpdateMediaResponse.Media.CreationTime"));

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
		file.setURL(_ctx.stringValue("UpdateMediaResponse.Media.File.URL"));
		file.setState(_ctx.stringValue("UpdateMediaResponse.Media.File.State"));
		media.setFile(file);
		updateMediaResponse.setMedia(media);
	 
	 	return updateMediaResponse;
	}
}