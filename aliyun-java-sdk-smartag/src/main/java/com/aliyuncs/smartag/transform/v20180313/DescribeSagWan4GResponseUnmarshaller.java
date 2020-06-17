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

package com.aliyuncs.smartag.transform.v20180313;

import com.aliyuncs.smartag.model.v20180313.DescribeSagWan4GResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagWan4GResponseUnmarshaller {

	public static DescribeSagWan4GResponse unmarshall(DescribeSagWan4GResponse describeSagWan4GResponse, UnmarshallerContext _ctx) {
		
		describeSagWan4GResponse.setRequestId(_ctx.stringValue("DescribeSagWan4GResponse.RequestId"));
		describeSagWan4GResponse.setIp(_ctx.stringValue("DescribeSagWan4GResponse.Ip"));
		describeSagWan4GResponse.setMac(_ctx.stringValue("DescribeSagWan4GResponse.Mac"));
		describeSagWan4GResponse.setStatus(_ctx.stringValue("DescribeSagWan4GResponse.Status"));
		describeSagWan4GResponse.setStrength(_ctx.stringValue("DescribeSagWan4GResponse.Strength"));
	 
	 	return describeSagWan4GResponse;
	}
}