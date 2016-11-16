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
package com.aliyuncs.jaq.transform.v20160412;

import com.aliyuncs.jaq.model.v20160412.GetRiskDetail4BatchResponse;
import com.aliyuncs.jaq.model.v20160412.GetRiskDetail4BatchResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRiskDetail4BatchResponseUnmarshaller {

	public static GetRiskDetail4BatchResponse unmarshall(GetRiskDetail4BatchResponse getRiskDetail4BatchResponse, UnmarshallerContext context) {
		
		getRiskDetail4BatchResponse.setErrorCode(context.integerValue("GetRiskDetail4BatchResponse.ErrorCode"));
		getRiskDetail4BatchResponse.setErrorMsg(context.stringValue("GetRiskDetail4BatchResponse.ErrorMsg"));

		Data data = new Data();
		data.setTotalStatus(context.integerValue("GetRiskDetail4BatchResponse.Data.TotalStatus"));
		data.setResultInfos(context.stringValue("GetRiskDetail4BatchResponse.Data.ResultInfos"));
		getRiskDetail4BatchResponse.setData(data);
	 
	 	return getRiskDetail4BatchResponse;
	}
}