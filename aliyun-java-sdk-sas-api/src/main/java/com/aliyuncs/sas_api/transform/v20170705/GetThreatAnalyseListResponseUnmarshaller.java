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
package com.aliyuncs.sas_api.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas_api.model.v20170705.GetThreatAnalyseListResponse;
import com.aliyuncs.sas_api.model.v20170705.GetThreatAnalyseListResponse.Data;
import com.aliyuncs.sas_api.model.v20170705.GetThreatAnalyseListResponse.Data.Item;
import com.aliyuncs.sas_api.model.v20170705.GetThreatAnalyseListResponse.Data.Item.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetThreatAnalyseListResponseUnmarshaller {

	public static GetThreatAnalyseListResponse unmarshall(GetThreatAnalyseListResponse getThreatAnalyseListResponse, UnmarshallerContext context) {
		
		getThreatAnalyseListResponse.setCode(context.stringValue("GetThreatAnalyseListResponse.Code"));
		getThreatAnalyseListResponse.setMessage(context.stringValue("GetThreatAnalyseListResponse.Message"));
		getThreatAnalyseListResponse.setSuccess(context.booleanValue("GetThreatAnalyseListResponse.Success"));

		Data data = new Data();
		data.setTotal(context.longValue("GetThreatAnalyseListResponse.Data.Total"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("GetThreatAnalyseListResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setId(context.longValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].Id"));
			item.setLevel(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].Level"));
			item.setUuid(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].Uuid"));
			item.setProduct(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].Product"));
			item.setVmIp(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].VmIp"));
			item.setUrl(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].Url"));
			item.setMethod(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].Method"));
			item.setSourceIp(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].SourceIp"));
			item.setSourceUuid(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].SourceUuid"));
			item.setSourceDomain(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].SourceDomain"));
			item.setSourcePort(context.integerValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].SourcePort"));
			item.setSourceLocal(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].SourceLocal"));
			item.setDstIp(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].DstIp"));
			item.setDstUuid(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].DstUuid"));
			item.setDstDomain(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].DstDomain"));
			item.setDstPort(context.integerValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].DstPort"));
			item.setDstLocal(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].DstLocal"));
			item.setAttackCount(context.longValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].AttackCount"));
			item.setThreatRate(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].ThreatRate"));
			item.setAttackStartTime(context.longValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].AttackStartTime"));
			item.setAttackEndTime(context.longValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].AttackEndTime"));
			item.setAttackCategory(context.integerValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].AttackCategory"));
			item.setAttackCategoryName(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].AttackCategoryName"));
			item.setAttackType(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].AttackType"));
			item.setAttackTypeName(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].AttackTypeName"));
			item.setAttackStatus(context.integerValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].AttackStatus"));
			item.setAttackSource(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].AttackSource"));

			List<Detail> details = new ArrayList<Detail>();
			for (int j = 0; j < context.lengthValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].Details.Length"); j++) {
				Detail detail = new Detail();
				detail.setValue(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].Details["+ j +"].Value"));
				detail.setType(context.integerValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].Details["+ j +"].Type"));
				detail.setLabel(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].Details["+ j +"].Label"));
				detail.setLinkText(context.stringValue("GetThreatAnalyseListResponse.Data.Items["+ i +"].Details["+ j +"].LinkText"));

				details.add(detail);
			}
			item.setDetails(details);

			items.add(item);
		}
		data.setItems(items);
		getThreatAnalyseListResponse.setData(data);
	 
	 	return getThreatAnalyseListResponse;
	}
}