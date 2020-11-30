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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.GetAutonomousNotifyEventDetailResponse;
import com.aliyuncs.das.model.v20200116.GetAutonomousNotifyEventDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAutonomousNotifyEventDetailResponseUnmarshaller {

	public static GetAutonomousNotifyEventDetailResponse unmarshall(GetAutonomousNotifyEventDetailResponse getAutonomousNotifyEventDetailResponse, UnmarshallerContext _ctx) {
		
		getAutonomousNotifyEventDetailResponse.setRequestId(_ctx.stringValue("GetAutonomousNotifyEventDetailResponse.RequestId"));
		getAutonomousNotifyEventDetailResponse.setCode(_ctx.stringValue("GetAutonomousNotifyEventDetailResponse.Code"));
		getAutonomousNotifyEventDetailResponse.setMessage(_ctx.stringValue("GetAutonomousNotifyEventDetailResponse.Message"));
		getAutonomousNotifyEventDetailResponse.setSuccess(_ctx.stringValue("GetAutonomousNotifyEventDetailResponse.Success"));

		Data data = new Data();
		data.setSerialVersionUID(_ctx.longValue("GetAutonomousNotifyEventDetailResponse.Data.SerialVersionUID"));
		data.setDEFAULT_INITIAL_CAPACITY(_ctx.integerValue("GetAutonomousNotifyEventDetailResponse.Data.DEFAULT_INITIAL_CAPACITY"));
		data.setMap(_ctx.stringValue("GetAutonomousNotifyEventDetailResponse.Data.Map"));
		getAutonomousNotifyEventDetailResponse.setData(data);
	 
	 	return getAutonomousNotifyEventDetailResponse;
	}
}