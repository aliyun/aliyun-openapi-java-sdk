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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListProjectWorkitemTypesResponse;
import com.aliyuncs.devops.model.v20210625.ListProjectWorkitemTypesResponse.WorkitemType;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectWorkitemTypesResponseUnmarshaller {

	public static ListProjectWorkitemTypesResponse unmarshall(ListProjectWorkitemTypesResponse listProjectWorkitemTypesResponse, UnmarshallerContext _ctx) {
		
		listProjectWorkitemTypesResponse.setRequestId(_ctx.stringValue("ListProjectWorkitemTypesResponse.requestId"));
		listProjectWorkitemTypesResponse.setErrorCode(_ctx.stringValue("ListProjectWorkitemTypesResponse.errorCode"));
		listProjectWorkitemTypesResponse.setErrorMessage(_ctx.stringValue("ListProjectWorkitemTypesResponse.errorMessage"));
		listProjectWorkitemTypesResponse.setSuccess(_ctx.booleanValue("ListProjectWorkitemTypesResponse.success"));

		List<WorkitemType> workitemTypes = new ArrayList<WorkitemType>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectWorkitemTypesResponse.workitemTypes.Length"); i++) {
			WorkitemType workitemType = new WorkitemType();
			workitemType.setIdentifier(_ctx.stringValue("ListProjectWorkitemTypesResponse.workitemTypes["+ i +"].identifier"));
			workitemType.setName(_ctx.stringValue("ListProjectWorkitemTypesResponse.workitemTypes["+ i +"].name"));
			workitemType.setNameEn(_ctx.stringValue("ListProjectWorkitemTypesResponse.workitemTypes["+ i +"].nameEn"));
			workitemType.setCategoryIdentifier(_ctx.stringValue("ListProjectWorkitemTypesResponse.workitemTypes["+ i +"].categoryIdentifier"));
			workitemType.setSystemDefault(_ctx.booleanValue("ListProjectWorkitemTypesResponse.workitemTypes["+ i +"].systemDefault"));
			workitemType.setGmtCreate(_ctx.longValue("ListProjectWorkitemTypesResponse.workitemTypes["+ i +"].gmtCreate"));
			workitemType.setCreator(_ctx.stringValue("ListProjectWorkitemTypesResponse.workitemTypes["+ i +"].creator"));
			workitemType.setDescription(_ctx.stringValue("ListProjectWorkitemTypesResponse.workitemTypes["+ i +"].description"));
			workitemType.setEnable(_ctx.booleanValue("ListProjectWorkitemTypesResponse.workitemTypes["+ i +"].enable"));
			workitemType.setDefaultType(_ctx.booleanValue("ListProjectWorkitemTypesResponse.workitemTypes["+ i +"].defaultType"));
			workitemType.setGmtAdd(_ctx.longValue("ListProjectWorkitemTypesResponse.workitemTypes["+ i +"].gmtAdd"));
			workitemType.setAddUser(_ctx.stringValue("ListProjectWorkitemTypesResponse.workitemTypes["+ i +"].addUser"));

			workitemTypes.add(workitemType);
		}
		listProjectWorkitemTypesResponse.setWorkitemTypes(workitemTypes);
	 
	 	return listProjectWorkitemTypesResponse;
	}
}