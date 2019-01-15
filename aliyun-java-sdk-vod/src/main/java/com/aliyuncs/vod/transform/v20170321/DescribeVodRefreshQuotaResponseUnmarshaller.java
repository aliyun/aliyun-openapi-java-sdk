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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.DescribeVodRefreshQuotaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodRefreshQuotaResponseUnmarshaller {

	public static DescribeVodRefreshQuotaResponse unmarshall(DescribeVodRefreshQuotaResponse describeVodRefreshQuotaResponse, UnmarshallerContext context) {
		
		describeVodRefreshQuotaResponse.setRequestId(context.stringValue("DescribeVodRefreshQuotaResponse.RequestId"));
		describeVodRefreshQuotaResponse.setUrlQuota(context.stringValue("DescribeVodRefreshQuotaResponse.UrlQuota"));
		describeVodRefreshQuotaResponse.setDirQuota(context.stringValue("DescribeVodRefreshQuotaResponse.DirQuota"));
		describeVodRefreshQuotaResponse.setUrlRemain(context.stringValue("DescribeVodRefreshQuotaResponse.UrlRemain"));
		describeVodRefreshQuotaResponse.setDirRemain(context.stringValue("DescribeVodRefreshQuotaResponse.DirRemain"));
		describeVodRefreshQuotaResponse.setPreloadQuota(context.stringValue("DescribeVodRefreshQuotaResponse.PreloadQuota"));
		describeVodRefreshQuotaResponse.setBlockQuota(context.stringValue("DescribeVodRefreshQuotaResponse.BlockQuota"));
		describeVodRefreshQuotaResponse.setPreloadRemain(context.stringValue("DescribeVodRefreshQuotaResponse.PreloadRemain"));
		describeVodRefreshQuotaResponse.setBlockRemain(context.stringValue("DescribeVodRefreshQuotaResponse.blockRemain"));
	 
	 	return describeVodRefreshQuotaResponse;
	}
}