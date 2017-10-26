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
package com.aliyuncs.ess.transform.v20140828;

import com.aliyuncs.ess.model.v20140828.AttachInstancesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachInstancesResponseUnmarshaller {

	public static AttachInstancesResponse unmarshall(AttachInstancesResponse attachInstancesResponse, UnmarshallerContext context) {
		
		attachInstancesResponse.setRequestId(context.stringValue("AttachInstancesResponse.RequestId"));
		attachInstancesResponse.setScalingActivityId(context.stringValue("AttachInstancesResponse.ScalingActivityId"));
	 
	 	return attachInstancesResponse;
	}
}