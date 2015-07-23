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

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.yundun.model.v20150416.DdosFlowGraphResponse;
import com.aliyuncs.yundun.model.v20150416.DdosFlowGraphResponse.NormalFlow;
import com.aliyuncs.yundun.model.v20150416.DdosFlowGraphResponse.TotalFlow;
import com.aliyuncs.transform.UnmarshallerContext;


public class DdosFlowGraphResponseUnmarshaller {

	public static DdosFlowGraphResponse unmarshall(DdosFlowGraphResponse ddosFlowGraphResponse, UnmarshallerContext context) {
		
		ddosFlowGraphResponse.setRequestId(context.stringValue("DdosFlowGraphResponse.RequestId"));

		List<NormalFlow> normalFlows = new ArrayList<NormalFlow>();
		for (int i = 0; i < context.lengthValue("DdosFlowGraphResponse.NormalFlows.Length"); i++) {
			NormalFlow  normalFlow = new NormalFlow();
			normalFlow.settime(context.longValue("DdosFlowGraphResponse.NormalFlows["+ i +"].time"));
			normalFlow.setBitRecv(context.longValue("DdosFlowGraphResponse.NormalFlows["+ i +"].BitRecv"));
			normalFlow.setBitSend(context.longValue("DdosFlowGraphResponse.NormalFlows["+ i +"].BitSend"));
			normalFlow.setPktRecv(context.longValue("DdosFlowGraphResponse.NormalFlows["+ i +"].PktRecv"));
			normalFlow.setPktSend(context.longValue("DdosFlowGraphResponse.NormalFlows["+ i +"].PktSend"));

			normalFlows.add(normalFlow);
		}
		ddosFlowGraphResponse.setNormalFlows(normalFlows);

		List<TotalFlow> totalFlows = new ArrayList<TotalFlow>();
		for (int i = 0; i < context.lengthValue("DdosFlowGraphResponse.TotalFlows.Length"); i++) {
			TotalFlow  totalFlow = new TotalFlow();
			totalFlow.settime(context.longValue("DdosFlowGraphResponse.TotalFlows["+ i +"].time"));
			totalFlow.setBitRecv(context.longValue("DdosFlowGraphResponse.TotalFlows["+ i +"].BitRecv"));
			totalFlow.setPktRecv(context.longValue("DdosFlowGraphResponse.TotalFlows["+ i +"].PktRecv"));

			totalFlows.add(totalFlow);
		}
		ddosFlowGraphResponse.setTotalFlows(totalFlows);
	 
	 	return ddosFlowGraphResponse;
	}
}