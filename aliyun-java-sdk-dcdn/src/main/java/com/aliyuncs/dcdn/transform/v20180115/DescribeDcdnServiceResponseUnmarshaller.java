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

	public static DescribeDcdnServiceResponse unmarshall(DescribeDcdnServiceResponse describeDcdnServiceResponse, UnmarshallerContext _ctx) {
		
		describeDcdnServiceResponse.setRequestId(_ctx.stringValue("DescribeDcdnServiceResponse.RequestId"));
		describeDcdnServiceResponse.setWebsocketChangingTime(_ctx.stringValue("DescribeDcdnServiceResponse.WebsocketChangingTime"));
		describeDcdnServiceResponse.setWebsocketChangingType(_ctx.stringValue("DescribeDcdnServiceResponse.WebsocketChangingType"));
		describeDcdnServiceResponse.setChangingAffectTime(_ctx.stringValue("DescribeDcdnServiceResponse.ChangingAffectTime"));
		describeDcdnServiceResponse.setChangingChargeType(_ctx.stringValue("DescribeDcdnServiceResponse.ChangingChargeType"));
		describeDcdnServiceResponse.setOpeningTime(_ctx.stringValue("DescribeDcdnServiceResponse.OpeningTime"));
		describeDcdnServiceResponse.setInternetChargeType(_ctx.stringValue("DescribeDcdnServiceResponse.InternetChargeType"));
		describeDcdnServiceResponse.setWebsocketType(_ctx.stringValue("DescribeDcdnServiceResponse.WebsocketType"));
		describeDcdnServiceResponse.setInstanceId(_ctx.stringValue("DescribeDcdnServiceResponse.InstanceId"));

		List<LockReason> operationLocks = new ArrayList<LockReason>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnServiceResponse.OperationLocks.Length"); i++) {
			LockReason lockReason = new LockReason();
			lockReason.setLockReason(_ctx.stringValue("DescribeDcdnServiceResponse.OperationLocks["+ i +"].LockReason"));

			operationLocks.add(lockReason);
		}
		describeDcdnServiceResponse.setOperationLocks(operationLocks);
	 
	 	return describeDcdnServiceResponse;
	}
}