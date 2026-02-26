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

import com.aliyuncs.live.model.v20161101.DescribeLivePrivateLineAvailGAResponse;
import com.aliyuncs.live.model.v20161101.DescribeLivePrivateLineAvailGAResponse.LivePrivateLineAvailGA;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLivePrivateLineAvailGAResponseUnmarshaller {

	public static DescribeLivePrivateLineAvailGAResponse unmarshall(DescribeLivePrivateLineAvailGAResponse describeLivePrivateLineAvailGAResponse, UnmarshallerContext _ctx) {
		
		describeLivePrivateLineAvailGAResponse.setRequestId(_ctx.stringValue("DescribeLivePrivateLineAvailGAResponse.RequestId"));

		List<LivePrivateLineAvailGA> livePrivateLineAvailGAs = new ArrayList<LivePrivateLineAvailGA>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLivePrivateLineAvailGAResponse.LivePrivateLineAvailGAs.Length"); i++) {
			LivePrivateLineAvailGA livePrivateLineAvailGA = new LivePrivateLineAvailGA();
			livePrivateLineAvailGA.setAccelerationArea(_ctx.stringValue("DescribeLivePrivateLineAvailGAResponse.LivePrivateLineAvailGAs["+ i +"].AccelerationArea"));
			livePrivateLineAvailGA.setAccelerationType(_ctx.stringValue("DescribeLivePrivateLineAvailGAResponse.LivePrivateLineAvailGAs["+ i +"].AccelerationType"));
			livePrivateLineAvailGA.setAppName(_ctx.stringValue("DescribeLivePrivateLineAvailGAResponse.LivePrivateLineAvailGAs["+ i +"].AppName"));
			livePrivateLineAvailGA.setBindingStatus(_ctx.stringValue("DescribeLivePrivateLineAvailGAResponse.LivePrivateLineAvailGAs["+ i +"].BindingStatus"));
			livePrivateLineAvailGA.setDomainName(_ctx.stringValue("DescribeLivePrivateLineAvailGAResponse.LivePrivateLineAvailGAs["+ i +"].DomainName"));
			livePrivateLineAvailGA.setIP(_ctx.stringValue("DescribeLivePrivateLineAvailGAResponse.LivePrivateLineAvailGAs["+ i +"].IP"));
			livePrivateLineAvailGA.setInstanceId(_ctx.stringValue("DescribeLivePrivateLineAvailGAResponse.LivePrivateLineAvailGAs["+ i +"].InstanceId"));
			livePrivateLineAvailGA.setStatus(_ctx.stringValue("DescribeLivePrivateLineAvailGAResponse.LivePrivateLineAvailGAs["+ i +"].Status"));
			livePrivateLineAvailGA.setStreamName(_ctx.stringValue("DescribeLivePrivateLineAvailGAResponse.LivePrivateLineAvailGAs["+ i +"].StreamName"));
			livePrivateLineAvailGA.setUid(_ctx.stringValue("DescribeLivePrivateLineAvailGAResponse.LivePrivateLineAvailGAs["+ i +"].Uid"));
			livePrivateLineAvailGA.setVideoCenter(_ctx.stringValue("DescribeLivePrivateLineAvailGAResponse.LivePrivateLineAvailGAs["+ i +"].VideoCenter"));

			livePrivateLineAvailGAs.add(livePrivateLineAvailGA);
		}
		describeLivePrivateLineAvailGAResponse.setLivePrivateLineAvailGAs(livePrivateLineAvailGAs);
	 
	 	return describeLivePrivateLineAvailGAResponse;
	}
}