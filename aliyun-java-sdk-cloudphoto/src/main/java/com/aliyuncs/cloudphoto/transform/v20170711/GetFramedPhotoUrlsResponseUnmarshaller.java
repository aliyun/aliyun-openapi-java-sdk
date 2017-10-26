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

import com.aliyuncs.cloudphoto.model.v20170711.GetFramedPhotoUrlsResponse;
import com.aliyuncs.cloudphoto.model.v20170711.GetFramedPhotoUrlsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFramedPhotoUrlsResponseUnmarshaller {

	public static GetFramedPhotoUrlsResponse unmarshall(GetFramedPhotoUrlsResponse getFramedPhotoUrlsResponse, UnmarshallerContext context) {
		
		getFramedPhotoUrlsResponse.setRequestId(context.stringValue("GetFramedPhotoUrlsResponse.RequestId"));
		getFramedPhotoUrlsResponse.setCode(context.stringValue("GetFramedPhotoUrlsResponse.Code"));
		getFramedPhotoUrlsResponse.setMessage(context.stringValue("GetFramedPhotoUrlsResponse.Message"));
		getFramedPhotoUrlsResponse.setAction(context.stringValue("GetFramedPhotoUrlsResponse.Action"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < context.lengthValue("GetFramedPhotoUrlsResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setCode(context.stringValue("GetFramedPhotoUrlsResponse.Results["+ i +"].Code"));
			result.setMessage(context.stringValue("GetFramedPhotoUrlsResponse.Results["+ i +"].Message"));
			result.setPhotoId(context.longValue("GetFramedPhotoUrlsResponse.Results["+ i +"].PhotoId"));
			result.setFramedPhotoUrl(context.stringValue("GetFramedPhotoUrlsResponse.Results["+ i +"].FramedPhotoUrl"));

			results.add(result);
		}
		getFramedPhotoUrlsResponse.setResults(results);
	 
	 	return getFramedPhotoUrlsResponse;
	}
}