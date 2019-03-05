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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnServiceResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnServiceResponse.LockReason;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnServiceResponseUnmarshaller {

	public static DescribeDcdnServiceResponse unmarshall(DescribeDcdnServiceResponse describeDcdnServiceResponse, UnmarshallerContext context) {
		
		describeDcdnServiceResponse.setRequestId(context.stringValue("DescribeDcdnServiceResponse.RequestId"));
		describeDcdnServiceResponse.setInstanceId(context.stringValue("DescribeDcdnServiceResponse.InstanceId"));
		describeDcdnServiceResponse.setInternetChargeType(context.stringValue("DescribeDcdnServiceResponse.InternetChargeType"));
		describeDcdnServiceResponse.setOpeningTime(context.stringValue("DescribeDcdnServiceResponse.OpeningTime"));
		describeDcdnServiceResponse.setChangingChargeType(context.stringValue("DescribeDcdnServiceResponse.ChangingChargeType"));
		describeDcdnServiceResponse.setChangingAffectTime(context.stringValue("DescribeDcdnServiceResponse.ChangingAffectTime"));
		describeDcdnServiceResponse.setWebsocketChangingType(context.stringValue("DescribeDcdnServiceResponse.WebsocketChangingType"));
		describeDcdnServiceResponse.setWebsocketType(context.stringValue("DescribeDcdnServiceResponse.WebsocketType"));
		describeDcdnServiceResponse.setWebsocketChangingTime(context.stringValue("DescribeDcdnServiceResponse.WebsocketChangingTime"));

		List<LockReason> operationLocks = new ArrayList<LockReason>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnServiceResponse.OperationLocks.Length"); i++) {
			LockReason lockReason = new LockReason();
			lockReason.setLockReason(context.stringValue("DescribeDcdnServiceResponse.OperationLocks["+ i +"].LockReason"));

			operationLocks.add(lockReason);
		}
		describeDcdnServiceResponse.setOperationLocks(operationLocks);
	 
	 	return describeDcdnServiceResponse;
	}
}