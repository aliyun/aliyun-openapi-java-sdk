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
package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.CreateUploadPathForSQLServerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUploadPathForSQLServerResponseUnmarshaller {

	public static CreateUploadPathForSQLServerResponse unmarshall(CreateUploadPathForSQLServerResponse createUploadPathForSQLServerResponse, UnmarshallerContext context) {
		
		createUploadPathForSQLServerResponse.setRequestId(context.stringValue("CreateUploadPathForSQLServerResponse.RequestId"));
		createUploadPathForSQLServerResponse.setInternetFtpServer(context.stringValue("CreateUploadPathForSQLServerResponse.InternetFtpServer"));
		createUploadPathForSQLServerResponse.setInternetPort(context.integerValue("CreateUploadPathForSQLServerResponse.InternetPort"));
		createUploadPathForSQLServerResponse.setIntranetFtpserver(context.stringValue("CreateUploadPathForSQLServerResponse.IntranetFtpserver"));
		createUploadPathForSQLServerResponse.setIntranetport(context.integerValue("CreateUploadPathForSQLServerResponse.Intranetport"));
		createUploadPathForSQLServerResponse.setUserName(context.stringValue("CreateUploadPathForSQLServerResponse.UserName"));
		createUploadPathForSQLServerResponse.setPassword(context.stringValue("CreateUploadPathForSQLServerResponse.Password"));
		createUploadPathForSQLServerResponse.setFileName(context.stringValue("CreateUploadPathForSQLServerResponse.FileName"));
	 
	 	return createUploadPathForSQLServerResponse;
	}
}