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

import com.aliyuncs.cloudphoto.model.v20170711.MoveFacePhotosResponse;
import com.aliyuncs.cloudphoto.model.v20170711.MoveFacePhotosResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class MoveFacePhotosResponseUnmarshaller {

	public static MoveFacePhotosResponse unmarshall(MoveFacePhotosResponse moveFacePhotosResponse, UnmarshallerContext context) {
		
		moveFacePhotosResponse.setRequestId(context.stringValue("MoveFacePhotosResponse.RequestId"));
		moveFacePhotosResponse.setCode(context.stringValue("MoveFacePhotosResponse.Code"));
		moveFacePhotosResponse.setMessage(context.stringValue("MoveFacePhotosResponse.Message"));
		moveFacePhotosResponse.setAction(context.stringValue("MoveFacePhotosResponse.Action"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < context.lengthValue("MoveFacePhotosResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setId(context.longValue("MoveFacePhotosResponse.Results["+ i +"].Id"));
			result.setCode(context.stringValue("MoveFacePhotosResponse.Results["+ i +"].Code"));
			result.setMessage(context.stringValue("MoveFacePhotosResponse.Results["+ i +"].Message"));

			results.add(result);
		}
		moveFacePhotosResponse.setResults(results);
	 
	 	return moveFacePhotosResponse;
	}
}