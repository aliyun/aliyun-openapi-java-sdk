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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryODPSqlAuditDetailResponse;
import com.aliyuncs.sofa.model.v20190815.QueryODPSqlAuditDetailResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryODPSqlAuditDetailResponse.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPSqlAuditDetailResponseUnmarshaller {

	public static QueryODPSqlAuditDetailResponse unmarshall(QueryODPSqlAuditDetailResponse queryODPSqlAuditDetailResponse, UnmarshallerContext _ctx) {
		
		queryODPSqlAuditDetailResponse.setRequestId(_ctx.stringValue("QueryODPSqlAuditDetailResponse.RequestId"));
		queryODPSqlAuditDetailResponse.setResultCode(_ctx.stringValue("QueryODPSqlAuditDetailResponse.ResultCode"));
		queryODPSqlAuditDetailResponse.setResultMessage(_ctx.stringValue("QueryODPSqlAuditDetailResponse.ResultMessage"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("QueryODPSqlAuditDetailResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("QueryODPSqlAuditDetailResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("QueryODPSqlAuditDetailResponse.Data.Total"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryODPSqlAuditDetailResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setPhysicalTableName(_ctx.stringValue("QueryODPSqlAuditDetailResponse.Data.Content["+ i +"].PhysicalTableName"));
			contentItem.setResult(_ctx.stringValue("QueryODPSqlAuditDetailResponse.Data.Content["+ i +"].Result"));
			contentItem.setRow(_ctx.longValue("QueryODPSqlAuditDetailResponse.Data.Content["+ i +"].Row"));
			contentItem.setSchemaName(_ctx.stringValue("QueryODPSqlAuditDetailResponse.Data.Content["+ i +"].SchemaName"));
			contentItem.setSql(_ctx.stringValue("QueryODPSqlAuditDetailResponse.Data.Content["+ i +"].Sql"));
			contentItem.setTableName(_ctx.stringValue("QueryODPSqlAuditDetailResponse.Data.Content["+ i +"].TableName"));
			contentItem.setTime(_ctx.stringValue("QueryODPSqlAuditDetailResponse.Data.Content["+ i +"].Time"));
			contentItem.setTotalTime(_ctx.longValue("QueryODPSqlAuditDetailResponse.Data.Content["+ i +"].TotalTime"));

			content.add(contentItem);
		}
		data.setContent(content);
		queryODPSqlAuditDetailResponse.setData(data);
	 
	 	return queryODPSqlAuditDetailResponse;
	}
}