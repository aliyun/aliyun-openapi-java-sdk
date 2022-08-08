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

import com.aliyuncs.marketplaceintl.model.v20220726.SubmitImageCommodityReviewResponse;
import com.aliyuncs.marketplaceintl.model.v20220726.SubmitImageCommodityReviewResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitImageCommodityReviewResponseUnmarshaller {

	public static SubmitImageCommodityReviewResponse unmarshall(SubmitImageCommodityReviewResponse submitImageCommodityReviewResponse, UnmarshallerContext _ctx) {
		
		submitImageCommodityReviewResponse.setRequestId(_ctx.stringValue("SubmitImageCommodityReviewResponse.RequestId"));
		submitImageCommodityReviewResponse.setErrorCode(_ctx.stringValue("SubmitImageCommodityReviewResponse.ErrorCode"));
		submitImageCommodityReviewResponse.setCode(_ctx.integerValue("SubmitImageCommodityReviewResponse.Code"));
		submitImageCommodityReviewResponse.setMsg(_ctx.stringValue("SubmitImageCommodityReviewResponse.Msg"));
		submitImageCommodityReviewResponse.setSuccess(_ctx.booleanValue("SubmitImageCommodityReviewResponse.Success"));

		Data data = new Data();
		data.setCommodityCode(_ctx.stringValue("SubmitImageCommodityReviewResponse.Data.CommodityCode"));
		data.setTrackId(_ctx.stringValue("SubmitImageCommodityReviewResponse.Data.TrackId"));
		submitImageCommodityReviewResponse.setData(data);
	 
	 	return submitImageCommodityReviewResponse;
	}
}