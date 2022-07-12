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

package com.aliyuncs.antiddos_public.transform.v20170518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.antiddos_public.model.v20170518.DescribeDdosThresholdResponse;
import com.aliyuncs.antiddos_public.model.v20170518.DescribeDdosThresholdResponse.Threshold;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDdosThresholdResponseUnmarshaller {

	public static DescribeDdosThresholdResponse unmarshall(DescribeDdosThresholdResponse describeDdosThresholdResponse, UnmarshallerContext _ctx) {
		
		describeDdosThresholdResponse.setRequestId(_ctx.stringValue("DescribeDdosThresholdResponse.RequestId"));

		List<Threshold> thresholds = new ArrayList<Threshold>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDdosThresholdResponse.Thresholds.Length"); i++) {
			Threshold threshold = new Threshold();
			threshold.setDdosType(_ctx.stringValue("DescribeDdosThresholdResponse.Thresholds["+ i +"].DdosType"));
			threshold.setIsAuto(_ctx.booleanValue("DescribeDdosThresholdResponse.Thresholds["+ i +"].IsAuto"));
			threshold.setMaxBps(_ctx.integerValue("DescribeDdosThresholdResponse.Thresholds["+ i +"].MaxBps"));
			threshold.setElasticBps(_ctx.integerValue("DescribeDdosThresholdResponse.Thresholds["+ i +"].ElasticBps"));
			threshold.setInstanceId(_ctx.stringValue("DescribeDdosThresholdResponse.Thresholds["+ i +"].InstanceId"));
			threshold.setBps(_ctx.integerValue("DescribeDdosThresholdResponse.Thresholds["+ i +"].Bps"));
			threshold.setPps(_ctx.integerValue("DescribeDdosThresholdResponse.Thresholds["+ i +"].Pps"));
			threshold.setMaxPps(_ctx.integerValue("DescribeDdosThresholdResponse.Thresholds["+ i +"].MaxPps"));
			threshold.setInternetIp(_ctx.stringValue("DescribeDdosThresholdResponse.Thresholds["+ i +"].InternetIp"));

			thresholds.add(threshold);
		}
		describeDdosThresholdResponse.setThresholds(thresholds);
	 
	 	return describeDdosThresholdResponse;
	}
}