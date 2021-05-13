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

package com.aliyuncs.quotas.transform.v20200510;

import com.aliyuncs.quotas.model.v20200510.CreateQuotaAlarmResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateQuotaAlarmResponseUnmarshaller {

	public static CreateQuotaAlarmResponse unmarshall(CreateQuotaAlarmResponse createQuotaAlarmResponse, UnmarshallerContext _ctx) {
		
		createQuotaAlarmResponse.setRequestId(_ctx.stringValue("CreateQuotaAlarmResponse.RequestId"));
		createQuotaAlarmResponse.setAlarmId(_ctx.stringValue("CreateQuotaAlarmResponse.AlarmId"));
	 
	 	return createQuotaAlarmResponse;
	}
}