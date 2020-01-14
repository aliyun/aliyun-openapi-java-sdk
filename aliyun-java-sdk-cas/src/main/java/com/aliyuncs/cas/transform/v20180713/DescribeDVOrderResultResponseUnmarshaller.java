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

package com.aliyuncs.cas.transform.v20180713;

import com.aliyuncs.cas.model.v20180713.DescribeDVOrderResultResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDVOrderResultResponseUnmarshaller {

	public static DescribeDVOrderResultResponse unmarshall(DescribeDVOrderResultResponse describeDVOrderResultResponse, UnmarshallerContext _ctx) {
		
		describeDVOrderResultResponse.setRequestId(_ctx.stringValue("DescribeDVOrderResultResponse.RequestId"));
		describeDVOrderResultResponse.setOrderStatus(_ctx.stringValue("DescribeDVOrderResultResponse.OrderStatus"));
		describeDVOrderResultResponse.setCertificate(_ctx.stringValue("DescribeDVOrderResultResponse.Certificate"));
		describeDVOrderResultResponse.setPrivateKey(_ctx.stringValue("DescribeDVOrderResultResponse.PrivateKey"));
		describeDVOrderResultResponse.setCheckName(_ctx.stringValue("DescribeDVOrderResultResponse.CheckName"));
		describeDVOrderResultResponse.setCheckValue(_ctx.stringValue("DescribeDVOrderResultResponse.CheckValue"));
		describeDVOrderResultResponse.setCheckType(_ctx.stringValue("DescribeDVOrderResultResponse.CheckType"));
	 
	 	return describeDVOrderResultResponse;
	}
}