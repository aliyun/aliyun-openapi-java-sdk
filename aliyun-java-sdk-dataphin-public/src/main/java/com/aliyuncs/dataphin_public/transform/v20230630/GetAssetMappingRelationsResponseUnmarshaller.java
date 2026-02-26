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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetAssetMappingRelationsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetAssetMappingRelationsResponse.MappingRelation;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAssetMappingRelationsResponseUnmarshaller {

	public static GetAssetMappingRelationsResponse unmarshall(GetAssetMappingRelationsResponse getAssetMappingRelationsResponse, UnmarshallerContext _ctx) {
		
		getAssetMappingRelationsResponse.setRequestId(_ctx.stringValue("GetAssetMappingRelationsResponse.RequestId"));
		getAssetMappingRelationsResponse.setSuccess(_ctx.booleanValue("GetAssetMappingRelationsResponse.Success"));
		getAssetMappingRelationsResponse.setHttpStatusCode(_ctx.integerValue("GetAssetMappingRelationsResponse.HttpStatusCode"));
		getAssetMappingRelationsResponse.setCode(_ctx.stringValue("GetAssetMappingRelationsResponse.Code"));
		getAssetMappingRelationsResponse.setMessage(_ctx.stringValue("GetAssetMappingRelationsResponse.Message"));

		List<MappingRelation> mappingRelationList = new ArrayList<MappingRelation>();
		for (int i = 0; i < _ctx.lengthValue("GetAssetMappingRelationsResponse.MappingRelationList.Length"); i++) {
			MappingRelation mappingRelation = new MappingRelation();
			mappingRelation.setModifyTime(_ctx.stringValue("GetAssetMappingRelationsResponse.MappingRelationList["+ i +"].ModifyTime"));
			mappingRelation.setGuid(_ctx.stringValue("GetAssetMappingRelationsResponse.MappingRelationList["+ i +"].Guid"));
			mappingRelation.setName(_ctx.stringValue("GetAssetMappingRelationsResponse.MappingRelationList["+ i +"].Name"));
			mappingRelation.setAssetType(_ctx.stringValue("GetAssetMappingRelationsResponse.MappingRelationList["+ i +"].AssetType"));
			mappingRelation.setStandardId(_ctx.longValue("GetAssetMappingRelationsResponse.MappingRelationList["+ i +"].StandardId"));
			mappingRelation.setStandardName(_ctx.stringValue("GetAssetMappingRelationsResponse.MappingRelationList["+ i +"].StandardName"));
			mappingRelation.setStandardCode(_ctx.stringValue("GetAssetMappingRelationsResponse.MappingRelationList["+ i +"].StandardCode"));
			mappingRelation.setStandardSetId(_ctx.longValue("GetAssetMappingRelationsResponse.MappingRelationList["+ i +"].StandardSetId"));
			mappingRelation.setStandardSetName(_ctx.stringValue("GetAssetMappingRelationsResponse.MappingRelationList["+ i +"].StandardSetName"));
			mappingRelation.setStandardSetDirectory(_ctx.stringValue("GetAssetMappingRelationsResponse.MappingRelationList["+ i +"].StandardSetDirectory"));
			mappingRelation.setStandardStage(_ctx.stringValue("GetAssetMappingRelationsResponse.MappingRelationList["+ i +"].StandardStage"));

			mappingRelationList.add(mappingRelation);
		}
		getAssetMappingRelationsResponse.setMappingRelationList(mappingRelationList);
	 
	 	return getAssetMappingRelationsResponse;
	}
}