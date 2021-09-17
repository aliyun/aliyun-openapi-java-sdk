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
import com.aliyuncs.das.model.v20200116.DescribeCacheAnalysisJobResponse.Data.Prefix;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCacheAnalysisJobResponseUnmarshaller {

	public static DescribeCacheAnalysisJobResponse unmarshall(DescribeCacheAnalysisJobResponse describeCacheAnalysisJobResponse, UnmarshallerContext _ctx) {
		
		describeCacheAnalysisJobResponse.setRequestId(_ctx.stringValue("DescribeCacheAnalysisJobResponse.RequestId"));
		describeCacheAnalysisJobResponse.setMessage(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Message"));
		describeCacheAnalysisJobResponse.setCode(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Code"));
		describeCacheAnalysisJobResponse.setSuccess(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Success"));

		Data data = new Data();
		data.setTaskState(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.TaskState"));
		data.setJobId(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.JobId"));
		data.setMessage(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.Message"));
		data.setInstanceId(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.InstanceId"));
		data.setNodeId(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.NodeId"));

		List<Prefix> keyPrefixes = new ArrayList<Prefix>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCacheAnalysisJobResponse.Data.KeyPrefixes.Length"); i++) {
			Prefix prefix = new Prefix();
			prefix.setKeyNum(_ctx.longValue("DescribeCacheAnalysisJobResponse.Data.KeyPrefixes["+ i +"].KeyNum"));
			prefix.setType(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.KeyPrefixes["+ i +"].Type"));
			prefix.setBytes(_ctx.longValue("DescribeCacheAnalysisJobResponse.Data.KeyPrefixes["+ i +"].Bytes"));
			prefix.setPrefix(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.KeyPrefixes["+ i +"].Prefix"));
			prefix.setCount(_ctx.longValue("DescribeCacheAnalysisJobResponse.Data.KeyPrefixes["+ i +"].Count"));

			keyPrefixes.add(prefix);
		}
		data.setKeyPrefixes(keyPrefixes);

		List<KeyInfo> bigKeys = new ArrayList<KeyInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCacheAnalysisJobResponse.Data.BigKeys.Length"); i++) {
			KeyInfo keyInfo = new KeyInfo();
			keyInfo.setType(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Type"));
			keyInfo.setDb(_ctx.integerValue("DescribeCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Db"));
			keyInfo.setExpirationTimeMillis(_ctx.longValue("DescribeCacheAnalysisJobResponse.Data.BigKeys["+ i +"].ExpirationTimeMillis"));
			keyInfo.setKey(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Key"));
			keyInfo.setEncoding(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Encoding"));
			keyInfo.setBytes(_ctx.longValue("DescribeCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Bytes"));
			keyInfo.setNodeId(_ctx.stringValue("DescribeCacheAnalysisJobResponse.Data.BigKeys["+ i +"].NodeId"));
			keyInfo.setCount(_ctx.longValue("DescribeCacheAnalysisJobResponse.Data.BigKeys["+ i +"].Count"));

			bigKeys.add(keyInfo);
		}
		data.setBigKeys(bigKeys);
		describeCacheAnalysisJobResponse.setData(data);
	 
	 	return describeCacheAnalysisJobResponse;
	}
}