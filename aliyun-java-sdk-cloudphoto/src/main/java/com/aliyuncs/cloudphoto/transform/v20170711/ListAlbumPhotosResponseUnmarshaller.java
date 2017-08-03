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

import com.aliyuncs.cloudphoto.model.v20170711.ListAlbumPhotosResponse;
import com.aliyuncs.cloudphoto.model.v20170711.ListAlbumPhotosResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlbumPhotosResponseUnmarshaller {

	public static ListAlbumPhotosResponse unmarshall(ListAlbumPhotosResponse listAlbumPhotosResponse, UnmarshallerContext context) {
		
		listAlbumPhotosResponse.setRequestId(context.stringValue("ListAlbumPhotosResponse.RequestId"));
		listAlbumPhotosResponse.setCode(context.stringValue("ListAlbumPhotosResponse.Code"));
		listAlbumPhotosResponse.setMessage(context.stringValue("ListAlbumPhotosResponse.Message"));
		listAlbumPhotosResponse.setNextCursor(context.stringValue("ListAlbumPhotosResponse.NextCursor"));
		listAlbumPhotosResponse.setTotalCount(context.integerValue("ListAlbumPhotosResponse.TotalCount"));
		listAlbumPhotosResponse.setAction(context.stringValue("ListAlbumPhotosResponse.Action"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < context.lengthValue("ListAlbumPhotosResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setPhotoId(context.longValue("ListAlbumPhotosResponse.Results["+ i +"].PhotoId"));
			result.setState(context.stringValue("ListAlbumPhotosResponse.Results["+ i +"].State"));

			results.add(result);
		}
		listAlbumPhotosResponse.setResults(results);
	 
	 	return listAlbumPhotosResponse;
	}
}