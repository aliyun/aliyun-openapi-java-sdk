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

package com.aliyuncs.eds_user.transform.v20210308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_user.model.v20210308.ListPropertyValueResponse;
import com.aliyuncs.eds_user.model.v20210308.ListPropertyValueResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPropertyValueResponseUnmarshaller {

	public static ListPropertyValueResponse unmarshall(ListPropertyValueResponse listPropertyValueResponse, UnmarshallerContext _ctx) {
		
		listPropertyValueResponse.setRequestId(_ctx.stringValue("ListPropertyValueResponse.RequestId"));

		List<Data> propertyValueInfos = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListPropertyValueResponse.PropertyValueInfos.Length"); i++) {
			Data data = new Data();
			data.setPropertyValueId(_ctx.longValue("ListPropertyValueResponse.PropertyValueInfos["+ i +"].PropertyValueId"));
			data.setPropertyValue(_ctx.stringValue("ListPropertyValueResponse.PropertyValueInfos["+ i +"].PropertyValue"));

			propertyValueInfos.add(data);
		}
		listPropertyValueResponse.setPropertyValueInfos(propertyValueInfos);
	 
	 	return listPropertyValueResponse;
	}
}