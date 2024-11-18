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

package com.aliyuncs.polardb.transform.v20170801;

import com.aliyuncs.polardb.model.v20170801.DescribeActivationCodeDetailsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeActivationCodeDetailsResponseUnmarshaller {

	public static DescribeActivationCodeDetailsResponse unmarshall(DescribeActivationCodeDetailsResponse describeActivationCodeDetailsResponse, UnmarshallerContext _ctx) {
		
		describeActivationCodeDetailsResponse.setRequestId(_ctx.stringValue("DescribeActivationCodeDetailsResponse.RequestId"));
		describeActivationCodeDetailsResponse.setActivateAt(_ctx.stringValue("DescribeActivationCodeDetailsResponse.ActivateAt"));
		describeActivationCodeDetailsResponse.setCertContentB64(_ctx.stringValue("DescribeActivationCodeDetailsResponse.CertContentB64"));
		describeActivationCodeDetailsResponse.setDescription(_ctx.stringValue("DescribeActivationCodeDetailsResponse.Description"));
		describeActivationCodeDetailsResponse.setExpireAt(_ctx.stringValue("DescribeActivationCodeDetailsResponse.ExpireAt"));
		describeActivationCodeDetailsResponse.setGmtCreated(_ctx.stringValue("DescribeActivationCodeDetailsResponse.GmtCreated"));
		describeActivationCodeDetailsResponse.setGmtModified(_ctx.stringValue("DescribeActivationCodeDetailsResponse.GmtModified"));
		describeActivationCodeDetailsResponse.setId(_ctx.integerValue("DescribeActivationCodeDetailsResponse.Id"));
		describeActivationCodeDetailsResponse.setMacAddress(_ctx.stringValue("DescribeActivationCodeDetailsResponse.MacAddress"));
		describeActivationCodeDetailsResponse.setName(_ctx.stringValue("DescribeActivationCodeDetailsResponse.Name"));
		describeActivationCodeDetailsResponse.setSystemIdentifier(_ctx.stringValue("DescribeActivationCodeDetailsResponse.SystemIdentifier"));
	 
	 	return describeActivationCodeDetailsResponse;
	}
}