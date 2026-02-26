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

import com.aliyuncs.sas.model.v20181203.ListCheckItemWarningSummaryResponse;
import com.aliyuncs.sas.model.v20181203.ListCheckItemWarningSummaryResponse.ListItem;
import com.aliyuncs.sas.model.v20181203.ListCheckItemWarningSummaryResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCheckItemWarningSummaryResponseUnmarshaller {

	public static ListCheckItemWarningSummaryResponse unmarshall(ListCheckItemWarningSummaryResponse listCheckItemWarningSummaryResponse, UnmarshallerContext _ctx) {
		
		listCheckItemWarningSummaryResponse.setRequestId(_ctx.stringValue("ListCheckItemWarningSummaryResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListCheckItemWarningSummaryResponse.PageInfo.CurrentPage"));
		pageInfo.setLastRowKey(_ctx.stringValue("ListCheckItemWarningSummaryResponse.PageInfo.LastRowKey"));
		pageInfo.setPageSize(_ctx.integerValue("ListCheckItemWarningSummaryResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListCheckItemWarningSummaryResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("ListCheckItemWarningSummaryResponse.PageInfo.Count"));
		listCheckItemWarningSummaryResponse.setPageInfo(pageInfo);

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCheckItemWarningSummaryResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setRiskType(_ctx.stringValue("ListCheckItemWarningSummaryResponse.List["+ i +"].RiskType"));
			listItem.setAlias(_ctx.stringValue("ListCheckItemWarningSummaryResponse.List["+ i +"].Alias"));
			listItem.setCheckId(_ctx.longValue("ListCheckItemWarningSummaryResponse.List["+ i +"].CheckId"));
			listItem.setCheckItem(_ctx.stringValue("ListCheckItemWarningSummaryResponse.List["+ i +"].CheckItem"));
			listItem.setCheckLevel(_ctx.stringValue("ListCheckItemWarningSummaryResponse.List["+ i +"].CheckLevel"));
			listItem.setCheckType(_ctx.stringValue("ListCheckItemWarningSummaryResponse.List["+ i +"].CheckType"));
			listItem.setAdvice(_ctx.stringValue("ListCheckItemWarningSummaryResponse.List["+ i +"].Advice"));
			listItem.setDescription(_ctx.stringValue("ListCheckItemWarningSummaryResponse.List["+ i +"].Description"));
			listItem.setStatus(_ctx.integerValue("ListCheckItemWarningSummaryResponse.List["+ i +"].Status"));
			listItem.setWarningMachineCount(_ctx.integerValue("ListCheckItemWarningSummaryResponse.List["+ i +"].WarningMachineCount"));
			listItem.setContainerCheckItem(_ctx.booleanValue("ListCheckItemWarningSummaryResponse.List["+ i +"].ContainerCheckItem"));

			list.add(listItem);
		}
		listCheckItemWarningSummaryResponse.setList(list);
	 
	 	return listCheckItemWarningSummaryResponse;
	}
}