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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.QueryDataServiceListResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDataServiceListResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDataServiceListResponse.Result.QueryDataServiceModel;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDataServiceListResponse.Result.QueryDataServiceModel.Content;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDataServiceListResponse.Result.QueryDataServiceModel.Content.Filter;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDataServiceListResponse.Result.QueryDataServiceModel.Content.SelectFieldModel;
import com.aliyuncs.quickbi_public.model.v20220101.QueryDataServiceListResponse.Result.QueryDataServiceModel.Content.SelectFieldModel.Field;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDataServiceListResponseUnmarshaller {

	public static QueryDataServiceListResponse unmarshall(QueryDataServiceListResponse queryDataServiceListResponse, UnmarshallerContext _ctx) {
		
		queryDataServiceListResponse.setRequestId(_ctx.stringValue("QueryDataServiceListResponse.RequestId"));
		queryDataServiceListResponse.setSuccess(_ctx.booleanValue("QueryDataServiceListResponse.Success"));

		Result result = new Result();
		result.setTotalNum(_ctx.integerValue("QueryDataServiceListResponse.Result.TotalNum"));
		result.setPageNum(_ctx.integerValue("QueryDataServiceListResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("QueryDataServiceListResponse.Result.PageSize"));
		result.setTotalPages(_ctx.integerValue("QueryDataServiceListResponse.Result.TotalPages"));

		List<QueryDataServiceModel> data = new ArrayList<QueryDataServiceModel>();
		for (int i = 0; i < _ctx.lengthValue("QueryDataServiceListResponse.Result.Data.Length"); i++) {
			QueryDataServiceModel queryDataServiceModel = new QueryDataServiceModel();
			queryDataServiceModel.setOwnerName(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].OwnerName"));
			queryDataServiceModel.setCubeId(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].CubeId"));
			queryDataServiceModel.setCreatorId(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].CreatorId"));
			queryDataServiceModel.setModifierName(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].ModifierName"));
			queryDataServiceModel.setGmtModified(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].GmtModified"));
			queryDataServiceModel.setWorkspaceId(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].WorkspaceId"));
			queryDataServiceModel.setName(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Name"));
			queryDataServiceModel.setSid(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Sid"));
			queryDataServiceModel.setDesc(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Desc"));
			queryDataServiceModel.setGmtCreate(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].GmtCreate"));
			queryDataServiceModel.setOwnerId(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].OwnerId"));
			queryDataServiceModel.setCubeName(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].CubeName"));
			queryDataServiceModel.setWorkspaceName(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].WorkspaceName"));
			queryDataServiceModel.setCreatorName(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].CreatorName"));
			queryDataServiceModel.setModifierId(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].ModifierId"));

			Content content = new Content();
			content.setCubeId(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.CubeId"));
			content.setCubeName(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.CubeName"));
			content.setDetail(_ctx.booleanValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.Detail"));

			Filter filter = new Filter();
			filter.setType(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.Filter.Type"));
			filter.setLogicalOperator(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.Filter.LogicalOperator"));

			List<Map<Object, Object>> filters = _ctx.listMapValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.Filter.Filters");
			filter.setFilters(filters);
			content.setFilter(filter);

			List<SelectFieldModel> returnFields = new ArrayList<SelectFieldModel>();
			for (int j = 0; j < _ctx.lengthValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.ReturnFields.Length"); j++) {
				SelectFieldModel selectFieldModel = new SelectFieldModel();
				selectFieldModel.setOrderby(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.ReturnFields["+ j +"].Orderby"));
				selectFieldModel.setDesc(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.ReturnFields["+ j +"].Desc"));
				selectFieldModel.setAlias(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.ReturnFields["+ j +"].Alias"));
				selectFieldModel.setAggregator(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.ReturnFields["+ j +"].Aggregator"));

				Field field = new Field();
				field.setFid(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.ReturnFields["+ j +"].Field.Fid"));
				field.setType(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.ReturnFields["+ j +"].Field.Type"));
				field.setColumn(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.ReturnFields["+ j +"].Field.Column"));
				field.setDataType(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.ReturnFields["+ j +"].Field.DataType"));
				field.setGranularity(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.ReturnFields["+ j +"].Field.Granularity"));
				field.setCaption(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.ReturnFields["+ j +"].Field.Caption"));
				field.setName(_ctx.stringValue("QueryDataServiceListResponse.Result.Data["+ i +"].Content.ReturnFields["+ j +"].Field.Name"));
				selectFieldModel.setField(field);

				returnFields.add(selectFieldModel);
			}
			content.setReturnFields(returnFields);
			queryDataServiceModel.setContent(content);

			data.add(queryDataServiceModel);
		}
		result.setData(data);
		queryDataServiceListResponse.setResult(result);
	 
	 	return queryDataServiceListResponse;
	}
}