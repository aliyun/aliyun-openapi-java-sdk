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

import com.aliyuncs.ons.model.v20160503.OnsMqttQueryMsgTransTrendResponse;
import com.aliyuncs.ons.model.v20160503.OnsMqttQueryMsgTransTrendResponse.Data;
import com.aliyuncs.ons.model.v20160503.OnsMqttQueryMsgTransTrendResponse.Data.StatsDataDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsMqttQueryMsgTransTrendResponseUnmarshaller {

	public static OnsMqttQueryMsgTransTrendResponse unmarshall(OnsMqttQueryMsgTransTrendResponse onsMqttQueryMsgTransTrendResponse, UnmarshallerContext context) {
		
		onsMqttQueryMsgTransTrendResponse.setRequestId(context.stringValue("OnsMqttQueryMsgTransTrendResponse.RequestId"));
		onsMqttQueryMsgTransTrendResponse.setHelpUrl(context.stringValue("OnsMqttQueryMsgTransTrendResponse.HelpUrl"));

		Data data = new Data();
		data.setTitle(context.stringValue("OnsMqttQueryMsgTransTrendResponse.Data.Title"));
		data.setXUnit(context.stringValue("OnsMqttQueryMsgTransTrendResponse.Data.XUnit"));
		data.setYUnit(context.stringValue("OnsMqttQueryMsgTransTrendResponse.Data.YUnit"));

		List<StatsDataDo> records = new ArrayList<StatsDataDo>();
		for (int i = 0; i < context.lengthValue("OnsMqttQueryMsgTransTrendResponse.Data.Records.Length"); i++) {
			StatsDataDo statsDataDo = new StatsDataDo();
			statsDataDo.setX(context.longValue("OnsMqttQueryMsgTransTrendResponse.Data.Records["+ i +"].X"));
			statsDataDo.setY(context.floatValue("OnsMqttQueryMsgTransTrendResponse.Data.Records["+ i +"].Y"));

			records.add(statsDataDo);
		}
		data.setRecords(records);
		onsMqttQueryMsgTransTrendResponse.setData(data);
	 
	 	return onsMqttQueryMsgTransTrendResponse;
	}
}