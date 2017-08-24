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

import com.aliyuncs.cloudphoto.model.v20170711.SetMeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetMeResponseUnmarshaller {

	public static SetMeResponse unmarshall(SetMeResponse setMeResponse, UnmarshallerContext context) {
		
		setMeResponse.setRequestId(context.stringValue("SetMeResponse.RequestId"));
		setMeResponse.setCode(context.stringValue("SetMeResponse.Code"));
		setMeResponse.setMessage(context.stringValue("SetMeResponse.Message"));
		setMeResponse.setAction(context.stringValue("SetMeResponse.Action"));
	 
	 	return setMeResponse;
	}
}