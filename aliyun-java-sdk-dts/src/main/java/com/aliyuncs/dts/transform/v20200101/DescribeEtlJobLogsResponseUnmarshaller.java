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

package com.aliyuncs.dts.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20200101.DescribeEtlJobLogsResponse;
import com.aliyuncs.dts.model.v20200101.DescribeEtlJobLogsResponse.EtlRunningLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEtlJobLogsResponseUnmarshaller {

	public static DescribeEtlJobLogsResponse unmarshall(DescribeEtlJobLogsResponse describeEtlJobLogsResponse, UnmarshallerContext _ctx) {
		
		describeEtlJobLogsResponse.setRequestId(_ctx.stringValue("DescribeEtlJobLogsResponse.RequestId"));
		describeEtlJobLogsResponse.setHttpStatusCode(_ctx.integerValue("DescribeEtlJobLogsResponse.HttpStatusCode"));
		describeEtlJobLogsResponse.setErrCode(_ctx.stringValue("DescribeEtlJobLogsResponse.ErrCode"));
		describeEtlJobLogsResponse.setSuccess(_ctx.booleanValue("DescribeEtlJobLogsResponse.Success"));
		describeEtlJobLogsResponse.setErrMessage(_ctx.stringValue("DescribeEtlJobLogsResponse.ErrMessage"));
		describeEtlJobLogsResponse.setDynamicMessage(_ctx.stringValue("DescribeEtlJobLogsResponse.DynamicMessage"));
		describeEtlJobLogsResponse.setDynamicCode(_ctx.stringValue("DescribeEtlJobLogsResponse.DynamicCode"));

		List<EtlRunningLog> etlRunningLogs = new ArrayList<EtlRunningLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEtlJobLogsResponse.EtlRunningLogs.Length"); i++) {
			EtlRunningLog etlRunningLog = new EtlRunningLog();
			etlRunningLog.setEtlId(_ctx.stringValue("DescribeEtlJobLogsResponse.EtlRunningLogs["+ i +"].EtlId"));
			etlRunningLog.setUserId(_ctx.stringValue("DescribeEtlJobLogsResponse.EtlRunningLogs["+ i +"].UserId"));
			etlRunningLog.setContentKey(_ctx.stringValue("DescribeEtlJobLogsResponse.EtlRunningLogs["+ i +"].ContentKey"));
			etlRunningLog.setContent(_ctx.stringValue("DescribeEtlJobLogsResponse.EtlRunningLogs["+ i +"].Content"));
			etlRunningLog.setStatus(_ctx.stringValue("DescribeEtlJobLogsResponse.EtlRunningLogs["+ i +"].Status"));
			etlRunningLog.setLogDatetime(_ctx.stringValue("DescribeEtlJobLogsResponse.EtlRunningLogs["+ i +"].LogDatetime"));

			etlRunningLogs.add(etlRunningLog);
		}
		describeEtlJobLogsResponse.setEtlRunningLogs(etlRunningLogs);
	 
	 	return describeEtlJobLogsResponse;
	}
}