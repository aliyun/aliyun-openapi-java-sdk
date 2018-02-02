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
package com.aliyuncs.afs.transform.v20180112;

import com.aliyuncs.afs.model.v20180112.ConfigurationStyleResponse;
import com.aliyuncs.afs.model.v20180112.ConfigurationStyleResponse.CodeData;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfigurationStyleResponseUnmarshaller {

	public static ConfigurationStyleResponse unmarshall(ConfigurationStyleResponse configurationStyleResponse, UnmarshallerContext context) {
		
		configurationStyleResponse.setRequestId(context.stringValue("ConfigurationStyleResponse.RequestId"));
		configurationStyleResponse.setBizCode(context.stringValue("ConfigurationStyleResponse.BizCode"));

		CodeData codeData = new CodeData();
		codeData.setHtml(context.stringValue("ConfigurationStyleResponse.CodeData.Html"));
		codeData.setNet(context.stringValue("ConfigurationStyleResponse.CodeData.Net"));
		codeData.setPhp(context.stringValue("ConfigurationStyleResponse.CodeData.Php"));
		codeData.setPython(context.stringValue("ConfigurationStyleResponse.CodeData.Python"));
		codeData.setJava(context.stringValue("ConfigurationStyleResponse.CodeData.Java"));
		codeData.setNodeJs(context.stringValue("ConfigurationStyleResponse.CodeData.NodeJs"));
		configurationStyleResponse.setCodeData(codeData);
	 
	 	return configurationStyleResponse;
	}
}