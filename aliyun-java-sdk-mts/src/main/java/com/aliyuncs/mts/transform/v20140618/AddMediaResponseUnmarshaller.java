/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.AddMediaResponse;
import com.aliyuncs.mts.model.v20140618.AddMediaResponse.Media;
import com.aliyuncs.mts.model.v20140618.AddMediaResponse.Media.File;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMediaResponseUnmarshaller {

	public static AddMediaResponse unmarshall(AddMediaResponse addMediaResponse, UnmarshallerContext context) {
		
		addMediaResponse.setRequestId(context.stringValue("AddMediaResponse.RequestId"));

		Media media = new Media();
		media.setMediaId(context.stringValue("AddMediaResponse.Media.MediaId"));
		media.setTitle(context.stringValue("AddMediaResponse.Media.Title"));
		media.setDescription(context.stringValue("AddMediaResponse.Media.Description"));
		media.setCoverURL(context.stringValue("AddMediaResponse.Media.CoverURL"));
		media.setCateId(context.longValue("AddMediaResponse.Media.CateId"));
		media.setDuration(context.stringValue("AddMediaResponse.Media.Duration"));
		media.setFormat(context.stringValue("AddMediaResponse.Media.Format"));
		media.setSize(context.stringValue("AddMediaResponse.Media.Size"));
		media.setBitrate(context.stringValue("AddMediaResponse.Media.Bitrate"));
		media.setWidth(context.stringValue("AddMediaResponse.Media.Width"));
		media.setHeight(context.stringValue("AddMediaResponse.Media.Height"));
		media.setFps(context.stringValue("AddMediaResponse.Media.Fps"));
		media.setPublishState(context.stringValue("AddMediaResponse.Media.PublishState"));
		media.setCreationTime(context.stringValue("AddMediaResponse.Media.CreationTime"));

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("AddMediaResponse.Media.Tags.Length"); i++) {
			tags.add(context.stringValue("AddMediaResponse.Media.Tags["+ i +"]"));
		}
		media.setTags(tags);

		List<String> runIdList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("AddMediaResponse.Media.RunIdList.Length"); i++) {
			runIdList.add(context.stringValue("AddMediaResponse.Media.RunIdList["+ i +"]"));
		}
		media.setRunIdList(runIdList);

		File file = new File();
		file.setURL(context.stringValue("AddMediaResponse.Media.File.URL"));
		file.setState(context.stringValue("AddMediaResponse.Media.File.State"));
		media.setFile(file);
		addMediaResponse.setMedia(media);
	 
	 	return addMediaResponse;
	}
}