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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryOpLogsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryOpLogsResponse.OpLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryOpLogsResponseUnmarshaller {

	public static OpsQueryOpLogsResponse unmarshall(OpsQueryOpLogsResponse opsQueryOpLogsResponse, UnmarshallerContext _ctx) {
		
		opsQueryOpLogsResponse.setRequestId(_ctx.stringValue("OpsQueryOpLogsResponse.RequestId"));
		opsQueryOpLogsResponse.setTotalCount(_ctx.integerValue("OpsQueryOpLogsResponse.TotalCount"));
		opsQueryOpLogsResponse.setPageSize(_ctx.integerValue("OpsQueryOpLogsResponse.PageSize"));
		opsQueryOpLogsResponse.setPageNumber(_ctx.integerValue("OpsQueryOpLogsResponse.PageNumber"));

		List<OpLog> opLogs = new ArrayList<OpLog>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryOpLogsResponse.OpLogs.Length"); i++) {
			OpLog opLog = new OpLog();
			opLog.setType(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].Type"));
			opLog.setKey(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].Key"));
			opLog.setData(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].Data"));
			opLog.setProgress(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].Progress"));
			opLog.setMemo(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].Memo"));
			opLog.setAliUid(_ctx.longValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].AliUid"));
			opLog.setResultCode(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].ResultCode"));
			opLog.setBid(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].Bid"));
			opLog.setExtraMapJson(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].ExtraMapJson"));
			opLog.setResultMsg(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].ResultMsg"));
			opLog.setEndTime(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].EndTime"));
			opLog.setStartTime(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].StartTime"));
			opLog.setOperate(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].Operate"));
			opLog.setBizLine(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].BizLine"));
			opLog.setDuration(_ctx.longValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].Duration"));
			opLog.setResourceId2(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].ResourceId2"));
			opLog.setChannel(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].Channel"));
			opLog.setOperator(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].Operator"));
			opLog.setResourceId(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].ResourceId"));
			opLog.setSubLine(_ctx.stringValue("OpsQueryOpLogsResponse.OpLogs["+ i +"].SubLine"));

			opLogs.add(opLog);
		}
		opsQueryOpLogsResponse.setOpLogs(opLogs);
	 
	 	return opsQueryOpLogsResponse;
	}
}