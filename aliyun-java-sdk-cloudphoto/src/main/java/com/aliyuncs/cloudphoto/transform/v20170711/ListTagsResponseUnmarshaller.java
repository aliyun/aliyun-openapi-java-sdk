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
package com.aliyuncs.cloudphoto.transform.v20170711;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphoto.model.v20170711.ListTagsResponse;
import com.aliyuncs.cloudphoto.model.v20170711.ListTagsResponse.Tag;
import com.aliyuncs.cloudphoto.model.v20170711.ListTagsResponse.Tag.Cover;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagsResponseUnmarshaller {

	public static ListTagsResponse unmarshall(ListTagsResponse listTagsResponse, UnmarshallerContext context) {
		
		listTagsResponse.setRequestId(context.stringValue("ListTagsResponse.RequestId"));
		listTagsResponse.setCode(context.stringValue("ListTagsResponse.Code"));
		listTagsResponse.setMessage(context.stringValue("ListTagsResponse.Message"));
		listTagsResponse.setAction(context.stringValue("ListTagsResponse.Action"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < context.lengthValue("ListTagsResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setId(context.longValue("ListTagsResponse.Tags["+ i +"].Id"));
			tag.setName(context.stringValue("ListTagsResponse.Tags["+ i +"].Name"));

			Cover cover = new Cover();
			cover.setId(context.longValue("ListTagsResponse.Tags["+ i +"].Cover.Id"));
			cover.setTitle(context.stringValue("ListTagsResponse.Tags["+ i +"].Cover.Title"));
			cover.setFileId(context.stringValue("ListTagsResponse.Tags["+ i +"].Cover.FileId"));
			cover.setState(context.stringValue("ListTagsResponse.Tags["+ i +"].Cover.State"));
			cover.setMd5(context.stringValue("ListTagsResponse.Tags["+ i +"].Cover.Md5"));
			cover.setIsVideo(context.booleanValue("ListTagsResponse.Tags["+ i +"].Cover.IsVideo"));
			cover.setWidth(context.longValue("ListTagsResponse.Tags["+ i +"].Cover.Width"));
			cover.setHeight(context.longValue("ListTagsResponse.Tags["+ i +"].Cover.Height"));
			cover.setCtime(context.longValue("ListTagsResponse.Tags["+ i +"].Cover.Ctime"));
			cover.setMtime(context.longValue("ListTagsResponse.Tags["+ i +"].Cover.Mtime"));
			tag.setCover(cover);

			tags.add(tag);
		}
		listTagsResponse.setTags(tags);
	 
	 	return listTagsResponse;
	}
}