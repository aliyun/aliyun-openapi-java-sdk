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
package com.aliyuncs.domain.transform.v20160511;

import com.aliyuncs.domain.model.v20160511.QueryContactResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryContactResponseUnmarshaller {

	public static QueryContactResponse unmarshall(QueryContactResponse queryContactResponse, UnmarshallerContext context) {
		
		queryContactResponse.setRequestId(context.stringValue("QueryContactResponse.RequestId"));
		queryContactResponse.setCreateDate(context.stringValue("QueryContactResponse.CreateDate"));
		queryContactResponse.setUpdateDate(context.stringValue("QueryContactResponse.UpdateDate"));
		queryContactResponse.setCName(context.stringValue("QueryContactResponse.CName"));
		queryContactResponse.setEName(context.stringValue("QueryContactResponse.EName"));
		queryContactResponse.setCCompany(context.stringValue("QueryContactResponse.CCompany"));
		queryContactResponse.setECompany(context.stringValue("QueryContactResponse.ECompany"));
		queryContactResponse.setCCountry(context.stringValue("QueryContactResponse.CCountry"));
		queryContactResponse.setCProvince(context.stringValue("QueryContactResponse.CProvince"));
		queryContactResponse.setEProvince(context.stringValue("QueryContactResponse.EProvince"));
		queryContactResponse.setCCity(context.stringValue("QueryContactResponse.CCity"));
		queryContactResponse.setECity(context.stringValue("QueryContactResponse.ECity"));
		queryContactResponse.setCVenu(context.stringValue("QueryContactResponse.CVenu"));
		queryContactResponse.setEVenu(context.stringValue("QueryContactResponse.EVenu"));
		queryContactResponse.setEmail(context.stringValue("QueryContactResponse.Email"));
		queryContactResponse.setTelArea(context.stringValue("QueryContactResponse.TelArea"));
		queryContactResponse.setPostalCode(context.stringValue("QueryContactResponse.PostalCode"));
		queryContactResponse.setTelMain(context.stringValue("QueryContactResponse.TelMain"));
		queryContactResponse.setTelExt(context.stringValue("QueryContactResponse.TelExt"));
		queryContactResponse.setRegType(context.stringValue("QueryContactResponse.RegType"));
	 
	 	return queryContactResponse;
	}
}