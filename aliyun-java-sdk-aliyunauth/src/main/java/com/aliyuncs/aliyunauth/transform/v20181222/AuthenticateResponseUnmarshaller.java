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

package com.aliyuncs.aliyunauth.transform.v20181222;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aliyunauth.model.v20181222.AuthenticateResponse;
import com.aliyuncs.aliyunauth.model.v20181222.AuthenticateResponse.Data;
import com.aliyuncs.aliyunauth.model.v20181222.AuthenticateResponse.Data.QueryAuthRSDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class AuthenticateResponseUnmarshaller {

	public static AuthenticateResponse unmarshall(AuthenticateResponse authenticateResponse, UnmarshallerContext _ctx) {
		
		authenticateResponse.setRequestId(_ctx.stringValue("AuthenticateResponse.RequestId"));
		authenticateResponse.setCode(_ctx.integerValue("AuthenticateResponse.Code"));
		authenticateResponse.setSuccess(_ctx.booleanValue("AuthenticateResponse.Success"));
		authenticateResponse.setMessage(_ctx.stringValue("AuthenticateResponse.Message"));

		Data data = new Data();
		data.setInstanceId(_ctx.stringValue("AuthenticateResponse.Data.InstanceId"));
		data.setProductCode(_ctx.stringValue("AuthenticateResponse.Data.ProductCode"));
		data.setAuthorized(_ctx.booleanValue("AuthenticateResponse.Data.Authorized"));
		data.setRecordVid(_ctx.stringValue("AuthenticateResponse.Data.RecordVid"));
		data.setOperateCode(_ctx.stringValue("AuthenticateResponse.Data.OperateCode"));

		List<QueryAuthRSDTO> userInputList = new ArrayList<QueryAuthRSDTO>();
		for (int i = 0; i < _ctx.lengthValue("AuthenticateResponse.Data.UserInputList.Length"); i++) {
			QueryAuthRSDTO queryAuthRSDTO = new QueryAuthRSDTO();
			queryAuthRSDTO.setFieldName(_ctx.stringValue("AuthenticateResponse.Data.UserInputList["+ i +"].FieldName"));
			queryAuthRSDTO.setFieldVid(_ctx.stringValue("AuthenticateResponse.Data.UserInputList["+ i +"].FieldVid"));
			queryAuthRSDTO.setExpandContent(_ctx.stringValue("AuthenticateResponse.Data.UserInputList["+ i +"].ExpandContent"));
			queryAuthRSDTO.setContent(_ctx.stringValue("AuthenticateResponse.Data.UserInputList["+ i +"].Content"));

			userInputList.add(queryAuthRSDTO);
		}
		data.setUserInputList(userInputList);
		authenticateResponse.setData(data);
	 
	 	return authenticateResponse;
	}
}