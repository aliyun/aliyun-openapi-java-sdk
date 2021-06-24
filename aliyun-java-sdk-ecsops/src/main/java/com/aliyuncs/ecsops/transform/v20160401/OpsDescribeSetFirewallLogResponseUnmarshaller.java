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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSetFirewallLogResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSetFirewallLogResponse.Log;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeSetFirewallLogResponseUnmarshaller {

	public static OpsDescribeSetFirewallLogResponse unmarshall(OpsDescribeSetFirewallLogResponse opsDescribeSetFirewallLogResponse, UnmarshallerContext _ctx) {
		
		opsDescribeSetFirewallLogResponse.setRequestId(_ctx.stringValue("OpsDescribeSetFirewallLogResponse.RequestId"));
		opsDescribeSetFirewallLogResponse.setTotalCount(_ctx.integerValue("OpsDescribeSetFirewallLogResponse.TotalCount"));
		opsDescribeSetFirewallLogResponse.setPageSize(_ctx.integerValue("OpsDescribeSetFirewallLogResponse.PageSize"));
		opsDescribeSetFirewallLogResponse.setPageNumber(_ctx.integerValue("OpsDescribeSetFirewallLogResponse.PageNumber"));

		List<Log> logs = new ArrayList<Log>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeSetFirewallLogResponse.Logs.Length"); i++) {
			Log log = new Log();
			log.setMsg(_ctx.stringValue("OpsDescribeSetFirewallLogResponse.Logs["+ i +"].Msg"));
			log.setType(_ctx.stringValue("OpsDescribeSetFirewallLogResponse.Logs["+ i +"].Type"));
			log.setPyncCode(_ctx.stringValue("OpsDescribeSetFirewallLogResponse.Logs["+ i +"].PyncCode"));
			log.setMs(_ctx.stringValue("OpsDescribeSetFirewallLogResponse.Logs["+ i +"].Ms"));
			log.setTime(_ctx.stringValue("OpsDescribeSetFirewallLogResponse.Logs["+ i +"].Time"));
			log.setSuccess(_ctx.stringValue("OpsDescribeSetFirewallLogResponse.Logs["+ i +"].Success"));
			log.setTopic(_ctx.stringValue("OpsDescribeSetFirewallLogResponse.Logs["+ i +"].Topic"));
			log.setPath(_ctx.stringValue("OpsDescribeSetFirewallLogResponse.Logs["+ i +"].Path"));
			log.setTypeName(_ctx.stringValue("OpsDescribeSetFirewallLogResponse.Logs["+ i +"].TypeName"));
			log.setLogRequestId(_ctx.stringValue("OpsDescribeSetFirewallLogResponse.Logs["+ i +"].LogRequestId"));
			log.setContent(_ctx.stringValue("OpsDescribeSetFirewallLogResponse.Logs["+ i +"].Content"));

			logs.add(log);
		}
		opsDescribeSetFirewallLogResponse.setLogs(logs);
	 
	 	return opsDescribeSetFirewallLogResponse;
	}
}