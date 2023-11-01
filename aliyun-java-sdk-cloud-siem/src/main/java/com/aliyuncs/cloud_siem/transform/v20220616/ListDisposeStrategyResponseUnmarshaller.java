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

import com.aliyuncs.cloud_siem.model.v20220616.ListDisposeStrategyResponse;
import com.aliyuncs.cloud_siem.model.v20220616.ListDisposeStrategyResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.ListDisposeStrategyResponse.Data.PageInfo;
import com.aliyuncs.cloud_siem.model.v20220616.ListDisposeStrategyResponse.Data.ResponseDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDisposeStrategyResponseUnmarshaller {

	public static ListDisposeStrategyResponse unmarshall(ListDisposeStrategyResponse listDisposeStrategyResponse, UnmarshallerContext _ctx) {
		
		listDisposeStrategyResponse.setRequestId(_ctx.stringValue("ListDisposeStrategyResponse.RequestId"));
		listDisposeStrategyResponse.setSuccess(_ctx.booleanValue("ListDisposeStrategyResponse.Success"));
		listDisposeStrategyResponse.setCode(_ctx.integerValue("ListDisposeStrategyResponse.Code"));
		listDisposeStrategyResponse.setMessage(_ctx.stringValue("ListDisposeStrategyResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListDisposeStrategyResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListDisposeStrategyResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.longValue("ListDisposeStrategyResponse.Data.PageInfo.TotalCount"));
		data.setPageInfo(pageInfo);

		List<ResponseDataItem> responseData = new ArrayList<ResponseDataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDisposeStrategyResponse.Data.ResponseData.Length"); i++) {
			ResponseDataItem responseDataItem = new ResponseDataItem();
			responseDataItem.setId(_ctx.longValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].Id"));
			responseDataItem.setGmtCreate(_ctx.stringValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].GmtCreate"));
			responseDataItem.setGmtModified(_ctx.stringValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].GmtModified"));
			responseDataItem.setAliuid(_ctx.longValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].Aliuid"));
			responseDataItem.setSubAliuid(_ctx.longValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].SubAliuid"));
			responseDataItem.setIncidentName(_ctx.stringValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].IncidentName"));
			responseDataItem.setIncidentUuid(_ctx.stringValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].IncidentUuid"));
			responseDataItem.setAlertUuid(_ctx.stringValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].AlertUuid"));
			responseDataItem.setSophonTaskId(_ctx.stringValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].SophonTaskId"));
			responseDataItem.setPlaybookName(_ctx.stringValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].PlaybookName"));
			responseDataItem.setPlaybookUuid(_ctx.stringValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].PlaybookUuid"));
			responseDataItem.setPlaybookType(_ctx.stringValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].PlaybookType"));
			responseDataItem.setEntityId(_ctx.longValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].EntityId"));
			responseDataItem.setEntityType(_ctx.stringValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].EntityType"));
			responseDataItem.setTaskParam(_ctx.stringValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].TaskParam"));
			responseDataItem.setErrorMessage(_ctx.stringValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].ErrorMessage"));
			responseDataItem.setFinishTime(_ctx.stringValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].FinishTime"));
			responseDataItem.setEffectiveStatus(_ctx.integerValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].EffectiveStatus"));
			responseDataItem.setStatus(_ctx.integerValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].Status"));

			List<String> scope = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].Scope.Length"); j++) {
				scope.add(_ctx.stringValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].Scope["+ j +"]"));
			}
			responseDataItem.setScope(scope);

			List<String> entity = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].Entity.Length"); j++) {
				entity.add(_ctx.stringValue("ListDisposeStrategyResponse.Data.ResponseData["+ i +"].Entity["+ j +"]"));
			}
			responseDataItem.setEntity(entity);

			responseData.add(responseDataItem);
		}
		data.setResponseData(responseData);
		listDisposeStrategyResponse.setData(data);
	 
	 	return listDisposeStrategyResponse;
	}
}