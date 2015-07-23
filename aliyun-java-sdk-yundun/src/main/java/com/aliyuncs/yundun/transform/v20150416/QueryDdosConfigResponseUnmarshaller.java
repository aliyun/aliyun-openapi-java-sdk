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
package com.aliyuncs.yundun.transform.v20150416;

import com.aliyuncs.yundun.model.v20150416.QueryDdosConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDdosConfigResponseUnmarshaller {

	public static QueryDdosConfigResponse unmarshall(QueryDdosConfigResponse queryDdosConfigResponse, UnmarshallerContext context) {
		
		queryDdosConfigResponse.setRequestId(context.stringValue("QueryDdosConfigResponse.RequestId"));
		queryDdosConfigResponse.setBps(context.longValue("QueryDdosConfigResponse.Bps"));
		queryDdosConfigResponse.setPps(context.longValue("QueryDdosConfigResponse.Pps"));
		queryDdosConfigResponse.setQps(context.longValue("QueryDdosConfigResponse.Qps"));
		queryDdosConfigResponse.setSipconn(context.longValue("QueryDdosConfigResponse.Sipconn"));
		queryDdosConfigResponse.setSipnew(context.longValue("QueryDdosConfigResponse.Sipnew"));
		queryDdosConfigResponse.setLayer7Config(context.booleanValue("QueryDdosConfigResponse.Layer7Config"));
		queryDdosConfigResponse.setFlowPosition(context.integerValue("QueryDdosConfigResponse.FlowPosition"));
		queryDdosConfigResponse.setQpsPosition(context.integerValue("QueryDdosConfigResponse.QpsPosition"));
		queryDdosConfigResponse.setStrategyPosition(context.integerValue("QueryDdosConfigResponse.StrategyPosition"));
		queryDdosConfigResponse.setLevel(context.integerValue("QueryDdosConfigResponse.Level"));
		queryDdosConfigResponse.setHoleBps(context.stringValue("QueryDdosConfigResponse.HoleBps"));
		queryDdosConfigResponse.setConfigType(context.stringValue("QueryDdosConfigResponse.ConfigType"));
	 
	 	return queryDdosConfigResponse;
	}
}