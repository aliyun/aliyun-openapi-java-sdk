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

import com.aliyuncs.ecsops.model.v20160401.OpsCheckChangeGroupTypeResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsCheckChangeGroupTypeResponse.Data;
import com.aliyuncs.ecsops.model.v20160401.OpsCheckChangeGroupTypeResponse.Data.CheckErrorMsg;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsCheckChangeGroupTypeResponseUnmarshaller {

	public static OpsCheckChangeGroupTypeResponse unmarshall(OpsCheckChangeGroupTypeResponse opsCheckChangeGroupTypeResponse, UnmarshallerContext _ctx) {
		
		opsCheckChangeGroupTypeResponse.setRequestId(_ctx.stringValue("OpsCheckChangeGroupTypeResponse.RequestId"));
		opsCheckChangeGroupTypeResponse.setMessage(_ctx.stringValue("OpsCheckChangeGroupTypeResponse.Message"));
		opsCheckChangeGroupTypeResponse.setCode(_ctx.stringValue("OpsCheckChangeGroupTypeResponse.Code"));
		opsCheckChangeGroupTypeResponse.setSuccess(_ctx.stringValue("OpsCheckChangeGroupTypeResponse.Success"));

		Data data = new Data();
		data.setAllSuccess(_ctx.booleanValue("OpsCheckChangeGroupTypeResponse.Data.AllSuccess"));

		List<CheckErrorMsg> checkErrorMsgs = new ArrayList<CheckErrorMsg>();
		for (int i = 0; i < _ctx.lengthValue("OpsCheckChangeGroupTypeResponse.Data.CheckErrorMsgs.Length"); i++) {
			CheckErrorMsg checkErrorMsg = new CheckErrorMsg();
			checkErrorMsg.setErrorCode(_ctx.integerValue("OpsCheckChangeGroupTypeResponse.Data.CheckErrorMsgs["+ i +"].ErrorCode"));
			checkErrorMsg.setErrorMsg(_ctx.stringValue("OpsCheckChangeGroupTypeResponse.Data.CheckErrorMsgs["+ i +"].ErrorMsg"));
			checkErrorMsg.setResourceId(_ctx.stringValue("OpsCheckChangeGroupTypeResponse.Data.CheckErrorMsgs["+ i +"].ResourceId"));

			checkErrorMsgs.add(checkErrorMsg);
		}
		data.setCheckErrorMsgs(checkErrorMsgs);
		opsCheckChangeGroupTypeResponse.setData(data);
	 
	 	return opsCheckChangeGroupTypeResponse;
	}
}