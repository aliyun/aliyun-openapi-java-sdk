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
package com.aliyuncs.cms.transform.v20170301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20170301.ListContactGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListContactGroupResponseUnmarshaller {

	public static ListContactGroupResponse unmarshall(ListContactGroupResponse listContactGroupResponse, UnmarshallerContext context) {
		
		listContactGroupResponse.setRequestId(context.stringValue("ListContactGroupResponse.RequestId"));
		listContactGroupResponse.setSuccess(context.booleanValue("ListContactGroupResponse.Success"));
		listContactGroupResponse.setCode(context.stringValue("ListContactGroupResponse.Code"));
		listContactGroupResponse.setMessage(context.stringValue("ListContactGroupResponse.Message"));
		listContactGroupResponse.setNextToken(context.integerValue("ListContactGroupResponse.NextToken"));
		listContactGroupResponse.setTotal(context.integerValue("ListContactGroupResponse.Total"));

		List<String> contactGroups = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ListContactGroupResponse.ContactGroups.Length"); i++) {
			contactGroups.add(context.stringValue("ListContactGroupResponse.ContactGroups["+ i +"]"));
		}
		listContactGroupResponse.setContactGroups(contactGroups);
	 
	 	return listContactGroupResponse;
	}
}