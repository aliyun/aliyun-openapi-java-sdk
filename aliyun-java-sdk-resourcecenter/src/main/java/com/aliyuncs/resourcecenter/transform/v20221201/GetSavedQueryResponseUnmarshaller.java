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

package com.aliyuncs.resourcecenter.transform.v20221201;

import com.aliyuncs.resourcecenter.model.v20221201.GetSavedQueryResponse;
import com.aliyuncs.resourcecenter.model.v20221201.GetSavedQueryResponse.SavedQuery;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSavedQueryResponseUnmarshaller {

	public static GetSavedQueryResponse unmarshall(GetSavedQueryResponse getSavedQueryResponse, UnmarshallerContext _ctx) {
		
		getSavedQueryResponse.setRequestId(_ctx.stringValue("GetSavedQueryResponse.RequestId"));

		SavedQuery savedQuery = new SavedQuery();
		savedQuery.setQueryId(_ctx.stringValue("GetSavedQueryResponse.SavedQuery.QueryId"));
		savedQuery.setExpression(_ctx.stringValue("GetSavedQueryResponse.SavedQuery.Expression"));
		savedQuery.setName(_ctx.stringValue("GetSavedQueryResponse.SavedQuery.Name"));
		savedQuery.setDescription(_ctx.stringValue("GetSavedQueryResponse.SavedQuery.Description"));
		savedQuery.setCreateTime(_ctx.stringValue("GetSavedQueryResponse.SavedQuery.CreateTime"));
		savedQuery.setUpdateTime(_ctx.stringValue("GetSavedQueryResponse.SavedQuery.UpdateTime"));
		getSavedQueryResponse.setSavedQuery(savedQuery);
	 
	 	return getSavedQueryResponse;
	}
}