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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListTaskFlowCooperatorsResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListTaskFlowCooperatorsResponse.Cooperator;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskFlowCooperatorsResponseUnmarshaller {

	public static ListTaskFlowCooperatorsResponse unmarshall(ListTaskFlowCooperatorsResponse listTaskFlowCooperatorsResponse, UnmarshallerContext _ctx) {
		
		listTaskFlowCooperatorsResponse.setRequestId(_ctx.stringValue("ListTaskFlowCooperatorsResponse.RequestId"));
		listTaskFlowCooperatorsResponse.setErrorCode(_ctx.stringValue("ListTaskFlowCooperatorsResponse.ErrorCode"));
		listTaskFlowCooperatorsResponse.setErrorMessage(_ctx.stringValue("ListTaskFlowCooperatorsResponse.ErrorMessage"));
		listTaskFlowCooperatorsResponse.setSuccess(_ctx.booleanValue("ListTaskFlowCooperatorsResponse.Success"));

		List<Cooperator> cooperatorList = new ArrayList<Cooperator>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskFlowCooperatorsResponse.CooperatorList.Length"); i++) {
			Cooperator cooperator = new Cooperator();
			cooperator.setNickName(_ctx.stringValue("ListTaskFlowCooperatorsResponse.CooperatorList["+ i +"].NickName"));
			cooperator.setEmail(_ctx.stringValue("ListTaskFlowCooperatorsResponse.CooperatorList["+ i +"].Email"));
			cooperator.setLoginName(_ctx.stringValue("ListTaskFlowCooperatorsResponse.CooperatorList["+ i +"].LoginName"));
			cooperator.setRealName(_ctx.stringValue("ListTaskFlowCooperatorsResponse.CooperatorList["+ i +"].RealName"));
			cooperator.setUserId(_ctx.stringValue("ListTaskFlowCooperatorsResponse.CooperatorList["+ i +"].UserId"));

			cooperatorList.add(cooperator);
		}
		listTaskFlowCooperatorsResponse.setCooperatorList(cooperatorList);
	 
	 	return listTaskFlowCooperatorsResponse;
	}
}