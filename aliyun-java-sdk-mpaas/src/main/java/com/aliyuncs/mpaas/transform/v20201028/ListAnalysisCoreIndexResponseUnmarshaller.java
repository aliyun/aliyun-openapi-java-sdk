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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.ListAnalysisCoreIndexResponse;
import com.aliyuncs.mpaas.model.v20201028.ListAnalysisCoreIndexResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.ListAnalysisCoreIndexResponse.ResultContent.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAnalysisCoreIndexResponseUnmarshaller {

	public static ListAnalysisCoreIndexResponse unmarshall(ListAnalysisCoreIndexResponse listAnalysisCoreIndexResponse, UnmarshallerContext _ctx) {
		
		listAnalysisCoreIndexResponse.setRequestId(_ctx.stringValue("ListAnalysisCoreIndexResponse.RequestId"));
		listAnalysisCoreIndexResponse.setResultMessage(_ctx.stringValue("ListAnalysisCoreIndexResponse.ResultMessage"));
		listAnalysisCoreIndexResponse.setResultCode(_ctx.stringValue("ListAnalysisCoreIndexResponse.ResultCode"));
		listAnalysisCoreIndexResponse.setSuccess(_ctx.booleanValue("ListAnalysisCoreIndexResponse.Success"));

		ResultContent resultContent = new ResultContent();
		resultContent.setSuccess(_ctx.booleanValue("ListAnalysisCoreIndexResponse.ResultContent.Success"));
		resultContent.setResultMsg(_ctx.stringValue("ListAnalysisCoreIndexResponse.ResultContent.ResultMsg"));

		Data data = new Data();
		data.setIgnoreNum(_ctx.stringValue("ListAnalysisCoreIndexResponse.ResultContent.Data.IgnoreNum"));
		data.setIgnoreRate(_ctx.stringValue("ListAnalysisCoreIndexResponse.ResultContent.Data.IgnoreRate"));
		data.setPushNum(_ctx.stringValue("ListAnalysisCoreIndexResponse.ResultContent.Data.PushNum"));
		data.setArrivalRate(_ctx.stringValue("ListAnalysisCoreIndexResponse.ResultContent.Data.ArrivalRate"));
		data.setOpenNum(_ctx.stringValue("ListAnalysisCoreIndexResponse.ResultContent.Data.OpenNum"));
		data.setOpenRate(_ctx.stringValue("ListAnalysisCoreIndexResponse.ResultContent.Data.OpenRate"));
		data.setPushTotalNum(_ctx.stringValue("ListAnalysisCoreIndexResponse.ResultContent.Data.PushTotalNum"));
		data.setArrivalNum(_ctx.stringValue("ListAnalysisCoreIndexResponse.ResultContent.Data.ArrivalNum"));
		resultContent.setData(data);
		listAnalysisCoreIndexResponse.setResultContent(resultContent);
	 
	 	return listAnalysisCoreIndexResponse;
	}
}