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

import com.aliyuncs.cloudphoto.model.v20170711.ActivatePhotosResponse;
import com.aliyuncs.cloudphoto.model.v20170711.ActivatePhotosResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ActivatePhotosResponseUnmarshaller {

	public static ActivatePhotosResponse unmarshall(ActivatePhotosResponse activatePhotosResponse, UnmarshallerContext context) {
		
		activatePhotosResponse.setRequestId(context.stringValue("ActivatePhotosResponse.RequestId"));
		activatePhotosResponse.setCode(context.stringValue("ActivatePhotosResponse.Code"));
		activatePhotosResponse.setMessage(context.stringValue("ActivatePhotosResponse.Message"));
		activatePhotosResponse.setAction(context.stringValue("ActivatePhotosResponse.Action"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < context.lengthValue("ActivatePhotosResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setId(context.longValue("ActivatePhotosResponse.Results["+ i +"].Id"));
			result.setCode(context.stringValue("ActivatePhotosResponse.Results["+ i +"].Code"));
			result.setMessage(context.stringValue("ActivatePhotosResponse.Results["+ i +"].Message"));

			results.add(result);
		}
		activatePhotosResponse.setResults(results);
	 
	 	return activatePhotosResponse;
	}
}