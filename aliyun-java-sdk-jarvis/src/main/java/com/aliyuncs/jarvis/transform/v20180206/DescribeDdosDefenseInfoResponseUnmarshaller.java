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

package com.aliyuncs.jarvis.transform.v20180206;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.jarvis.model.v20180206.DescribeDdosDefenseInfoResponse;
import com.aliyuncs.jarvis.model.v20180206.DescribeDdosDefenseInfoResponse.DdosDefenseThresholdItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDdosDefenseInfoResponseUnmarshaller {

	public static DescribeDdosDefenseInfoResponse unmarshall(DescribeDdosDefenseInfoResponse describeDdosDefenseInfoResponse, UnmarshallerContext context) {
		
		describeDdosDefenseInfoResponse.setRequestId(context.stringValue("DescribeDdosDefenseInfoResponse.RequestId"));
		describeDdosDefenseInfoResponse.setModule(context.stringValue("DescribeDdosDefenseInfoResponse.Module"));
		describeDdosDefenseInfoResponse.setBlackTimes(context.integerValue("DescribeDdosDefenseInfoResponse.BlackTimes"));
		describeDdosDefenseInfoResponse.setDuration(context.integerValue("DescribeDdosDefenseInfoResponse.Duration"));
		describeDdosDefenseInfoResponse.setBgpPkgState(context.stringValue("DescribeDdosDefenseInfoResponse.BgpPkgState"));

		List<DdosDefenseThresholdItem> ddosDefenseThreshold = new ArrayList<DdosDefenseThresholdItem>();
		for (int i = 0; i < context.lengthValue("DescribeDdosDefenseInfoResponse.DdosDefenseThreshold.Length"); i++) {
			DdosDefenseThresholdItem ddosDefenseThresholdItem = new DdosDefenseThresholdItem();
			ddosDefenseThresholdItem.setRegionId(context.stringValue("DescribeDdosDefenseInfoResponse.DdosDefenseThreshold["+ i +"].RegionId"));
			ddosDefenseThresholdItem.setCurrThreshold(context.integerValue("DescribeDdosDefenseInfoResponse.DdosDefenseThreshold["+ i +"].CurrThreshold"));
			ddosDefenseThresholdItem.setRecommendThreshold(context.integerValue("DescribeDdosDefenseInfoResponse.DdosDefenseThreshold["+ i +"].RecommendThreshold"));

			ddosDefenseThreshold.add(ddosDefenseThresholdItem);
		}
		describeDdosDefenseInfoResponse.setDdosDefenseThreshold(ddosDefenseThreshold);
	 
	 	return describeDdosDefenseInfoResponse;
	}
}