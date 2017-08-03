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

import com.aliyuncs.cloudphoto.model.v20170711.ListFacePhotosResponse;
import com.aliyuncs.cloudphoto.model.v20170711.ListFacePhotosResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFacePhotosResponseUnmarshaller {

	public static ListFacePhotosResponse unmarshall(ListFacePhotosResponse listFacePhotosResponse, UnmarshallerContext context) {
		
		listFacePhotosResponse.setRequestId(context.stringValue("ListFacePhotosResponse.RequestId"));
		listFacePhotosResponse.setCode(context.stringValue("ListFacePhotosResponse.Code"));
		listFacePhotosResponse.setMessage(context.stringValue("ListFacePhotosResponse.Message"));
		listFacePhotosResponse.setNextCursor(context.stringValue("ListFacePhotosResponse.NextCursor"));
		listFacePhotosResponse.setTotalCount(context.integerValue("ListFacePhotosResponse.TotalCount"));
		listFacePhotosResponse.setAction(context.stringValue("ListFacePhotosResponse.Action"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < context.lengthValue("ListFacePhotosResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setPhotoId(context.longValue("ListFacePhotosResponse.Results["+ i +"].PhotoId"));
			result.setState(context.stringValue("ListFacePhotosResponse.Results["+ i +"].State"));

			results.add(result);
		}
		listFacePhotosResponse.setResults(results);
	 
	 	return listFacePhotosResponse;
	}
}