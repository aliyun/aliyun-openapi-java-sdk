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

import com.aliyuncs.push.model.v20150827.PushMessageToAndroidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushMessageToAndroidResponseUnmarshaller {

	public static PushMessageToAndroidResponse unmarshall(PushMessageToAndroidResponse pushMessageToAndroidResponse, UnmarshallerContext context) {
		
		pushMessageToAndroidResponse.setRequestId(context.stringValue("PushMessageToAndroidResponse.RequestId"));
		pushMessageToAndroidResponse.setResponseId(context.stringValue("PushMessageToAndroidResponse.ResponseId"));
		pushMessageToAndroidResponse.setMessage(context.stringValue("PushMessageToAndroidResponse.Message"));
	 
	 	return pushMessageToAndroidResponse;
	}
}