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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeTaskErrorLogResponse;
import com.aliyuncs.sas.model.v20181203.DescribeTaskErrorLogResponse.Log;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTaskErrorLogResponseUnmarshaller {

	public static DescribeTaskErrorLogResponse unmarshall(DescribeTaskErrorLogResponse describeTaskErrorLogResponse, UnmarshallerContext _ctx) {
		
		describeTaskErrorLogResponse.setRequestId(_ctx.stringValue("DescribeTaskErrorLogResponse.RequestId"));
		describeTaskErrorLogResponse.setCount(_ctx.integerValue("DescribeTaskErrorLogResponse.Count"));

		List<Log> logs = new ArrayList<Log>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTaskErrorLogResponse.Logs.Length"); i++) {
			Log log = new Log();
			log.setText(_ctx.stringValue("DescribeTaskErrorLogResponse.Logs["+ i +"].Text"));

			logs.add(log);
		}
		describeTaskErrorLogResponse.setLogs(logs);
	 
	 	return describeTaskErrorLogResponse;
	}
}