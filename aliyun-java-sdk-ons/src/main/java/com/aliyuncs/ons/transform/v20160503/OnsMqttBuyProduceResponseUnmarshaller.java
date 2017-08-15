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

import com.aliyuncs.ons.model.v20160503.OnsMqttBuyProduceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsMqttBuyProduceResponseUnmarshaller {

	public static OnsMqttBuyProduceResponse unmarshall(OnsMqttBuyProduceResponse onsMqttBuyProduceResponse, UnmarshallerContext context) {
		
		onsMqttBuyProduceResponse.setSuccess(context.booleanValue("OnsMqttBuyProduceResponse.success"));
		onsMqttBuyProduceResponse.setRequestId(context.stringValue("OnsMqttBuyProduceResponse.requestId"));
		onsMqttBuyProduceResponse.setCode(context.stringValue("OnsMqttBuyProduceResponse.code"));
		onsMqttBuyProduceResponse.setMessage(context.stringValue("OnsMqttBuyProduceResponse.message"));
		onsMqttBuyProduceResponse.setData(context.stringValue("OnsMqttBuyProduceResponse.data"));
	 
	 	return onsMqttBuyProduceResponse;
	}
}