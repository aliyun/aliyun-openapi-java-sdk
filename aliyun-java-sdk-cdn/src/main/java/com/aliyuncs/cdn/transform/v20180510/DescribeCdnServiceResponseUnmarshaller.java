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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeCdnServiceResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnServiceResponse.LockReason;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnServiceResponseUnmarshaller {

	public static DescribeCdnServiceResponse unmarshall(DescribeCdnServiceResponse describeCdnServiceResponse, UnmarshallerContext context) {
		
		describeCdnServiceResponse.setRequestId(context.stringValue("DescribeCdnServiceResponse.RequestId"));
		describeCdnServiceResponse.setInstanceId(context.stringValue("DescribeCdnServiceResponse.InstanceId"));
		describeCdnServiceResponse.setInternetChargeType(context.stringValue("DescribeCdnServiceResponse.InternetChargeType"));
		describeCdnServiceResponse.setOpeningTime(context.stringValue("DescribeCdnServiceResponse.OpeningTime"));
		describeCdnServiceResponse.setChangingChargeType(context.stringValue("DescribeCdnServiceResponse.ChangingChargeType"));
		describeCdnServiceResponse.setChangingAffectTime(context.stringValue("DescribeCdnServiceResponse.ChangingAffectTime"));

		List<LockReason> operationLocks = new ArrayList<LockReason>();
		for (int i = 0; i < context.lengthValue("DescribeCdnServiceResponse.OperationLocks.Length"); i++) {
			LockReason lockReason = new LockReason();
			lockReason.setLockReason(context.stringValue("DescribeCdnServiceResponse.OperationLocks["+ i +"].LockReason"));

			operationLocks.add(lockReason);
		}
		describeCdnServiceResponse.setOperationLocks(operationLocks);
	 
	 	return describeCdnServiceResponse;
	}
}