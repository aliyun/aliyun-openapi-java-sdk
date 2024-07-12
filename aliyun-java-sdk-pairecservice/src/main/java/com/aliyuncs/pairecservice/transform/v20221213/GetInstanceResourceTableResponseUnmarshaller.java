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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.GetInstanceResourceTableResponse;
import com.aliyuncs.pairecservice.model.v20221213.GetInstanceResourceTableResponse.FieldsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceResourceTableResponseUnmarshaller {

	public static GetInstanceResourceTableResponse unmarshall(GetInstanceResourceTableResponse getInstanceResourceTableResponse, UnmarshallerContext _ctx) {
		
		getInstanceResourceTableResponse.setRequestId(_ctx.stringValue("GetInstanceResourceTableResponse.RequestId"));
		getInstanceResourceTableResponse.setTableName(_ctx.stringValue("GetInstanceResourceTableResponse.TableName"));

		List<FieldsItem> fields = new ArrayList<FieldsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceResourceTableResponse.Fields.Length"); i++) {
			FieldsItem fieldsItem = new FieldsItem();
			fieldsItem.setName(_ctx.stringValue("GetInstanceResourceTableResponse.Fields["+ i +"].Name"));
			fieldsItem.setType(_ctx.stringValue("GetInstanceResourceTableResponse.Fields["+ i +"].Type"));
			fieldsItem.setMeaning(_ctx.stringValue("GetInstanceResourceTableResponse.Fields["+ i +"].Meaning"));
			fieldsItem.setIsDimensionField(_ctx.booleanValue("GetInstanceResourceTableResponse.Fields["+ i +"].IsDimensionField"));
			fieldsItem.setIsPartitionField(_ctx.booleanValue("GetInstanceResourceTableResponse.Fields["+ i +"].IsPartitionField"));

			fields.add(fieldsItem);
		}
		getInstanceResourceTableResponse.setFields(fields);
	 
	 	return getInstanceResourceTableResponse;
	}
}