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

	public static UpdateMediaResponse unmarshall(UpdateMediaResponse updateMediaResponse, UnmarshallerContext context) {
		
		updateMediaResponse.setRequestId(context.stringValue("UpdateMediaResponse.RequestId"));

		Media media = new Media();
		media.setMediaId(context.stringValue("UpdateMediaResponse.Media.MediaId"));
		media.setTitle(context.stringValue("UpdateMediaResponse.Media.Title"));
		media.setDescription(context.stringValue("UpdateMediaResponse.Media.Description"));
		media.setCoverURL(context.stringValue("UpdateMediaResponse.Media.CoverURL"));
		media.setCateId(context.longValue("UpdateMediaResponse.Media.CateId"));
		media.setDuration(context.stringValue("UpdateMediaResponse.Media.Duration"));
		media.setFormat(context.stringValue("UpdateMediaResponse.Media.Format"));
		media.setSize(context.stringValue("UpdateMediaResponse.Media.Size"));
		media.setBitrate(context.stringValue("UpdateMediaResponse.Media.Bitrate"));
		media.setWidth(context.stringValue("UpdateMediaResponse.Media.Width"));
		media.setHeight(context.stringValue("UpdateMediaResponse.Media.Height"));
		media.setFps(context.stringValue("UpdateMediaResponse.Media.Fps"));
		media.setPublishState(context.stringValue("UpdateMediaResponse.Media.PublishState"));
		media.setCensorState(context.stringValue("UpdateMediaResponse.Media.CensorState"));
		media.setCreationTime(context.stringValue("UpdateMediaResponse.Media.CreationTime"));

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("UpdateMediaResponse.Media.Tags.Length"); i++) {
			tags.add(context.stringValue("UpdateMediaResponse.Media.Tags["+ i +"]"));
		}
		media.setTags(tags);

		List<String> runIdList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("UpdateMediaResponse.Media.RunIdList.Length"); i++) {
			runIdList.add(context.stringValue("UpdateMediaResponse.Media.RunIdList["+ i +"]"));
		}
		media.setRunIdList(runIdList);

		File file = new File();
		file.setURL(context.stringValue("UpdateMediaResponse.Media.File.URL"));
		file.setState(context.stringValue("UpdateMediaResponse.Media.File.State"));
		media.setFile(file);
		updateMediaResponse.setMedia(media);
	 
	 	return updateMediaResponse;
	}
}