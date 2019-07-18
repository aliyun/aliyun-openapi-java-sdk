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

	public static DescribeVodRefreshQuotaResponse unmarshall(DescribeVodRefreshQuotaResponse describeVodRefreshQuotaResponse, UnmarshallerContext _ctx) {
		
		describeVodRefreshQuotaResponse.setRequestId(_ctx.stringValue("DescribeVodRefreshQuotaResponse.RequestId"));
		describeVodRefreshQuotaResponse.setUrlQuota(_ctx.stringValue("DescribeVodRefreshQuotaResponse.UrlQuota"));
		describeVodRefreshQuotaResponse.setDirQuota(_ctx.stringValue("DescribeVodRefreshQuotaResponse.DirQuota"));
		describeVodRefreshQuotaResponse.setUrlRemain(_ctx.stringValue("DescribeVodRefreshQuotaResponse.UrlRemain"));
		describeVodRefreshQuotaResponse.setDirRemain(_ctx.stringValue("DescribeVodRefreshQuotaResponse.DirRemain"));
		describeVodRefreshQuotaResponse.setPreloadQuota(_ctx.stringValue("DescribeVodRefreshQuotaResponse.PreloadQuota"));
		describeVodRefreshQuotaResponse.setBlockQuota(_ctx.stringValue("DescribeVodRefreshQuotaResponse.BlockQuota"));
		describeVodRefreshQuotaResponse.setPreloadRemain(_ctx.stringValue("DescribeVodRefreshQuotaResponse.PreloadRemain"));
		describeVodRefreshQuotaResponse.setBlockRemain(_ctx.stringValue("DescribeVodRefreshQuotaResponse.blockRemain"));
	 
	 	return describeVodRefreshQuotaResponse;
	}
}