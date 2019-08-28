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

import com.aliyuncs.sae.model.v20190506.DescribeApplicationStatusResponse;
import com.aliyuncs.sae.model.v20190506.DescribeApplicationStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationStatusResponseUnmarshaller {

	public static DescribeApplicationStatusResponse unmarshall(DescribeApplicationStatusResponse describeApplicationStatusResponse, UnmarshallerContext _ctx) {
		
		describeApplicationStatusResponse.setRequestId(_ctx.stringValue("DescribeApplicationStatusResponse.RequestId"));
		describeApplicationStatusResponse.setCode(_ctx.stringValue("DescribeApplicationStatusResponse.Code"));
		describeApplicationStatusResponse.setMessage(_ctx.stringValue("DescribeApplicationStatusResponse.Message"));
		describeApplicationStatusResponse.setTraceId(_ctx.stringValue("DescribeApplicationStatusResponse.TraceId"));
		describeApplicationStatusResponse.setSuccess(_ctx.booleanValue("DescribeApplicationStatusResponse.Success"));
		describeApplicationStatusResponse.setErrorCode(_ctx.stringValue("DescribeApplicationStatusResponse.ErrorCode"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("DescribeApplicationStatusResponse.Data.AppId"));
		data.setLastChangeOrderId(_ctx.stringValue("DescribeApplicationStatusResponse.Data.LastChangeOrderId"));
		data.setLastChangeOrderStatus(_ctx.stringValue("DescribeApplicationStatusResponse.Data.LastChangeOrderStatus"));
		data.setLastChangeOrderRunning(_ctx.booleanValue("DescribeApplicationStatusResponse.Data.LastChangeOrderRunning"));
		data.setCurrentStatus(_ctx.stringValue("DescribeApplicationStatusResponse.Data.CurrentStatus"));
		data.setArmsApmInfo(_ctx.stringValue("DescribeApplicationStatusResponse.Data.ArmsApmInfo"));
		data.setRunningInstances(_ctx.integerValue("DescribeApplicationStatusResponse.Data.RunningInstances"));
		data.setArmsAdvancedEnabled(_ctx.stringValue("DescribeApplicationStatusResponse.Data.ArmsAdvancedEnabled"));
		data.setCreateTime(_ctx.stringValue("DescribeApplicationStatusResponse.Data.CreateTime"));
		describeApplicationStatusResponse.setData(data);
	 
	 	return describeApplicationStatusResponse;
	}
}