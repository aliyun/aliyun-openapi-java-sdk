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

import com.aliyuncs.sas.model.v20181203.DescribeLogMetaResponse;
import com.aliyuncs.sas.model.v20181203.DescribeLogMetaResponse.LogMeta;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogMetaResponseUnmarshaller {

	public static DescribeLogMetaResponse unmarshall(DescribeLogMetaResponse describeLogMetaResponse, UnmarshallerContext _ctx) {
		
		describeLogMetaResponse.setRequestId(_ctx.stringValue("DescribeLogMetaResponse.RequestId"));
		describeLogMetaResponse.setTotalCount(_ctx.integerValue("DescribeLogMetaResponse.TotalCount"));

		List<LogMeta> logMetaList = new ArrayList<LogMeta>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogMetaResponse.LogMetaList.Length"); i++) {
			LogMeta logMeta = new LogMeta();
			logMeta.setLogDesc(_ctx.stringValue("DescribeLogMetaResponse.LogMetaList["+ i +"].LogDesc"));
			logMeta.setStatus(_ctx.stringValue("DescribeLogMetaResponse.LogMetaList["+ i +"].Status"));
			logMeta.setLogStore(_ctx.stringValue("DescribeLogMetaResponse.LogMetaList["+ i +"].LogStore"));
			logMeta.setUserProject(_ctx.stringValue("DescribeLogMetaResponse.LogMetaList["+ i +"].UserProject"));
			logMeta.setCategory(_ctx.stringValue("DescribeLogMetaResponse.LogMetaList["+ i +"].Category"));
			logMeta.setProject(_ctx.stringValue("DescribeLogMetaResponse.LogMetaList["+ i +"].Project"));
			logMeta.setUserLogStore(_ctx.stringValue("DescribeLogMetaResponse.LogMetaList["+ i +"].UserLogStore"));
			logMeta.setUserRegion(_ctx.stringValue("DescribeLogMetaResponse.LogMetaList["+ i +"].UserRegion"));
			logMeta.setTtl(_ctx.integerValue("DescribeLogMetaResponse.LogMetaList["+ i +"].Ttl"));
			logMeta.setHotTtl(_ctx.integerValue("DescribeLogMetaResponse.LogMetaList["+ i +"].HotTtl"));
			logMeta.setTopic(_ctx.stringValue("DescribeLogMetaResponse.LogMetaList["+ i +"].Topic"));
			logMeta.setConfigLogStore(_ctx.stringValue("DescribeLogMetaResponse.LogMetaList["+ i +"].ConfigLogStore"));
			logMeta.setConfigLogStoreDesc(_ctx.stringValue("DescribeLogMetaResponse.LogMetaList["+ i +"].ConfigLogStoreDesc"));

			logMetaList.add(logMeta);
		}
		describeLogMetaResponse.setLogMetaList(logMetaList);
	 
	 	return describeLogMetaResponse;
	}
}