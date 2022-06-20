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

import com.aliyuncs.sas.model.v20181203.QueryGroupedSecurityEventMarkMissListResponse;
import com.aliyuncs.sas.model.v20181203.QueryGroupedSecurityEventMarkMissListResponse.ListItem;
import com.aliyuncs.sas.model.v20181203.QueryGroupedSecurityEventMarkMissListResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryGroupedSecurityEventMarkMissListResponseUnmarshaller {

	public static QueryGroupedSecurityEventMarkMissListResponse unmarshall(QueryGroupedSecurityEventMarkMissListResponse queryGroupedSecurityEventMarkMissListResponse, UnmarshallerContext _ctx) {
		
		queryGroupedSecurityEventMarkMissListResponse.setRequestId(_ctx.stringValue("QueryGroupedSecurityEventMarkMissListResponse.RequestId"));
		queryGroupedSecurityEventMarkMissListResponse.setSuccess(_ctx.booleanValue("QueryGroupedSecurityEventMarkMissListResponse.Success"));
		queryGroupedSecurityEventMarkMissListResponse.setCode(_ctx.stringValue("QueryGroupedSecurityEventMarkMissListResponse.Code"));
		queryGroupedSecurityEventMarkMissListResponse.setMessage(_ctx.stringValue("QueryGroupedSecurityEventMarkMissListResponse.Message"));
		queryGroupedSecurityEventMarkMissListResponse.setHttpStatusCode(_ctx.integerValue("QueryGroupedSecurityEventMarkMissListResponse.HttpStatusCode"));
		queryGroupedSecurityEventMarkMissListResponse.setTimeCost(_ctx.longValue("QueryGroupedSecurityEventMarkMissListResponse.TimeCost"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("QueryGroupedSecurityEventMarkMissListResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("QueryGroupedSecurityEventMarkMissListResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("QueryGroupedSecurityEventMarkMissListResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("QueryGroupedSecurityEventMarkMissListResponse.PageInfo.Count"));
		queryGroupedSecurityEventMarkMissListResponse.setPageInfo(pageInfo);

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryGroupedSecurityEventMarkMissListResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setGmtCreate(_ctx.longValue("QueryGroupedSecurityEventMarkMissListResponse.List["+ i +"].GmtCreate"));
			listItem.setGmtModified(_ctx.longValue("QueryGroupedSecurityEventMarkMissListResponse.List["+ i +"].GmtModified"));
			listItem.setAliUid(_ctx.longValue("QueryGroupedSecurityEventMarkMissListResponse.List["+ i +"].AliUid"));
			listItem.setEventType(_ctx.stringValue("QueryGroupedSecurityEventMarkMissListResponse.List["+ i +"].EventType"));
			listItem.setEventTypeOriginal(_ctx.stringValue("QueryGroupedSecurityEventMarkMissListResponse.List["+ i +"].EventTypeOriginal"));
			listItem.setEventName(_ctx.stringValue("QueryGroupedSecurityEventMarkMissListResponse.List["+ i +"].EventName"));
			listItem.setEventNameOriginal(_ctx.stringValue("QueryGroupedSecurityEventMarkMissListResponse.List["+ i +"].EventNameOriginal"));
			listItem.setUuids(_ctx.stringValue("QueryGroupedSecurityEventMarkMissListResponse.List["+ i +"].Uuids"));
			listItem.setField(_ctx.stringValue("QueryGroupedSecurityEventMarkMissListResponse.List["+ i +"].Field"));
			listItem.setFiledAliasName(_ctx.stringValue("QueryGroupedSecurityEventMarkMissListResponse.List["+ i +"].FiledAliasName"));
			listItem.setFieldValue(_ctx.stringValue("QueryGroupedSecurityEventMarkMissListResponse.List["+ i +"].FieldValue"));
			listItem.setOperate(_ctx.stringValue("QueryGroupedSecurityEventMarkMissListResponse.List["+ i +"].Operate"));
			listItem.setDisposalWay(_ctx.stringValue("QueryGroupedSecurityEventMarkMissListResponse.List["+ i +"].DisposalWay"));

			list.add(listItem);
		}
		queryGroupedSecurityEventMarkMissListResponse.setList(list);
	 
	 	return queryGroupedSecurityEventMarkMissListResponse;
	}
}