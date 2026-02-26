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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnsecServiceResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnsecServiceResponse.LockReason;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnsecServiceResponseUnmarshaller {

	public static DescribeDcdnsecServiceResponse unmarshall(DescribeDcdnsecServiceResponse describeDcdnsecServiceResponse, UnmarshallerContext _ctx) {
		
		describeDcdnsecServiceResponse.setRequestId(_ctx.stringValue("DescribeDcdnsecServiceResponse.RequestId"));
		describeDcdnsecServiceResponse.setEndTime(_ctx.stringValue("DescribeDcdnsecServiceResponse.EndTime"));
		describeDcdnsecServiceResponse.setStartTime(_ctx.stringValue("DescribeDcdnsecServiceResponse.StartTime"));
		describeDcdnsecServiceResponse.setChangingAffectTime(_ctx.stringValue("DescribeDcdnsecServiceResponse.ChangingAffectTime"));
		describeDcdnsecServiceResponse.setDomainNum(_ctx.stringValue("DescribeDcdnsecServiceResponse.DomainNum"));
		describeDcdnsecServiceResponse.setChangingChargeType(_ctx.stringValue("DescribeDcdnsecServiceResponse.ChangingChargeType"));
		describeDcdnsecServiceResponse.setVersion(_ctx.stringValue("DescribeDcdnsecServiceResponse.Version"));
		describeDcdnsecServiceResponse.setRequestType(_ctx.stringValue("DescribeDcdnsecServiceResponse.RequestType"));
		describeDcdnsecServiceResponse.setFlowType(_ctx.stringValue("DescribeDcdnsecServiceResponse.FlowType"));
		describeDcdnsecServiceResponse.setInternetChargeType(_ctx.stringValue("DescribeDcdnsecServiceResponse.InternetChargeType"));
		describeDcdnsecServiceResponse.setInstanceId(_ctx.stringValue("DescribeDcdnsecServiceResponse.InstanceId"));

		List<LockReason> operationLocks = new ArrayList<LockReason>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnsecServiceResponse.OperationLocks.Length"); i++) {
			LockReason lockReason = new LockReason();
			lockReason.setLockReason(_ctx.stringValue("DescribeDcdnsecServiceResponse.OperationLocks["+ i +"].LockReason"));

			operationLocks.add(lockReason);
		}
		describeDcdnsecServiceResponse.setOperationLocks(operationLocks);
	 
	 	return describeDcdnsecServiceResponse;
	}
}