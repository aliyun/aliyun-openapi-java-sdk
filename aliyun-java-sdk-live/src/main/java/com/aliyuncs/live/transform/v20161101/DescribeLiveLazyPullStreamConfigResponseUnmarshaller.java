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

import com.aliyuncs.live.model.v20161101.DescribeLiveLazyPullStreamConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveLazyPullStreamConfigResponse.LiveLazyPullConfig;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveLazyPullStreamConfigResponseUnmarshaller {

	public static DescribeLiveLazyPullStreamConfigResponse unmarshall(DescribeLiveLazyPullStreamConfigResponse describeLiveLazyPullStreamConfigResponse, UnmarshallerContext context) {
		
		describeLiveLazyPullStreamConfigResponse.setRequestId(context.stringValue("DescribeLiveLazyPullStreamConfigResponse.RequestId"));

		List<LiveLazyPullConfig> liveLazyPullConfigList = new ArrayList<LiveLazyPullConfig>();
		for (int i = 0; i < context.lengthValue("DescribeLiveLazyPullStreamConfigResponse.LiveLazyPullConfigList.Length"); i++) {
			LiveLazyPullConfig liveLazyPullConfig = new LiveLazyPullConfig();
			liveLazyPullConfig.setDomainName(context.stringValue("DescribeLiveLazyPullStreamConfigResponse.LiveLazyPullConfigList["+ i +"].DomainName"));
			liveLazyPullConfig.setAppName(context.stringValue("DescribeLiveLazyPullStreamConfigResponse.LiveLazyPullConfigList["+ i +"].AppName"));
			liveLazyPullConfig.setPullDomainName(context.stringValue("DescribeLiveLazyPullStreamConfigResponse.LiveLazyPullConfigList["+ i +"].PullDomainName"));
			liveLazyPullConfig.setPullAppName(context.stringValue("DescribeLiveLazyPullStreamConfigResponse.LiveLazyPullConfigList["+ i +"].PullAppName"));
			liveLazyPullConfig.setPullProtocol(context.stringValue("DescribeLiveLazyPullStreamConfigResponse.LiveLazyPullConfigList["+ i +"].PullProtocol"));
			liveLazyPullConfig.setPullAuthType(context.stringValue("DescribeLiveLazyPullStreamConfigResponse.LiveLazyPullConfigList["+ i +"].PullAuthType"));
			liveLazyPullConfig.setPullAuthKey(context.stringValue("DescribeLiveLazyPullStreamConfigResponse.LiveLazyPullConfigList["+ i +"].PullAuthKey"));

			liveLazyPullConfigList.add(liveLazyPullConfig);
		}
		describeLiveLazyPullStreamConfigResponse.setLiveLazyPullConfigList(liveLazyPullConfigList);
	 
	 	return describeLiveLazyPullStreamConfigResponse;
	}
}