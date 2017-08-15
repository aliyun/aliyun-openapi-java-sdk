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

import com.aliyuncs.ons.model.v20160503.OnsConsumerAccumulateResponse;
import com.aliyuncs.ons.model.v20160503.OnsConsumerAccumulateResponse.Data;
import com.aliyuncs.ons.model.v20160503.OnsConsumerAccumulateResponse.Data.DetailInTopicDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsConsumerAccumulateResponseUnmarshaller {

	public static OnsConsumerAccumulateResponse unmarshall(OnsConsumerAccumulateResponse onsConsumerAccumulateResponse, UnmarshallerContext context) {
		
		onsConsumerAccumulateResponse.setRequestId(context.stringValue("OnsConsumerAccumulateResponse.RequestId"));
		onsConsumerAccumulateResponse.setHelpUrl(context.stringValue("OnsConsumerAccumulateResponse.HelpUrl"));

		Data data = new Data();
		data.setOnline(context.booleanValue("OnsConsumerAccumulateResponse.Data.Online"));
		data.setTotalDiff(context.longValue("OnsConsumerAccumulateResponse.Data.TotalDiff"));
		data.setConsumeTps(context.floatValue("OnsConsumerAccumulateResponse.Data.ConsumeTps"));
		data.setLastTimestamp(context.longValue("OnsConsumerAccumulateResponse.Data.LastTimestamp"));
		data.setDelayTime(context.longValue("OnsConsumerAccumulateResponse.Data.DelayTime"));

		List<DetailInTopicDo> detailInTopicList = new ArrayList<DetailInTopicDo>();
		for (int i = 0; i < context.lengthValue("OnsConsumerAccumulateResponse.Data.DetailInTopicList.Length"); i++) {
			DetailInTopicDo detailInTopicDo = new DetailInTopicDo();
			detailInTopicDo.setTopic(context.stringValue("OnsConsumerAccumulateResponse.Data.DetailInTopicList["+ i +"].Topic"));
			detailInTopicDo.setTotalDiff(context.longValue("OnsConsumerAccumulateResponse.Data.DetailInTopicList["+ i +"].TotalDiff"));
			detailInTopicDo.setLastTimestamp(context.longValue("OnsConsumerAccumulateResponse.Data.DetailInTopicList["+ i +"].LastTimestamp"));
			detailInTopicDo.setDelayTime(context.longValue("OnsConsumerAccumulateResponse.Data.DetailInTopicList["+ i +"].DelayTime"));

			detailInTopicList.add(detailInTopicDo);
		}
		data.setDetailInTopicList(detailInTopicList);
		onsConsumerAccumulateResponse.setData(data);
	 
	 	return onsConsumerAccumulateResponse;
	}
}