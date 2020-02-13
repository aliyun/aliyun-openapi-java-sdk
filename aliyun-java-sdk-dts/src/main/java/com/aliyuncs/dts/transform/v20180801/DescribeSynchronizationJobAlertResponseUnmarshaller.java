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

package com.aliyuncs.dts.transform.v20180801;

import com.aliyuncs.dts.model.v20180801.DescribeSynchronizationJobAlertResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSynchronizationJobAlertResponseUnmarshaller {

	public static DescribeSynchronizationJobAlertResponse unmarshall(DescribeSynchronizationJobAlertResponse describeSynchronizationJobAlertResponse, UnmarshallerContext _ctx) {
		
		describeSynchronizationJobAlertResponse.setRequestId(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.RequestId"));
		describeSynchronizationJobAlertResponse.setSynchronizationJobId(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.SynchronizationJobId"));
		describeSynchronizationJobAlertResponse.setSynchronizationJobName(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.SynchronizationJobName"));
		describeSynchronizationJobAlertResponse.setSynchronizationDirection(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.SynchronizationDirection"));
		describeSynchronizationJobAlertResponse.setDelayAlertStatus(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.DelayAlertStatus"));
		describeSynchronizationJobAlertResponse.setDelayAlertPhone(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.DelayAlertPhone"));
		describeSynchronizationJobAlertResponse.setDelayOverSeconds(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.DelayOverSeconds"));
		describeSynchronizationJobAlertResponse.setErrorAlertStatus(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.ErrorAlertStatus"));
		describeSynchronizationJobAlertResponse.setErrorAlertPhone(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.ErrorAlertPhone"));
		describeSynchronizationJobAlertResponse.setSuccess(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.Success"));
		describeSynchronizationJobAlertResponse.setErrCode(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.ErrCode"));
		describeSynchronizationJobAlertResponse.setErrMessage(_ctx.stringValue("DescribeSynchronizationJobAlertResponse.ErrMessage"));
	 
	 	return describeSynchronizationJobAlertResponse;
	}
}