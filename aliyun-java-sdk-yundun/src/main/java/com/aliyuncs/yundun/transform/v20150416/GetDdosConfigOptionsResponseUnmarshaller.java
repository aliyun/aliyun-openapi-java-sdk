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
import com.aliyuncs.yundun.model.v20150416.GetDdosConfigOptionsResponse;
import com.aliyuncs.yundun.model.v20150416.GetDdosConfigOptionsResponse.RequestThresholdOption;
import com.aliyuncs.yundun.model.v20150416.GetDdosConfigOptionsResponse.ConnectionThresholdOption;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDdosConfigOptionsResponseUnmarshaller {

	public static GetDdosConfigOptionsResponse unmarshall(GetDdosConfigOptionsResponse getDdosConfigOptionsResponse, UnmarshallerContext context) {
		
		getDdosConfigOptionsResponse.setRequestId(context.stringValue("GetDdosConfigOptionsResponse.RequestId"));

		List<String> qpsOptions1 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetDdosConfigOptionsResponse.QpsOptions1.Length"); i++) {
			qpsOptions1.add(context.stringValue("GetDdosConfigOptionsResponse.QpsOptions1["+ i +"]"));
		}
		getDdosConfigOptionsResponse.setQpsOptions1(qpsOptions1);

		List<String> qpsOptions2 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetDdosConfigOptionsResponse.QpsOptions2.Length"); i++) {
			qpsOptions2.add(context.stringValue("GetDdosConfigOptionsResponse.QpsOptions2["+ i +"]"));
		}
		getDdosConfigOptionsResponse.setQpsOptions2(qpsOptions2);

		List<RequestThresholdOption> requestThresholdOptions1 = new ArrayList<RequestThresholdOption>();
		for (int i = 0; i < context.lengthValue("GetDdosConfigOptionsResponse.RequestThresholdOptions1.Length"); i++) {
			RequestThresholdOption  requestThresholdOption = new RequestThresholdOption();
			requestThresholdOption.setBps(context.longValue("GetDdosConfigOptionsResponse.RequestThresholdOptions1["+ i +"].Bps"));
			requestThresholdOption.setPps(context.longValue("GetDdosConfigOptionsResponse.RequestThresholdOptions1["+ i +"].Pps"));

			requestThresholdOptions1.add(requestThresholdOption);
		}
		getDdosConfigOptionsResponse.setRequestThresholdOptions1(requestThresholdOptions1);

		List<RequestThresholdOption> requestThresholdOptions2 = new ArrayList<RequestThresholdOption>();
		for (int i = 0; i < context.lengthValue("GetDdosConfigOptionsResponse.RequestThresholdOptions2.Length"); i++) {
			RequestThresholdOption  requestThresholdOption = new RequestThresholdOption();
			requestThresholdOption.setBps(context.longValue("GetDdosConfigOptionsResponse.RequestThresholdOptions2["+ i +"].Bps"));
			requestThresholdOption.setPps(context.longValue("GetDdosConfigOptionsResponse.RequestThresholdOptions2["+ i +"].Pps"));

			requestThresholdOptions2.add(requestThresholdOption);
		}
		getDdosConfigOptionsResponse.setRequestThresholdOptions2(requestThresholdOptions2);

		List<ConnectionThresholdOption> connectionThresholdOptions = new ArrayList<ConnectionThresholdOption>();
		for (int i = 0; i < context.lengthValue("GetDdosConfigOptionsResponse.ConnectionThresholdOptions.Length"); i++) {
			ConnectionThresholdOption  connectionThresholdOption = new ConnectionThresholdOption();
			connectionThresholdOption.setSipconn(context.longValue("GetDdosConfigOptionsResponse.ConnectionThresholdOptions["+ i +"].Sipconn"));
			connectionThresholdOption.setSipnew(context.longValue("GetDdosConfigOptionsResponse.ConnectionThresholdOptions["+ i +"].Sipnew"));

			connectionThresholdOptions.add(connectionThresholdOption);
		}
		getDdosConfigOptionsResponse.setConnectionThresholdOptions(connectionThresholdOptions);
	 
	 	return getDdosConfigOptionsResponse;
	}
}