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

import com.aliyuncs.live.model.v20161101.DescribeLiveAsrConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveAsrConfigResponse.LiveAsrConfigList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveAsrConfigResponseUnmarshaller {

	public static DescribeLiveAsrConfigResponse unmarshall(DescribeLiveAsrConfigResponse describeLiveAsrConfigResponse, UnmarshallerContext _ctx) {
		
		describeLiveAsrConfigResponse.setRequestId(_ctx.stringValue("DescribeLiveAsrConfigResponse.RequestId"));

		List<LiveAsrConfigList> liveAsrConfig = new ArrayList<LiveAsrConfigList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveAsrConfigResponse.LiveAsrConfig.Length"); i++) {
			LiveAsrConfigList liveAsrConfigList = new LiveAsrConfigList();
			liveAsrConfigList.setDomainName(_ctx.integerValue("DescribeLiveAsrConfigResponse.LiveAsrConfig["+ i +"].DomainName"));
			liveAsrConfigList.setAppName(_ctx.stringValue("DescribeLiveAsrConfigResponse.LiveAsrConfig["+ i +"].AppName"));
			liveAsrConfigList.setStreamName(_ctx.stringValue("DescribeLiveAsrConfigResponse.LiveAsrConfig["+ i +"].StreamName"));
			liveAsrConfigList.setPeriod(_ctx.integerValue("DescribeLiveAsrConfigResponse.LiveAsrConfig["+ i +"].Period"));
			liveAsrConfigList.setMnsTopic(_ctx.stringValue("DescribeLiveAsrConfigResponse.LiveAsrConfig["+ i +"].MnsTopic"));
			liveAsrConfigList.setMnsRegion(_ctx.stringValue("DescribeLiveAsrConfigResponse.LiveAsrConfig["+ i +"].MnsRegion"));
			liveAsrConfigList.setHttpCallbackURL(_ctx.stringValue("DescribeLiveAsrConfigResponse.LiveAsrConfig["+ i +"].HttpCallbackURL"));

			liveAsrConfig.add(liveAsrConfigList);
		}
		describeLiveAsrConfigResponse.setLiveAsrConfig(liveAsrConfig);
	 
	 	return describeLiveAsrConfigResponse;
	}
}