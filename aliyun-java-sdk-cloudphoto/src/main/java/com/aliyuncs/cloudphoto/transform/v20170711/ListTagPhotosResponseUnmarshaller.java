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

import com.aliyuncs.cloudphoto.model.v20170711.ListTagPhotosResponse;
import com.aliyuncs.cloudphoto.model.v20170711.ListTagPhotosResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagPhotosResponseUnmarshaller {

	public static ListTagPhotosResponse unmarshall(ListTagPhotosResponse listTagPhotosResponse, UnmarshallerContext context) {
		
		listTagPhotosResponse.setRequestId(context.stringValue("ListTagPhotosResponse.RequestId"));
		listTagPhotosResponse.setCode(context.stringValue("ListTagPhotosResponse.Code"));
		listTagPhotosResponse.setMessage(context.stringValue("ListTagPhotosResponse.Message"));
		listTagPhotosResponse.setNextCursor(context.stringValue("ListTagPhotosResponse.NextCursor"));
		listTagPhotosResponse.setTotalCount(context.integerValue("ListTagPhotosResponse.TotalCount"));
		listTagPhotosResponse.setAction(context.stringValue("ListTagPhotosResponse.Action"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < context.lengthValue("ListTagPhotosResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setPhotoId(context.longValue("ListTagPhotosResponse.Results["+ i +"].PhotoId"));
			result.setState(context.stringValue("ListTagPhotosResponse.Results["+ i +"].State"));

			results.add(result);
		}
		listTagPhotosResponse.setResults(results);
	 
	 	return listTagPhotosResponse;
	}
}