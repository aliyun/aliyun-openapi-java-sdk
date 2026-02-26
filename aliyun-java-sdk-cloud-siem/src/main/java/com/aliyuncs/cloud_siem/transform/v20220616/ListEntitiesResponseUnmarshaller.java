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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.ListEntitiesResponse;
import com.aliyuncs.cloud_siem.model.v20220616.ListEntitiesResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.ListEntitiesResponse.Data.PageInfo;
import com.aliyuncs.cloud_siem.model.v20220616.ListEntitiesResponse.Data.ResponseDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEntitiesResponseUnmarshaller {

	public static ListEntitiesResponse unmarshall(ListEntitiesResponse listEntitiesResponse, UnmarshallerContext _ctx) {
		
		listEntitiesResponse.setRequestId(_ctx.stringValue("ListEntitiesResponse.RequestId"));
		listEntitiesResponse.setSuccess(_ctx.booleanValue("ListEntitiesResponse.Success"));
		listEntitiesResponse.setCode(_ctx.integerValue("ListEntitiesResponse.Code"));
		listEntitiesResponse.setMessage(_ctx.stringValue("ListEntitiesResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListEntitiesResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListEntitiesResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.longValue("ListEntitiesResponse.Data.PageInfo.TotalCount"));
		data.setPageInfo(pageInfo);

		List<ResponseDataItem> responseData = new ArrayList<ResponseDataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEntitiesResponse.Data.ResponseData.Length"); i++) {
			ResponseDataItem responseDataItem = new ResponseDataItem();
			responseDataItem.setId(_ctx.longValue("ListEntitiesResponse.Data.ResponseData["+ i +"].Id"));
			responseDataItem.setGmtCreate(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].GmtCreate"));
			responseDataItem.setGmtModified(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].GmtModified"));
			responseDataItem.setAliuid(_ctx.longValue("ListEntitiesResponse.Data.ResponseData["+ i +"].Aliuid"));
			responseDataItem.setIncidentUuid(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].IncidentUuid"));
			responseDataItem.setAlertUuid(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].AlertUuid"));
			responseDataItem.setAlertNum(_ctx.integerValue("ListEntitiesResponse.Data.ResponseData["+ i +"].AlertNum"));
			responseDataItem.setEventNum(_ctx.integerValue("ListEntitiesResponse.Data.ResponseData["+ i +"].EventNum"));
			responseDataItem.setCloudCode(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].CloudCode"));
			responseDataItem.setEntityType(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].EntityType"));
			responseDataItem.setEntityName(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].EntityName"));
			responseDataItem.setEntityInfo(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].EntityInfo"));
			responseDataItem.setSubUserId(_ctx.longValue("ListEntitiesResponse.Data.ResponseData["+ i +"].SubUserId"));
			responseDataItem.setEntityId(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].EntityId"));
			responseDataItem.setEntityUuid(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].EntityUuid"));
			responseDataItem.setMalwareType(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].MalwareType"));
			responseDataItem.setIsAsset(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].IsAsset"));
			responseDataItem.setIsMalware(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].IsMalware"));
			responseDataItem.setTags(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].Tags"));
			responseDataItem.setAgentDisposalMethod(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].AgentDisposalMethod"));
			responseDataItem.setAgentDisposalPlaybookUuid(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].AgentDisposalPlaybookUuid"));
			responseDataItem.setAgentDisposalSuggestion(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].AgentDisposalSuggestion"));
			responseDataItem.setAgentConfidence(_ctx.stringValue("ListEntitiesResponse.Data.ResponseData["+ i +"].AgentConfidence"));

			responseData.add(responseDataItem);
		}
		data.setResponseData(responseData);
		listEntitiesResponse.setData(data);
	 
	 	return listEntitiesResponse;
	}
}