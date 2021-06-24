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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryEcsApiMetaSettingAttributeKeyValueResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryEcsApiMetaSettingAttributeKeyValueResponse.DataItem;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryEcsApiMetaSettingAttributeKeyValueResponse.DataItem.AttributeKeyValueInfoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryEcsApiMetaSettingAttributeKeyValueResponseUnmarshaller {

	public static OpsQueryEcsApiMetaSettingAttributeKeyValueResponse unmarshall(OpsQueryEcsApiMetaSettingAttributeKeyValueResponse opsQueryEcsApiMetaSettingAttributeKeyValueResponse, UnmarshallerContext _ctx) {
		
		opsQueryEcsApiMetaSettingAttributeKeyValueResponse.setRequestId(_ctx.stringValue("OpsQueryEcsApiMetaSettingAttributeKeyValueResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryEcsApiMetaSettingAttributeKeyValueResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAttributeKey(_ctx.stringValue("OpsQueryEcsApiMetaSettingAttributeKeyValueResponse.Data["+ i +"].AttributeKey"));

			List<AttributeKeyValueInfoListItem> attributeKeyValueInfoList = new ArrayList<AttributeKeyValueInfoListItem>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryEcsApiMetaSettingAttributeKeyValueResponse.Data["+ i +"].AttributeKeyValueInfoList.Length"); j++) {
				AttributeKeyValueInfoListItem attributeKeyValueInfoListItem = new AttributeKeyValueInfoListItem();
				attributeKeyValueInfoListItem.setAttributeName(_ctx.stringValue("OpsQueryEcsApiMetaSettingAttributeKeyValueResponse.Data["+ i +"].AttributeKeyValueInfoList["+ j +"].AttributeName"));
				attributeKeyValueInfoListItem.setComment(_ctx.stringValue("OpsQueryEcsApiMetaSettingAttributeKeyValueResponse.Data["+ i +"].AttributeKeyValueInfoList["+ j +"].Comment"));
				attributeKeyValueInfoListItem.setAttributeValue(_ctx.stringValue("OpsQueryEcsApiMetaSettingAttributeKeyValueResponse.Data["+ i +"].AttributeKeyValueInfoList["+ j +"].AttributeValue"));

				attributeKeyValueInfoList.add(attributeKeyValueInfoListItem);
			}
			dataItem.setAttributeKeyValueInfoList(attributeKeyValueInfoList);

			data.add(dataItem);
		}
		opsQueryEcsApiMetaSettingAttributeKeyValueResponse.setData(data);
	 
	 	return opsQueryEcsApiMetaSettingAttributeKeyValueResponse;
	}
}