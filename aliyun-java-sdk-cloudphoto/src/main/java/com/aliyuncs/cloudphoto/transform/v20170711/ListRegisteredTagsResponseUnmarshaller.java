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

import com.aliyuncs.cloudphoto.model.v20170711.ListRegisteredTagsResponse;
import com.aliyuncs.cloudphoto.model.v20170711.ListRegisteredTagsResponse.RegisteredTag;
import com.aliyuncs.cloudphoto.model.v20170711.ListRegisteredTagsResponse.RegisteredTag.TagValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRegisteredTagsResponseUnmarshaller {

	public static ListRegisteredTagsResponse unmarshall(ListRegisteredTagsResponse listRegisteredTagsResponse, UnmarshallerContext context) {
		
		listRegisteredTagsResponse.setRequestId(context.stringValue("ListRegisteredTagsResponse.RequestId"));
		listRegisteredTagsResponse.setCode(context.stringValue("ListRegisteredTagsResponse.Code"));
		listRegisteredTagsResponse.setMessage(context.stringValue("ListRegisteredTagsResponse.Message"));
		listRegisteredTagsResponse.setAction(context.stringValue("ListRegisteredTagsResponse.Action"));

		List<RegisteredTag> registeredTags = new ArrayList<RegisteredTag>();
		for (int i = 0; i < context.lengthValue("ListRegisteredTagsResponse.RegisteredTags.Length"); i++) {
			RegisteredTag registeredTag = new RegisteredTag();
			registeredTag.setTagKey(context.stringValue("ListRegisteredTagsResponse.RegisteredTags["+ i +"].TagKey"));

			List<TagValue> tagValues = new ArrayList<TagValue>();
			for (int j = 0; j < context.lengthValue("ListRegisteredTagsResponse.RegisteredTags["+ i +"].TagValues.Length"); j++) {
				TagValue tagValue = new TagValue();
				tagValue.setLang(context.stringValue("ListRegisteredTagsResponse.RegisteredTags["+ i +"].TagValues["+ j +"].Lang"));
				tagValue.setText(context.stringValue("ListRegisteredTagsResponse.RegisteredTags["+ i +"].TagValues["+ j +"].Text"));

				tagValues.add(tagValue);
			}
			registeredTag.setTagValues(tagValues);

			registeredTags.add(registeredTag);
		}
		listRegisteredTagsResponse.setRegisteredTags(registeredTags);
	 
	 	return listRegisteredTagsResponse;
	}
}