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
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.AttachKeyPairResponse;
import com.aliyuncs.ecs.model.v20140526.AttachKeyPairResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachKeyPairResponseUnmarshaller {

	public static AttachKeyPairResponse unmarshall(AttachKeyPairResponse attachKeyPairResponse, UnmarshallerContext context) {
		
		attachKeyPairResponse.setRequestId(context.stringValue("AttachKeyPairResponse.RequestId"));
		attachKeyPairResponse.setTotalCount(context.stringValue("AttachKeyPairResponse.TotalCount"));
		attachKeyPairResponse.setFailCount(context.stringValue("AttachKeyPairResponse.FailCount"));
		attachKeyPairResponse.setKeyPairName(context.stringValue("AttachKeyPairResponse.KeyPairName"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < context.lengthValue("AttachKeyPairResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setInstanceId(context.stringValue("AttachKeyPairResponse.Results["+ i +"].InstanceId"));
			result.setSuccess(context.stringValue("AttachKeyPairResponse.Results["+ i +"].Success"));
			result.setCode(context.stringValue("AttachKeyPairResponse.Results["+ i +"].Code"));
			result.setMessage(context.stringValue("AttachKeyPairResponse.Results["+ i +"].Message"));

			results.add(result);
		}
		attachKeyPairResponse.setResults(results);
	 
	 	return attachKeyPairResponse;
	}
}