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
package com.aliyuncs.green.transform.v20161124;

import com.aliyuncs.green.model.v20161124.PluginAntispamDetectionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PluginAntispamDetectionResponseUnmarshaller {

	public static PluginAntispamDetectionResponse unmarshall(PluginAntispamDetectionResponse pluginAntispamDetectionResponse, UnmarshallerContext context) {
		
		pluginAntispamDetectionResponse.setCode(context.stringValue("PluginAntispamDetectionResponse.Code"));
		pluginAntispamDetectionResponse.setMsg(context.stringValue("PluginAntispamDetectionResponse.Msg"));
		pluginAntispamDetectionResponse.setDataId(context.stringValue("PluginAntispamDetectionResponse.DataId"));
		pluginAntispamDetectionResponse.setStatus(context.stringValue("PluginAntispamDetectionResponse.Status"));
		pluginAntispamDetectionResponse.setResultCode(context.integerValue("PluginAntispamDetectionResponse.ResultCode"));
		pluginAntispamDetectionResponse.setLabel(context.integerValue("PluginAntispamDetectionResponse.Label"));
	 
	 	return pluginAntispamDetectionResponse;
	}
}