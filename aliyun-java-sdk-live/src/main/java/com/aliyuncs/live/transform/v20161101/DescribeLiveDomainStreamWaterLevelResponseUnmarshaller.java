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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainStreamWaterLevelResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainStreamWaterLevelResponse.LiveDomainWaterLevel;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainStreamWaterLevelResponse.LiveUidWaterLevel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainStreamWaterLevelResponseUnmarshaller {

	public static DescribeLiveDomainStreamWaterLevelResponse unmarshall(DescribeLiveDomainStreamWaterLevelResponse describeLiveDomainStreamWaterLevelResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainStreamWaterLevelResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainStreamWaterLevelResponse.RequestId"));

		LiveUidWaterLevel liveUidWaterLevel = new LiveUidWaterLevel();
		liveUidWaterLevel.setUidTranscodeLimit(_ctx.integerValue("DescribeLiveDomainStreamWaterLevelResponse.LiveUidWaterLevel.UidTranscodeLimit"));
		liveUidWaterLevel.setAliUid(_ctx.stringValue("DescribeLiveDomainStreamWaterLevelResponse.LiveUidWaterLevel.AliUid"));
		liveUidWaterLevel.setUidTranscodeCount(_ctx.integerValue("DescribeLiveDomainStreamWaterLevelResponse.LiveUidWaterLevel.UidTranscodeCount"));
		liveUidWaterLevel.setUidRawLimit(_ctx.integerValue("DescribeLiveDomainStreamWaterLevelResponse.LiveUidWaterLevel.UidRawLimit"));
		liveUidWaterLevel.setUidRawCount(_ctx.integerValue("DescribeLiveDomainStreamWaterLevelResponse.LiveUidWaterLevel.UidRawCount"));
		describeLiveDomainStreamWaterLevelResponse.setLiveUidWaterLevel(liveUidWaterLevel);

		List<LiveDomainWaterLevel> liveDomainWaterLevelList = new ArrayList<LiveDomainWaterLevel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainStreamWaterLevelResponse.LiveDomainWaterLevelList.Length"); i++) {
			LiveDomainWaterLevel liveDomainWaterLevel = new LiveDomainWaterLevel();
			liveDomainWaterLevel.setDomainRawLimit(_ctx.integerValue("DescribeLiveDomainStreamWaterLevelResponse.LiveDomainWaterLevelList["+ i +"].DomainRawLimit"));
			liveDomainWaterLevel.setDomainRawCount(_ctx.integerValue("DescribeLiveDomainStreamWaterLevelResponse.LiveDomainWaterLevelList["+ i +"].DomainRawCount"));
			liveDomainWaterLevel.setDomainTranscodeCount(_ctx.integerValue("DescribeLiveDomainStreamWaterLevelResponse.LiveDomainWaterLevelList["+ i +"].DomainTranscodeCount"));
			liveDomainWaterLevel.setDomainName(_ctx.stringValue("DescribeLiveDomainStreamWaterLevelResponse.LiveDomainWaterLevelList["+ i +"].DomainName"));
			liveDomainWaterLevel.setDomainTranscodeLimit(_ctx.integerValue("DescribeLiveDomainStreamWaterLevelResponse.LiveDomainWaterLevelList["+ i +"].DomainTranscodeLimit"));

			liveDomainWaterLevelList.add(liveDomainWaterLevel);
		}
		describeLiveDomainStreamWaterLevelResponse.setLiveDomainWaterLevelList(liveDomainWaterLevelList);
	 
	 	return describeLiveDomainStreamWaterLevelResponse;
	}
}