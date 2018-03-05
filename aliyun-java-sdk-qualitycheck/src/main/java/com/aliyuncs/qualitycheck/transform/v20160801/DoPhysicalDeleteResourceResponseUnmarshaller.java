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
package com.aliyuncs.qualitycheck.transform.v20160801;

import com.aliyuncs.qualitycheck.model.v20160801.DoPhysicalDeleteResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DoPhysicalDeleteResourceResponseUnmarshaller {

	public static DoPhysicalDeleteResourceResponse unmarshall(DoPhysicalDeleteResourceResponse doPhysicalDeleteResourceResponse, UnmarshallerContext context) {
		
		doPhysicalDeleteResourceResponse.setInterrupt(context.stringValue("DoPhysicalDeleteResourceResponse.Interrupt"));
		doPhysicalDeleteResourceResponse.setInvoker(context.longValue("DoPhysicalDeleteResourceResponse.Invoker"));
		doPhysicalDeleteResourceResponse.setPk(context.stringValue("DoPhysicalDeleteResourceResponse.Pk"));
		doPhysicalDeleteResourceResponse.setBid(context.stringValue("DoPhysicalDeleteResourceResponse.Bid"));
		doPhysicalDeleteResourceResponse.setHid(context.longValue("DoPhysicalDeleteResourceResponse.Hid"));
		doPhysicalDeleteResourceResponse.setCountry(context.stringValue("DoPhysicalDeleteResourceResponse.Country"));
		doPhysicalDeleteResourceResponse.setTaskIdentifier(context.stringValue("DoPhysicalDeleteResourceResponse.TaskIdentifier"));
		doPhysicalDeleteResourceResponse.setTaskIdentifier1(context.stringValue("DoPhysicalDeleteResourceResponse.TaskIdentifier"));
		doPhysicalDeleteResourceResponse.setGmtWakeup(context.stringValue("DoPhysicalDeleteResourceResponse.GmtWakeup"));
		doPhysicalDeleteResourceResponse.setSuccess(context.booleanValue("DoPhysicalDeleteResourceResponse.Success"));
		doPhysicalDeleteResourceResponse.setMessage(context.stringValue("DoPhysicalDeleteResourceResponse.Message"));
		doPhysicalDeleteResourceResponse.setLevel(context.longValue("DoPhysicalDeleteResourceResponse.Level"));
		doPhysicalDeleteResourceResponse.setPrompt(context.stringValue("DoPhysicalDeleteResourceResponse.Prompt"));
	 
	 	return doPhysicalDeleteResourceResponse;
	}
}