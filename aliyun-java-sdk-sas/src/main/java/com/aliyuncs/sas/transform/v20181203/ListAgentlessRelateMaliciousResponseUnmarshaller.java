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

import com.aliyuncs.sas.model.v20181203.ListAgentlessRelateMaliciousResponse;
import com.aliyuncs.sas.model.v20181203.ListAgentlessRelateMaliciousResponse.ListItem;
import com.aliyuncs.sas.model.v20181203.ListAgentlessRelateMaliciousResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentlessRelateMaliciousResponseUnmarshaller {

	public static ListAgentlessRelateMaliciousResponse unmarshall(ListAgentlessRelateMaliciousResponse listAgentlessRelateMaliciousResponse, UnmarshallerContext _ctx) {
		
		listAgentlessRelateMaliciousResponse.setRequestId(_ctx.stringValue("ListAgentlessRelateMaliciousResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListAgentlessRelateMaliciousResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListAgentlessRelateMaliciousResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListAgentlessRelateMaliciousResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("ListAgentlessRelateMaliciousResponse.PageInfo.Count"));
		listAgentlessRelateMaliciousResponse.setPageInfo(pageInfo);

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAgentlessRelateMaliciousResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setInstanceName(_ctx.stringValue("ListAgentlessRelateMaliciousResponse.List["+ i +"].InstanceName"));
			listItem.setInternetIp(_ctx.stringValue("ListAgentlessRelateMaliciousResponse.List["+ i +"].InternetIp"));
			listItem.setIntranetIp(_ctx.stringValue("ListAgentlessRelateMaliciousResponse.List["+ i +"].IntranetIp"));
			listItem.setUuid(_ctx.stringValue("ListAgentlessRelateMaliciousResponse.List["+ i +"].Uuid"));
			listItem.setFirstScanTimestamp(_ctx.longValue("ListAgentlessRelateMaliciousResponse.List["+ i +"].FirstScanTimestamp"));
			listItem.setLatestScanTimestamp(_ctx.longValue("ListAgentlessRelateMaliciousResponse.List["+ i +"].LatestScanTimestamp"));
			listItem.setFilePath(_ctx.stringValue("ListAgentlessRelateMaliciousResponse.List["+ i +"].FilePath"));

			list.add(listItem);
		}
		listAgentlessRelateMaliciousResponse.setList(list);
	 
	 	return listAgentlessRelateMaliciousResponse;
	}
}