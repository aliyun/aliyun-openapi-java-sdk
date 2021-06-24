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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeUnderlayEniResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeUnderlayEniResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeUnderlayEniResponseUnmarshaller {

	public static OpsDescribeUnderlayEniResponse unmarshall(OpsDescribeUnderlayEniResponse opsDescribeUnderlayEniResponse, UnmarshallerContext _ctx) {
		
		opsDescribeUnderlayEniResponse.setRequestId(_ctx.stringValue("OpsDescribeUnderlayEniResponse.RequestId"));
		opsDescribeUnderlayEniResponse.setMessage(_ctx.stringValue("OpsDescribeUnderlayEniResponse.Message"));
		opsDescribeUnderlayEniResponse.setCode(_ctx.stringValue("OpsDescribeUnderlayEniResponse.Code"));
		opsDescribeUnderlayEniResponse.setSuccess(_ctx.stringValue("OpsDescribeUnderlayEniResponse.Success"));

		Data data = new Data();
		data.setMask(_ctx.stringValue("OpsDescribeUnderlayEniResponse.Data.Mask"));
		data.setGateway(_ctx.stringValue("OpsDescribeUnderlayEniResponse.Data.Gateway"));
		data.setUnderlayEniId(_ctx.stringValue("OpsDescribeUnderlayEniResponse.Data.UnderlayEniId"));
		data.setIp(_ctx.stringValue("OpsDescribeUnderlayEniResponse.Data.Ip"));
		data.setInstanceId(_ctx.stringValue("OpsDescribeUnderlayEniResponse.Data.InstanceId"));
		data.setVlan(_ctx.stringValue("OpsDescribeUnderlayEniResponse.Data.Vlan"));
		data.setMac(_ctx.stringValue("OpsDescribeUnderlayEniResponse.Data.Mac"));
		opsDescribeUnderlayEniResponse.setData(data);
	 
	 	return opsDescribeUnderlayEniResponse;
	}
}