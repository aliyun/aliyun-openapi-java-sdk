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

import com.aliyuncs.sas_api.model.v20170705.GetApplicationAttackListResponse;
import com.aliyuncs.sas_api.model.v20170705.GetApplicationAttackListResponse.Data;
import com.aliyuncs.sas_api.model.v20170705.GetApplicationAttackListResponse.Data.Item;
import com.aliyuncs.sas_api.model.v20170705.GetApplicationAttackListResponse.Data.Item.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationAttackListResponseUnmarshaller {

	public static GetApplicationAttackListResponse unmarshall(GetApplicationAttackListResponse getApplicationAttackListResponse, UnmarshallerContext context) {
		
		getApplicationAttackListResponse.setCode(context.stringValue("GetApplicationAttackListResponse.Code"));
		getApplicationAttackListResponse.setMessage(context.stringValue("GetApplicationAttackListResponse.Message"));
		getApplicationAttackListResponse.setSuccess(context.booleanValue("GetApplicationAttackListResponse.Success"));

		Data data = new Data();
		data.setTotal(context.longValue("GetApplicationAttackListResponse.Data.Total"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("GetApplicationAttackListResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setId(context.longValue("GetApplicationAttackListResponse.Data.Items["+ i +"].Id"));
			item.setLevel(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].Level"));
			item.setUuid(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].Uuid"));
			item.setProduct(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].Product"));
			item.setVmIp(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].VmIp"));
			item.setUrl(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].Url"));
			item.setMethod(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].Method"));
			item.setSourceIp(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].SourceIp"));
			item.setSourceUuid(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].SourceUuid"));
			item.setSourceDomain(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].SourceDomain"));
			item.setSourcePort(context.integerValue("GetApplicationAttackListResponse.Data.Items["+ i +"].SourcePort"));
			item.setSourceLocal(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].SourceLocal"));
			item.setDstIp(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].DstIp"));
			item.setDstUuid(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].DstUuid"));
			item.setDstDomain(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].DstDomain"));
			item.setDstPort(context.integerValue("GetApplicationAttackListResponse.Data.Items["+ i +"].DstPort"));
			item.setDstLocal(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].DstLocal"));
			item.setAttackCount(context.longValue("GetApplicationAttackListResponse.Data.Items["+ i +"].AttackCount"));
			item.setThreatRate(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].ThreatRate"));
			item.setAttackStartTime(context.longValue("GetApplicationAttackListResponse.Data.Items["+ i +"].AttackStartTime"));
			item.setAttackEndTime(context.longValue("GetApplicationAttackListResponse.Data.Items["+ i +"].AttackEndTime"));
			item.setAttackCategory(context.integerValue("GetApplicationAttackListResponse.Data.Items["+ i +"].AttackCategory"));
			item.setAttackCategoryName(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].AttackCategoryName"));
			item.setAttackType(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].AttackType"));
			item.setAttackTypeName(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].AttackTypeName"));
			item.setAttackStatus(context.integerValue("GetApplicationAttackListResponse.Data.Items["+ i +"].AttackStatus"));
			item.setAttackSource(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].AttackSource"));

			List<Detail> details = new ArrayList<Detail>();
			for (int j = 0; j < context.lengthValue("GetApplicationAttackListResponse.Data.Items["+ i +"].Details.Length"); j++) {
				Detail detail = new Detail();
				detail.setValue(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].Details["+ j +"].Value"));
				detail.setType(context.integerValue("GetApplicationAttackListResponse.Data.Items["+ i +"].Details["+ j +"].Type"));
				detail.setLabel(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].Details["+ j +"].Label"));
				detail.setLinkText(context.stringValue("GetApplicationAttackListResponse.Data.Items["+ i +"].Details["+ j +"].LinkText"));

				details.add(detail);
			}
			item.setDetails(details);

			items.add(item);
		}
		data.setItems(items);
		getApplicationAttackListResponse.setData(data);
	 
	 	return getApplicationAttackListResponse;
	}
}