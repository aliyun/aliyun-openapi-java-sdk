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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.GetMailTaskStatusResponse;
import com.aliyuncs.quickbi_public.model.v20220101.GetMailTaskStatusResponse.DATA;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMailTaskStatusResponseUnmarshaller {

	public static GetMailTaskStatusResponse unmarshall(GetMailTaskStatusResponse getMailTaskStatusResponse, UnmarshallerContext _ctx) {
		
		getMailTaskStatusResponse.setRequestId(_ctx.stringValue("GetMailTaskStatusResponse.RequestId"));
		getMailTaskStatusResponse.setSuccess(_ctx.booleanValue("GetMailTaskStatusResponse.Success"));

		List<DATA> result = new ArrayList<DATA>();
		for (int i = 0; i < _ctx.lengthValue("GetMailTaskStatusResponse.Result.Length"); i++) {
			DATA dATA = new DATA();
			dATA.setExecTime(_ctx.stringValue("GetMailTaskStatusResponse.Result["+ i +"].execTime"));
			dATA.setMailId(_ctx.stringValue("GetMailTaskStatusResponse.Result["+ i +"].mailId"));
			dATA.setStatus(_ctx.stringValue("GetMailTaskStatusResponse.Result["+ i +"].status"));
			dATA.setTaskId(_ctx.longValue("GetMailTaskStatusResponse.Result["+ i +"].taskId"));

			result.add(dATA);
		}
		getMailTaskStatusResponse.setResult(result);
	 
	 	return getMailTaskStatusResponse;
	}
}