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
package com.aliyuncs.qualitycheck.transform.v20160801;

import com.aliyuncs.qualitycheck.model.v20160801.UploadAudioDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadAudioDataResponseUnmarshaller {

	public static UploadAudioDataResponse unmarshall(UploadAudioDataResponse uploadAudioDataResponse, UnmarshallerContext context) {
		
		uploadAudioDataResponse.setRequestId(context.stringValue("UploadAudioDataResponse.RequestId"));
		uploadAudioDataResponse.setSuccess(context.booleanValue("UploadAudioDataResponse.Success"));
		uploadAudioDataResponse.setCode(context.stringValue("UploadAudioDataResponse.Code"));
		uploadAudioDataResponse.setMessage(context.stringValue("UploadAudioDataResponse.Message"));
		uploadAudioDataResponse.setData(context.stringValue("UploadAudioDataResponse.Data"));
	 
	 	return uploadAudioDataResponse;
	}
}