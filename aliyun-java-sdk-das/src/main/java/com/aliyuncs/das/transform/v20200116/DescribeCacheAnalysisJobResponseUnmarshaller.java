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

import com.aliyuncs.das.model.v20200116.DescribeCacheAnalysisJobResponse;
import com.aliyuncs.das.model.v20200116.DescribeCacheAnalysisJobResponse.Data;
import com.aliyuncs.das.model.v20200116.DescribeCacheAnalysisJobResponse.Data.KeyInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCacheAnalysisJobResponseUnmarshaller {

	public static DescribeCacheAnalysisJobResponse unmarshall(DescribeCacheAnalysisJobResponse describeCacheAnalysisJobResponse, UnmarshallerContext _ctx) {
		
		describeCacheAnalysisJobResponse.setRequestId(_ctx.stringValue("DescribeCacheAnalysisJobResponse.RequestId"));
		describeCacheAnalysisJobResponse.setCode(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Code"));
		describeCacheAnalysisJobResponse.setMessage(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Message"));
		describeCacheAnalysisJobResponse.setSuccess(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Success"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.JobId"));
		data.setInstanceId(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.InstanceId"));
		data.setNodeId(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.NodeId"));
		data.setTaskState(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.TaskState"));
		data.setMessage(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.Message"));

		List<KeyInfo> bigKeys = new ArrayList<KeyInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCacheAnalysisJobResponse.Data.BigKeys.Length"); i++) {
			KeyInfo keyInfo = new KeyInfo();
			keyInfo.setCount(_ctx.longValue("DescribeCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Count"));
			keyInfo.setBytes(_ctx.longValue("DescribeCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Bytes"));
			keyInfo.setDb(_ctx.integerValue("DescribeCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Db"));
			keyInfo.setEncoding(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Encoding"));
			keyInfo.setExpirationTimeMillis(_ctx.longValue("DescribeCacheAnalysisJobResponse.Data.BigKeys["+ i +"].ExpirationTimeMillis"));
			keyInfo.setKey(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Key"));
			keyInfo.setNodeId(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.BigKeys["+ i +"].NodeId"));
			keyInfo.setType(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Type"));

			bigKeys.add(keyInfo);
		}
		data.setBigKeys(bigKeys);
		describeCacheAnalysisJobResponse.setData(data);
	 
	 	return describeCacheAnalysisJobResponse;
	}
}