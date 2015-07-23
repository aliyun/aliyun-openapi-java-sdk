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
package com.aliyuncs.risk.transform.v20150323;

import com.aliyuncs.risk.model.v20150323.FindRiskResponse;
import com.aliyuncs.risk.model.v20150323.FindRiskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindRiskResponseUnmarshaller {

	public static FindRiskResponse unmarshall(FindRiskResponse findRiskResponse, UnmarshallerContext context) {
		
		findRiskResponse.setCode(context.stringValue("FindRiskResponse.Code"));

		Data  data = new Data();
		data.setNoRisk(context.booleanValue("FindRiskResponse.Data.NoRisk"));
		data.setAction(context.stringValue("FindRiskResponse.Data.Action"));
		data.setTag(context.stringValue("FindRiskResponse.Data.Tag"));
		data.setMessage(context.stringValue("FindRiskResponse.Data.Message"));
		findRiskResponse.setData(data);
	 
	 	return findRiskResponse;
	}
}