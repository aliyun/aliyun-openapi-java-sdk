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

package com.aliyuncs.cdn.transform.v20180510;

import com.aliyuncs.cdn.model.v20180510.DescribeRefreshQuotaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRefreshQuotaResponseUnmarshaller {

	public static DescribeRefreshQuotaResponse unmarshall(DescribeRefreshQuotaResponse describeRefreshQuotaResponse, UnmarshallerContext context) {
		
		describeRefreshQuotaResponse.setRequestId(context.stringValue("DescribeRefreshQuotaResponse.RequestId"));
		describeRefreshQuotaResponse.setUrlQuota(context.stringValue("DescribeRefreshQuotaResponse.UrlQuota"));
		describeRefreshQuotaResponse.setDirQuota(context.stringValue("DescribeRefreshQuotaResponse.DirQuota"));
		describeRefreshQuotaResponse.setUrlRemain(context.stringValue("DescribeRefreshQuotaResponse.UrlRemain"));
		describeRefreshQuotaResponse.setDirRemain(context.stringValue("DescribeRefreshQuotaResponse.DirRemain"));
		describeRefreshQuotaResponse.setPreloadQuota(context.stringValue("DescribeRefreshQuotaResponse.PreloadQuota"));
		describeRefreshQuotaResponse.setBlockQuota(context.stringValue("DescribeRefreshQuotaResponse.BlockQuota"));
		describeRefreshQuotaResponse.setPreloadRemain(context.stringValue("DescribeRefreshQuotaResponse.PreloadRemain"));
		describeRefreshQuotaResponse.setBlockRemain(context.stringValue("DescribeRefreshQuotaResponse.blockRemain"));
	 
	 	return describeRefreshQuotaResponse;
	}
}