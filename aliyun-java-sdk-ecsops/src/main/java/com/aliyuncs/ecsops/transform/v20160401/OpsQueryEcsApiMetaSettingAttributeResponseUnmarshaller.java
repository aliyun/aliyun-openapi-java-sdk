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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryEcsApiMetaSettingAttributeResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryEcsApiMetaSettingAttributeResponse.AttributesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryEcsApiMetaSettingAttributeResponseUnmarshaller {

	public static OpsQueryEcsApiMetaSettingAttributeResponse unmarshall(OpsQueryEcsApiMetaSettingAttributeResponse opsQueryEcsApiMetaSettingAttributeResponse, UnmarshallerContext _ctx) {
		
		opsQueryEcsApiMetaSettingAttributeResponse.setRequestId(_ctx.stringValue("OpsQueryEcsApiMetaSettingAttributeResponse.RequestId"));
		opsQueryEcsApiMetaSettingAttributeResponse.setTotalCount(_ctx.integerValue("OpsQueryEcsApiMetaSettingAttributeResponse.TotalCount"));

		List<AttributesItem> attributes = new ArrayList<AttributesItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryEcsApiMetaSettingAttributeResponse.Attributes.Length"); i++) {
			AttributesItem attributesItem = new AttributesItem();
			attributesItem.setAttributeKey(_ctx.stringValue("OpsQueryEcsApiMetaSettingAttributeResponse.Attributes["+ i +"].AttributeKey"));
			attributesItem.setDefaultValue(_ctx.stringValue("OpsQueryEcsApiMetaSettingAttributeResponse.Attributes["+ i +"].DefaultValue"));
			attributesItem.setComment(_ctx.stringValue("OpsQueryEcsApiMetaSettingAttributeResponse.Attributes["+ i +"].Comment"));
			attributesItem.setType(_ctx.stringValue("OpsQueryEcsApiMetaSettingAttributeResponse.Attributes["+ i +"].Type"));

			attributes.add(attributesItem);
		}
		opsQueryEcsApiMetaSettingAttributeResponse.setAttributes(attributes);
	 
	 	return opsQueryEcsApiMetaSettingAttributeResponse;
	}
}