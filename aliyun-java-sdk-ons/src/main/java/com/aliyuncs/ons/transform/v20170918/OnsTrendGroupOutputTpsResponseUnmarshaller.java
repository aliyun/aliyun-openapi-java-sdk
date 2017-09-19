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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20170918.OnsTrendGroupOutputTpsResponse;
import com.aliyuncs.ons.model.v20170918.OnsTrendGroupOutputTpsResponse.Data;
import com.aliyuncs.ons.model.v20170918.OnsTrendGroupOutputTpsResponse.Data.StatsDataDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsTrendGroupOutputTpsResponseUnmarshaller {

	public static OnsTrendGroupOutputTpsResponse unmarshall(OnsTrendGroupOutputTpsResponse onsTrendGroupOutputTpsResponse, UnmarshallerContext context) {
		
		onsTrendGroupOutputTpsResponse.setRequestId(context.stringValue("OnsTrendGroupOutputTpsResponse.RequestId"));
		onsTrendGroupOutputTpsResponse.setHelpUrl(context.stringValue("OnsTrendGroupOutputTpsResponse.HelpUrl"));

		Data data = new Data();
		data.setTitle(context.stringValue("OnsTrendGroupOutputTpsResponse.Data.Title"));
		data.setXUnit(context.stringValue("OnsTrendGroupOutputTpsResponse.Data.XUnit"));
		data.setYUnit(context.stringValue("OnsTrendGroupOutputTpsResponse.Data.YUnit"));

		List<StatsDataDo> records = new ArrayList<StatsDataDo>();
		for (int i = 0; i < context.lengthValue("OnsTrendGroupOutputTpsResponse.Data.Records.Length"); i++) {
			StatsDataDo statsDataDo = new StatsDataDo();
			statsDataDo.setX(context.longValue("OnsTrendGroupOutputTpsResponse.Data.Records["+ i +"].X"));
			statsDataDo.setY(context.floatValue("OnsTrendGroupOutputTpsResponse.Data.Records["+ i +"].Y"));

			records.add(statsDataDo);
		}
		data.setRecords(records);
		onsTrendGroupOutputTpsResponse.setData(data);
	 
	 	return onsTrendGroupOutputTpsResponse;
	}
}