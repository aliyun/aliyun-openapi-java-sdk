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

import com.aliyuncs.sas_api.model.v20170705.GetCrackListResponse;
import com.aliyuncs.sas_api.model.v20170705.GetCrackListResponse.Data;
import com.aliyuncs.sas_api.model.v20170705.GetCrackListResponse.Data.Item;
import com.aliyuncs.sas_api.model.v20170705.GetCrackListResponse.Data.Item.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCrackListResponseUnmarshaller {

	public static GetCrackListResponse unmarshall(GetCrackListResponse getCrackListResponse, UnmarshallerContext context) {
		
		getCrackListResponse.setCode(context.stringValue("GetCrackListResponse.Code"));
		getCrackListResponse.setMessage(context.stringValue("GetCrackListResponse.Message"));
		getCrackListResponse.setSuccess(context.booleanValue("GetCrackListResponse.Success"));

		Data data = new Data();
		data.setTotal(context.longValue("GetCrackListResponse.Data.Total"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("GetCrackListResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setId(context.longValue("GetCrackListResponse.Data.Items["+ i +"].Id"));
			item.setLevel(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].Level"));
			item.setUuid(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].Uuid"));
			item.setProduct(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].Product"));
			item.setVmIp(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].VmIp"));
			item.setUrl(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].Url"));
			item.setMethod(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].Method"));
			item.setSourceIp(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].SourceIp"));
			item.setSourceUuid(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].SourceUuid"));
			item.setSourceDomain(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].SourceDomain"));
			item.setSourcePort(context.integerValue("GetCrackListResponse.Data.Items["+ i +"].SourcePort"));
			item.setSourceLocal(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].SourceLocal"));
			item.setDstIp(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].DstIp"));
			item.setDstUuid(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].DstUuid"));
			item.setDstDomain(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].DstDomain"));
			item.setDstPort(context.integerValue("GetCrackListResponse.Data.Items["+ i +"].DstPort"));
			item.setDstLocal(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].DstLocal"));
			item.setAttackCount(context.longValue("GetCrackListResponse.Data.Items["+ i +"].AttackCount"));
			item.setThreatRate(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].ThreatRate"));
			item.setAttackStartTime(context.longValue("GetCrackListResponse.Data.Items["+ i +"].AttackStartTime"));
			item.setAttackEndTime(context.longValue("GetCrackListResponse.Data.Items["+ i +"].AttackEndTime"));
			item.setAttackCategory(context.integerValue("GetCrackListResponse.Data.Items["+ i +"].AttackCategory"));
			item.setAttackCategoryName(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].AttackCategoryName"));
			item.setAttackType(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].AttackType"));
			item.setAttackTypeName(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].AttackTypeName"));
			item.setAttackStatus(context.integerValue("GetCrackListResponse.Data.Items["+ i +"].AttackStatus"));
			item.setAttackSource(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].AttackSource"));

			List<Detail> details = new ArrayList<Detail>();
			for (int j = 0; j < context.lengthValue("GetCrackListResponse.Data.Items["+ i +"].Details.Length"); j++) {
				Detail detail = new Detail();
				detail.setValue(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].Details["+ j +"].Value"));
				detail.setType(context.integerValue("GetCrackListResponse.Data.Items["+ i +"].Details["+ j +"].Type"));
				detail.setLabel(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].Details["+ j +"].Label"));
				detail.setLinkText(context.stringValue("GetCrackListResponse.Data.Items["+ i +"].Details["+ j +"].LinkText"));

				details.add(detail);
			}
			item.setDetails(details);

			items.add(item);
		}
		data.setItems(items);
		getCrackListResponse.setData(data);
	 
	 	return getCrackListResponse;
	}
}