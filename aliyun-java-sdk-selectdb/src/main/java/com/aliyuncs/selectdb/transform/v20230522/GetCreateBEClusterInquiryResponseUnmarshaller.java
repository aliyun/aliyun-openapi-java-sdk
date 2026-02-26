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

package com.aliyuncs.selectdb.transform.v20230522;

import com.aliyuncs.selectdb.model.v20230522.GetCreateBEClusterInquiryResponse;
import com.aliyuncs.selectdb.model.v20230522.GetCreateBEClusterInquiryResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCreateBEClusterInquiryResponseUnmarshaller {

	public static GetCreateBEClusterInquiryResponse unmarshall(GetCreateBEClusterInquiryResponse getCreateBEClusterInquiryResponse, UnmarshallerContext _ctx) {
		
		getCreateBEClusterInquiryResponse.setRequestId(_ctx.stringValue("GetCreateBEClusterInquiryResponse.RequestId"));

		Data data = new Data();
		data.setCurrency(_ctx.stringValue("GetCreateBEClusterInquiryResponse.Data.Currency"));
		data.setTradeAmount(_ctx.stringValue("GetCreateBEClusterInquiryResponse.Data.TradeAmount"));
		getCreateBEClusterInquiryResponse.setData(data);
	 
	 	return getCreateBEClusterInquiryResponse;
	}
}