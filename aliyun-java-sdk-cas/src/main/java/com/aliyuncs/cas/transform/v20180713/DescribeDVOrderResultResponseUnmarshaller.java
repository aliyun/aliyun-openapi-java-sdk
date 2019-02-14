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

	public static DescribeDVOrderResultResponse unmarshall(DescribeDVOrderResultResponse describeDVOrderResultResponse, UnmarshallerContext context) {
		
		describeDVOrderResultResponse.setRequestId(context.stringValue("DescribeDVOrderResultResponse.RequestId"));
		describeDVOrderResultResponse.setOrderStatus(context.stringValue("DescribeDVOrderResultResponse.OrderStatus"));
		describeDVOrderResultResponse.setCertificate(context.stringValue("DescribeDVOrderResultResponse.Certificate"));
		describeDVOrderResultResponse.setPrivateKey(context.stringValue("DescribeDVOrderResultResponse.PrivateKey"));
		describeDVOrderResultResponse.setCheckName(context.stringValue("DescribeDVOrderResultResponse.CheckName"));
		describeDVOrderResultResponse.setCheckValue(context.stringValue("DescribeDVOrderResultResponse.CheckValue"));
		describeDVOrderResultResponse.setCheckType(context.stringValue("DescribeDVOrderResultResponse.CheckType"));
	 
	 	return describeDVOrderResultResponse;
	}
}