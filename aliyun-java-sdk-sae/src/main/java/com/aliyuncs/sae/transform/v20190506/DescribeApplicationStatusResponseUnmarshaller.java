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
		describeApplicationStatusResponse.setMessage(_ctx.stringValue("DescribeApplicationStatusResponse.Message"));
		describeApplicationStatusResponse.setTraceId(_ctx.stringValue("DescribeApplicationStatusResponse.TraceId"));
		describeApplicationStatusResponse.setErrorCode(_ctx.stringValue("DescribeApplicationStatusResponse.ErrorCode"));
		describeApplicationStatusResponse.setCode(_ctx.stringValue("DescribeApplicationStatusResponse.Code"));
		describeApplicationStatusResponse.setSuccess(_ctx.booleanValue("DescribeApplicationStatusResponse.Success"));

		Data data = new Data();
		data.setArmsAdvancedEnabled(_ctx.stringValue("DescribeApplicationStatusResponse.Data.ArmsAdvancedEnabled"));
		data.setLastChangeOrderId(_ctx.stringValue("DescribeApplicationStatusResponse.Data.LastChangeOrderId"));
		data.setArmsApmInfo(_ctx.stringValue("DescribeApplicationStatusResponse.Data.ArmsApmInfo"));
		data.setCreateTime(_ctx.stringValue("DescribeApplicationStatusResponse.Data.CreateTime"));
		data.setCurrentStatus(_ctx.stringValue("DescribeApplicationStatusResponse.Data.CurrentStatus"));
		data.setAppId(_ctx.stringValue("DescribeApplicationStatusResponse.Data.AppId"));
		data.setLastChangeOrderRunning(_ctx.booleanValue("DescribeApplicationStatusResponse.Data.LastChangeOrderRunning"));
		data.setRunningInstances(_ctx.integerValue("DescribeApplicationStatusResponse.Data.RunningInstances"));
		data.setLastChangeOrderStatus(_ctx.stringValue("DescribeApplicationStatusResponse.Data.LastChangeOrderStatus"));
		data.setSubStatus(_ctx.stringValue("DescribeApplicationStatusResponse.Data.SubStatus"));
		data.setEnableAgent(_ctx.booleanValue("DescribeApplicationStatusResponse.Data.EnableAgent"));
		data.setFileSizeLimit(_ctx.longValue("DescribeApplicationStatusResponse.Data.FileSizeLimit"));
		describeApplicationStatusResponse.setData(data);
	 
	 	return describeApplicationStatusResponse;
	}
}