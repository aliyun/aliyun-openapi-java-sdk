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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryCurrentOnCallResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryCurrentOnCallResponse.OnCallStaffInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryCurrentOnCallResponseUnmarshaller {

	public static OpsQueryCurrentOnCallResponse unmarshall(OpsQueryCurrentOnCallResponse opsQueryCurrentOnCallResponse, UnmarshallerContext _ctx) {
		
		opsQueryCurrentOnCallResponse.setRequestId(_ctx.stringValue("OpsQueryCurrentOnCallResponse.RequestId"));

		List<OnCallStaffInfo> onCallStaffInfos = new ArrayList<OnCallStaffInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryCurrentOnCallResponse.OnCallStaffInfos.Length"); i++) {
			OnCallStaffInfo onCallStaffInfo = new OnCallStaffInfo();
			onCallStaffInfo.setEmpId(_ctx.stringValue("OpsQueryCurrentOnCallResponse.OnCallStaffInfos["+ i +"].EmpId"));
			onCallStaffInfo.setDepartmentCnName(_ctx.stringValue("OpsQueryCurrentOnCallResponse.OnCallStaffInfos["+ i +"].DepartmentCnName"));
			onCallStaffInfo.setPhone(_ctx.stringValue("OpsQueryCurrentOnCallResponse.OnCallStaffInfos["+ i +"].Phone"));
			onCallStaffInfo.setDepartment(_ctx.stringValue("OpsQueryCurrentOnCallResponse.OnCallStaffInfos["+ i +"].Department"));
			onCallStaffInfo.setNickName(_ctx.stringValue("OpsQueryCurrentOnCallResponse.OnCallStaffInfos["+ i +"].NickName"));
			onCallStaffInfo.setEmail(_ctx.stringValue("OpsQueryCurrentOnCallResponse.OnCallStaffInfos["+ i +"].Email"));

			onCallStaffInfos.add(onCallStaffInfo);
		}
		opsQueryCurrentOnCallResponse.setOnCallStaffInfos(onCallStaffInfos);
	 
	 	return opsQueryCurrentOnCallResponse;
	}
}