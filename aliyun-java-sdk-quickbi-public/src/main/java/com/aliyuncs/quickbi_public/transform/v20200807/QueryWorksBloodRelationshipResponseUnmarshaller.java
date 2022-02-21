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

package com.aliyuncs.quickbi_public.transform.v20200807;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20200807.QueryWorksBloodRelationshipResponse;
import com.aliyuncs.quickbi_public.model.v20200807.QueryWorksBloodRelationshipResponse.Item;
import com.aliyuncs.quickbi_public.model.v20200807.QueryWorksBloodRelationshipResponse.Item.QueryParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryWorksBloodRelationshipResponseUnmarshaller {

	public static QueryWorksBloodRelationshipResponse unmarshall(QueryWorksBloodRelationshipResponse queryWorksBloodRelationshipResponse, UnmarshallerContext _ctx) {
		
		queryWorksBloodRelationshipResponse.setRequestId(_ctx.stringValue("QueryWorksBloodRelationshipResponse.RequestId"));
		queryWorksBloodRelationshipResponse.setSuccess(_ctx.booleanValue("QueryWorksBloodRelationshipResponse.Success"));

		List<Item> result = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryWorksBloodRelationshipResponse.Result.Length"); i++) {
			Item item = new Item();
			item.setComponentId(_ctx.stringValue("QueryWorksBloodRelationshipResponse.Result["+ i +"].ComponentId"));
			item.setComponentName(_ctx.stringValue("QueryWorksBloodRelationshipResponse.Result["+ i +"].ComponentName"));
			item.setComponentType(_ctx.integerValue("QueryWorksBloodRelationshipResponse.Result["+ i +"].ComponentType"));
			item.setComponentTypeName(_ctx.stringValue("QueryWorksBloodRelationshipResponse.Result["+ i +"].ComponentTypeName"));
			item.setDatasetId(_ctx.stringValue("QueryWorksBloodRelationshipResponse.Result["+ i +"].DatasetId"));

			List<QueryParam> queryParams = new ArrayList<QueryParam>();
			for (int j = 0; j < _ctx.lengthValue("QueryWorksBloodRelationshipResponse.Result["+ i +"].QueryParams.Length"); j++) {
				QueryParam queryParam = new QueryParam();
				queryParam.setUid(_ctx.stringValue("QueryWorksBloodRelationshipResponse.Result["+ i +"].QueryParams["+ j +"].Uid"));
				queryParam.setPathId(_ctx.stringValue("QueryWorksBloodRelationshipResponse.Result["+ i +"].QueryParams["+ j +"].PathId"));
				queryParam.setCaption(_ctx.stringValue("QueryWorksBloodRelationshipResponse.Result["+ i +"].QueryParams["+ j +"].Caption"));
				queryParam.setDataType(_ctx.stringValue("QueryWorksBloodRelationshipResponse.Result["+ i +"].QueryParams["+ j +"].DataType"));
				queryParam.setIsMeasure(_ctx.booleanValue("QueryWorksBloodRelationshipResponse.Result["+ i +"].QueryParams["+ j +"].IsMeasure"));
				queryParam.setAreaId(_ctx.stringValue("QueryWorksBloodRelationshipResponse.Result["+ i +"].QueryParams["+ j +"].AreaId"));
				queryParam.setAreaName(_ctx.stringValue("QueryWorksBloodRelationshipResponse.Result["+ i +"].QueryParams["+ j +"].AreaName"));

				queryParams.add(queryParam);
			}
			item.setQueryParams(queryParams);

			result.add(item);
		}
		queryWorksBloodRelationshipResponse.setResult(result);
	 
	 	return queryWorksBloodRelationshipResponse;
	}
}