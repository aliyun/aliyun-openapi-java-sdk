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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribePyncCommonLogResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribePyncCommonLogResponse.Log;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribePyncCommonLogResponseUnmarshaller {

	public static OpsDescribePyncCommonLogResponse unmarshall(OpsDescribePyncCommonLogResponse opsDescribePyncCommonLogResponse, UnmarshallerContext _ctx) {
		
		opsDescribePyncCommonLogResponse.setRequestId(_ctx.stringValue("OpsDescribePyncCommonLogResponse.RequestId"));
		opsDescribePyncCommonLogResponse.setTotalCount(_ctx.integerValue("OpsDescribePyncCommonLogResponse.TotalCount"));
		opsDescribePyncCommonLogResponse.setPageSize(_ctx.integerValue("OpsDescribePyncCommonLogResponse.PageSize"));
		opsDescribePyncCommonLogResponse.setPageNumber(_ctx.integerValue("OpsDescribePyncCommonLogResponse.PageNumber"));

		List<Log> logs = new ArrayList<Log>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribePyncCommonLogResponse.Logs.Length"); i++) {
			Log log = new Log();
			log.setTime(_ctx.stringValue("OpsDescribePyncCommonLogResponse.Logs["+ i +"].Time"));
			log.setMs(_ctx.stringValue("OpsDescribePyncCommonLogResponse.Logs["+ i +"].Ms"));
			log.setTopic(_ctx.stringValue("OpsDescribePyncCommonLogResponse.Logs["+ i +"].Topic"));
			log.setPath(_ctx.stringValue("OpsDescribePyncCommonLogResponse.Logs["+ i +"].Path"));
			log.setLogRequestId(_ctx.stringValue("OpsDescribePyncCommonLogResponse.Logs["+ i +"].LogRequestId"));
			log.setContent(_ctx.stringValue("OpsDescribePyncCommonLogResponse.Logs["+ i +"].Content"));

			logs.add(log);
		}
		opsDescribePyncCommonLogResponse.setLogs(logs);
	 
	 	return opsDescribePyncCommonLogResponse;
	}
}