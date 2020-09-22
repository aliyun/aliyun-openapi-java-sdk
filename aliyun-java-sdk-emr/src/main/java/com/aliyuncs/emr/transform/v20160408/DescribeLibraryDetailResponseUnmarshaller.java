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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.DescribeLibraryDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLibraryDetailResponseUnmarshaller {

	public static DescribeLibraryDetailResponse unmarshall(DescribeLibraryDetailResponse describeLibraryDetailResponse, UnmarshallerContext _ctx) {
		
		describeLibraryDetailResponse.setRequestId(_ctx.stringValue("DescribeLibraryDetailResponse.RequestId"));
		describeLibraryDetailResponse.setBizId(_ctx.stringValue("DescribeLibraryDetailResponse.BizId"));
		describeLibraryDetailResponse.setCreateTime(_ctx.longValue("DescribeLibraryDetailResponse.CreateTime"));
		describeLibraryDetailResponse.setType(_ctx.stringValue("DescribeLibraryDetailResponse.Type"));
		describeLibraryDetailResponse.setName(_ctx.stringValue("DescribeLibraryDetailResponse.Name"));
		describeLibraryDetailResponse.setLibraryVersion(_ctx.stringValue("DescribeLibraryDetailResponse.LibraryVersion"));
		describeLibraryDetailResponse.setSourceType(_ctx.stringValue("DescribeLibraryDetailResponse.SourceType"));
		describeLibraryDetailResponse.setSourceLocation(_ctx.stringValue("DescribeLibraryDetailResponse.SourceLocation"));
		describeLibraryDetailResponse.setScope(_ctx.stringValue("DescribeLibraryDetailResponse.Scope"));
		describeLibraryDetailResponse.setProperties(_ctx.stringValue("DescribeLibraryDetailResponse.Properties"));
		describeLibraryDetailResponse.setUserId(_ctx.stringValue("DescribeLibraryDetailResponse.UserId"));
	 
	 	return describeLibraryDetailResponse;
	}
}