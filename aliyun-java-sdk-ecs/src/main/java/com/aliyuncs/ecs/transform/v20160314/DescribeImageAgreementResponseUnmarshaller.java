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

package com.aliyuncs.ecs.transform.v20160314;

import com.aliyuncs.ecs.model.v20160314.DescribeImageAgreementResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageAgreementResponseUnmarshaller {

	public static DescribeImageAgreementResponse unmarshall(DescribeImageAgreementResponse describeImageAgreementResponse, UnmarshallerContext _ctx) {
		
		describeImageAgreementResponse.setRequestId(_ctx.stringValue("DescribeImageAgreementResponse.RequestId"));
		describeImageAgreementResponse.setStatus(_ctx.stringValue("DescribeImageAgreementResponse.Status"));
	 
	 	return describeImageAgreementResponse;
	}
}