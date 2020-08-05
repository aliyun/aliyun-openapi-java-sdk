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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.DescribeDebugSlbResponse;
import com.aliyuncs.sae.model.v20190506.DescribeDebugSlbResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDebugSlbResponseUnmarshaller {

	public static DescribeDebugSlbResponse unmarshall(DescribeDebugSlbResponse describeDebugSlbResponse, UnmarshallerContext _ctx) {
		
		describeDebugSlbResponse.setRequestId(_ctx.stringValue("DescribeDebugSlbResponse.RequestId"));
		describeDebugSlbResponse.setCode(_ctx.stringValue("DescribeDebugSlbResponse.Code"));
		describeDebugSlbResponse.setErrorCode(_ctx.stringValue("DescribeDebugSlbResponse.ErrorCode"));
		describeDebugSlbResponse.setMessage(_ctx.stringValue("DescribeDebugSlbResponse.Message"));
		describeDebugSlbResponse.setSuccess(_ctx.booleanValue("DescribeDebugSlbResponse.Success"));
		describeDebugSlbResponse.setTraceId(_ctx.stringValue("DescribeDebugSlbResponse.TraceId"));

		Data data = new Data();
		data.setSlbId(_ctx.stringValue("DescribeDebugSlbResponse.Data.SlbId"));
		data.setSlbIp(_ctx.stringValue("DescribeDebugSlbResponse.Data.SlbIp"));
		data.setDebugPort(_ctx.integerValue("DescribeDebugSlbResponse.Data.DebugPort"));
		data.setAppId(_ctx.stringValue("DescribeDebugSlbResponse.Data.AppId"));
		data.setRunningChangeOrderId(_ctx.stringValue("DescribeDebugSlbResponse.Data.RunningChangeOrderId"));
		data.setPodName(_ctx.stringValue("DescribeDebugSlbResponse.Data.PodName"));
		data.setPodStatus(_ctx.stringValue("DescribeDebugSlbResponse.Data.PodStatus"));
		describeDebugSlbResponse.setData(data);
	 
	 	return describeDebugSlbResponse;
	}
}