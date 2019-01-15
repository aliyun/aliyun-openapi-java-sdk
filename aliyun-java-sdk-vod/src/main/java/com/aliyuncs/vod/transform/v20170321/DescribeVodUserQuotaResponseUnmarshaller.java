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

import com.aliyuncs.vod.model.v20170321.DescribeVodUserQuotaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodUserQuotaResponseUnmarshaller {

	public static DescribeVodUserQuotaResponse unmarshall(DescribeVodUserQuotaResponse describeVodUserQuotaResponse, UnmarshallerContext context) {
		
		describeVodUserQuotaResponse.setRequestId(context.stringValue("DescribeVodUserQuotaResponse.RequestId"));
		describeVodUserQuotaResponse.setDomainQuota(context.integerValue("DescribeVodUserQuotaResponse.DomainQuota"));
		describeVodUserQuotaResponse.setRefreshUrlQuota(context.integerValue("DescribeVodUserQuotaResponse.RefreshUrlQuota"));
		describeVodUserQuotaResponse.setRefreshDirQuota(context.integerValue("DescribeVodUserQuotaResponse.RefreshDirQuota"));
		describeVodUserQuotaResponse.setRefreshUrlRemain(context.integerValue("DescribeVodUserQuotaResponse.RefreshUrlRemain"));
		describeVodUserQuotaResponse.setRefreshDirRemain(context.integerValue("DescribeVodUserQuotaResponse.RefreshDirRemain"));
		describeVodUserQuotaResponse.setPreloadQuota(context.integerValue("DescribeVodUserQuotaResponse.PreloadQuota"));
		describeVodUserQuotaResponse.setPreloadRemain(context.integerValue("DescribeVodUserQuotaResponse.PreloadRemain"));
		describeVodUserQuotaResponse.setBlockQuota(context.integerValue("DescribeVodUserQuotaResponse.BlockQuota"));
		describeVodUserQuotaResponse.setBlockRemain(context.integerValue("DescribeVodUserQuotaResponse.BlockRemain"));
	 
	 	return describeVodUserQuotaResponse;
	}
}