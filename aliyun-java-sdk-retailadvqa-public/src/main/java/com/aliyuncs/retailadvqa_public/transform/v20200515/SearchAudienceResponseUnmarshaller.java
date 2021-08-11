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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa_public.model.v20200515.SearchAudienceResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.SearchAudienceResponse.Data;
import com.aliyuncs.retailadvqa_public.model.v20200515.SearchAudienceResponse.Data.ExtendMappingTypesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchAudienceResponseUnmarshaller {

	public static SearchAudienceResponse unmarshall(SearchAudienceResponse searchAudienceResponse, UnmarshallerContext _ctx) {
		
		searchAudienceResponse.setRequestId(_ctx.stringValue("SearchAudienceResponse.RequestId"));
		searchAudienceResponse.setErrorDesc(_ctx.stringValue("SearchAudienceResponse.ErrorDesc"));
		searchAudienceResponse.setTraceId(_ctx.stringValue("SearchAudienceResponse.TraceId"));
		searchAudienceResponse.setErrorCode(_ctx.stringValue("SearchAudienceResponse.ErrorCode"));
		searchAudienceResponse.setSuccess(_ctx.booleanValue("SearchAudienceResponse.Success"));

		Data data = new Data();
		data.setDataModelName(_ctx.stringValue("SearchAudienceResponse.Data.DataModelName"));
		data.setGmtModified(_ctx.longValue("SearchAudienceResponse.Data.GmtModified"));
		data.setDbName(_ctx.stringValue("SearchAudienceResponse.Data.DbName"));
		data.setNumberOfAudiences(_ctx.longValue("SearchAudienceResponse.Data.NumberOfAudiences"));
		data.setErrorMessage(_ctx.stringValue("SearchAudienceResponse.Data.ErrorMessage"));
		data.setDbType(_ctx.stringValue("SearchAudienceResponse.Data.DbType"));
		data.setPermission(_ctx.stringValue("SearchAudienceResponse.Data.Permission"));
		data.setType(_ctx.integerValue("SearchAudienceResponse.Data.Type"));
		data.setGmtCreate(_ctx.longValue("SearchAudienceResponse.Data.GmtCreate"));
		data.setVersion(_ctx.stringValue("SearchAudienceResponse.Data.Version"));
		data.setParentId(_ctx.stringValue("SearchAudienceResponse.Data.ParentId"));
		data.setModifyUser(_ctx.stringValue("SearchAudienceResponse.Data.ModifyUser"));
		data.setModifyUserName(_ctx.stringValue("SearchAudienceResponse.Data.ModifyUserName"));
		data.setLatestDataModifyStatus(_ctx.integerValue("SearchAudienceResponse.Data.LatestDataModifyStatus"));
		data.set_Public(_ctx.booleanValue("SearchAudienceResponse.Data.Public"));
		data.setSubtype(_ctx.integerValue("SearchAudienceResponse.Data.Subtype"));
		data.setName(_ctx.stringValue("SearchAudienceResponse.Data.Name"));
		data.setAutoUpdateData(_ctx.booleanValue("SearchAudienceResponse.Data.AutoUpdateData"));
		data.setCreateUser(_ctx.stringValue("SearchAudienceResponse.Data.CreateUser"));
		data.setId(_ctx.stringValue("SearchAudienceResponse.Data.Id"));
		data.setLatestDataModifyTime(_ctx.longValue("SearchAudienceResponse.Data.LatestDataModifyTime"));
		data.setDesc(_ctx.stringValue("SearchAudienceResponse.Data.Desc"));

		List<ExtendMappingTypesItem> extendMappingTypes = new ArrayList<ExtendMappingTypesItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchAudienceResponse.Data.ExtendMappingTypes.Length"); i++) {
			ExtendMappingTypesItem extendMappingTypesItem = new ExtendMappingTypesItem();
			extendMappingTypesItem.setPathId(_ctx.stringValue("SearchAudienceResponse.Data.ExtendMappingTypes["+ i +"].PathId"));
			extendMappingTypesItem.setMappingType(_ctx.stringValue("SearchAudienceResponse.Data.ExtendMappingTypes["+ i +"].MappingType"));
			extendMappingTypesItem.setColumnName(_ctx.stringValue("SearchAudienceResponse.Data.ExtendMappingTypes["+ i +"].ColumnName"));
			extendMappingTypesItem.setDefaultIdType(_ctx.stringValue("SearchAudienceResponse.Data.ExtendMappingTypes["+ i +"].DefaultIdType"));

			extendMappingTypes.add(extendMappingTypesItem);
		}
		data.setExtendMappingTypes(extendMappingTypes);
		searchAudienceResponse.setData(data);
	 
	 	return searchAudienceResponse;
	}
}