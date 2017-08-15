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
package com.aliyuncs.ons.transform.v20160503;

import com.aliyuncs.ons.model.v20160503.OnsTopicStatusResponse;
import com.aliyuncs.ons.model.v20160503.OnsTopicStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsTopicStatusResponseUnmarshaller {

	public static OnsTopicStatusResponse unmarshall(OnsTopicStatusResponse onsTopicStatusResponse, UnmarshallerContext context) {
		
		onsTopicStatusResponse.setRequestId(context.stringValue("OnsTopicStatusResponse.RequestId"));
		onsTopicStatusResponse.setHelpUrl(context.stringValue("OnsTopicStatusResponse.HelpUrl"));

		Data data = new Data();
		data.setTotalCount(context.longValue("OnsTopicStatusResponse.Data.TotalCount"));
		data.setLastTimeStamp(context.longValue("OnsTopicStatusResponse.Data.LastTimeStamp"));
		onsTopicStatusResponse.setData(data);
	 
	 	return onsTopicStatusResponse;
	}
}