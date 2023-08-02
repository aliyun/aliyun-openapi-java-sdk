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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.DescribeCollectionResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCollectionResponseUnmarshaller {

	public static DescribeCollectionResponse unmarshall(DescribeCollectionResponse describeCollectionResponse, UnmarshallerContext _ctx) {
		
		describeCollectionResponse.setRequestId(_ctx.stringValue("DescribeCollectionResponse.RequestId"));
		describeCollectionResponse.setDimension(_ctx.integerValue("DescribeCollectionResponse.Dimension"));
		describeCollectionResponse.setFullTextRetrievalFields(_ctx.stringValue("DescribeCollectionResponse.FullTextRetrievalFields"));
		describeCollectionResponse.setMetadata(_ctx.mapValue("DescribeCollectionResponse.Metadata"));
		describeCollectionResponse.setMetrics(_ctx.stringValue("DescribeCollectionResponse.Metrics"));
		describeCollectionResponse.setParser(_ctx.stringValue("DescribeCollectionResponse.Parser"));
		describeCollectionResponse.setDBInstanceId(_ctx.stringValue("DescribeCollectionResponse.DBInstanceId"));
		describeCollectionResponse.setRegionId(_ctx.stringValue("DescribeCollectionResponse.RegionId"));
		describeCollectionResponse.setNamespace(_ctx.stringValue("DescribeCollectionResponse.Namespace"));
		describeCollectionResponse.setMessage(_ctx.stringValue("DescribeCollectionResponse.Message"));
		describeCollectionResponse.setStatus(_ctx.stringValue("DescribeCollectionResponse.Status"));
	 
	 	return describeCollectionResponse;
	}
}