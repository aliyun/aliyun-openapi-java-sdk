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

import com.aliyuncs.dataphin_public.model.v20230630.GetAssetAttributesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetAssetAttributesResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetAssetAttributesResponse.Data.AssetAttribute;
import com.aliyuncs.dataphin_public.model.v20230630.GetAssetAttributesResponse.Data.AssetAttribute.Attribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAssetAttributesResponseUnmarshaller {

	public static GetAssetAttributesResponse unmarshall(GetAssetAttributesResponse getAssetAttributesResponse, UnmarshallerContext _ctx) {
		
		getAssetAttributesResponse.setRequestId(_ctx.stringValue("GetAssetAttributesResponse.RequestId"));
		getAssetAttributesResponse.setMessage(_ctx.stringValue("GetAssetAttributesResponse.Message"));
		getAssetAttributesResponse.setHttpStatusCode(_ctx.integerValue("GetAssetAttributesResponse.HttpStatusCode"));
		getAssetAttributesResponse.setCode(_ctx.stringValue("GetAssetAttributesResponse.Code"));
		getAssetAttributesResponse.setSuccess(_ctx.booleanValue("GetAssetAttributesResponse.Success"));

		Data data = new Data();

		List<AssetAttribute> assetAttributeList = new ArrayList<AssetAttribute>();
		for (int i = 0; i < _ctx.lengthValue("GetAssetAttributesResponse.Data.AssetAttributeList.Length"); i++) {
			AssetAttribute assetAttribute = new AssetAttribute();
			assetAttribute.setAssetType(_ctx.stringValue("GetAssetAttributesResponse.Data.AssetAttributeList["+ i +"].AssetType"));
			assetAttribute.setLastModifiedTime(_ctx.stringValue("GetAssetAttributesResponse.Data.AssetAttributeList["+ i +"].LastModifiedTime"));
			assetAttribute.setGuid(_ctx.stringValue("GetAssetAttributesResponse.Data.AssetAttributeList["+ i +"].Guid"));
			assetAttribute.setAssetName(_ctx.stringValue("GetAssetAttributesResponse.Data.AssetAttributeList["+ i +"].AssetName"));

			List<Attribute> attributeList = new ArrayList<Attribute>();
			for (int j = 0; j < _ctx.lengthValue("GetAssetAttributesResponse.Data.AssetAttributeList["+ i +"].AttributeList.Length"); j++) {
				Attribute attribute = new Attribute();
				attribute.setAttributeCode(_ctx.stringValue("GetAssetAttributesResponse.Data.AssetAttributeList["+ i +"].AttributeList["+ j +"].AttributeCode"));
				attribute.setRequired(_ctx.booleanValue("GetAssetAttributesResponse.Data.AssetAttributeList["+ i +"].AttributeList["+ j +"].Required"));
				attribute.setAttributeName(_ctx.stringValue("GetAssetAttributesResponse.Data.AssetAttributeList["+ i +"].AttributeList["+ j +"].AttributeName"));

				List<String> values = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetAssetAttributesResponse.Data.AssetAttributeList["+ i +"].AttributeList["+ j +"].Values.Length"); k++) {
					values.add(_ctx.stringValue("GetAssetAttributesResponse.Data.AssetAttributeList["+ i +"].AttributeList["+ j +"].Values["+ k +"]"));
				}
				attribute.setValues(values);

				attributeList.add(attribute);
			}
			assetAttribute.setAttributeList(attributeList);

			assetAttributeList.add(assetAttribute);
		}
		data.setAssetAttributeList(assetAttributeList);
		getAssetAttributesResponse.setData(data);
	 
	 	return getAssetAttributesResponse;
	}
}