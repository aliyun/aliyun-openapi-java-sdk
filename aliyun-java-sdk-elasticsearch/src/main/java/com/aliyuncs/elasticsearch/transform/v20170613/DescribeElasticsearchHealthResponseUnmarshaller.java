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

package com.aliyuncs.elasticsearch.transform.v20170613;

import com.aliyuncs.elasticsearch.model.v20170613.DescribeElasticsearchHealthResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeElasticsearchHealthResponseUnmarshaller {

	public static DescribeElasticsearchHealthResponse unmarshall(DescribeElasticsearchHealthResponse describeElasticsearchHealthResponse, UnmarshallerContext _ctx) {
		
		describeElasticsearchHealthResponse.setRequestId(_ctx.stringValue("DescribeElasticsearchHealthResponse.RequestId"));
		describeElasticsearchHealthResponse.setCode(_ctx.stringValue("DescribeElasticsearchHealthResponse.Code"));
		describeElasticsearchHealthResponse.setMessage(_ctx.stringValue("DescribeElasticsearchHealthResponse.Message"));
		describeElasticsearchHealthResponse.setResult(_ctx.stringValue("DescribeElasticsearchHealthResponse.Result"));
	 
	 	return describeElasticsearchHealthResponse;
	}
}