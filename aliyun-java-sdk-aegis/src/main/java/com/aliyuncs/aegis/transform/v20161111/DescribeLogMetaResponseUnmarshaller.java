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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeLogMetaResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeLogMetaResponse.LogMeta;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogMetaResponseUnmarshaller {

	public static DescribeLogMetaResponse unmarshall(DescribeLogMetaResponse describeLogMetaResponse, UnmarshallerContext context) {
		
		describeLogMetaResponse.setRequestId(context.stringValue("DescribeLogMetaResponse.RequestId"));
		describeLogMetaResponse.setTotalCount(context.integerValue("DescribeLogMetaResponse.TotalCount"));

		List<LogMeta> logMetaList = new ArrayList<LogMeta>();
		for (int i = 0; i < context.lengthValue("DescribeLogMetaResponse.LogMetaList.Length"); i++) {
			LogMeta logMeta = new LogMeta();
			logMeta.setProject(context.stringValue("DescribeLogMetaResponse.LogMetaList["+ i +"].Project"));
			logMeta.setUserProject(context.stringValue("DescribeLogMetaResponse.LogMetaList["+ i +"].UserProject"));
			logMeta.setLogStore(context.stringValue("DescribeLogMetaResponse.LogMetaList["+ i +"].LogStore"));
			logMeta.setLogDesc(context.stringValue("DescribeLogMetaResponse.LogMetaList["+ i +"].LogDesc"));
			logMeta.setCategory(context.stringValue("DescribeLogMetaResponse.LogMetaList["+ i +"].Category"));
			logMeta.setStatus(context.stringValue("DescribeLogMetaResponse.LogMetaList["+ i +"].Status"));

			logMetaList.add(logMeta);
		}
		describeLogMetaResponse.setLogMetaList(logMetaList);
	 
	 	return describeLogMetaResponse;
	}
}