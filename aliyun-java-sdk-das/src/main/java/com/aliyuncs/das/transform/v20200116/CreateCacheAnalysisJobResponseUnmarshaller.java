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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.CreateCacheAnalysisJobResponse;
import com.aliyuncs.das.model.v20200116.CreateCacheAnalysisJobResponse.Data;
import com.aliyuncs.das.model.v20200116.CreateCacheAnalysisJobResponse.Data.KeyInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCacheAnalysisJobResponseUnmarshaller {

	public static CreateCacheAnalysisJobResponse unmarshall(CreateCacheAnalysisJobResponse createCacheAnalysisJobResponse, UnmarshallerContext _ctx) {
		
		createCacheAnalysisJobResponse.setRequestId(_ctx.stringValue("CreateCacheAnalysisJobResponse.RequestId"));
		createCacheAnalysisJobResponse.setMessage(_ctx.stringValue("CreateCacheAnalysisJobResponse.Message"));
		createCacheAnalysisJobResponse.setCode(_ctx.stringValue("CreateCacheAnalysisJobResponse.Code"));
		createCacheAnalysisJobResponse.setSuccess(_ctx.stringValue("CreateCacheAnalysisJobResponse.Success"));

		Data data = new Data();
		data.setTaskState(_ctx.stringValue("CreateCacheAnalysisJobResponse.Data.TaskState"));
		data.setJobId(_ctx.stringValue("CreateCacheAnalysisJobResponse.Data.JobId"));
		data.setMessage(_ctx.stringValue("CreateCacheAnalysisJobResponse.Data.Message"));
		data.setInstanceId(_ctx.stringValue("CreateCacheAnalysisJobResponse.Data.InstanceId"));
		data.setNodeId(_ctx.stringValue("CreateCacheAnalysisJobResponse.Data.NodeId"));

		List<KeyInfo> bigKeys = new ArrayList<KeyInfo>();
		for (int i = 0; i < _ctx.lengthValue("CreateCacheAnalysisJobResponse.Data.BigKeys.Length"); i++) {
			KeyInfo keyInfo = new KeyInfo();
			keyInfo.setType(_ctx.stringValue("CreateCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Type"));
			keyInfo.setDb(_ctx.integerValue("CreateCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Db"));
			keyInfo.setExpirationTimeMillis(_ctx.longValue("CreateCacheAnalysisJobResponse.Data.BigKeys["+ i +"].ExpirationTimeMillis"));
			keyInfo.setKey(_ctx.stringValue("CreateCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Key"));
			keyInfo.setEncoding(_ctx.stringValue("CreateCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Encoding"));
			keyInfo.setBytes(_ctx.longValue("CreateCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Bytes"));
			keyInfo.setNodeId(_ctx.stringValue("CreateCacheAnalysisJobResponse.Data.BigKeys["+ i +"].NodeId"));
			keyInfo.setCount(_ctx.longValue("CreateCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Count"));

			bigKeys.add(keyInfo);
		}
		data.setBigKeys(bigKeys);
		createCacheAnalysisJobResponse.setData(data);
	 
	 	return createCacheAnalysisJobResponse;
	}
}