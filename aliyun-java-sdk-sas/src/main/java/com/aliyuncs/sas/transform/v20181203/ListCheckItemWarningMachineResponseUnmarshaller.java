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

import com.aliyuncs.sas.model.v20181203.ListCheckItemWarningMachineResponse;
import com.aliyuncs.sas.model.v20181203.ListCheckItemWarningMachineResponse.ListItem;
import com.aliyuncs.sas.model.v20181203.ListCheckItemWarningMachineResponse.ListItem.FixListItem;
import com.aliyuncs.sas.model.v20181203.ListCheckItemWarningMachineResponse.ListItem.WarningRiskListItem;
import com.aliyuncs.sas.model.v20181203.ListCheckItemWarningMachineResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCheckItemWarningMachineResponseUnmarshaller {

	public static ListCheckItemWarningMachineResponse unmarshall(ListCheckItemWarningMachineResponse listCheckItemWarningMachineResponse, UnmarshallerContext _ctx) {
		
		listCheckItemWarningMachineResponse.setRequestId(_ctx.stringValue("ListCheckItemWarningMachineResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListCheckItemWarningMachineResponse.PageInfo.CurrentPage"));
		pageInfo.setLastRowKey(_ctx.stringValue("ListCheckItemWarningMachineResponse.PageInfo.LastRowKey"));
		pageInfo.setPageSize(_ctx.integerValue("ListCheckItemWarningMachineResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListCheckItemWarningMachineResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("ListCheckItemWarningMachineResponse.PageInfo.Count"));
		listCheckItemWarningMachineResponse.setPageInfo(pageInfo);

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCheckItemWarningMachineResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setStatus(_ctx.integerValue("ListCheckItemWarningMachineResponse.List["+ i +"].Status"));
			listItem.setBind(_ctx.booleanValue("ListCheckItemWarningMachineResponse.List["+ i +"].Bind"));
			listItem.setAuthVersion(_ctx.integerValue("ListCheckItemWarningMachineResponse.List["+ i +"].AuthVersion"));
			listItem.setPortOpen(_ctx.booleanValue("ListCheckItemWarningMachineResponse.List["+ i +"].PortOpen"));
			listItem.setInstanceId(_ctx.stringValue("ListCheckItemWarningMachineResponse.List["+ i +"].InstanceId"));
			listItem.setIntranetIp(_ctx.stringValue("ListCheckItemWarningMachineResponse.List["+ i +"].IntranetIp"));
			listItem.setInternetIp(_ctx.stringValue("ListCheckItemWarningMachineResponse.List["+ i +"].InternetIp"));
			listItem.setInstanceName(_ctx.stringValue("ListCheckItemWarningMachineResponse.List["+ i +"].InstanceName"));
			listItem.setUuid(_ctx.stringValue("ListCheckItemWarningMachineResponse.List["+ i +"].Uuid"));
			listItem.setRegionId(_ctx.stringValue("ListCheckItemWarningMachineResponse.List["+ i +"].RegionId"));
			listItem.setPrompt(_ctx.stringValue("ListCheckItemWarningMachineResponse.List["+ i +"].Prompt"));

			List<WarningRiskListItem> warningRiskList = new ArrayList<WarningRiskListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCheckItemWarningMachineResponse.List["+ i +"].WarningRiskList.Length"); j++) {
				WarningRiskListItem warningRiskListItem = new WarningRiskListItem();
				warningRiskListItem.setRiskId(_ctx.longValue("ListCheckItemWarningMachineResponse.List["+ i +"].WarningRiskList["+ j +"].RiskId"));
				warningRiskListItem.setRiskName(_ctx.stringValue("ListCheckItemWarningMachineResponse.List["+ i +"].WarningRiskList["+ j +"].RiskName"));

				warningRiskList.add(warningRiskListItem);
			}
			listItem.setWarningRiskList(warningRiskList);

			List<FixListItem> fixList = new ArrayList<FixListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCheckItemWarningMachineResponse.List["+ i +"].FixList.Length"); j++) {
				FixListItem fixListItem = new FixListItem();
				fixListItem.setRiskId(_ctx.longValue("ListCheckItemWarningMachineResponse.List["+ i +"].FixList["+ j +"].RiskId"));
				fixListItem.setRiskName(_ctx.stringValue("ListCheckItemWarningMachineResponse.List["+ i +"].FixList["+ j +"].RiskName"));

				fixList.add(fixListItem);
			}
			listItem.setFixList(fixList);

			list.add(listItem);
		}
		listCheckItemWarningMachineResponse.setList(list);
	 
	 	return listCheckItemWarningMachineResponse;
	}
}