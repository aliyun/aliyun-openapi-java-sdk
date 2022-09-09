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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeCustomizedListHeadersResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeCustomizedListHeadersResponse.Header;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomizedListHeadersResponseUnmarshaller {

	public static DescribeCustomizedListHeadersResponse unmarshall(DescribeCustomizedListHeadersResponse describeCustomizedListHeadersResponse, UnmarshallerContext _ctx) {
		
		describeCustomizedListHeadersResponse.setRequestId(_ctx.stringValue("DescribeCustomizedListHeadersResponse.RequestId"));

		List<Header> headers = new ArrayList<Header>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomizedListHeadersResponse.Headers.Length"); i++) {
			Header header = new Header();
			header.setDisplayType(_ctx.stringValue("DescribeCustomizedListHeadersResponse.Headers["+ i +"].DisplayType"));
			header.setHeaderKey(_ctx.stringValue("DescribeCustomizedListHeadersResponse.Headers["+ i +"].HeaderKey"));
			header.setHeaderName(_ctx.stringValue("DescribeCustomizedListHeadersResponse.Headers["+ i +"].HeaderName"));

			headers.add(header);
		}
		describeCustomizedListHeadersResponse.setHeaders(headers);
	 
	 	return describeCustomizedListHeadersResponse;
	}
}