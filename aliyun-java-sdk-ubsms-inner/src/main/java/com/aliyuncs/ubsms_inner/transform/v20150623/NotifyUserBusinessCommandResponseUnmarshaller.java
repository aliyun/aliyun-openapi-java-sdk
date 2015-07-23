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
package com.aliyuncs.ubsms_inner.transform.v20150623;

import com.aliyuncs.ubsms_inner.model.v20150623.NotifyUserBusinessCommandResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class NotifyUserBusinessCommandResponseUnmarshaller {

	public static NotifyUserBusinessCommandResponse unmarshall(NotifyUserBusinessCommandResponse notifyUserBusinessCommandResponse, UnmarshallerContext context) {
		
		notifyUserBusinessCommandResponse.setRequestId(context.stringValue("NotifyUserBusinessCommandResponse.RequestId"));
		notifyUserBusinessCommandResponse.setSuccess(context.booleanValue("NotifyUserBusinessCommandResponse.Success"));
	 
	 	return notifyUserBusinessCommandResponse;
	}
}