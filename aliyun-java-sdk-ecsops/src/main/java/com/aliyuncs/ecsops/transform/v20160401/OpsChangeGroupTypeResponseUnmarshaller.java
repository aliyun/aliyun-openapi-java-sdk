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

import com.aliyuncs.ecsops.model.v20160401.OpsChangeGroupTypeResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsChangeGroupTypeResponse.Data;
import com.aliyuncs.ecsops.model.v20160401.OpsChangeGroupTypeResponse.Data.CheckErrorMsg;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsChangeGroupTypeResponseUnmarshaller {

	public static OpsChangeGroupTypeResponse unmarshall(OpsChangeGroupTypeResponse opsChangeGroupTypeResponse, UnmarshallerContext _ctx) {
		
		opsChangeGroupTypeResponse.setRequestId(_ctx.stringValue("OpsChangeGroupTypeResponse.RequestId"));
		opsChangeGroupTypeResponse.setMessage(_ctx.stringValue("OpsChangeGroupTypeResponse.Message"));
		opsChangeGroupTypeResponse.setCode(_ctx.stringValue("OpsChangeGroupTypeResponse.Code"));
		opsChangeGroupTypeResponse.setSuccess(_ctx.stringValue("OpsChangeGroupTypeResponse.Success"));

		Data data = new Data();
		data.setAllSuccess(_ctx.booleanValue("OpsChangeGroupTypeResponse.Data.AllSuccess"));

		List<CheckErrorMsg> checkErrorMsgs = new ArrayList<CheckErrorMsg>();
		for (int i = 0; i < _ctx.lengthValue("OpsChangeGroupTypeResponse.Data.CheckErrorMsgs.Length"); i++) {
			CheckErrorMsg checkErrorMsg = new CheckErrorMsg();
			checkErrorMsg.setErrorCode(_ctx.integerValue("OpsChangeGroupTypeResponse.Data.CheckErrorMsgs["+ i +"].ErrorCode"));
			checkErrorMsg.setErrorMsg(_ctx.stringValue("OpsChangeGroupTypeResponse.Data.CheckErrorMsgs["+ i +"].ErrorMsg"));
			checkErrorMsg.setResourceId(_ctx.stringValue("OpsChangeGroupTypeResponse.Data.CheckErrorMsgs["+ i +"].ResourceId"));

			checkErrorMsgs.add(checkErrorMsg);
		}
		data.setCheckErrorMsgs(checkErrorMsgs);
		opsChangeGroupTypeResponse.setData(data);
	 
	 	return opsChangeGroupTypeResponse;
	}
}