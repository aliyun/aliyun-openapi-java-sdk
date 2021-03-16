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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeGammaNcInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeGammaNcInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeGammaNcInfoResponseUnmarshaller {

	public static OpsDescribeGammaNcInfoResponse unmarshall(OpsDescribeGammaNcInfoResponse opsDescribeGammaNcInfoResponse, UnmarshallerContext _ctx) {
		
		opsDescribeGammaNcInfoResponse.setRequestId(_ctx.stringValue("OpsDescribeGammaNcInfoResponse.RequestId"));

		Data data = new Data();
		data.setNcIp(_ctx.stringValue("OpsDescribeGammaNcInfoResponse.Data.NcIp"));
		data.setNcId(_ctx.stringValue("OpsDescribeGammaNcInfoResponse.Data.NcId"));
		data.setSn(_ctx.stringValue("OpsDescribeGammaNcInfoResponse.Data.Sn"));
		data.setAliUid(_ctx.stringValue("OpsDescribeGammaNcInfoResponse.Data.AliUid"));
		data.setGroup(_ctx.stringValue("OpsDescribeGammaNcInfoResponse.Data.Group"));
		data.setOperator(_ctx.stringValue("OpsDescribeGammaNcInfoResponse.Data.Operator"));
		data.setGmtCreate(_ctx.stringValue("OpsDescribeGammaNcInfoResponse.Data.GmtCreate"));
		data.setGetGammaConfig(_ctx.booleanValue("OpsDescribeGammaNcInfoResponse.Data.GetGammaConfig"));
		opsDescribeGammaNcInfoResponse.setData(data);
	 
	 	return opsDescribeGammaNcInfoResponse;
	}
}