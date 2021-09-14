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

package com.aliyuncs.emas_dmp.transform.v20210402;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emas_dmp.model.v20210402.ListTargetAudienceTypeResponse;
import com.aliyuncs.emas_dmp.model.v20210402.ListTargetAudienceTypeResponse.Data;
import com.aliyuncs.emas_dmp.model.v20210402.ListTargetAudienceTypeResponse.Data.Type;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTargetAudienceTypeResponseUnmarshaller {

	public static ListTargetAudienceTypeResponse unmarshall(ListTargetAudienceTypeResponse listTargetAudienceTypeResponse, UnmarshallerContext _ctx) {
		
		listTargetAudienceTypeResponse.setRequestId(_ctx.stringValue("ListTargetAudienceTypeResponse.RequestId"));

		Data data = new Data();

		List<Type> typesList = new ArrayList<Type>();
		for (int i = 0; i < _ctx.lengthValue("ListTargetAudienceTypeResponse.Data.TypesList.Length"); i++) {
			Type type = new Type();
			type.setName(_ctx.stringValue("ListTargetAudienceTypeResponse.Data.TypesList["+ i +"].Name"));

			List<String> subTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTargetAudienceTypeResponse.Data.TypesList["+ i +"].SubTypes.Length"); j++) {
				subTypes.add(_ctx.stringValue("ListTargetAudienceTypeResponse.Data.TypesList["+ i +"].SubTypes["+ j +"]"));
			}
			type.setSubTypes(subTypes);

			typesList.add(type);
		}
		data.setTypesList(typesList);
		listTargetAudienceTypeResponse.setData(data);
	 
	 	return listTargetAudienceTypeResponse;
	}
}