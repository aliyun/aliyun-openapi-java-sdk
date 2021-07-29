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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.GetAllDepartmentResponse;
import com.aliyuncs.aiccs.model.v20191015.GetAllDepartmentResponse.DepartmentInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAllDepartmentResponseUnmarshaller {

	public static GetAllDepartmentResponse unmarshall(GetAllDepartmentResponse getAllDepartmentResponse, UnmarshallerContext _ctx) {
		
		getAllDepartmentResponse.setRequestId(_ctx.stringValue("GetAllDepartmentResponse.RequestId"));
		getAllDepartmentResponse.setMessage(_ctx.stringValue("GetAllDepartmentResponse.Message"));
		getAllDepartmentResponse.setHttpStatusCode(_ctx.integerValue("GetAllDepartmentResponse.HttpStatusCode"));
		getAllDepartmentResponse.setCode(_ctx.stringValue("GetAllDepartmentResponse.Code"));
		getAllDepartmentResponse.setSuccess(_ctx.booleanValue("GetAllDepartmentResponse.Success"));

		List<DepartmentInfo> data = new ArrayList<DepartmentInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetAllDepartmentResponse.Data.Length"); i++) {
			DepartmentInfo departmentInfo = new DepartmentInfo();
			departmentInfo.setDepartmentId(_ctx.longValue("GetAllDepartmentResponse.Data["+ i +"].DepartmentId"));
			departmentInfo.setDepartmentName(_ctx.stringValue("GetAllDepartmentResponse.Data["+ i +"].DepartmentName"));

			data.add(departmentInfo);
		}
		getAllDepartmentResponse.setData(data);
	 
	 	return getAllDepartmentResponse;
	}
}