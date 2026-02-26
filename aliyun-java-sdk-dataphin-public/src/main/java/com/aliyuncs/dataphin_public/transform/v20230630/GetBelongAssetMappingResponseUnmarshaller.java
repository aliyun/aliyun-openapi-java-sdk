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

import com.aliyuncs.dataphin_public.model.v20230630.GetBelongAssetMappingResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetBelongAssetMappingResponse.MappingRelation;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBelongAssetMappingResponseUnmarshaller {

	public static GetBelongAssetMappingResponse unmarshall(GetBelongAssetMappingResponse getBelongAssetMappingResponse, UnmarshallerContext _ctx) {
		
		getBelongAssetMappingResponse.setRequestId(_ctx.stringValue("GetBelongAssetMappingResponse.RequestId"));
		getBelongAssetMappingResponse.setSuccess(_ctx.booleanValue("GetBelongAssetMappingResponse.Success"));
		getBelongAssetMappingResponse.setHttpStatusCode(_ctx.integerValue("GetBelongAssetMappingResponse.HttpStatusCode"));
		getBelongAssetMappingResponse.setCode(_ctx.stringValue("GetBelongAssetMappingResponse.Code"));
		getBelongAssetMappingResponse.setMessage(_ctx.stringValue("GetBelongAssetMappingResponse.Message"));

		List<MappingRelation> mappingRelationList = new ArrayList<MappingRelation>();
		for (int i = 0; i < _ctx.lengthValue("GetBelongAssetMappingResponse.MappingRelationList.Length"); i++) {
			MappingRelation mappingRelation = new MappingRelation();
			mappingRelation.setModifyTime(_ctx.stringValue("GetBelongAssetMappingResponse.MappingRelationList["+ i +"].ModifyTime"));
			mappingRelation.setGuid(_ctx.stringValue("GetBelongAssetMappingResponse.MappingRelationList["+ i +"].Guid"));
			mappingRelation.setName(_ctx.stringValue("GetBelongAssetMappingResponse.MappingRelationList["+ i +"].Name"));
			mappingRelation.setAssetType(_ctx.stringValue("GetBelongAssetMappingResponse.MappingRelationList["+ i +"].AssetType"));
			mappingRelation.setStandardId(_ctx.longValue("GetBelongAssetMappingResponse.MappingRelationList["+ i +"].StandardId"));
			mappingRelation.setStandardName(_ctx.stringValue("GetBelongAssetMappingResponse.MappingRelationList["+ i +"].StandardName"));
			mappingRelation.setStandardCode(_ctx.stringValue("GetBelongAssetMappingResponse.MappingRelationList["+ i +"].StandardCode"));
			mappingRelation.setStandardSetId(_ctx.longValue("GetBelongAssetMappingResponse.MappingRelationList["+ i +"].StandardSetId"));
			mappingRelation.setStandardSetName(_ctx.stringValue("GetBelongAssetMappingResponse.MappingRelationList["+ i +"].StandardSetName"));
			mappingRelation.setStandardSetDirectory(_ctx.stringValue("GetBelongAssetMappingResponse.MappingRelationList["+ i +"].StandardSetDirectory"));
			mappingRelation.setStandardStage(_ctx.stringValue("GetBelongAssetMappingResponse.MappingRelationList["+ i +"].StandardStage"));

			mappingRelationList.add(mappingRelation);
		}
		getBelongAssetMappingResponse.setMappingRelationList(mappingRelationList);
	 
	 	return getBelongAssetMappingResponse;
	}
}