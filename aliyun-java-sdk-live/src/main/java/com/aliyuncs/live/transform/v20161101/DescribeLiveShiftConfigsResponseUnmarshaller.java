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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveShiftConfigsResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveShiftConfigsResponse.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveShiftConfigsResponseUnmarshaller {

	public static DescribeLiveShiftConfigsResponse unmarshall(DescribeLiveShiftConfigsResponse describeLiveShiftConfigsResponse, UnmarshallerContext _ctx) {
		
		describeLiveShiftConfigsResponse.setRequestId(_ctx.stringValue("DescribeLiveShiftConfigsResponse.RequestId"));

		List<Config> content = new ArrayList<Config>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveShiftConfigsResponse.Content.Length"); i++) {
			Config config = new Config();
			config.setDomainName(_ctx.stringValue("DescribeLiveShiftConfigsResponse.Content["+ i +"].DomainName"));
			config.setAppName(_ctx.stringValue("DescribeLiveShiftConfigsResponse.Content["+ i +"].AppName"));
			config.setStreamName(_ctx.stringValue("DescribeLiveShiftConfigsResponse.Content["+ i +"].StreamName"));
			config.setVision(_ctx.integerValue("DescribeLiveShiftConfigsResponse.Content["+ i +"].Vision"));

			content.add(config);
		}
		describeLiveShiftConfigsResponse.setContent(content);
	 
	 	return describeLiveShiftConfigsResponse;
	}
}