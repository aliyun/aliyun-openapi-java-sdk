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

import com.aliyuncs.das.model.v20200116.DescribeCacheAnalysisJobsResponse;
import com.aliyuncs.das.model.v20200116.DescribeCacheAnalysisJobsResponse.Data;
import com.aliyuncs.das.model.v20200116.DescribeCacheAnalysisJobsResponse.Data.CacheAnalysisJob;
import com.aliyuncs.das.model.v20200116.DescribeCacheAnalysisJobsResponse.Data.CacheAnalysisJob.KeyInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCacheAnalysisJobsResponseUnmarshaller {

	public static DescribeCacheAnalysisJobsResponse unmarshall(DescribeCacheAnalysisJobsResponse describeCacheAnalysisJobsResponse, UnmarshallerContext _ctx) {
		
		describeCacheAnalysisJobsResponse.setRequestId(_ctx.stringValue("DescribeCacheAnalysisJobsResponse.RequestId"));
		describeCacheAnalysisJobsResponse.setCode(_ctx.stringValue("DescribeCacheAnalysisJobsResponse.Code"));
		describeCacheAnalysisJobsResponse.setMessage(_ctx.stringValue("DescribeCacheAnalysisJobsResponse.Message"));
		describeCacheAnalysisJobsResponse.setSuccess(_ctx.stringValue("DescribeCacheAnalysisJobsResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("DescribeCacheAnalysisJobsResponse.Data.Total"));
		data.setPageNo(_ctx.longValue("DescribeCacheAnalysisJobsResponse.Data.PageNo"));
		data.setPageSize(_ctx.longValue("DescribeCacheAnalysisJobsResponse.Data.PageSize"));
		data.setExtra(_ctx.stringValue("DescribeCacheAnalysisJobsResponse.Data.Extra"));

		List<CacheAnalysisJob> list = new ArrayList<CacheAnalysisJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCacheAnalysisJobsResponse.Data.List.Length"); i++) {
			CacheAnalysisJob cacheAnalysisJob = new CacheAnalysisJob();
			cacheAnalysisJob.setJobId(_ctx.stringValue("DescribeCacheAnalysisJobsResponse.Data.List["+ i +"].JobId"));
			cacheAnalysisJob.setInstanceId(_ctx.stringValue("DescribeCacheAnalysisJobsResponse.Data.List["+ i +"].InstanceId"));
			cacheAnalysisJob.setNodeId(_ctx.stringValue("DescribeCacheAnalysisJobsResponse.Data.List["+ i +"].NodeId"));
			cacheAnalysisJob.setTaskState(_ctx.stringValue("DescribeCacheAnalysisJobsResponse.Data.List["+ i +"].TaskState"));
			cacheAnalysisJob.setMessage(_ctx.stringValue("DescribeCacheAnalysisJobsResponse.Data.List["+ i +"].Message"));

			List<KeyInfo> bigKeys = new ArrayList<KeyInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCacheAnalysisJobsResponse.Data.List["+ i +"].BigKeys.Length"); j++) {
				KeyInfo keyInfo = new KeyInfo();
				keyInfo.setCount(_ctx.longValue("DescribeCacheAnalysisJobsResponse.Data.List["+ i +"].BigKeys["+ j +"].Count"));
				keyInfo.setBytes(_ctx.longValue("DescribeCacheAnalysisJobsResponse.Data.List["+ i +"].BigKeys["+ j +"].Bytes"));
				keyInfo.setDb(_ctx.integerValue("DescribeCacheAnalysisJobsResponse.Data.List["+ i +"].BigKeys["+ j +"].Db"));
				keyInfo.setEncoding(_ctx.stringValue("DescribeCacheAnalysisJobsResponse.Data.List["+ i +"].BigKeys["+ j +"].Encoding"));
				keyInfo.setExpirationTimeMillis(_ctx.longValue("DescribeCacheAnalysisJobsResponse.Data.List["+ i +"].BigKeys["+ j +"].ExpirationTimeMillis"));
				keyInfo.setKey(_ctx.stringValue("DescribeCacheAnalysisJobsResponse.Data.List["+ i +"].BigKeys["+ j +"].Key"));
				keyInfo.setNodeId(_ctx.stringValue("DescribeCacheAnalysisJobsResponse.Data.List["+ i +"].BigKeys["+ j +"].NodeId"));
				keyInfo.setType(_ctx.stringValue("DescribeCacheAnalysisJobsResponse.Data.List["+ i +"].BigKeys["+ j +"].Type"));

				bigKeys.add(keyInfo);
			}
			cacheAnalysisJob.setBigKeys(bigKeys);

			list.add(cacheAnalysisJob);
		}
		data.setList(list);
		describeCacheAnalysisJobsResponse.setData(data);
	 
	 	return describeCacheAnalysisJobsResponse;
	}
}