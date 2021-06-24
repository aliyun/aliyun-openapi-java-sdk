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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryUserQuotaCategoryRelationResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryUserQuotaCategoryRelationResponse.CategoryRelation;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryUserQuotaCategoryRelationResponseUnmarshaller {

	public static OpsQueryUserQuotaCategoryRelationResponse unmarshall(OpsQueryUserQuotaCategoryRelationResponse opsQueryUserQuotaCategoryRelationResponse, UnmarshallerContext _ctx) {
		
		opsQueryUserQuotaCategoryRelationResponse.setRequestId(_ctx.stringValue("OpsQueryUserQuotaCategoryRelationResponse.RequestId"));
		opsQueryUserQuotaCategoryRelationResponse.setTotalCount(_ctx.integerValue("OpsQueryUserQuotaCategoryRelationResponse.TotalCount"));
		opsQueryUserQuotaCategoryRelationResponse.setNextToken(_ctx.stringValue("OpsQueryUserQuotaCategoryRelationResponse.NextToken"));
		opsQueryUserQuotaCategoryRelationResponse.setPageSize(_ctx.integerValue("OpsQueryUserQuotaCategoryRelationResponse.PageSize"));
		opsQueryUserQuotaCategoryRelationResponse.setPageNumber(_ctx.integerValue("OpsQueryUserQuotaCategoryRelationResponse.PageNumber"));

		List<CategoryRelation> categoryRelations = new ArrayList<CategoryRelation>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryUserQuotaCategoryRelationResponse.CategoryRelations.Length"); i++) {
			CategoryRelation categoryRelation = new CategoryRelation();
			categoryRelation.setUidType(_ctx.integerValue("OpsQueryUserQuotaCategoryRelationResponse.CategoryRelations["+ i +"].UidType"));
			categoryRelation.setGmtModifiedStr(_ctx.stringValue("OpsQueryUserQuotaCategoryRelationResponse.CategoryRelations["+ i +"].GmtModifiedStr"));
			categoryRelation.setCategoryName(_ctx.stringValue("OpsQueryUserQuotaCategoryRelationResponse.CategoryRelations["+ i +"].CategoryName"));
			categoryRelation.setCategoryType(_ctx.integerValue("OpsQueryUserQuotaCategoryRelationResponse.CategoryRelations["+ i +"].CategoryType"));
			categoryRelation.setId(_ctx.longValue("OpsQueryUserQuotaCategoryRelationResponse.CategoryRelations["+ i +"].Id"));
			categoryRelation.setGmtCreateStr(_ctx.stringValue("OpsQueryUserQuotaCategoryRelationResponse.CategoryRelations["+ i +"].GmtCreateStr"));
			categoryRelation.setUid(_ctx.longValue("OpsQueryUserQuotaCategoryRelationResponse.CategoryRelations["+ i +"].Uid"));

			categoryRelations.add(categoryRelation);
		}
		opsQueryUserQuotaCategoryRelationResponse.setCategoryRelations(categoryRelations);
	 
	 	return opsQueryUserQuotaCategoryRelationResponse;
	}
}