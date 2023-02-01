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

import com.aliyuncs.ecd.model.v20200930.DescribeClipboardFormatListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClipboardFormatListResponseUnmarshaller {

	public static DescribeClipboardFormatListResponse unmarshall(DescribeClipboardFormatListResponse describeClipboardFormatListResponse, UnmarshallerContext _ctx) {
		
		describeClipboardFormatListResponse.setRequestId(_ctx.stringValue("DescribeClipboardFormatListResponse.RequestId"));

		List<String> values = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClipboardFormatListResponse.Values.Length"); i++) {
			values.add(_ctx.stringValue("DescribeClipboardFormatListResponse.Values["+ i +"]"));
		}
		describeClipboardFormatListResponse.setValues(values);
	 
	 	return describeClipboardFormatListResponse;
	}
}