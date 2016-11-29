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
package com.aliyuncs.jaq.transform.v20161123;

import com.aliyuncs.jaq.model.v20161123.OtherPreventionResponse;
import com.aliyuncs.jaq.model.v20161123.OtherPreventionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OtherPreventionResponseUnmarshaller {

	public static OtherPreventionResponse unmarshall(OtherPreventionResponse otherPreventionResponse, UnmarshallerContext context) {
		
		otherPreventionResponse.setErrorCode(context.integerValue("OtherPreventionResponse.ErrorCode"));
		otherPreventionResponse.setErrorMsg(context.stringValue("OtherPreventionResponse.ErrorMsg"));

		Data data = new Data();
		data.setFnalDecision(context.integerValue("OtherPreventionResponse.Data.FnalDecision"));
		data.setEventId(context.stringValue("OtherPreventionResponse.Data.EventId"));
		data.setUserId(context.stringValue("OtherPreventionResponse.Data.UserId"));
		data.setFinalScore(context.integerValue("OtherPreventionResponse.Data.FinalScore"));
		data.setFinalDesc(context.stringValue("OtherPreventionResponse.Data.FinalDesc"));
		data.setDetail(context.stringValue("OtherPreventionResponse.Data.Detail"));
		data.setCaptchaCheckData(context.stringValue("OtherPreventionResponse.Data.CaptchaCheckData"));
		otherPreventionResponse.setData(data);
	 
	 	return otherPreventionResponse;
	}
}