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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.DescribeDataReDistributeInfoResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDataReDistributeInfoResponse.DataReDistributeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataReDistributeInfoResponseUnmarshaller {

	public static DescribeDataReDistributeInfoResponse unmarshall(DescribeDataReDistributeInfoResponse describeDataReDistributeInfoResponse, UnmarshallerContext _ctx) {
		
		describeDataReDistributeInfoResponse.setRequestId(_ctx.stringValue("DescribeDataReDistributeInfoResponse.RequestId"));

		DataReDistributeInfo dataReDistributeInfo = new DataReDistributeInfo();
		dataReDistributeInfo.setType(_ctx.stringValue("DescribeDataReDistributeInfoResponse.DataReDistributeInfo.Type"));
		dataReDistributeInfo.setStartTime(_ctx.stringValue("DescribeDataReDistributeInfoResponse.DataReDistributeInfo.StartTime"));
		dataReDistributeInfo.setProgress(_ctx.longValue("DescribeDataReDistributeInfoResponse.DataReDistributeInfo.Progress"));
		dataReDistributeInfo.setRemainTime(_ctx.stringValue("DescribeDataReDistributeInfoResponse.DataReDistributeInfo.RemainTime"));
		dataReDistributeInfo.setMessage(_ctx.stringValue("DescribeDataReDistributeInfoResponse.DataReDistributeInfo.Message"));
		dataReDistributeInfo.setStatus(_ctx.stringValue("DescribeDataReDistributeInfoResponse.DataReDistributeInfo.Status"));
		describeDataReDistributeInfoResponse.setDataReDistributeInfo(dataReDistributeInfo);
	 
	 	return describeDataReDistributeInfoResponse;
	}
}