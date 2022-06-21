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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.GetContainerLogResponse;
import com.aliyuncs.swas.model.v20170810.GetContainerLogResponse.LogContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetContainerLogResponseUnmarshaller {

	public static GetContainerLogResponse unmarshall(GetContainerLogResponse getContainerLogResponse, UnmarshallerContext _ctx) {
		
		getContainerLogResponse.setRequestId(_ctx.stringValue("GetContainerLogResponse.RequestId"));
		getContainerLogResponse.setIsSuccess(_ctx.booleanValue("GetContainerLogResponse.IsSuccess"));
		getContainerLogResponse.setCode(_ctx.stringValue("GetContainerLogResponse.Code"));
		getContainerLogResponse.setLogCount(_ctx.integerValue("GetContainerLogResponse.LogCount"));

		List<LogContent> logContents = new ArrayList<LogContent>();
		for (int i = 0; i < _ctx.lengthValue("GetContainerLogResponse.LogContents.Length"); i++) {
			LogContent logContent = new LogContent();
			logContent.setTimestamp(_ctx.longValue("GetContainerLogResponse.LogContents["+ i +"].Timestamp"));
			logContent.setContent(_ctx.stringValue("GetContainerLogResponse.LogContents["+ i +"].Content"));

			logContents.add(logContent);
		}
		getContainerLogResponse.setLogContents(logContents);
	 
	 	return getContainerLogResponse;
	}
}