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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetLastManagerIdentifyResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetLastManagerIdentifyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLastManagerIdentifyResponseUnmarshaller {

	public static GetLastManagerIdentifyResponse unmarshall(GetLastManagerIdentifyResponse getLastManagerIdentifyResponse, UnmarshallerContext context) {
		
		getLastManagerIdentifyResponse.setRequestId(context.stringValue("GetLastManagerIdentifyResponse.RequestId"));
		getLastManagerIdentifyResponse.setSuccess(context.booleanValue("GetLastManagerIdentifyResponse.Success"));
		getLastManagerIdentifyResponse.setCode(context.stringValue("GetLastManagerIdentifyResponse.Code"));
		getLastManagerIdentifyResponse.setMessage(context.stringValue("GetLastManagerIdentifyResponse.Message"));
		getLastManagerIdentifyResponse.setHttpStatusCode(context.integerValue("GetLastManagerIdentifyResponse.HttpStatusCode"));

		Data data = new Data();
		data.setAliyunUid(context.longValue("GetLastManagerIdentifyResponse.Data.AliyunUid"));
		data.setManagerCertEffDate(context.stringValue("GetLastManagerIdentifyResponse.Data.ManagerCertEffDate"));
		data.setManagerCertExpDate(context.stringValue("GetLastManagerIdentifyResponse.Data.ManagerCertExpDate"));
		data.setManagerCertNumber(context.stringValue("GetLastManagerIdentifyResponse.Data.ManagerCertNumber"));
		data.setManagerCertPic(context.stringValue("GetLastManagerIdentifyResponse.Data.ManagerCertPic"));
		data.setManagerCertType(context.stringValue("GetLastManagerIdentifyResponse.Data.ManagerCertType"));
		data.setManagerMobilePhone(context.stringValue("GetLastManagerIdentifyResponse.Data.ManagerMobilePhone"));
		data.setManagerName(context.stringValue("GetLastManagerIdentifyResponse.Data.ManagerName"));
		getLastManagerIdentifyResponse.setData(data);
	 
	 	return getLastManagerIdentifyResponse;
	}
}