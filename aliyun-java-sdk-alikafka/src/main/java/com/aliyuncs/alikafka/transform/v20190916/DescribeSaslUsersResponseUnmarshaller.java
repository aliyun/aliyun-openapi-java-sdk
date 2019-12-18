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

package com.aliyuncs.alikafka.transform.v20190916;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alikafka.model.v20190916.DescribeSaslUsersResponse;
import com.aliyuncs.alikafka.model.v20190916.DescribeSaslUsersResponse.SaslUserVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSaslUsersResponseUnmarshaller {

	public static DescribeSaslUsersResponse unmarshall(DescribeSaslUsersResponse describeSaslUsersResponse, UnmarshallerContext _ctx) {
		
		describeSaslUsersResponse.setRequestId(_ctx.stringValue("DescribeSaslUsersResponse.RequestId"));
		describeSaslUsersResponse.setSuccess(_ctx.booleanValue("DescribeSaslUsersResponse.Success"));
		describeSaslUsersResponse.setCode(_ctx.integerValue("DescribeSaslUsersResponse.Code"));
		describeSaslUsersResponse.setMessage(_ctx.stringValue("DescribeSaslUsersResponse.Message"));

		List<SaslUserVO> saslUserList = new ArrayList<SaslUserVO>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSaslUsersResponse.SaslUserList.Length"); i++) {
			SaslUserVO saslUserVO = new SaslUserVO();
			saslUserVO.setUsername(_ctx.stringValue("DescribeSaslUsersResponse.SaslUserList["+ i +"].Username"));
			saslUserVO.setPassword(_ctx.stringValue("DescribeSaslUsersResponse.SaslUserList["+ i +"].Password"));

			saslUserList.add(saslUserVO);
		}
		describeSaslUsersResponse.setSaslUserList(saslUserList);
	 
	 	return describeSaslUsersResponse;
	}
}