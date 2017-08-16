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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20160511.QueryDomainBySaleIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDomainBySaleIdResponseUnmarshaller {

	public static QueryDomainBySaleIdResponse unmarshall(QueryDomainBySaleIdResponse queryDomainBySaleIdResponse, UnmarshallerContext context) {
		
		queryDomainBySaleIdResponse.setUserId(context.stringValue("QueryDomainBySaleIdResponse.UserId"));
		queryDomainBySaleIdResponse.setDomainName(context.stringValue("QueryDomainBySaleIdResponse.DomainName"));
		queryDomainBySaleIdResponse.setSaleId(context.stringValue("QueryDomainBySaleIdResponse.SaleId"));
		queryDomainBySaleIdResponse.setCreationDate(context.stringValue("QueryDomainBySaleIdResponse.CreationDate"));
		queryDomainBySaleIdResponse.setExpirationDate(context.stringValue("QueryDomainBySaleIdResponse.ExpirationDate"));
		queryDomainBySaleIdResponse.setDomainRegType(context.stringValue("QueryDomainBySaleIdResponse.DomainRegType"));
		queryDomainBySaleIdResponse.setEnglishHolder(context.stringValue("QueryDomainBySaleIdResponse.EnglishHolder"));
		queryDomainBySaleIdResponse.setChineseHolder(context.stringValue("QueryDomainBySaleIdResponse.ChineseHolder"));
		queryDomainBySaleIdResponse.setEnglishContactPerson(context.stringValue("QueryDomainBySaleIdResponse.EnglishContactPerson"));
		queryDomainBySaleIdResponse.setChineseContactPerson(context.stringValue("QueryDomainBySaleIdResponse.ChineseContactPerson"));
		queryDomainBySaleIdResponse.setHolderEmail(context.stringValue("QueryDomainBySaleIdResponse.HolderEmail"));
		queryDomainBySaleIdResponse.setTransferOutStatus(context.stringValue("QueryDomainBySaleIdResponse.TransferOutStatus"));
		queryDomainBySaleIdResponse.setSafetyLock(context.stringValue("QueryDomainBySaleIdResponse.SafetyLock"));
		queryDomainBySaleIdResponse.setTransferLock(context.stringValue("QueryDomainBySaleIdResponse.TransferLock"));
		queryDomainBySaleIdResponse.setWhoisProtected(context.booleanValue("QueryDomainBySaleIdResponse.WhoisProtected"));
		queryDomainBySaleIdResponse.setPremium(context.booleanValue("QueryDomainBySaleIdResponse.Premium"));
		queryDomainBySaleIdResponse.setRemark(context.stringValue("QueryDomainBySaleIdResponse.Remark"));

		List<String> dnsList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryDomainBySaleIdResponse.DnsList.Length"); i++) {
			dnsList.add(context.stringValue("QueryDomainBySaleIdResponse.DnsList["+ i +"]"));
		}
		queryDomainBySaleIdResponse.setDnsList(dnsList);
	 
	 	return queryDomainBySaleIdResponse;
	}
}