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

package com.aliyuncs.resellertrade.transform.v20191227;

import com.aliyuncs.resellertrade.model.v20191227.LabelPartnerUserResponse;
import com.aliyuncs.resellertrade.model.v20191227.LabelPartnerUserResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class LabelPartnerUserResponseUnmarshaller {

	public static LabelPartnerUserResponse unmarshall(LabelPartnerUserResponse labelPartnerUserResponse, UnmarshallerContext _ctx) {
		
		labelPartnerUserResponse.setRequestId(_ctx.stringValue("LabelPartnerUserResponse.RequestId"));
		labelPartnerUserResponse.setSuccess(_ctx.booleanValue("LabelPartnerUserResponse.Success"));
		labelPartnerUserResponse.setCode(_ctx.stringValue("LabelPartnerUserResponse.Code"));
		labelPartnerUserResponse.setMessage(_ctx.stringValue("LabelPartnerUserResponse.Message"));

		Data data = new Data();
		data.setUserPK(_ctx.longValue("LabelPartnerUserResponse.Data.UserPK"));
		data.setUserTag(_ctx.stringValue("LabelPartnerUserResponse.Data.UserTag"));
		labelPartnerUserResponse.setData(data);
	 
	 	return labelPartnerUserResponse;
	}
}