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
package com.aliyuncs.ons.transform.v20170918;

import com.aliyuncs.ons.model.v20170918.OnsTopicUpdateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsTopicUpdateResponseUnmarshaller {

	public static OnsTopicUpdateResponse unmarshall(OnsTopicUpdateResponse onsTopicUpdateResponse, UnmarshallerContext context) {
		
		onsTopicUpdateResponse.setRequestId(context.stringValue("OnsTopicUpdateResponse.RequestId"));
		onsTopicUpdateResponse.setHelpUrl(context.stringValue("OnsTopicUpdateResponse.HelpUrl"));
	 
	 	return onsTopicUpdateResponse;
	}
}