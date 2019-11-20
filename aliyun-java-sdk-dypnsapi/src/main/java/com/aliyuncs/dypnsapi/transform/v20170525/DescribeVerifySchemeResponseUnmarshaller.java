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

package com.aliyuncs.dypnsapi.transform.v20170525;

import com.aliyuncs.dypnsapi.model.v20170525.DescribeVerifySchemeResponse;
import com.aliyuncs.dypnsapi.model.v20170525.DescribeVerifySchemeResponse.SchemeQueryResultDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVerifySchemeResponseUnmarshaller {

	public static DescribeVerifySchemeResponse unmarshall(DescribeVerifySchemeResponse describeVerifySchemeResponse, UnmarshallerContext _ctx) {
		
		describeVerifySchemeResponse.setRequestId(_ctx.stringValue("DescribeVerifySchemeResponse.RequestId"));
		describeVerifySchemeResponse.setCode(_ctx.stringValue("DescribeVerifySchemeResponse.Code"));
		describeVerifySchemeResponse.setMessage(_ctx.stringValue("DescribeVerifySchemeResponse.Message"));

		SchemeQueryResultDTO schemeQueryResultDTO = new SchemeQueryResultDTO();
		schemeQueryResultDTO.setAppEncryptInfo(_ctx.stringValue("DescribeVerifySchemeResponse.SchemeQueryResultDTO.AppEncryptInfo"));
		describeVerifySchemeResponse.setSchemeQueryResultDTO(schemeQueryResultDTO);
	 
	 	return describeVerifySchemeResponse;
	}
}