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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeGroupMultipleQueueInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeGroupMultipleQueueInfoResponseUnmarshaller {

	public static OpsDescribeGroupMultipleQueueInfoResponse unmarshall(OpsDescribeGroupMultipleQueueInfoResponse opsDescribeGroupMultipleQueueInfoResponse, UnmarshallerContext _ctx) {
		
		opsDescribeGroupMultipleQueueInfoResponse.setRequestId(_ctx.stringValue("OpsDescribeGroupMultipleQueueInfoResponse.RequestId"));
		opsDescribeGroupMultipleQueueInfoResponse.setScanInterval(_ctx.stringValue("OpsDescribeGroupMultipleQueueInfoResponse.ScanInterval"));
		opsDescribeGroupMultipleQueueInfoResponse.setBlackListScanInterval(_ctx.stringValue("OpsDescribeGroupMultipleQueueInfoResponse.BlackListScanInterval"));
		opsDescribeGroupMultipleQueueInfoResponse.setMode(_ctx.stringValue("OpsDescribeGroupMultipleQueueInfoResponse.Mode"));
		opsDescribeGroupMultipleQueueInfoResponse.setZkConfig(_ctx.stringValue("OpsDescribeGroupMultipleQueueInfoResponse.ZkConfig"));
		opsDescribeGroupMultipleQueueInfoResponse.setDbConfig(_ctx.stringValue("OpsDescribeGroupMultipleQueueInfoResponse.DbConfig"));
		opsDescribeGroupMultipleQueueInfoResponse.setRecommendedConfig(_ctx.stringValue("OpsDescribeGroupMultipleQueueInfoResponse.RecommendedConfig"));
	 
	 	return opsDescribeGroupMultipleQueueInfoResponse;
	}
}