/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListAgentlessRiskUuidResponse;
import com.aliyuncs.sas.model.v20181203.ListAgentlessRiskUuidResponse.ListItem;
import com.aliyuncs.sas.model.v20181203.ListAgentlessRiskUuidResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentlessRiskUuidResponseUnmarshaller {

	public static ListAgentlessRiskUuidResponse unmarshall(ListAgentlessRiskUuidResponse listAgentlessRiskUuidResponse, UnmarshallerContext _ctx) {
		
		listAgentlessRiskUuidResponse.setRequestId(_ctx.stringValue("ListAgentlessRiskUuidResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListAgentlessRiskUuidResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListAgentlessRiskUuidResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListAgentlessRiskUuidResponse.PageInfo.TotalCount"));
		listAgentlessRiskUuidResponse.setPageInfo(pageInfo);

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAgentlessRiskUuidResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setUuid(_ctx.stringValue("ListAgentlessRiskUuidResponse.List["+ i +"].Uuid"));
			listItem.setInstanceName(_ctx.stringValue("ListAgentlessRiskUuidResponse.List["+ i +"].InstanceName"));
			listItem.setInternetIp(_ctx.stringValue("ListAgentlessRiskUuidResponse.List["+ i +"].InternetIp"));
			listItem.setIntranetIp(_ctx.stringValue("ListAgentlessRiskUuidResponse.List["+ i +"].IntranetIp"));
			listItem.setVulCount(_ctx.integerValue("ListAgentlessRiskUuidResponse.List["+ i +"].VulCount"));
			listItem.setMaliciousCount(_ctx.integerValue("ListAgentlessRiskUuidResponse.List["+ i +"].MaliciousCount"));
			listItem.setBaselineCount(_ctx.integerValue("ListAgentlessRiskUuidResponse.List["+ i +"].BaselineCount"));
			listItem.setTargetId(_ctx.stringValue("ListAgentlessRiskUuidResponse.List["+ i +"].TargetId"));
			listItem.setTargetName(_ctx.stringValue("ListAgentlessRiskUuidResponse.List["+ i +"].TargetName"));
			listItem.setScanTime(_ctx.longValue("ListAgentlessRiskUuidResponse.List["+ i +"].ScanTime"));

			list.add(listItem);
		}
		listAgentlessRiskUuidResponse.setList(list);
	 
	 	return listAgentlessRiskUuidResponse;
	}
}