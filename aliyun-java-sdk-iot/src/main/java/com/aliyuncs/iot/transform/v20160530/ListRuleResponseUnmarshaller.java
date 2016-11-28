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
package com.aliyuncs.iot.transform.v20160530;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20160530.ListRuleResponse;
import com.aliyuncs.iot.model.v20160530.ListRuleResponse.RuleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRuleResponseUnmarshaller {

	public static ListRuleResponse unmarshall(ListRuleResponse listRuleResponse, UnmarshallerContext context) {
		
		listRuleResponse.setRequestId(context.stringValue("ListRuleResponse.RequestId"));
		listRuleResponse.setSuccess(context.booleanValue("ListRuleResponse.Success"));
		listRuleResponse.setErrorMessage(context.stringValue("ListRuleResponse.ErrorMessage"));
		listRuleResponse.setPageSize(context.integerValue("ListRuleResponse.PageSize"));
		listRuleResponse.setPage(context.integerValue("ListRuleResponse.Page"));
		listRuleResponse.setTotal(context.integerValue("ListRuleResponse.Total"));

		List<RuleInfo> data = new ArrayList<RuleInfo>();
		for (int i = 0; i < context.lengthValue("ListRuleResponse.Data.Length"); i++) {
			RuleInfo ruleInfo = new RuleInfo();
			ruleInfo.setId(context.longValue("ListRuleResponse.Data["+ i +"].Id"));
			ruleInfo.setSelect(context.stringValue("ListRuleResponse.Data["+ i +"].Select"));
			ruleInfo.setTopic(context.stringValue("ListRuleResponse.Data["+ i +"].Topic"));
			ruleInfo.setShortTopic(context.stringValue("ListRuleResponse.Data["+ i +"].ShortTopic"));
			ruleInfo.setWhere(context.stringValue("ListRuleResponse.Data["+ i +"].Where"));
			ruleInfo.setStatus(context.stringValue("ListRuleResponse.Data["+ i +"].Status"));
			ruleInfo.setCreateUserId(context.longValue("ListRuleResponse.Data["+ i +"].CreateUserId"));
			ruleInfo.setProductKey(context.longValue("ListRuleResponse.Data["+ i +"].ProductKey"));
			ruleInfo.setName(context.stringValue("ListRuleResponse.Data["+ i +"].Name"));
			ruleInfo.setRuleDesc(context.stringValue("ListRuleResponse.Data["+ i +"].RuleDesc"));
			ruleInfo.setCreated(context.stringValue("ListRuleResponse.Data["+ i +"].Created"));
			ruleInfo.setModified(context.stringValue("ListRuleResponse.Data["+ i +"].Modified"));

			data.add(ruleInfo);
		}
		listRuleResponse.setData(data);
	 
	 	return listRuleResponse;
	}
}