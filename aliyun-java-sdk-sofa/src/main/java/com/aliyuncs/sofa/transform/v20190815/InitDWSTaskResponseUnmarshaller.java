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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.InitDWSTaskResponse;
import com.aliyuncs.sofa.model.v20190815.InitDWSTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitDWSTaskResponseUnmarshaller {

	public static InitDWSTaskResponse unmarshall(InitDWSTaskResponse initDWSTaskResponse, UnmarshallerContext _ctx) {
		
		initDWSTaskResponse.setRequestId(_ctx.stringValue("InitDWSTaskResponse.RequestId"));
		initDWSTaskResponse.setResultCode(_ctx.stringValue("InitDWSTaskResponse.ResultCode"));
		initDWSTaskResponse.setResultMessage(_ctx.stringValue("InitDWSTaskResponse.ResultMessage"));

		Data data = new Data();
		data.setDstCategory(_ctx.stringValue("InitDWSTaskResponse.Data.DstCategory"));
		data.setGmtCreate(_ctx.stringValue("InitDWSTaskResponse.Data.GmtCreate"));
		data.setId(_ctx.stringValue("InitDWSTaskResponse.Data.Id"));
		data.setLinkman(_ctx.stringValue("InitDWSTaskResponse.Data.Linkman"));
		data.setName(_ctx.stringValue("InitDWSTaskResponse.Data.Name"));
		data.setScenarios(_ctx.stringValue("InitDWSTaskResponse.Data.Scenarios"));
		data.setSrcCategory(_ctx.stringValue("InitDWSTaskResponse.Data.SrcCategory"));
		data.setStatus(_ctx.stringValue("InitDWSTaskResponse.Data.Status"));
		data.setTaskParamJson(_ctx.stringValue("InitDWSTaskResponse.Data.TaskParamJson"));
		initDWSTaskResponse.setData(data);
	 
	 	return initDWSTaskResponse;
	}
}