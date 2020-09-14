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

package com.aliyuncs.xingzhen.transform.v20191121;

import com.aliyuncs.xingzhen.model.v20191121.TriggerAlertTaskJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TriggerAlertTaskJobResponseUnmarshaller {

	public static TriggerAlertTaskJobResponse unmarshall(TriggerAlertTaskJobResponse triggerAlertTaskJobResponse, UnmarshallerContext _ctx) {
		
		triggerAlertTaskJobResponse.setRequestId(_ctx.stringValue("TriggerAlertTaskJobResponse.RequestId"));
		triggerAlertTaskJobResponse.setSuccess(_ctx.booleanValue("TriggerAlertTaskJobResponse.Success"));
		triggerAlertTaskJobResponse.setCode(_ctx.stringValue("TriggerAlertTaskJobResponse.Code"));
		triggerAlertTaskJobResponse.setMessage(_ctx.stringValue("TriggerAlertTaskJobResponse.Message"));
		triggerAlertTaskJobResponse.setData(_ctx.booleanValue("TriggerAlertTaskJobResponse.Data"));
	 
	 	return triggerAlertTaskJobResponse;
	}
}