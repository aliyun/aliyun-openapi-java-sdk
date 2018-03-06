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

import com.aliyuncs.cloudphoto.model.v20170711.ListPhotoTagsResponse;
import com.aliyuncs.cloudphoto.model.v20170711.ListPhotoTagsResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPhotoTagsResponseUnmarshaller {

	public static ListPhotoTagsResponse unmarshall(ListPhotoTagsResponse listPhotoTagsResponse, UnmarshallerContext context) {
		
		listPhotoTagsResponse.setRequestId(context.stringValue("ListPhotoTagsResponse.RequestId"));
		listPhotoTagsResponse.setCode(context.stringValue("ListPhotoTagsResponse.Code"));
		listPhotoTagsResponse.setMessage(context.stringValue("ListPhotoTagsResponse.Message"));
		listPhotoTagsResponse.setAction(context.stringValue("ListPhotoTagsResponse.Action"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < context.lengthValue("ListPhotoTagsResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setId(context.longValue("ListPhotoTagsResponse.Tags["+ i +"].Id"));
			tag.setIdStr(context.stringValue("ListPhotoTagsResponse.Tags["+ i +"].IdStr"));
			tag.setIsSubTag(context.booleanValue("ListPhotoTagsResponse.Tags["+ i +"].IsSubTag"));
			tag.setName(context.stringValue("ListPhotoTagsResponse.Tags["+ i +"].Name"));
			tag.setParentTag(context.stringValue("ListPhotoTagsResponse.Tags["+ i +"].ParentTag"));

			tags.add(tag);
		}
		listPhotoTagsResponse.setTags(tags);
	 
	 	return listPhotoTagsResponse;
	}
}