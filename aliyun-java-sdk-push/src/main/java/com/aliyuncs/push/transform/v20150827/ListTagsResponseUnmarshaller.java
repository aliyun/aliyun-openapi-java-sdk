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
package com.aliyuncs.push.transform.v20150827;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.push.model.v20150827.ListTagsResponse;
import com.aliyuncs.push.model.v20150827.ListTagsResponse.TagInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagsResponseUnmarshaller {

	public static ListTagsResponse unmarshall(ListTagsResponse listTagsResponse, UnmarshallerContext context) {
		
		listTagsResponse.setRequestId(context.stringValue("ListTagsResponse.RequestId"));

		List<TagInfo> tagInfos = new ArrayList<TagInfo>();
		for (int i = 0; i < context.lengthValue("ListTagsResponse.TagInfos.Length"); i++) {
			TagInfo tagInfo = new TagInfo();
			tagInfo.setTagName(context.stringValue("ListTagsResponse.TagInfos["+ i +"].TagName"));

			tagInfos.add(tagInfo);
		}
		listTagsResponse.setTagInfos(tagInfos);
	 
	 	return listTagsResponse;
	}
}