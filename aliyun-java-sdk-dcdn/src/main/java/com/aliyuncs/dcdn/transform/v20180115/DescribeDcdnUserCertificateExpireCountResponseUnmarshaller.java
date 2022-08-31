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

package com.aliyuncs.dcdn.transform.v20180115;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserCertificateExpireCountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnUserCertificateExpireCountResponseUnmarshaller {

	public static DescribeDcdnUserCertificateExpireCountResponse unmarshall(DescribeDcdnUserCertificateExpireCountResponse describeDcdnUserCertificateExpireCountResponse, UnmarshallerContext _ctx) {
		
		describeDcdnUserCertificateExpireCountResponse.setRequestId(_ctx.stringValue("DescribeDcdnUserCertificateExpireCountResponse.RequestId"));
		describeDcdnUserCertificateExpireCountResponse.setExpireWithin30DaysCount(_ctx.integerValue("DescribeDcdnUserCertificateExpireCountResponse.ExpireWithin30DaysCount"));
		describeDcdnUserCertificateExpireCountResponse.setExpiredCount(_ctx.integerValue("DescribeDcdnUserCertificateExpireCountResponse.ExpiredCount"));
	 
	 	return describeDcdnUserCertificateExpireCountResponse;
	}
}