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

package com.aliyuncs.agency.transform.v20200324;

import com.aliyuncs.agency.model.v20200324.FindUserInfoByEmpIdResponse;
import com.aliyuncs.agency.model.v20200324.FindUserInfoByEmpIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindUserInfoByEmpIdResponseUnmarshaller {

	public static FindUserInfoByEmpIdResponse unmarshall(FindUserInfoByEmpIdResponse findUserInfoByEmpIdResponse, UnmarshallerContext _ctx) {
		
		findUserInfoByEmpIdResponse.setRequestId(_ctx.stringValue("FindUserInfoByEmpIdResponse.RequestId"));
		findUserInfoByEmpIdResponse.setCode(_ctx.stringValue("FindUserInfoByEmpIdResponse.Code"));
		findUserInfoByEmpIdResponse.setSuccess(_ctx.booleanValue("FindUserInfoByEmpIdResponse.Success"));

		Data data = new Data();
		data.setEmpId(_ctx.stringValue("FindUserInfoByEmpIdResponse.Data.EmpId"));
		data.setName(_ctx.stringValue("FindUserInfoByEmpIdResponse.Data.Name"));
		data.setEmail(_ctx.stringValue("FindUserInfoByEmpIdResponse.Data.Email"));
		data.setBucId(_ctx.stringValue("FindUserInfoByEmpIdResponse.Data.BucId"));
		data.setAvailable(_ctx.stringValue("FindUserInfoByEmpIdResponse.Data.Available"));
		data.setNickName(_ctx.stringValue("FindUserInfoByEmpIdResponse.Data.NickName"));
		findUserInfoByEmpIdResponse.setData(data);
	 
	 	return findUserInfoByEmpIdResponse;
	}
}