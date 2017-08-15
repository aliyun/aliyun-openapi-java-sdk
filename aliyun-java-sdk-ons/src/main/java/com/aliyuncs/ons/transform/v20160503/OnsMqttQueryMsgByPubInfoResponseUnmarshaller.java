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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20160503.OnsMqttQueryMsgByPubInfoResponse;
import com.aliyuncs.ons.model.v20160503.OnsMqttQueryMsgByPubInfoResponse.MqttMessageDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsMqttQueryMsgByPubInfoResponseUnmarshaller {

	public static OnsMqttQueryMsgByPubInfoResponse unmarshall(OnsMqttQueryMsgByPubInfoResponse onsMqttQueryMsgByPubInfoResponse, UnmarshallerContext context) {
		
		onsMqttQueryMsgByPubInfoResponse.setRequestId(context.stringValue("OnsMqttQueryMsgByPubInfoResponse.RequestId"));
		onsMqttQueryMsgByPubInfoResponse.setHelpUrl(context.stringValue("OnsMqttQueryMsgByPubInfoResponse.HelpUrl"));

		List<MqttMessageDo> mqttMessageDos = new ArrayList<MqttMessageDo>();
		for (int i = 0; i < context.lengthValue("OnsMqttQueryMsgByPubInfoResponse.MqttMessageDos.Length"); i++) {
			MqttMessageDo mqttMessageDo = new MqttMessageDo();
			mqttMessageDo.setTraceId(context.stringValue("OnsMqttQueryMsgByPubInfoResponse.MqttMessageDos["+ i +"].TraceId"));
			mqttMessageDo.setPubTime(context.longValue("OnsMqttQueryMsgByPubInfoResponse.MqttMessageDos["+ i +"].pubTime"));

			mqttMessageDos.add(mqttMessageDo);
		}
		onsMqttQueryMsgByPubInfoResponse.setMqttMessageDos(mqttMessageDos);
	 
	 	return onsMqttQueryMsgByPubInfoResponse;
	}
}