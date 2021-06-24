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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeWarningPanelResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeWarningPanelResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeWarningPanelResponseUnmarshaller {

	public static OpsDescribeWarningPanelResponse unmarshall(OpsDescribeWarningPanelResponse opsDescribeWarningPanelResponse, UnmarshallerContext _ctx) {
		
		opsDescribeWarningPanelResponse.setRequestId(_ctx.stringValue("OpsDescribeWarningPanelResponse.RequestId"));
		opsDescribeWarningPanelResponse.setMessage(_ctx.stringValue("OpsDescribeWarningPanelResponse.Message"));
		opsDescribeWarningPanelResponse.setCode(_ctx.stringValue("OpsDescribeWarningPanelResponse.Code"));
		opsDescribeWarningPanelResponse.setSuccess(_ctx.stringValue("OpsDescribeWarningPanelResponse.Success"));

		Data data = new Data();
		data.setP1done(_ctx.stringValue("OpsDescribeWarningPanelResponse.Data.P1done"));
		data.setP1doing(_ctx.stringValue("OpsDescribeWarningPanelResponse.Data.P1doing"));
		data.setP2done(_ctx.stringValue("OpsDescribeWarningPanelResponse.Data.P2done"));
		data.setP2total(_ctx.stringValue("OpsDescribeWarningPanelResponse.Data.P2total"));
		data.setP3waiting(_ctx.stringValue("OpsDescribeWarningPanelResponse.Data.P3waiting"));
		data.setP1waiting(_ctx.stringValue("OpsDescribeWarningPanelResponse.Data.P1waiting"));
		data.setTotal(_ctx.stringValue("OpsDescribeWarningPanelResponse.Data.Total"));
		data.setP1total(_ctx.stringValue("OpsDescribeWarningPanelResponse.Data.P1total"));
		data.setWaiting(_ctx.stringValue("OpsDescribeWarningPanelResponse.Data.Waiting"));
		data.setDone(_ctx.stringValue("OpsDescribeWarningPanelResponse.Data.Done"));
		data.setP2waiting(_ctx.stringValue("OpsDescribeWarningPanelResponse.Data.P2waiting"));
		data.setP3total(_ctx.stringValue("OpsDescribeWarningPanelResponse.Data.P3total"));
		data.setP3doing(_ctx.stringValue("OpsDescribeWarningPanelResponse.Data.P3doing"));
		data.setP3done(_ctx.stringValue("OpsDescribeWarningPanelResponse.Data.P3done"));
		data.setP2doing(_ctx.stringValue("OpsDescribeWarningPanelResponse.Data.P2doing"));
		data.setDoing(_ctx.stringValue("OpsDescribeWarningPanelResponse.Data.Doing"));
		opsDescribeWarningPanelResponse.setData(data);
	 
	 	return opsDescribeWarningPanelResponse;
	}
}