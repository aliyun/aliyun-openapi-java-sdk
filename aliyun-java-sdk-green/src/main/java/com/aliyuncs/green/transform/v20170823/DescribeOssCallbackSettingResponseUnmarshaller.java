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

	public static DescribeOssCallbackSettingResponse unmarshall(DescribeOssCallbackSettingResponse describeOssCallbackSettingResponse, UnmarshallerContext context) {
		
		describeOssCallbackSettingResponse.setRequestId(context.stringValue("DescribeOssCallbackSettingResponse.RequestId"));
		describeOssCallbackSettingResponse.setCallbackUrl(context.stringValue("DescribeOssCallbackSettingResponse.CallbackUrl"));
		describeOssCallbackSettingResponse.setScanCallback(context.booleanValue("DescribeOssCallbackSettingResponse.ScanCallback"));
		describeOssCallbackSettingResponse.setAuditCallback(context.booleanValue("DescribeOssCallbackSettingResponse.AuditCallback"));
		describeOssCallbackSettingResponse.setCallbackSeed(context.stringValue("DescribeOssCallbackSettingResponse.CallbackSeed"));

		List<String> scanCallbackSuggestions = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeOssCallbackSettingResponse.ScanCallbackSuggestions.Length"); i++) {
			scanCallbackSuggestions.add(context.stringValue("DescribeOssCallbackSettingResponse.ScanCallbackSuggestions["+ i +"]"));
		}
		describeOssCallbackSettingResponse.setScanCallbackSuggestions(scanCallbackSuggestions);

		List<String> serviceModules = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeOssCallbackSettingResponse.ServiceModules.Length"); i++) {
			serviceModules.add(context.stringValue("DescribeOssCallbackSettingResponse.ServiceModules["+ i +"]"));
		}
		describeOssCallbackSettingResponse.setServiceModules(serviceModules);
	 
	 	return describeOssCallbackSettingResponse;
	}
}