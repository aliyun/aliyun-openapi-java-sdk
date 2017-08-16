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

import com.aliyuncs.domain.model.v20160511.QueryContactTemplateResponse;
import com.aliyuncs.domain.model.v20160511.QueryContactTemplateResponse.ContactTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryContactTemplateResponseUnmarshaller {

	public static QueryContactTemplateResponse unmarshall(QueryContactTemplateResponse queryContactTemplateResponse, UnmarshallerContext context) {
		
		queryContactTemplateResponse.setRequestId(context.stringValue("QueryContactTemplateResponse.RequestId"));
		queryContactTemplateResponse.setTotalItemNum(context.integerValue("QueryContactTemplateResponse.TotalItemNum"));
		queryContactTemplateResponse.setCurrentPageNum(context.integerValue("QueryContactTemplateResponse.CurrentPageNum"));
		queryContactTemplateResponse.setTotalPageNum(context.integerValue("QueryContactTemplateResponse.TotalPageNum"));
		queryContactTemplateResponse.setPageSize(context.integerValue("QueryContactTemplateResponse.PageSize"));
		queryContactTemplateResponse.setPrePage(context.booleanValue("QueryContactTemplateResponse.PrePage"));
		queryContactTemplateResponse.setNextPage(context.booleanValue("QueryContactTemplateResponse.NextPage"));

		List<ContactTemplate> contactTemplates = new ArrayList<ContactTemplate>();
		for (int i = 0; i < context.lengthValue("QueryContactTemplateResponse.ContactTemplates.Length"); i++) {
			ContactTemplate contactTemplate = new ContactTemplate();
			contactTemplate.setContactTemplateId(context.longValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].ContactTemplateId"));
			contactTemplate.setCreateTime(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].CreateTime"));
			contactTemplate.setUpdateTime(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].UpdateTime"));
			contactTemplate.setUserId(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].UserId"));
			contactTemplate.setRegType(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].RegType"));
			contactTemplate.setDefaultTemplate(context.booleanValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].DefaultTemplate"));
			contactTemplate.setAuditStatus(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].AuditStatus"));
			contactTemplate.setCName(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].CName"));
			contactTemplate.setEName(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].EName"));
			contactTemplate.setCCompany(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].CCompany"));
			contactTemplate.setECompany(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].ECompany"));
			contactTemplate.setCCountry(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].CCountry"));
			contactTemplate.setCProvince(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].CProvince"));
			contactTemplate.setEProvince(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].EProvince"));
			contactTemplate.setCCity(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].CCity"));
			contactTemplate.setECity(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].ECity"));
			contactTemplate.setCVenu(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].CVenu"));
			contactTemplate.setEVenu(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].EVenu"));
			contactTemplate.setEmail(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].Email"));
			contactTemplate.setTelArea(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].TelArea"));
			contactTemplate.setPostalCode(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].PostalCode"));
			contactTemplate.setTelMain(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].TelMain"));
			contactTemplate.setTelExt(context.stringValue("QueryContactTemplateResponse.ContactTemplates["+ i +"].TelExt"));

			contactTemplates.add(contactTemplate);
		}
		queryContactTemplateResponse.setContactTemplates(contactTemplates);
	 
	 	return queryContactTemplateResponse;
	}
}