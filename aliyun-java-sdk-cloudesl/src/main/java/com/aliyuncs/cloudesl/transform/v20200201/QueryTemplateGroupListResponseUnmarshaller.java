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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.QueryTemplateGroupListResponse;
import com.aliyuncs.cloudesl.model.v20200201.QueryTemplateGroupListResponse.TemplateGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTemplateGroupListResponseUnmarshaller {

	public static QueryTemplateGroupListResponse unmarshall(QueryTemplateGroupListResponse queryTemplateGroupListResponse, UnmarshallerContext _ctx) {
		
		queryTemplateGroupListResponse.setRequestId(_ctx.stringValue("QueryTemplateGroupListResponse.RequestId"));
		queryTemplateGroupListResponse.setSuccess(_ctx.booleanValue("QueryTemplateGroupListResponse.Success"));
		queryTemplateGroupListResponse.setMessage(_ctx.stringValue("QueryTemplateGroupListResponse.Message"));
		queryTemplateGroupListResponse.setErrorCode(_ctx.stringValue("QueryTemplateGroupListResponse.ErrorCode"));
		queryTemplateGroupListResponse.setErrorMessage(_ctx.stringValue("QueryTemplateGroupListResponse.ErrorMessage"));
		queryTemplateGroupListResponse.setCode(_ctx.stringValue("QueryTemplateGroupListResponse.Code"));
		queryTemplateGroupListResponse.setDynamicCode(_ctx.stringValue("QueryTemplateGroupListResponse.DynamicCode"));
		queryTemplateGroupListResponse.setDynamicMessage(_ctx.stringValue("QueryTemplateGroupListResponse.DynamicMessage"));
		queryTemplateGroupListResponse.setPageSize(_ctx.integerValue("QueryTemplateGroupListResponse.PageSize"));
		queryTemplateGroupListResponse.setPageNumber(_ctx.integerValue("QueryTemplateGroupListResponse.PageNumber"));
		queryTemplateGroupListResponse.setTotalCount(_ctx.integerValue("QueryTemplateGroupListResponse.TotalCount"));

		List<TemplateGroup> templateGroupList = new ArrayList<TemplateGroup>();
		for (int i = 0; i < _ctx.lengthValue("QueryTemplateGroupListResponse.TemplateGroupList.Length"); i++) {
			TemplateGroup templateGroup = new TemplateGroup();
			templateGroup.setGroupId(_ctx.stringValue("QueryTemplateGroupListResponse.TemplateGroupList["+ i +"].GroupId"));
			templateGroup.setGroupName(_ctx.stringValue("QueryTemplateGroupListResponse.TemplateGroupList["+ i +"].GroupName"));
			templateGroup.setDescription(_ctx.stringValue("QueryTemplateGroupListResponse.TemplateGroupList["+ i +"].Description"));
			templateGroup.setWidthPx(_ctx.integerValue("QueryTemplateGroupListResponse.TemplateGroupList["+ i +"].WidthPx"));
			templateGroup.setHeightPx(_ctx.integerValue("QueryTemplateGroupListResponse.TemplateGroupList["+ i +"].HeightPx"));
			templateGroup.setRelation(_ctx.stringValue("QueryTemplateGroupListResponse.TemplateGroupList["+ i +"].Relation"));

			templateGroupList.add(templateGroup);
		}
		queryTemplateGroupListResponse.setTemplateGroupList(templateGroupList);
	 
	 	return queryTemplateGroupListResponse;
	}
}