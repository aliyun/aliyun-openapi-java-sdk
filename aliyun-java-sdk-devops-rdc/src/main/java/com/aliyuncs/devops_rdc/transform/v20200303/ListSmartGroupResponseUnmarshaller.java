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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.ListSmartGroupResponse;
import com.aliyuncs.devops_rdc.model.v20200303.ListSmartGroupResponse.SmartGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSmartGroupResponseUnmarshaller {

	public static ListSmartGroupResponse unmarshall(ListSmartGroupResponse listSmartGroupResponse, UnmarshallerContext _ctx) {
		
		listSmartGroupResponse.setRequestId(_ctx.stringValue("ListSmartGroupResponse.RequestId"));
		listSmartGroupResponse.setErrorMsg(_ctx.stringValue("ListSmartGroupResponse.ErrorMsg"));
		listSmartGroupResponse.setSuccessful(_ctx.booleanValue("ListSmartGroupResponse.Successful"));
		listSmartGroupResponse.setErrorCode(_ctx.stringValue("ListSmartGroupResponse.ErrorCode"));

		List<SmartGroup> object = new ArrayList<SmartGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListSmartGroupResponse.Object.Length"); i++) {
			SmartGroup smartGroup = new SmartGroup();
			smartGroup.setType(_ctx.stringValue("ListSmartGroupResponse.Object["+ i +"].Type"));
			smartGroup.setId(_ctx.stringValue("ListSmartGroupResponse.Object["+ i +"].Id"));

			object.add(smartGroup);
		}
		listSmartGroupResponse.setObject(object);
	 
	 	return listSmartGroupResponse;
	}
}