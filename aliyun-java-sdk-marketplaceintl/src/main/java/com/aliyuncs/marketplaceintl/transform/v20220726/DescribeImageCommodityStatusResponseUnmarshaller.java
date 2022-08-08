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

package com.aliyuncs.marketplaceintl.transform.v20220726;

import com.aliyuncs.marketplaceintl.model.v20220726.DescribeImageCommodityStatusResponse;
import com.aliyuncs.marketplaceintl.model.v20220726.DescribeImageCommodityStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageCommodityStatusResponseUnmarshaller {

	public static DescribeImageCommodityStatusResponse unmarshall(DescribeImageCommodityStatusResponse describeImageCommodityStatusResponse, UnmarshallerContext _ctx) {
		
		describeImageCommodityStatusResponse.setRequestId(_ctx.stringValue("DescribeImageCommodityStatusResponse.RequestId"));
		describeImageCommodityStatusResponse.setErrorCode(_ctx.stringValue("DescribeImageCommodityStatusResponse.ErrorCode"));
		describeImageCommodityStatusResponse.setCode(_ctx.integerValue("DescribeImageCommodityStatusResponse.Code"));
		describeImageCommodityStatusResponse.setMsg(_ctx.stringValue("DescribeImageCommodityStatusResponse.Msg"));
		describeImageCommodityStatusResponse.setSuccess(_ctx.booleanValue("DescribeImageCommodityStatusResponse.Success"));

		Data data = new Data();
		data.setAuditStatus(_ctx.integerValue("DescribeImageCommodityStatusResponse.Data.AuditStatus"));
		data.setCommodityCode(_ctx.stringValue("DescribeImageCommodityStatusResponse.Data.CommodityCode"));
		data.setTrackId(_ctx.stringValue("DescribeImageCommodityStatusResponse.Data.TrackId"));
		describeImageCommodityStatusResponse.setData(data);
	 
	 	return describeImageCommodityStatusResponse;
	}
}