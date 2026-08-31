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

import com.aliyuncs.dataphin_public.model.v20230630.GetAssetTypeAttributeCodesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetAssetTypeAttributeCodesResponse.DataItem;
import com.aliyuncs.dataphin_public.model.v20230630.GetAssetTypeAttributeCodesResponse.DataItem.EnumValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAssetTypeAttributeCodesResponseUnmarshaller {

	public static GetAssetTypeAttributeCodesResponse unmarshall(GetAssetTypeAttributeCodesResponse getAssetTypeAttributeCodesResponse, UnmarshallerContext _ctx) {
		
		getAssetTypeAttributeCodesResponse.setRequestId(_ctx.stringValue("GetAssetTypeAttributeCodesResponse.RequestId"));
		getAssetTypeAttributeCodesResponse.setMessage(_ctx.stringValue("GetAssetTypeAttributeCodesResponse.Message"));
		getAssetTypeAttributeCodesResponse.setHttpStatusCode(_ctx.integerValue("GetAssetTypeAttributeCodesResponse.HttpStatusCode"));
		getAssetTypeAttributeCodesResponse.setCode(_ctx.stringValue("GetAssetTypeAttributeCodesResponse.Code"));
		getAssetTypeAttributeCodesResponse.setSuccess(_ctx.booleanValue("GetAssetTypeAttributeCodesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAssetTypeAttributeCodesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setInputMode(_ctx.stringValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].InputMode"));
			dataItem.setEnumSourceType(_ctx.stringValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].EnumSourceType"));
			dataItem.setAttributeSource(_ctx.stringValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].AttributeSource"));
			dataItem.setDescription(_ctx.stringValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].Description"));
			dataItem.setValueType(_ctx.stringValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].ValueType"));
			dataItem.setMaxLength(_ctx.integerValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].MaxLength"));
			dataItem.setAttributeCode(_ctx.stringValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].AttributeCode"));
			dataItem.setSystemReferenceType(_ctx.stringValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].SystemReferenceType"));
			dataItem.setRequired(_ctx.booleanValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].Required"));
			dataItem.setLinkTarget(_ctx.stringValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].LinkTarget"));
			dataItem.setAttributeType(_ctx.stringValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].AttributeType"));
			dataItem.setAttributeName(_ctx.stringValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].AttributeName"));

			List<String> editableIn = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].EditableIn.Length"); j++) {
				editableIn.add(_ctx.stringValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].EditableIn["+ j +"]"));
			}
			dataItem.setEditableIn(editableIn);

			List<String> visibleIn = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].VisibleIn.Length"); j++) {
				visibleIn.add(_ctx.stringValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].VisibleIn["+ j +"]"));
			}
			dataItem.setVisibleIn(visibleIn);

			List<EnumValue> enumValues = new ArrayList<EnumValue>();
			for (int j = 0; j < _ctx.lengthValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].EnumValues.Length"); j++) {
				EnumValue enumValue = new EnumValue();
				enumValue.setValue(_ctx.stringValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].EnumValues["+ j +"].Value"));
				enumValue.setDisplayName(_ctx.stringValue("GetAssetTypeAttributeCodesResponse.Data["+ i +"].EnumValues["+ j +"].DisplayName"));

				enumValues.add(enumValue);
			}
			dataItem.setEnumValues(enumValues);

			data.add(dataItem);
		}
		getAssetTypeAttributeCodesResponse.setData(data);
	 
	 	return getAssetTypeAttributeCodesResponse;
	}
}