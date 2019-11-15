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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnIpaServiceResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnIpaServiceResponse.LockReason;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnIpaServiceResponseUnmarshaller {

	public static DescribeDcdnIpaServiceResponse unmarshall(DescribeDcdnIpaServiceResponse describeDcdnIpaServiceResponse, UnmarshallerContext _ctx) {
		
		describeDcdnIpaServiceResponse.setRequestId(_ctx.stringValue("DescribeDcdnIpaServiceResponse.RequestId"));
		describeDcdnIpaServiceResponse.setInstanceId(_ctx.stringValue("DescribeDcdnIpaServiceResponse.InstanceId"));
		describeDcdnIpaServiceResponse.setInternetChargeType(_ctx.stringValue("DescribeDcdnIpaServiceResponse.InternetChargeType"));
		describeDcdnIpaServiceResponse.setOpeningTime(_ctx.stringValue("DescribeDcdnIpaServiceResponse.OpeningTime"));
		describeDcdnIpaServiceResponse.setChangingChargeType(_ctx.stringValue("DescribeDcdnIpaServiceResponse.ChangingChargeType"));
		describeDcdnIpaServiceResponse.setChangingAffectTime(_ctx.stringValue("DescribeDcdnIpaServiceResponse.ChangingAffectTime"));

		List<LockReason> operationLocks = new ArrayList<LockReason>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnIpaServiceResponse.OperationLocks.Length"); i++) {
			LockReason lockReason = new LockReason();
			lockReason.setLockReason(_ctx.stringValue("DescribeDcdnIpaServiceResponse.OperationLocks["+ i +"].LockReason"));

			operationLocks.add(lockReason);
		}
		describeDcdnIpaServiceResponse.setOperationLocks(operationLocks);
	 
	 	return describeDcdnIpaServiceResponse;
	}
}