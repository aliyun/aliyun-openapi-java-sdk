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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.DescribeOssCallbackSettingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssCallbackSettingResponseUnmarshaller {

	public static DescribeOssCallbackSettingResponse unmarshall(DescribeOssCallbackSettingResponse describeOssCallbackSettingResponse, UnmarshallerContext _ctx) {
		
		describeOssCallbackSettingResponse.setRequestId(_ctx.stringValue("DescribeOssCallbackSettingResponse.RequestId"));
		describeOssCallbackSettingResponse.setCallbackUrl(_ctx.stringValue("DescribeOssCallbackSettingResponse.CallbackUrl"));
		describeOssCallbackSettingResponse.setScanCallback(_ctx.booleanValue("DescribeOssCallbackSettingResponse.ScanCallback"));
		describeOssCallbackSettingResponse.setAuditCallback(_ctx.booleanValue("DescribeOssCallbackSettingResponse.AuditCallback"));
		describeOssCallbackSettingResponse.setCallbackSeed(_ctx.stringValue("DescribeOssCallbackSettingResponse.CallbackSeed"));

		List<String> scanCallbackSuggestions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssCallbackSettingResponse.ScanCallbackSuggestions.Length"); i++) {
			scanCallbackSuggestions.add(_ctx.stringValue("DescribeOssCallbackSettingResponse.ScanCallbackSuggestions["+ i +"]"));
		}
		describeOssCallbackSettingResponse.setScanCallbackSuggestions(scanCallbackSuggestions);

		List<String> serviceModules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssCallbackSettingResponse.ServiceModules.Length"); i++) {
			serviceModules.add(_ctx.stringValue("DescribeOssCallbackSettingResponse.ServiceModules["+ i +"]"));
		}
		describeOssCallbackSettingResponse.setServiceModules(serviceModules);
	 
	 	return describeOssCallbackSettingResponse;
	}
}